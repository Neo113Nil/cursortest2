package h1;

import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicInteger;
import q2.AbstractC0837y;
import q2.C0827n;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class H extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6073h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6074i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M f6075j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.i f6076k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(M m3, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(2, dVar);
        this.f6075j = m3;
        this.f6076k = (X1.i) interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((H) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X1.i, e2.e] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        H h3 = new H(this.f6075j, this.f6076k, dVar);
        h3.f6074i = obj;
        return h3;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X1.i, e2.e] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6073h;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f6074i;
            C0827n c0827n = new C0827n(true);
            c0827n.S(null);
            M m3 = this.f6075j;
            O o3 = new O(this.f6076k, c0827n, m3.f6098j.f(), interfaceC0835w.q());
            G1.g gVar = m3.f6102n;
            Object p3 = ((s2.g) gVar.f2095g).p(o3);
            if (p3 instanceof s2.l) {
                s2.l lVar = p3 instanceof s2.l ? (s2.l) p3 : null;
                Throwable th = lVar != null ? lVar.f8410a : null;
                if (th == null) {
                    throw new s2.q("Channel was closed normally");
                }
                throw th;
            }
            if (p3 instanceof s2.m) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((B.Y) gVar.f2096h).f334d).getAndIncrement() == 0) {
                AbstractC0837y.r((InterfaceC0835w) gVar.f2093e, null, null, new S(gVar, null), 3);
            }
            this.f6073h = 1;
            obj = c0827n.i0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return obj;
    }
}
