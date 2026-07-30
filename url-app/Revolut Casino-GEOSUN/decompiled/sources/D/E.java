package D;

import u0.C0242b;
import u0.C0247g;

/* loaded from: classes.dex */
public final class E extends y0.f implements E0.l {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f72i;

    /* renamed from: j, reason: collision with root package name */
    public int f73j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f74k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(S s2, w0.d dVar) {
        super(1, dVar);
        this.f74k = s2;
    }

    @Override // E0.l
    public final Object i(Object obj) {
        return new E(this.f74k, (w0.d) obj).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        Throwable th;
        m0 m0Var;
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f73j;
        S s2 = this.f74k;
        try {
        } catch (Throwable th2) {
            l0 g2 = s2.g();
            this.f72i = th2;
            this.f73j = 2;
            Integer a2 = g2.a();
            if (a2 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a2;
        }
        if (i2 == 0) {
            o.g.z(obj);
            this.f73j = 1;
            obj = S.f(s2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f72i;
                o.g.z(obj);
                m0Var = new f0(th, ((Number) obj).intValue());
                return new C0242b(m0Var, Boolean.TRUE);
            }
            o.g.z(obj);
        }
        m0Var = (m0) obj;
        return new C0242b(m0Var, Boolean.TRUE);
    }
}
