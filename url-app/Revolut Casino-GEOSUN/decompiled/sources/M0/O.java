package M0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class O extends U {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f632i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f633j;

    public /* synthetic */ O(int i2, Object obj) {
        this.f632i = i2;
        this.f633j = obj;
    }

    @Override // E0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        switch (this.f632i) {
            case 0:
                o((Throwable) obj);
                break;
            default:
                o((Throwable) obj);
                break;
        }
        return C0247g.f3005a;
    }

    @Override // M0.U
    public final void o(Throwable th) {
        switch (this.f632i) {
            case 0:
                ((E0.l) this.f633j).i(th);
                break;
            default:
                Object C2 = n().C();
                boolean z2 = C2 instanceof C0056n;
                V v2 = (V) this.f633j;
                if (!z2) {
                    v2.resumeWith(AbstractC0063v.l(C2));
                    break;
                } else {
                    v2.resumeWith(o.g.f(((C0056n) C2).f676a));
                    break;
                }
        }
    }
}
