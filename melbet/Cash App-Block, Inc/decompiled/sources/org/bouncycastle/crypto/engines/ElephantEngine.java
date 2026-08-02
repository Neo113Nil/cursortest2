package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes9.dex */
public class ElephantEngine implements AEADCipher {
    private final int BLOCK_SIZE;
    private final byte CRYPTO_ABYTES;
    private byte[] ad;
    private int adOff;
    private int adlen;
    private final String algorithmName;
    private final byte[] buffer;
    private byte[] current_mask;
    private byte[] expanded_key;
    private boolean forEncryption;
    private boolean initialised;
    private byte[] inputMessage;
    private int inputOff;
    private byte lfsrIV;
    private int messageLen;
    private int nBits;
    private final int nRounds;
    private int nSBox;
    private int nb_its;
    private byte[] next_mask;
    private byte[] npub;
    private final ElephantParameters parameters;
    private byte[] previous_mask;
    private final byte[] previous_outputMessage;
    private byte[] tag;
    private final byte[] tag_buffer;
    private final byte CRYPTO_KEYBYTES = 16;
    private final byte CRYPTO_NPUBBYTES = 12;
    private State m_state = State.Uninitialized;
    private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
    private final byte[] sBoxLayer = {-18, -19, -21, -32, -30, -31, -28, -17, -25, -22, -24, -27, -23, -20, -29, -26, -34, -35, -37, -48, -46, -47, -44, -33, -41, -38, -40, -43, -39, -36, -45, -42, -66, -67, -69, -80, -78, -79, -76, -65, -73, -70, -72, -75, -71, PSSSigner.TRAILER_IMPLICIT, -77, -74, 14, 13, 11, 0, 2, 1, 4, 15, 7, 10, 8, 5, 9, 12, 3, 6, 46, 45, 43, PnmConstants.PNM_SEPARATOR, 34, 33, 36, 47, 39, 42, 40, 37, 41, 44, 35, 38, 30, 29, 27, 16, 18, 17, 20, 31, 23, 26, 24, 21, 25, 28, 19, 22, 78, 77, 75, 64, 66, 65, 68, 79, 71, 74, 72, 69, 73, 76, 67, 70, -2, -3, -5, -16, -14, -15, -12, -1, -9, -6, -8, -11, -7, -4, -13, -10, 126, 125, 123, 112, 114, 113, 116, Byte.MAX_VALUE, 119, 122, 120, 117, 121, 124, 115, 118, -82, -83, -85, -96, -94, -95, -92, -81, -89, -86, -88, -91, -87, -84, -93, -90, -114, -115, -117, Byte.MIN_VALUE, -126, -127, -124, -113, -121, -118, -120, -123, -119, -116, -125, -122, 94, 93, 91, PnmConstants.PNM_PREFIX_BYTE, 82, 81, 84, 95, 87, 90, 88, 85, 89, 92, 83, 86, -98, -99, -101, -112, -110, -111, -108, -97, -105, -102, -104, -107, -103, -100, -109, -106, -50, -51, -53, -64, -62, -63, -60, -49, -57, -54, -56, -59, -55, -52, -61, -58, 62, 61, 59, 48, PnmConstants.PGM_TEXT_CODE, PnmConstants.PBM_TEXT_CODE, PnmConstants.PBM_RAW_CODE, 63, PnmConstants.PAM_RAW_CODE, 58, 56, PnmConstants.PGM_RAW_CODE, 57, 60, PnmConstants.PPM_TEXT_CODE, PnmConstants.PPM_RAW_CODE, 110, 109, 107, 96, 98, 97, 100, 111, 103, 106, 104, 101, 105, 108, 99, 102};
    private final byte[] KeccakRoundConstants = {1, -126, -118, 0, -117, 1, -127, 9, -118, -120, 9, 10, -117, -117, -119, 3, 2, Byte.MIN_VALUE};
    private final int[] KeccakRhoOffsets = {0, 1, 6, 4, 3, 4, 4, 6, 7, 4, 3, 2, 3, 1, 7, 1, 5, 7, 5, 0, 2, 2, 5, 0, 6};

    /* renamed from: org.bouncycastle.crypto.engines.ElephantEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State = iArr;
            try {
                iArr[State.Uninitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.DecFinal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.EncFinal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.EncAad.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.EncData.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.EncInit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.DecInit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.DecData.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.DecAad.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[ElephantParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters = iArr2;
            try {
                iArr2[ElephantParameters.elephant160.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[ElephantParameters.elephant176.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[ElephantParameters.elephant200.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum ElephantParameters {
        elephant160,
        elephant176,
        elephant200
    }

    public enum State {
        Uninitialized,
        EncInit,
        EncAad,
        EncData,
        EncFinal,
        DecInit,
        DecAad,
        DecData,
        DecFinal
    }

    public ElephantEngine(ElephantParameters elephantParameters) {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[elephantParameters.ordinal()];
        if (i == 1) {
            this.BLOCK_SIZE = 20;
            this.nBits = EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            this.nSBox = 20;
            this.nRounds = 80;
            this.lfsrIV = (byte) 117;
            this.CRYPTO_ABYTES = (byte) 8;
            this.algorithmName = "Elephant 160 AEAD";
        } else if (i == 2) {
            this.BLOCK_SIZE = 22;
            this.nBits = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE;
            this.nSBox = 22;
            this.nRounds = 90;
            this.lfsrIV = (byte) 69;
            this.algorithmName = "Elephant 176 AEAD";
            this.CRYPTO_ABYTES = (byte) 8;
        } else {
            if (i != 3) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid parameter settings for Elephant");
                throw null;
            }
            this.BLOCK_SIZE = 25;
            this.nRounds = 18;
            this.algorithmName = "Elephant 200 AEAD";
            this.CRYPTO_ABYTES = (byte) 16;
        }
        this.parameters = elephantParameters;
        int i2 = this.BLOCK_SIZE;
        this.tag_buffer = new byte[i2];
        this.previous_mask = new byte[i2];
        this.current_mask = new byte[i2];
        this.next_mask = new byte[i2];
        this.buffer = new byte[i2];
        this.previous_outputMessage = new byte[i2];
        this.initialised = false;
        reset(false);
    }

    private void KeccakP200Round(byte[] bArr, int i) {
        byte[] bArr2 = new byte[25];
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 = 0; i3 < 5; i3++) {
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[index(i2, i3)]);
            }
        }
        int i4 = 0;
        while (i4 < 5) {
            int i5 = i4 + 1;
            bArr2[i4 + 5] = (byte) (bArr2[(i4 + 4) % 5] ^ ROL8(bArr2[i5 % 5], 1));
            i4 = i5;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            for (int i7 = 0; i7 < 5; i7++) {
                int index = index(i6, i7);
                bArr[index] = (byte) (bArr[index] ^ bArr2[i6 + 5]);
            }
        }
        for (int i8 = 0; i8 < 5; i8++) {
            for (int i9 = 0; i9 < 5; i9++) {
                bArr2[index(i8, i9)] = ROL8(bArr[index(i8, i9)], this.KeccakRhoOffsets[index(i8, i9)]);
            }
        }
        for (int i10 = 0; i10 < 5; i10++) {
            for (int i11 = 0; i11 < 5; i11++) {
                bArr[index(i11, ((i11 * 3) + (i10 * 2)) % 5)] = bArr2[index(i10, i11)];
            }
        }
        for (int i12 = 0; i12 < 5; i12++) {
            int i13 = 0;
            while (i13 < 5) {
                int i14 = i13 + 1;
                bArr2[i13] = (byte) (bArr[index(i13, i12)] ^ ((~bArr[index(i14 % 5, i12)]) & bArr[index((i13 + 2) % 5, i12)]));
                i13 = i14;
            }
            for (int i15 = 0; i15 < 5; i15++) {
                bArr[index(i15, i12)] = bArr2[i15];
            }
        }
        bArr[0] = (byte) (this.KeccakRoundConstants[i] ^ bArr[0]);
    }

    private byte ROL8(byte b, int i) {
        int i2 = b;
        if (i != 0) {
            int i3 = b & 255;
            i2 = (i3 << i) ^ (i3 >>> (8 - i));
        }
        return (byte) i2;
    }

    private void checkAad() {
        StringBuilder sb;
        String str;
        String str2;
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()];
        if (i == 3) {
            sb = new StringBuilder();
            str = this.algorithmName;
            str2 = " cannot be reused for encryption";
        } else if (i == 5) {
            sb = new StringBuilder();
            str = this.algorithmName;
            str2 = " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size";
        } else {
            if (i != 8) {
                return;
            }
            sb = new StringBuilder();
            str = this.algorithmName;
            str2 = " cannot process AAD when the length of the plaintext to be processed exceeds the a block size";
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str, str2));
    }

    private int index(int i, int i2) {
        return (i2 * 5) + i;
    }

    private void lfsr_step(byte[] bArr, byte[] bArr2) {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[this.parameters.ordinal()];
        if (i == 1) {
            int i2 = this.BLOCK_SIZE - 1;
            byte b = bArr2[0];
            int i3 = (bArr2[3] & 255) << 7;
            int i4 = (bArr2[13] & 255) >>> 7;
            bArr[i2] = (byte) (i4 ^ (i3 ^ (((b & 255) >>> 5) | ((b & 255) << 3))));
        } else if (i == 2) {
            bArr[this.BLOCK_SIZE - 1] = (byte) ((rotl(bArr2[0]) ^ ((bArr2[3] & 255) << 7)) ^ ((bArr2[19] & 255) >>> 7));
        } else if (i == 3) {
            bArr[this.BLOCK_SIZE - 1] = (byte) ((bArr2[13] << 1) ^ (rotl(bArr2[0]) ^ rotl(bArr2[2])));
        }
        System.arraycopy(bArr2, 1, bArr, 0, this.BLOCK_SIZE - 1);
    }

    private void permutation(byte[] bArr) {
        int i;
        int i2 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[this.parameters.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            for (int i3 = 0; i3 < this.nRounds; i3++) {
                KeccakP200Round(bArr, i3);
            }
            return;
        }
        byte b = this.lfsrIV;
        byte[] bArr2 = new byte[this.nSBox];
        for (int i4 = 0; i4 < this.nRounds; i4++) {
            bArr[0] = (byte) (bArr[0] ^ b);
            int i5 = this.nSBox - 1;
            byte b2 = bArr[i5];
            int i6 = b & PnmConstants.PNM_SEPARATOR;
            int i7 = b & 64;
            bArr[i5] = (byte) (b2 ^ ((byte) (((((((((b & 1) << 7) | ((b & 2) << 5)) | ((b & 4) << 3)) | ((b & 8) << 1)) | ((b & 16) >>> 1)) | (i6 >>> 3)) | (i7 >>> 5)) | ((b & 128) >>> 7))));
            b = (byte) (((b << 1) | ((i7 >>> 6) ^ (i6 >>> 5))) & 127);
            for (int i8 = 0; i8 < this.nSBox; i8++) {
                bArr[i8] = this.sBoxLayer[bArr[i8] & 255];
            }
            Arrays.fill(bArr2, (byte) 0);
            int i9 = 0;
            while (true) {
                i = this.nSBox;
                if (i9 < i) {
                    for (int i10 = 0; i10 < 8; i10++) {
                        int i11 = (i9 << 3) + i10;
                        int i12 = this.nBits;
                        if (i11 != i12 - 1) {
                            i11 = ((i11 * i12) >> 2) % (i12 - 1);
                        }
                        int i13 = i11 >>> 3;
                        bArr2[i13] = (byte) (((((bArr[i9] & 255) >>> i10) & 1) << (i11 & 7)) ^ bArr2[i13]);
                    }
                    i9++;
                }
            }
            System.arraycopy(bArr2, 0, bArr, 0, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void processAADBytes(byte[] bArr) {
        State state;
        int i;
        int i2;
        checkAad();
        if (this.adOff == -1) {
            this.adlen = this.aadData.size();
            this.ad = this.aadData.toByteArray();
            this.adOff = 0;
        }
        int[] iArr = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State;
        int i3 = 12;
        switch (iArr[this.m_state.ordinal()]) {
            case 3:
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " cannot be reused for encryption"));
                break;
            case 4:
            case 9:
                if (this.adOff == this.adlen) {
                    Arrays.fill(bArr, 0, this.BLOCK_SIZE, (byte) 0);
                    bArr[0] = 1;
                    break;
                }
                i3 = 0;
                i = this.BLOCK_SIZE - i3;
                int i4 = this.adlen;
                int i5 = this.adOff;
                i2 = i4 - i5;
                if (i <= i2) {
                    if (i2 > 0) {
                        System.arraycopy(this.ad, i5, bArr, i3, i2);
                        this.adOff += i2;
                    }
                    int i6 = i2 + i3;
                    Arrays.fill(bArr, i6, i3 + i, (byte) 0);
                    bArr[i6] = 1;
                    int i7 = iArr[this.m_state.ordinal()];
                    if (i7 == 4) {
                        this.m_state = State.EncData;
                        break;
                    } else if (i7 == 9) {
                        this.m_state = State.DecData;
                        break;
                    }
                } else {
                    System.arraycopy(this.ad, i5, bArr, i3, i);
                    this.adOff += i;
                    break;
                }
                break;
            case 5:
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size"));
                break;
            case 6:
                System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BLOCK_SIZE);
                System.arraycopy(this.npub, 0, bArr, 0, 12);
                state = State.EncAad;
                this.m_state = state;
                i = this.BLOCK_SIZE - i3;
                int i42 = this.adlen;
                int i52 = this.adOff;
                i2 = i42 - i52;
                if (i <= i2) {
                }
                break;
            case 7:
                System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BLOCK_SIZE);
                System.arraycopy(this.npub, 0, bArr, 0, 12);
                state = State.DecAad;
                this.m_state = state;
                i = this.BLOCK_SIZE - i3;
                int i422 = this.adlen;
                int i522 = this.adOff;
                i2 = i422 - i522;
                if (i <= i2) {
                }
                break;
            case 8:
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the plaintext to be processed exceeds the a block size"));
                break;
            default:
                i3 = 0;
                i = this.BLOCK_SIZE - i3;
                int i4222 = this.adlen;
                int i5222 = this.adOff;
                i2 = i4222 - i5222;
                if (i <= i2) {
                }
                break;
        }
    }

    private int processBytes(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        byte[] bArr3 = new byte[this.BLOCK_SIZE];
        int i7 = this.nb_its;
        int i8 = 0;
        int i9 = i;
        while (i7 < i2) {
            int i10 = i3 - 1;
            int i11 = this.BLOCK_SIZE;
            if (i7 == i10) {
                i11 = i5 - (i11 * i7);
            }
            if (!z) {
                int i12 = this.BLOCK_SIZE;
                if (i11 % i12 == 0) {
                    if (i5 <= i12 * i7) {
                        break;
                    }
                } else {
                    break;
                }
            }
            lfsr_step(this.next_mask, this.current_mask);
            if (i7 < i3) {
                System.arraycopy(this.npub, 0, this.buffer, 0, 12);
                Arrays.fill(this.buffer, 12, this.BLOCK_SIZE, (byte) 0);
                xor_block(this.buffer, this.current_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                permutation(this.buffer);
                xor_block(this.buffer, this.current_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, bArr, i8, i11);
                System.arraycopy(this.buffer, 0, bArr2, i9, i11);
                if (this.forEncryption) {
                    System.arraycopy(this.buffer, 0, bArr3, 0, i11);
                } else {
                    System.arraycopy(bArr, i8, bArr3, 0, i11);
                }
                i9 += i11;
                i8 += i11;
            }
            if (i7 > 0 && i7 <= i4) {
                int i13 = this.BLOCK_SIZE;
                int i14 = (i7 - 1) * i13;
                if (i14 == i5) {
                    Arrays.fill(this.buffer, 0, i13, (byte) 0);
                    this.buffer[0] = 1;
                } else {
                    int i15 = i5 - i14;
                    if (i13 <= i15) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i13);
                    } else if (i15 > 0) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i15);
                        Arrays.fill(this.buffer, i15, this.BLOCK_SIZE, (byte) 0);
                        this.buffer[i15] = 1;
                    }
                }
                xor_block(this.buffer, this.previous_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                permutation(this.buffer);
                xor_block(this.buffer, this.previous_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                xor_block(this.tag_buffer, this.buffer, 0, this.BLOCK_SIZE);
            }
            i7++;
            if (i7 < i6) {
                processAADBytes(this.buffer);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                permutation(this.buffer);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                xor_block(this.tag_buffer, this.buffer, 0, this.BLOCK_SIZE);
            }
            byte[] bArr4 = this.previous_mask;
            this.previous_mask = this.current_mask;
            this.current_mask = this.next_mask;
            this.next_mask = bArr4;
            System.arraycopy(bArr3, 0, this.previous_outputMessage, 0, this.BLOCK_SIZE);
        }
        this.nb_its = i7;
        return i8;
    }

    private void reset(boolean z) {
        if (z) {
            this.tag = null;
        }
        this.aadData.reset();
        Arrays.fill(this.tag_buffer, (byte) 0);
        Arrays.fill(this.previous_outputMessage, (byte) 0);
        this.inputOff = 0;
        this.nb_its = 0;
        this.adOff = -1;
        this.messageLen = 0;
    }

    private byte rotl(byte b) {
        int i = b & 255;
        return (byte) ((i >>> 7) | (i << 1));
    }

    private void xor_block(byte[] bArr, byte[] bArr2, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3 + i]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) {
        if (!this.initialised) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " needs call init function before doFinal"));
            return 0;
        }
        int i2 = this.inputOff;
        boolean z = this.forEncryption;
        if ((z && i2 + i + this.CRYPTO_ABYTES > bArr.length) || (!z && (i2 + i) - this.CRYPTO_ABYTES > bArr.length)) {
            f$$ExternalSyntheticLambda0.m$3("output buffer is too short");
            return 0;
        }
        int i3 = (i2 + this.messageLen) - (z ? (byte) 0 : this.CRYPTO_ABYTES);
        int processAADBytes = processAADBytes();
        int i4 = this.BLOCK_SIZE;
        int i5 = i3 / i4;
        int i6 = i5 + 1;
        int i7 = (processAADBytes + 12) / i4;
        int processBytes = i + processBytes(this.inputMessage, bArr, i, Math.max(i5 + 2, i7), i3 % i4 != 0 ? i6 : i5, i6, i3, i7 + 1, true);
        this.tag = new byte[this.CRYPTO_ABYTES];
        xor_block(this.tag_buffer, this.expanded_key, 0, this.BLOCK_SIZE);
        permutation(this.tag_buffer);
        xor_block(this.tag_buffer, this.expanded_key, 0, this.BLOCK_SIZE);
        if (this.forEncryption) {
            System.arraycopy(this.tag_buffer, 0, this.tag, 0, this.CRYPTO_ABYTES);
            byte[] bArr2 = this.tag;
            System.arraycopy(bArr2, 0, bArr, processBytes, bArr2.length);
            i3 += this.CRYPTO_ABYTES;
        } else {
            this.inputOff -= this.CRYPTO_ABYTES;
            for (int i8 = 0; i8 < this.CRYPTO_ABYTES; i8++) {
                if (this.tag_buffer[i8] != this.inputMessage[this.inputOff + i8]) {
                    a$$ExternalSyntheticBUOutline0.m$3("Mac does not match");
                    return 0;
                }
            }
        }
        reset(false);
        return i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public int getBlockSize() {
        return this.CRYPTO_ABYTES;
    }

    public int getIVBytesSize() {
        return 12;
    }

    public int getKeyBytesSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()]) {
            case 1:
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
                return 0;
            case 2:
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return i + this.CRYPTO_ABYTES;
            default:
                return Math.max(0, i - this.CRYPTO_ABYTES);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()]) {
            case 1:
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
                return 0;
            case 2:
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return this.inputOff + i + this.CRYPTO_ABYTES;
            default:
                return Math.max(0, (i + this.inputOff) - this.CRYPTO_ABYTES);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " init parameters must include an IV"));
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.npub = iv;
        if (iv == null || iv.length != 12) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " requires exactly 12 bytes of IV"));
            return;
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " init parameters must include a key"));
            return;
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " key must be 128 bits long"));
            return;
        }
        byte[] bArr = new byte[this.BLOCK_SIZE];
        this.expanded_key = bArr;
        System.arraycopy(key, 0, bArr, 0, 16);
        permutation(this.expanded_key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        this.initialised = true;
        this.m_state = z ? State.EncInit : State.DecInit;
        this.inputMessage = new byte[this.BLOCK_SIZE + (z ? (byte) 0 : this.CRYPTO_ABYTES)];
        reset(false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        this.aadData.write(b);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) {
        return processBytes(new byte[]{b}, 0, 1, bArr, i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private int processAADBytes() {
        byte[] byteArray = this.aadData.toByteArray();
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()];
        if (i == 6 || i == 7) {
            processAADBytes(this.tag_buffer);
        }
        return byteArray.length;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (i + i2 <= bArr.length) {
            this.aadData.write(bArr, i, i2);
        } else {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
            return 0;
        }
        int i4 = this.inputOff;
        int i5 = i4 + i2;
        boolean z = this.forEncryption;
        if (i5 - (z ? (byte) 0 : this.CRYPTO_ABYTES) < this.BLOCK_SIZE) {
            System.arraycopy(bArr, i, this.inputMessage, i4, i2);
            this.inputOff += i2;
            return 0;
        }
        int i6 = (i4 + i2) - (z ? (byte) 0 : this.CRYPTO_ABYTES);
        int processAADBytes = processAADBytes();
        int i7 = this.BLOCK_SIZE;
        int i8 = i6 / i7;
        int i9 = i8 + 1;
        int i10 = i6 % i7 != 0 ? i9 : i8;
        int i11 = (processAADBytes + 12) / i7;
        int i12 = i11 + 1;
        int max = Math.max(i8 + 2, i11);
        int max2 = Math.max(i9, 1) * this.BLOCK_SIZE;
        byte[] bArr3 = new byte[max2];
        System.arraycopy(this.inputMessage, 0, bArr3, 0, this.inputOff);
        System.arraycopy(bArr, i, bArr3, this.inputOff, Math.min(i2, max2));
        int processBytes = processBytes(bArr3, bArr2, i3, max, i10, i9, i6, i12, false);
        int i13 = this.inputOff;
        int i14 = processBytes - i13;
        int i15 = (i13 + i2) - processBytes;
        this.inputOff = i15;
        System.arraycopy(bArr, i14 + i, this.inputMessage, 0, i15);
        this.messageLen += processBytes;
        return processBytes;
    }
}
