package k0;

/* renamed from: k0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196r extends AbstractC0192n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2816a = 1;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0191m f2817b;

    public /* synthetic */ C0196r() {
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
        switch (this.f2816a) {
            case 0:
                this.f2817b.z();
                abstractC0191m.x(this);
                break;
            default:
                C0179a c0179a = (C0179a) this.f2817b;
                int i = c0179a.f2756C - 1;
                c0179a.f2756C = i;
                if (i == 0) {
                    c0179a.f2757D = false;
                    c0179a.m();
                }
                abstractC0191m.x(this);
                break;
        }
    }

    @Override // k0.AbstractC0192n, k0.InterfaceC0189k
    public void d(AbstractC0191m abstractC0191m) {
        switch (this.f2816a) {
            case 1:
                C0179a c0179a = (C0179a) this.f2817b;
                if (!c0179a.f2757D) {
                    c0179a.G();
                    c0179a.f2757D = true;
                    break;
                }
                break;
        }
    }

    public C0196r(AbstractC0191m abstractC0191m) {
        this.f2817b = abstractC0191m;
    }
}
