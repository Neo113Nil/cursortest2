package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f527e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f528a;

    /* renamed from: b, reason: collision with root package name */
    public final int f529b;

    /* renamed from: c, reason: collision with root package name */
    public int f530c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f527e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f528a = charSequence;
        this.f529b = charSequence.length();
    }

    public final byte a() {
        int i = this.f530c - 1;
        CharSequence charSequence = this.f528a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f530c);
            this.f530c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f530c--;
        char c2 = this.d;
        return c2 < 1792 ? f527e[c2] : Character.getDirectionality(c2);
    }
}
