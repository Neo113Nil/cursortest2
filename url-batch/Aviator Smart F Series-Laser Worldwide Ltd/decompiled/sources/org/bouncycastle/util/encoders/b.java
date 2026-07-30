package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class b implements c {
    protected final byte[] encodingTable = {a4.a.I0, 66, 67, a4.a.L0, a4.a.M0, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, a4.a.N0, a4.a.O0, a4.a.P0, a4.a.Q0, 85, 86, a4.a.R0, 88, a4.a.S0, a4.a.T0, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1, a4.a.f27d1, a4.a.f31e1, a4.a.f35f1, a4.a.f39g1, a4.a.f43h1, a4.a.f47i1, a4.a.f51j1, a4.a.f55k1, a4.a.f59l1, 112, a4.a.f63m1, a4.a.f67n1, a4.a.f70o1, a4.a.f73p1, a4.a.f76q1, 118, a4.a.f79r1, a4.a.f82s1, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = 61;
    protected final byte[] decodingTable = new byte[128];

    public b() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c8, char c9, char c10, char c11) {
        char c12 = this.padding;
        if (c10 == c12) {
            if (c11 != c12) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.decodingTable;
            byte b8 = bArr[c8];
            byte b9 = bArr[c9];
            if ((b8 | b9) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b8 << 2) | (b9 >> 4));
            return 1;
        }
        if (c11 == c12) {
            byte[] bArr2 = this.decodingTable;
            byte b10 = bArr2[c8];
            byte b11 = bArr2[c9];
            byte b12 = bArr2[c10];
            if ((b10 | b11 | b12) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b13 = bArr3[c8];
        byte b14 = bArr3[c9];
        byte b15 = bArr3[c10];
        byte b16 = bArr3[c11];
        if ((b13 | b14 | b15 | b16) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b13 << 2) | (b14 >> 4));
        outputStream.write((b14 << 4) | (b15 >> 2));
        outputStream.write((b15 << 6) | b16);
        return 3;
    }

    private boolean ignore(char c8) {
        return c8 == '\n' || c8 == '\r' || c8 == '\t' || c8 == ' ';
    }

    private int nextI(String str, int i8, int i9) {
        while (i8 < i9 && ignore(str.charAt(i8))) {
            i8++;
        }
        return i8;
    }

    @Override // org.bouncycastle.util.encoders.c
    public int decode(String str, OutputStream outputStream) {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i8 = length;
        int i9 = 0;
        while (i8 > 0 && i9 != 4) {
            if (!ignore(str.charAt(i8 - 1))) {
                i9++;
            }
            i8--;
        }
        int nextI = nextI(str, 0, i8);
        int i10 = 0;
        int i11 = 0;
        while (nextI < i8) {
            int i12 = nextI + 1;
            byte b8 = this.decodingTable[str.charAt(nextI)];
            int nextI2 = nextI(str, i12, i8);
            int i13 = nextI2 + 1;
            byte b9 = this.decodingTable[str.charAt(nextI2)];
            int nextI3 = nextI(str, i13, i8);
            int i14 = nextI3 + 1;
            byte b10 = this.decodingTable[str.charAt(nextI3)];
            int nextI4 = nextI(str, i14, i8);
            int i15 = nextI4 + 1;
            byte b11 = this.decodingTable[str.charAt(nextI4)];
            if ((b8 | b9 | b10 | b11) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i10] = (byte) ((b8 << 2) | (b9 >> 4));
            int i16 = i10 + 2;
            bArr[i10 + 1] = (byte) ((b9 << 4) | (b10 >> 2));
            i10 += 3;
            bArr[i16] = (byte) ((b10 << 6) | b11);
            i11 += 3;
            if (i10 == 54) {
                outputStream.write(bArr);
                i10 = 0;
            }
            nextI = nextI(str, i15, i8);
        }
        if (i10 > 0) {
            outputStream.write(bArr, 0, i10);
        }
        int nextI5 = nextI(str, nextI, length);
        int nextI6 = nextI(str, nextI5 + 1, length);
        int nextI7 = nextI(str, nextI6 + 1, length);
        return i11 + decodeLastBlock(outputStream, str.charAt(nextI5), str.charAt(nextI6), str.charAt(nextI7), str.charAt(nextI(str, nextI7 + 1, length)));
    }

    @Override // org.bouncycastle.util.encoders.c
    public int encode(byte[] bArr, int i8, int i9, OutputStream outputStream) {
        byte[] bArr2 = new byte[72];
        while (i9 > 0) {
            int min = Math.min(54, i9);
            outputStream.write(bArr2, 0, encode(bArr, i8, min, bArr2, 0));
            i8 += min;
            i9 -= min;
        }
        return ((i9 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.c
    public int getEncodedLength(int i8) {
        return ((i8 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.c
    public int getMaxDecodedLength(int i8) {
        return (i8 / 4) * 3;
    }

    protected void initialiseDecodingTable() {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = -1;
            i9++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i8 >= bArr2.length) {
                return;
            }
            this.decodingTable[bArr2[i8]] = (byte) i8;
            i8++;
        }
    }

    private int nextI(byte[] bArr, int i8, int i9) {
        while (i8 < i9 && ignore((char) bArr[i8])) {
            i8++;
        }
        return i8;
    }

    @Override // org.bouncycastle.util.encoders.c
    public int decode(byte[] bArr, int i8, int i9, OutputStream outputStream) {
        byte[] bArr2 = new byte[54];
        int i10 = i8 + i9;
        while (i10 > i8 && ignore((char) bArr[i10 - 1])) {
            i10--;
        }
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10;
        int i12 = 0;
        while (i11 > i8 && i12 != 4) {
            if (!ignore((char) bArr[i11 - 1])) {
                i12++;
            }
            i11--;
        }
        int nextI = nextI(bArr, i8, i11);
        int i13 = 0;
        int i14 = 0;
        while (nextI < i11) {
            int i15 = nextI + 1;
            byte b8 = this.decodingTable[bArr[nextI]];
            int nextI2 = nextI(bArr, i15, i11);
            int i16 = nextI2 + 1;
            byte b9 = this.decodingTable[bArr[nextI2]];
            int nextI3 = nextI(bArr, i16, i11);
            int i17 = nextI3 + 1;
            byte b10 = this.decodingTable[bArr[nextI3]];
            int nextI4 = nextI(bArr, i17, i11);
            int i18 = nextI4 + 1;
            byte b11 = this.decodingTable[bArr[nextI4]];
            if ((b8 | b9 | b10 | b11) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr2[i13] = (byte) ((b8 << 2) | (b9 >> 4));
            int i19 = i13 + 2;
            bArr2[i13 + 1] = (byte) ((b9 << 4) | (b10 >> 2));
            i13 += 3;
            bArr2[i19] = (byte) ((b10 << 6) | b11);
            if (i13 == 54) {
                outputStream.write(bArr2);
                i13 = 0;
            }
            i14 += 3;
            nextI = nextI(bArr, i18, i11);
        }
        if (i13 > 0) {
            outputStream.write(bArr2, 0, i13);
        }
        int nextI5 = nextI(bArr, nextI, i10);
        int nextI6 = nextI(bArr, nextI5 + 1, i10);
        int nextI7 = nextI(bArr, nextI6 + 1, i10);
        return i14 + decodeLastBlock(outputStream, (char) bArr[nextI5], (char) bArr[nextI6], (char) bArr[nextI7], (char) bArr[nextI(bArr, nextI7 + 1, i10)]);
    }

    public int encode(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11 = (i8 + i9) - 2;
        int i12 = i8;
        int i13 = i10;
        while (i12 < i11) {
            byte b8 = bArr[i12];
            int i14 = i12 + 2;
            int i15 = bArr[i12 + 1] & 255;
            i12 += 3;
            byte b9 = bArr[i14];
            byte[] bArr3 = this.encodingTable;
            bArr2[i13] = bArr3[(b8 >>> 2) & 63];
            bArr2[i13 + 1] = bArr3[((b8 << 4) | (i15 >>> 4)) & 63];
            int i16 = i13 + 3;
            bArr2[i13 + 2] = bArr3[((i15 << 2) | ((b9 & 255) >>> 6)) & 63];
            i13 += 4;
            bArr2[i16] = bArr3[b9 & 63];
        }
        int i17 = i9 - (i12 - i8);
        if (i17 == 1) {
            int i18 = bArr[i12] & 255;
            byte[] bArr4 = this.encodingTable;
            bArr2[i13] = bArr4[(i18 >>> 2) & 63];
            bArr2[i13 + 1] = bArr4[(i18 << 4) & 63];
            int i19 = i13 + 3;
            byte b10 = this.padding;
            bArr2[i13 + 2] = b10;
            i13 += 4;
            bArr2[i19] = b10;
        } else if (i17 == 2) {
            int i20 = i12 + 1;
            int i21 = bArr[i12] & 255;
            int i22 = bArr[i20] & 255;
            byte[] bArr5 = this.encodingTable;
            bArr2[i13] = bArr5[(i21 >>> 2) & 63];
            bArr2[i13 + 1] = bArr5[((i21 << 4) | (i22 >>> 4)) & 63];
            int i23 = i13 + 3;
            bArr2[i13 + 2] = bArr5[(i22 << 2) & 63];
            i13 += 4;
            bArr2[i23] = this.padding;
        }
        return i13 - i10;
    }
}
