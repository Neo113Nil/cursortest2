package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements f6.q {
    final /* synthetic */ f6.q $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__ZipKt$combine$1$1(f6.q qVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        f fVar;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            fVar = (f) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            f6.q qVar = this.$transform;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.L$0 = fVar;
            this.label = 1;
            obj = qVar.invoke(obj2, obj3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                return y5.w.INSTANCE;
            }
            fVar = (f) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (fVar.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.q
    public final Object invoke(f fVar, Object[] objArr, kotlin.coroutines.c cVar) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, cVar);
        flowKt__ZipKt$combine$1$1.L$0 = fVar;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(y5.w.INSTANCE);
    }
}
