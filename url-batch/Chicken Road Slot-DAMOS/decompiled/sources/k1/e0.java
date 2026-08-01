package k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f5315d = new e0(v.c(4278190080L), 0, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f5316a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5317b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5318c;

    public e0(long j, long j3, float f3) {
        this.f5316a = j;
        this.f5317b = j3;
        this.f5318c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p.c(this.f5316a, e0Var.f5316a) && j1.b.a(this.f5317b, e0Var.f5317b) && this.f5318c == e0Var.f5318c;
    }

    public final int hashCode() {
        int i3 = p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        return Float.hashCode(this.f5318c) + n0.l.c(Long.hashCode(this.f5316a) * 31, 31, this.f5317b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        v4.a.t(this.f5316a, sb2, ", offset=");
        sb2.append((Object) j1.b.e(this.f5317b));
        sb2.append(", blurRadius=");
        return v4.a.l(sb2, this.f5318c, ')');
    }
}
