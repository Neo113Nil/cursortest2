package a2;

import h2.n;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1242c {

    /* renamed from: a2.c$a */
    public static final class a extends j {

        /* renamed from: l, reason: collision with root package name */
        private int f9763l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2 f9764m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f9765n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, Function2 function2, Object obj) {
            super(dVar);
            this.f9764m = function2;
            this.f9765n = obj;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i4 = this.f9763l;
            if (i4 == 0) {
                this.f9763l = 1;
                ResultKt.a(obj);
                Intrinsics.checkNotNull(this.f9764m, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((Function2) M.e(this.f9764m, 2)).invoke(this.f9765n, this);
            }
            if (i4 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9763l = 2;
            ResultKt.a(obj);
            return obj;
        }
    }

    /* renamed from: a2.c$b */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        private int f9766l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2 f9767m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f9768n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(dVar, coroutineContext);
            this.f9767m = function2;
            this.f9768n = obj;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i4 = this.f9766l;
            if (i4 == 0) {
                this.f9766l = 1;
                ResultKt.a(obj);
                Intrinsics.checkNotNull(this.f9767m, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((Function2) M.e(this.f9767m, 2)).invoke(this.f9768n, this);
            }
            if (i4 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9766l = 2;
            ResultKt.a(obj);
            return obj;
        }
    }

    /* renamed from: a2.c$c, reason: collision with other inner class name */
    public static final class C0071c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0071c(kotlin.coroutines.d dVar) {
            super(dVar);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            ResultKt.a(obj);
            return obj;
        }
    }

    /* renamed from: a2.c$d */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.coroutines.d dVar, CoroutineContext coroutineContext) {
            super(dVar, coroutineContext);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            ResultKt.a(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kotlin.coroutines.d a(Function2 function2, Object obj, kotlin.coroutines.d completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        kotlin.coroutines.d a4 = h.a(completion);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(obj, a4);
        }
        CoroutineContext context = a4.getContext();
        return context == g.f41113b ? new a(a4, function2, obj) : new b(a4, context, function2, obj);
    }

    private static final kotlin.coroutines.d b(kotlin.coroutines.d dVar) {
        CoroutineContext context = dVar.getContext();
        return context == g.f41113b ? new C0071c(dVar) : new d(dVar, context);
    }

    public static kotlin.coroutines.d c(kotlin.coroutines.d dVar) {
        kotlin.coroutines.d intercepted;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }

    public static Object d(n nVar, Object obj, Object obj2, kotlin.coroutines.d completion) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((n) M.e(nVar, 3)).invoke(obj, obj2, b(h.a(completion)));
    }

    public static Object e(Function2 function2, Object obj, kotlin.coroutines.d completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) M.e(function2, 2)).invoke(obj, b(h.a(completion)));
    }
}
