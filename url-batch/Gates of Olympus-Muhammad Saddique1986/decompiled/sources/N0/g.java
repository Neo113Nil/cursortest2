package N0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f3541c = new g(f.f3539b, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f3542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3543b;

    public g(float f3, int i3) {
        this.f3542a = f3;
        this.f3543b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f3 = gVar.f3542a;
        float f4 = f.f3538a;
        return Float.compare(this.f3542a, f3) == 0 && this.f3543b == gVar.f3543b;
    }

    public final int hashCode() {
        float f3 = f.f3538a;
        return Integer.hashCode(this.f3543b) + (Float.hashCode(this.f3542a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f3 = this.f3542a;
        if (f3 == 0.0f) {
            float f4 = f.f3538a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f3 == f.f3538a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f3 == f.f3539b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f3 == f.f3540c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i3 = this.f3543b;
        sb.append((Object) (i3 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i3 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i3 == 17 ? "LineHeightStyle.Trim.Both" : i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
