package com.withpersona.sdk2.inquiry.selfie.state;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.resources.MaterialAttributes;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class SelfieStepStateManager$renderCountdownToCapture$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ SelfieWorkflow.Input $renderProps;
    public final /* synthetic */ SelfieState.CountdownToCapture $renderState;
    public long J$0;
    public int label;
    public final /* synthetic */ SelfieStepStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieStepStateManager$renderCountdownToCapture$2(SelfieWorkflow.Input input, SelfieStepStateManager selfieStepStateManager, SelfieState.CountdownToCapture countdownToCapture, Continuation continuation) {
        super(1, continuation);
        this.$renderProps = input;
        this.this$0 = selfieStepStateManager;
        this.$renderState = countdownToCapture;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SelfieStepStateManager$renderCountdownToCapture$2(this.$renderProps, this.this$0, this.$renderState, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SelfieStepStateManager$renderCountdownToCapture$2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        SubtreeManager subtreeManager = (SubtreeManager) this.this$0.lastChild;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        SelfieWorkflow.Input input = this.$renderProps;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            input.getClass();
            this.J$0 = 1000L;
            this.label = 1;
            if (JobKt.delay(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = 1000;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            SafeTrace.throwOnFailure(obj);
        }
        WorkflowState state = subtreeManager.getState();
        SelfieState.CountdownToCapture countdownToCapture = state instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) state : null;
        if (countdownToCapture == null) {
            return Unit.INSTANCE;
        }
        int i2 = countdownToCapture.countDown;
        if (i2 <= 1 || j <= 0) {
            SelfieError selfieError = countdownToCapture.selfieError;
            List list = countdownToCapture.posesNeeded;
            long j2 = countdownToCapture.startCaptureTimestamp;
            CameraProperties cameraProperties = countdownToCapture.cameraProperties;
            SelfieState.CountdownToCapture countdownToCapture2 = this.$renderState;
            subtreeManager.updateState(new SelfieState.Capture(countdownToCapture2.poseScore, 8264, j2, countdownToCapture2.startSelfieTimestamp, countdownToCapture2.cameraFacingMode, cameraProperties, countdownToCapture2.brightnessInfo, selfieError, input.poseConfigs, MaterialAttributes.createBackState(subtreeManager, false), (List) null, list, false, countdownToCapture2.isFlashEnabled));
        } else {
            subtreeManager.updateState(SelfieState.CountdownToCapture.copy$default(countdownToCapture, i2 - 1, countdownToCapture.selfieError, false, 16380));
        }
        return Unit.INSTANCE;
    }
}
