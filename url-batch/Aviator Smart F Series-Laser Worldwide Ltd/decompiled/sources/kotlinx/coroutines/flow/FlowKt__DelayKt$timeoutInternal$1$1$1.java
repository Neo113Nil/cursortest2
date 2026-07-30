package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.e;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {404}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements f6.p {
    final /* synthetic */ f $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$timeoutInternal$1$1$1(f fVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$downStream = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, cVar);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // f6.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1267invokeWpGqRn0(((kotlinx.coroutines.channels.e) obj).m1252unboximpl(), (kotlin.coroutines.c) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m1267invokeWpGqRn0(Object obj, kotlin.coroutines.c cVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(kotlinx.coroutines.channels.e.m1240boximpl(obj), cVar)).invokeSuspend(y5.w.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m1252unboximpl;
        Object obj2;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            m1252unboximpl = ((kotlinx.coroutines.channels.e) this.L$0).m1252unboximpl();
            f fVar = this.$downStream;
            if (!(m1252unboximpl instanceof e.c)) {
                this.L$0 = m1252unboximpl;
                this.label = 1;
                if (fVar.emit(m1252unboximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = m1252unboximpl;
            }
            if (m1252unboximpl instanceof e.a) {
                return kotlin.coroutines.jvm.internal.a.boxBoolean(true);
            }
            kotlinx.coroutines.channels.e.m1244exceptionOrNullimpl(m1252unboximpl);
            return kotlin.coroutines.jvm.internal.a.boxBoolean(false);
        }
        if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = this.L$0;
        y5.g.throwOnFailure(obj);
        m1252unboximpl = obj2;
        if (m1252unboximpl instanceof e.a) {
        }
    }
}
