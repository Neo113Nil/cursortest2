package D0;

/* loaded from: classes.dex */
public final class B extends Q0.i implements P0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P.O f235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(P.O o2, int i2) {
        super(1);
        this.f234f = i2;
        this.f235g = o2;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        switch (this.f234f) {
            case 0:
                Object obj2 = ((F0.e) obj).f464e;
                Throwable a2 = F0.e.a(obj2);
                P.O o2 = this.f235g;
                if (a2 != null) {
                    o2.b(i1.a.L(a2));
                } else {
                    if (obj2 instanceof F0.d) {
                        obj2 = null;
                    }
                    o2.b(i1.a.u((Boolean) obj2));
                }
                break;
            default:
                Object obj3 = ((F0.e) obj).f464e;
                Throwable a3 = F0.e.a(obj3);
                P.O o3 = this.f235g;
                if (a3 != null) {
                    o3.b(i1.a.L(a3));
                } else {
                    if (obj3 instanceof F0.d) {
                        obj3 = null;
                    }
                    o3.b(i1.a.u((String) obj3));
                }
                break;
        }
        return F0.h.f469a;
    }
}
