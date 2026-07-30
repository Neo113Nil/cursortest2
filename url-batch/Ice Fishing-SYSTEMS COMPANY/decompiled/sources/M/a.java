package M;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1812e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1814b;

    /* renamed from: c, reason: collision with root package name */
    public int f1815c;

    /* renamed from: d, reason: collision with root package name */
    public char f1816d;

    static {
        for (int i = 0; i < 1792; i++) {
            f1812e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f1813a = charSequence;
        this.f1814b = charSequence.length();
    }

    public final byte a() {
        int i = this.f1815c - 1;
        CharSequence charSequence = this.f1813a;
        char charAt = charSequence.charAt(i);
        this.f1816d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f1815c);
            this.f1815c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1815c--;
        char c4 = this.f1816d;
        return c4 < 1792 ? f1812e[c4] : Character.getDirectionality(c4);
    }
}
