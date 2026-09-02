package m6;

import F5.j;
import Y5.c;
import kotlin.jvm.internal.i;
import n6.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5487a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i7, int i8, String str2, int i9) {
        int i10 = (i9 & 1) != 0 ? 0 : i7;
        int length = (i9 & 2) != 0 ? str.length() : i8;
        boolean z5 = (i9 & 8) == 0;
        boolean z6 = (i9 & 16) == 0;
        boolean z7 = (i9 & 32) == 0;
        boolean z8 = (i9 & 64) == 0;
        i.e(str, "<this>");
        int i11 = i10;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            int i12 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z8) || j.M(str2, (char) codePointAt) || ((codePointAt == 37 && (!z5 || (z6 && !b(str, i11, length)))) || (codePointAt == 43 && z7)))) {
                f fVar = new f();
                fVar.P(str, i10, i11);
                f fVar2 = null;
                while (i11 < length) {
                    int codePointAt2 = str.codePointAt(i11);
                    if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i12 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            fVar.O("+");
                        } else if (codePointAt2 == 43 && z7) {
                            fVar.O(z5 ? "+" : "%2B");
                        } else {
                            if (codePointAt2 >= i12 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z8) && !j.M(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z5 && (!z6 || b(str, i11, length))))) {
                                    fVar.Q(codePointAt2);
                                }
                            }
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            fVar2.Q(codePointAt2);
                            while (!fVar2.d()) {
                                byte readByte = fVar2.readByte();
                                fVar.I(37);
                                char[] cArr = f5487a;
                                fVar.I(cArr[((readByte & 255) >> 4) & 15]);
                                fVar.I(cArr[readByte & 15]);
                            }
                        }
                    }
                    i11 += Character.charCount(codePointAt2);
                    i12 = 32;
                }
                return fVar.v();
            }
            i11 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i10, length);
        i.d(substring, "substring(...)");
        return substring;
    }

    public static final boolean b(String str, int i7, int i8) {
        i.e(str, "<this>");
        int i9 = i7 + 2;
        return i9 < i8 && str.charAt(i7) == '%' && c.j(str.charAt(i7 + 1)) != -1 && c.j(str.charAt(i9)) != -1;
    }

    public static String c(int i7, int i8, int i9, String str) {
        int i10;
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        boolean z5 = (i9 & 4) == 0;
        i.e(str, "<this>");
        int i11 = i7;
        while (i11 < i8) {
            char charAt = str.charAt(i11);
            if (charAt == '%' || (charAt == '+' && z5)) {
                f fVar = new f();
                fVar.P(str, i7, i11);
                while (i11 < i8) {
                    int codePointAt = str.codePointAt(i11);
                    if (codePointAt != 37 || (i10 = i11 + 2) >= i8) {
                        if (codePointAt == 43 && z5) {
                            fVar.I(32);
                            i11++;
                        }
                        fVar.Q(codePointAt);
                        i11 += Character.charCount(codePointAt);
                    } else {
                        int j4 = c.j(str.charAt(i11 + 1));
                        int j7 = c.j(str.charAt(i10));
                        if (j4 != -1 && j7 != -1) {
                            fVar.I((j4 << 4) + j7);
                            i11 = Character.charCount(codePointAt) + i10;
                        }
                        fVar.Q(codePointAt);
                        i11 += Character.charCount(codePointAt);
                    }
                }
                return fVar.v();
            }
            i11++;
        }
        String substring = str.substring(i7, i8);
        i.d(substring, "substring(...)");
        return substring;
    }
}
