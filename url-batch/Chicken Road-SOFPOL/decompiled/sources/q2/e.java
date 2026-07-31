package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f6042b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f6043a;

    public static String a(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i8 = i & 255;
        String str = "Invalid";
        sb.append((Object) (i8 == 1 ? "Strategy.Simple" : i8 == 2 ? "Strategy.HighQuality" : i8 == 3 ? "Strategy.Balanced" : i8 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i9 = (i >> 8) & 255;
        sb.append((Object) (i9 == 1 ? "Strictness.None" : i9 == 2 ? "Strictness.Loose" : i9 == 3 ? "Strictness.Normal" : i9 == 4 ? "Strictness.Strict" : i9 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i10 = (i >> 16) & 255;
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
            return this.f6043a == ((e) obj).f6043a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6043a);
    }

    public final String toString() {
        return a(this.f6043a);
    }
}
