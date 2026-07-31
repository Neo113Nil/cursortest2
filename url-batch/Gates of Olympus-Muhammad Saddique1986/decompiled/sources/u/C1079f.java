package u;

import B.C0022x;
import R1.y;
import a0.C0239d;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import f2.k;
import java.util.concurrent.CancellationException;
import k2.C0572d;
import n0.C0710h;
import p.C0765h;
import p.C0771k;
import q2.C0821h;
import q2.InterfaceC0835w;
import t0.b0;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079f extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9099h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1082i f9100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f9101j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f9102k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1079f(C1082i c1082i, b0 b0Var, InterfaceC0422a interfaceC0422a, V1.d dVar) {
        super(2, dVar);
        this.f9100i = c1082i;
        this.f9101j = b0Var;
        this.f9102k = (k) interfaceC0422a;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1079f) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e2.a, f2.k] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1079f(this.f9100i, this.f9101j, this.f9102k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cd, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [e2.a, f2.k] */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object obj2;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9099h;
        y yVar = y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C1082i c1082i = this.f9100i;
            C0771k c0771k = c1082i.f9112q;
            C1078e c1078e = new C1078e(c1082i, this.f9101j, this.f9102k);
            this.f9099h = 1;
            c0771k.getClass();
            C0239d c0239d = (C0239d) c1078e.b();
            if (c0239d != null && !c0771k.A0(c0239d, c0771k.f7700y)) {
                C0821h c0821h = new C0821h(1, l0.c.B(this));
                c0821h.r();
                C0765h c0765h = new C0765h(c1078e, c0821h);
                C0710h c0710h = c0771k.f7696u;
                c0710h.getClass();
                C0239d c0239d2 = (C0239d) c1078e.b();
                if (c0239d2 == null) {
                    c0821h.u(yVar);
                } else {
                    c0821h.v(new C0022x(c0710h, 28, c0765h));
                    K.d dVar = c0710h.f7291a;
                    int i4 = new C0572d(0, dVar.f3216f - 1, 1).f6420e;
                    if (i4 >= 0) {
                        while (true) {
                            C0239d c0239d3 = (C0239d) ((C0765h) dVar.f3214d[i4]).f7671a.b();
                            if (c0239d3 != null) {
                                C0239d d3 = c0239d2.d(c0239d3);
                                if (d3.equals(c0239d2)) {
                                    dVar.a(i4 + 1, c0765h);
                                    break;
                                }
                                if (!d3.equals(c0239d3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i5 = dVar.f3216f - 1;
                                    if (i5 <= i4) {
                                        while (true) {
                                            ((C0765h) dVar.f3214d[i4]).f7672b.C(cancellationException);
                                            if (i5 == i4) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                }
                            }
                            if (i4 == 0) {
                                break;
                            }
                            i4--;
                        }
                    }
                    dVar.a(0, c0765h);
                    if (!c0771k.f7701z) {
                        c0771k.B0();
                    }
                }
                obj2 = c0821h.q();
            }
            obj2 = yVar;
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
