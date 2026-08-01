package k0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2796a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f2797b;

    public /* synthetic */ r() {
    }

    @Override // k0.k
    public final void b(m mVar) {
        switch (this.f2796a) {
            case 0:
                this.f2797b.z();
                mVar.x(this);
                break;
            default:
                C0172a c0172a = (C0172a) this.f2797b;
                int i = c0172a.f2736C - 1;
                c0172a.f2736C = i;
                if (i == 0) {
                    c0172a.f2737D = false;
                    c0172a.m();
                }
                mVar.x(this);
                break;
        }
    }

    @Override // k0.n, k0.k
    public void d(m mVar) {
        switch (this.f2796a) {
            case 1:
                C0172a c0172a = (C0172a) this.f2797b;
                if (!c0172a.f2737D) {
                    c0172a.G();
                    c0172a.f2737D = true;
                    break;
                }
                break;
        }
    }

    public r(m mVar) {
        this.f2797b = mVar;
    }
}
