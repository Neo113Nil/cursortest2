package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: h, reason: collision with root package name */
    public final long f8916h;

    public p(Long l8, s sVar) {
        super(sVar);
        this.f8916h = l8.longValue();
    }

    @Override // t5.o
    public final int a(o oVar) {
        long j8 = ((p) oVar).f8916h;
        char[] cArr = o5.j.f6853a;
        long j9 = this.f8916h;
        if (j9 < j8) {
            return -1;
        }
        return j9 == j8 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f8916h == pVar.f8916h && this.f8914f.equals(pVar.f8914f);
    }

    @Override // t5.s
    public final String f(int i7) {
        return (m(i7) + "number:") + o5.j.a(this.f8916h);
    }

    @Override // t5.o
    public final int g() {
        return 3;
    }

    @Override // t5.s
    public final Object getValue() {
        return Long.valueOf(this.f8916h);
    }

    public final int hashCode() {
        long j8 = this.f8916h;
        return this.f8914f.hashCode() + ((int) (j8 ^ (j8 >>> 32)));
    }

    @Override // t5.s
    public final s n(s sVar) {
        return new p(Long.valueOf(this.f8916h), sVar);
    }
}
