package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f10028b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f10029a;

    public static String a(int i3) {
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i10 = i3 & 255;
        String str = "Invalid";
        sb2.append((Object) (i10 == 1 ? "Strategy.Simple" : i10 == 2 ? "Strategy.HighQuality" : i10 == 3 ? "Strategy.Balanced" : i10 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb2.append(", strictness=");
        int i11 = (i3 >> 8) & 255;
        sb2.append((Object) (i11 == 1 ? "Strictness.None" : i11 == 2 ? "Strictness.Loose" : i11 == 3 ? "Strictness.Normal" : i11 == 4 ? "Strictness.Strict" : i11 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb2.append(", wordBreak=");
        int i12 = (i3 >> 16) & 255;
        if (i12 == 1) {
            str = "WordBreak.None";
        } else if (i12 == 2) {
            str = "WordBreak.Phrase";
        } else if (i12 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f10029a == ((e) obj).f10029a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10029a);
    }

    public final String toString() {
        return a(this.f10029a);
    }
}
