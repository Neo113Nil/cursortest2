package kotlinx.coroutines.flow;

import com.realsil.sdk.dfu.DfuException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {DfuException.ERROR_SEND_COMMAND_FAIL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$sample$2$values$1 extends SuspendLambda implements f6.p {
    final /* synthetic */ e $this_sample;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1, reason: invalid class name */
    static final class AnonymousClass1 implements f {
        final /* synthetic */ kotlinx.coroutines.channels.j $$this$produce;

        AnonymousClass1(kotlinx.coroutines.channels.j jVar) {
            this.$$this$produce = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            FlowKt__DelayKt$sample$2$values$1$1$emit$1 flowKt__DelayKt$sample$2$values$1$1$emit$1;
            Object coroutine_suspended;
            int i8;
            if (cVar instanceof FlowKt__DelayKt$sample$2$values$1$1$emit$1) {
                flowKt__DelayKt$sample$2$values$1$1$emit$1 = (FlowKt__DelayKt$sample$2$values$1$1$emit$1) cVar;
                int i9 = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$sample$2$values$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                    Object obj2 = flowKt__DelayKt$sample$2$values$1$1$emit$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj2);
                        kotlinx.coroutines.channels.j jVar = this.$$this$produce;
                        if (obj == null) {
                            obj = kotlinx.coroutines.flow.internal.l.NULL;
                        }
                        flowKt__DelayKt$sample$2$values$1$1$emit$1.label = 1;
                        if (jVar.send(obj, flowKt__DelayKt$sample$2$values$1$1$emit$1) == coroutine_suspended) {
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
            flowKt__DelayKt$sample$2$values$1$1$emit$1 = new FlowKt__DelayKt$sample$2$values$1$1$emit$1(this, cVar);
            Object obj22 = flowKt__DelayKt$sample$2$values$1$1$emit$1.result;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            i8 = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
            if (i8 != 0) {
            }
            return y5.w.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2$values$1(e eVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_sample = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__DelayKt$sample$2$values$1 flowKt__DelayKt$sample$2$values$1 = new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, cVar);
        flowKt__DelayKt$sample$2$values$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$values$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            kotlinx.coroutines.channels.j jVar = (kotlinx.coroutines.channels.j) this.L$0;
            e eVar = this.$this_sample;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(jVar);
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

    @Override // f6.p
    public final Object invoke(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        return ((FlowKt__DelayKt$sample$2$values$1) create(jVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
