package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
abstract class it3 {
    it3() {
    }

    static final String d(ByteBuffer byteBuffer, int i7, int i8) {
        if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i9 = i7 + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i7 < i9) {
            byte b7 = byteBuffer.get(i7);
            if (!ht3.d(b7)) {
                break;
            }
            i7++;
            cArr[i10] = (char) b7;
            i10++;
        }
        int i11 = i10;
        while (i7 < i9) {
            int i12 = i7 + 1;
            byte b8 = byteBuffer.get(i7);
            if (ht3.d(b8)) {
                int i13 = i11 + 1;
                cArr[i11] = (char) b8;
                i7 = i12;
                while (true) {
                    i11 = i13;
                    if (i7 < i9) {
                        byte b9 = byteBuffer.get(i7);
                        if (!ht3.d(b9)) {
                            break;
                        }
                        i7++;
                        i13 = i11 + 1;
                        cArr[i11] = (char) b9;
                    }
                }
            } else if (ht3.f(b8)) {
                if (i12 >= i9) {
                    throw mq3.d();
                }
                ht3.c(b8, byteBuffer.get(i12), cArr, i11);
                i7 = i12 + 1;
                i11++;
            } else if (ht3.e(b8)) {
                if (i12 >= i9 - 1) {
                    throw mq3.d();
                }
                int i14 = i12 + 1;
                ht3.b(b8, byteBuffer.get(i12), byteBuffer.get(i14), cArr, i11);
                i7 = i14 + 1;
                i11++;
            } else {
                if (i12 >= i9 - 2) {
                    throw mq3.d();
                }
                int i15 = i12 + 1;
                int i16 = i15 + 1;
                ht3.a(b8, byteBuffer.get(i12), byteBuffer.get(i15), byteBuffer.get(i16), cArr, i11);
                i11 += 2;
                i7 = i16 + 1;
            }
        }
        return new String(cArr, 0, i11);
    }

    abstract int a(int i7, byte[] bArr, int i8, int i9);

    abstract String b(byte[] bArr, int i7, int i8);

    final boolean c(byte[] bArr, int i7, int i8) {
        return a(0, bArr, i7, i8) == 0;
    }
}
