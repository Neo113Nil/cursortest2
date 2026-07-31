package B;

import e2.InterfaceC0426e;
import n0.C0700A;
import n0.C0711i;

/* renamed from: B.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023y extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int f463f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f464g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f465h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0011l f466i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x.Z f467j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023y(Y y3, C0011l c0011l, x.Z z3, V1.d dVar) {
        super(2, dVar);
        this.f465h = y3;
        this.f466i = c0011l;
        this.f467j = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0023y) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0023y c0023y = new C0023y(this.f465h, this.f466i, this.f467j, dVar);
        c0023y.f464g = obj;
        return c0023y;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    @Override // X1.a
    public final Object q(Object obj) {
        C0700A c0700a;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f463f;
        if (i3 == 0) {
            R1.a.e(obj);
            c0700a = (C0700A) this.f464g;
            this.f464g = c0700a;
            this.f463f = 1;
            obj = O2.l.K(c0700a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                return R1.y.f4171a;
            }
            c0700a = (C0700A) this.f464g;
            R1.a.e(obj);
        }
        C0711i c0711i = (C0711i) obj;
        if (O2.l.i0(c0711i) && (c0711i.f7293b & 33) != 0) {
            ?? r22 = c0711i.f7292a;
            int size = r22.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!((n0.s) r22.get(i4)).b()) {
                }
            }
            this.f464g = null;
            this.f463f = 2;
            if (O2.l.M(c0700a, this.f465h, this.f466i, c0711i, this) == aVar) {
                return aVar;
            }
            return R1.y.f4171a;
        }
        if (!O2.l.i0(c0711i)) {
            this.f464g = null;
            this.f463f = 3;
            if (O2.l.N(c0700a, this.f467j, c0711i, this) == aVar) {
                return aVar;
            }
        }
        return R1.y.f4171a;
    }
}
