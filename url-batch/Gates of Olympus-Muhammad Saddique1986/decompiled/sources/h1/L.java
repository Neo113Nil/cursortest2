package h1;

import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class L extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public f2.s f6085h;

    /* renamed from: i, reason: collision with root package name */
    public int f6086i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6087j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f2.s f6088k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M f6089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6090m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f6091n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(f2.s sVar, M m3, Object obj, boolean z3, V1.d dVar) {
        super(2, dVar);
        this.f6088k = sVar;
        this.f6089l = m3;
        this.f6090m = obj;
        this.f6091n = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((L) o((V1.d) obj2, (j1.k) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        L l3 = new L(this.f6088k, this.f6089l, this.f6090m, this.f6091n, dVar);
        l3.f6087j = obj;
        return l3;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        f2.s sVar;
        j1.k kVar;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6086i;
        f2.s sVar2 = this.f6088k;
        Object obj2 = this.f6090m;
        M m3 = this.f6089l;
        if (i3 == 0) {
            R1.a.e(obj);
            j1.k kVar2 = (j1.k) this.f6087j;
            W f3 = m3.f();
            this.f6087j = kVar2;
            this.f6085h = sVar2;
            this.f6086i = 1;
            Integer num = new Integer(((AtomicInteger) f3.f6128b.f334d).incrementAndGet());
            if (num == aVar) {
                return aVar;
            }
            sVar = sVar2;
            kVar = kVar2;
            obj = num;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                if (this.f6091n) {
                    m3.f6098j.s(new C0485c(obj2 != null ? obj2.hashCode() : 0, sVar2.f5830d, obj2));
                }
                return R1.y.f4171a;
            }
            sVar = this.f6085h;
            kVar = (j1.k) this.f6087j;
            R1.a.e(obj);
        }
        sVar.f5830d = ((Number) obj).intValue();
        this.f6087j = null;
        this.f6085h = null;
        this.f6086i = 2;
        if (kVar.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f6091n) {
        }
        return R1.y.f4171a;
    }
}
