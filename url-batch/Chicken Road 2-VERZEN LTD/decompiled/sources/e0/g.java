package e0;

/* loaded from: classes.dex */
public abstract class g extends c implements f, h0.a, U.a {

    /* renamed from: h, reason: collision with root package name */
    public final int f499h;

    /* renamed from: i, reason: collision with root package name */
    public final int f500i;

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f499h = i2;
        this.f500i = 0;
    }

    public final h0.a c() {
        l.f505a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f492e.equals(gVar.f492e) && this.f493f.equals(gVar.f493f) && this.f500i == gVar.f500i && this.f499h == gVar.f499h && this.f490c.equals(gVar.f490c) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        h0.a aVar = this.f489b;
        if (aVar == null) {
            c();
            this.f489b = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // e0.f
    public final int f() {
        return this.f499h;
    }

    public final int hashCode() {
        b();
        return this.f493f.hashCode() + ((this.f492e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h0.a aVar = this.f489b;
        if (aVar == null) {
            c();
            this.f489b = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f492e;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
