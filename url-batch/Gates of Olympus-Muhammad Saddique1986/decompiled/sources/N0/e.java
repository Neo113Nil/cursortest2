package N0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f3536b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f3537a;

    public static String a(int i3) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i4 = i3 & 255;
        String str = "Invalid";
        sb.append((Object) (l0.c.r(i4, 1) ? "Strategy.Simple" : l0.c.r(i4, 2) ? "Strategy.HighQuality" : l0.c.r(i4, 3) ? "Strategy.Balanced" : l0.c.r(i4, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i5 = (i3 >> 8) & 255;
        sb.append((Object) (O2.d.K(i5, 1) ? "Strictness.None" : O2.d.K(i5, 2) ? "Strictness.Loose" : O2.d.K(i5, 3) ? "Strictness.Normal" : O2.d.K(i5, 4) ? "Strictness.Strict" : O2.d.K(i5, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i6 = (i3 >> 16) & 255;
        if (i6 == 1) {
            str = "WordBreak.None";
        } else if (i6 == 2) {
            str = "WordBreak.Phrase";
        } else if (i6 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f3537a == ((e) obj).f3537a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3537a);
    }

    public final String toString() {
        return a(this.f3537a);
    }
}
