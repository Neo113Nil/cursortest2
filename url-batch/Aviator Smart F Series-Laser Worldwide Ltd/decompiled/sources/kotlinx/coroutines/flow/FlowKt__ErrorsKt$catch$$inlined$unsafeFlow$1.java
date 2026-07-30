package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 implements e {
    final /* synthetic */ f6.q $action$inlined;
    final /* synthetic */ e $this_catch$inlined;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(e eVar, f6.q qVar) {
        this.$this_catch$inlined = eVar;
        this.$action$inlined = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        AnonymousClass1 anonymousClass1;
        Object coroutine_suspended;
        int i8;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        Throwable th;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i9 = anonymousClass1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i9 - Integer.MIN_VALUE;
                Object obj = anonymousClass1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = anonymousClass1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    e eVar = this.$this_catch$inlined;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = fVar;
                    anonymousClass1.label = 1;
                    obj = g.catchImpl(eVar, fVar, anonymousClass1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = this;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.g.throwOnFailure(obj);
                        return y5.w.INSTANCE;
                    }
                    fVar = (f) anonymousClass1.L$1;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                th = (Throwable) obj;
                if (th != null) {
                    f6.q qVar = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.$action$inlined;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    kotlin.jvm.internal.r.mark(6);
                    Object invoke = qVar.invoke(fVar, th, anonymousClass1);
                    kotlin.jvm.internal.r.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return y5.w.INSTANCE;
            }
        }
        anonymousClass1 = new AnonymousClass1(cVar);
        Object obj2 = anonymousClass1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = anonymousClass1.label;
        if (i8 != 0) {
        }
        th = (Throwable) obj2;
        if (th != null) {
        }
        return y5.w.INSTANCE;
    }
}
