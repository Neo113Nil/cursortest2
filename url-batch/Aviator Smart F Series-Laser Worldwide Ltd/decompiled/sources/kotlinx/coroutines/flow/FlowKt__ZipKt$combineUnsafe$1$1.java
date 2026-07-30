package kotlinx.coroutines.flow;

import com.realsil.sdk.dfu.DfuException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS, DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combineUnsafe$1$1 extends SuspendLambda implements f6.q {
    final /* synthetic */ f6.p $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineUnsafe$1$1(f6.p pVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.$transform = pVar;
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
            f6.p pVar = this.$transform;
            this.L$0 = fVar;
            this.label = 1;
            obj = pVar.invoke(objArr, this);
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

    public final Object invokeSuspend$$forInline(Object obj) {
        f fVar = (f) this.L$0;
        Object invoke = this.$transform.invoke((Object[]) this.L$1, this);
        kotlin.jvm.internal.r.mark(0);
        fVar.emit(invoke, this);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }

    @Override // f6.q
    public final Object invoke(f fVar, T[] tArr, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.s.needClassReification();
        FlowKt__ZipKt$combineUnsafe$1$1 flowKt__ZipKt$combineUnsafe$1$1 = new FlowKt__ZipKt$combineUnsafe$1$1(this.$transform, cVar);
        flowKt__ZipKt$combineUnsafe$1$1.L$0 = fVar;
        flowKt__ZipKt$combineUnsafe$1$1.L$1 = tArr;
        return flowKt__ZipKt$combineUnsafe$1$1.invokeSuspend(y5.w.INSTANCE);
    }
}
