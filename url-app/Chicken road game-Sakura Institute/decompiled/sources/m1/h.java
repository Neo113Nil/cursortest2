package m1;

/* loaded from: classes.dex */
public final /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f8278b;

    public /* synthetic */ h(k kVar, int i2) {
        this.f8277a = i2;
        this.f8278b = kVar;
    }

    public final void a(Object obj) {
        switch (this.f8277a) {
            case 0:
                k kVar = this.f8278b;
                kVar.getClass();
                kVar.c(false);
                break;
            case 1:
                k kVar2 = this.f8278b;
                kVar2.getClass();
                if (((Integer) obj).intValue() == 80) {
                    kVar2.e(false);
                    break;
                }
                break;
            case 2:
                k kVar3 = this.f8278b;
                kVar3.getClass();
                kVar3.f(((S0.b) obj).f3998a, false);
                break;
            default:
                k kVar4 = this.f8278b;
                kVar4.getClass();
                kVar4.i(((S0.o) obj).f4023a, false);
                break;
        }
    }
}
