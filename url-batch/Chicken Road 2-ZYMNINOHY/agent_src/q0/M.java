package q0;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f14854b;

    public /* synthetic */ M(U u4, int i4) {
        this.f14853a = i4;
        this.f14854b = u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14853a) {
            case 0:
                this.f14854b.f14892J = true;
                break;
            case 1:
                this.f14854b.A();
                break;
            default:
                U u4 = this.f14854b;
                if (!u4.f14897P) {
                    InterfaceC1382y interfaceC1382y = u4.f14913r;
                    interfaceC1382y.getClass();
                    interfaceC1382y.s(u4);
                    break;
                }
                break;
        }
    }
}
