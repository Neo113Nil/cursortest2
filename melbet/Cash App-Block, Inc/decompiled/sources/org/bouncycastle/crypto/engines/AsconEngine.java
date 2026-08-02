package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class AsconEngine implements AEADCipher {
    private final int ASCON_AEAD_RATE;
    private final long ASCON_IV;
    private final int CRYPTO_ABYTES;
    private final int CRYPTO_KEYBYTES;
    private long K0;
    private long K1;
    private long K2;
    private long N0;
    private long N1;
    private final String algorithmName;
    private final AsconParameters asconParameters;
    private byte[] initialAssociatedText;
    private final byte[] m_buf;
    private final int m_bufferSizeDecrypt;
    private byte[] mac;
    private final int nr;
    private long x0;
    private long x1;
    private long x2;
    private long x3;
    private long x4;
    private State m_state = State.Uninitialized;
    private int m_bufPos = 0;

    /* renamed from: org.bouncycastle.crypto.engines.AsconEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State = iArr;
            try {
                iArr[State.DecInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncInit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecAad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncAad.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncFinal.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecData.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncData.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecFinal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters = iArr2;
            try {
                iArr2[AsconParameters.ascon80pq.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128a.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public enum AsconParameters {
        ascon80pq,
        ascon128a,
        ascon128
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

    public AsconEngine(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[asconParameters.ordinal()];
        if (i == 1) {
            this.CRYPTO_KEYBYTES = 20;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 8;
            this.ASCON_IV = -6899501409222262784L;
            str = "Ascon-80pq AEAD";
        } else if (i == 2) {
            this.CRYPTO_KEYBYTES = 16;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 16;
            this.ASCON_IV = -9187330011336540160L;
            str = "Ascon-128a AEAD";
        } else {
            if (i != 3) {
                a$$ExternalSyntheticBUOutline0.m$3("invalid parameter setting for ASCON AEAD");
                throw null;
            }
            this.CRYPTO_KEYBYTES = 16;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 8;
            this.ASCON_IV = -9205344418435956736L;
            str = "Ascon-128 AEAD";
        }
        this.algorithmName = str;
        int i2 = this.ASCON_AEAD_RATE;
        this.nr = i2 == 8 ? 6 : 8;
        int i3 = i2 + this.CRYPTO_ABYTES;
        this.m_bufferSizeDecrypt = i3;
        this.m_buf = new byte[i3];
    }

    private void P(int i) {
        if (i >= 8) {
            if (i == 12) {
                ROUND(240L);
                ROUND(225L);
                ROUND(210L);
                ROUND(195L);
            }
            ROUND(180L);
            ROUND(165L);
        }
        ROUND(150L);
        ROUND(135L);
        ROUND(120L);
        ROUND(105L);
        ROUND(90L);
        ROUND(75L);
    }

    private long PAD(int i) {
        return 128 << (56 - (i << 3));
    }

    private void ROUND(long j) {
        long j2 = this.x0;
        long j3 = this.x1;
        long j4 = this.x2;
        long j5 = this.x3;
        long j6 = this.x4;
        long j7 = ((((j2 ^ j3) ^ j4) ^ j5) ^ j) ^ ((((j2 ^ j4) ^ j6) ^ j) & j3);
        long j8 = ((((j2 ^ j4) ^ j5) ^ j6) ^ j) ^ (((j3 ^ j4) ^ j) & (j3 ^ j5));
        long j9 = (((j3 ^ j4) ^ j6) ^ j) ^ (j5 & j6);
        long j10 = ((j4 ^ (j2 ^ j3)) ^ j) ^ ((~j2) & (j5 ^ j6));
        long j11 = ((j2 ^ j6) & j3) ^ ((j3 ^ j5) ^ j6);
        this.x0 = Longs.rotateRight(j7, 28) ^ (Longs.rotateRight(j7, 19) ^ j7);
        this.x1 = (Longs.rotateRight(j8, 39) ^ j8) ^ Longs.rotateRight(j8, 61);
        this.x2 = ~(Longs.rotateRight(j9, 6) ^ (Longs.rotateRight(j9, 1) ^ j9));
        this.x3 = (Longs.rotateRight(j10, 10) ^ j10) ^ Longs.rotateRight(j10, 17);
        this.x4 = Longs.rotateRight(j11, 41) ^ (Longs.rotateRight(j11, 7) ^ j11);
    }

    private void ascon_aeadinit() {
        long j = this.ASCON_IV;
        this.x0 = j;
        if (this.CRYPTO_KEYBYTES == 20) {
            this.x0 = j ^ this.K0;
        }
        this.x1 = this.K1;
        this.x2 = this.K2;
        this.x3 = this.N0;
        this.x4 = this.N1;
        P(12);
        if (this.CRYPTO_KEYBYTES == 20) {
            this.x2 ^= this.K0;
        }
        this.x3 ^= this.K1;
        this.x4 ^= this.K2;
    }

    private void checkAAD() {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i == 1) {
            this.m_state = State.DecAad;
            return;
        }
        if (i == 2) {
            this.m_state = State.EncAad;
            return;
        }
        if (i == 3 || i == 4) {
            return;
        }
        String algorithmName = getAlgorithmName();
        if (i != 5) {
            f$$ExternalSyntheticLambda0.m((Object) algorithmName, (Object) " needs to be initialized");
        } else {
            f$$ExternalSyntheticLambda0.m((Object) algorithmName, (Object) " cannot be reused for encryption");
        }
    }

    private boolean checkData() {
        String algorithmName;
        String str;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 3:
                finishAAD(State.DecData);
                return false;
            case 2:
            case 4:
                finishAAD(State.EncData);
                return true;
            case 5:
                algorithmName = getAlgorithmName();
                str = " cannot be reused for encryption";
                break;
            case 6:
                return false;
            case 7:
                return true;
            default:
                algorithmName = getAlgorithmName();
                str = " needs to be initialized";
                break;
        }
        f$$ExternalSyntheticLambda0.m((Object) algorithmName, (Object) str);
        return false;
    }

    private void finishAAD(State state) {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i == 3 || i == 4) {
            byte[] bArr = this.m_buf;
            int i2 = this.m_bufPos;
            bArr[i2] = Byte.MIN_VALUE;
            long j = this.x0;
            if (i2 >= 8) {
                this.x0 = j ^ Pack.bigEndianToLong(bArr, 0);
                this.x1 ^= ((-1) << (56 - ((this.m_bufPos - 8) << 3))) & Pack.bigEndianToLong(this.m_buf, 8);
            } else {
                this.x0 = (((-1) << (56 - (this.m_bufPos << 3))) & Pack.bigEndianToLong(bArr, 0)) ^ j;
            }
            P(this.nr);
        }
        this.x4 ^= 1;
        this.m_bufPos = 0;
        this.m_state = state;
    }

    private void finishData(State state) {
        long j;
        long j2;
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[this.asconParameters.ordinal()];
        if (i == 1) {
            long j3 = this.x1;
            long j4 = this.K0 << 32;
            long j5 = this.K1;
            this.x1 = j3 ^ (j4 | (j5 >> 32));
            long j6 = this.x2;
            long j7 = j5 << 32;
            long j8 = this.K2;
            this.x2 = j6 ^ (j7 | (j8 >> 32));
            j = this.x3;
            j2 = j8 << 32;
        } else {
            if (i != 2) {
                if (i != 3) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return;
                }
                this.x1 ^= this.K1;
                this.x2 ^= this.K2;
                P(12);
                this.x3 ^= this.K1;
                this.x4 ^= this.K2;
                this.m_state = state;
            }
            this.x2 ^= this.K1;
            j = this.x3;
            j2 = this.K2;
        }
        this.x3 = j ^ j2;
        P(12);
        this.x3 ^= this.K1;
        this.x4 ^= this.K2;
        this.m_state = state;
    }

    private void processBufferAAD(byte[] bArr, int i) {
        this.x0 ^= Pack.bigEndianToLong(bArr, i);
        if (this.ASCON_AEAD_RATE == 16) {
            this.x1 = Pack.bigEndianToLong(bArr, i + 8) ^ this.x1;
        }
        P(this.nr);
    }

    private void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.ASCON_AEAD_RATE + i2 > bArr2.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer too short");
            return;
        }
        long bigEndianToLong = Pack.bigEndianToLong(bArr, i);
        Pack.longToBigEndian(this.x0 ^ bigEndianToLong, bArr2, i2);
        this.x0 = bigEndianToLong;
        if (this.ASCON_AEAD_RATE == 16) {
            long bigEndianToLong2 = Pack.bigEndianToLong(bArr, i + 8);
            Pack.longToBigEndian(this.x1 ^ bigEndianToLong2, bArr2, i2 + 8);
            this.x1 = bigEndianToLong2;
        }
        P(this.nr);
    }

    private void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.ASCON_AEAD_RATE + i2 > bArr2.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer too short");
            return;
        }
        long bigEndianToLong = this.x0 ^ Pack.bigEndianToLong(bArr, i);
        this.x0 = bigEndianToLong;
        Pack.longToBigEndian(bigEndianToLong, bArr2, i2);
        if (this.ASCON_AEAD_RATE == 16) {
            long bigEndianToLong2 = Pack.bigEndianToLong(bArr, i + 8) ^ this.x1;
            this.x1 = bigEndianToLong2;
            Pack.longToBigEndian(bigEndianToLong2, bArr2, i2 + 8);
        }
        P(this.nr);
    }

    private void processFinalDecrypt(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 >= 8) {
            long bigEndianToLong = Pack.bigEndianToLong(bArr, i);
            long j = this.x0 ^ bigEndianToLong;
            this.x0 = j;
            Pack.longToBigEndian(j, bArr2, i3);
            this.x0 = bigEndianToLong;
            int i4 = i + 8;
            int i5 = i3 + 8;
            int i6 = i2 - 8;
            this.x1 ^= PAD(i6);
            if (i6 != 0) {
                long littleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i4, i6);
                long j2 = this.x1 ^ littleEndianToLong_High;
                this.x1 = j2;
                Pack.longToLittleEndian_High(j2, bArr2, i5, i6);
                this.x1 = littleEndianToLong_High ^ (this.x1 & ((-1) >>> (i6 << 3)));
            }
        } else {
            this.x0 ^= PAD(i2);
            if (i2 != 0) {
                long littleEndianToLong_High2 = Pack.littleEndianToLong_High(bArr, i, i2);
                long j3 = this.x0 ^ littleEndianToLong_High2;
                this.x0 = j3;
                Pack.longToLittleEndian_High(j3, bArr2, i3, i2);
                this.x0 = littleEndianToLong_High2 ^ (this.x0 & ((-1) >>> (i2 << 3)));
            }
        }
        finishData(State.DecFinal);
    }

    private void processFinalEncrypt(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        long littleEndianToLong_High;
        long j = this.x0;
        if (i2 >= 8) {
            long bigEndianToLong = j ^ Pack.bigEndianToLong(bArr, i);
            this.x0 = bigEndianToLong;
            Pack.longToBigEndian(bigEndianToLong, bArr2, i3);
            int i4 = i + 8;
            i3 += 8;
            i2 -= 8;
            long PAD = this.x1 ^ PAD(i2);
            this.x1 = PAD;
            if (i2 != 0) {
                littleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i4, i2) ^ PAD;
                this.x1 = littleEndianToLong_High;
                Pack.longToLittleEndian_High(littleEndianToLong_High, bArr2, i3, i2);
            }
        } else {
            long PAD2 = j ^ PAD(i2);
            this.x0 = PAD2;
            if (i2 != 0) {
                littleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i, i2) ^ PAD2;
                this.x0 = littleEndianToLong_High;
                Pack.longToLittleEndian_High(littleEndianToLong_High, bArr2, i3, i2);
            }
        }
        finishData(State.EncFinal);
    }

    private void reset(boolean z) {
        if (z) {
            this.mac = null;
        }
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
            case 6:
            case 8:
                this.m_state = State.DecInit;
                break;
            case 4:
            case 5:
            case 7:
                this.m_state = State.EncFinal;
                return;
            default:
                f$$ExternalSyntheticLambda0.m((Object) getAlgorithmName(), (Object) " needs to be initialized");
                return;
        }
        ascon_aeadinit();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) {
        boolean checkData = checkData();
        int i2 = this.m_bufPos;
        if (checkData) {
            int i3 = i2 + this.CRYPTO_ABYTES;
            if (i + i3 > bArr.length) {
                f$$ExternalSyntheticLambda0.m$3("output buffer too short");
                return 0;
            }
            processFinalEncrypt(this.m_buf, 0, i2, bArr, i);
            byte[] bArr2 = new byte[this.CRYPTO_ABYTES];
            this.mac = bArr2;
            Pack.longToBigEndian(this.x3, bArr2, 0);
            Pack.longToBigEndian(this.x4, this.mac, 8);
            System.arraycopy(this.mac, 0, bArr, this.m_bufPos + i, this.CRYPTO_ABYTES);
            reset(false);
            return i3;
        }
        int i4 = this.CRYPTO_ABYTES;
        if (i2 < i4) {
            f$$ExternalSyntheticLambda0.m$2("data too short");
            return 0;
        }
        int i5 = i2 - i4;
        this.m_bufPos = i5;
        if (i + i5 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer too short");
            return 0;
        }
        processFinalDecrypt(this.m_buf, 0, i5, bArr, i);
        this.x3 ^= Pack.bigEndianToLong(this.m_buf, this.m_bufPos);
        long bigEndianToLong = this.x4 ^ Pack.bigEndianToLong(this.m_buf, this.m_bufPos + 8);
        this.x4 = bigEndianToLong;
        if ((bigEndianToLong | this.x3) == 0) {
            reset(true);
            return i5;
        }
        throw new InvalidCipherTextException("mac check in " + getAlgorithmName() + " failed");
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public String getAlgorithmVersion() {
        return "v1.2";
    }

    public int getIVBytesSize() {
        return this.CRYPTO_ABYTES;
    }

    public int getKeyBytesSize() {
        return this.CRYPTO_KEYBYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r1 != 8) goto L14;
     */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getOutputSize(int i) {
        int max = Math.max(0, i);
        int i2 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i2 != 1 && i2 != 3) {
            if (i2 != 5) {
                if (i2 != 6) {
                    if (i2 != 7) {
                    }
                }
                max += this.m_bufPos;
            }
            max += this.m_bufPos;
            return max + this.CRYPTO_ABYTES;
        }
        return Math.max(0, max - this.CRYPTO_ABYTES);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r1 != 8) goto L18;
     */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getUpdateOutputSize(int i) {
        int max = Math.max(0, i);
        int i2 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i2 != 1 && i2 != 3) {
            if (i2 != 5) {
                if (i2 != 6) {
                    if (i2 != 7) {
                    }
                }
                max += this.m_bufPos;
            }
            max += this.m_bufPos;
            return max - (max % this.ASCON_AEAD_RATE);
        }
        max = Math.max(0, max - this.CRYPTO_ABYTES);
        return max - (max % this.ASCON_AEAD_RATE);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        KeyParameter keyParameter;
        byte[] iv;
        long bigEndianToLong;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            keyParameter = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize != this.CRYPTO_ABYTES * 8) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(macSize, "Invalid value for MAC size: "));
                return;
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                a$$ExternalSyntheticBUOutline0.m$3("invalid parameters passed to Ascon");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (keyParameter == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Ascon Init parameters must include a key");
            return;
        }
        if (iv == null || iv.length != this.CRYPTO_ABYTES) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.asconParameters);
            sb.append(" requires exactly ");
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.CRYPTO_ABYTES, " bytes of IV", sb));
            return;
        }
        byte[] key = keyParameter.getKey();
        if (key.length != this.CRYPTO_KEYBYTES) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.asconParameters);
            sb2.append(" key must be ");
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.CRYPTO_KEYBYTES, " bytes long", sb2));
            return;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        this.N0 = Pack.bigEndianToLong(iv, 0);
        this.N1 = Pack.bigEndianToLong(iv, 8);
        int i = this.CRYPTO_KEYBYTES;
        if (i == 16) {
            this.K1 = Pack.bigEndianToLong(key, 0);
            bigEndianToLong = Pack.bigEndianToLong(key, 8);
        } else if (i != 20) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        } else {
            this.K0 = Pack.bigEndianToInt(key, 0);
            this.K1 = Pack.bigEndianToLong(key, 4);
            bigEndianToLong = Pack.bigEndianToLong(key, 12);
        }
        this.K2 = bigEndianToLong;
        this.m_state = z ? State.EncInit : State.DecInit;
        reset(true);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        checkAAD();
        byte[] bArr = this.m_buf;
        int i = this.m_bufPos;
        bArr[i] = b;
        int i2 = i + 1;
        this.m_bufPos = i2;
        if (i2 == this.ASCON_AEAD_RATE) {
            processBufferAAD(bArr, 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
            return;
        }
        if (i2 <= 0) {
            return;
        }
        checkAAD();
        int i3 = this.m_bufPos;
        if (i3 > 0) {
            int i4 = this.ASCON_AEAD_RATE - i3;
            byte[] bArr2 = this.m_buf;
            if (i2 < i4) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.m_bufPos += i2;
                return;
            } else {
                System.arraycopy(bArr, i, bArr2, i3, i4);
                i += i4;
                i2 -= i4;
                processBufferAAD(this.m_buf, 0);
            }
        }
        while (i2 >= this.ASCON_AEAD_RATE) {
            processBufferAAD(bArr, i);
            int i5 = this.ASCON_AEAD_RATE;
            i += i5;
            i2 -= i5;
        }
        System.arraycopy(bArr, i, this.m_buf, 0, i2);
        this.m_bufPos = i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) {
        return processBytes(new byte[]{b}, 0, 1, bArr, i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        if (i + i2 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
            return 0;
        }
        if (!checkData()) {
            int i5 = this.m_bufferSizeDecrypt;
            int i6 = this.m_bufPos;
            int i7 = i5 - i6;
            if (i2 < i7) {
                System.arraycopy(bArr, i, this.m_buf, i6, i2);
                this.m_bufPos += i2;
                return 0;
            }
            int i8 = 0;
            do {
                int i9 = this.m_bufPos;
                int i10 = this.ASCON_AEAD_RATE;
                byte[] bArr3 = this.m_buf;
                if (i9 >= i10) {
                    processBufferDecrypt(bArr3, 0, bArr2, i3 + i8);
                    int i11 = this.m_bufPos;
                    int i12 = this.ASCON_AEAD_RATE;
                    int i13 = i11 - i12;
                    this.m_bufPos = i13;
                    byte[] bArr4 = this.m_buf;
                    System.arraycopy(bArr4, i12, bArr4, 0, i13);
                    int i14 = this.ASCON_AEAD_RATE;
                    i8 += i14;
                    i7 += i14;
                } else {
                    int i15 = i10 - i9;
                    System.arraycopy(bArr, i, bArr3, i9, i15);
                    i += i15;
                    i2 -= i15;
                    processBufferDecrypt(this.m_buf, 0, bArr2, i3 + i8);
                    i4 = i8 + this.ASCON_AEAD_RATE;
                    while (i2 >= this.m_bufferSizeDecrypt) {
                        processBufferDecrypt(bArr, i, bArr2, i3 + i4);
                        int i16 = this.ASCON_AEAD_RATE;
                        i += i16;
                        i2 -= i16;
                        i4 += i16;
                    }
                }
            } while (i2 >= i7);
            System.arraycopy(bArr, i, this.m_buf, this.m_bufPos, i2);
            this.m_bufPos += i2;
            return i8;
        }
        int i17 = this.m_bufPos;
        if (i17 > 0) {
            int i18 = this.ASCON_AEAD_RATE - i17;
            byte[] bArr5 = this.m_buf;
            if (i2 < i18) {
                System.arraycopy(bArr, i, bArr5, i17, i2);
                this.m_bufPos += i2;
                return 0;
            }
            System.arraycopy(bArr, i, bArr5, i17, i18);
            i += i18;
            i2 -= i18;
            processBufferEncrypt(this.m_buf, 0, bArr2, i3);
            i4 = this.ASCON_AEAD_RATE;
        } else {
            i4 = 0;
        }
        while (i2 >= this.ASCON_AEAD_RATE) {
            processBufferEncrypt(bArr, i, bArr2, i3 + i4);
            int i19 = this.ASCON_AEAD_RATE;
            i += i19;
            i2 -= i19;
            i4 += i19;
        }
        System.arraycopy(bArr, i, this.m_buf, 0, i2);
        this.m_bufPos = i2;
        return i4;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }
}
