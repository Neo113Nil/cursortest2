package L0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f3503c = new g(f.f3501b, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f3504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3505b;

    public g(float f4, int i2) {
        this.f3504a = f4;
        this.f3505b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f4 = gVar.f3504a;
        float f5 = f.f3500a;
        return Float.compare(this.f3504a, f4) == 0 && this.f3505b == gVar.f3505b;
    }

    public final int hashCode() {
        float f4 = f.f3500a;
        return Integer.hashCode(this.f3505b) + (Float.hashCode(this.f3504a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f4 = this.f3504a;
        if (f4 == 0.0f) {
            float f5 = f.f3500a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f4 == f.f3500a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f4 == f.f3501b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f4 == f.f3502c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f4 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i2 = this.f3505b;
        sb.append((Object) (i2 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i2 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i2 == 17 ? "LineHeightStyle.Trim.Both" : i2 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
