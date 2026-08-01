package m0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3198a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f3199b;

    public /* synthetic */ r() {
    }

    @Override // m0.k
    public final void c(m mVar) {
        switch (this.f3198a) {
            case 0:
                this.f3199b.z();
                mVar.x(this);
                break;
            default:
                C0234a c0234a = (C0234a) this.f3199b;
                int i = c0234a.f3137C - 1;
                c0234a.f3137C = i;
                if (i == 0) {
                    c0234a.f3138D = false;
                    c0234a.m();
                }
                mVar.x(this);
                break;
        }
    }

    @Override // m0.n, m0.k
    public void e(m mVar) {
        switch (this.f3198a) {
            case 1:
                C0234a c0234a = (C0234a) this.f3199b;
                if (!c0234a.f3138D) {
                    c0234a.G();
                    c0234a.f3138D = true;
                    break;
                }
                break;
        }
    }

    public r(m mVar) {
        this.f3199b = mVar;
    }
}
