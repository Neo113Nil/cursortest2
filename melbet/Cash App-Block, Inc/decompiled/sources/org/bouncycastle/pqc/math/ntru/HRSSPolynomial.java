package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* loaded from: classes10.dex */
public class HRSSPolynomial extends Polynomial {
    public HRSSPolynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        short[] sArr;
        int length = this.coeffs.length;
        Polynomial createPolynomial = this.params.createPolynomial();
        short s = (short) (3 - (length % 3));
        short[] sArr2 = createPolynomial.coeffs;
        short[] sArr3 = polynomial.coeffs;
        int i = 0;
        int i2 = 2 - s;
        int i3 = sArr3[0] * i2;
        short s2 = sArr3[1];
        short s3 = sArr3[2];
        sArr2[0] = (short) ((s3 * s) + i3);
        sArr2[1] = (short) (s2 * i2);
        sArr2[2] = (short) (s3 * i2);
        int i4 = 3;
        short s4 = 0;
        while (true) {
            sArr = createPolynomial.coeffs;
            if (i4 >= length) {
                break;
            }
            short s5 = sArr[0];
            short[] sArr4 = polynomial.coeffs;
            sArr[0] = (short) ((((s * 2) + s4) * sArr4[i4]) + s5);
            int i5 = s4 + s;
            sArr[1] = (short) ((sArr4[i4] * i5) + sArr[1]);
            sArr[2] = (short) ((sArr4[i4] * s4) + sArr[2]);
            s4 = (short) (i5 % 3);
            i4++;
        }
        short s6 = sArr[1];
        short[] sArr5 = polynomial.coeffs;
        short s7 = sArr5[0];
        int i6 = s + s4;
        sArr[1] = (short) ((s7 * i6) + s6);
        short s8 = (short) ((s7 * s4) + sArr[2]);
        sArr[2] = s8;
        sArr[2] = (short) ((sArr5[1] * i6) + s8);
        for (int i7 = 3; i7 < length; i7++) {
            short[] sArr6 = createPolynomial.coeffs;
            short s9 = sArr6[i7 - 3];
            short[] sArr7 = polynomial.coeffs;
            sArr6[i7] = (short) (((sArr7[i7] + sArr7[i7 - 1] + sArr7[i7 - 2]) * 2) + s9);
        }
        createPolynomial.mod3PhiN();
        createPolynomial.z3ToZq();
        this.coeffs[0] = (short) (-createPolynomial.coeffs[0]);
        while (i < length - 1) {
            short[] sArr8 = this.coeffs;
            int i8 = i + 1;
            short[] sArr9 = createPolynomial.coeffs;
            sArr8[i8] = (short) (sArr9[i] - sArr9[i8]);
            i = i8;
        }
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i = 0;
        while (i < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i2 = i * 8;
            int i3 = i * 13;
            int i4 = bArr[i3] & 255;
            byte b = bArr[i3 + 1];
            sArr[i2] = (short) (i4 | ((((short) (b & 255)) & 31) << 8));
            int i5 = ((b & 255) >>> 5) | (((short) (bArr[i3 + 2] & 255)) << 3);
            byte b2 = bArr[i3 + 3];
            sArr[i2 + 1] = (short) (i5 | ((((short) (b2 & 255)) & 3) << 11));
            int i6 = (b2 & 255) >>> 2;
            byte b3 = bArr[i3 + 4];
            sArr[i2 + 2] = (short) (i6 | ((((short) (b3 & 255)) & 127) << 6));
            int i7 = ((b3 & 255) >>> 7) | (((short) (bArr[i3 + 5] & 255)) << 1);
            byte b4 = bArr[i3 + 6];
            sArr[i2 + 3] = (short) (i7 | ((((short) (b4 & 255)) & 15) << 9));
            int i8 = (((short) (bArr[i3 + 7] & 255)) << 4) | ((b4 & 255) >>> 4);
            byte b5 = bArr[i3 + 8];
            sArr[i2 + 4] = (short) (i8 | ((((short) (b5 & 255)) & 1) << 12));
            int i9 = (b5 & 255) >>> 1;
            byte b6 = bArr[i3 + 9];
            sArr[i2 + 5] = (short) (i9 | ((((short) (b6 & 255)) & 63) << 7));
            int i10 = (((short) (bArr[i3 + 10] & 255)) << 2) | ((b6 & 255) >>> 6);
            byte b7 = bArr[i3 + 11];
            sArr[i2 + 6] = (short) (i10 | ((((short) (b7 & 255)) & 7) << 10));
            sArr[i2 + 7] = (short) (((b7 & 255) >>> 3) | (((short) (bArr[i3 + 12] & 255)) << 5));
            i++;
        }
        int packDegree = this.params.packDegree() & 7;
        if (packDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i11 = i * 8;
            int i12 = i * 13;
            int i13 = bArr[i12] & 255;
            byte b8 = bArr[i12 + 1];
            sArr2[i11] = (short) (i13 | ((((short) (b8 & 255)) & 31) << 8));
            sArr2[i11 + 1] = (short) (((((short) (bArr[i12 + 3] & 255)) & 3) << 11) | ((b8 & 255) >>> 5) | (((short) (bArr[i12 + 2] & 255)) << 3));
        } else if (packDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i14 = i * 8;
            int i15 = i * 13;
            int i16 = bArr[i15] & 255;
            byte b9 = bArr[i15 + 1];
            sArr3[i14] = (short) (i16 | ((((short) (b9 & 255)) & 31) << 8));
            int i17 = ((b9 & 255) >>> 5) | (((short) (bArr[i15 + 2] & 255)) << 3);
            byte b10 = bArr[i15 + 3];
            sArr3[i14 + 1] = (short) (i17 | ((((short) (b10 & 255)) & 3) << 11));
            byte b11 = bArr[i15 + 4];
            sArr3[i14 + 2] = (short) (((b10 & 255) >>> 2) | ((((short) (b11 & 255)) & 127) << 6));
            sArr3[i14 + 3] = (short) (((((short) (bArr[i15 + 6] & 255)) & 15) << 9) | ((b11 & 255) >>> 7) | (((short) (bArr[i15 + 5] & 255)) << 1));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i) {
        byte[] bArr = new byte[i];
        short[] sArr = new short[8];
        int i2 = 0;
        while (i2 < this.params.packDegree() / 8) {
            for (int i3 = 0; i3 < 8; i3++) {
                sArr[i3] = (short) Polynomial.modQ(this.coeffs[(i2 * 8) + i3] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i4 = i2 * 13;
            short s = sArr[0];
            bArr[i4] = (byte) (s & 255);
            short s2 = sArr[1];
            bArr[i4 + 1] = (byte) ((s >>> 8) | ((s2 & 7) << 5));
            bArr[i4 + 2] = (byte) ((s2 >>> 3) & 255);
            int i5 = s2 >>> 11;
            short s3 = sArr[2];
            bArr[i4 + 3] = (byte) (i5 | ((s3 & 63) << 2));
            short s4 = sArr[3];
            bArr[i4 + 4] = (byte) ((s3 >>> 6) | ((s4 & 1) << 7));
            bArr[i4 + 5] = (byte) ((s4 >>> 1) & 255);
            int i6 = s4 >>> 9;
            short s5 = sArr[4];
            bArr[i4 + 6] = (byte) (i6 | ((s5 & 15) << 4));
            bArr[i4 + 7] = (byte) ((s5 >>> 4) & 255);
            short s6 = sArr[5];
            bArr[i4 + 8] = (byte) ((s5 >>> 12) | ((s6 & 127) << 1));
            int i7 = s6 >>> 7;
            short s7 = sArr[6];
            bArr[i4 + 9] = (byte) (i7 | ((s7 & 3) << 6));
            bArr[i4 + 10] = (byte) ((s7 >>> 2) & 255);
            short s8 = sArr[7];
            bArr[i4 + 11] = (byte) ((s7 >>> 10) | ((s8 & 31) << 3));
            bArr[i4 + 12] = (byte) (s8 >>> 5);
            i2++;
        }
        int i8 = 0;
        while (true) {
            int i9 = i2 * 8;
            if (i8 >= this.params.packDegree() - i9) {
                break;
            }
            sArr[i8] = (short) Polynomial.modQ(this.coeffs[i9 + i8] & HPKE.aead_EXPORT_ONLY, this.params.q());
            i8++;
        }
        while (i8 < 8) {
            sArr[i8] = 0;
            i8++;
        }
        int packDegree = this.params.packDegree() - ((this.params.packDegree() / 8) * 8);
        if (packDegree != 2) {
            if (packDegree != 4) {
                return bArr;
            }
            int i10 = i2 * 13;
            short s9 = sArr[0];
            bArr[i10] = (byte) (s9 & 255);
            short s10 = sArr[1];
            bArr[i10 + 1] = (byte) ((s9 >>> 8) | ((s10 & 7) << 5));
            bArr[i10 + 2] = (byte) ((s10 >>> 3) & 255);
            int i11 = s10 >>> 11;
            short s11 = sArr[2];
            bArr[i10 + 3] = (byte) (i11 | ((s11 & 63) << 2));
            int i12 = s11 >>> 6;
            short s12 = sArr[3];
            bArr[i10 + 4] = (byte) (i12 | ((s12 & 1) << 7));
            bArr[i10 + 5] = (byte) ((s12 >>> 1) & 255);
            bArr[i10 + 6] = (byte) ((s12 >>> 9) | ((sArr[4] & 15) << 4));
        }
        int i13 = i2 * 13;
        short s13 = sArr[0];
        bArr[i13] = (byte) (s13 & 255);
        short s14 = sArr[1];
        bArr[i13 + 1] = (byte) ((s13 >>> 8) | ((s14 & 7) << 5));
        bArr[i13 + 2] = (byte) ((s14 >>> 3) & 255);
        bArr[i13 + 3] = (byte) ((s14 >>> 11) | ((sArr[2] & 63) << 2));
        return bArr;
    }
}
