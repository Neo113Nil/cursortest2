package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements f6.p {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ ReceiveChannel $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, cVar);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // f6.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1266invokeWpGqRn0(((kotlinx.coroutines.channels.e) obj).m1252unboximpl(), (kotlin.coroutines.c) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m1266invokeWpGqRn0(Object obj, kotlin.coroutines.c cVar) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(kotlinx.coroutines.channels.e.m1240boximpl(obj), cVar)).invokeSuspend(y5.w.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, kotlinx.coroutines.internal.g0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y5.g.throwOnFailure(obj);
        ?? m1252unboximpl = ((kotlinx.coroutines.channels.e) this.L$0).m1252unboximpl();
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
        boolean z7 = m1252unboximpl instanceof e.c;
        if (!z7) {
            ref$ObjectRef.element = m1252unboximpl;
        }
        ReceiveChannel receiveChannel = this.$ticker;
        if (z7) {
            Throwable m1244exceptionOrNullimpl = kotlinx.coroutines.channels.e.m1244exceptionOrNullimpl(m1252unboximpl);
            if (m1244exceptionOrNullimpl != null) {
                throw m1244exceptionOrNullimpl;
            }
            receiveChannel.cancel((CancellationException) new ChildCancelledException());
            ref$ObjectRef.element = kotlinx.coroutines.flow.internal.l.DONE;
        }
        return y5.w.INSTANCE;
    }
}
