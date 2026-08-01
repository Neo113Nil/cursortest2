package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f10036d = new i(f.f10031c, 17, 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f10037a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10038b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10039c;

    public i(float f3, int i3, int i10) {
        this.f10037a = f3;
        this.f10038b = i3;
        this.f10039c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f3 = iVar.f10037a;
        float f10 = f.f10030b;
        return Float.compare(this.f10037a, f3) == 0 && this.f10038b == iVar.f10038b && this.f10039c == iVar.f10039c;
    }

    public final int hashCode() {
        float f3 = f.f10030b;
        return Integer.hashCode(this.f10039c) + v4.a.x(this.f10038b, Float.hashCode(this.f10037a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f10037a));
        sb2.append(", trim=");
        String str = "Invalid";
        int i3 = this.f10038b;
        sb2.append((Object) (i3 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i3 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i3 == 17 ? "LineHeightStyle.Trim.Both" : i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb2.append(",mode=");
        int i10 = this.f10039c;
        if (i10 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i10 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i10 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
