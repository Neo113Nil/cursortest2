package org.bouncycastle.cert.selector;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
class MSOutlookKeyIdCalculator {

    public static class SHA1Digest extends GeneralDigest {
        private static final int DIGEST_LENGTH = 20;
        private static final int Y1 = 1518500249;
        private static final int Y2 = 1859775393;
        private static final int Y3 = -1894007588;
        private static final int Y4 = -899497514;
        private int H1;
        private int H2;
        private int H3;
        private int H4;
        private int H5;
        private int[] X = new int[80];
        private int xOff;

        public SHA1Digest() {
            reset();
        }

        private int f(int i, int i2, int i3) {
            return (i & i2) | ((~i) & i3);
        }

        private int g(int i, int i2, int i3) {
            return ((i2 | i3) & i) | (i2 & i3);
        }

        private int h(int i, int i2, int i3) {
            return (i ^ i2) ^ i3;
        }

        public int doFinal(byte[] bArr, int i) {
            finish();
            Pack.intToBigEndian(this.H1, bArr, i);
            Pack.intToBigEndian(this.H2, bArr, i + 4);
            Pack.intToBigEndian(this.H3, bArr, i + 8);
            Pack.intToBigEndian(this.H4, bArr, i + 12);
            Pack.intToBigEndian(this.H5, bArr, i + 16);
            reset();
            return 20;
        }

        public String getAlgorithmName() {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }

        public int getDigestSize() {
            return 20;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processBlock() {
            for (int i = 16; i < 80; i++) {
                int[] iArr = this.X;
                int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
                iArr[i] = (i2 >>> 31) | (i2 << 1);
            }
            int i3 = this.H1;
            int i4 = this.H2;
            int i5 = this.H3;
            int i6 = this.H4;
            int i7 = this.H5;
            int i8 = 0;
            for (int i9 = 0; i9 < 4; i9++) {
                int m$1 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((i3 << 5) | (i3 >>> 27)) + f(i4, i5, i6), this.X[i8], Y1, i7);
                int i10 = (i4 >>> 2) | (i4 << 30);
                int m$12 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$1 << 5) | (m$1 >>> 27)) + f(i3, i10, i5), this.X[i8 + 1], Y1, i6);
                int i11 = (i3 >>> 2) | (i3 << 30);
                int m$13 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$12 << 5) | (m$12 >>> 27)) + f(m$1, i11, i10), this.X[i8 + 2], Y1, i5);
                i7 = (m$1 >>> 2) | (m$1 << 30);
                int i12 = i8 + 4;
                i4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$13 << 5) | (m$13 >>> 27)) + f(m$12, i7, i11), this.X[i8 + 3], Y1, i10);
                i6 = (m$12 >>> 2) | (m$12 << 30);
                i8 += 5;
                i3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((i4 << 5) | (i4 >>> 27)) + f(m$13, i6, i7), this.X[i12], Y1, i11);
                i5 = (m$13 >>> 2) | (m$13 << 30);
            }
            for (int i13 = 0; i13 < 4; i13++) {
                int m$14 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((i3 << 5) | (i3 >>> 27)) + h(i4, i5, i6), this.X[i8], Y2, i7);
                int i14 = (i4 >>> 2) | (i4 << 30);
                int m$15 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$14 << 5) | (m$14 >>> 27)) + h(i3, i14, i5), this.X[i8 + 1], Y2, i6);
                int i15 = (i3 >>> 2) | (i3 << 30);
                int m$16 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$15 << 5) | (m$15 >>> 27)) + h(m$14, i15, i14), this.X[i8 + 2], Y2, i5);
                i7 = (m$14 >>> 2) | (m$14 << 30);
                int i16 = i8 + 4;
                i4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$16 << 5) | (m$16 >>> 27)) + h(m$15, i7, i15), this.X[i8 + 3], Y2, i14);
                i6 = (m$15 >>> 2) | (m$15 << 30);
                i8 += 5;
                i3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((i4 << 5) | (i4 >>> 27)) + h(m$16, i6, i7), this.X[i16], Y2, i15);
                i5 = (m$16 >>> 2) | (m$16 << 30);
            }
            for (int i17 = 0; i17 < 4; i17++) {
                int m$17 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((i3 << 5) | (i3 >>> 27)) + g(i4, i5, i6), this.X[i8], Y3, i7);
                int i18 = (i4 >>> 2) | (i4 << 30);
                int m$18 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$17 << 5) | (m$17 >>> 27)) + g(i3, i18, i5), this.X[i8 + 1], Y3, i6);
                int i19 = (i3 >>> 2) | (i3 << 30);
                int m$19 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$18 << 5) | (m$18 >>> 27)) + g(m$17, i19, i18), this.X[i8 + 2], Y3, i5);
                i7 = (m$17 >>> 2) | (m$17 << 30);
                int i20 = i8 + 4;
                i4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$19 << 5) | (m$19 >>> 27)) + g(m$18, i7, i19), this.X[i8 + 3], Y3, i18);
                i6 = (m$18 >>> 2) | (m$18 << 30);
                i8 += 5;
                i3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((i4 << 5) | (i4 >>> 27)) + g(m$19, i6, i7), this.X[i20], Y3, i19);
                i5 = (m$19 >>> 2) | (m$19 << 30);
            }
            for (int i21 = 0; i21 <= 3; i21++) {
                int m$110 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((i3 << 5) | (i3 >>> 27)) + h(i4, i5, i6), this.X[i8], Y4, i7);
                int i22 = (i4 >>> 2) | (i4 << 30);
                int m$111 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$110 << 5) | (m$110 >>> 27)) + h(i3, i22, i5), this.X[i8 + 1], Y4, i6);
                int i23 = (i3 >>> 2) | (i3 << 30);
                int m$112 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$111 << 5) | (m$111 >>> 27)) + h(m$110, i23, i22), this.X[i8 + 2], Y4, i5);
                i7 = (m$110 >>> 2) | (m$110 << 30);
                int i24 = i8 + 4;
                i4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((m$112 << 5) | (m$112 >>> 27)) + h(m$111, i7, i23), this.X[i8 + 3], Y4, i22);
                i6 = (m$111 >>> 2) | (m$111 << 30);
                i8 += 5;
                i3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(((i4 << 5) | (i4 >>> 27)) + h(m$112, i6, i7), this.X[i24], Y4, i23);
                i5 = (m$112 >>> 2) | (m$112 << 30);
            }
            this.H1 += i3;
            this.H2 += i4;
            this.H3 += i5;
            this.H4 += i6;
            this.H5 += i7;
            this.xOff = 0;
            for (int i25 = 0; i25 < 16; i25++) {
                this.X[i25] = 0;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processLength(long j) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) j;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processWord(byte[] bArr, int i) {
            int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            int[] iArr = this.X;
            int i3 = this.xOff;
            iArr[i3] = i2;
            int i4 = i3 + 1;
            this.xOff = i4;
            if (i4 == 16) {
                processBlock();
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void reset() {
            super.reset();
            this.H1 = 1732584193;
            this.H2 = -271733879;
            this.H3 = -1732584194;
            this.H4 = 271733878;
            this.H5 = -1009589776;
            this.xOff = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.X;
                if (i == iArr.length) {
                    return;
                }
                iArr[i] = 0;
                i++;
            }
        }
    }

    public static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded(ASN1Encoding.DER);
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        public GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        public void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        public void finish() {
            long j = this.byteCount << 3;
            byte b = Byte.MIN_VALUE;
            while (true) {
                update(b);
                if (this.xBufOff == 0) {
                    processLength(j);
                    processBlock();
                    return;
                }
                b = 0;
            }
        }

        public abstract void processBlock();

        public abstract void processLength(long j);

        public abstract void processWord(byte[] bArr, int i);

        public void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i >= bArr.length) {
                    return;
                }
                bArr[i] = 0;
                i++;
            }
        }

        public void update(byte[] bArr, int i, int i2) {
            while (this.xBufOff != 0 && i2 > 0) {
                update(bArr[i]);
                i++;
                i2--;
            }
            while (i2 > this.xBuf.length) {
                processWord(bArr, i);
                byte[] bArr2 = this.xBuf;
                i += bArr2.length;
                i2 -= bArr2.length;
                this.byteCount += bArr2.length;
            }
            while (i2 > 0) {
                update(bArr[i]);
                i++;
                i2--;
            }
        }

        public GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        public void update(byte b) {
            byte[] bArr = this.xBuf;
            int i = this.xBufOff;
            int i2 = i + 1;
            this.xBufOff = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }
    }
}
