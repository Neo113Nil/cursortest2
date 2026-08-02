package com.withpersona.sdk2.inquiry.selfie;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class OldCameraScreenRunner$showRendering$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MathUtils $mode;
    public int label;
    public final /* synthetic */ OldCameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldCameraScreenRunner$showRendering$1$2(MathUtils mathUtils, OldCameraScreenRunner oldCameraScreenRunner, Continuation continuation) {
        super(2, continuation);
        this.$mode = mathUtils;
        this.this$0 = oldCameraScreenRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OldCameraScreenRunner$showRendering$1$2(this.$mode, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OldCameraScreenRunner$showRendering$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            long j = ((SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup) this.$mode).maxRecordingLengthMs;
            this.label = 1;
            if (JobKt.delay(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        OldCameraScreenRunner oldCameraScreenRunner = this.this$0;
        if (oldCameraScreenRunner.cameraController.getCameraState().getValue() instanceof CameraState.Closed) {
            return Unit.INSTANCE;
        }
        TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(oldCameraScreenRunner.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "webrtc", null, null, 8, null), false, 2, null);
        Function1 function1 = oldCameraScreenRunner.currentErrorHandler;
        if (function1 != null) {
            function1.invoke(new RecordingTooLongError());
        }
        return Unit.INSTANCE;
    }
}
