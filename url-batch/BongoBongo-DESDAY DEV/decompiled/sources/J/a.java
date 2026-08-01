package J;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f347e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349b;

    /* renamed from: c, reason: collision with root package name */
    public int f350c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f347e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f348a = charSequence;
        this.f349b = charSequence.length();
    }

    public final byte a() {
        int i = this.f350c - 1;
        CharSequence charSequence = this.f348a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f350c);
            this.f350c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f350c--;
        char c2 = this.d;
        return c2 < 1792 ? f347e[c2] : Character.getDirectionality(c2);
    }
}
