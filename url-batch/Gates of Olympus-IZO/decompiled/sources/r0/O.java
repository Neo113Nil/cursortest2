package r0;

/* loaded from: classes.dex */
public final class O extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f7129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(P p, int i3) {
        super(2);
        this.f7128e = i3;
        this.f7129f = p;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7128e) {
            case 0:
                this.f7129f.a().f7179e = (I.r) obj2;
                break;
            case 1:
                t0.D d3 = (t0.D) obj;
                C0846t c0846t = new C0846t(this.f7129f.a(), (Y1.e) obj2);
                if (!Z1.i.a(d3.f7729r, c0846t)) {
                    d3.f7729r = c0846t;
                    d3.y();
                }
                break;
            default:
                t0.D d4 = (t0.D) obj;
                w wVar = d4.f7737z;
                P p = this.f7129f;
                if (wVar == null) {
                    wVar = new w(d4, p.f7130a);
                    d4.f7737z = wVar;
                }
                p.f7131b = wVar;
                p.a().e();
                w a3 = p.a();
                T t3 = a3.f7180f;
                T t4 = p.f7130a;
                if (t3 != t4) {
                    a3.f7180f = t4;
                    a3.f(false);
                    t0.D.R(a3.f7178d, false, 7);
                }
                break;
        }
        return L1.z.f2729a;
    }
}
