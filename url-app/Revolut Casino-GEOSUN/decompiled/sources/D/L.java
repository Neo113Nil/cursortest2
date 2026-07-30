package D;

import M0.AbstractC0063v;
import M0.C0054l;
import M0.InterfaceC0062u;
import java.util.concurrent.atomic.AtomicInteger;
import u0.C0247g;

/* loaded from: classes.dex */
public final class L extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f105i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f106j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f107k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y0.f f108l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(S s2, E0.p pVar, w0.d dVar) {
        super(2, dVar);
        this.f107k = s2;
        this.f108l = (y0.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E0.p, y0.f] */
    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        L l2 = new L(this.f107k, this.f108l, dVar);
        l2.f106j = obj;
        return l2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((L) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [E0.p, y0.f] */
    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f105i;
        if (i2 == 0) {
            o.g.z(obj);
            InterfaceC0062u interfaceC0062u = (InterfaceC0062u) this.f106j;
            C0054l c0054l = new C0054l(true);
            c0054l.F(null);
            S s2 = this.f107k;
            e0 e0Var = new e0(this.f108l, c0054l, s2.f133l.x(), interfaceC0062u.m());
            C0013n c0013n = s2.f137p;
            Object l2 = ((O0.b) c0013n.f246c).l(e0Var);
            if (l2 instanceof O0.g) {
                O0.g gVar = l2 instanceof O0.g ? (O0.g) l2 : null;
                Throwable th = gVar != null ? gVar.f741a : null;
                if (th == null) {
                    throw new O0.l("Channel was closed normally");
                }
                throw th;
            }
            if (l2 instanceof O0.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((A.j) c0013n.f247d).f30f).getAndIncrement() == 0) {
                AbstractC0063v.g((InterfaceC0062u) c0013n.f244a, new h0(c0013n, null));
            }
            this.f105i = 1;
            obj = c0054l.S(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
