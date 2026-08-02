package org.bouncycastle.crypto.modes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class ChaCha20Poly1305 implements AEADCipher {
    private static final long AAD_LIMIT = -1;
    private static final int BUF_SIZE = 64;
    private static final long DATA_LIMIT = 274877906880L;
    private static final int KEY_SIZE = 32;
    private static final int MAC_SIZE = 16;
    private static final int NONCE_SIZE = 12;
    private static final byte[] ZEROES = new byte[15];
    private long aadCount;
    private final byte[] buf;
    private int bufPos;
    private final ChaCha7539Engine chacha20;
    private long dataCount;
    private byte[] initialAAD;
    private final byte[] key;
    private final byte[] mac;
    private final byte[] nonce;
    private final Mac poly1305;
    private int state;

    public static final class State {
        static final int DEC_AAD = 6;
        static final int DEC_DATA = 7;
        static final int DEC_FINAL = 8;
        static final int DEC_INIT = 5;
        static final int ENC_AAD = 2;
        static final int ENC_DATA = 3;
        static final int ENC_FINAL = 4;
        static final int ENC_INIT = 1;
        static final int UNINITIALIZED = 0;

        private State() {
        }
    }

    public ChaCha20Poly1305(Mac mac) {
        this.key = new byte[32];
        this.nonce = new byte[12];
        this.buf = new byte[80];
        this.mac = new byte[16];
        this.state = 0;
        if (mac == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'poly1305' cannot be null");
            throw null;
        }
        if (16 != mac.getMacSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("'poly1305' must be a 128-bit MAC");
            throw null;
        }
        this.chacha20 = new ChaCha7539Engine();
        this.poly1305 = mac;
    }

    private void checkAAD() {
        int i = this.state;
        if (i == 1) {
            this.state = 2;
            return;
        }
        if (i != 2) {
            if (i == 4) {
                a$$ExternalSyntheticBUOutline0.m$1("ChaCha20Poly1305 cannot be reused for encryption");
            } else if (i == 5) {
                this.state = 6;
            } else {
                if (i == 6) {
                    return;
                }
                Path$$ExternalSyntheticBUOutline0.m();
            }
        }
    }

    private void checkData() {
        switch (this.state) {
            case 1:
            case 2:
                finishAAD(3);
                break;
            case 3:
            case 7:
                break;
            case 4:
                a$$ExternalSyntheticBUOutline0.m$1("ChaCha20Poly1305 cannot be reused for encryption");
                break;
            case 5:
            case 6:
                finishAAD(7);
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m();
                break;
        }
    }

    private void finishAAD(int i) {
        padMAC(this.aadCount);
        this.state = i;
    }

    private void finishData(int i) {
        padMAC(this.dataCount);
        byte[] bArr = new byte[16];
        Pack.longToLittleEndian(this.aadCount, bArr, 0);
        Pack.longToLittleEndian(this.dataCount, bArr, 8);
        this.poly1305.update(bArr, 0, 16);
        this.poly1305.doFinal(this.mac, 0);
        this.state = i;
    }

    private long incrementCount(long j, int i, long j2) {
        long j3 = i;
        if (j - Long.MIN_VALUE <= (j2 - j3) - Long.MIN_VALUE) {
            return j + j3;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Limit exceeded");
        return 0L;
    }

    private void initMAC() {
        byte[] bArr = new byte[64];
        try {
            this.chacha20.processBytes(bArr, 0, 64, bArr, 0);
            this.poly1305.init(new KeyParameter(bArr, 0, 32));
        } finally {
            Arrays.clear(bArr);
        }
    }

    private void padMAC(long j) {
        int i = ((int) j) & 15;
        if (i != 0) {
            this.poly1305.update(ZEROES, 0, 16 - i);
        }
    }

    private void processData(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 > bArr2.length - i2) {
            f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
        } else {
            this.chacha20.processBytes(bArr, i, i2, bArr2, i3);
            this.dataCount = incrementCount(this.dataCount, i2, DATA_LIMIT);
        }
    }

    private void reset(boolean z, boolean z2) {
        Arrays.clear(this.buf);
        if (z) {
            Arrays.clear(this.mac);
        }
        this.aadCount = 0L;
        this.dataCount = 0L;
        this.bufPos = 0;
        switch (this.state) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.state = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.state = 5;
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m();
                return;
        }
        if (z2) {
            this.chacha20.reset();
        }
        initMAC();
        byte[] bArr = this.initialAAD;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) {
        int i2;
        int i3;
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'out' cannot be null");
            return 0;
        }
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("'outOff' cannot be negative");
            return 0;
        }
        checkData();
        Arrays.clear(this.mac);
        int i4 = this.state;
        if (i4 == 3) {
            int i5 = this.bufPos;
            int i6 = i5 + 16;
            if (i > bArr.length - i6) {
                f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
                return 0;
            }
            if (i5 > 0) {
                processData(this.buf, 0, i5, bArr, i);
                this.poly1305.update(bArr, i, this.bufPos);
            }
            finishData(4);
            System.arraycopy(this.mac, 0, bArr, this.bufPos + i, 16);
            i2 = i6;
        } else {
            if (i4 != 7) {
                Path$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            int i7 = this.bufPos;
            if (i7 < 16) {
                f$$ExternalSyntheticLambda0.m$2("data too short");
                return 0;
            }
            int i8 = i7 - 16;
            if (i > bArr.length - i8) {
                f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
                return 0;
            }
            if (i8 > 0) {
                this.poly1305.update(this.buf, 0, i8);
                i3 = i8;
                processData(this.buf, 0, i3, bArr, i);
            } else {
                i3 = i8;
            }
            finishData(8);
            if (!Arrays.constantTimeAreEqual(16, this.mac, 0, this.buf, i3)) {
                f$$ExternalSyntheticLambda0.m$2("mac check in ChaCha20Poly1305 failed");
                return 0;
            }
            i2 = i3;
        }
        reset(false, true);
        return i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int max = Math.max(0, i) + this.bufPos;
        int i2 = this.state;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return max + 16;
        }
        if (i2 == 5 || i2 == 6 || i2 == 7) {
            return Math.max(0, max - 16);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int max = Math.max(0, i) + this.bufPos;
        int i2 = this.state;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 5 && i2 != 6 && i2 != 7) {
                Path$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            max = Math.max(0, max - 16);
        }
        return max - (max % 64);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        ParametersWithIV parametersWithIV;
        KeyParameter keyParameter;
        byte[] iv;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            int macSize = aEADParameters.getMacSize();
            if (128 != macSize) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(macSize, "Invalid value for MAC size: "));
                return;
            }
            keyParameter = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            parametersWithIV = new ParametersWithIV(keyParameter, iv);
            this.initialAAD = aEADParameters.getAssociatedText();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                a$$ExternalSyntheticBUOutline0.m$3("invalid parameters passed to ChaCha20Poly1305");
                return;
            }
            parametersWithIV = (ParametersWithIV) cipherParameters;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
            iv = parametersWithIV.getIV();
            this.initialAAD = null;
        }
        if (keyParameter == null) {
            if (this.state == 0) {
                a$$ExternalSyntheticBUOutline0.m$3("Key must be specified in initial init");
                return;
            }
        } else if (32 != keyParameter.getKeyLength()) {
            a$$ExternalSyntheticBUOutline0.m$3("Key must be 256 bits");
            return;
        }
        if (iv == null || 12 != iv.length) {
            a$$ExternalSyntheticBUOutline0.m$3("Nonce must be 96 bits");
            return;
        }
        if (this.state != 0 && z && Arrays.areEqual(this.nonce, iv) && (keyParameter == null || Arrays.areEqual(this.key, keyParameter.getKey()))) {
            a$$ExternalSyntheticBUOutline0.m$3("cannot reuse nonce for ChaCha20Poly1305 encryption");
            return;
        }
        if (keyParameter != null) {
            keyParameter.copyTo(this.key, 0, 32);
        }
        System.arraycopy(iv, 0, this.nonce, 0, 12);
        this.chacha20.init(true, parametersWithIV);
        this.state = z ? 1 : 5;
        reset(true, false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        checkAAD();
        this.aadCount = incrementCount(this.aadCount, 1, -1L);
        this.poly1305.update(b);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'in' cannot be null");
            return;
        }
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("'inOff' cannot be negative");
            return;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("'len' cannot be negative");
            return;
        }
        if (i > bArr.length - i2) {
            f$$ExternalSyntheticLambda0.m$4("Input buffer too short");
            return;
        }
        checkAAD();
        if (i2 > 0) {
            this.aadCount = incrementCount(this.aadCount, i2, -1L);
            this.poly1305.update(bArr, i, i2);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) {
        checkData();
        int i2 = this.state;
        if (i2 == 3) {
            byte[] bArr2 = this.buf;
            int i3 = this.bufPos;
            bArr2[i3] = b;
            int i4 = i3 + 1;
            this.bufPos = i4;
            if (i4 != 64) {
                return 0;
            }
            processData(bArr2, 0, 64, bArr, i);
            this.poly1305.update(bArr, i, 64);
            this.bufPos = 0;
            return 64;
        }
        if (i2 != 7) {
            Path$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        byte[] bArr3 = this.buf;
        int i5 = this.bufPos;
        bArr3[i5] = b;
        int i6 = i5 + 1;
        this.bufPos = i6;
        if (i6 != bArr3.length) {
            return 0;
        }
        this.poly1305.update(bArr3, 0, 64);
        processData(this.buf, 0, 64, bArr, i);
        byte[] bArr4 = this.buf;
        System.arraycopy(bArr4, 64, bArr4, 0, 16);
        this.bufPos = 16;
        return 64;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'in' cannot be null");
            return 0;
        }
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("'inOff' cannot be negative");
            return 0;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("'len' cannot be negative");
            return 0;
        }
        if (i > bArr.length - i2) {
            f$$ExternalSyntheticLambda0.m$4("Input buffer too short");
            return 0;
        }
        if (i3 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("'outOff' cannot be negative");
            return 0;
        }
        checkData();
        int i6 = this.state;
        if (i6 != 3) {
            if (i6 != 7) {
                Path$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte[] bArr3 = this.buf;
                int i9 = this.bufPos;
                bArr3[i9] = bArr[i + i8];
                int i10 = i9 + 1;
                this.bufPos = i10;
                if (i10 == bArr3.length) {
                    this.poly1305.update(bArr3, 0, 64);
                    processData(this.buf, 0, 64, bArr2, i3 + i7);
                    byte[] bArr4 = this.buf;
                    System.arraycopy(bArr4, 64, bArr4, 0, 16);
                    this.bufPos = 16;
                    i7 += 64;
                }
            }
            return i7;
        }
        if (this.bufPos != 0) {
            while (i2 > 0) {
                i2--;
                byte[] bArr5 = this.buf;
                int i11 = this.bufPos;
                int i12 = i + 1;
                bArr5[i11] = bArr[i];
                int i13 = i11 + 1;
                this.bufPos = i13;
                if (i13 == 64) {
                    processData(bArr5, 0, 64, bArr2, i3);
                    this.poly1305.update(bArr2, i3, 64);
                    this.bufPos = 0;
                    i5 = 64;
                    i4 = i12;
                    break;
                }
                i = i12;
            }
        }
        i4 = i;
        i5 = 0;
        while (i2 >= 64) {
            int i14 = i3 + i5;
            processData(bArr, i4, 64, bArr2, i14);
            this.poly1305.update(bArr2, i14, 64);
            i4 += 64;
            i2 -= 64;
            i5 += 64;
        }
        if (i2 > 0) {
            System.arraycopy(bArr, i4, this.buf, 0, i2);
            this.bufPos = i2;
        }
        return i5;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true, true);
    }

    public ChaCha20Poly1305() {
        this(new Poly1305());
    }
}
