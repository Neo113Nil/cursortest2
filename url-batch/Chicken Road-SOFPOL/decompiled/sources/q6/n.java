package q6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class n extends c implements w6.d {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6200j;

    public n(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f6200j = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return e().equals(nVar.e()) && this.f6191g.equals(nVar.f6191g) && this.f6192h.equals(nVar.f6192h) && i.a(this.f6189e, nVar.f6189e);
        }
        if (obj instanceof w6.d) {
            return obj.equals(f());
        }
        return false;
    }

    public final w6.a f() {
        if (this.f6200j) {
            return this;
        }
        w6.a aVar = this.f6188d;
        if (aVar != null) {
            return aVar;
        }
        w6.a a8 = a();
        this.f6188d = a8;
        return a8;
    }

    public final int hashCode() {
        return this.f6192h.hashCode() + ((this.f6191g.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        w6.a f6 = f();
        if (f6 != this) {
            return f6.toString();
        }
        return "property " + this.f6191g + " (Kotlin reflection is not available)";
    }
}
