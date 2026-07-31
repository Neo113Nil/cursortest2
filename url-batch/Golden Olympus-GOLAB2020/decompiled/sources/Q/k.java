package Q;

import a2.AbstractC1241b;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import o2.K;
import q2.h;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3316J f9079a;

    /* renamed from: b, reason: collision with root package name */
    private final Function2 f9080b;

    /* renamed from: c, reason: collision with root package name */
    private final q2.d f9081c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f9082d;

    static final class a extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f9083i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ k f9084j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2 f9085k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, k kVar, Function2 function2) {
            super(1);
            this.f9083i = function1;
            this.f9084j = kVar;
            this.f9085k = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            Unit unit;
            this.f9083i.invoke(th);
            this.f9084j.f9081c.j(th);
            do {
                Object f4 = q2.h.f(this.f9084j.f9081c.d());
                if (f4 == null) {
                    unit = null;
                } else {
                    this.f9085k.invoke(f4, th);
                    unit = Unit.f41027a;
                }
            } while (unit != null);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        Object f9086l;

        /* renamed from: m, reason: collision with root package name */
        int f9087m;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return k.this.new b(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
        
            if (r6 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function2 function2;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f9087m;
            if (i4 == 0) {
                ResultKt.a(obj);
                if (!(k.this.f9082d.get() > 0)) {
                    throw new IllegalStateException("Check failed.");
                }
                K.h(k.this.f9079a);
                function2 = k.this.f9080b;
                q2.d dVar = k.this.f9081c;
                this.f9086l = function2;
                this.f9087m = 1;
                obj = dVar.i(this);
            } else if (i4 == 1) {
                function2 = (Function2) this.f9086l;
                ResultKt.a(obj);
                this.f9086l = null;
                this.f9087m = 2;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                if (k.this.f9082d.decrementAndGet() == 0) {
                    return Unit.f41027a;
                }
                K.h(k.this.f9079a);
                function2 = k.this.f9080b;
                q2.d dVar2 = k.this.f9081c;
                this.f9086l = function2;
                this.f9087m = 1;
                obj = dVar2.i(this);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((b) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    public k(InterfaceC3316J scope, Function1 onComplete, Function2 onUndeliveredElement, Function2 consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f9079a = scope;
        this.f9080b = consumeMessage;
        this.f9081c = q2.g.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f9082d = new AtomicInteger(0);
        InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) scope.n().get(InterfaceC3359v0.f42105N2);
        if (interfaceC3359v0 == null) {
            return;
        }
        interfaceC3359v0.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(Object obj) {
        Object r4 = this.f9081c.r(obj);
        if (r4 instanceof h.a) {
            Throwable e4 = q2.h.e(r4);
            if (e4 != null) {
                throw e4;
            }
            throw new q2.n("Channel was closed normally");
        }
        if (!q2.h.i(r4)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f9082d.getAndIncrement() == 0) {
            AbstractC3337k.d(this.f9079a, null, null, new b(null), 3, null);
        }
    }
}
