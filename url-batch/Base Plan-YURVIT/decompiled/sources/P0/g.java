package P0;

/* loaded from: classes.dex */
public abstract class g extends c implements f, T0.a, D0.a {

    /* renamed from: k, reason: collision with root package name */
    public final int f799k;

    /* renamed from: l, reason: collision with root package name */
    public final int f800l;

    public g(int i2, Class cls, String str, String str2, int i3) {
        this(i2, b.f790e, cls, str, str2, i3);
    }

    @Override // P0.c
    public final T0.a a() {
        p.f808a.getClass();
        return this;
    }

    @Override // P0.f
    public final int c() {
        return this.f799k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f794h.equals(gVar.f794h) && this.f795i.equals(gVar.f795i) && this.f800l == gVar.f800l && this.f799k == gVar.f799k && this.f792f.equals(gVar.f792f) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        T0.a aVar = this.f791e;
        if (aVar == null) {
            a();
            this.f791e = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        b();
        return this.f795i.hashCode() + ((this.f794h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        T0.a aVar = this.f791e;
        if (aVar == null) {
            a();
            this.f791e = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f794h;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f799k = i2;
        this.f800l = 0;
    }
}
