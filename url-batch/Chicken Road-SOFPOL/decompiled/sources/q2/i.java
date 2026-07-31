package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f6049c = new i(17, f.f6045c);

    /* renamed from: a, reason: collision with root package name */
    public final float f6050a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6051b;

    public i(int i, float f6) {
        this.f6050a = f6;
        this.f6051b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f6 = iVar.f6050a;
        float f8 = f.f6044b;
        return Float.compare(this.f6050a, f6) == 0 && this.f6051b == iVar.f6051b;
    }

    public final int hashCode() {
        float f6 = f.f6044b;
        return Integer.hashCode(0) + a0.q.b(this.f6051b, Float.hashCode(this.f6050a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.f6050a));
        sb.append(", trim=");
        int i = this.f6051b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
