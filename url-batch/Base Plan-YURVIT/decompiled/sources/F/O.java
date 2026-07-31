package F;

import a.AbstractC0086a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class O extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public P0.n f281i;

    /* renamed from: j, reason: collision with root package name */
    public int f282j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f283k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P0.n f284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f285m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f286n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f287o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P0.n nVar, P p2, Object obj, boolean z2, G0.d dVar) {
        super(2, dVar);
        this.f284l = nVar;
        this.f285m = p2;
        this.f286n = obj;
        this.f287o = z2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        O o2 = new O(this.f284l, this.f285m, this.f286n, this.f287o, dVar);
        o2.f283k = obj;
        return o2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((O) b((G0.d) obj2, (a0) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.b(r7, r1) == r6) goto L16;
     */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        a0 a0Var;
        P0.n nVar;
        int i2 = this.f282j;
        Object obj2 = this.f286n;
        P p2 = this.f285m;
        P0.n nVar2 = this.f284l;
        H0.a aVar = H0.a.f511e;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            a0 a0Var2 = (a0) this.f283k;
            k0 g2 = p2.g();
            this.f283k = a0Var2;
            this.f281i = nVar2;
            this.f282j = 1;
            Integer num = new Integer(((AtomicInteger) g2.f392b.f20f).incrementAndGet());
            if (num != aVar) {
                a0Var = a0Var2;
                obj = num;
                nVar = nVar2;
            }
            return aVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
            if (this.f287o) {
                p2.f295l.D(new C0022d(obj2, obj2 != null ? obj2.hashCode() : 0, nVar2.f806e));
            }
            return D0.h.f206a;
        }
        nVar = this.f281i;
        a0Var = (a0) this.f283k;
        AbstractC0086a.I(obj);
        nVar.f806e = ((Number) obj).intValue();
        this.f283k = null;
        this.f281i = null;
        this.f282j = 2;
    }
}
