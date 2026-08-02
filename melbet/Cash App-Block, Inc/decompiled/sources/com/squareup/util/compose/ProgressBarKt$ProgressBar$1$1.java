package com.squareup.util.compose;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProgressBarKt$ProgressBar$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableFloatState $animationTarget$delegate;
    public /* synthetic */ float $progress;
    public final /* synthetic */ int $r8$classId = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarKt$ProgressBar$1$1(float f, MutableFloatState mutableFloatState, Continuation continuation) {
        super(2, continuation);
        this.$progress = f;
        this.$animationTarget$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ProgressBarKt$ProgressBar$1$1(this.$progress, this.$animationTarget$delegate, continuation);
            default:
                ProgressBarKt$ProgressBar$1$1 progressBarKt$ProgressBar$1$1 = new ProgressBarKt$ProgressBar$1$1(this.$animationTarget$delegate, continuation);
                progressBarKt$ProgressBar$1$1.$progress = ((Number) obj).floatValue();
                return progressBarKt$ProgressBar$1$1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((ProgressBarKt$ProgressBar$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ProgressBarKt$ProgressBar$1$1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableFloatState mutableFloatState = this.$animationTarget$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(this.$progress);
                break;
            default:
                float f = this.$progress;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(f);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarKt$ProgressBar$1$1(MutableFloatState mutableFloatState, Continuation continuation) {
        super(2, continuation);
        this.$animationTarget$delegate = mutableFloatState;
    }
}
