package k0;

/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2763a = 1;

    /* renamed from: b, reason: collision with root package name */
    public n f2764b;

    public /* synthetic */ s() {
    }

    @Override // k0.l
    public final void b(n nVar) {
        switch (this.f2763a) {
            case 0:
                this.f2764b.z();
                nVar.x(this);
                break;
            default:
                C0180a c0180a = (C0180a) this.f2764b;
                int i = c0180a.f2700C - 1;
                c0180a.f2700C = i;
                if (i == 0) {
                    c0180a.f2701D = false;
                    c0180a.m();
                }
                nVar.x(this);
                break;
        }
    }

    @Override // k0.o, k0.l
    public void d(n nVar) {
        switch (this.f2763a) {
            case 1:
                C0180a c0180a = (C0180a) this.f2764b;
                if (!c0180a.f2701D) {
                    c0180a.G();
                    c0180a.f2701D = true;
                    break;
                }
                break;
        }
    }

    public s(n nVar) {
        this.f2764b = nVar;
    }
}
