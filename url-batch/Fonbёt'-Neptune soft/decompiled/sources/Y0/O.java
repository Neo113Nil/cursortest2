package Y0;

/* loaded from: classes.dex */
public final class O extends U {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1175i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1176j;

    public /* synthetic */ O(int i2, Object obj) {
        this.f1175i = i2;
        this.f1176j = obj;
    }

    @Override // P0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        switch (this.f1175i) {
            case 0:
                o((Throwable) obj);
                break;
            default:
                o((Throwable) obj);
                break;
        }
        return F0.h.f469a;
    }

    @Override // Y0.U
    public final void o(Throwable th) {
        switch (this.f1175i) {
            case 0:
                ((P0.l) this.f1176j).i(th);
                break;
            default:
                Object E2 = n().E();
                boolean z2 = E2 instanceof C0120n;
                V v = (V) this.f1176j;
                if (!z2) {
                    v.j(AbstractC0127v.l(E2));
                    break;
                } else {
                    v.j(i1.a.b(((C0120n) E2).f1219a));
                    break;
                }
        }
    }
}
