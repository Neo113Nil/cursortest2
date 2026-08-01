package k0;

/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2812a = 1;

    /* renamed from: b, reason: collision with root package name */
    public n f2813b;

    public /* synthetic */ s() {
    }

    @Override // k0.l
    public final void b(n nVar) {
        switch (this.f2812a) {
            case 0:
                this.f2813b.z();
                nVar.x(this);
                break;
            default:
                C0179a c0179a = (C0179a) this.f2813b;
                int i = c0179a.f2749C - 1;
                c0179a.f2749C = i;
                if (i == 0) {
                    c0179a.f2750D = false;
                    c0179a.m();
                }
                nVar.x(this);
                break;
        }
    }

    @Override // k0.o, k0.l
    public void d(n nVar) {
        switch (this.f2812a) {
            case 1:
                C0179a c0179a = (C0179a) this.f2813b;
                if (!c0179a.f2750D) {
                    c0179a.G();
                    c0179a.f2750D = true;
                    break;
                }
                break;
        }
    }

    public s(n nVar) {
        this.f2813b = nVar;
    }
}
