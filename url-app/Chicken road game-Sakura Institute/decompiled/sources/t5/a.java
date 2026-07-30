package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8884h;

    public a(Boolean bool, s sVar) {
        super(sVar);
        this.f8884h = bool.booleanValue();
    }

    @Override // t5.o
    public final int a(o oVar) {
        boolean z8 = ((a) oVar).f8884h;
        boolean z9 = this.f8884h;
        if (z9 == z8) {
            return 0;
        }
        return z9 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8884h == aVar.f8884h && this.f8914f.equals(aVar.f8914f);
    }

    @Override // t5.s
    public final String f(int i7) {
        return m(i7) + "boolean:" + this.f8884h;
    }

    @Override // t5.o
    public final int g() {
        return 2;
    }

    @Override // t5.s
    public final Object getValue() {
        return Boolean.valueOf(this.f8884h);
    }

    public final int hashCode() {
        return this.f8914f.hashCode() + (this.f8884h ? 1 : 0);
    }

    @Override // t5.s
    public final s n(s sVar) {
        return new a(Boolean.valueOf(this.f8884h), sVar);
    }
}
