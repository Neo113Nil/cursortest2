package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fo3 {
    static int a(byte[] bArr, int i7, eo3 eo3Var) {
        int j7 = j(bArr, i7, eo3Var);
        int i8 = eo3Var.f4686a;
        if (i8 < 0) {
            throw mq3.f();
        }
        if (i8 > bArr.length - j7) {
            throw mq3.j();
        }
        if (i8 == 0) {
            eo3Var.f4688c = uo3.f12885g;
            return j7;
        }
        eo3Var.f4688c = uo3.K(bArr, j7, i8);
        return j7 + i8;
    }

    static int b(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    static int c(es3 es3Var, byte[] bArr, int i7, int i8, int i9, eo3 eo3Var) {
        nr3 nr3Var = (nr3) es3Var;
        Object b7 = nr3Var.b();
        int I = nr3Var.I(b7, bArr, i7, i8, i9, eo3Var);
        nr3Var.d(b7);
        eo3Var.f4688c = b7;
        return I;
    }

    static int d(es3 es3Var, byte[] bArr, int i7, int i8, eo3 eo3Var) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = k(i10, bArr, i9, eo3Var);
            i10 = eo3Var.f4686a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw mq3.j();
        }
        Object b7 = es3Var.b();
        int i12 = i10 + i11;
        es3Var.h(b7, bArr, i11, i12, eo3Var);
        es3Var.d(b7);
        eo3Var.f4688c = b7;
        return i12;
    }

    static int e(es3<?> es3Var, int i7, byte[] bArr, int i8, int i9, jq3<?> jq3Var, eo3 eo3Var) {
        int d7 = d(es3Var, bArr, i8, i9, eo3Var);
        while (true) {
            jq3Var.add(eo3Var.f4688c);
            if (d7 >= i9) {
                break;
            }
            int j7 = j(bArr, d7, eo3Var);
            if (i7 != eo3Var.f4686a) {
                break;
            }
            d7 = d(es3Var, bArr, j7, i9, eo3Var);
        }
        return d7;
    }

    static int f(byte[] bArr, int i7, jq3<?> jq3Var, eo3 eo3Var) {
        bq3 bq3Var = (bq3) jq3Var;
        int j7 = j(bArr, i7, eo3Var);
        int i8 = eo3Var.f4686a + j7;
        while (j7 < i8) {
            j7 = j(bArr, j7, eo3Var);
            bq3Var.O(eo3Var.f4686a);
        }
        if (j7 == i8) {
            return j7;
        }
        throw mq3.j();
    }

    static int g(byte[] bArr, int i7, eo3 eo3Var) {
        int j7 = j(bArr, i7, eo3Var);
        int i8 = eo3Var.f4686a;
        if (i8 < 0) {
            throw mq3.f();
        }
        if (i8 == 0) {
            eo3Var.f4688c = "";
            return j7;
        }
        eo3Var.f4688c = new String(bArr, j7, i8, kq3.f7586b);
        return j7 + i8;
    }

    static int h(byte[] bArr, int i7, eo3 eo3Var) {
        int j7 = j(bArr, i7, eo3Var);
        int i8 = eo3Var.f4686a;
        if (i8 < 0) {
            throw mq3.f();
        }
        if (i8 == 0) {
            eo3Var.f4688c = "";
            return j7;
        }
        eo3Var.f4688c = lt3.h(bArr, j7, i8);
        return j7 + i8;
    }

    static int i(int i7, byte[] bArr, int i8, int i9, xs3 xs3Var, eo3 eo3Var) {
        if ((i7 >>> 3) == 0) {
            throw mq3.c();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int m7 = m(bArr, i8, eo3Var);
            xs3Var.h(i7, Long.valueOf(eo3Var.f4687b));
            return m7;
        }
        if (i10 == 1) {
            xs3Var.h(i7, Long.valueOf(n(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int j7 = j(bArr, i8, eo3Var);
            int i11 = eo3Var.f4686a;
            if (i11 < 0) {
                throw mq3.f();
            }
            if (i11 > bArr.length - j7) {
                throw mq3.j();
            }
            xs3Var.h(i7, i11 == 0 ? uo3.f12885g : uo3.K(bArr, j7, i11));
            return j7 + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw mq3.c();
            }
            xs3Var.h(i7, Integer.valueOf(b(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        xs3 e7 = xs3.e();
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int j8 = j(bArr, i8, eo3Var);
            int i14 = eo3Var.f4686a;
            i13 = i14;
            if (i14 == i12) {
                i8 = j8;
                break;
            }
            int i15 = i(i13, bArr, j8, i9, e7, eo3Var);
            i13 = i14;
            i8 = i15;
        }
        if (i8 > i9 || i13 != i12) {
            throw mq3.g();
        }
        xs3Var.h(i7, e7);
        return i8;
    }

    static int j(byte[] bArr, int i7, eo3 eo3Var) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return k(b7, bArr, i8, eo3Var);
        }
        eo3Var.f4686a = b7;
        return i8;
    }

    static int k(int i7, byte[] bArr, int i8, eo3 eo3Var) {
        int i9;
        int i10;
        int i11 = i7 & 127;
        int i12 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 < 0) {
            int i13 = i11 | ((b7 & Byte.MAX_VALUE) << 7);
            int i14 = i12 + 1;
            byte b8 = bArr[i12];
            if (b8 >= 0) {
                i9 = b8 << 14;
            } else {
                i11 = i13 | ((b8 & Byte.MAX_VALUE) << 14);
                i12 = i14 + 1;
                byte b9 = bArr[i14];
                if (b9 >= 0) {
                    i10 = b9 << 21;
                } else {
                    i13 = i11 | ((b9 & Byte.MAX_VALUE) << 21);
                    i14 = i12 + 1;
                    byte b10 = bArr[i12];
                    if (b10 >= 0) {
                        i9 = b10 << 28;
                    } else {
                        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i16 = i14 + 1;
                            if (bArr[i14] >= 0) {
                                eo3Var.f4686a = i15;
                                return i16;
                            }
                            i14 = i16;
                        }
                    }
                }
            }
            eo3Var.f4686a = i13 | i9;
            return i14;
        }
        i10 = b7 << 7;
        eo3Var.f4686a = i11 | i10;
        return i12;
    }

    static int l(int i7, byte[] bArr, int i8, int i9, jq3<?> jq3Var, eo3 eo3Var) {
        bq3 bq3Var = (bq3) jq3Var;
        int j7 = j(bArr, i8, eo3Var);
        while (true) {
            bq3Var.O(eo3Var.f4686a);
            if (j7 >= i9) {
                break;
            }
            int j8 = j(bArr, j7, eo3Var);
            if (i7 != eo3Var.f4686a) {
                break;
            }
            j7 = j(bArr, j8, eo3Var);
        }
        return j7;
    }

    static int m(byte[] bArr, int i7, eo3 eo3Var) {
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 >= 0) {
            eo3Var.f4687b = j7;
            return i8;
        }
        int i9 = i8 + 1;
        byte b7 = bArr[i8];
        long j8 = (j7 & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (r10 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        eo3Var.f4687b = j8;
        return i9;
    }

    static long n(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }
}
