package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements e {
    final /* synthetic */ f6.p $predicate$inlined;
    final /* synthetic */ e $this_takeWhile$inlined;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {125}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(e eVar, f6.p pVar) {
        this.$this_takeWhile$inlined = eVar;
        this.$predicate$inlined = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        AnonymousClass1 anonymousClass1;
        Object coroutine_suspended;
        int i8;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
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
                    e eVar = this.$this_takeWhile$inlined;
                    FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12 = new FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(this.$predicate$inlined, fVar);
                    try {
                        anonymousClass1.L$0 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12;
                        anonymousClass1.label = 1;
                        if (eVar.collect(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (AbortFlowException e8) {
                        e = e8;
                        flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
                        return y5.w.INSTANCE;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) anonymousClass1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (AbortFlowException e9) {
                        e = e9;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
                        return y5.w.INSTANCE;
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
        return y5.w.INSTANCE;
    }
}
