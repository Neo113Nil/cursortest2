package e1;

import java.util.concurrent.atomic.AtomicInteger;
import k2.AbstractC0552y;
import k2.C0542n;
import k2.InterfaceC0550w;

/* renamed from: e1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346I extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4620e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0351N f4622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R1.i f4623h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0346I(C0351N c0351n, Y1.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f4622g = c0351n;
        this.f4623h = (R1.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0346I c0346i = new C0346I(this.f4622g, this.f4623h, dVar);
        c0346i.f4621f = obj;
        return c0346i;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0346I) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4620e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f4621f;
            C0542n c0542n = new C0542n(true);
            c0542n.N(null);
            C0351N c0351n = this.f4622g;
            P p = new P(this.f4623h, c0542n, c0351n.f4645g.l(), interfaceC0550w.u());
            A2.k kVar = c0351n.f4649k;
            Object g3 = ((m2.e) kVar.f110d).g(p);
            if (g3 instanceof m2.j) {
                m2.j jVar = g3 instanceof m2.j ? (m2.j) g3 : null;
                Throwable th = jVar != null ? jVar.f5972a : null;
                if (th == null) {
                    throw new m2.o("Channel was closed normally");
                }
                throw th;
            }
            if (g3 instanceof m2.k) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((A2.g) kVar.f111e).f83b).getAndIncrement() == 0) {
                AbstractC0552y.q((InterfaceC0550w) kVar.f108b, null, null, new T(kVar, null), 3);
            }
            this.f4620e = 1;
            obj = c0542n.e0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return obj;
    }
}
