package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements f6.r {
    final /* synthetic */ f6.p $predicate;
    final /* synthetic */ long $retries;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__ErrorsKt$retry$3(long j8, f6.p pVar, kotlin.coroutines.c cVar) {
        super(4, cVar);
        this.$retries = j8;
        this.$predicate = pVar;
    }

    @Override // f6.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((f) obj, (Throwable) obj2, ((Number) obj3).longValue(), (kotlin.coroutines.c) obj4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        boolean z7 = true;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            if (this.J$0 < this.$retries) {
                f6.p pVar = this.$predicate;
                this.label = 1;
                obj = pVar.invoke(th, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            z7 = false;
            return kotlin.coroutines.jvm.internal.a.boxBoolean(z7);
        }
        if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y5.g.throwOnFailure(obj);
    }

    public final Object invoke(f fVar, Throwable th, long j8, kotlin.coroutines.c cVar) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.$retries, this.$predicate, cVar);
        flowKt__ErrorsKt$retry$3.L$0 = th;
        flowKt__ErrorsKt$retry$3.J$0 = j8;
        return flowKt__ErrorsKt$retry$3.invokeSuspend(y5.w.INSTANCE);
    }
}
