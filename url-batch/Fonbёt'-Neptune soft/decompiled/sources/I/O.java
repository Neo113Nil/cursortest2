package I;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class O extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public Q0.n f562i;

    /* renamed from: j, reason: collision with root package name */
    public int f563j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f564k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0.n f565l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f566m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f567n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f568o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q0.n nVar, P p2, Object obj, boolean z2, H0.d dVar) {
        super(2, dVar);
        this.f565l = nVar;
        this.f566m = p2;
        this.f567n = obj;
        this.f568o = z2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        O o2 = new O(this.f565l, this.f566m, this.f567n, this.f568o, dVar);
        o2.f564k = obj;
        return o2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((O) b((H0.d) obj2, (a0) obj)).l(F0.h.f469a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // J0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        Q0.n nVar;
        a0 a0Var;
        I0.a aVar = I0.a.f733e;
        int i2 = this.f563j;
        Q0.n nVar2 = this.f565l;
        Object obj2 = this.f567n;
        P p2 = this.f566m;
        if (i2 == 0) {
            i1.a.G(obj);
            a0 a0Var2 = (a0) this.f564k;
            j0 g2 = p2.g();
            this.f564k = a0Var2;
            this.f562i = nVar2;
            this.f563j = 1;
            Integer num = new Integer(((AtomicInteger) g2.f663b.f78f).incrementAndGet());
            if (num == aVar) {
                return aVar;
            }
            nVar = nVar2;
            a0Var = a0Var2;
            obj = num;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i1.a.G(obj);
                if (this.f568o) {
                    p2.f576l.t(new C0069d(obj2, obj2 != null ? obj2.hashCode() : 0, nVar2.f982e));
                }
                return F0.h.f469a;
            }
            nVar = this.f562i;
            a0Var = (a0) this.f564k;
            i1.a.G(obj);
        }
        nVar.f982e = ((Number) obj).intValue();
        this.f564k = null;
        this.f562i = null;
        this.f563j = 2;
        if (a0Var.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f568o) {
        }
        return F0.h.f469a;
    }
}
