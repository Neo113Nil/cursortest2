package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f299e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f300a;

    /* renamed from: b, reason: collision with root package name */
    public final int f301b;

    /* renamed from: c, reason: collision with root package name */
    public int f302c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f299e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f300a = charSequence;
        this.f301b = charSequence.length();
    }

    public final byte a() {
        int i = this.f302c - 1;
        CharSequence charSequence = this.f300a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f302c);
            this.f302c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f302c--;
        char c2 = this.d;
        return c2 < 1792 ? f299e[c2] : Character.getDirectionality(c2);
    }
}
