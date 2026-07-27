package L0;

import a.AbstractC0345a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f3498b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f3499a;

    public static String a(int i2) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i4 = i2 & 255;
        String str = "Invalid";
        sb.append((Object) (AbstractC0345a.q(i4, 1) ? "Strategy.Simple" : AbstractC0345a.q(i4, 2) ? "Strategy.HighQuality" : AbstractC0345a.q(i4, 3) ? "Strategy.Balanced" : AbstractC0345a.q(i4, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i5 = (i2 >> 8) & 255;
        sb.append((Object) (j0.c.v(i5, 1) ? "Strictness.None" : j0.c.v(i5, 2) ? "Strictness.Loose" : j0.c.v(i5, 3) ? "Strictness.Normal" : j0.c.v(i5, 4) ? "Strictness.Strict" : j0.c.v(i5, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i6 = (i2 >> 16) & 255;
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
            return this.f3499a == ((e) obj).f3499a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3499a);
    }

    public final String toString() {
        return a(this.f3499a);
    }
}
