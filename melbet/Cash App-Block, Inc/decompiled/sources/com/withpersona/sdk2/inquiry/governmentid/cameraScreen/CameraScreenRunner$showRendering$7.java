package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
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
public final class CameraScreenRunner$showRendering$7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Screen.CameraScreen $rendering;
    public int label;
    public final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$showRendering$7(Screen.CameraScreen cameraScreen, CameraScreenRunner cameraScreenRunner, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraScreenRunner$showRendering$7(this.$rendering, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraScreenRunner$showRendering$7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mo4084stopVideoIoAF18A;
        CameraScreenRunner cameraScreenRunner = this.this$0;
        CameraController cameraController = cameraScreenRunner.cameraController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            mo4084stopVideoIoAF18A = cameraController.mo4084stopVideoIoAF18A(this);
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
        Screen.CameraScreen cameraScreen = this.$rendering;
        if (!z) {
            cameraScreen.onLocalVideoFinalized.invoke((File) mo4084stopVideoIoAF18A, cameraController.getCameraProperties());
            TrackingEventsLogger.DefaultImpls.logVideoStopEvent$default(cameraScreenRunner.trackingEventsLogger, "government-id", cameraScreen.videoCaptureMethod.toString(), null, null, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4084stopVideoIoAF18A);
        if (m4120exceptionOrNullimpl != null) {
            TrackingEventsLogger.DefaultImpls.logVideoErrorEvent$default(cameraScreenRunner.trackingEventsLogger, "government-id", cameraScreen.videoCaptureMethod.toString(), null, ExceptionsKt__ExceptionsKt.stackTraceToString(m4120exceptionOrNullimpl), false, 20, null);
            if (!(m4120exceptionOrNullimpl instanceof NoActiveRecordingError)) {
                cameraScreen.onCameraError.invoke(m4120exceptionOrNullimpl);
            }
        }
        return Unit.INSTANCE;
    }
}
