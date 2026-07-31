package L0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f2678c = new e(d.f2676b, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2680b;

    public e(float f3, int i3) {
        this.f2679a = f3;
        this.f2680b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        float f3 = eVar.f2679a;
        float f4 = d.f2675a;
        return Float.compare(this.f2679a, f3) == 0 && this.f2680b == eVar.f2680b;
    }

    public final int hashCode() {
        float f3 = d.f2675a;
        return Integer.hashCode(this.f2680b) + (Float.hashCode(this.f2679a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f3 = this.f2679a;
        if (f3 == 0.0f) {
            float f4 = d.f2675a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f3 == d.f2675a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f3 == d.f2676b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f3 == d.f2677c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i3 = this.f2680b;
        sb.append((Object) (i3 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i3 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i3 == 17 ? "LineHeightStyle.Trim.Both" : i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
