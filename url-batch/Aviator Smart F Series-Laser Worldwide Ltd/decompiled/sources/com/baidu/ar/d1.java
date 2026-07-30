package com.baidu.ar;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2008a = {a4.a.I0, 66, 67, a4.a.L0, a4.a.M0, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, a4.a.N0, a4.a.O0, a4.a.P0, a4.a.Q0, 85, 86, a4.a.R0, 88, a4.a.S0, a4.a.T0, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1, a4.a.f27d1, a4.a.f31e1, a4.a.f35f1, a4.a.f39g1, a4.a.f43h1, a4.a.f47i1, a4.a.f51j1, a4.a.f55k1, a4.a.f59l1, 112, a4.a.f63m1, a4.a.f67n1, a4.a.f70o1, a4.a.f73p1, a4.a.f76q1, 118, a4.a.f79r1, a4.a.f82s1, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2009b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, a4.a.G0, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, a4.a.C0, a4.a.D0, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, a4.a.f50j0, 39, a4.a.f58l0, 41, a4.a.f66n0, 43, a4.a.f72p0, 45, a4.a.f78r0, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f2010c = {a4.a.I0, 66, 67, a4.a.L0, a4.a.M0, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, a4.a.N0, a4.a.O0, a4.a.P0, a4.a.Q0, 85, 86, a4.a.R0, 88, a4.a.S0, a4.a.T0, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1, a4.a.f27d1, a4.a.f31e1, a4.a.f35f1, a4.a.f39g1, a4.a.f43h1, a4.a.f47i1, a4.a.f51j1, a4.a.f55k1, a4.a.f59l1, 112, a4.a.f63m1, a4.a.f67n1, a4.a.f70o1, a4.a.f73p1, a4.a.f76q1, 118, a4.a.f79r1, a4.a.f82s1, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f2011d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, a4.a.G0, -9, -9, 52, 53, 54, 55, 56, 57, a4.a.C0, a4.a.D0, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, a4.a.f50j0, 39, a4.a.f58l0, 41, a4.a.f66n0, 43, a4.a.f72p0, 45, a4.a.f78r0, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2012e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, a4.a.I0, 66, 67, a4.a.L0, a4.a.M0, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, a4.a.N0, a4.a.O0, a4.a.P0, a4.a.Q0, 85, 86, a4.a.R0, 88, a4.a.S0, a4.a.T0, 95, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1, a4.a.f27d1, a4.a.f31e1, a4.a.f35f1, a4.a.f39g1, a4.a.f43h1, a4.a.f47i1, a4.a.f51j1, a4.a.f55k1, a4.a.f59l1, 112, a4.a.f63m1, a4.a.f67n1, a4.a.f70o1, a4.a.f73p1, a4.a.f76q1, 118, a4.a.f79r1, a4.a.f82s1, 121, 122};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f2013f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, a4.a.f50j0, 39, a4.a.f58l0, 41, a4.a.f66n0, 43, a4.a.f72p0, 45, a4.a.f78r0, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, a4.a.C0, a4.a.D0, 60, 61, a4.a.G0, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ boolean f2014g = true;

    public static class a extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2015a;

        /* renamed from: b, reason: collision with root package name */
        public int f2016b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f2017c;

        /* renamed from: d, reason: collision with root package name */
        public int f2018d;

        /* renamed from: e, reason: collision with root package name */
        public int f2019e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2020f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f2021g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2022h;

        /* renamed from: i, reason: collision with root package name */
        public int f2023i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f2024j;

        public a(OutputStream outputStream, int i8) {
            super(outputStream);
            this.f2020f = (i8 & 8) != 0;
            boolean z7 = (i8 & 1) != 0;
            this.f2015a = z7;
            int i9 = z7 ? 3 : 4;
            this.f2018d = i9;
            this.f2017c = new byte[i9];
            this.f2016b = 0;
            this.f2019e = 0;
            this.f2022h = false;
            this.f2021g = new byte[4];
            this.f2023i = i8;
            this.f2024j = d1.c(i8);
        }

        public void a() {
            int i8 = this.f2016b;
            if (i8 > 0) {
                if (!this.f2015a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(d1.b(this.f2021g, this.f2017c, i8, this.f2023i));
                this.f2016b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a();
            super.close();
            this.f2017c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i8) {
            if (this.f2022h) {
                ((FilterOutputStream) this).out.write(i8);
                return;
            }
            if (this.f2015a) {
                byte[] bArr = this.f2017c;
                int i9 = this.f2016b;
                int i10 = i9 + 1;
                this.f2016b = i10;
                bArr[i9] = (byte) i8;
                int i11 = this.f2018d;
                if (i10 < i11) {
                    return;
                }
                ((FilterOutputStream) this).out.write(d1.b(this.f2021g, bArr, i11, this.f2023i));
                int i12 = this.f2019e + 4;
                this.f2019e = i12;
                if (this.f2020f && i12 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f2019e = 0;
                }
            } else {
                byte b8 = this.f2024j[i8 & 127];
                if (b8 <= -5) {
                    if (b8 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr2 = this.f2017c;
                int i13 = this.f2016b;
                int i14 = i13 + 1;
                this.f2016b = i14;
                bArr2[i13] = (byte) i8;
                if (i14 < this.f2018d) {
                    return;
                }
                ((FilterOutputStream) this).out.write(this.f2021g, 0, d1.b(bArr2, 0, this.f2021g, 0, this.f2023i));
            }
            this.f2016b = 0;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) {
            if (this.f2022h) {
                ((FilterOutputStream) this).out.write(bArr, i8, i9);
                return;
            }
            for (int i10 = 0; i10 < i9; i10++) {
                write(bArr[i8 + i10]);
            }
        }
    }

    public static int b(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        int i11;
        int i12;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (i8 < 0 || (i11 = i8 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i8)));
        }
        if (i9 < 0 || (i12 = i9 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i9)));
        }
        byte[] c8 = c(i10);
        byte b8 = bArr[i8 + 2];
        if (b8 == 61) {
            bArr2[i9] = (byte) ((((c8[bArr[i8 + 1]] & 255) << 12) | ((c8[bArr[i8]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b9 = bArr[i11];
        if (b9 == 61) {
            int i13 = ((c8[bArr[i8 + 1]] & 255) << 12) | ((c8[bArr[i8]] & 255) << 18) | ((c8[b8] & 255) << 6);
            bArr2[i9] = (byte) (i13 >>> 16);
            bArr2[i9 + 1] = (byte) (i13 >>> 8);
            return 2;
        }
        int i14 = ((c8[bArr[i8 + 1]] & 255) << 12) | ((c8[bArr[i8]] & 255) << 18) | ((c8[b8] & 255) << 6) | (c8[b9] & 255);
        bArr2[i9] = (byte) (i14 >> 16);
        bArr2[i9 + 1] = (byte) (i14 >> 8);
        bArr2[i12] = (byte) i14;
        return 3;
    }

    public static final byte[] c(int i8) {
        return (i8 & 16) == 16 ? f2011d : (i8 & 32) == 32 ? f2013f : f2009b;
    }

    public static String a(byte[] bArr) {
        String str;
        try {
            str = a(bArr, 0, bArr.length, 0);
        } catch (IOException e8) {
            if (!f2014g) {
                throw new AssertionError(e8.getMessage());
            }
            str = null;
        }
        if (f2014g || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    public static final byte[] b(int i8) {
        return (i8 & 16) == 16 ? f2010c : (i8 & 32) == 32 ? f2012e : f2008a;
    }

    public static String a(byte[] bArr, int i8, int i9, int i10) {
        byte[] b8 = b(bArr, i8, i9, i10);
        try {
            return new String(b8, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(b8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public static byte[] b(byte[] bArr, int i8, int i9, int i10) {
        a aVar;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i8);
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i9);
        }
        int i11 = i8 + i9;
        ?? length = bArr.length;
        if (i11 > length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(bArr.length)));
        }
        if ((i10 & 2) == 0) {
            boolean z7 = (i10 & 8) != 0;
            int i12 = ((i9 / 3) * 4) + (i9 % 3 > 0 ? 4 : 0);
            if (z7) {
                i12 += i12 / 76;
            }
            int i13 = i12;
            byte[] bArr2 = new byte[i13];
            int i14 = i9 - 2;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i15 < i14) {
                int i18 = i15;
                a(bArr, i15 + i8, 3, bArr2, i16, i10);
                int i19 = i17 + 4;
                if (!z7 || i19 < 76) {
                    i17 = i19;
                } else {
                    bArr2[i16 + 4] = 10;
                    i16++;
                    i17 = 0;
                }
                i15 = i18 + 3;
                i16 += 4;
            }
            int i20 = i15;
            if (i20 < i9) {
                a(bArr, i20 + i8, i9 - i20, bArr2, i16, i10);
                i16 += 4;
            }
            int i21 = i16;
            if (i21 > i13 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i21];
            System.arraycopy(bArr2, 0, bArr3, 0, i21);
            return bArr3;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                length = new ByteArrayOutputStream();
                try {
                    aVar = new a(length, i10 | 1);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(aVar);
                    } catch (IOException e8) {
                        throw e8;
                    }
                } catch (IOException e9) {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    aVar = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable th3) {
            th = th3;
            length = 0;
            aVar = null;
        }
        try {
            gZIPOutputStream.write(bArr, i8, i9);
            gZIPOutputStream.close();
            try {
                gZIPOutputStream.close();
            } catch (Exception unused) {
            }
            try {
                aVar.close();
            } catch (Exception unused2) {
            }
            try {
                length.close();
            } catch (Exception unused3) {
            }
            return length.toByteArray();
        } catch (IOException e11) {
            throw e11;
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (Exception unused4) {
                }
            }
            if (aVar != null) {
                try {
                    aVar.close();
                } catch (Exception unused5) {
                }
            }
            if (length == 0) {
                throw th;
            }
            try {
                length.close();
                throw th;
            } catch (Exception unused6) {
                throw th;
            }
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, int i8, int i9) {
        a(bArr2, 0, i8, bArr, 0, i9);
        return bArr;
    }

    public static byte[] a(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        byte[] b8 = b(i11);
        int i12 = (i9 > 0 ? (bArr[i8] << 24) >>> 8 : 0) | (i9 > 1 ? (bArr[i8 + 1] << 24) >>> 16 : 0) | (i9 > 2 ? (bArr[i8 + 2] << 24) >>> 24 : 0);
        if (i9 == 1) {
            bArr2[i10] = b8[i12 >>> 18];
            bArr2[i10 + 1] = b8[(i12 >>> 12) & 63];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
            return bArr2;
        }
        if (i9 == 2) {
            bArr2[i10] = b8[i12 >>> 18];
            bArr2[i10 + 1] = b8[(i12 >>> 12) & 63];
            bArr2[i10 + 2] = b8[(i12 >>> 6) & 63];
            bArr2[i10 + 3] = 61;
            return bArr2;
        }
        if (i9 != 3) {
            return bArr2;
        }
        bArr2[i10] = b8[i12 >>> 18];
        bArr2[i10 + 1] = b8[(i12 >>> 12) & 63];
        bArr2[i10 + 2] = b8[(i12 >>> 6) & 63];
        bArr2[i10 + 3] = b8[i12 & 63];
        return bArr2;
    }
}
