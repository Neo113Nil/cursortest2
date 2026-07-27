package i5;

import B4.k;
import U4.c;
import j5.f;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5835a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z5, boolean z6, boolean z7, int i6) {
        int i7 = (i6 & 1) != 0 ? 0 : i2;
        int length = (i6 & 2) != 0 ? str.length() : i3;
        boolean z8 = (i6 & 8) != 0 ? false : z;
        boolean z9 = (i6 & 16) != 0 ? false : z5;
        boolean z10 = (i6 & 32) != 0 ? false : z6;
        boolean z11 = (i6 & 64) == 0 ? z7 : false;
        i.e(str, "<this>");
        int i8 = i7;
        while (i8 < length) {
            int codePointAt = str.codePointAt(i8);
            int i9 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z11) || k.S(str2, (char) codePointAt) || ((codePointAt == 37 && (!z8 || (z9 && !b(str, i8, length)))) || (codePointAt == 43 && z10)))) {
                f fVar = new f();
                fVar.P(str, i7, i8);
                f fVar2 = null;
                while (i8 < length) {
                    int codePointAt2 = str.codePointAt(i8);
                    if (!z8 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i9 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            fVar.O("+");
                        } else if (codePointAt2 == 43 && z10) {
                            fVar.O(z8 ? "+" : "%2B");
                        } else {
                            if (codePointAt2 >= i9 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z11) && !k.S(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z8 && (!z9 || b(str, i8, length))))) {
                                    fVar.Q(codePointAt2);
                                }
                            }
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            fVar2.Q(codePointAt2);
                            while (!fVar2.a()) {
                                byte c2 = fVar2.c();
                                fVar.J(37);
                                char[] cArr = f5835a;
                                fVar.J(cArr[((c2 & 255) >> 4) & 15]);
                                fVar.J(cArr[c2 & 15]);
                            }
                        }
                    }
                    i8 += Character.charCount(codePointAt2);
                    i9 = 32;
                }
                return fVar.C();
            }
            i8 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i7, length);
        i.d(substring, "substring(...)");
        return substring;
    }

    public static final boolean b(String str, int i2, int i3) {
        i.e(str, "<this>");
        int i6 = i2 + 2;
        return i6 < i3 && str.charAt(i2) == '%' && c.k(str.charAt(i2 + 1)) != -1 && c.k(str.charAt(i6)) != -1;
    }

    public static String c(String str, int i2, int i3, boolean z, int i6) {
        int i7;
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = str.length();
        }
        if ((i6 & 4) != 0) {
            z = false;
        }
        i.e(str, "<this>");
        int i8 = i2;
        while (i8 < i3) {
            char charAt = str.charAt(i8);
            if (charAt == '%' || (charAt == '+' && z)) {
                f fVar = new f();
                fVar.P(str, i2, i8);
                while (i8 < i3) {
                    int codePointAt = str.codePointAt(i8);
                    if (codePointAt != 37 || (i7 = i8 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            fVar.J(32);
                            i8++;
                        }
                        fVar.Q(codePointAt);
                        i8 += Character.charCount(codePointAt);
                    } else {
                        int k3 = c.k(str.charAt(i8 + 1));
                        int k6 = c.k(str.charAt(i7));
                        if (k3 != -1 && k6 != -1) {
                            fVar.J((k3 << 4) + k6);
                            i8 = Character.charCount(codePointAt) + i7;
                        }
                        fVar.Q(codePointAt);
                        i8 += Character.charCount(codePointAt);
                    }
                }
                return fVar.C();
            }
            i8++;
        }
        String substring = str.substring(i2, i3);
        i.d(substring, "substring(...)");
        return substring;
    }
}
