package q2;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3312F;
import o2.C3345o;
import o2.InterfaceC3316J;
import o2.InterfaceC3343n;
import o2.InterfaceC3359v0;
import o2.L;

/* loaded from: classes3.dex */
public abstract class p {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43486l;

        /* renamed from: m, reason: collision with root package name */
        Object f43487m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f43488n;

        /* renamed from: o, reason: collision with root package name */
        int f43489o;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43488n = obj;
            this.f43489o |= Integer.MIN_VALUE;
            return p.a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f43490i = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m260invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m260invoke() {
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC3343n f43491i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3343n interfaceC3343n) {
            super(1);
            this.f43491i = interfaceC3343n;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            InterfaceC3343n interfaceC3343n = this.f43491i;
            Result.Companion companion = Result.Companion;
            interfaceC3343n.resumeWith(Result.m243constructorimpl(Unit.f41027a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, Function0 function0, kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i5 = aVar.f43489o;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    aVar.f43489o = i5 - Integer.MIN_VALUE;
                    Object obj = aVar.f43488n;
                    Object f4 = AbstractC1241b.f();
                    i4 = aVar.f43489o;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        if (aVar.getContext().get(InterfaceC3359v0.f42105N2) != rVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        aVar.f43486l = rVar;
                        aVar.f43487m = function0;
                        aVar.f43489o = 1;
                        C3345o c3345o = new C3345o(AbstractC1241b.c(aVar), 1);
                        c3345o.E();
                        rVar.q(new c(c3345o));
                        Object y4 = c3345o.y();
                        if (y4 == AbstractC1241b.f()) {
                            kotlin.coroutines.jvm.internal.h.c(aVar);
                        }
                        if (y4 == f4) {
                            return f4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (Function0) aVar.f43487m;
                        ResultKt.a(obj);
                    }
                    function0.invoke();
                    return Unit.f41027a;
                }
            }
            if (i4 != 0) {
            }
            function0.invoke();
            return Unit.f41027a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f43488n;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f43489o;
    }

    public static /* synthetic */ Object b(r rVar, Function0 function0, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            function0 = b.f43490i;
        }
        return a(rVar, function0, dVar);
    }

    public static final t c(InterfaceC3316J interfaceC3316J, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a, L l4, Function1 function1, Function2 function2) {
        q qVar = new q(AbstractC3312F.e(interfaceC3316J, coroutineContext), g.b(i4, enumC3383a, null, 4, null));
        if (function1 != null) {
            qVar.invokeOnCompletion(function1);
        }
        qVar.R0(l4, qVar, function2);
        return qVar;
    }

    public static /* synthetic */ t d(InterfaceC3316J interfaceC3316J, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a, L l4, Function1 function1, Function2 function2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f41113b;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            enumC3383a = EnumC3383a.f43420b;
        }
        if ((i5 & 8) != 0) {
            l4 = L.f42009b;
        }
        if ((i5 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return c(interfaceC3316J, coroutineContext, i4, enumC3383a, l4, function12, function2);
    }
}
