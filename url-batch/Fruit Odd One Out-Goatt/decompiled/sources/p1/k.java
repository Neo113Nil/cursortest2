package p1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final /* synthetic */ class k extends d1.c implements c1.a, h1.a {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1058h;

    public k(l lVar) {
        super(lVar, k1.t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f1058h = false;
    }

    @Override // c1.a
    public final Object a() {
        return this.f80c.getClass().getSimpleName();
    }

    public final h1.a d() {
        if (this.f1058h) {
            return this;
        }
        h1.a aVar = this.f79b;
        if (aVar != null) {
            return aVar;
        }
        d1.l.f95a.getClass();
        this.f79b = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return b().equals(kVar.b()) && this.f82e.equals(kVar.f82e) && this.f83f.equals(kVar.f83f) && this.f80c.equals(kVar.f80c);
        }
        if (obj instanceof k) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f83f.hashCode() + ((this.f82e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h1.a d2 = d();
        if (d2 != this) {
            return d2.toString();
        }
        return "property " + this.f82e + " (Kotlin reflection is not available)";
    }
}
