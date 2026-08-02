package com.withpersona.sdk2.inquiry.selfie;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import java.io.File;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class OldCameraScreenRunner$showRendering$1$1$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MathUtils $mode;
    public int label;
    public final /* synthetic */ OldCameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldCameraScreenRunner$showRendering$1$1$2$1$1(MathUtils mathUtils, OldCameraScreenRunner oldCameraScreenRunner, Continuation continuation) {
        super(2, continuation);
        this.$mode = mathUtils;
        this.this$0 = oldCameraScreenRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OldCameraScreenRunner$showRendering$1$1$2$1$1(this.$mode, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OldCameraScreenRunner$showRendering$1$1$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r14 == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r7, r14) == r2) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object mo4084stopVideoIoAF18A;
        OldCameraScreenRunner oldCameraScreenRunner = this.this$0;
        CameraController cameraController = oldCameraScreenRunner.cameraController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            long j = ((SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) this.$mode).maxRecordingLengthMs;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mo4084stopVideoIoAF18A = ((Result) obj).value;
                Result.Companion companion = Result.Companion;
                if (!(mo4084stopVideoIoAF18A instanceof Result.Failure)) {
                    ((File) mo4084stopVideoIoAF18A).delete();
                }
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(oldCameraScreenRunner.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, "local_video", null, null, 8, null), false, 2, null);
                Function1 function1 = oldCameraScreenRunner.currentErrorHandler;
                if (function1 != null) {
                    function1.invoke(new RecordingTooLongError());
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (cameraController.getCameraState().getValue() instanceof CameraState.Closed) {
            return Unit.INSTANCE;
        }
        this.label = 2;
        mo4084stopVideoIoAF18A = cameraController.mo4084stopVideoIoAF18A(this);
    }
}
