package m0;

/* loaded from: classes.dex */
public final class q extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3305a = 1;

    /* renamed from: b, reason: collision with root package name */
    public l f3306b;

    public /* synthetic */ q() {
    }

    @Override // m0.j
    public final void c(l lVar) {
        switch (this.f3305a) {
            case 0:
                this.f3306b.z();
                lVar.x(this);
                break;
            default:
                C0258a c0258a = (C0258a) this.f3306b;
                int i = c0258a.f3244C - 1;
                c0258a.f3244C = i;
                if (i == 0) {
                    c0258a.f3245D = false;
                    c0258a.m();
                }
                lVar.x(this);
                break;
        }
    }

    @Override // m0.m, m0.j
    public void e(l lVar) {
        switch (this.f3305a) {
            case 1:
                C0258a c0258a = (C0258a) this.f3306b;
                if (!c0258a.f3245D) {
                    c0258a.G();
                    c0258a.f3245D = true;
                    break;
                }
                break;
        }
    }

    public q(l lVar) {
        this.f3306b = lVar;
    }
}
