package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wk {
    private static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public wk(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public static byte b(char c) {
        return c < 1792 ? e[c] : Character.getDirectionality(c);
    }

    final byte a() {
        int i = this.c - 1;
        CharSequence charSequence = this.a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        boolean isLowSurrogate = Character.isLowSurrogate(charAt);
        int i2 = this.c;
        if (!isLowSurrogate) {
            this.c = i2 - 1;
            return b(this.d);
        }
        int codePointBefore = Character.codePointBefore(charSequence, i2);
        this.c -= Character.charCount(codePointBefore);
        return Character.getDirectionality(codePointBefore);
    }
}
