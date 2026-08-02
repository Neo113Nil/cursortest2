package kotlin.text;

import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    public static int digitToInt(char c) {
        CharsKt__CharJVMKt.checkRadix(10);
        int digit = Character.digit((int) c, 10);
        Integer valueOf = Integer.valueOf(digit);
        if (digit < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        f$$ExternalSyntheticLambda0.m("Char ", c, " is not a digit in the given radix=10");
        return 0;
    }

    public static final boolean equals(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
