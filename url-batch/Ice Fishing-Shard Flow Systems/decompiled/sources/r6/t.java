package r6;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.C0787u;
import n6.InterfaceC0778k;
import n6.X;
import n6.f0;

/* loaded from: classes.dex */
public final class t extends X5.c implements q6.e {

    /* renamed from: d, reason: collision with root package name */
    public final q6.e f7583d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f7584e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7585i;

    /* renamed from: l, reason: collision with root package name */
    public CoroutineContext f7586l;

    /* renamed from: m, reason: collision with root package name */
    public V5.b f7587m;

    public t(q6.e eVar, CoroutineContext coroutineContext) {
        super(q.f7579d, kotlin.coroutines.g.f6146d);
        this.f7583d = eVar;
        this.f7584e = coroutineContext;
        this.f7585i = ((Number) coroutineContext.t(0, new V5.a(5))).intValue();
    }

    @Override // q6.e
    public final Object a(Object obj, V5.b frame) {
        try {
            Object b7 = b(frame, obj);
            W5.a aVar = W5.a.f2787d;
            if (b7 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return b7 == aVar ? b7 : Unit.f6114a;
        } catch (Throwable th) {
            this.f7586l = new o(th, frame.getContext());
            throw th;
        }
    }

    public final Object b(V5.b bVar, Object obj) {
        CoroutineContext context = bVar.getContext();
        AbstractC0792z.e(context);
        CoroutineContext coroutineContext = this.f7586l;
        if (coroutineContext != context) {
            if (coroutineContext instanceof o) {
                throw new IllegalStateException(kotlin.text.j.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o) coroutineContext).f7578e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.t(0, new Function2() { // from class: r6.w
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
                
                    if (r1 == null) goto L17;
                 */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj2, Object obj3) {
                    int intValue = ((Integer) obj2).intValue();
                    CoroutineContext.Element element = (CoroutineContext.Element) obj3;
                    kotlin.coroutines.f key = element.getKey();
                    CoroutineContext.Element g7 = t.this.f7584e.g(key);
                    if (key != C0787u.f7085e) {
                        if (element != g7) {
                            intValue = Integer.MIN_VALUE;
                        }
                        intValue++;
                    } else {
                        X x7 = (X) g7;
                        X x8 = (X) element;
                        while (true) {
                            if (x8 != null) {
                                if (x8 == x7 || !(x8 instanceof s6.q)) {
                                    break;
                                }
                                InterfaceC0778k interfaceC0778k = (InterfaceC0778k) f0.f7055e.get((s6.q) x8);
                                x8 = interfaceC0778k != null ? interfaceC0778k.getParent() : null;
                            } else {
                                x8 = null;
                                break;
                            }
                        }
                        if (x8 != x7) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + x8 + ", expected child of " + x7 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue);
                }
            })).intValue() != this.f7585i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f7584e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f7586l = context;
        }
        this.f7587m = bVar;
        e6.n nVar = v.f7589a;
        q6.e eVar = this.f7583d;
        Intrinsics.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object invoke = nVar.invoke(eVar, obj, this);
        if (!Intrinsics.a(invoke, W5.a.f2787d)) {
            this.f7587m = null;
        }
        return invoke;
    }

    @Override // X5.a, X5.d
    public final X5.d getCallerFrame() {
        V5.b bVar = this.f7587m;
        if (bVar instanceof X5.d) {
            return (X5.d) bVar;
        }
        return null;
    }

    @Override // X5.c, V5.b
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f7586l;
        return coroutineContext == null ? kotlin.coroutines.g.f6146d : coroutineContext;
    }

    @Override // X5.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        Throwable a7 = R5.n.a(obj);
        if (a7 != null) {
            this.f7586l = new o(a7, getContext());
        }
        V5.b bVar = this.f7587m;
        if (bVar != null) {
            bVar.resumeWith(obj);
        }
        return W5.a.f2787d;
    }
}
