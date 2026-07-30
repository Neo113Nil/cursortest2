package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: h, reason: collision with root package name */
    public final String f8926h;

    public v(String str, s sVar) {
        super(sVar);
        this.f8926h = str;
    }

    @Override // t5.o
    public final int a(o oVar) {
        return this.f8926h.compareTo(((v) oVar).f8926h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f8926h.equals(vVar.f8926h) && this.f8914f.equals(vVar.f8914f);
    }

    @Override // t5.s
    public final String f(int i7) {
        int d8 = l.h.d(i7);
        String str = this.f8926h;
        if (d8 == 0) {
            return m(i7) + "string:" + str;
        }
        if (d8 != 1) {
            throw new IllegalArgumentException("Invalid hash version for string node: ".concat(r6.i.g(i7)));
        }
        return m(i7) + "string:" + o5.j.f(str);
    }

    @Override // t5.o
    public final int g() {
        return 4;
    }

    @Override // t5.s
    public final Object getValue() {
        return this.f8926h;
    }

    public final int hashCode() {
        return this.f8914f.hashCode() + this.f8926h.hashCode();
    }

    @Override // t5.s
    public final s n(s sVar) {
        return new v(this.f8926h, sVar);
    }
}
