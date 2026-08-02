package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.SurfaceHolder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.scannerview.CameraOperator$$ExternalSyntheticLambda0;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class Camera2Manager {
    public final StateFlowImpl _state;
    public float analysisSizeScaling;
    public final Camera2ImageAnalyzer analyzer;
    public CameraDevice camera;
    public final CameraChoice cameraChoice;
    public final Handler cameraHandler;
    public final CameraManager cameraManager;
    public final CameraProperties cameraProperties;
    public final RealCameraStatsManager cameraStatsManager;
    public final CameraCharacteristics characteristics;
    public final Context context;
    public final ContextScope coroutineScope;
    public final StateFlowImpl imageCaptureResult;
    public final SharedFlowImpl imageProcessingFlow;
    public ImageReader imageReader;
    public volatile boolean isAnalyzerEnabled;
    public final boolean isAudioRequired;
    public volatile boolean isImageCaptureRequested;
    public boolean isPreviewStarted;
    public volatile boolean isPreviewSurfaceAvailable;
    public final MediaRecorderWrapper mediaRecorderWrapper;
    public final int orientation;
    public final Camera2PreviewView previewView;
    public final ConditionVariable processImageHaltedCv;
    public volatile boolean recordingStarted;
    public final SdkFilesManager sdkFilesManager;
    public CameraCaptureSessionWrapper session;
    public final StateFlowImpl state;
    public Camera2Manager$start$1 surfaceHolderCallback;
    public final VideoCaptureMethod videoCaptureMethod;

    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Camera2Manager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Camera2Manager camera2Manager, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = camera2Manager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Camera2Manager camera2Manager = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(camera2Manager, continuation, 0);
                case 1:
                    return new AnonymousClass1(camera2Manager, continuation, 1);
                case 2:
                    return new AnonymousClass1(camera2Manager, continuation, 2);
                case 3:
                    return new AnonymousClass1(camera2Manager, continuation, 3);
                case 4:
                    return new AnonymousClass1(camera2Manager, continuation, 4);
                case 5:
                    return new AnonymousClass1(camera2Manager, continuation, 5);
                case 6:
                    return new AnonymousClass1(camera2Manager, continuation, 6);
                case 7:
                    return new AnonymousClass1(camera2Manager, continuation, 7);
                default:
                    return new AnonymousClass1(camera2Manager, continuation, 8);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 1;
            Continuation continuation = null;
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Camera2Manager camera2Manager = this.this$0;
                    SharedFlowImpl sharedFlowImpl = camera2Manager.imageProcessingFlow;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(camera2Manager, 23);
                    this.label = 1;
                    sharedFlowImpl.collect(anonymousClass1, this);
                    return coroutineSingletons;
                case 1:
                    Camera2Manager camera2Manager2 = this.this$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Object value = camera2Manager2._state.getValue();
                        State.Destroyed destroyed = State.Destroyed.INSTANCE;
                        if (Intrinsics.areEqual(value, destroyed)) {
                            return Unit.INSTANCE;
                        }
                        StateFlowImpl stateFlowImpl = camera2Manager2._state;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, destroyed);
                        SurfaceHolder holder = camera2Manager2.previewView.surfaceView.getHolder();
                        holder.getClass();
                        holder.removeCallback(camera2Manager2.surfaceHolderCallback);
                        camera2Manager2.processImageHaltedCv.block(2000L);
                        MediaRecorderWrapper mediaRecorderWrapper = camera2Manager2.mediaRecorderWrapper;
                        this.label = 1;
                        if (mediaRecorderWrapper.destroy(this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    camera2Manager2.imageReader.close();
                    CameraCaptureSessionWrapper cameraCaptureSessionWrapper = camera2Manager2.session;
                    if (cameraCaptureSessionWrapper != null) {
                        JobKt.cancel(cameraCaptureSessionWrapper.coroutineScope, (CancellationException) null);
                    }
                    camera2Manager2.session = null;
                    CameraDevice cameraDevice = camera2Manager2.camera;
                    if (cameraDevice != null) {
                        cameraDevice.close();
                    }
                    camera2Manager2.camera = null;
                    RealCameraStatsManager realCameraStatsManager = camera2Manager2.cameraStatsManager;
                    realCameraStatsManager.isEventListenerRegistered = false;
                    realCameraStatsManager.sensorManager.unregisterListener(realCameraStatsManager.sensorEventListener);
                    JobKt.cancel(camera2Manager2.coroutineScope, (CancellationException) null);
                    return Unit.INSTANCE;
                case 2:
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Camera2Manager camera2Manager3 = this.this$0;
                        this.label = 1;
                        camera2Manager3.getClass();
                        Object withContext = JobKt.withContext(Dispatchers.Default, new AnonymousClass1(camera2Manager3, continuation, i), this);
                        if (withContext != obj2) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 3:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.this$0.imageCaptureResult, 24);
                    this.label = 1;
                    Object first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                    return first == coroutineSingletons3 ? coroutineSingletons3 : first;
                case 4:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Camera2Manager camera2Manager4 = this.this$0;
                    CoroutineContext coroutineContext = camera2Manager4.coroutineScope.coroutineContext;
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(camera2Manager4, continuation, 3);
                    this.label = 1;
                    Object withContext2 = JobKt.withContext(coroutineContext, anonymousClass12, this);
                    return withContext2 == coroutineSingletons4 ? coroutineSingletons4 : withContext2;
                case 5:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.this$0.isImageCaptureRequested) {
                            Result.Companion companion = Result.Companion;
                            return new Result(new Result.Failure(new RuntimeException("Image capture already requested.")));
                        }
                        this.this$0.imageCaptureResult.setValue(null);
                        this.this$0.isImageCaptureRequested = true;
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        AnonymousClass1 anonymousClass13 = new AnonymousClass1(this.this$0, continuation, 4);
                        this.label = 1;
                        obj = JobKt.withContext(defaultIoScheduler, anonymousClass13, this);
                        if (obj == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Object obj3 = ((Result) obj).value;
                    this.this$0.isImageCaptureRequested = false;
                    return new Result(obj3);
                case 6:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Camera2Manager camera2Manager5 = this.this$0;
                        this.label = 1;
                        if (Camera2Manager.access$start$initializeCameraAndSetState(camera2Manager5, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Camera2Manager camera2Manager6 = this.this$0;
                        this.label = 1;
                        camera2Manager6.getClass();
                        Object withContext3 = JobKt.withContext(Dispatchers.Default, new AnonymousClass1(camera2Manager6, continuation, i), this);
                        if (withContext3 != obj4) {
                            withContext3 = Unit.INSTANCE;
                        }
                        if (withContext3 == obj4) {
                            return obj4;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Camera2Manager camera2Manager7 = this.this$0;
                        this.label = 1;
                        if (Camera2Manager.access$start$initializeCameraAndSetState(camera2Manager7, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"com/withpersona/sdk2/camera/camera2/Camera2Manager$Error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "MissingPermissionsCameraError", "InitializationError", "ImageWidthStrideMismatch", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$ImageWidthStrideMismatch;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$InitializationError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$MissingPermissionsCameraError;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public abstract class Error extends Exception {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$ImageWidthStrideMismatch;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ImageWidthStrideMismatch extends Error {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$InitializationError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class InitializationError extends Error {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$MissingPermissionsCameraError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MissingPermissionsCameraError extends Error {
        }
    }

    public interface State {

        public final class Created implements State {
            public static final Created INSTANCE = new Created();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Created);
            }

            public final int hashCode() {
                return -1835001754;
            }

            public final String toString() {
                return "Created";
            }
        }

        public final class Destroyed implements State {
            public static final Destroyed INSTANCE = new Destroyed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Destroyed);
            }

            public final int hashCode() {
                return -1111701481;
            }

            public final String toString() {
                return "Destroyed";
            }
        }

        public final class Error implements State {
            public final Error error;

            public Error(Error error) {
                this.error = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.error.equals(((Error) obj).error);
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.error + ")";
            }
        }

        /* loaded from: classes9.dex */
        public final class Started implements State {
            public static final Started INSTANCE = new Started();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Started);
            }

            public final int hashCode() {
                return -465774081;
            }

            public final String toString() {
                return "Started";
            }
        }
    }

    public Camera2Manager(Context context, CameraChoice cameraChoice, Camera2PreviewView camera2PreviewView, Camera2ImageAnalyzer camera2ImageAnalyzer, VideoCaptureMethod videoCaptureMethod, boolean z, RealCameraStatsManager realCameraStatsManager, SdkFilesManager sdkFilesManager) {
        context.getClass();
        cameraChoice.getClass();
        camera2ImageAnalyzer.getClass();
        videoCaptureMethod.getClass();
        realCameraStatsManager.getClass();
        sdkFilesManager.getClass();
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.previewView = camera2PreviewView;
        this.analyzer = camera2ImageAnalyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.isAudioRequired = z;
        this.cameraStatsManager = realCameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraProperties = cameraChoice.cameraProperties;
        ContextScope CoroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
        this.coroutineScope = CoroutineScope;
        String str = cameraChoice.id;
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        CameraManager cameraManager = (CameraManager) systemService;
        this.cameraManager = cameraManager;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
        cameraCharacteristics.getClass();
        this.characteristics = cameraCharacteristics;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Continuation continuation = null;
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            throw null;
        }
        int intValue = ((Number) obj).intValue();
        this.orientation = intValue;
        Object upper = cameraChoice.targetFpsRange.getUpper();
        upper.getClass();
        this.mediaRecorderWrapper = new MediaRecorderWrapper(context, cameraChoice, ((Number) upper).intValue(), intValue, z);
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = FlowKt.MutableStateFlow(null);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(State.Created.INSTANCE);
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = newImageReader();
        this.imageProcessingFlow = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.SUSPEND, 1);
        this.processImageHaltedCv = new ConditionVariable();
        JobKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(this, continuation, 0), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|20|(1:22)(1:25)|(1:24))|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        r5 = r5._state;
        r0 = new com.withpersona.sdk2.camera.camera2.Camera2Manager.State.Error(new com.withpersona.sdk2.camera.camera2.Camera2Manager.Error.InitializationError("Unable to initialize Camera2 classes", r6));
        r5.getClass();
        r5.updateState(null, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$start$initializeCameraAndSetState(Camera2Manager camera2Manager, ContinuationImpl continuationImpl) {
        Camera2Manager$start$initializeCameraAndSetState$1 camera2Manager$start$initializeCameraAndSetState$1;
        int i;
        if (continuationImpl instanceof Camera2Manager$start$initializeCameraAndSetState$1) {
            camera2Manager$start$initializeCameraAndSetState$1 = (Camera2Manager$start$initializeCameraAndSetState$1) continuationImpl;
            int i2 = camera2Manager$start$initializeCameraAndSetState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2Manager$start$initializeCameraAndSetState$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2Manager$start$initializeCameraAndSetState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2Manager$start$initializeCameraAndSetState$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    camera2Manager$start$initializeCameraAndSetState$1.L$0 = camera2Manager;
                    camera2Manager$start$initializeCameraAndSetState$1.label = 1;
                    camera2Manager.getClass();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    Object withContext = JobKt.withContext(MainDispatcherLoader.dispatcher, new ShimmerModifierKt$shimmer$1$1(camera2Manager, continuation, 26), camera2Manager$start$initializeCameraAndSetState$1);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    camera2Manager = camera2Manager$start$initializeCameraAndSetState$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                StateFlowImpl stateFlowImpl = camera2Manager._state;
                State.Started started = State.Started.INSTANCE;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, started);
                return Unit.INSTANCE;
            }
        }
        camera2Manager$start$initializeCameraAndSetState$1 = new Camera2Manager$start$initializeCameraAndSetState$1(continuationImpl);
        Object obj3 = camera2Manager$start$initializeCameraAndSetState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2Manager$start$initializeCameraAndSetState$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        StateFlowImpl stateFlowImpl2 = camera2Manager._state;
        State.Started started2 = State.Started.INSTANCE;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, started2);
        return Unit.INSTANCE;
    }

    public final ImageReader newImageReader() {
        CameraChoice cameraChoice = this.cameraChoice;
        ImageReader newInstance = ImageReader.newInstance((int) (cameraChoice.size.getWidth() * this.analysisSizeScaling), (int) (cameraChoice.size.getHeight() * this.analysisSizeScaling), 35, 3);
        newInstance.setOnImageAvailableListener(new CameraOperator$$ExternalSyntheticLambda0(this, 1), this.cameraHandler);
        return newInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: requestImageCapture-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4090requestImageCaptureIoAF18A(ContinuationImpl continuationImpl) {
        Camera2Manager$requestImageCapture$1 camera2Manager$requestImageCapture$1;
        int i;
        if (continuationImpl instanceof Camera2Manager$requestImageCapture$1) {
            camera2Manager$requestImageCapture$1 = (Camera2Manager$requestImageCapture$1) continuationImpl;
            int i2 = camera2Manager$requestImageCapture$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2Manager$requestImageCapture$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2Manager$requestImageCapture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2Manager$requestImageCapture$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, continuation, 5);
                    camera2Manager$requestImageCapture$1.label = 1;
                    obj = JobKt.withContext(handlerContext, anonymousClass1, camera2Manager$requestImageCapture$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((Result) obj).value;
            }
        }
        camera2Manager$requestImageCapture$1 = new Camera2Manager$requestImageCapture$1(this, continuationImpl);
        Object obj2 = camera2Manager$requestImageCapture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2Manager$requestImageCapture$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return ((Result) obj2).value;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: startVideo-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m4091startVideoIoAF18A(ContinuationImpl continuationImpl) {
        Camera2Manager$startVideo$1 camera2Manager$startVideo$1;
        int i;
        try {
            if (continuationImpl instanceof Camera2Manager$startVideo$1) {
                camera2Manager$startVideo$1 = (Camera2Manager$startVideo$1) continuationImpl;
                int i2 = camera2Manager$startVideo$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    camera2Manager$startVideo$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = camera2Manager$startVideo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = camera2Manager$startVideo$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.recordingStarted) {
                            Result.Companion companion = Result.Companion;
                            return Boolean.FALSE;
                        }
                        Result.Companion companion2 = Result.Companion;
                        MediaRecorderWrapper mediaRecorderWrapper = this.mediaRecorderWrapper;
                        camera2Manager$startVideo$1.L$0 = this;
                        camera2Manager$startVideo$1.label = 1;
                        mediaRecorderWrapper.getClass();
                        Object withContext = JobKt.withContext(Dispatchers.Default, new CameraHelper$unbind$2(mediaRecorderWrapper, continuation, 25), camera2Manager$startVideo$1);
                        if (withContext != coroutineSingletons) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = camera2Manager$startVideo$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    this.recordingStarted = true;
                    Result.Companion companion3 = Result.Companion;
                    return Boolean.TRUE;
                }
            }
            if (i != 0) {
            }
            this.recordingStarted = true;
            Result.Companion companion32 = Result.Companion;
            return Boolean.TRUE;
        } catch (Throwable th) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(th);
        }
        camera2Manager$startVideo$1 = new Camera2Manager$startVideo$1(this, continuationImpl);
        Object obj2 = camera2Manager$startVideo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2Manager$startVideo$1.label;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: stopVideo-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m4092stopVideoIoAF18A(ContinuationImpl continuationImpl) {
        Camera2Manager$stopVideo$1 camera2Manager$stopVideo$1;
        int i;
        File file;
        if (continuationImpl instanceof Camera2Manager$stopVideo$1) {
            camera2Manager$stopVideo$1 = (Camera2Manager$stopVideo$1) continuationImpl;
            int i2 = camera2Manager$stopVideo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2Manager$stopVideo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2Manager$stopVideo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2Manager$stopVideo$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.recordingStarted) {
                        Result.Companion companion = Result.Companion;
                        return new Result.Failure(new NoActiveRecordingError());
                    }
                    this.recordingStarted = false;
                    MediaRecorderWrapper mediaRecorderWrapper = this.mediaRecorderWrapper;
                    camera2Manager$stopVideo$1.label = 1;
                    mediaRecorderWrapper.getClass();
                    obj = JobKt.withContext(Dispatchers.Default, new Logger$log$1(mediaRecorderWrapper, continuation, 14), camera2Manager$stopVideo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                file = (File) obj;
                if (file != null) {
                    Result.Companion companion2 = Result.Companion;
                    return new Result.Failure(new RuntimeException("Recording failed."));
                }
                Result.Companion companion3 = Result.Companion;
                return file;
            }
        }
        camera2Manager$stopVideo$1 = new Camera2Manager$stopVideo$1(this, continuationImpl);
        Object obj2 = camera2Manager$stopVideo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2Manager$stopVideo$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        file = (File) obj2;
        if (file != null) {
        }
    }
}
