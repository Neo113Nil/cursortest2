package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class CameraScreenRunner$startLocalVideoCaptureIfNeeded$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LifecycleCoroutineScopeImpl $lifecycleScope;
    public final /* synthetic */ long $maxRecordingLengthMs;
    public final /* synthetic */ Screen.CameraScreen $rendering;
    public int label;
    public final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$startLocalVideoCaptureIfNeeded$1(CameraScreenRunner cameraScreenRunner, Screen.CameraScreen cameraScreen, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
        this.$lifecycleScope = lifecycleCoroutineScopeImpl;
        this.$maxRecordingLengthMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraScreenRunner$startLocalVideoCaptureIfNeeded$1(this.this$0, this.$rendering, this.$lifecycleScope, this.$maxRecordingLengthMs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraScreenRunner$startLocalVideoCaptureIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CameraScreenRunner cameraScreenRunner = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CameraController cameraController = cameraScreenRunner.cameraController;
            this.label = 1;
            Object mo4083startVideoIoAF18A = cameraController.mo4083startVideoIoAF18A(this);
            if (mo4083startVideoIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = mo4083startVideoIoAF18A;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            obj2 = ((Result) obj).value;
        }
        Result.Companion companion = Result.Companion;
        boolean z = obj2 instanceof Result.Failure;
        Screen.CameraScreen cameraScreen = this.$rendering;
        if (!z) {
            if (((Boolean) obj2).booleanValue()) {
                StandaloneCoroutine standaloneCoroutine = cameraScreenRunner.maxRecordingLimitJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                cameraScreenRunner.maxRecordingLimitJob = JobKt.launch$default(this.$lifecycleScope, DefaultIoScheduler.INSTANCE, null, new CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1(this.$maxRecordingLengthMs, cameraScreenRunner, cameraScreen, null), 2);
            }
            TrackingEventsLogger.DefaultImpls.logVideoStartEvent$default(cameraScreenRunner.trackingEventsLogger, "government-id", cameraScreen.videoCaptureMethod.toString(), null, false, 12, null);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
        if (m4120exceptionOrNullimpl != null) {
            TrackingEventsLogger.DefaultImpls.logVideoErrorEvent$default(cameraScreenRunner.trackingEventsLogger, "government-id", cameraScreen.videoCaptureMethod.toString(), null, ExceptionsKt__ExceptionsKt.stackTraceToString(m4120exceptionOrNullimpl), false, 20, null);
        }
        return Unit.INSTANCE;
    }
}
