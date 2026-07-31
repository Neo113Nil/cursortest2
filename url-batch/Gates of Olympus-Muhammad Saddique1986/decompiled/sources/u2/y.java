package u2;

import e2.InterfaceC0426e;
import n2.AbstractC0731k;
import q2.AbstractC0837y;
import q2.C0830q;
import q2.C0832t;
import q2.InterfaceC0824k;
import q2.X;
import q2.f0;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class y extends X1.c implements InterfaceC1054g {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1054g f9735g;

    /* renamed from: h, reason: collision with root package name */
    public final V1.i f9736h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9737i;

    /* renamed from: j, reason: collision with root package name */
    public V1.i f9738j;

    /* renamed from: k, reason: collision with root package name */
    public V1.d f9739k;

    public y(InterfaceC1054g interfaceC1054g, V1.i iVar) {
        super(w.f9733d, V1.j.f4558d);
        this.f9735g = interfaceC1054g;
        this.f9736h = iVar;
        this.f9737i = ((Number) iVar.e(0, new C0830q(3))).intValue();
    }

    @Override // t2.InterfaceC1054g
    public final Object e(Object obj, V1.d dVar) {
        try {
            Object s3 = s(dVar, obj);
            return s3 == W1.a.f4608d ? s3 : R1.y.f4171a;
        } catch (Throwable th) {
            this.f9738j = new t(dVar.t(), th);
            throw th;
        }
    }

    @Override // X1.a, X1.d
    public final X1.d k() {
        V1.d dVar = this.f9739k;
        if (dVar instanceof X1.d) {
            return (X1.d) dVar;
        }
        return null;
    }

    @Override // X1.a
    public final StackTraceElement p() {
        return null;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        Throwable a3 = R1.l.a(obj);
        if (a3 != null) {
            this.f9738j = new t(t(), a3);
        }
        V1.d dVar = this.f9739k;
        if (dVar != null) {
            dVar.u(obj);
        }
        return W1.a.f4608d;
    }

    public final Object s(V1.d dVar, Object obj) {
        V1.i t3 = dVar.t();
        AbstractC0837y.g(t3);
        V1.i iVar = this.f9738j;
        if (iVar != t3) {
            if (iVar instanceof t) {
                throw new IllegalStateException(AbstractC0731k.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((t) iVar).f9732e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) t3.e(0, new InterfaceC0426e() { // from class: u2.B
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
                
                    if (r1 == null) goto L17;
                 */
                @Override // e2.InterfaceC0426e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object h(Object obj2, Object obj3) {
                    int intValue = ((Integer) obj2).intValue();
                    V1.g gVar = (V1.g) obj3;
                    V1.h key = gVar.getKey();
                    V1.g v3 = y.this.f9736h.v(key);
                    if (key != C0832t.f7929e) {
                        if (gVar != v3) {
                            intValue = Integer.MIN_VALUE;
                        }
                        intValue++;
                    } else {
                        X x3 = (X) v3;
                        X x4 = (X) gVar;
                        while (true) {
                            if (x4 != null) {
                                if (x4 == x3 || !(x4 instanceof v2.q)) {
                                    break;
                                }
                                InterfaceC0824k interfaceC0824k = (InterfaceC0824k) f0.f7896e.get((v2.q) x4);
                                x4 = interfaceC0824k != null ? interfaceC0824k.getParent() : null;
                            } else {
                                x4 = null;
                                break;
                            }
                        }
                        if (x4 != x3) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + x4 + ", expected child of " + x3 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue);
                }
            })).intValue() != this.f9737i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f9736h + ",\n\t\tbut emission happened in " + t3 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f9738j = t3;
        }
        this.f9739k = dVar;
        z zVar = AbstractC1143A.f9668a;
        InterfaceC1054g interfaceC1054g = this.f9735g;
        f2.j.d(interfaceC1054g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        zVar.getClass();
        Object e3 = interfaceC1054g.e(obj, this);
        if (!f2.j.a(e3, W1.a.f4608d)) {
            this.f9739k = null;
        }
        return e3;
    }

    @Override // X1.c, V1.d
    public final V1.i t() {
        V1.i iVar = this.f9738j;
        return iVar == null ? V1.j.f4558d : iVar;
    }
}
