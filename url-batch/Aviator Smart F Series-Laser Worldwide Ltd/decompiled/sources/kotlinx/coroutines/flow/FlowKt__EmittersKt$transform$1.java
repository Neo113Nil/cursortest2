package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$transform$1 extends SuspendLambda implements f6.p {
    final /* synthetic */ e $this_transform;
    final /* synthetic */ f6.q $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 implements f {
        final /* synthetic */ f $$this$flow;
        final /* synthetic */ f6.q $transform;

        public AnonymousClass1(f6.q qVar, f fVar) {
            this.$transform = qVar;
            this.$$this$flow = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            FlowKt__EmittersKt$transform$1$1$emit$1 flowKt__EmittersKt$transform$1$1$emit$1;
            Object coroutine_suspended;
            int i8;
            if (cVar instanceof FlowKt__EmittersKt$transform$1$1$emit$1) {
                flowKt__EmittersKt$transform$1$1$emit$1 = (FlowKt__EmittersKt$transform$1$1$emit$1) cVar;
                int i9 = flowKt__EmittersKt$transform$1$1$emit$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$transform$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                    Object obj2 = flowKt__EmittersKt$transform$1$1$emit$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = flowKt__EmittersKt$transform$1$1$emit$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj2);
                        f6.q qVar = this.$transform;
                        f fVar = this.$$this$flow;
                        flowKt__EmittersKt$transform$1$1$emit$1.label = 1;
                        if (qVar.invoke(fVar, obj, flowKt__EmittersKt$transform$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.g.throwOnFailure(obj2);
                    }
                    return y5.w.INSTANCE;
                }
            }
            flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, cVar);
            Object obj22 = flowKt__EmittersKt$transform$1$1$emit$1.result;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            i8 = flowKt__EmittersKt$transform$1$1$emit$1.label;
            if (i8 != 0) {
            }
            return y5.w.INSTANCE;
        }

        public final Object emit$$forInline(Object obj, kotlin.coroutines.c cVar) {
            kotlin.jvm.internal.r.mark(4);
            new FlowKt__EmittersKt$transform$1$1$emit$1(this, cVar);
            kotlin.jvm.internal.r.mark(5);
            this.$transform.invoke(this.$$this$flow, obj, cVar);
            return y5.w.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$transform$1(e eVar, f6.q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_transform = eVar;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.$this_transform, this.$transform, cVar);
        flowKt__EmittersKt$transform$1.L$0 = obj;
        return flowKt__EmittersKt$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            f fVar = (f) this.L$0;
            e eVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, fVar);
            this.label = 1;
            if (eVar.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
        }
        return y5.w.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        f fVar = (f) this.L$0;
        e eVar = this.$this_transform;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, fVar);
        kotlin.jvm.internal.r.mark(0);
        eVar.collect(anonymousClass1, this);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(f fVar, kotlin.coroutines.c cVar) {
        return ((FlowKt__EmittersKt$transform$1) create(fVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
