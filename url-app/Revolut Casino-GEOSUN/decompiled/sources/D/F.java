package D;

import u0.C0242b;
import u0.C0247g;

/* loaded from: classes.dex */
public final class F extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f75i;

    /* renamed from: j, reason: collision with root package name */
    public int f76j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f77k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f78l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f79m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(S s2, int i2, w0.d dVar) {
        super(2, dVar);
        this.f78l = s2;
        this.f79m = i2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        F f2 = new F(this.f78l, this.f79m, dVar);
        f2.f77k = ((Boolean) obj).booleanValue();
        return f2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) b(bool, (w0.d) obj2)).l(C0247g.f3005a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // y0.b
    public final Object l(Object obj) {
        Throwable th;
        int i2;
        boolean z2;
        m0 m0Var;
        boolean z3;
        x0.a aVar = x0.a.f3094e;
        boolean z4 = this.f76j;
        S s2 = this.f78l;
        try {
        } catch (Throwable th2) {
            if (z4 != 0) {
                l0 g2 = s2.g();
                this.f75i = th2;
                this.f77k = z4;
                this.f76j = 2;
                Integer a2 = g2.a();
                if (a2 == aVar) {
                    return aVar;
                }
                z2 = z4;
                th = th2;
                obj = a2;
            } else {
                boolean z5 = z4;
                th = th2;
                i2 = this.f79m;
                z2 = z5;
            }
        }
        if (z4 == 0) {
            o.g.z(obj);
            boolean z6 = this.f77k;
            this.f77k = z6;
            this.f76j = 1;
            obj = S.f(s2, z6, this);
            z4 = z6;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = this.f77k;
                th = this.f75i;
                o.g.z(obj);
                i2 = ((Number) obj).intValue();
                f0 f0Var = new f0(th, i2);
                z3 = z2;
                m0Var = f0Var;
                return new C0242b(m0Var, Boolean.valueOf(z3));
            }
            boolean z7 = this.f77k;
            o.g.z(obj);
            z4 = z7;
        }
        m0Var = (m0) obj;
        z3 = z4;
        return new C0242b(m0Var, Boolean.valueOf(z3));
    }
}
