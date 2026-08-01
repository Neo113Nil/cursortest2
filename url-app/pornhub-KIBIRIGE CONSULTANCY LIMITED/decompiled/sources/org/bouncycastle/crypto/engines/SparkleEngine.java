package org.bouncycastle.crypto.engines;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SparkleEngine implements AEADCipher {
    private static final int[] RCON = {-1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891};
    private final int CAP_MASK;
    private final int KEY_BYTES;
    private final int KEY_WORDS;
    private final int RATE_BYTES;
    private final int RATE_WORDS;
    private final int SCHWAEMM_KEY_LEN;
    private final int SCHWAEMM_NONCE_LEN;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private final int TAG_BYTES;
    private final int TAG_WORDS;
    private final int _A0;
    private final int _A1;
    private final int _M2;
    private final int _M3;
    private String algorithmName;
    private boolean encrypted;
    private byte[] initialAssociatedText;
    private final int[] k;
    private final byte[] m_buf;
    private final int m_bufferSizeDecrypt;
    private final int[] npub;
    private final int[] state;
    private byte[] tag;
    private State m_state = State.Uninitialized;
    private int m_bufPos = 0;

    /* renamed from: org.bouncycastle.crypto.engines.SparkleEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State = iArr;
            try {
                iArr[State.DecInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecAad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecData.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecFinal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncData.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncFinal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncInit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncAad.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[SparkleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters = iArr2;
            try {
                iArr2[SparkleParameters.SCHWAEMM128_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_128.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM192_192.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_256.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum SparkleParameters {
        SCHWAEMM128_128,
        SCHWAEMM256_128,
        SCHWAEMM192_192,
        SCHWAEMM256_256
    }

    private enum State {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SparkleEngine(SparkleParameters sparkleParameters) {
        int i;
        int i2 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[sparkleParameters.ordinal()];
        int i3 = 256;
        int i4 = 128;
        if (i2 != 1) {
            i = 384;
            if (i2 != 2) {
                if (i2 == 3) {
                    i3 = 192;
                    this.SCHWAEMM_KEY_LEN = 192;
                    this.SCHWAEMM_NONCE_LEN = 192;
                    this.SPARKLE_STEPS_SLIM = 7;
                    this.SPARKLE_STEPS_BIG = 11;
                    this.algorithmName = "SCHWAEMM192-192";
                } else {
                    if (i2 != 4) {
                        throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
                    }
                    this.SCHWAEMM_KEY_LEN = 256;
                    this.SCHWAEMM_NONCE_LEN = 256;
                    this.SPARKLE_STEPS_SLIM = 8;
                    this.SPARKLE_STEPS_BIG = 12;
                    this.algorithmName = "SCHWAEMM256-256";
                    i = 512;
                }
                i4 = i3;
                int i5 = this.SCHWAEMM_KEY_LEN;
                int i6 = i5 >>> 5;
                this.KEY_WORDS = i6;
                this.KEY_BYTES = i5 >>> 3;
                this.TAG_WORDS = i3 >>> 5;
                int i7 = i3 >>> 3;
                this.TAG_BYTES = i7;
                int i8 = i >>> 5;
                this.STATE_WORDS = i8;
                int i9 = this.SCHWAEMM_NONCE_LEN;
                int i10 = i9 >>> 5;
                this.RATE_WORDS = i10;
                int i11 = i9 >>> 3;
                this.RATE_BYTES = i11;
                int i12 = i4 >>> 6;
                int i13 = i4 >>> 5;
                this.CAP_MASK = i10 <= i13 ? i13 - 1 : -1;
                int i14 = 1 << i12;
                this._A0 = i14 << 24;
                this._A1 = (i14 ^ 1) << 24;
                this._M2 = (i14 ^ 2) << 24;
                this._M3 = (3 ^ i14) << 24;
                this.state = new int[i8];
                this.k = new int[i6];
                this.npub = new int[i10];
                int i15 = i11 + i7;
                this.m_bufferSizeDecrypt = i15;
                this.m_buf = new byte[i15];
            }
            this.SCHWAEMM_KEY_LEN = 128;
            this.SCHWAEMM_NONCE_LEN = 256;
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 11;
            this.algorithmName = "SCHWAEMM256-128";
        } else {
            this.SCHWAEMM_KEY_LEN = 128;
            this.SCHWAEMM_NONCE_LEN = 128;
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 10;
            this.algorithmName = "SCHWAEMM128-128";
            i = 256;
        }
        i3 = 128;
        int i52 = this.SCHWAEMM_KEY_LEN;
        int i62 = i52 >>> 5;
        this.KEY_WORDS = i62;
        this.KEY_BYTES = i52 >>> 3;
        this.TAG_WORDS = i3 >>> 5;
        int i72 = i3 >>> 3;
        this.TAG_BYTES = i72;
        int i82 = i >>> 5;
        this.STATE_WORDS = i82;
        int i92 = this.SCHWAEMM_NONCE_LEN;
        int i102 = i92 >>> 5;
        this.RATE_WORDS = i102;
        int i112 = i92 >>> 3;
        this.RATE_BYTES = i112;
        int i122 = i4 >>> 6;
        int i132 = i4 >>> 5;
        this.CAP_MASK = i102 <= i132 ? i132 - 1 : -1;
        int i142 = 1 << i122;
        this._A0 = i142 << 24;
        this._A1 = (i142 ^ 1) << 24;
        this._M2 = (i142 ^ 2) << 24;
        this._M3 = (3 ^ i142) << 24;
        this.state = new int[i82];
        this.k = new int[i62];
        this.npub = new int[i102];
        int i152 = i112 + i72;
        this.m_bufferSizeDecrypt = i152;
        this.m_buf = new byte[i152];
    }

    private static int ELL(int i) {
        return (i & 65535) ^ Integers.rotateRight(i, 16);
    }

    private void checkAAD() {
        State state;
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()];
        if (i == 1) {
            state = State.DecAad;
        } else {
            if (i == 2) {
                return;
            }
            if (i == 6) {
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            }
            if (i != 7) {
                if (i != 8) {
                    throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
                }
                return;
            }
            state = State.EncAad;
        }
        this.m_state = state;
    }

    private boolean checkData() {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                finishAAD(State.DecData);
                return false;
            case 3:
                return false;
            case 4:
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
            case 5:
                return true;
            case 6:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 7:
            case 8:
                finishAAD(State.EncData);
                return true;
        }
    }

    private void finishAAD(State state) {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()];
        if (i == 2 || i == 8) {
            processFinalAAD();
        }
        this.m_bufPos = 0;
        this.m_state = state;
    }

    private void processBufferAAD(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.RATE_WORDS;
            if (i2 >= i3 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                return;
            }
            int i4 = (i3 / 2) + i2;
            int[] iArr = this.state;
            int i5 = iArr[i2];
            int i6 = iArr[i4];
            int littleEndianToInt = Pack.littleEndianToInt(bArr, (i2 * 4) + i);
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, (i4 * 4) + i);
            int[] iArr2 = this.state;
            int i7 = this.RATE_WORDS;
            iArr2[i2] = (littleEndianToInt ^ i6) ^ iArr2[i7 + i2];
            iArr2[i4] = ((i6 ^ i5) ^ littleEndianToInt2) ^ iArr2[i7 + (this.CAP_MASK & i4)];
            i2++;
        }
    }

    private void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i2 > bArr2.length - this.RATE_BYTES) {
            throw new OutputLengthException("output buffer too short");
        }
        int i3 = 0;
        while (true) {
            int i4 = this.RATE_WORDS;
            if (i3 >= i4 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i5 = (i4 / 2) + i3;
            int[] iArr = this.state;
            int i6 = iArr[i3];
            int i7 = iArr[i5];
            int i8 = i3 * 4;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, i + i8);
            int i9 = i5 * 4;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i9);
            int[] iArr2 = this.state;
            int i10 = this.RATE_WORDS;
            iArr2[i3] = ((i6 ^ i7) ^ littleEndianToInt) ^ iArr2[i10 + i3];
            iArr2[i5] = (i6 ^ littleEndianToInt2) ^ iArr2[i10 + (this.CAP_MASK & i5)];
            Pack.intToLittleEndian(littleEndianToInt ^ i6, bArr2, i2 + i8);
            Pack.intToLittleEndian(littleEndianToInt2 ^ i7, bArr2, i2 + i9);
            i3++;
        }
    }

    private void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i2 > bArr2.length - this.RATE_BYTES) {
            throw new OutputLengthException("output buffer too short");
        }
        int i3 = 0;
        while (true) {
            int i4 = this.RATE_WORDS;
            if (i3 >= i4 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i5 = (i4 / 2) + i3;
            int[] iArr = this.state;
            int i6 = iArr[i3];
            int i7 = iArr[i5];
            int i8 = i3 * 4;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, i + i8);
            int i9 = i5 * 4;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i9);
            int[] iArr2 = this.state;
            int i10 = this.RATE_WORDS;
            iArr2[i3] = (i7 ^ littleEndianToInt) ^ iArr2[i10 + i3];
            iArr2[i5] = ((i6 ^ i7) ^ littleEndianToInt2) ^ iArr2[i10 + (this.CAP_MASK & i5)];
            Pack.intToLittleEndian(littleEndianToInt ^ i6, bArr2, i2 + i8);
            Pack.intToLittleEndian(littleEndianToInt2 ^ i7, bArr2, i2 + i9);
            i3++;
        }
    }

    private void processFinalAAD() {
        int i = this.m_bufPos;
        int i2 = 0;
        if (i < this.RATE_BYTES) {
            int[] iArr = this.state;
            int i3 = this.STATE_WORDS - 1;
            iArr[i3] = iArr[i3] ^ this._A0;
            this.m_buf[i] = ByteCompanionObject.MIN_VALUE;
            while (true) {
                int i4 = this.m_bufPos + 1;
                this.m_bufPos = i4;
                if (i4 >= this.RATE_BYTES) {
                    break;
                } else {
                    this.m_buf[i4] = 0;
                }
            }
        } else {
            int[] iArr2 = this.state;
            int i5 = this.STATE_WORDS - 1;
            iArr2[i5] = iArr2[i5] ^ this._A1;
        }
        while (true) {
            int i6 = this.RATE_WORDS;
            if (i2 >= i6 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
                return;
            }
            int i7 = (i6 / 2) + i2;
            int[] iArr3 = this.state;
            int i8 = iArr3[i2];
            int i9 = iArr3[i7];
            int littleEndianToInt = Pack.littleEndianToInt(this.m_buf, i2 * 4);
            int littleEndianToInt2 = Pack.littleEndianToInt(this.m_buf, i7 * 4);
            int[] iArr4 = this.state;
            int i10 = this.RATE_WORDS;
            iArr4[i2] = (littleEndianToInt ^ i9) ^ iArr4[i10 + i2];
            iArr4[i7] = ((i9 ^ i8) ^ littleEndianToInt2) ^ iArr4[i10 + (this.CAP_MASK & i7)];
            i2++;
        }
    }

    private void reset(boolean z) {
        if (z) {
            this.tag = null;
        }
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
        this.encrypted = false;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 7:
                break;
            case 2:
            case 3:
            case 4:
                this.m_state = State.DecInit;
                break;
            case 5:
            case 6:
            case 8:
                this.m_state = State.EncFinal;
                return;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
        System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
        System.arraycopy(this.k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
        sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    private static void sparkle_opt(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            sparkle_opt8(iArr, i);
        } else if (length == 12) {
            sparkle_opt12(iArr, i);
        } else {
            if (length != 16) {
                throw new IllegalStateException();
            }
            sparkle_opt16(iArr, i);
        }
    }

    public static void sparkle_opt12(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt12(iArr, i);
    }

    static void sparkle_opt12(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char c = 4;
        int i6 = iArr[4];
        char c2 = 5;
        int i7 = iArr[5];
        char c3 = 6;
        int i8 = iArr[6];
        char c4 = 7;
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = 0;
        int i15 = i11;
        while (i14 < i) {
            int[] iArr2 = RCON;
            int i16 = i3 ^ iArr2[i14 & 7];
            int i17 = i5 ^ i14;
            int i18 = iArr2[0];
            char c5 = c;
            int rotateRight = i2 + Integers.rotateRight(i16, 31);
            char c6 = c2;
            int rotateRight2 = i16 ^ Integers.rotateRight(rotateRight, 24);
            char c7 = c3;
            int rotateRight3 = (rotateRight ^ i18) + Integers.rotateRight(rotateRight2, 17);
            int rotateRight4 = rotateRight2 ^ Integers.rotateRight(rotateRight3, 17);
            int i19 = (rotateRight3 ^ i18) + rotateRight4;
            int rotateRight5 = rotateRight4 ^ Integers.rotateRight(i19, 31);
            int rotateRight6 = (i19 ^ i18) + Integers.rotateRight(rotateRight5, 24);
            char c8 = c4;
            int rotateRight7 = rotateRight5 ^ Integers.rotateRight(rotateRight6, 16);
            int i20 = rotateRight6 ^ i18;
            int i21 = iArr2[1];
            int rotateRight8 = i4 + Integers.rotateRight(i17, 31);
            int rotateRight9 = i17 ^ Integers.rotateRight(rotateRight8, 24);
            int rotateRight10 = (rotateRight8 ^ i21) + Integers.rotateRight(rotateRight9, 17);
            int rotateRight11 = rotateRight9 ^ Integers.rotateRight(rotateRight10, 17);
            int i22 = (rotateRight10 ^ i21) + rotateRight11;
            int rotateRight12 = rotateRight11 ^ Integers.rotateRight(i22, 31);
            int rotateRight13 = (i22 ^ i21) + Integers.rotateRight(rotateRight12, 24);
            int rotateRight14 = rotateRight12 ^ Integers.rotateRight(rotateRight13, 16);
            int i23 = rotateRight13 ^ i21;
            int i24 = iArr2[2];
            int rotateRight15 = i6 + Integers.rotateRight(i7, 31);
            int rotateRight16 = i7 ^ Integers.rotateRight(rotateRight15, 24);
            int rotateRight17 = (rotateRight15 ^ i24) + Integers.rotateRight(rotateRight16, 17);
            int rotateRight18 = rotateRight16 ^ Integers.rotateRight(rotateRight17, 17);
            int i25 = (rotateRight17 ^ i24) + rotateRight18;
            int rotateRight19 = rotateRight18 ^ Integers.rotateRight(i25, 31);
            int rotateRight20 = (i25 ^ i24) + Integers.rotateRight(rotateRight19, 24);
            int rotateRight21 = rotateRight19 ^ Integers.rotateRight(rotateRight20, 16);
            int i26 = rotateRight20 ^ i24;
            int i27 = iArr2[3];
            int rotateRight22 = i8 + Integers.rotateRight(i9, 31);
            int rotateRight23 = i9 ^ Integers.rotateRight(rotateRight22, 24);
            int rotateRight24 = (rotateRight22 ^ i27) + Integers.rotateRight(rotateRight23, 17);
            int rotateRight25 = rotateRight23 ^ Integers.rotateRight(rotateRight24, 17);
            int i28 = (rotateRight24 ^ i27) + rotateRight25;
            int rotateRight26 = rotateRight25 ^ Integers.rotateRight(i28, 31);
            int rotateRight27 = (i28 ^ i27) + Integers.rotateRight(rotateRight26, 24);
            int rotateRight28 = rotateRight26 ^ Integers.rotateRight(rotateRight27, 16);
            int i29 = rotateRight27 ^ i27;
            int i30 = iArr2[c5];
            int rotateRight29 = i10 + Integers.rotateRight(i15, 31);
            int rotateRight30 = i15 ^ Integers.rotateRight(rotateRight29, 24);
            int rotateRight31 = (rotateRight29 ^ i30) + Integers.rotateRight(rotateRight30, 17);
            int rotateRight32 = rotateRight30 ^ Integers.rotateRight(rotateRight31, 17);
            int i31 = (rotateRight31 ^ i30) + rotateRight32;
            int rotateRight33 = rotateRight32 ^ Integers.rotateRight(i31, 31);
            int rotateRight34 = (i31 ^ i30) + Integers.rotateRight(rotateRight33, 24);
            int rotateRight35 = rotateRight33 ^ Integers.rotateRight(rotateRight34, 16);
            int i32 = rotateRight34 ^ i30;
            int i33 = iArr2[c6];
            int rotateRight36 = i12 + Integers.rotateRight(i13, 31);
            int rotateRight37 = i13 ^ Integers.rotateRight(rotateRight36, 24);
            int rotateRight38 = (rotateRight36 ^ i33) + Integers.rotateRight(rotateRight37, 17);
            int rotateRight39 = rotateRight37 ^ Integers.rotateRight(rotateRight38, 17);
            int i34 = (rotateRight38 ^ i33) + rotateRight39;
            int rotateRight40 = rotateRight39 ^ Integers.rotateRight(i34, 31);
            int rotateRight41 = (i34 ^ i33) + Integers.rotateRight(rotateRight40, 24);
            int rotateRight42 = rotateRight40 ^ Integers.rotateRight(rotateRight41, 16);
            int i35 = rotateRight41 ^ i33;
            int ELL = ELL((i20 ^ i23) ^ i26);
            int ELL2 = ELL((rotateRight7 ^ rotateRight14) ^ rotateRight21);
            int i36 = (i32 ^ i23) ^ ELL2;
            int i37 = (rotateRight35 ^ rotateRight14) ^ ELL;
            int i38 = (rotateRight42 ^ rotateRight21) ^ ELL;
            int i39 = ELL ^ (rotateRight28 ^ rotateRight7);
            i14++;
            i9 = rotateRight7;
            i10 = i23;
            i4 = (i35 ^ i26) ^ ELL2;
            i12 = i26;
            i6 = (i29 ^ i20) ^ ELL2;
            c = c5;
            c4 = c8;
            i3 = i37;
            i8 = i20;
            i15 = rotateRight14;
            i2 = i36;
            c3 = c7;
            i5 = i38;
            i13 = rotateRight21;
            i7 = i39;
            c2 = c6;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[c] = i6;
        iArr[c2] = i7;
        iArr[c3] = i8;
        iArr[c4] = i9;
        iArr[8] = i10;
        iArr[9] = i15;
        iArr[10] = i12;
        iArr[11] = i13;
    }

    public static void sparkle_opt16(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt16(iArr, i);
    }

    static void sparkle_opt16(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        char c = 6;
        int i8 = iArr[6];
        char c2 = 7;
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = i13;
        int i18 = i15;
        int i19 = iArr[15];
        int i20 = 0;
        int i21 = i11;
        while (i20 < i) {
            int[] iArr2 = RCON;
            int i22 = i3 ^ iArr2[i20 & 7];
            int i23 = i5 ^ i20;
            int i24 = iArr2[0];
            char c3 = c;
            int rotateRight = i2 + Integers.rotateRight(i22, 31);
            char c4 = c2;
            int rotateRight2 = i22 ^ Integers.rotateRight(rotateRight, 24);
            int rotateRight3 = (rotateRight ^ i24) + Integers.rotateRight(rotateRight2, 17);
            int rotateRight4 = rotateRight2 ^ Integers.rotateRight(rotateRight3, 17);
            int i25 = (rotateRight3 ^ i24) + rotateRight4;
            int rotateRight5 = rotateRight4 ^ Integers.rotateRight(i25, 31);
            int rotateRight6 = (i25 ^ i24) + Integers.rotateRight(rotateRight5, 24);
            int rotateRight7 = rotateRight5 ^ Integers.rotateRight(rotateRight6, 16);
            int i26 = rotateRight6 ^ i24;
            int i27 = iArr2[1];
            int rotateRight8 = i4 + Integers.rotateRight(i23, 31);
            int rotateRight9 = i23 ^ Integers.rotateRight(rotateRight8, 24);
            int rotateRight10 = (rotateRight8 ^ i27) + Integers.rotateRight(rotateRight9, 17);
            int rotateRight11 = rotateRight9 ^ Integers.rotateRight(rotateRight10, 17);
            int i28 = (rotateRight10 ^ i27) + rotateRight11;
            int rotateRight12 = rotateRight11 ^ Integers.rotateRight(i28, 31);
            int rotateRight13 = (i28 ^ i27) + Integers.rotateRight(rotateRight12, 24);
            int rotateRight14 = rotateRight12 ^ Integers.rotateRight(rotateRight13, 16);
            int i29 = rotateRight13 ^ i27;
            int i30 = iArr2[2];
            int rotateRight15 = i6 + Integers.rotateRight(i7, 31);
            int rotateRight16 = i7 ^ Integers.rotateRight(rotateRight15, 24);
            int rotateRight17 = (rotateRight15 ^ i30) + Integers.rotateRight(rotateRight16, 17);
            int rotateRight18 = rotateRight16 ^ Integers.rotateRight(rotateRight17, 17);
            int i31 = (rotateRight17 ^ i30) + rotateRight18;
            int rotateRight19 = rotateRight18 ^ Integers.rotateRight(i31, 31);
            int rotateRight20 = (i31 ^ i30) + Integers.rotateRight(rotateRight19, 24);
            int rotateRight21 = rotateRight19 ^ Integers.rotateRight(rotateRight20, 16);
            int i32 = rotateRight20 ^ i30;
            int i33 = iArr2[3];
            int rotateRight22 = i8 + Integers.rotateRight(i9, 31);
            int rotateRight23 = i9 ^ Integers.rotateRight(rotateRight22, 24);
            int rotateRight24 = (rotateRight22 ^ i33) + Integers.rotateRight(rotateRight23, 17);
            int rotateRight25 = rotateRight23 ^ Integers.rotateRight(rotateRight24, 17);
            int i34 = (rotateRight24 ^ i33) + rotateRight25;
            int rotateRight26 = rotateRight25 ^ Integers.rotateRight(i34, 31);
            int rotateRight27 = (i34 ^ i33) + Integers.rotateRight(rotateRight26, 24);
            int rotateRight28 = rotateRight26 ^ Integers.rotateRight(rotateRight27, 16);
            int i35 = i33 ^ rotateRight27;
            int i36 = iArr2[4];
            int rotateRight29 = i10 + Integers.rotateRight(i21, 31);
            int rotateRight30 = i21 ^ Integers.rotateRight(rotateRight29, 24);
            int rotateRight31 = (rotateRight29 ^ i36) + Integers.rotateRight(rotateRight30, 17);
            int rotateRight32 = rotateRight30 ^ Integers.rotateRight(rotateRight31, 17);
            int i37 = (rotateRight31 ^ i36) + rotateRight32;
            int rotateRight33 = rotateRight32 ^ Integers.rotateRight(i37, 31);
            int rotateRight34 = (i37 ^ i36) + Integers.rotateRight(rotateRight33, 24);
            int rotateRight35 = rotateRight33 ^ Integers.rotateRight(rotateRight34, 16);
            int i38 = rotateRight34 ^ i36;
            int i39 = iArr2[5];
            int rotateRight36 = i12 + Integers.rotateRight(i17, 31);
            int rotateRight37 = i17 ^ Integers.rotateRight(rotateRight36, 24);
            int rotateRight38 = (rotateRight36 ^ i39) + Integers.rotateRight(rotateRight37, 17);
            int rotateRight39 = rotateRight37 ^ Integers.rotateRight(rotateRight38, 17);
            int i40 = (rotateRight38 ^ i39) + rotateRight39;
            int rotateRight40 = rotateRight39 ^ Integers.rotateRight(i40, 31);
            int rotateRight41 = (i40 ^ i39) + Integers.rotateRight(rotateRight40, 24);
            int rotateRight42 = rotateRight40 ^ Integers.rotateRight(rotateRight41, 16);
            int i41 = rotateRight41 ^ i39;
            int i42 = iArr2[c3];
            int rotateRight43 = i14 + Integers.rotateRight(i18, 31);
            int rotateRight44 = i18 ^ Integers.rotateRight(rotateRight43, 24);
            int rotateRight45 = (rotateRight43 ^ i42) + Integers.rotateRight(rotateRight44, 17);
            int rotateRight46 = rotateRight44 ^ Integers.rotateRight(rotateRight45, 17);
            int i43 = (rotateRight45 ^ i42) + rotateRight46;
            int rotateRight47 = rotateRight46 ^ Integers.rotateRight(i43, 31);
            int rotateRight48 = (i43 ^ i42) + Integers.rotateRight(rotateRight47, 24);
            int rotateRight49 = rotateRight47 ^ Integers.rotateRight(rotateRight48, 16);
            int i44 = rotateRight48 ^ i42;
            int i45 = iArr2[c4];
            int rotateRight50 = i16 + Integers.rotateRight(i19, 31);
            int rotateRight51 = i19 ^ Integers.rotateRight(rotateRight50, 24);
            int rotateRight52 = (rotateRight50 ^ i45) + Integers.rotateRight(rotateRight51, 17);
            int rotateRight53 = rotateRight51 ^ Integers.rotateRight(rotateRight52, 17);
            int i46 = (rotateRight52 ^ i45) + rotateRight53;
            int rotateRight54 = rotateRight53 ^ Integers.rotateRight(i46, 31);
            int rotateRight55 = (i46 ^ i45) + Integers.rotateRight(rotateRight54, 24);
            int rotateRight56 = rotateRight54 ^ Integers.rotateRight(rotateRight55, 16);
            int i47 = rotateRight55 ^ i45;
            int ELL = ELL(((i26 ^ i29) ^ i32) ^ i35);
            int ELL2 = ELL(((rotateRight7 ^ rotateRight14) ^ rotateRight21) ^ rotateRight28);
            int i48 = rotateRight14 ^ rotateRight42;
            int i49 = (i41 ^ i29) ^ ELL2;
            int i50 = (i44 ^ i32) ^ ELL2;
            int i51 = (rotateRight21 ^ rotateRight49) ^ ELL;
            int i52 = (i47 ^ i35) ^ ELL2;
            int i53 = (i26 ^ i38) ^ ELL2;
            i9 = (rotateRight7 ^ rotateRight35) ^ ELL;
            i20++;
            i7 = (rotateRight56 ^ rotateRight28) ^ ELL;
            i21 = rotateRight7;
            i3 = i48 ^ ELL;
            i12 = i29;
            i4 = i50;
            i18 = rotateRight21;
            i8 = i53;
            i2 = i49;
            i17 = rotateRight14;
            i16 = i35;
            i5 = i51;
            c = c3;
            i10 = i26;
            i14 = i32;
            i6 = i52;
            i19 = rotateRight28;
            c2 = c4;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = i6;
        iArr[5] = i7;
        iArr[c] = i8;
        iArr[c2] = i9;
        iArr[8] = i10;
        iArr[9] = i21;
        iArr[10] = i12;
        iArr[11] = i17;
        iArr[12] = i14;
        iArr[13] = i18;
        iArr[14] = i16;
        iArr[15] = i19;
    }

    static void sparkle_opt8(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        char c = 2;
        int i4 = iArr[2];
        char c2 = 3;
        int i5 = iArr[3];
        char c3 = 4;
        int i6 = iArr[4];
        char c4 = 5;
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = 0;
        while (i10 < i) {
            int[] iArr2 = RCON;
            int i11 = i3 ^ iArr2[i10 & 7];
            int i12 = i5 ^ i10;
            int i13 = iArr2[0];
            char c5 = c;
            int rotateRight = i2 + Integers.rotateRight(i11, 31);
            char c6 = c2;
            int rotateRight2 = i11 ^ Integers.rotateRight(rotateRight, 24);
            char c7 = c3;
            int rotateRight3 = (rotateRight ^ i13) + Integers.rotateRight(rotateRight2, 17);
            int rotateRight4 = rotateRight2 ^ Integers.rotateRight(rotateRight3, 17);
            int i14 = (rotateRight3 ^ i13) + rotateRight4;
            int rotateRight5 = rotateRight4 ^ Integers.rotateRight(i14, 31);
            int rotateRight6 = (i14 ^ i13) + Integers.rotateRight(rotateRight5, 24);
            char c8 = c4;
            int rotateRight7 = rotateRight5 ^ Integers.rotateRight(rotateRight6, 16);
            int i15 = rotateRight6 ^ i13;
            int i16 = iArr2[1];
            int rotateRight8 = i4 + Integers.rotateRight(i12, 31);
            int rotateRight9 = i12 ^ Integers.rotateRight(rotateRight8, 24);
            int rotateRight10 = (rotateRight8 ^ i16) + Integers.rotateRight(rotateRight9, 17);
            int rotateRight11 = rotateRight9 ^ Integers.rotateRight(rotateRight10, 17);
            int i17 = (rotateRight10 ^ i16) + rotateRight11;
            int rotateRight12 = rotateRight11 ^ Integers.rotateRight(i17, 31);
            int rotateRight13 = (i17 ^ i16) + Integers.rotateRight(rotateRight12, 24);
            int rotateRight14 = rotateRight12 ^ Integers.rotateRight(rotateRight13, 16);
            int i18 = rotateRight13 ^ i16;
            int i19 = iArr2[c5];
            int rotateRight15 = i6 + Integers.rotateRight(i7, 31);
            int rotateRight16 = i7 ^ Integers.rotateRight(rotateRight15, 24);
            int rotateRight17 = (rotateRight15 ^ i19) + Integers.rotateRight(rotateRight16, 17);
            int rotateRight18 = rotateRight16 ^ Integers.rotateRight(rotateRight17, 17);
            int i20 = (rotateRight17 ^ i19) + rotateRight18;
            int rotateRight19 = rotateRight18 ^ Integers.rotateRight(i20, 31);
            int rotateRight20 = (i20 ^ i19) + Integers.rotateRight(rotateRight19, 24);
            int rotateRight21 = rotateRight19 ^ Integers.rotateRight(rotateRight20, 16);
            int i21 = iArr2[c6];
            int rotateRight22 = i8 + Integers.rotateRight(i9, 31);
            int rotateRight23 = i9 ^ Integers.rotateRight(rotateRight22, 24);
            int rotateRight24 = (rotateRight22 ^ i21) + Integers.rotateRight(rotateRight23, 17);
            int rotateRight25 = Integers.rotateRight(rotateRight24, 17) ^ rotateRight23;
            int i22 = (rotateRight24 ^ i21) + rotateRight25;
            int rotateRight26 = Integers.rotateRight(i22, 31) ^ rotateRight25;
            int rotateRight27 = (i22 ^ i21) + Integers.rotateRight(rotateRight26, 24);
            int rotateRight28 = rotateRight26 ^ Integers.rotateRight(rotateRight27, 16);
            int i23 = rotateRight27 ^ i21;
            int ELL = ELL(i15 ^ i18);
            int ELL2 = ELL(rotateRight7 ^ rotateRight14);
            int i24 = (i23 ^ i18) ^ ELL2;
            int i25 = (rotateRight28 ^ rotateRight14) ^ ELL;
            int i26 = ELL ^ (rotateRight21 ^ rotateRight7);
            i10++;
            i7 = rotateRight7;
            i3 = i25;
            i8 = i18;
            i9 = rotateRight14;
            i5 = i26;
            i4 = ((rotateRight20 ^ i19) ^ i15) ^ ELL2;
            c = c5;
            c3 = c7;
            c4 = c8;
            i6 = i15;
            i2 = i24;
            c2 = c6;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[c] = i4;
        iArr[c2] = i5;
        iArr[c3] = i6;
        iArr[c4] = i7;
        iArr[6] = i8;
        iArr[7] = i9;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int i2;
        int i3;
        boolean checkData = checkData();
        int i4 = this.m_bufPos;
        int i5 = this.TAG_BYTES;
        if (checkData) {
            i2 = i4 + i5;
        } else {
            if (i4 < i5) {
                throw new InvalidCipherTextException("data too short");
            }
            i2 = i4 - i5;
            this.m_bufPos = i2;
        }
        if (i > bArr.length - i2) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypted || this.m_bufPos > 0) {
            int[] iArr = this.state;
            int i6 = this.STATE_WORDS - 1;
            iArr[i6] = iArr[i6] ^ (this.m_bufPos < this.RATE_BYTES ? this._M2 : this._M3);
            int[] iArr2 = new int[this.RATE_WORDS];
            int i7 = 0;
            while (true) {
                i3 = this.m_bufPos;
                if (i7 >= i3) {
                    break;
                }
                int i8 = i7 >>> 2;
                iArr2[i8] = iArr2[i8] | ((this.m_buf[i7] & UByte.MAX_VALUE) << ((i7 & 3) << 3));
                i7++;
            }
            if (i3 < this.RATE_BYTES) {
                if (!checkData) {
                    int i9 = (i3 & 3) << 3;
                    int i10 = i3 >>> 2;
                    int i11 = iArr2[i10];
                    int[] iArr3 = this.state;
                    iArr2[i10] = ((iArr3[i3 >>> 2] >>> i9) << i9) | i11;
                    int i12 = (i3 >>> 2) + 1;
                    System.arraycopy(iArr3, i12, iArr2, i12, this.RATE_WORDS - i12);
                }
                int i13 = this.m_bufPos;
                int i14 = i13 >>> 2;
                iArr2[i14] = (128 << ((i13 & 3) << 3)) ^ iArr2[i14];
            }
            int i15 = 0;
            while (true) {
                int i16 = this.RATE_WORDS;
                if (i15 >= i16 / 2) {
                    break;
                }
                int i17 = (i16 / 2) + i15;
                int[] iArr4 = this.state;
                int i18 = iArr4[i15];
                int i19 = iArr4[i17];
                if (checkData) {
                    iArr4[i15] = (iArr2[i15] ^ i19) ^ iArr4[i16 + i15];
                    iArr4[i17] = iArr4[i16 + (this.CAP_MASK & i17)] ^ ((i18 ^ i19) ^ iArr2[i17]);
                } else {
                    iArr4[i15] = ((i18 ^ i19) ^ iArr2[i15]) ^ iArr4[i16 + i15];
                    iArr4[i17] = iArr4[i16 + (this.CAP_MASK & i17)] ^ (iArr2[i17] ^ i18);
                }
                iArr2[i15] = iArr2[i15] ^ i18;
                iArr2[i17] = iArr2[i17] ^ i19;
                i15++;
            }
            int i20 = 0;
            while (i20 < this.m_bufPos) {
                bArr[i] = (byte) (iArr2[i20 >>> 2] >>> ((i20 & 3) << 3));
                i20++;
                i++;
            }
            sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        }
        for (int i21 = 0; i21 < this.KEY_WORDS; i21++) {
            int[] iArr5 = this.state;
            int i22 = this.RATE_WORDS + i21;
            iArr5[i22] = iArr5[i22] ^ this.k[i21];
        }
        byte[] bArr2 = new byte[this.TAG_BYTES];
        this.tag = bArr2;
        Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, bArr2, 0);
        if (checkData) {
            System.arraycopy(this.tag, 0, bArr, i, this.TAG_BYTES);
        } else if (!Arrays.constantTimeAreEqual(this.TAG_BYTES, this.tag, 0, this.m_buf, this.m_bufPos)) {
            throw new InvalidCipherTextException(this.algorithmName + " mac does not match");
        }
        reset(!checkData);
        return i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public int getIVBytesSize() {
        return this.RATE_BYTES;
    }

    public int getKeyBytesSize() {
        return this.KEY_BYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int max = Math.max(0, i);
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                return Math.max(0, max - this.TAG_BYTES);
            case 3:
            case 4:
                return Math.max(0, (max + this.m_bufPos) - this.TAG_BYTES);
            case 5:
            case 6:
                return max + this.m_bufPos + this.TAG_BYTES;
            default:
                return max + this.TAG_BYTES;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int i2;
        int max = Math.max(0, i) - 1;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 3:
            case 4:
                max += this.m_bufPos;
            case 1:
            case 2:
                i2 = max - this.TAG_BYTES;
                max = Math.max(0, i2);
                break;
            case 5:
            case 6:
                i2 = max + this.m_bufPos;
                max = Math.max(0, i2);
                break;
        }
        return max - (max % this.RATE_BYTES);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        KeyParameter keyParameter;
        byte[] iv;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            keyParameter = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize != this.TAG_BYTES * 8) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to Sparkle");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            CipherParameters parameters = parametersWithIV.getParameters();
            keyParameter = parameters instanceof KeyParameter ? (KeyParameter) parameters : null;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (keyParameter == null) {
            throw new IllegalArgumentException("Sparkle init parameters must include a key");
        }
        int i = this.KEY_WORDS * 4;
        if (i != keyParameter.getKeyLength()) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i + " bytes of key");
        }
        int i2 = this.RATE_WORDS * 4;
        if (iv == null || i2 != iv.length) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i2 + " bytes of IV");
        }
        Pack.littleEndianToInt(keyParameter.getKey(), 0, this.k);
        Pack.littleEndianToInt(iv, 0, this.npub);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        this.m_state = z ? State.EncInit : State.DecInit;
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        checkAAD();
        if (this.m_bufPos == this.RATE_BYTES) {
            processBufferAAD(this.m_buf, 0);
            this.m_bufPos = 0;
        }
        byte[] bArr = this.m_buf;
        int i = this.m_bufPos;
        this.m_bufPos = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (i > bArr.length - i2) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 <= 0) {
            return;
        }
        checkAAD();
        int i3 = this.m_bufPos;
        if (i3 > 0) {
            int i4 = this.RATE_BYTES - i3;
            if (i2 <= i4) {
                System.arraycopy(bArr, i, this.m_buf, i3, i2);
                this.m_bufPos += i2;
                return;
            } else {
                System.arraycopy(bArr, i, this.m_buf, i3, i4);
                i += i4;
                i2 -= i4;
                processBufferAAD(this.m_buf, 0);
            }
        }
        while (i2 > this.RATE_BYTES) {
            processBufferAAD(bArr, i);
            int i5 = this.RATE_BYTES;
            i += i5;
            i2 -= i5;
        }
        System.arraycopy(bArr, i, this.m_buf, 0, i2);
        this.m_bufPos = i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        return processBytes(new byte[]{b}, 0, 1, bArr, i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4;
        int i5;
        if (i > bArr.length - i2) {
            throw new DataLengthException("input buffer too short");
        }
        if (checkData()) {
            int i6 = this.m_bufPos;
            if (i6 > 0) {
                int i7 = this.RATE_BYTES - i6;
                if (i2 <= i7) {
                    System.arraycopy(bArr, i, this.m_buf, i6, i2);
                    this.m_bufPos += i2;
                    return 0;
                }
                System.arraycopy(bArr, i, this.m_buf, i6, i7);
                i += i7;
                i2 -= i7;
                processBufferEncrypt(this.m_buf, 0, bArr2, i3);
                i5 = this.RATE_BYTES;
            } else {
                i5 = 0;
            }
            while (i2 > this.RATE_BYTES) {
                processBufferEncrypt(bArr, i, bArr2, i3 + i5);
                int i8 = this.RATE_BYTES;
                i += i8;
                i2 -= i8;
                i5 += i8;
            }
            System.arraycopy(bArr, i, this.m_buf, 0, i2);
            this.m_bufPos = i2;
            return i5;
        }
        int i9 = this.m_bufferSizeDecrypt;
        int i10 = this.m_bufPos;
        int i11 = i9 - i10;
        if (i2 <= i11) {
            System.arraycopy(bArr, i, this.m_buf, i10, i2);
            this.m_bufPos += i2;
            return 0;
        }
        if (i10 > this.RATE_BYTES) {
            processBufferDecrypt(this.m_buf, 0, bArr2, i3);
            int i12 = this.m_bufPos;
            int i13 = this.RATE_BYTES;
            int i14 = i12 - i13;
            this.m_bufPos = i14;
            byte[] bArr3 = this.m_buf;
            System.arraycopy(bArr3, i13, bArr3, 0, i14);
            i4 = this.RATE_BYTES;
            if (i2 <= i11 + i4) {
                System.arraycopy(bArr, i, this.m_buf, this.m_bufPos, i2);
                this.m_bufPos += i2;
                return i4;
            }
        } else {
            i4 = 0;
        }
        int i15 = this.RATE_BYTES;
        int i16 = this.m_bufPos;
        int i17 = i15 - i16;
        System.arraycopy(bArr, i, this.m_buf, i16, i17);
        i += i17;
        i2 -= i17;
        processBufferDecrypt(this.m_buf, 0, bArr2, i3 + i4);
        i5 = i4 + this.RATE_BYTES;
        while (i2 > this.m_bufferSizeDecrypt) {
            processBufferDecrypt(bArr, i, bArr2, i3 + i5);
            int i18 = this.RATE_BYTES;
            i += i18;
            i2 -= i18;
            i5 += i18;
        }
        System.arraycopy(bArr, i, this.m_buf, 0, i2);
        this.m_bufPos = i2;
        return i5;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }
}
