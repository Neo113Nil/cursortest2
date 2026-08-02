package com.withpersona.sdk2.inquiry.selfie.cameraScreen;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;
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
public final class CameraScreenRunner$showRendering$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CameraController $cameraController;
    public final /* synthetic */ zzpc $mode;
    public int label;
    public final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$showRendering$3(zzpc zzpcVar, CameraController cameraController, CameraScreenRunner cameraScreenRunner, Continuation continuation) {
        super(2, continuation);
        this.$mode = zzpcVar;
        this.$cameraController = cameraController;
        this.this$0 = cameraScreenRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraScreenRunner$showRendering$3(this.$mode, this.$cameraController, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraScreenRunner$showRendering$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            long j = ((SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup) this.$mode).maxRecordingLengthMs;
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
        if (this.$cameraController.getCameraState().getValue() instanceof CameraState.Closed) {
            return Unit.INSTANCE;
        }
        CameraScreenRunner cameraScreenRunner = this.this$0;
        TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(cameraScreenRunner.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, null, null, null, 8, null), false, 2, null);
        Function1 function1 = cameraScreenRunner.currentErrorHandler;
        if (function1 != null) {
            function1.invoke(new RecordingTooLongError());
        }
        return Unit.INSTANCE;
    }
}
