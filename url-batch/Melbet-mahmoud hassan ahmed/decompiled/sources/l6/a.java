package l6;

/* loaded from: classes.dex */
class a {
    public static final int a(int i7) {
        boolean z6 = false;
        if (2 <= i7 && i7 < 37) {
            z6 = true;
        }
        if (z6) {
            return i7;
        }
        throw new IllegalArgumentException("radix " + i7 + " was not in valid range " + new i6.c(2, 36));
    }

    public static final int b(char c7, int i7) {
        return Character.digit((int) c7, i7);
    }

    public static final boolean c(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }
}
