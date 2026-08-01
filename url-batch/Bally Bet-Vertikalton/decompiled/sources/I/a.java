package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f324e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f325a;

    /* renamed from: b, reason: collision with root package name */
    public final int f326b;

    /* renamed from: c, reason: collision with root package name */
    public int f327c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f324e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f325a = charSequence;
        this.f326b = charSequence.length();
    }

    public final byte a() {
        int i = this.f327c - 1;
        CharSequence charSequence = this.f325a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f327c);
            this.f327c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f327c--;
        char c2 = this.d;
        return c2 < 1792 ? f324e[c2] : Character.getDirectionality(c2);
    }
}
