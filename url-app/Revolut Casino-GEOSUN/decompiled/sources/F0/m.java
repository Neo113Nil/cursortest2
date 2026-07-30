package F0;

/* loaded from: classes.dex */
public abstract class m extends c implements J0.c {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f321k;

    public m(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f321k = false;
    }

    public final J0.a c() {
        if (this.f321k) {
            return this;
        }
        J0.a aVar = this.f306e;
        if (aVar != null) {
            return aVar;
        }
        J0.a a2 = a();
        this.f306e = a2;
        return a2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return b().equals(mVar.b()) && this.f309h.equals(mVar.f309h) && this.f310i.equals(mVar.f310i) && this.f307f.equals(mVar.f307f);
        }
        if (obj instanceof J0.c) {
            return obj.equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f310i.hashCode() + ((this.f309h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        J0.a c2 = c();
        if (c2 != this) {
            return c2.toString();
        }
        return "property " + this.f309h + " (Kotlin reflection is not available)";
    }
}
