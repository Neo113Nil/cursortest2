package g8;

import f8.b0;
import f8.v;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4536a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(z6.a.f10114a);
        k.e(bytes, "this as java.lang.String).getBytes(charset)");
        f4536a = bytes;
    }

    public static final String a(long j8, f8.f fVar) {
        if (j8 > 0) {
            long j9 = j8 - 1;
            if (fVar.k(j9) == 13) {
                String D = fVar.D(j9, z6.a.f10114a);
                fVar.skip(2L);
                return D;
            }
        }
        String D2 = fVar.D(j8, z6.a.f10114a);
        fVar.skip(1L);
        return D2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(f8.f fVar, v vVar, boolean z8) {
        int i7;
        int i8;
        int i9;
        b0 b0Var;
        int i10;
        k.f(vVar, "options");
        b0 b0Var2 = fVar.f3597f;
        if (b0Var2 == null) {
            return z8 ? -2 : -1;
        }
        byte[] bArr = b0Var2.f3571a;
        int i11 = b0Var2.f3572b;
        int i12 = b0Var2.f3573c;
        int[] iArr = vVar.f3644g;
        b0 b0Var3 = b0Var2;
        int i13 = -1;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i14 + 1;
            int i16 = iArr[i14];
            int i17 = i14 + 2;
            int i18 = iArr[i15];
            if (i18 != -1) {
                i13 = i18;
            }
            if (b0Var3 == null) {
                break;
            }
            if (i16 >= 0) {
                int i19 = i11 + 1;
                int i20 = bArr[i11] & 255;
                int i21 = i17 + i16;
                while (i17 != i21) {
                    if (i20 == iArr[i17]) {
                        i7 = iArr[i17 + i16];
                        if (i19 == i12) {
                            b0Var3 = b0Var3.f3576f;
                            k.c(b0Var3);
                            int i22 = b0Var3.f3572b;
                            byte[] bArr2 = b0Var3.f3571a;
                            i8 = b0Var3.f3573c;
                            if (b0Var3 == b0Var2) {
                                i9 = i22;
                                bArr = bArr2;
                                b0Var3 = null;
                            } else {
                                i9 = i22;
                                bArr = bArr2;
                            }
                        } else {
                            i8 = i12;
                            i9 = i19;
                        }
                        if (i7 >= 0) {
                            return i7;
                        }
                        int i23 = i8;
                        i14 = -i7;
                        i11 = i9;
                        i12 = i23;
                    } else {
                        i17++;
                    }
                }
                break loop0;
            }
            int i24 = (i16 * (-1)) + i17;
            while (true) {
                int i25 = i11 + 1;
                int i26 = i17 + 1;
                if ((bArr[i11] & 255) != iArr[i17]) {
                    break loop0;
                }
                boolean z9 = i26 == i24;
                if (i25 == i12) {
                    k.c(b0Var3);
                    b0 b0Var4 = b0Var3.f3576f;
                    k.c(b0Var4);
                    i9 = b0Var4.f3572b;
                    byte[] bArr3 = b0Var4.f3571a;
                    i10 = b0Var4.f3573c;
                    if (b0Var4 != b0Var2) {
                        b0Var = b0Var4;
                        bArr = bArr3;
                    } else {
                        if (!z9) {
                            break loop0;
                        }
                        bArr = bArr3;
                        b0Var = null;
                    }
                } else {
                    b0Var = b0Var3;
                    i10 = i12;
                    i9 = i25;
                }
                if (z9) {
                    i7 = iArr[i26];
                    int i27 = i10;
                    b0Var3 = b0Var;
                    i8 = i27;
                    break;
                }
                i11 = i9;
                i12 = i10;
                b0Var3 = b0Var;
                i17 = i26;
            }
        }
        return i13;
    }
}
