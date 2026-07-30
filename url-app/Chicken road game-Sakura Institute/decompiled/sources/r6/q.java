package r6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q extends b implements x6.e {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7963l;

    public q(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f7963l = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return h().equals(qVar.h()) && this.f7951i.equals(qVar.f7951i) && this.f7952j.equals(qVar.f7952j) && k.a(this.f7949g, qVar.f7949g);
        }
        if (obj instanceof x6.e) {
            return obj.equals(i());
        }
        return false;
    }

    public final int hashCode() {
        return this.f7952j.hashCode() + i.a(h().hashCode() * 31, 31, this.f7951i);
    }

    public final x6.a i() {
        if (this.f7963l) {
            return this;
        }
        x6.a aVar = this.f7948f;
        if (aVar != null) {
            return aVar;
        }
        x6.a g9 = g();
        this.f7948f = g9;
        return g9;
    }

    public final String toString() {
        x6.a i7 = i();
        return i7 != this ? i7.toString() : a0.m.m(new StringBuilder("property "), this.f7951i, " (Kotlin reflection is not available)");
    }
}
