package l0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3138a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f3139b;

    public /* synthetic */ r() {
    }

    @Override // l0.k
    public final void c(m mVar) {
        switch (this.f3138a) {
            case 0:
                this.f3139b.z();
                mVar.x(this);
                break;
            default:
                C0256a c0256a = (C0256a) this.f3139b;
                int i = c0256a.f3078C - 1;
                c0256a.f3078C = i;
                if (i == 0) {
                    c0256a.f3079D = false;
                    c0256a.m();
                }
                mVar.x(this);
                break;
        }
    }

    @Override // l0.n, l0.k
    public void d(m mVar) {
        switch (this.f3138a) {
            case 1:
                C0256a c0256a = (C0256a) this.f3139b;
                if (!c0256a.f3079D) {
                    c0256a.G();
                    c0256a.f3079D = true;
                    break;
                }
                break;
        }
    }

    public r(m mVar) {
        this.f3139b = mVar;
    }
}
