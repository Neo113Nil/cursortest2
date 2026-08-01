package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f287e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f288a;

    /* renamed from: b, reason: collision with root package name */
    public final int f289b;

    /* renamed from: c, reason: collision with root package name */
    public int f290c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f287e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f288a = charSequence;
        this.f289b = charSequence.length();
    }

    public final byte a() {
        int i = this.f290c - 1;
        CharSequence charSequence = this.f288a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f290c);
            this.f290c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f290c--;
        char c2 = this.d;
        return c2 < 1792 ? f287e[c2] : Character.getDirectionality(c2);
    }
}
