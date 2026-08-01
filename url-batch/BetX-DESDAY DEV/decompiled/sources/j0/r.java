package j0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2961a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f2962b;

    public /* synthetic */ r() {
    }

    @Override // j0.n, j0.k
    public void c(m mVar) {
        switch (this.f2961a) {
            case 1:
                C0178a c0178a = (C0178a) this.f2962b;
                if (!c0178a.f2898D) {
                    c0178a.G();
                    c0178a.f2898D = true;
                    break;
                }
                break;
        }
    }

    @Override // j0.k
    public final void d(m mVar) {
        switch (this.f2961a) {
            case 0:
                this.f2962b.z();
                mVar.x(this);
                break;
            default:
                C0178a c0178a = (C0178a) this.f2962b;
                int i = c0178a.f2897C - 1;
                c0178a.f2897C = i;
                if (i == 0) {
                    c0178a.f2898D = false;
                    c0178a.m();
                }
                mVar.x(this);
                break;
        }
    }

    public r(m mVar) {
        this.f2962b = mVar;
    }
}
