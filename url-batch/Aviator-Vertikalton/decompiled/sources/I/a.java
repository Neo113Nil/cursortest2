package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f349e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351b;

    /* renamed from: c, reason: collision with root package name */
    public int f352c;

    /* renamed from: d, reason: collision with root package name */
    public char f353d;

    static {
        for (int i = 0; i < 1792; i++) {
            f349e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f350a = charSequence;
        this.f351b = charSequence.length();
    }

    public final byte a() {
        int i = this.f352c - 1;
        CharSequence charSequence = this.f350a;
        char charAt = charSequence.charAt(i);
        this.f353d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f352c);
            this.f352c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f352c--;
        char c2 = this.f353d;
        return c2 < 1792 ? f349e[c2] : Character.getDirectionality(c2);
    }
}
