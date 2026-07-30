package D;

import java.util.concurrent.atomic.AtomicInteger;
import u0.C0247g;

/* loaded from: classes.dex */
public final class Q extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public F0.o f119i;

    /* renamed from: j, reason: collision with root package name */
    public int f120j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f121k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F0.o f122l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f123m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f124n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f125o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(F0.o oVar, S s2, Object obj, boolean z2, w0.d dVar) {
        super(2, dVar);
        this.f122l = oVar;
        this.f123m = s2;
        this.f124n = obj;
        this.f125o = z2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        Q q2 = new Q(this.f122l, this.f123m, this.f124n, this.f125o, dVar);
        q2.f121k = obj;
        return q2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((Q) b((c0) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // y0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        F0.o oVar;
        c0 c0Var;
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f120j;
        F0.o oVar2 = this.f122l;
        Object obj2 = this.f124n;
        S s2 = this.f123m;
        if (i2 == 0) {
            o.g.z(obj);
            c0 c0Var2 = (c0) this.f121k;
            l0 g2 = s2.g();
            this.f121k = c0Var2;
            this.f119i = oVar2;
            this.f120j = 1;
            Integer num = new Integer(((AtomicInteger) g2.f232b.f30f).incrementAndGet());
            if (num == aVar) {
                return aVar;
            }
            oVar = oVar2;
            c0Var = c0Var2;
            obj = num;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.g.z(obj);
                if (this.f125o) {
                    s2.f133l.G(new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, oVar2.f323e));
                }
                return C0247g.f3005a;
            }
            oVar = this.f119i;
            c0Var = (c0) this.f121k;
            o.g.z(obj);
        }
        oVar.f323e = ((Number) obj).intValue();
        this.f121k = null;
        this.f119i = null;
        this.f120j = 2;
        if (c0Var.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f125o) {
        }
        return C0247g.f3005a;
    }
}
