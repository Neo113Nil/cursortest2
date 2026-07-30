package D5;

/* loaded from: classes.dex */
public class o implements J4.i, J4.m, J4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f374a;

    /* renamed from: b, reason: collision with root package name */
    public final m f375b;

    public o(u uVar, String str, int i2) {
        this.f374a = i2;
        switch (i2) {
            case 1:
                this.f375b = new m(str, n.f368d, 1, uVar);
                break;
            case 2:
                this.f375b = new m(str, n.f369e, 1, uVar);
                break;
            default:
                this.f375b = new m(str, n.f372m, 2, uVar);
                break;
        }
    }

    @Override // J4.i
    public J4.n a() {
        m mVar = this.f375b;
        return new p(mVar.f362b, mVar.f361a, mVar.f366f, mVar.f367g, mVar.f365e);
    }

    @Override // J4.p
    /* renamed from: b, reason: collision with other method in class */
    public J4.p mo0b(String str) {
        this.f375b.f366f = str;
        return this;
    }

    @Override // J4.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public r build() {
        return (r) this.f375b.a(new A4.c(5));
    }

    @Override // J4.p
    /* renamed from: d, reason: collision with other method in class */
    public J4.p mo2d(String str) {
        this.f375b.f367g = str;
        return this;
    }

    public final String toString() {
        switch (this.f374a) {
            case 0:
                return this.f375b.c(getClass().getSimpleName());
            case 1:
                return this.f375b.c(getClass().getSimpleName());
            default:
                return this.f375b.c(getClass().getSimpleName());
        }
    }

    /* renamed from: build, reason: collision with other method in class */
    public J4.o mo1build() {
        return (J4.o) this.f375b.a(new A4.c(6));
    }

    @Override // J4.m
    public J4.m b(String str) {
        this.f375b.f366f = str;
        return this;
    }

    @Override // J4.m
    public J4.m d(String str) {
        this.f375b.f367g = str;
        return this;
    }
}
