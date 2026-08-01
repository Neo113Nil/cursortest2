package p0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3868a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f3869b;

    public /* synthetic */ r() {
    }

    @Override // p0.n, p0.k
    public void b(m mVar) {
        switch (this.f3868a) {
            case 1:
                C0325a c0325a = (C0325a) this.f3869b;
                if (!c0325a.f3809D) {
                    c0325a.G();
                    c0325a.f3809D = true;
                    break;
                }
                break;
        }
    }

    @Override // p0.k
    public final void c(m mVar) {
        switch (this.f3868a) {
            case 0:
                this.f3869b.z();
                mVar.x(this);
                break;
            default:
                C0325a c0325a = (C0325a) this.f3869b;
                int i = c0325a.f3808C - 1;
                c0325a.f3808C = i;
                if (i == 0) {
                    c0325a.f3809D = false;
                    c0325a.m();
                }
                mVar.x(this);
                break;
        }
    }

    public r(m mVar) {
        this.f3869b = mVar;
    }
}
