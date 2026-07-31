package P0;

/* loaded from: classes.dex */
public abstract class l extends c implements T0.c {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f804k;

    public l(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f804k = false;
    }

    public final T0.a d() {
        if (this.f804k) {
            return this;
        }
        T0.a aVar = this.f791e;
        if (aVar != null) {
            return aVar;
        }
        T0.a a2 = a();
        this.f791e = a2;
        return a2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return b().equals(lVar.b()) && this.f794h.equals(lVar.f794h) && this.f795i.equals(lVar.f795i) && this.f792f.equals(lVar.f792f);
        }
        if (obj instanceof T0.c) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f795i.hashCode() + ((this.f794h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        T0.a d2 = d();
        if (d2 != this) {
            return d2.toString();
        }
        return "property " + this.f794h + " (Kotlin reflection is not available)";
    }
}
