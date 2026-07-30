package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.e;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {242}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements f6.p {
    final /* synthetic */ f $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef<Object> ref$ObjectRef, f fVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, cVar);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // f6.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1265invokeWpGqRn0(((kotlinx.coroutines.channels.e) obj).m1252unboximpl(), (kotlin.coroutines.c) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m1265invokeWpGqRn0(Object obj, kotlin.coroutines.c cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(kotlinx.coroutines.channels.e.m1240boximpl(obj), cVar)).invokeSuspend(y5.w.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, kotlinx.coroutines.internal.g0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            ?? m1252unboximpl = ((kotlinx.coroutines.channels.e) this.L$0).m1252unboximpl();
            ref$ObjectRef = this.$lastValue;
            boolean z7 = m1252unboximpl instanceof e.c;
            if (!z7) {
                ref$ObjectRef.element = m1252unboximpl;
            }
            f fVar = this.$downstream;
            if (z7) {
                Throwable m1244exceptionOrNullimpl = kotlinx.coroutines.channels.e.m1244exceptionOrNullimpl(m1252unboximpl);
                if (m1244exceptionOrNullimpl != null) {
                    throw m1244exceptionOrNullimpl;
                }
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    if (obj2 == kotlinx.coroutines.flow.internal.l.NULL) {
                        obj2 = null;
                    }
                    this.L$0 = m1252unboximpl;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    if (fVar.emit(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.element = kotlinx.coroutines.flow.internal.l.DONE;
            }
            return y5.w.INSTANCE;
        }
        if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
        y5.g.throwOnFailure(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.element = kotlinx.coroutines.flow.internal.l.DONE;
        return y5.w.INSTANCE;
    }
}
