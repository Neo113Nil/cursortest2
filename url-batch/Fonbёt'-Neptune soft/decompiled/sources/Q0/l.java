package Q0;

/* loaded from: classes.dex */
public abstract class l extends c implements V0.c {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f980k;

    public l(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f980k = false;
    }

    public final V0.a c() {
        if (this.f980k) {
            return this;
        }
        V0.a aVar = this.f965e;
        if (aVar != null) {
            return aVar;
        }
        V0.a a2 = a();
        this.f965e = a2;
        return a2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return b().equals(lVar.b()) && this.f968h.equals(lVar.f968h) && this.f969i.equals(lVar.f969i) && this.f966f.equals(lVar.f966f);
        }
        if (obj instanceof V0.c) {
            return obj.equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f969i.hashCode() + ((this.f968h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        V0.a c2 = c();
        if (c2 != this) {
            return c2.toString();
        }
        return "property " + this.f968h + " (Kotlin reflection is not available)";
    }
}
