package com.withpersona.sdk2.inquiry.selfie.cameraScreen;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class CameraScreenRunner$showRendering$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CameraController $cameraController;
    public final /* synthetic */ zzpc $mode;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SelfieWorkflow.Screen.CameraScreen $rendering;
    public int label;
    public final /* synthetic */ CameraScreenRunner this$0;

    /* renamed from: com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ CameraController $cameraController;
        public final /* synthetic */ zzpc $mode;
        public final /* synthetic */ SelfieWorkflow.Screen.CameraScreen $rendering;
        public int label;
        public final /* synthetic */ CameraScreenRunner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CameraController cameraController, CameraScreenRunner cameraScreenRunner, zzpc zzpcVar, SelfieWorkflow.Screen.CameraScreen cameraScreen, Continuation continuation) {
            super(2, continuation);
            this.$cameraController = cameraController;
            this.this$0 = cameraScreenRunner;
            this.$mode = zzpcVar;
            this.$rendering = cameraScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$cameraController, this.this$0, this.$mode, this.$rendering, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        
            if (r0 == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
        
            if (r2 == r1) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object mo4084stopVideoIoAF18A;
            Object mo4083startVideoIoAF18A;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zzpc zzpcVar = this.$mode;
            SelfieWorkflow.Screen.CameraScreen cameraScreen = this.$rendering;
            CameraController cameraController = this.$cameraController;
            CameraScreenRunner cameraScreenRunner = this.this$0;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                mo4084stopVideoIoAF18A = cameraController.mo4084stopVideoIoAF18A(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    mo4083startVideoIoAF18A = ((Result) obj).value;
                    Result.Companion companion = Result.Companion;
                    if (!(mo4083startVideoIoAF18A instanceof Result.Failure)) {
                        boolean booleanValue = ((Boolean) mo4083startVideoIoAF18A).booleanValue();
                        TrackingEventsLogger.DefaultImpls.logVideoStartEvent$default(cameraScreenRunner.trackingEventsLogger, "selfie", cameraScreen.videoCaptureMethod.name(), null, false, 12, null);
                        if (booleanValue) {
                            StandaloneCoroutine standaloneCoroutine = cameraScreenRunner.maxRecordingLimitJob;
                            if (standaloneCoroutine != null) {
                                standaloneCoroutine.cancel(null);
                            }
                            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = cameraScreenRunner.lifecycleScope;
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            cameraScreenRunner.maxRecordingLimitJob = JobKt.launch$default(lifecycleCoroutineScopeImpl, DefaultIoScheduler.INSTANCE, null, new CameraScreenRunner$showRendering$2$2$3$1(cameraController, cameraScreenRunner, zzpcVar, cameraScreen, null), 2);
                        }
                    }
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4083startVideoIoAF18A);
                    if (m4120exceptionOrNullimpl != null) {
                        ((SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable) zzpcVar).onError.invoke(m4120exceptionOrNullimpl);
                        TrackingEventsLogger.DefaultImpls.logVideoErrorEvent$default(cameraScreenRunner.trackingEventsLogger, "selfie", cameraScreen.videoCaptureMethod.name(), null, ExceptionsKt__ExceptionsKt.stackTraceToString(m4120exceptionOrNullimpl), false, 20, null);
                    }
                    ((SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable) zzpcVar).previewReady.invoke(cameraController.getCameraProperties());
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                mo4084stopVideoIoAF18A = ((Result) obj).value;
            }
            Result.Companion companion2 = Result.Companion;
            if (!(mo4084stopVideoIoAF18A instanceof Result.Failure)) {
                TrackingEventsLogger.DefaultImpls.logVideoStopEvent$default(cameraScreenRunner.trackingEventsLogger, "selfie", cameraScreen.videoCaptureMethod.name(), null, null, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                ((File) mo4084stopVideoIoAF18A).delete();
            }
            Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(mo4084stopVideoIoAF18A);
            if (m4120exceptionOrNullimpl2 != null) {
                TrackingEventsLogger.DefaultImpls.logVideoErrorEvent$default(cameraScreenRunner.trackingEventsLogger, "selfie", cameraScreen.videoCaptureMethod.name(), null, ExceptionsKt__ExceptionsKt.stackTraceToString(m4120exceptionOrNullimpl2), false, 20, null);
            }
            TrackingEventsLogger.DefaultImpls.logCameraInfoEvent$default(cameraScreenRunner.trackingEventsLogger, CameraPropertiesKt.toCameraInfoEventData(cameraController.getCameraProperties()), false, 2, null);
            if (((SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable) zzpcVar).recordLocalVideo) {
                this.label = 2;
                mo4083startVideoIoAF18A = cameraController.mo4083startVideoIoAF18A(this);
            }
            ((SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable) zzpcVar).previewReady.invoke(cameraController.getCameraProperties());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$showRendering$2(CameraController cameraController, CameraScreenRunner cameraScreenRunner, zzpc zzpcVar, SelfieWorkflow.Screen.CameraScreen cameraScreen, Continuation continuation) {
        super(2, continuation);
        this.$cameraController = cameraController;
        this.this$0 = cameraScreenRunner;
        this.$mode = zzpcVar;
        this.$rendering = cameraScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CameraScreenRunner$showRendering$2(this.$cameraController, this.this$0, this.$mode, this.$rendering, continuation);
            default:
                return new CameraScreenRunner$showRendering$2(this.this$0, this.$rendering, this.$cameraController, this.$mode, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CameraScreenRunner$showRendering$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r14 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r13) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r14, r7, r13) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collect(r5, r13) == r0) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object mo4085takePictureIoAF18A;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                CameraController cameraController = this.$cameraController;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(cameraController.getCameraState(), new RealSheetState$peek$3.AnonymousClass2(2, null, 17), 0);
                    this.label = 1;
                    break;
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cameraController, this.this$0, this.$mode, this.$rendering, null);
                this.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                SelfieWorkflow.Screen.CameraScreen cameraScreen = this.$rendering;
                CameraScreenRunner cameraScreenRunner = this.this$0;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    cameraScreenRunner.takingManualCapture = true;
                    if (cameraScreen.isFlashEnabled) {
                        cameraScreenRunner.setFlash(true);
                        this.label = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    mo4085takePictureIoAF18A = ((Result) obj).value;
                    Result.Companion companion = Result.Companion;
                    boolean z = mo4085takePictureIoAF18A instanceof Result.Failure;
                    zzpc zzpcVar = this.$mode;
                    if (!z) {
                        Function1 function1 = ((SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture) zzpcVar).processImage;
                        String absolutePath = ((File) mo4085takePictureIoAF18A).getAbsolutePath();
                        absolutePath.getClass();
                        function1.invoke(absolutePath);
                    }
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4085takePictureIoAF18A);
                    if (m4120exceptionOrNullimpl != null) {
                        ((SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture) zzpcVar).onError.invoke(m4120exceptionOrNullimpl);
                    }
                    if (cameraScreen.isFlashEnabled) {
                        cameraScreenRunner.setFlash(false);
                    }
                    cameraScreenRunner.takingManualCapture = false;
                    break;
                }
                this.label = 2;
                mo4085takePictureIoAF18A = this.$cameraController.mo4085takePictureIoAF18A(this);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenRunner$showRendering$2(CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen cameraScreen, CameraController cameraController, zzpc zzpcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
        this.$cameraController = cameraController;
        this.$mode = zzpcVar;
    }
}
