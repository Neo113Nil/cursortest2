package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(la.a);
        bytes.getClass();
        a = bytes;
    }

    public static final String a(long j, h9 h9Var) {
        if (j > 0) {
            long j2 = j - 1;
            if (h9Var.h(j2) == 13) {
                String r = h9Var.r(j2, la.a);
                h9Var.skip(2L);
                return r;
            }
        }
        String r2 = h9Var.r(j, la.a);
        h9Var.skip(1L);
        return r2;
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
    public static final int b(h9 h9Var, oz ozVar, boolean z) {
        int i;
        int i2;
        int i3;
        u40 u40Var;
        int i4;
        ozVar.getClass();
        u40 u40Var2 = h9Var.f;
        if (u40Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = u40Var2.a;
        int i5 = u40Var2.b;
        int i6 = u40Var2.c;
        int[] iArr = ozVar.g;
        u40 u40Var3 = u40Var2;
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
            if (u40Var3 == null) {
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
                            u40Var3 = u40Var3.f;
                            u40Var3.getClass();
                            int i16 = u40Var3.b;
                            byte[] bArr2 = u40Var3.a;
                            i2 = u40Var3.c;
                            if (u40Var3 == u40Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                u40Var3 = null;
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
                    u40Var3.getClass();
                    u40 u40Var4 = u40Var3.f;
                    u40Var4.getClass();
                    i3 = u40Var4.b;
                    byte[] bArr3 = u40Var4.a;
                    i4 = u40Var4.c;
                    if (u40Var4 != u40Var2) {
                        u40Var = u40Var4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        u40Var = null;
                    }
                } else {
                    u40Var = u40Var3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    u40Var3 = u40Var;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                u40Var3 = u40Var;
                i11 = i20;
            }
        }
        return i7;
    }
}
