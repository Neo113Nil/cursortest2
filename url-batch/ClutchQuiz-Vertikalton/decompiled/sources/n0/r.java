package n0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3193a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f3194b;

    public /* synthetic */ r() {
    }

    @Override // n0.k
    public final void b(m mVar) {
        switch (this.f3193a) {
            case 0:
                this.f3194b.z();
                mVar.x(this);
                break;
            default:
                C0258a c0258a = (C0258a) this.f3194b;
                int i = c0258a.f3133C - 1;
                c0258a.f3133C = i;
                if (i == 0) {
                    c0258a.f3134D = false;
                    c0258a.m();
                }
                mVar.x(this);
                break;
        }
    }

    @Override // n0.n, n0.k
    public void d(m mVar) {
        switch (this.f3193a) {
            case 1:
                C0258a c0258a = (C0258a) this.f3194b;
                if (!c0258a.f3134D) {
                    c0258a.G();
                    c0258a.f3134D = true;
                    break;
                }
                break;
        }
    }

    public r(m mVar) {
        this.f3194b = mVar;
    }
}
