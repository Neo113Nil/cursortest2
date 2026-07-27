package a3;

import W2.B;
import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0289k;
import W2.k0;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;

/* loaded from: classes.dex */
public final class t extends E2.c implements InterfaceC0331g {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0331g f4986j;

    /* renamed from: k, reason: collision with root package name */
    public final CoroutineContext f4987k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4988l;

    /* renamed from: m, reason: collision with root package name */
    public CoroutineContext f4989m;

    /* renamed from: n, reason: collision with root package name */
    public C2.a f4990n;

    public t(InterfaceC0331g interfaceC0331g, CoroutineContext coroutineContext) {
        super(r.f4983d, kotlin.coroutines.i.f7498d);
        this.f4986j = interfaceC0331g;
        this.f4987k = coroutineContext;
        this.f4988l = ((Number) coroutineContext.i(0, new W2.r(3))).intValue();
    }

    @Override // Z2.InterfaceC0331g
    public final Object d(Object obj, C2.a frame) {
        try {
            Object o4 = o(frame, obj);
            D2.a aVar = D2.a.f2163d;
            if (o4 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return o4 == aVar ? o4 : Unit.f7487a;
        } catch (Throwable th) {
            this.f4989m = new p(th, frame.p());
            throw th;
        }
    }

    @Override // E2.a, E2.d
    public final E2.d e() {
        C2.a aVar = this.f4990n;
        if (aVar instanceof E2.d) {
            return (E2.d) aVar;
        }
        return null;
    }

    @Override // E2.a
    public final StackTraceElement k() {
        return null;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Throwable a4 = AbstractC1341p.a(obj);
        if (a4 != null) {
            this.f4989m = new p(a4, p());
        }
        C2.a aVar = this.f4990n;
        if (aVar != null) {
            aVar.u(obj);
        }
        return D2.a.f2163d;
    }

    public final Object o(C2.a aVar, Object obj) {
        CoroutineContext p4 = aVar.p();
        B.e(p4);
        CoroutineContext coroutineContext = this.f4989m;
        if (coroutineContext != p4) {
            if (coroutineContext instanceof p) {
                throw new IllegalStateException(kotlin.text.n.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) coroutineContext).f4982e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) p4.i(0, new Function2() { // from class: a3.w
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
                
                    if (r1 == null) goto L17;
                 */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object h(Object obj2, Object obj3) {
                    int intValue = ((Integer) obj2).intValue();
                    CoroutineContext.Element element = (CoroutineContext.Element) obj3;
                    kotlin.coroutines.g key = element.getKey();
                    CoroutineContext.Element k4 = t.this.f4987k.k(key);
                    if (key != C0299v.f4296e) {
                        if (element != k4) {
                            intValue = Integer.MIN_VALUE;
                        }
                        intValue++;
                    } else {
                        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) k4;
                        InterfaceC0280c0 interfaceC0280c02 = (InterfaceC0280c0) element;
                        while (true) {
                            if (interfaceC0280c02 != null) {
                                if (interfaceC0280c02 == interfaceC0280c0 || !(interfaceC0280c02 instanceof b3.q)) {
                                    break;
                                }
                                InterfaceC0289k interfaceC0289k = (InterfaceC0289k) k0.f4280e.get((b3.q) interfaceC0280c02);
                                interfaceC0280c02 = interfaceC0289k != null ? interfaceC0289k.getParent() : null;
                            } else {
                                interfaceC0280c02 = null;
                                break;
                            }
                        }
                        if (interfaceC0280c02 != interfaceC0280c0) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0280c02 + ", expected child of " + interfaceC0280c0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue);
                }
            })).intValue() != this.f4988l) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f4987k + ",\n\t\tbut emission happened in " + p4 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f4989m = p4;
        }
        this.f4990n = aVar;
        u uVar = v.f4992a;
        InterfaceC0331g interfaceC0331g = this.f4986j;
        Intrinsics.d(interfaceC0331g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        uVar.getClass();
        Object d4 = interfaceC0331g.d(obj, this);
        if (!Intrinsics.a(d4, D2.a.f2163d)) {
            this.f4990n = null;
        }
        return d4;
    }

    @Override // E2.c, C2.a
    public final CoroutineContext p() {
        CoroutineContext coroutineContext = this.f4989m;
        return coroutineContext == null ? kotlin.coroutines.i.f7498d : coroutineContext;
    }
}
