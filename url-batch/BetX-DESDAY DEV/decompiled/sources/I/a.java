package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f348e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f350b;

    /* renamed from: c, reason: collision with root package name */
    public int f351c;

    /* renamed from: d, reason: collision with root package name */
    public char f352d;

    static {
        for (int i = 0; i < 1792; i++) {
            f348e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f349a = charSequence;
        this.f350b = charSequence.length();
    }

    public final byte a() {
        int i = this.f351c - 1;
        CharSequence charSequence = this.f349a;
        char charAt = charSequence.charAt(i);
        this.f352d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f351c);
            this.f351c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f351c--;
        char c2 = this.f352d;
        return c2 < 1792 ? f348e[c2] : Character.getDirectionality(c2);
    }
}
