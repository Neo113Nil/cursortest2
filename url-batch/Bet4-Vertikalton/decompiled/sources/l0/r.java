package l0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3110a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f3111b;

    public /* synthetic */ r() {
    }

    @Override // l0.k
    public final void c(m mVar) {
        switch (this.f3110a) {
            case 0:
                this.f3111b.z();
                mVar.x(this);
                break;
            default:
                C0253a c0253a = (C0253a) this.f3111b;
                int i = c0253a.f3050C - 1;
                c0253a.f3050C = i;
                if (i == 0) {
                    c0253a.f3051D = false;
                    c0253a.m();
                }
                mVar.x(this);
                break;
        }
    }

    @Override // l0.n, l0.k
    public void d(m mVar) {
        switch (this.f3110a) {
            case 1:
                C0253a c0253a = (C0253a) this.f3111b;
                if (!c0253a.f3051D) {
                    c0253a.G();
                    c0253a.f3051D = true;
                    break;
                }
                break;
        }
    }

    public r(m mVar) {
        this.f3111b = mVar;
    }
}
