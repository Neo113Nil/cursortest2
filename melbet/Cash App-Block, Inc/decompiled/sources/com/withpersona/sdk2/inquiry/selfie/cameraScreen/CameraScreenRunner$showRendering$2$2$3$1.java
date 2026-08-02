package com.withpersona.sdk2.inquiry.selfie.cameraScreen;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
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
public final class CameraScreenRunner$showRendering$2$2$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CameraController $cameraController;
    public final /* synthetic */ zzpc $mode;
    public final /* synthetic */ SelfieWorkflow.Screen.CameraScreen $rendering;
    public int label;
    public final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$showRendering$2$2$3$1(CameraController cameraController, CameraScreenRunner cameraScreenRunner, zzpc zzpcVar, SelfieWorkflow.Screen.CameraScreen cameraScreen, Continuation continuation) {
        super(2, continuation);
        this.$mode = zzpcVar;
        this.$cameraController = cameraController;
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraScreenRunner$showRendering$2$2$3$1(this.$cameraController, this.this$0, this.$mode, this.$rendering, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraScreenRunner$showRendering$2$2$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r13 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002e, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r4, r12) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object mo4084stopVideoIoAF18A;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            long j = ((SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable) this.$mode).maxRecordingLengthMs;
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
                boolean z = mo4084stopVideoIoAF18A instanceof Result.Failure;
                SelfieWorkflow.Screen.CameraScreen cameraScreen = this.$rendering;
                CameraScreenRunner cameraScreenRunner = this.this$0;
                if (!z) {
                    TrackingEventsLogger.DefaultImpls.logVideoStopEvent$default(cameraScreenRunner.trackingEventsLogger, "selfie", cameraScreen.videoCaptureMethod.name(), null, null, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    ((File) mo4084stopVideoIoAF18A).delete();
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4084stopVideoIoAF18A);
                if (m4120exceptionOrNullimpl != null) {
                    TrackingEventsLogger.DefaultImpls.logVideoErrorEvent$default(cameraScreenRunner.trackingEventsLogger, "selfie", cameraScreen.videoCaptureMethod.name(), null, ExceptionsKt__ExceptionsKt.stackTraceToString(m4120exceptionOrNullimpl), false, 20, null);
                }
                Function1 function1 = cameraScreenRunner.currentErrorHandler;
                if (function1 != null) {
                    function1.invoke(new RecordingTooLongError());
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        CameraController cameraController = this.$cameraController;
        if (cameraController.getCameraState().getValue() instanceof CameraState.Closed) {
            return Unit.INSTANCE;
        }
        this.label = 2;
        mo4084stopVideoIoAF18A = cameraController.mo4084stopVideoIoAF18A(this);
    }
}
