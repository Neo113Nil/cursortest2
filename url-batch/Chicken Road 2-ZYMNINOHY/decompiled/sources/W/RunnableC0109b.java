package W;

/* renamed from: W.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0109b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K3.n f3293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3294c;

    public /* synthetic */ RunnableC0109b(K3.n nVar, Object obj, int i4) {
        this.f3292a = i4;
        this.f3293b = nVar;
        this.f3294c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3292a) {
            case 0:
                K3.n nVar = this.f3293b;
                if (nVar.f1596b == 0) {
                    nVar.l(this.f3294c);
                    break;
                }
                break;
            default:
                K3.n nVar2 = this.f3293b;
                int i4 = nVar2.f1596b - 1;
                nVar2.f1596b = i4;
                if (i4 == 0) {
                    nVar2.l(this.f3294c);
                    break;
                }
                break;
        }
    }
}
