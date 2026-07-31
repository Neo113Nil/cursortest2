package o2;

import h2.AbstractC0448j;
import k2.AbstractC0552y;
import k2.C0545q;
import k2.C0547t;
import k2.InterfaceC0539k;
import k2.X;
import k2.f0;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class s extends R1.c implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0701g f6732d;

    /* renamed from: e, reason: collision with root package name */
    public final P1.i f6733e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6734f;

    /* renamed from: g, reason: collision with root package name */
    public P1.i f6735g;

    /* renamed from: h, reason: collision with root package name */
    public P1.d f6736h;

    public s(InterfaceC0701g interfaceC0701g, P1.i iVar) {
        super(q.f6730d, P1.j.f3073d);
        this.f6732d = interfaceC0701g;
        this.f6733e = iVar;
        this.f6734f = ((Number) iVar.r(0, new C0545q(3))).intValue();
    }

    @Override // n2.InterfaceC0701g
    public final Object emit(Object obj, P1.d dVar) {
        try {
            Object k3 = k(dVar, obj);
            return k3 == Q1.a.f3113d ? k3 : L1.z.f2729a;
        } catch (Throwable th) {
            this.f6735g = new o(dVar.getContext(), th);
            throw th;
        }
    }

    @Override // R1.a, R1.d
    public final R1.d getCallerFrame() {
        P1.d dVar = this.f6736h;
        if (dVar instanceof R1.d) {
            return (R1.d) dVar;
        }
        return null;
    }

    @Override // R1.c, P1.d
    public final P1.i getContext() {
        P1.i iVar = this.f6735g;
        return iVar == null ? P1.j.f3073d : iVar;
    }

    @Override // R1.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Throwable a3 = L1.m.a(obj);
        if (a3 != null) {
            this.f6735g = new o(getContext(), a3);
        }
        P1.d dVar = this.f6736h;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return Q1.a.f3113d;
    }

    public final Object k(P1.d dVar, Object obj) {
        P1.i context = dVar.getContext();
        AbstractC0552y.f(context);
        P1.i iVar = this.f6735g;
        if (iVar != context) {
            if (iVar instanceof o) {
                throw new IllegalStateException(AbstractC0448j.a0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o) iVar).f6729e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.r(0, new Y1.e() { // from class: o2.v
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
                
                    if (r1 == null) goto L17;
                 */
                @Override // Y1.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object g(Object obj2, Object obj3) {
                    int intValue = ((Integer) obj2).intValue();
                    P1.g gVar = (P1.g) obj3;
                    P1.h key = gVar.getKey();
                    P1.g k3 = s.this.f6733e.k(key);
                    if (key != C0547t.f5390e) {
                        if (gVar != k3) {
                            intValue = Integer.MIN_VALUE;
                        }
                        intValue++;
                    } else {
                        X x3 = (X) k3;
                        X x4 = (X) gVar;
                        while (true) {
                            if (x4 != null) {
                                if (x4 == x3 || !(x4 instanceof p2.r)) {
                                    break;
                                }
                                InterfaceC0539k interfaceC0539k = (InterfaceC0539k) f0.f5357e.get((p2.r) x4);
                                x4 = interfaceC0539k != null ? interfaceC0539k.getParent() : null;
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
            })).intValue() != this.f6734f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f6733e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f6735g = context;
        }
        this.f6736h = dVar;
        t tVar = u.f6738a;
        InterfaceC0701g interfaceC0701g = this.f6732d;
        Z1.i.d(interfaceC0701g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        tVar.getClass();
        Object emit = interfaceC0701g.emit(obj, this);
        if (!Z1.i.a(emit, Q1.a.f3113d)) {
            this.f6736h = null;
        }
        return emit;
    }
}
