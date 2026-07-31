package W0;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class O extends U {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f921i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f922j;

    public /* synthetic */ O(int i2, Object obj) {
        this.f921i = i2;
        this.f922j = obj;
    }

    @Override // O0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        switch (this.f921i) {
            case 0:
                p((Throwable) obj);
                break;
            default:
                p((Throwable) obj);
                break;
        }
        return D0.h.f206a;
    }

    @Override // W0.U
    public final void p(Throwable th) {
        switch (this.f921i) {
            case 0:
                ((O0.l) this.f922j).j(th);
                break;
            default:
                V v2 = (V) this.f922j;
                Object D2 = o().D();
                if (!(D2 instanceof C0074n)) {
                    v2.g(AbstractC0081v.k(D2));
                    break;
                } else {
                    v2.g(AbstractC0086a.l(((C0074n) D2).f965a));
                    break;
                }
        }
    }
}
