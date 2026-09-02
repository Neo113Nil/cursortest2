package p0;

import k0.AbstractC0060t;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends e0.c implements d0.a, h0.a {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1151h;

    public k(l lVar) {
        super(lVar, AbstractC0060t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f1151h = false;
    }

    @Override // d0.a
    public final Object a() {
        return this.f490c.getClass().getSimpleName();
    }

    public final h0.a c() {
        if (!this.f1151h) {
            h0.a aVar = this.f489b;
            if (aVar != null) {
                return aVar;
            }
            e0.l.f505a.getClass();
            this.f489b = this;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return b().equals(kVar.b()) && this.f492e.equals(kVar.f492e) && this.f493f.equals(kVar.f493f) && this.f490c.equals(kVar.f490c);
        }
        if (obj instanceof k) {
            return obj.equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f493f.hashCode() + ((this.f492e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h0.a c2 = c();
        if (c2 != this) {
            return c2.toString();
        }
        return "property " + this.f492e + " (Kotlin reflection is not available)";
    }
}
