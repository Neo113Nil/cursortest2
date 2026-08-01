package l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2529e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2530a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2531b;

    /* renamed from: c, reason: collision with root package name */
    public int f2532c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f2529e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f2530a = charSequence;
        this.f2531b = charSequence.length();
    }

    public final byte a() {
        int i = this.f2532c - 1;
        CharSequence charSequence = this.f2530a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f2532c);
            this.f2532c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f2532c--;
        char c4 = this.d;
        return c4 < 1792 ? f2529e[c4] : Character.getDirectionality(c4);
    }
}
