package com.withpersona.sdk2.camera;

import android.content.Context;
import android.graphics.PointF;
import android.util.Rational;
import android.view.View;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DisplayOrientedMeteringPointFactory;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.AdapterCameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.view.PreviewView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.infopages.AboutFragment;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class CameraXController implements CameraController {
    public final StateFlowImpl _previewState;
    public final CameraPreview cameraPreview;
    public final RealCameraStatsManager cameraStatsManager;
    public final CameraXBinder cameraXBinder;
    public final Context context;
    public final boolean isAudioRequired;
    public boolean isBound;
    public final PreviewView previewView;
    public volatile boolean recordingStarted;
    public final SdkFilesManager sdkFilesManager;

    public CameraXController(Context context, RealCameraStatsManager realCameraStatsManager, SdkFilesManager sdkFilesManager, CameraPreview cameraPreview, PreviewView previewView, CameraXBinder cameraXBinder, boolean z) {
        context.getClass();
        realCameraStatsManager.getClass();
        sdkFilesManager.getClass();
        cameraPreview.getClass();
        previewView.getClass();
        this.context = context;
        this.cameraStatsManager = realCameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraPreview = cameraPreview;
        this.previewView = previewView;
        this.cameraXBinder = cameraXBinder;
        this.isAudioRequired = z;
        this._previewState = FlowKt.MutableStateFlow(CameraState.Error.INSTANCE$1);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public final void destroy() {
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public final void enableTorch(boolean z) {
        MarkwonConfiguration markwonConfiguration = this.cameraPreview.currentCameraSession;
        if (markwonConfiguration != null) {
            ((AdapterCameraControl) ((LifecycleCamera) markwonConfiguration.theme).getCameraControl()).enableTorch(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void focus() {
        CameraPreview cameraPreview = this.cameraPreview;
        cameraPreview.getClass();
        PreviewView previewView = this.previewView;
        previewView.getClass();
        MarkwonConfiguration markwonConfiguration = cameraPreview.currentCameraSession;
        if (markwonConfiguration != null) {
            LifecycleCamera lifecycleCamera = (LifecycleCamera) markwonConfiguration.theme;
            CameraControlInternal cameraControl = lifecycleCamera.getCameraControl();
            DisplayOrientedMeteringPointFactory displayOrientedMeteringPointFactory = new DisplayOrientedMeteringPointFactory(previewView.getDisplay(), lifecycleCamera.getCameraInfo(), previewView.getWidth(), previewView.getHeight());
            float width = previewView.getWidth() / 2.0f;
            float height = previewView.getHeight() / 2.0f;
            CameraInfo cameraInfo = displayOrientedMeteringPointFactory.mCameraInfo;
            int i = 0;
            boolean z = cameraInfo.getLensFacing() == 0;
            try {
                int sensorRotationDegrees = cameraInfo.getSensorRotationDegrees(displayOrientedMeteringPointFactory.mDisplay.getRotation());
                i = z ? (360 - sensorRotationDegrees) % 360 : sensorRotationDegrees;
            } catch (Exception unused) {
            }
            float f = displayOrientedMeteringPointFactory.mWidth;
            float f2 = displayOrientedMeteringPointFactory.mHeight;
            if (i != 90 && i != 270) {
                width = height;
                height = width;
                f2 = f;
                f = f2;
            }
            if (i != 90) {
                if (i != 180) {
                    if (i == 270) {
                        height = f2 - height;
                    }
                    if (z) {
                        height = f2 - height;
                    }
                    PointF pointF = new PointF(height / f2, width / f);
                    float f3 = pointF.x;
                    float f4 = pointF.y;
                    Rational rational = (Rational) displayOrientedMeteringPointFactory.data;
                    MeteringPoint meteringPoint = new MeteringPoint();
                    meteringPoint.mNormalizedX = f3;
                    meteringPoint.mNormalizedY = f4;
                    meteringPoint.mSize = 0.15f;
                    meteringPoint.mSurfaceAspectRatio = rational;
                    ((AdapterCameraControl) cameraControl).startFocusAndMetering(new FocusMeteringAction(new FocusMeteringAction(meteringPoint)));
                }
                height = f2 - height;
            }
            width = f - width;
            if (z) {
            }
            PointF pointF2 = new PointF(height / f2, width / f);
            float f32 = pointF2.x;
            float f42 = pointF2.y;
            Rational rational2 = (Rational) displayOrientedMeteringPointFactory.data;
            MeteringPoint meteringPoint2 = new MeteringPoint();
            meteringPoint2.mNormalizedX = f32;
            meteringPoint2.mNormalizedY = f42;
            meteringPoint2.mSize = 0.15f;
            meteringPoint2.mSurfaceAspectRatio = rational2;
            ((AdapterCameraControl) cameraControl).startFocusAndMetering(new FocusMeteringAction(new FocusMeteringAction(meteringPoint2)));
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public final CameraProperties getCameraProperties() {
        MarkwonConfiguration markwonConfiguration = this.cameraPreview.currentCameraSession;
        return markwonConfiguration != null ? (CameraProperties) markwonConfiguration.imageDestinationProcessor : new CameraProperties(null, null, null, 0, 31, 0);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public final StateFlowImpl getCameraState() {
        return this._previewState;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public final View getPreviewView() {
        return this.previewView;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public final boolean isRecordingLocally() {
        return this.recordingStarted;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public final void prepare() {
        if (this.isBound) {
            return;
        }
        CameraState.Error error = CameraState.Error.INSTANCE$2;
        StateFlowImpl stateFlowImpl = this._previewState;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, error);
        this.isBound = true;
        this.cameraXBinder.bind();
        PreviewView previewView = this.previewView;
        previewView.mPreviewStreamStateLiveData.observeForever(new AboutFragment.AnonymousClass1(this, 2));
        if (previewView.isAttachedToWindow()) {
            this.cameraStatsManager.startRecordingState();
        }
        previewView.addOnAttachStateChangeListener(new StandardMenuPopup.AnonymousClass2(this, 8));
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public final void setAnalyzerEnabled(boolean z) {
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: startVideo-IoAF18A */
    public final Object mo4083startVideoIoAF18A(Continuation continuation) {
        if (this.recordingStarted) {
            Result.Companion companion = Result.Companion;
            return Boolean.FALSE;
        }
        try {
            boolean startVideo = this.cameraPreview.startVideo(this.context, this.isAudioRequired);
            if (startVideo) {
                this.recordingStarted = true;
            }
            Result.Companion companion2 = Result.Companion;
            return Boolean.valueOf(startVideo);
        } catch (MissingAudioPermissionError e) {
            Result.Companion companion3 = Result.Companion;
            return new Result.Failure(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: stopVideo-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4084stopVideoIoAF18A(Continuation continuation) {
        CameraXController$stopVideo$1 cameraXController$stopVideo$1;
        int i;
        if (continuation instanceof CameraXController$stopVideo$1) {
            cameraXController$stopVideo$1 = (CameraXController$stopVideo$1) continuation;
            int i2 = cameraXController$stopVideo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cameraXController$stopVideo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cameraXController$stopVideo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraXController$stopVideo$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (!this.recordingStarted) {
                    Result.Companion companion = Result.Companion;
                    return new Result.Failure(new NoActiveRecordingError());
                }
                this.recordingStarted = false;
                CameraPreview cameraPreview = this.cameraPreview;
                cameraXController$stopVideo$1.label = 1;
                Object m4086stopVideoIoAF18A = cameraPreview.m4086stopVideoIoAF18A(cameraXController$stopVideo$1);
                return m4086stopVideoIoAF18A == coroutineSingletons ? coroutineSingletons : m4086stopVideoIoAF18A;
            }
        }
        cameraXController$stopVideo$1 = new CameraXController$stopVideo$1(this, (ContinuationImpl) continuation);
        Object obj2 = cameraXController$stopVideo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraXController$stopVideo$1.label;
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
    public final Object mo4085takePictureIoAF18A(Continuation continuation) {
        CameraXController$takePicture$1 cameraXController$takePicture$1;
        int i;
        if (continuation instanceof CameraXController$takePicture$1) {
            cameraXController$takePicture$1 = (CameraXController$takePicture$1) continuation;
            int i2 = cameraXController$takePicture$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cameraXController$takePicture$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cameraXController$takePicture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraXController$takePicture$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cameraXController$takePicture$1.label = 1;
                    Object m4087takePicturegIAlus = this.cameraPreview.m4087takePicturegIAlus(this.sdkFilesManager, cameraXController$takePicture$1);
                    return m4087takePicturegIAlus == coroutineSingletons ? coroutineSingletons : m4087takePicturegIAlus;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return ((Result) obj).value;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cameraXController$takePicture$1 = new CameraXController$takePicture$1(this, (ContinuationImpl) continuation);
        Object obj2 = cameraXController$takePicture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraXController$takePicture$1.label;
        if (i != 0) {
        }
    }
}
