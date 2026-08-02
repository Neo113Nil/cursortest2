package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.graphics.Point;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.media3.exoplayer.audio.AudioCapabilities;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.DatadogSite;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.trace.TracingHeaderType;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningErrorManager;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningFlowContext;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.util.Strings;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import okhttp3.HttpUrl;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class Camera2Controller implements CameraController {
    public Object _previewState;
    public final Object camera2ManagerFactory;
    public final Object cameraChoiceHelper;
    public Object coroutineScope;
    public Object currentManager;
    public Object currentStateCollectJob;
    public boolean recordingOngoing;

    public Camera2Controller(Camera2ManagerFactory_Factory_Impl camera2ManagerFactory_Factory_Impl, CameraChoiceHelper cameraChoiceHelper, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, Camera2ImageAnalyzer camera2ImageAnalyzer, VideoCaptureMethod videoCaptureMethod, boolean z) {
        camera2ManagerFactory_Factory_Impl.getClass();
        cameraChoiceHelper.getClass();
        camera2ImageAnalyzer.getClass();
        videoCaptureMethod.getClass();
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
        this._previewState = FlowKt.MutableStateFlow(CameraState.Error.INSTANCE$1);
        Camera2ManagerFactory_Factory camera2ManagerFactory_Factory = camera2ManagerFactory_Factory_Impl.delegateFactory;
        Camera2ManagerFactory camera2ManagerFactory = new Camera2ManagerFactory((Context) camera2ManagerFactory_Factory.contextProvider.get(), (RealCameraStatsManager) camera2ManagerFactory_Factory.cameraStatsManagerProvider.get(), (SdkFilesManager) camera2ManagerFactory_Factory.sdkFilesManagerProvider.get(), (CameraChoiceHelper) camera2ManagerFactory_Factory.cameraChoiceHelperProvider.get(), cameraChoices, camera2PreviewView, camera2ImageAnalyzer, videoCaptureMethod, z);
        this.camera2ManagerFactory = camera2ManagerFactory;
        this.currentManager = camera2ManagerFactory.newInstance();
    }

    public static final void access$tryNextCameraChoice(Camera2Controller camera2Controller) {
        Camera2ManagerFactory camera2ManagerFactory = (Camera2ManagerFactory) camera2Controller.camera2ManagerFactory;
        int i = camera2ManagerFactory.choiceIndex + 1;
        CameraChoices cameraChoices = camera2ManagerFactory.cameraChoices;
        Continuation continuation = null;
        if (i >= CollectionsKt.plus((Iterable) cameraChoices.backupChoices, (Collection) CollectionsKt__CollectionsJVMKt.listOf(cameraChoices.primaryChoice)).size()) {
            StateFlowImpl stateFlowImpl = (StateFlowImpl) camera2Controller._previewState;
            CameraState.Error error = CameraState.Error.INSTANCE;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, error);
            return;
        }
        camera2ManagerFactory.choiceIndex++;
        StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) camera2Controller.currentStateCollectJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        camera2Controller.currentManager = camera2ManagerFactory.newInstance();
        JobKt.launch$default((ContextScope) camera2Controller.coroutineScope, MainDispatcherLoader.dispatcher, null, new CameraHelper$unbind$2(camera2Controller, continuation, 23), 2);
    }

    public Configuration build() {
        return new Configuration((Configuration.Core) this._previewState, (String) this.cameraChoiceHelper, (String) this.camera2ManagerFactory, (String) this.coroutineScope, "com.squareup.cash.android", this.recordingOngoing, (EmptyMap) this.currentManager, null);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void destroy() {
        Camera2Manager camera2Manager = (Camera2Manager) this.currentManager;
        JobKt.launch$default(camera2Manager.coroutineScope, null, null, new Camera2Manager.AnonymousClass1(camera2Manager, null, 2), 3);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void enableTorch(boolean z) {
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = ((Camera2Manager) this.currentManager).session;
        if (cameraCaptureSessionWrapper != null) {
            cameraCaptureSessionWrapper.enableTorch = z;
            cameraCaptureSessionWrapper.updateRepeatingRequest();
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void focus() {
        Camera2Manager camera2Manager = (Camera2Manager) this.currentManager;
        CameraChoice cameraChoice = camera2Manager.cameraChoice;
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = camera2Manager.session;
        if (cameraCaptureSessionWrapper != null) {
            Size size = cameraChoice.size;
            cameraCaptureSessionWrapper.meteringRect = new MeteringRectangle(new Point(size.getWidth() / 2, size.getHeight() / 2), new Size((int) (size.getWidth() * 0.15d), (int) (size.getHeight() * 0.15d)), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
            StandaloneCoroutine standaloneCoroutine = cameraCaptureSessionWrapper.resetFocusJob;
            Continuation continuation = null;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            cameraCaptureSessionWrapper.resetFocusJob = JobKt.launch$default(cameraCaptureSessionWrapper.coroutineScope, null, null, new HazeSourceNode$launchPreDraw$1(cameraCaptureSessionWrapper, continuation, 11), 3);
            cameraCaptureSessionWrapper.updateRepeatingRequest();
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public CameraProperties getCameraProperties() {
        return ((Camera2Manager) this.currentManager).cameraProperties;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public StateFlowImpl getCameraState() {
        return (StateFlowImpl) this._previewState;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public View getPreviewView() {
        return ((Camera2Manager) this.currentManager).previewView;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public boolean isRecordingLocally() {
        return this.recordingOngoing;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void prepare() {
        if (Intrinsics.areEqual(((StateFlowImpl) this._previewState).getValue(), CameraState.Error.INSTANCE$1) || (((StateFlowImpl) this._previewState).getValue() instanceof CameraState.Closed)) {
            StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) this.currentStateCollectJob;
            Continuation continuation = null;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            StateFlowImpl stateFlowImpl = (StateFlowImpl) this._previewState;
            CameraState.Error error = CameraState.Error.INSTANCE$2;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, error);
            int i = 3;
            this.currentStateCollectJob = JobKt.launch$default((ContextScope) this.coroutineScope, null, null, new HazeSourceNode$launchPreDraw$1(this, continuation, 10), 3);
            Camera2Manager camera2Manager = (Camera2Manager) this.currentManager;
            int i2 = 0;
            boolean z = camera2Manager.isAudioRequired && Strings.checkSelfPermission(camera2Manager.context, "android.permission.RECORD_AUDIO") != 0;
            if (Strings.checkSelfPermission(camera2Manager.context, "android.permission.CAMERA") != 0 || z) {
                StateFlowImpl stateFlowImpl2 = camera2Manager._state;
                Camera2Manager.State.Error error2 = new Camera2Manager.State.Error(new Camera2Manager.Error.MissingPermissionsCameraError());
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, error2);
                return;
            }
            if (camera2Manager.isPreviewStarted) {
                return;
            }
            camera2Manager.isPreviewStarted = true;
            camera2Manager.isPreviewSurfaceAvailable = false;
            camera2Manager.surfaceHolderCallback = new Camera2Manager$start$1(camera2Manager, i2);
            MediaRecorderWrapper mediaRecorderWrapper = camera2Manager.mediaRecorderWrapper;
            new CameraHelper$$ExternalSyntheticLambda0(camera2Manager, i);
            mediaRecorderWrapper.getClass();
            Camera2PreviewView camera2PreviewView = camera2Manager.previewView;
            camera2PreviewView.removeAllViews();
            SurfaceView surfaceView = new SurfaceView(camera2PreviewView.getContext());
            camera2PreviewView.surfaceView = surfaceView;
            camera2PreviewView.addView(surfaceView);
            camera2PreviewView.requestLayout();
            SurfaceHolder holder = camera2Manager.previewView.surfaceView.getHolder();
            holder.getClass();
            holder.addCallback(camera2Manager.surfaceHolderCallback);
            camera2Manager.cameraStatsManager.startRecordingState();
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void setAnalyzerEnabled(boolean z) {
        ((Camera2Manager) this.currentManager).isAnalyzerEnabled = z;
    }

    public void setCrashReportsEnabled() {
        this.recordingOngoing = false;
    }

    public void setFirstPartyHosts(List list) {
        ((HurlStack) this.currentStateCollectJob).getClass();
        ArrayList sanitizeHosts = HurlStack.sanitizeHosts("Network requests", list);
        Configuration.Core core = (Configuration.Core) this._previewState;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(sanitizeHosts, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        Map linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = sanitizeHosts.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(next, ArraysKt___ArraysKt.toSet(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT}));
        }
        core.getClass();
        core.getClass();
        if ((8187 & 4) != 0) {
            linkedHashMap = core.firstPartyHostsWithHeaderTypes;
        }
        Map map = linkedHashMap;
        int i = (8187 & 8) != 0 ? core.batchSize : 1;
        int i2 = (8187 & 16) != 0 ? core.uploadFrequency : 1;
        core.getClass();
        HttpUrl.Companion companion = core.proxyAuth;
        core.getClass();
        DatadogSite datadogSite = core.site;
        int i3 = core.batchProcessingLevel;
        core.getClass();
        BackPressureStrategy backPressureStrategy = core.backpressureStrategy;
        core.getClass();
        core.getClass();
        map.getClass();
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        datadogSite.getClass();
        if (i3 == 0) {
            throw null;
        }
        this._previewState = new Configuration.Core(map, i, i2, companion, datadogSite, i3, backPressureStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: startVideo-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo4083startVideoIoAF18A(Continuation continuation) {
        Camera2Controller$startVideo$1 camera2Controller$startVideo$1;
        int i;
        Object m4091startVideoIoAF18A;
        if (continuation instanceof Camera2Controller$startVideo$1) {
            camera2Controller$startVideo$1 = (Camera2Controller$startVideo$1) continuation;
            int i2 = camera2Controller$startVideo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2Controller$startVideo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2Controller$startVideo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2Controller$startVideo$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(((StateFlowImpl) this._previewState).getValue(), CameraState.Error.INSTANCE$3)) {
                        Result.Companion companion = Result.Companion;
                        return Boolean.FALSE;
                    }
                    Camera2Manager camera2Manager = (Camera2Manager) this.currentManager;
                    camera2Controller$startVideo$1.label = 1;
                    m4091startVideoIoAF18A = camera2Manager.m4091startVideoIoAF18A(camera2Controller$startVideo$1);
                    if (m4091startVideoIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4091startVideoIoAF18A = ((Result) obj).value;
                }
                Result.Companion companion2 = Result.Companion;
                if (Intrinsics.areEqual(m4091startVideoIoAF18A instanceof Result.Failure ? null : m4091startVideoIoAF18A, Boolean.TRUE)) {
                    this.recordingOngoing = true;
                }
                return m4091startVideoIoAF18A;
            }
        }
        camera2Controller$startVideo$1 = new Camera2Controller$startVideo$1(this, (ContinuationImpl) continuation);
        Object obj2 = camera2Controller$startVideo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2Controller$startVideo$1.label;
        if (i != 0) {
        }
        Result.Companion companion22 = Result.Companion;
        if (Intrinsics.areEqual(m4091startVideoIoAF18A instanceof Result.Failure ? null : m4091startVideoIoAF18A, Boolean.TRUE)) {
        }
        return m4091startVideoIoAF18A;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: stopVideo-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo4084stopVideoIoAF18A(Continuation continuation) {
        Camera2Controller$stopVideo$1 camera2Controller$stopVideo$1;
        int i;
        if (continuation instanceof Camera2Controller$stopVideo$1) {
            camera2Controller$stopVideo$1 = (Camera2Controller$stopVideo$1) continuation;
            int i2 = camera2Controller$stopVideo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2Controller$stopVideo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2Controller$stopVideo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2Controller$stopVideo$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.recordingOngoing = false;
                Camera2Manager camera2Manager = (Camera2Manager) this.currentManager;
                camera2Controller$stopVideo$1.label = 1;
                Serializable m4092stopVideoIoAF18A = camera2Manager.m4092stopVideoIoAF18A(camera2Controller$stopVideo$1);
                return m4092stopVideoIoAF18A == coroutineSingletons ? coroutineSingletons : m4092stopVideoIoAF18A;
            }
        }
        camera2Controller$stopVideo$1 = new Camera2Controller$stopVideo$1(this, (ContinuationImpl) continuation);
        Object obj2 = camera2Controller$stopVideo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2Controller$stopVideo$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: takePicture-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo4085takePictureIoAF18A(Continuation continuation) {
        Camera2Controller$takePicture$1 camera2Controller$takePicture$1;
        int i;
        if (continuation instanceof Camera2Controller$takePicture$1) {
            camera2Controller$takePicture$1 = (Camera2Controller$takePicture$1) continuation;
            int i2 = camera2Controller$takePicture$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2Controller$takePicture$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2Controller$takePicture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2Controller$takePicture$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Camera2Manager camera2Manager = (Camera2Manager) this.currentManager;
                camera2Controller$takePicture$1.label = 1;
                Object m4090requestImageCaptureIoAF18A = camera2Manager.m4090requestImageCaptureIoAF18A(camera2Controller$takePicture$1);
                return m4090requestImageCaptureIoAF18A == coroutineSingletons ? coroutineSingletons : m4090requestImageCaptureIoAF18A;
            }
        }
        camera2Controller$takePicture$1 = new Camera2Controller$takePicture$1(this, (ContinuationImpl) continuation);
        Object obj2 = camera2Controller$takePicture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2Controller$takePicture$1.label;
        if (i == 0) {
        }
    }

    public Camera2Controller(FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext, FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager, UserJourneyTracker userJourneyTracker, UserJourney$Name userJourney$Name, FidesmoFlowType fidesmoFlowType, EnumListAdapter$encode$1 enumListAdapter$encode$1, EnumListAdapter$encode$1 enumListAdapter$encode$12) {
        userJourney$Name.getClass();
        fidesmoFlowType.getClass();
        this.cameraChoiceHelper = fidesmoProvisioningFlowContext;
        this.camera2ManagerFactory = fidesmoProvisioningErrorManager;
        this.coroutineScope = fidesmoFlowType;
        this.currentManager = enumListAdapter$encode$1;
        this._previewState = enumListAdapter$encode$12;
        this.currentStateCollectJob = new ArrayList();
    }

    public Camera2Controller(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.cameraChoiceHelper = str;
        this.camera2ManagerFactory = str2;
        this.coroutineScope = str3;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.currentManager = emptyMap;
        this._previewState = Configuration.DEFAULT_CORE_CONFIG;
        this.recordingOngoing = true;
        this.currentStateCollectJob = new HurlStack(23);
    }

    public Camera2Controller(Context context) {
        this.cameraChoiceHelper = context;
        this.camera2ManagerFactory = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
    }
}
