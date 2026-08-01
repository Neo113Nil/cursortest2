package K;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f385e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f386a;

    /* renamed from: b, reason: collision with root package name */
    public final int f387b;

    /* renamed from: c, reason: collision with root package name */
    public int f388c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f385e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f386a = charSequence;
        this.f387b = charSequence.length();
    }

    public final byte a() {
        int i = this.f388c - 1;
        CharSequence charSequence = this.f386a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f388c);
            this.f388c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f388c--;
        char c2 = this.d;
        return c2 < 1792 ? f385e[c2] : Character.getDirectionality(c2);
    }
}
