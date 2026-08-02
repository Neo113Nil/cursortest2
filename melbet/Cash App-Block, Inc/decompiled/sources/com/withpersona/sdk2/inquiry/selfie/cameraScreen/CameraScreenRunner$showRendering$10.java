package com.withpersona.sdk2.inquiry.selfie.cameraScreen;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.io.File;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class CameraScreenRunner$showRendering$10 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CameraController $cameraController;
    public final /* synthetic */ zzpc $mode;
    public final /* synthetic */ SelfieWorkflow.Screen.CameraScreen $rendering;
    public int label;
    public final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$showRendering$10(CameraController cameraController, CameraScreenRunner cameraScreenRunner, zzpc zzpcVar, SelfieWorkflow.Screen.CameraScreen cameraScreen, Continuation continuation) {
        super(2, continuation);
        this.$cameraController = cameraController;
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
        this.$mode = zzpcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelfieWorkflow.Screen.CameraScreen cameraScreen = this.$rendering;
        return new CameraScreenRunner$showRendering$10(this.$cameraController, this.this$0, this.$mode, cameraScreen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraScreenRunner$showRendering$10) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mo4084stopVideoIoAF18A;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            mo4084stopVideoIoAF18A = this.$cameraController.mo4084stopVideoIoAF18A(this);
            if (mo4084stopVideoIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            mo4084stopVideoIoAF18A = ((Result) obj).value;
        }
        Result.Companion companion = Result.Companion;
        boolean z = mo4084stopVideoIoAF18A instanceof Result.Failure;
        zzpc zzpcVar = this.$mode;
        SelfieWorkflow.Screen.CameraScreen cameraScreen = this.$rendering;
        CameraScreenRunner cameraScreenRunner = this.this$0;
        if (!z) {
            TrackingEventsLogger.DefaultImpls.logVideoStopEvent$default(cameraScreenRunner.trackingEventsLogger, "selfie", cameraScreen.videoCaptureMethod.name(), null, null, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture selfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture = (SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture) zzpcVar;
            selfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture.finalizeVideo.invoke((File) mo4084stopVideoIoAF18A);
            selfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture.onAnimationComplete.invoke();
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4084stopVideoIoAF18A);
        if (m4120exceptionOrNullimpl != null) {
            TrackingEventsLogger.DefaultImpls.logVideoErrorEvent$default(cameraScreenRunner.trackingEventsLogger, "selfie", cameraScreen.videoCaptureMethod.name(), null, ExceptionsKt__ExceptionsKt.stackTraceToString(m4120exceptionOrNullimpl), false, 20, null);
            if (!(m4120exceptionOrNullimpl instanceof NoActiveRecordingError)) {
                cameraScreen.onCameraError.invoke(m4120exceptionOrNullimpl);
                ((SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture) zzpcVar).onAnimationComplete.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
