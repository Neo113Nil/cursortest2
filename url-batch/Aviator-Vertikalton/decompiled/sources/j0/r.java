package j0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2957a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f2958b;

    public /* synthetic */ r() {
    }

    @Override // j0.n, j0.k
    public void c(m mVar) {
        switch (this.f2957a) {
            case 1:
                C0176a c0176a = (C0176a) this.f2958b;
                if (!c0176a.f2894D) {
                    c0176a.G();
                    c0176a.f2894D = true;
                    break;
                }
                break;
        }
    }

    @Override // j0.k
    public final void d(m mVar) {
        switch (this.f2957a) {
            case 0:
                this.f2958b.z();
                mVar.x(this);
                break;
            default:
                C0176a c0176a = (C0176a) this.f2958b;
                int i = c0176a.f2893C - 1;
                c0176a.f2893C = i;
                if (i == 0) {
                    c0176a.f2894D = false;
                    c0176a.m();
                }
                mVar.x(this);
                break;
        }
    }

    public r(m mVar) {
        this.f2958b = mVar;
    }
}
