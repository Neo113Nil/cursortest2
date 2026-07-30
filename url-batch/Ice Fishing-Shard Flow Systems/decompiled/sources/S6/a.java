package S6;

import E6.c;
import T6.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2548a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String input, int i2, int i5, String encodeSet, int i7) {
        int i8 = (i7 & 1) != 0 ? 0 : i2;
        int length = (i7 & 2) != 0 ? input.length() : i5;
        boolean z7 = (i7 & 8) == 0;
        boolean z8 = (i7 & 16) == 0;
        boolean z9 = (i7 & 32) == 0;
        boolean z10 = (i7 & 64) == 0;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int i9 = i8;
        while (i9 < length) {
            int codePointAt = input.codePointAt(i9);
            int i10 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z10) || StringsKt.v(encodeSet, (char) codePointAt) || ((codePointAt == 37 && (!z7 || (z8 && !b(input, i9, length)))) || (codePointAt == 43 && z9)))) {
                f fVar = new f();
                fVar.O(input, i8, i9);
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
                f fVar2 = null;
                while (i9 < length) {
                    int codePointAt2 = input.codePointAt(i9);
                    if (z7 && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        Unit unit = Unit.f6114a;
                    } else {
                        if (codePointAt2 == i10 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            fVar.N("+");
                        } else {
                            if (codePointAt2 == 43 && z9) {
                                fVar.N(z7 ? "+" : "%2B");
                            } else if (codePointAt2 < i10 || codePointAt2 == 127 || ((codePointAt2 >= 128 && !z10) || StringsKt.v(encodeSet, (char) codePointAt2) || (codePointAt2 == 37 && (!z7 || (z8 && !b(input, i9, length)))))) {
                                if (fVar2 == null) {
                                    fVar2 = new f();
                                }
                                fVar2.P(codePointAt2);
                                while (!fVar2.d()) {
                                    byte readByte = fVar2.readByte();
                                    fVar.H(37);
                                    char[] cArr = f2548a;
                                    fVar.H(cArr[((readByte & 255) >> 4) & 15]);
                                    fVar.H(cArr[readByte & 15]);
                                }
                                Unit unit2 = Unit.f6114a;
                            } else {
                                fVar.P(codePointAt2);
                            }
                            i9 += Character.charCount(codePointAt2);
                            i10 = 32;
                        }
                    }
                    i9 += Character.charCount(codePointAt2);
                    i10 = 32;
                }
                return fVar.t();
            }
            i9 += Character.charCount(codePointAt);
        }
        String substring = input.substring(i8, length);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean b(String str, int i2, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i7 = i2 + 2;
        return i7 < i5 && str.charAt(i2) == '%' && c.j(str.charAt(i2 + 1)) != -1 && c.j(str.charAt(i7)) != -1;
    }

    public static String c(int i2, int i5, int i7, String encoded) {
        int i8;
        if ((i7 & 1) != 0) {
            i2 = 0;
        }
        if ((i7 & 2) != 0) {
            i5 = encoded.length();
        }
        boolean z7 = (i7 & 4) == 0;
        Intrinsics.checkNotNullParameter(encoded, "<this>");
        int i9 = i2;
        while (i9 < i5) {
            char charAt = encoded.charAt(i9);
            if (charAt == '%' || (charAt == '+' && z7)) {
                f fVar = new f();
                fVar.O(encoded, i2, i9);
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                Intrinsics.checkNotNullParameter(encoded, "encoded");
                while (i9 < i5) {
                    int codePointAt = encoded.codePointAt(i9);
                    if (codePointAt != 37 || (i8 = i9 + 2) >= i5) {
                        if (codePointAt == 43 && z7) {
                            fVar.H(32);
                            i9++;
                        }
                        fVar.P(codePointAt);
                        i9 += Character.charCount(codePointAt);
                    } else {
                        int j = c.j(encoded.charAt(i9 + 1));
                        int j7 = c.j(encoded.charAt(i8));
                        if (j != -1 && j7 != -1) {
                            fVar.H((j << 4) + j7);
                            i9 = Character.charCount(codePointAt) + i8;
                        }
                        fVar.P(codePointAt);
                        i9 += Character.charCount(codePointAt);
                    }
                }
                return fVar.t();
            }
            i9++;
        }
        String substring = encoded.substring(i2, i5);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
