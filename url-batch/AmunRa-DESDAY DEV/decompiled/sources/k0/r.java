package k0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2750a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f2751b;

    public /* synthetic */ r() {
    }

    @Override // k0.k
    public final void b(m mVar) {
        switch (this.f2750a) {
            case 0:
                this.f2751b.z();
                mVar.x(this);
                break;
            default:
                C0177a c0177a = (C0177a) this.f2751b;
                int i = c0177a.f2690C - 1;
                c0177a.f2690C = i;
                if (i == 0) {
                    c0177a.f2691D = false;
                    c0177a.m();
                }
                mVar.x(this);
                break;
        }
    }

    @Override // k0.n, k0.k
    public void d(m mVar) {
        switch (this.f2750a) {
            case 1:
                C0177a c0177a = (C0177a) this.f2751b;
                if (!c0177a.f2691D) {
                    c0177a.G();
                    c0177a.f2691D = true;
                    break;
                }
                break;
        }
    }

    public r(m mVar) {
        this.f2751b = mVar;
    }
}
