package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f239e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f241b;

    /* renamed from: c, reason: collision with root package name */
    public int f242c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f239e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f240a = charSequence;
        this.f241b = charSequence.length();
    }

    public final byte a() {
        int i = this.f242c - 1;
        CharSequence charSequence = this.f240a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f242c);
            this.f242c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f242c--;
        char c2 = this.d;
        return c2 < 1792 ? f239e[c2] : Character.getDirectionality(c2);
    }
}
