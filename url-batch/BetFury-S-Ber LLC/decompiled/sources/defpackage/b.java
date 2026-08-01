package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(fb.a);
        bytes.getClass();
        a = bytes;
    }

    public static final String a(long j, t9 t9Var) {
        if (j > 0) {
            long j2 = j - 1;
            if (t9Var.r(j2) == 13) {
                String O = t9Var.O(j2, fb.a);
                t9Var.skip(2L);
                return O;
            }
        }
        String O2 = t9Var.O(j, fb.a);
        t9Var.skip(1L);
        return O2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(t9 t9Var, f50 f50Var, boolean z) {
        int i;
        int i2;
        int i3;
        kc0 kc0Var;
        int i4;
        f50Var.getClass();
        kc0 kc0Var2 = t9Var.f;
        if (kc0Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = kc0Var2.a;
        int i5 = kc0Var2.b;
        int i6 = kc0Var2.c;
        int[] iArr = f50Var.g;
        kc0 kc0Var3 = kc0Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (kc0Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            kc0Var3 = kc0Var3.f;
                            kc0Var3.getClass();
                            int i16 = kc0Var3.b;
                            byte[] bArr2 = kc0Var3.a;
                            i2 = kc0Var3.c;
                            if (kc0Var3 == kc0Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                kc0Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i20 == i18;
                if (i19 == i6) {
                    kc0Var3.getClass();
                    kc0 kc0Var4 = kc0Var3.f;
                    kc0Var4.getClass();
                    i3 = kc0Var4.b;
                    byte[] bArr3 = kc0Var4.a;
                    i4 = kc0Var4.c;
                    if (kc0Var4 != kc0Var2) {
                        kc0Var = kc0Var4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        kc0Var = null;
                    }
                } else {
                    kc0Var = kc0Var3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    kc0Var3 = kc0Var;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                kc0Var3 = kc0Var;
                i11 = i20;
            }
        }
        return i7;
    }
}
