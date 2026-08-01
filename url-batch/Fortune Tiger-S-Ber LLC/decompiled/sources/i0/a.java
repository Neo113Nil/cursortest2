package i0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2080e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2082b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public char f2083d;

    static {
        for (int i4 = 0; i4 < 1792; i4++) {
            f2080e[i4] = Character.getDirectionality(i4);
        }
    }

    public a(CharSequence charSequence) {
        this.f2081a = charSequence;
        this.f2082b = charSequence.length();
    }

    public final byte a() {
        int i4 = this.c - 1;
        CharSequence charSequence = this.f2081a;
        char charAt = charSequence.charAt(i4);
        this.f2083d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.c);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c--;
        char c = this.f2083d;
        return c < 1792 ? f2080e[c] : Character.getDirectionality(c);
    }
}
