package r6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class h extends b implements g, x6.a, d6.e {

    /* renamed from: l, reason: collision with root package name */
    public final int f7958l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7959m;

    public h(int i7, Class cls, String str, String str2, int i8) {
        this(i7, a.f7947f, cls, str, str2, i8, 0);
    }

    @Override // r6.g
    public final int b() {
        return this.f7958l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f7951i.equals(hVar.f7951i) && this.f7952j.equals(hVar.f7952j) && this.f7959m == hVar.f7959m && this.f7958l == hVar.f7958l && k.a(this.f7949g, hVar.f7949g) && h().equals(hVar.h());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        x6.a aVar = this.f7948f;
        if (aVar == null) {
            g();
            this.f7948f = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // r6.b
    public final x6.a g() {
        w.f7969a.getClass();
        return this;
    }

    public final int hashCode() {
        h();
        return this.f7952j.hashCode() + i.a(h().hashCode() * 31, 31, this.f7951i);
    }

    public final String toString() {
        x6.a aVar = this.f7948f;
        if (aVar == null) {
            g();
            this.f7948f = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f7951i;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a0.m.j("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f7958l = i7;
        this.f7959m = 0;
    }
}
