package j1;

/* loaded from: classes.dex */
public abstract class g extends b implements f, o1.a, W0.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f3179g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3180h;

    public g(int i, Class cls, String str, String str2, int i2) {
        this(i, C0197a.f3169a, cls, str, str2, i2);
    }

    public final o1.a b() {
        l.f3186a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f3173d.equals(gVar.f3173d) && this.e.equals(gVar.e) && this.f3180h == gVar.f3180h && this.f3179g == gVar.f3179g && this.f3171b.equals(gVar.f3171b) && a().equals(gVar.a());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        o1.a aVar = this.f3170a;
        if (aVar == null) {
            b();
            this.f3170a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // j1.f
    public final int f() {
        return this.f3179g;
    }

    public final int hashCode() {
        a();
        return this.e.hashCode() + ((this.f3173d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        o1.a aVar = this.f3170a;
        if (aVar == null) {
            b();
            this.f3170a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f3173d;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f3179g = i;
        this.f3180h = 0;
    }
}
