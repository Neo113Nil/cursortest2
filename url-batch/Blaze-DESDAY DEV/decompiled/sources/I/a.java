package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f304e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f305a;

    /* renamed from: b, reason: collision with root package name */
    public final int f306b;

    /* renamed from: c, reason: collision with root package name */
    public int f307c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f304e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f305a = charSequence;
        this.f306b = charSequence.length();
    }

    public final byte a() {
        int i = this.f307c - 1;
        CharSequence charSequence = this.f305a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f307c);
            this.f307c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f307c--;
        char c2 = this.d;
        return c2 < 1792 ? f304e[c2] : Character.getDirectionality(c2);
    }
}
