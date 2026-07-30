package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final w.z f60a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63d;

    public f0(w.z zVar, long j8, int i7, boolean z8) {
        this.f60a = zVar;
        this.f61b = j8;
        this.f62c = i7;
        this.f63d = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f60a == f0Var.f60a && y0.c.b(this.f61b, f0Var.f61b) && this.f62c == f0Var.f62c && this.f63d == f0Var.f63d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63d) + ((l.h.d(this.f62c) + m.d(this.f60a.hashCode() * 31, 31, this.f61b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f60a);
        sb.append(", position=");
        sb.append((Object) y0.c.j(this.f61b));
        sb.append(", anchor=");
        int i7 = this.f62c;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        sb.append(this.f63d);
        sb.append(')');
        return sb.toString();
    }
}
