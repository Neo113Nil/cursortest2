package e0;

/* loaded from: classes.dex */
public abstract class g extends c implements f, h0.a, U.a {

    /* renamed from: h, reason: collision with root package name */
    public final int f555h;

    /* renamed from: i, reason: collision with root package name */
    public final int f556i;

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f555h = i2;
        this.f556i = 0;
    }

    public final h0.a c() {
        l.f561a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f548e.equals(gVar.f548e) && this.f549f.equals(gVar.f549f) && this.f556i == gVar.f556i && this.f555h == gVar.f555h && this.f546c.equals(gVar.f546c) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        h0.a aVar = this.f545b;
        if (aVar == null) {
            c();
            this.f545b = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // e0.f
    public final int f() {
        return this.f555h;
    }

    public final int hashCode() {
        b();
        return this.f549f.hashCode() + ((this.f548e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h0.a aVar = this.f545b;
        if (aVar == null) {
            c();
            this.f545b = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f548e;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
