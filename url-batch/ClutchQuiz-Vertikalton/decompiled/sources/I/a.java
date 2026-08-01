package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f250e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f252b;

    /* renamed from: c, reason: collision with root package name */
    public int f253c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f250e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f251a = charSequence;
        this.f252b = charSequence.length();
    }

    public final byte a() {
        int i = this.f253c - 1;
        CharSequence charSequence = this.f251a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f253c);
            this.f253c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f253c--;
        char c2 = this.d;
        return c2 < 1792 ? f250e[c2] : Character.getDirectionality(c2);
    }
}
