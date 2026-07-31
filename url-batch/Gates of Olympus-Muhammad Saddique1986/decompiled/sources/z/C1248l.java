package z;

import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicReference;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import q2.X;
import q2.m0;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248l extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10456h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1249m f10457i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248l(C1249m c1249m, V1.d dVar) {
        super(2, dVar);
        this.f10457i = c1249m;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1248l) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1248l c1248l = new C1248l(this.f10457i, dVar);
        c1248l.f10456h = obj;
        return c1248l;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        boolean z3;
        R1.a.e(obj);
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f10456h;
        C1249m c1249m = this.f10457i;
        X x3 = (X) c1249m.f10458a.getAndSet(null);
        AtomicReference atomicReference = c1249m.f10458a;
        m0 r3 = AbstractC0837y.r(interfaceC0835w, null, null, new C1247k(x3, c1249m, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, r3)) {
                z3 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z3 = false;
                break;
            }
        }
        return Boolean.valueOf(z3);
    }
}
