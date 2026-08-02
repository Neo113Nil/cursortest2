package I;

import Y0.AbstractC0127v;
import Y0.C0118l;
import Y0.InterfaceC0126u;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class K extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f550i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f551j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f552k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J0.g f553l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(P p2, P0.p pVar, H0.d dVar) {
        super(2, dVar);
        this.f552k = p2;
        this.f553l = (J0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J0.g, P0.p] */
    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        K k2 = new K(this.f552k, this.f553l, dVar);
        k2.f551j = obj;
        return k2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((K) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [J0.g, P0.p] */
    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f550i;
        if (i2 == 0) {
            i1.a.G(obj);
            InterfaceC0126u interfaceC0126u = (InterfaceC0126u) this.f551j;
            C0118l c0118l = new C0118l(true);
            c0118l.H(null);
            P p2 = this.f552k;
            c0 c0Var = new c0(this.f553l, c0118l, p2.f576l.m(), interfaceC0126u.h());
            C0079n c0079n = p2.f580p;
            Object g2 = ((a1.b) c0079n.f691g).g(c0Var);
            if (g2 instanceof a1.g) {
                a1.g gVar = g2 instanceof a1.g ? (a1.g) g2 : null;
                Throwable th = gVar != null ? gVar.f1325a : null;
                if (th == null) {
                    throw new a1.l("Channel was closed normally");
                }
                throw th;
            }
            if (g2 instanceof a1.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((B.m) c0079n.f692h).f78f).getAndIncrement() == 0) {
                AbstractC0127v.g((InterfaceC0126u) c0079n.f689e, new f0(c0079n, null));
            }
            this.f550i = 1;
            obj = c0118l.U(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return obj;
    }
}
