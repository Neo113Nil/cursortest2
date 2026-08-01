package p0;

import k0.AbstractC0058t;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends e0.c implements d0.a, h0.a {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1159h;

    public k(l lVar) {
        super(lVar, AbstractC0058t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f1159h = false;
    }

    @Override // d0.a
    public final Object a() {
        return this.f546c.getClass().getSimpleName();
    }

    public final h0.a c() {
        if (!this.f1159h) {
            h0.a aVar = this.f545b;
            if (aVar != null) {
                return aVar;
            }
            e0.l.f561a.getClass();
            this.f545b = this;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return b().equals(kVar.b()) && this.f548e.equals(kVar.f548e) && this.f549f.equals(kVar.f549f) && this.f546c.equals(kVar.f546c);
        }
        if (obj instanceof k) {
            return obj.equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f549f.hashCode() + ((this.f548e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h0.a c2 = c();
        if (c2 != this) {
            return c2.toString();
        }
        return "property " + this.f548e + " (Kotlin reflection is not available)";
    }
}
