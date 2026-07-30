package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes.dex */
public class StringsKt__StringNumberConversionsKt extends o {
    public static final void e(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException(C4.p.i("Invalid number format: '", input, '\''));
    }

    public static Integer toIntOrNull(String str) {
        boolean z7;
        int i2;
        int i5;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        int i8 = -2147483647;
        if (Intrinsics.d(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z7 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i8 = Integer.MIN_VALUE;
                z7 = true;
            }
        } else {
            z7 = false;
            i2 = 0;
        }
        int i9 = -59652323;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if ((i7 < i9 && (i9 != -59652323 || i7 < (i9 = i8 / 10))) || (i5 = i7 * 10) < i8 + digit) {
                return null;
            }
            i7 = i5 - digit;
            i2++;
        }
        return z7 ? Integer.valueOf(i7) : Integer.valueOf(-i7);
    }
}
