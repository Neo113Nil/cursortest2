package s2;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o2.AbstractC3367z0;
import r2.InterfaceC3397g;

/* loaded from: classes3.dex */
public final class t extends kotlin.coroutines.jvm.internal.d implements InterfaceC3397g, kotlin.coroutines.jvm.internal.e {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC3397g f46022l;

    /* renamed from: m, reason: collision with root package name */
    public final CoroutineContext f46023m;

    /* renamed from: n, reason: collision with root package name */
    public final int f46024n;

    /* renamed from: o, reason: collision with root package name */
    private CoroutineContext f46025o;

    /* renamed from: p, reason: collision with root package name */
    private kotlin.coroutines.d f46026p;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f46027i = new a();

        a() {
            super(2);
        }

        public final Integer a(int i4, CoroutineContext.Element element) {
            return Integer.valueOf(i4 + 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (CoroutineContext.Element) obj2);
        }
    }

    public t(InterfaceC3397g interfaceC3397g, CoroutineContext coroutineContext) {
        super(q.f46016b, kotlin.coroutines.g.f41113b);
        this.f46022l = interfaceC3397g;
        this.f46023m = coroutineContext;
        this.f46024n = ((Number) coroutineContext.fold(0, a.f46027i)).intValue();
    }

    private final void a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof l) {
            j((l) coroutineContext2, obj);
        }
        v.a(this, coroutineContext);
    }

    private final Object i(kotlin.coroutines.d dVar, Object obj) {
        h2.n nVar;
        CoroutineContext context = dVar.getContext();
        AbstractC3367z0.i(context);
        CoroutineContext coroutineContext = this.f46025o;
        if (coroutineContext != context) {
            a(context, coroutineContext, obj);
            this.f46025o = context;
        }
        this.f46026p = dVar;
        nVar = u.f46028a;
        InterfaceC3397g interfaceC3397g = this.f46022l;
        Intrinsics.checkNotNull(interfaceC3397g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = nVar.invoke(interfaceC3397g, obj, this);
        if (!Intrinsics.areEqual(invoke, AbstractC1241b.f())) {
            this.f46026p = null;
        }
        return invoke;
    }

    private final void j(l lVar, Object obj) {
        throw new IllegalStateException(StringsKt.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f46014b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // r2.InterfaceC3397g
    public Object emit(Object obj, kotlin.coroutines.d dVar) {
        try {
            Object i4 = i(dVar, obj);
            if (i4 == AbstractC1241b.f()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return i4 == AbstractC1241b.f() ? i4 : Unit.f41027a;
        } catch (Throwable th) {
            this.f46025o = new l(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f46026p;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.d
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f46025o;
        return coroutineContext == null ? kotlin.coroutines.g.f41113b : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable d4 = Result.d(obj);
        if (d4 != null) {
            this.f46025o = new l(d4, getContext());
        }
        kotlin.coroutines.d dVar = this.f46026p;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return AbstractC1241b.f();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
