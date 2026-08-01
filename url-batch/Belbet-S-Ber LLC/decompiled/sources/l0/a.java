package l0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2619e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2621b;

    /* renamed from: c, reason: collision with root package name */
    public int f2622c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f2619e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f2620a = charSequence;
        this.f2621b = charSequence.length();
    }

    public final byte a() {
        int i = this.f2622c - 1;
        CharSequence charSequence = this.f2620a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f2622c);
            this.f2622c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f2622c--;
        char c5 = this.d;
        return c5 < 1792 ? f2619e[c5] : Character.getDirectionality(c5);
    }
}
