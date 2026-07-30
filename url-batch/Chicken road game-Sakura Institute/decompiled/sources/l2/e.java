package l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5865b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f5866a;

    public static String a(int i7) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i8 = i7 & 255;
        String str = "Invalid";
        sb.append((Object) (i8 == 1 ? "Strategy.Simple" : i8 == 2 ? "Strategy.HighQuality" : i8 == 3 ? "Strategy.Balanced" : i8 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i9 = (i7 >> 8) & 255;
        sb.append((Object) (i9 == 1 ? "Strictness.None" : i9 == 2 ? "Strictness.Loose" : i9 == 3 ? "Strictness.Normal" : i9 == 4 ? "Strictness.Strict" : i9 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i10 = (i7 >> 16) & 255;
        if (i10 == 1) {
            str = "WordBreak.None";
        } else if (i10 == 2) {
            str = "WordBreak.Phrase";
        } else if (i10 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f5866a == ((e) obj).f5866a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5866a);
    }

    public final String toString() {
        return a(this.f5866a);
    }
}
