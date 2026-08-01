package p0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3703a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f3704b;

    public /* synthetic */ r() {
    }

    @Override // p0.n, p0.k
    public void b(m mVar) {
        switch (this.f3703a) {
            case 1:
                C0299a c0299a = (C0299a) this.f3704b;
                if (!c0299a.f3644D) {
                    c0299a.G();
                    c0299a.f3644D = true;
                    break;
                }
                break;
        }
    }

    @Override // p0.k
    public final void c(m mVar) {
        switch (this.f3703a) {
            case 0:
                this.f3704b.z();
                mVar.x(this);
                break;
            default:
                C0299a c0299a = (C0299a) this.f3704b;
                int i = c0299a.f3643C - 1;
                c0299a.f3643C = i;
                if (i == 0) {
                    c0299a.f3644D = false;
                    c0299a.m();
                }
                mVar.x(this);
                break;
        }
    }

    public r(m mVar) {
        this.f3704b = mVar;
    }
}
