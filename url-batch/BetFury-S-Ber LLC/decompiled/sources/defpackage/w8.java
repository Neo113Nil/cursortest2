package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class w8 {
    public static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public w8(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        int i = this.c - 1;
        CharSequence charSequence = this.a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        boolean isLowSurrogate = Character.isLowSurrogate(charAt);
        int i2 = this.c;
        if (isLowSurrogate) {
            int codePointBefore = Character.codePointBefore(charSequence, i2);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c = i2 - 1;
        char c = this.d;
        return c < 1792 ? e[c] : Character.getDirectionality(c);
    }
}
