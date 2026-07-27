package o2;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922a extends o {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8915i;

    public C0922a(Boolean bool, s sVar) {
        super(sVar);
        this.f8915i = bool.booleanValue();
    }

    @Override // o2.o
    public final int e(o oVar) {
        boolean z4 = ((C0922a) oVar).f8915i;
        boolean z5 = this.f8915i;
        if (z5 == z4) {
            return 0;
        }
        return z5 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0922a)) {
            return false;
        }
        C0922a c0922a = (C0922a) obj;
        return this.f8915i == c0922a.f8915i && this.f8945d.equals(c0922a.f8945d);
    }

    @Override // o2.s
    public final s f(s sVar) {
        return new C0922a(Boolean.valueOf(this.f8915i), sVar);
    }

    @Override // o2.s
    public final Object getValue() {
        return Boolean.valueOf(this.f8915i);
    }

    @Override // o2.o
    public final int h() {
        return 2;
    }

    public final int hashCode() {
        return this.f8945d.hashCode() + (this.f8915i ? 1 : 0);
    }

    @Override // o2.s
    public final String u(int i2) {
        return j(i2) + "boolean:" + this.f8915i;
    }
}
