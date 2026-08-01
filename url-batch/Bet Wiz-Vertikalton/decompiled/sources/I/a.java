package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f292e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f294b;

    /* renamed from: c, reason: collision with root package name */
    public int f295c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f292e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f293a = charSequence;
        this.f294b = charSequence.length();
    }

    public final byte a() {
        int i = this.f295c - 1;
        CharSequence charSequence = this.f293a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f295c);
            this.f295c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f295c--;
        char c2 = this.d;
        return c2 < 1792 ? f292e[c2] : Character.getDirectionality(c2);
    }
}
