package l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f5870c = new g(f.f5868b, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f5871a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5872b;

    public g(float f9, int i7) {
        this.f5871a = f9;
        this.f5872b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f9 = gVar.f5871a;
        float f10 = f.f5867a;
        return Float.compare(this.f5871a, f9) == 0 && this.f5872b == gVar.f5872b;
    }

    public final int hashCode() {
        float f9 = f.f5867a;
        return Integer.hashCode(this.f5872b) + (Float.hashCode(this.f5871a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f9 = this.f5871a;
        if (f9 == 0.0f) {
            float f10 = f.f5867a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f9 == f.f5867a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f9 == f.f5868b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f9 == f.f5869c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f9 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i7 = this.f5872b;
        sb.append((Object) (i7 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i7 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i7 == 17 ? "LineHeightStyle.Trim.Both" : i7 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
