package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class o63 {
    static int a(int i7) {
        return (i7 < 32 ? 4 : 2) * (i7 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        e(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int b(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int b7 = w63.b(obj);
        int i8 = b7 & i7;
        int c7 = c(obj3, i8);
        if (c7 != 0) {
            int i9 = i7 ^ (-1);
            int i10 = b7 & i9;
            int i11 = -1;
            while (true) {
                int i12 = c7 - 1;
                int i13 = iArr[i12];
                if ((i13 & i9) != i10 || !m43.a(obj, objArr[i12]) || (objArr2 != null && !m43.a(obj2, objArr2[i12]))) {
                    int i14 = i13 & i7;
                    if (i14 == 0) {
                        break;
                    }
                    i11 = i12;
                    c7 = i14;
                }
            }
        }
        return -1;
    }

    static int c(Object obj, int i7) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i7] : ((int[]) obj)[i7];
    }

    static Object d(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    static void e(Object obj, int i7, int i8) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }
}
