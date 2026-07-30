package kotlin.text;

/* loaded from: classes3.dex */
class c extends b {
    public static final char digitToChar(int i8) {
        if (new j6.m(0, 9).contains(i8)) {
            return (char) (i8 + 48);
        }
        throw new IllegalArgumentException("Int " + i8 + " is not a decimal digit");
    }

    public static final int digitToInt(char c8) {
        int digitOf = b.digitOf(c8, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        throw new IllegalArgumentException("Char " + c8 + " is not a decimal digit");
    }

    public static final Integer digitToIntOrNull(char c8) {
        Integer valueOf = Integer.valueOf(b.digitOf(c8, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean equals(char c8, char c9, boolean z7) {
        if (c8 == c9) {
            return true;
        }
        if (!z7) {
            return false;
        }
        char upperCase = Character.toUpperCase(c8);
        char upperCase2 = Character.toUpperCase(c9);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c8, char c9, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return equals(c8, c9, z7);
    }

    public static final boolean isSurrogate(char c8) {
        return new j6.c((char) 55296, (char) 57343).contains(c8);
    }

    private static final String plus(char c8, String other) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return c8 + other;
    }

    public static final String titlecase(char c8) {
        return w.titlecaseImpl(c8);
    }

    public static final Integer digitToIntOrNull(char c8, int i8) {
        b.checkRadix(i8);
        Integer valueOf = Integer.valueOf(b.digitOf(c8, i8));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final char digitToChar(int i8, int i9) {
        if (!new j6.m(2, 36).contains(i9)) {
            throw new IllegalArgumentException("Invalid radix: " + i9 + ". Valid radix values are in range 2..36");
        }
        if (i8 >= 0 && i8 < i9) {
            return (char) (i8 < 10 ? i8 + 48 : ((char) (i8 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i8 + " does not represent a valid digit in radix " + i9);
    }

    public static final int digitToInt(char c8, int i8) {
        Integer digitToIntOrNull = digitToIntOrNull(c8, i8);
        if (digitToIntOrNull != null) {
            return digitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c8 + " is not a digit in the given radix=" + i8);
    }
}
