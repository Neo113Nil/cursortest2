package w1;

import G1.AbstractC0001b;
import i1.InterfaceC0181a;
import r1.AbstractC0369t;

/* loaded from: classes.dex */
public final /* synthetic */ class i extends j1.b implements InterfaceC0181a, o1.a {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4481g;

    public i(j jVar) {
        super(jVar, AbstractC0369t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f4481g = false;
    }

    public final o1.a b() {
        if (!this.f4481g) {
            o1.a aVar = this.f3170a;
            if (aVar != null) {
                return aVar;
            }
            j1.l.f3186a.getClass();
            this.f3170a = this;
        }
        return this;
    }

    @Override // i1.InterfaceC0181a
    public final Object c() {
        return this.f3171b.getClass().getSimpleName();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return a().equals(iVar.a()) && this.f3173d.equals(iVar.f3173d) && this.e.equals(iVar.e) && this.f3171b.equals(iVar.f3171b);
        }
        if (obj instanceof i) {
            return obj.equals(b());
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.f3173d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        o1.a b2 = b();
        return b2 != this ? b2.toString() : AbstractC0001b.g(new StringBuilder("property "), this.f3173d, " (Kotlin reflection is not available)");
    }
}
