package d1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class g extends c implements f, h1.a, t0.a {

    /* renamed from: h, reason: collision with root package name */
    public final int f89h;

    /* renamed from: i, reason: collision with root package name */
    public final int f90i;

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f89h = i2;
        this.f90i = 0;
    }

    @Override // d1.f
    public final int c() {
        return this.f89h;
    }

    public final h1.a d() {
        l.f95a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f82e.equals(gVar.f82e) && this.f83f.equals(gVar.f83f) && this.f90i == gVar.f90i && this.f89h == gVar.f89h && this.f80c.equals(gVar.f80c) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        h1.a aVar = this.f79b;
        if (aVar == null) {
            d();
            this.f79b = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        b();
        return this.f83f.hashCode() + ((this.f82e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h1.a aVar = this.f79b;
        if (aVar == null) {
            d();
            this.f79b = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f82e;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
