package Q0;

/* loaded from: classes.dex */
public abstract class g extends c implements f, V0.a, F0.a {

    /* renamed from: k, reason: collision with root package name */
    public final int f975k;

    /* renamed from: l, reason: collision with root package name */
    public final int f976l;

    public g(int i2, Class cls, String str, String str2, int i3) {
        this(i2, b.f964e, cls, str, str2, i3);
    }

    @Override // Q0.c
    public final V0.a a() {
        p.f984a.getClass();
        return this;
    }

    @Override // Q0.f
    public final int d() {
        return this.f975k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f968h.equals(gVar.f968h) && this.f969i.equals(gVar.f969i) && this.f976l == gVar.f976l && this.f975k == gVar.f975k && this.f966f.equals(gVar.f966f) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        V0.a aVar = this.f965e;
        if (aVar == null) {
            a();
            this.f965e = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        b();
        return this.f969i.hashCode() + ((this.f968h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        V0.a aVar = this.f965e;
        if (aVar == null) {
            a();
            this.f965e = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f968h;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f975k = i2;
        this.f976l = 0;
    }
}
