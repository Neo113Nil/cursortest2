package com.withpersona.sdk2.inquiry.selfie.state;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraHelper;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class SelfieStepStateManager$handleState$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ SelfieStepStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelfieStepStateManager$handleState$1(SelfieStepStateManager selfieStepStateManager, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = selfieStepStateManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        SelfieStepStateManager selfieStepStateManager = this.this$0;
        switch (i) {
            case 0:
                return new SelfieStepStateManager$handleState$1(selfieStepStateManager, continuation, 0);
            case 1:
                return new SelfieStepStateManager$handleState$1(selfieStepStateManager, continuation, 1);
            case 2:
                return new SelfieStepStateManager$handleState$1(selfieStepStateManager, continuation, 2);
            default:
                return new SelfieStepStateManager$handleState$1(selfieStepStateManager, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((SelfieStepStateManager$handleState$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        SelfieStepStateManager selfieStepStateManager = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Context context = selfieStepStateManager.applicationContext;
                    this.label = 1;
                    if (CameraHelper.INSTANCE.unbind(context, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                SubtreeManager subtreeManager = (SubtreeManager) selfieStepStateManager.lastChild;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(1000L, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                WorkflowState state = subtreeManager.getState();
                SelfieState.Capture capture = state instanceof SelfieState.Capture ? (SelfieState.Capture) state : null;
                if (capture != null) {
                    subtreeManager.updateState(SelfieState.Capture.copy$default(capture, null, RecyclerView.DECELERATION_RATE, null, false, SelfieState.FlashState.ReadyToCapture, 8191));
                    break;
                } else {
                    break;
                }
            case 2:
                SubtreeManager subtreeManager2 = (SubtreeManager) selfieStepStateManager.lastChild;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(3000L, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                WorkflowState state2 = subtreeManager2.getState();
                SelfieState.Capture capture2 = state2 instanceof SelfieState.Capture ? (SelfieState.Capture) state2 : null;
                if (capture2 != null) {
                    subtreeManager2.updateState(SelfieState.Capture.copy$default(capture2, null, RecyclerView.DECELERATION_RATE, null, false, SelfieState.FlashState.Enabled, 8191));
                    break;
                } else {
                    break;
                }
            default:
                SubtreeManager subtreeManager3 = (SubtreeManager) selfieStepStateManager.lastChild;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(1000L, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                WorkflowState state3 = subtreeManager3.getState();
                SelfieState.CountdownToManualCapture countdownToManualCapture = state3 instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) state3 : null;
                if (countdownToManualCapture != null) {
                    int i6 = countdownToManualCapture.countDown;
                    if (i6 >= 1) {
                        subtreeManager3.updateState(SelfieState.CountdownToManualCapture.copy$default(countdownToManualCapture, i6 - 1, countdownToManualCapture.selfieError, false, 2044));
                    }
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
