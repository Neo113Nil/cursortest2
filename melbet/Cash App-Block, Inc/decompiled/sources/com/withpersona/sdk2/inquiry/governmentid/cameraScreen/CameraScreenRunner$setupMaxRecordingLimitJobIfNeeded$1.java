package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import java.io.File;
import kotlin.ExceptionsKt__ExceptionsKt;
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
public final class CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long $maxRecordingLengthMs;
    public final /* synthetic */ Screen.CameraScreen $rendering;
    public int label;
    public final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1(long j, CameraScreenRunner cameraScreenRunner, Screen.CameraScreen cameraScreen, Continuation continuation) {
        super(2, continuation);
        this.$maxRecordingLengthMs = j;
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1(this.$maxRecordingLengthMs, this.this$0, this.$rendering, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r0 == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r19.$maxRecordingLengthMs, r19) == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object mo4084stopVideoIoAF18A;
        Function1 function1;
        CameraScreenRunner cameraScreenRunner = this.this$0;
        CameraController cameraController = cameraScreenRunner.cameraController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Screen.CameraScreen cameraScreen = this.$rendering;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
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
                    TrackingEventsLogger.DefaultImpls.logVideoStopEvent$default(cameraScreenRunner.trackingEventsLogger, "government-id", cameraScreen.videoCaptureMethod.toString(), null, null, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4084stopVideoIoAF18A);
                if (m4120exceptionOrNullimpl != null) {
                    TrackingEventsLogger.DefaultImpls.logVideoErrorEvent$default(cameraScreenRunner.trackingEventsLogger, "government-id", cameraScreen.videoCaptureMethod.toString(), null, ExceptionsKt__ExceptionsKt.stackTraceToString(m4120exceptionOrNullimpl), false, 20, null);
                }
                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(cameraScreenRunner.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.RECORDING_TIMED_OUT, null, null, 4, null), false, 2, null);
                function1 = cameraScreenRunner.currentErrorHandler;
                if (function1 != null) {
                    function1.invoke(new RecordingTooLongError());
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        cameraScreenRunner.maxRecordingLimitJob = null;
        if (cameraController.getCameraState().getValue() instanceof CameraState.Closed) {
            return Unit.INSTANCE;
        }
        if (cameraScreen.videoCaptureMethod == VideoCaptureMethod.Upload) {
            this.label = 2;
            mo4084stopVideoIoAF18A = cameraController.mo4084stopVideoIoAF18A(this);
        }
        TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(cameraScreenRunner.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.RECORDING_TIMED_OUT, null, null, 4, null), false, 2, null);
        function1 = cameraScreenRunner.currentErrorHandler;
        if (function1 != null) {
        }
        return Unit.INSTANCE;
    }
}
