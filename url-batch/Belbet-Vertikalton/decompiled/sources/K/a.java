package K;

/* loaded from: classes.dex */
public final class a {
    public static final byte[] e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f654b;

    /* renamed from: c, reason: collision with root package name */
    public int f655c;

    /* renamed from: d, reason: collision with root package name */
    public char f656d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f653a = charSequence;
        this.f654b = charSequence.length();
    }

    public final byte a() {
        int i = this.f655c - 1;
        CharSequence charSequence = this.f653a;
        char charAt = charSequence.charAt(i);
        this.f656d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f655c);
            this.f655c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f655c--;
        char c2 = this.f656d;
        return c2 < 1792 ? e[c2] : Character.getDirectionality(c2);
    }
}
