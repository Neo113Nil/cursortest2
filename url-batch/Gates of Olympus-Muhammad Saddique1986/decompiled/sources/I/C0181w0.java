package I;

import C0.C0025a;
import e2.InterfaceC0426e;
import java.util.List;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t2.C1045P;
import u2.AbstractC1151c;

/* renamed from: I.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181w0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public L1.g f2952h;

    /* renamed from: i, reason: collision with root package name */
    public int f2953i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2954j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0187z0 f2955k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0185y0 f2956l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f2957m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181w0(C0187z0 c0187z0, C0185y0 c0185y0, X x3, V1.d dVar) {
        super(2, dVar);
        this.f2955k = c0187z0;
        this.f2956l = c0185y0;
        this.f2957m = x3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0181w0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0181w0 c0181w0 = new C0181w0(this.f2955k, this.f2956l, this.f2957m, dVar);
        c0181w0.f2954j = obj;
        return c0181w0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C1045P c1045p;
        Object obj2;
        O.b bVar;
        q2.X x3;
        Throwable th;
        L1.g gVar;
        List w2;
        C0187z0 c0187z0;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f2953i;
        if (i3 == 0) {
            R1.a.e(obj);
            q2.X k3 = AbstractC0837y.k(((InterfaceC0835w) this.f2954j).q());
            C0187z0 c0187z02 = this.f2955k;
            synchronized (c0187z02.f2985b) {
                Throwable th2 = c0187z02.f2987d;
                if (th2 != null) {
                    throw th2;
                }
                if (((EnumC0175t0) c0187z02.f3001r.getValue()).compareTo(EnumC0175t0.f2920e) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (c0187z02.f2986c != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                c0187z02.f2986c = k3;
                c0187z02.t();
            }
            C0025a c0025a = new C0025a(3, this.f2955k);
            G1.m mVar = S.p.f4240a;
            S.p.f(S.o.f4238g);
            synchronized (S.p.f4241b) {
                S.p.f4246g = S1.l.T0(S.p.f4246g, c0025a);
            }
            L1.g gVar2 = new L1.g(c0025a);
            C1045P c1045p2 = C0187z0.f2982v;
            W w3 = this.f2955k.f3004u;
            try {
                do {
                    c1045p = C0187z0.f2982v;
                    obj2 = (L.b) c1045p.getValue();
                    bVar = (O.b) obj2;
                    N.c cVar = bVar.f3720f;
                    if (!cVar.containsKey(w3)) {
                        boolean isEmpty = bVar.isEmpty();
                        P.b bVar2 = P.b.f3913a;
                        if (isEmpty) {
                            bVar = new O.b(w3, w3, cVar.a(w3, new O.a(bVar2, bVar2)));
                        } else {
                            Object obj3 = bVar.f3719e;
                            Object obj4 = cVar.get(obj3);
                            f2.j.c(obj4);
                            bVar = new O.b(bVar.f3718d, w3, cVar.a(obj3, new O.a(((O.a) obj4).f3715a, w3)).a(w3, new O.a(obj3, bVar2)));
                        }
                    }
                    if (obj2 != bVar) {
                        Object obj5 = AbstractC1151c.f9682b;
                        if (obj2 == null) {
                            obj2 = obj5;
                        }
                    }
                    break;
                } while (!c1045p.l(obj2, bVar));
                break;
                C0187z0 c0187z03 = this.f2955k;
                synchronized (c0187z03.f2985b) {
                    w2 = c0187z03.w();
                }
                int size = w2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C0176u) w2.get(i4)).q();
                }
                C0179v0 c0179v0 = new C0179v0(this.f2956l, this.f2957m, null);
                this.f2954j = k3;
                this.f2952h = gVar2;
                this.f2953i = 1;
                if (AbstractC0837y.e(c0179v0, this) == aVar) {
                    return aVar;
                }
                x3 = k3;
                gVar = gVar2;
            } catch (Throwable th3) {
                x3 = k3;
                th = th3;
                gVar = gVar2;
                gVar.a();
                c0187z0 = this.f2955k;
                synchronized (c0187z0.f2985b) {
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.f2952h;
            x3 = (q2.X) this.f2954j;
            try {
                R1.a.e(obj);
            } catch (Throwable th4) {
                th = th4;
                gVar.a();
                c0187z0 = this.f2955k;
                synchronized (c0187z0.f2985b) {
                    try {
                        if (c0187z0.f2986c == x3) {
                            c0187z0.f2986c = null;
                        }
                        c0187z0.t();
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                C1045P c1045p3 = C0187z0.f2982v;
                W.b(this.f2955k.f3004u);
                throw th;
            }
        }
        gVar.a();
        C0187z0 c0187z04 = this.f2955k;
        synchronized (c0187z04.f2985b) {
            try {
                if (c0187z04.f2986c == x3) {
                    c0187z04.f2986c = null;
                }
                c0187z04.t();
            } catch (Throwable th6) {
                throw th6;
            }
        }
        C1045P c1045p4 = C0187z0.f2982v;
        W.b(this.f2955k.f3004u);
        return R1.y.f4171a;
    }
}
