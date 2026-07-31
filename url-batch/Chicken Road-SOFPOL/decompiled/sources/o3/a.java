package o3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f5599e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f5600a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5601b;

    /* renamed from: c, reason: collision with root package name */
    public int f5602c;

    /* renamed from: d, reason: collision with root package name */
    public char f5603d;

    static {
        for (int i = 0; i < 1792; i++) {
            f5599e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f5600a = charSequence;
        this.f5601b = charSequence.length();
    }

    public final byte a() {
        int i = this.f5602c - 1;
        CharSequence charSequence = this.f5600a;
        char charAt = charSequence.charAt(i);
        this.f5603d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f5602c);
            this.f5602c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f5602c--;
        char c8 = this.f5603d;
        return c8 < 1792 ? f5599e[c8] : Character.getDirectionality(c8);
    }
}
