package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jt3 extends it3 {
    jt3() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.it3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int a(int i7, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        int l7;
        int k7;
        int k8;
        if (i7 != 0) {
            if (i8 >= i9) {
                return i7;
            }
            byte b7 = (byte) i7;
            if (b7 < -32) {
                if (b7 >= -62) {
                    i11 = i8 + 1;
                }
                return -1;
            }
            if (b7 < -16) {
                byte b8 = (byte) ((i7 >> 8) ^ (-1));
                if (b8 == 0) {
                    int i12 = i8 + 1;
                    byte b9 = bArr[i8];
                    if (i12 >= i9) {
                        k8 = lt3.k(b7, b9);
                        return k8;
                    }
                    i8 = i12;
                    b8 = b9;
                }
                if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                    i11 = i8 + 1;
                }
                return -1;
            }
            byte b10 = (byte) ((i7 >> 8) ^ (-1));
            if (b10 == 0) {
                int i13 = i8 + 1;
                b10 = bArr[i8];
                if (i13 >= i9) {
                    k7 = lt3.k(b7, b10);
                    return k7;
                }
                i8 = i13;
                i10 = 0;
            } else {
                i10 = i7 >> 16;
            }
            if (i10 == 0) {
                int i14 = i8 + 1;
                byte b11 = bArr[i8];
                if (i14 >= i9) {
                    l7 = lt3.l(b7, b10, b11);
                    return l7;
                }
                i8 = i14;
                i10 = b11;
            }
            if (b10 <= -65 && (((b7 << 28) + (b10 + 112)) >> 30) == 0 && i10 <= -65) {
                i11 = i8 + 1;
            }
            return -1;
            i8 = i11;
        }
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i15 = i8 + 1;
            byte b12 = bArr[i8];
            if (b12 < 0) {
                if (b12 < -32) {
                    if (i15 >= i9) {
                        return b12;
                    }
                    if (b12 >= -62) {
                        i8 = i15 + 1;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                if (b12 >= -16) {
                    if (i15 >= i9 - 2) {
                        return lt3.c(bArr, i15, i9);
                    }
                    int i16 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 <= -65 && (((b12 << 28) + (b13 + 112)) >> 30) == 0) {
                        int i17 = i16 + 1;
                        if (bArr[i16] <= -65) {
                            i8 = i17 + 1;
                            if (bArr[i17] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i15 >= i9 - 1) {
                    return lt3.c(bArr, i15, i9);
                }
                int i18 = i15 + 1;
                byte b14 = bArr[i15];
                if (b14 <= -65 && ((b12 != -32 || b14 >= -96) && (b12 != -19 || b14 < -96))) {
                    i8 = i18 + 1;
                    if (bArr[i18] > -65) {
                    }
                }
                return -1;
            }
            i8 = i15;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.it3
    final String b(byte[] bArr, int i7, int i8) {
        int length = bArr.length;
        if ((i7 | i8 | ((length - i7) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i9 = i7 + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i7 < i9) {
            byte b7 = bArr[i7];
            if (!ht3.d(b7)) {
                break;
            }
            i7++;
            cArr[i10] = (char) b7;
            i10++;
        }
        while (i7 < i9) {
            int i11 = i7 + 1;
            byte b8 = bArr[i7];
            if (ht3.d(b8)) {
                int i12 = i10 + 1;
                cArr[i10] = (char) b8;
                i7 = i11;
                while (true) {
                    i10 = i12;
                    if (i7 < i9) {
                        byte b9 = bArr[i7];
                        if (!ht3.d(b9)) {
                            break;
                        }
                        i7++;
                        i12 = i10 + 1;
                        cArr[i10] = (char) b9;
                    }
                }
            } else if (ht3.f(b8)) {
                if (i11 >= i9) {
                    throw mq3.d();
                }
                ht3.c(b8, bArr[i11], cArr, i10);
                i7 = i11 + 1;
                i10++;
            } else if (ht3.e(b8)) {
                if (i11 >= i9 - 1) {
                    throw mq3.d();
                }
                int i13 = i11 + 1;
                ht3.b(b8, bArr[i11], bArr[i13], cArr, i10);
                i7 = i13 + 1;
                i10++;
            } else {
                if (i11 >= i9 - 2) {
                    throw mq3.d();
                }
                int i14 = i11 + 1;
                int i15 = i14 + 1;
                ht3.a(b8, bArr[i11], bArr[i14], bArr[i15], cArr, i10);
                i10 += 2;
                i7 = i15 + 1;
            }
        }
        return new String(cArr, 0, i10);
    }
}
