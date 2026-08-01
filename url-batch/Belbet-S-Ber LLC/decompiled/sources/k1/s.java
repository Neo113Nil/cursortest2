package k1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2373a = 1;

    /* renamed from: b, reason: collision with root package name */
    public n f2374b;

    public /* synthetic */ s() {
    }

    @Override // k1.l
    public final void d(n nVar) {
        switch (this.f2373a) {
            case 0:
                this.f2374b.z();
                nVar.x(this);
                break;
            default:
                a aVar = (a) this.f2374b;
                int i = aVar.H - 1;
                aVar.H = i;
                if (i == 0) {
                    aVar.I = false;
                    aVar.m();
                }
                nVar.x(this);
                break;
        }
    }

    @Override // k1.o, k1.l
    public void f(n nVar) {
        switch (this.f2373a) {
            case 1:
                a aVar = (a) this.f2374b;
                if (!aVar.I) {
                    aVar.G();
                    aVar.I = true;
                    break;
                }
                break;
        }
    }

    public s(n nVar) {
        this.f2374b = nVar;
    }
}
