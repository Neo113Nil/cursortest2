package com.squareup.scannerview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.FaceDetector;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.collection.IndexBasedArrayIterator;
import androidx.collection.SparseArrayCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.math.DoubleUtils;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.InvertedLuminanceSource;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.squareup.cash.card.onboarding.BitmapsKt;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.clientsync.EntitySyncerKt;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.gl.core.WindowSurface;
import com.squareup.cash.graphics.views.TextureViewRenderer;
import com.squareup.cash.moneybot.views.home.ParticleGridRenderer;
import com.squareup.scannerview.ImageResolution;
import com.squareup.scannerview.ScannerView;
import com.squareup.scannerview.scanner.RealObjectScanner;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.LinkResolverDef;
import java.lang.ref.WeakReference;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.pnm.PnmImageParser;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class CameraOperator {
    public static final List supportedHardwareLevels = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 3});
    public final Rect adjustedTargetBounds;
    public AspectRatio aspectRatio;
    public CameraDevice cameraDevice;
    public CameraInfo cameraInfo;
    public final CameraOperator$cameraOpenCallback$1 cameraOpenCallback;
    public CameraCaptureSession captureSession;
    public final Context context;
    public FlashState defaultFlashState;
    public Rotation displayRotation;
    public final ScannerView.AnonymousClass1 errorCallback;
    public FlashState flash;
    public ScannerView$$ExternalSyntheticLambda1 flashListener;
    public ImageResolution imageProcessingResolution;
    public final ScannerView.AnonymousClass1 loadedCallback;
    public final ScannerView.AnonymousClass1 loadingCallback;
    public ManualCaptureState manualCaptureState;
    public final ScannerView.AnonymousClass3 manualErrorCallback;
    public final ScannerView.AnonymousClass3 objectFoundCallback;
    public Facing preferredFacing;
    public final CameraOperator$$ExternalSyntheticLambda0 previewListener;
    public ImageReader previewReader;
    public CaptureRequest.Builder previewRequestBuilder;
    public Surface previewSurface;
    public final PreviewView previewView;
    public final AnonymousClass2 processingHandler;
    public final CameraOperator$sessionCallback$1 sessionCallback;
    public final AtomicBoolean startingCamera;
    public Step step;
    public final ScannerView.AnonymousClass3 stepCallback;
    public final RectF targetBounds;
    public int viewHeight;
    public int viewWidth;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class ManualCaptureState {
        public static final /* synthetic */ ManualCaptureState[] $VALUES;
        public static final ManualCaptureState FORCE;
        public static final ManualCaptureState NO;
        public static final ManualCaptureState YES;

        static {
            ManualCaptureState manualCaptureState = new ManualCaptureState(PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO, 0);
            NO = manualCaptureState;
            ManualCaptureState manualCaptureState2 = new ManualCaptureState(PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES, 1);
            YES = manualCaptureState2;
            ManualCaptureState manualCaptureState3 = new ManualCaptureState("FORCE", 2);
            FORCE = manualCaptureState3;
            $VALUES = new ManualCaptureState[]{manualCaptureState, manualCaptureState2, manualCaptureState3};
        }

        public static ManualCaptureState valueOf(String str) {
            return (ManualCaptureState) Enum.valueOf(ManualCaptureState.class, str);
        }

        public static ManualCaptureState[] values() {
            return (ManualCaptureState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.squareup.scannerview.CameraOperator$sessionCallback$1] */
    public CameraOperator(Context context, PreviewView previewView, ScannerView.AnonymousClass1 anonymousClass1, ScannerView.AnonymousClass1 anonymousClass12, ScannerView.AnonymousClass3 anonymousClass3, ScannerView.AnonymousClass1 anonymousClass13, ScannerView.AnonymousClass3 anonymousClass32, ScannerView.AnonymousClass3 anonymousClass33) {
        RealObjectScanner realObjectScanner = RealObjectScanner.INSTANCE;
        this.context = context;
        this.previewView = previewView;
        this.loadingCallback = anonymousClass1;
        this.loadedCallback = anonymousClass12;
        this.stepCallback = anonymousClass3;
        this.errorCallback = anonymousClass13;
        this.manualErrorCallback = anonymousClass32;
        this.objectFoundCallback = anonymousClass33;
        HandlerThread handlerThread = new HandlerThread("ScannerView", 10);
        this.displayRotation = Rotation.ROTATION_0;
        this.defaultFlashState = FlashState.OFF;
        this.flash = FlashState.UNAVAILABLE;
        this.imageProcessingResolution = ImageResolution.MatchScreen.INSTANCE;
        SparseArrayCompat sparseArrayCompat = AspectRatio.sCache;
        this.aspectRatio = EntitySyncerKt.of(4, 3);
        this.preferredFacing = Facing.BACK;
        this.targetBounds = new RectF();
        this.adjustedTargetBounds = new Rect();
        int i = 0;
        this.startingCamera = new AtomicBoolean(false);
        this.cameraInfo = new CameraInfo();
        this.manualCaptureState = ManualCaptureState.NO;
        previewView.setCallback(new Pool(this));
        handlerThread.start();
        this.processingHandler = new AnonymousClass2(this, handlerThread.getLooper(), i);
        this.cameraOpenCallback = new CameraOperator$cameraOpenCallback$1(this);
        this.sessionCallback = new CameraCaptureSession.StateCallback() { // from class: com.squareup.scannerview.CameraOperator$sessionCallback$1
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onClosed(CameraCaptureSession cameraCaptureSession) {
                cameraCaptureSession.getClass();
                CameraOperator cameraOperator = CameraOperator.this;
                if (Intrinsics.areEqual(cameraOperator.captureSession, cameraCaptureSession)) {
                    cameraOperator.captureSession = null;
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                cameraCaptureSession.getClass();
                Timber.Forest.e(new IllegalStateException("Failed to configure capture session."));
                CameraOperator cameraOperator = CameraOperator.this;
                cameraOperator.stop();
                cameraOperator.errorCallback.invoke();
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                cameraCaptureSession.getClass();
                CameraOperator cameraOperator = CameraOperator.this;
                if (cameraOperator.cameraDevice == null) {
                    return;
                }
                cameraOperator.configureSession(cameraCaptureSession);
                cameraOperator.captureSession = cameraCaptureSession;
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onReady(CameraCaptureSession cameraCaptureSession) {
                cameraCaptureSession.getClass();
                super.onReady(cameraCaptureSession);
                CameraOperator.this.loadedCallback.invoke();
            }
        };
        this.previewListener = new CameraOperator$$ExternalSyntheticLambda0(this, i);
    }

    public static final void access$startCaptureSession(CameraOperator cameraOperator) {
        PreviewView previewView = cameraOperator.previewView;
        boolean z = true;
        if (cameraOperator.cameraDevice == null || previewView.getSurfaceTexture() == null) {
            return;
        }
        Size chooseOptimalSize = cameraOperator.chooseOptimalSize(cameraOperator.cameraInfo.previewSizes, ImageResolution.MatchScreen.INSTANCE);
        Size chooseOptimalSize2 = cameraOperator.chooseOptimalSize(cameraOperator.cameraInfo.imageProcessingSizes, cameraOperator.imageProcessingResolution);
        int i = chooseOptimalSize2.width;
        Timber.Forest.d("Using " + chooseOptimalSize2 + " for image processing resolution", new Object[0]);
        int i2 = chooseOptimalSize2.height;
        cameraOperator.calculateAdjustedTargetBounds(i, i2);
        previewView.setBufferSize(chooseOptimalSize.width, chooseOptimalSize.height);
        Surface surface = new Surface(previewView.getSurfaceTexture());
        cameraOperator.previewSurface = surface;
        ImageReader newInstance = ImageReader.newInstance(i, i2, 35, 2);
        newInstance.getClass();
        newInstance.setOnImageAvailableListener(cameraOperator.previewListener, null);
        cameraOperator.previewReader = newInstance;
        Surface surface2 = newInstance.getSurface();
        try {
            CameraDevice cameraDevice = cameraOperator.cameraDevice;
            cameraDevice.getClass();
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(1);
            createCaptureRequest.getClass();
            createCaptureRequest.addTarget(surface);
            createCaptureRequest.addTarget(surface2);
            createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
            createCaptureRequest.set(CaptureRequest.CONTROL_AWB_MODE, 1);
            if (cameraOperator.flash != FlashState.ON) {
                z = false;
            }
            createCaptureRequest.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
            updatePreviewRegions(createCaptureRequest, cameraOperator.cameraInfo);
            cameraOperator.previewRequestBuilder = createCaptureRequest;
            CameraDevice cameraDevice2 = cameraOperator.cameraDevice;
            cameraDevice2.getClass();
            cameraDevice2.createCaptureSession(CollectionsKt__CollectionsKt.listOf((Object[]) new Surface[]{surface, surface2}), cameraOperator.sessionCallback, null);
        } catch (CameraAccessException e) {
            Timber.Forest.e(new RuntimeException("Failed to start camera session").initCause(e));
            cameraOperator.stop();
            cameraOperator.errorCallback.invoke();
        }
    }

    public static void updatePreviewRegions(CaptureRequest.Builder builder, CameraInfo cameraInfo) {
        Rect rect = cameraInfo.arraySize;
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        Rect rect2 = cameraInfo.arraySize;
        MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(i, i2, width, rect2.height() - rect2.top, 0)};
        if (cameraInfo.maxRegionsAf > 0) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (cameraInfo.maxRegionsAe > 0) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
        }
        if (cameraInfo.maxRegionsAwb > 0) {
            builder.set(CaptureRequest.CONTROL_AWB_REGIONS, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void calculateAdjustedTargetBounds(int i, int i2) {
        int i3;
        int i4;
        float f;
        float min;
        Rect rect;
        Integer num;
        RectF rectF;
        int ordinal;
        Rotation rotation = this.displayRotation;
        Rotation rotation2 = this.cameraInfo.rotation;
        rotation.getClass();
        rotation2.getClass();
        LinkResolverDef linkResolverDef = Rotation.Companion;
        int i5 = rotation.r + rotation2.r;
        linkResolverDef.getClass();
        Rotation fromInt = LinkResolverDef.fromInt(i5);
        int ordinal2 = fromInt.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                }
            }
            i4 = i;
            i3 = i2;
            f = i3;
            min = Math.min(f / this.viewWidth, i4 / this.viewHeight);
            rect = new Rect();
            num = this.cameraInfo.facing;
            Facing facing = Facing.BACK;
            rectF = this.targetBounds;
            if (num != null && num.intValue() == 0) {
                float f2 = this.viewWidth - rectF.right;
                rect.set((int) (f - ((rectF.width() + f2) * min)), (int) (rectF.top * min), (int) (f - (f2 * min)), (int) (rectF.bottom * min));
            } else {
                rect.set((int) (rectF.left * min), (int) (rectF.top * min), (int) (rectF.right * min), (int) (rectF.bottom * min));
            }
            if (rect.width() % 2 == 1) {
                rect.right--;
            }
            if (rect.height() % 2 == 1) {
                rect.bottom--;
            }
            int i6 = -fromInt.r;
            linkResolverDef.getClass();
            Rotation fromInt2 = LinkResolverDef.fromInt(i6);
            Rect rect2 = this.adjustedTargetBounds;
            rect2.getClass();
            ordinal = fromInt2.ordinal();
            if (ordinal == 0) {
                rect2.set(rect);
                return;
            }
            if (ordinal == 1) {
                rect2.set(i - rect.bottom, rect.left, i - rect.top, rect.right);
                return;
            }
            if (ordinal == 2) {
                rect2.set(i - rect.right, i2 - rect.bottom, i - rect.left, i2 - rect.top);
                return;
            } else if (ordinal == 3) {
                rect2.set(rect.top, i2 - rect.right, rect.bottom, i2 - rect.left);
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        i3 = i;
        i4 = i2;
        f = i3;
        min = Math.min(f / this.viewWidth, i4 / this.viewHeight);
        rect = new Rect();
        num = this.cameraInfo.facing;
        Facing facing2 = Facing.BACK;
        rectF = this.targetBounds;
        if (num != null) {
            float f22 = this.viewWidth - rectF.right;
            rect.set((int) (f - ((rectF.width() + f22) * min)), (int) (rectF.top * min), (int) (f - (f22 * min)), (int) (rectF.bottom * min));
            if (rect.width() % 2 == 1) {
            }
            if (rect.height() % 2 == 1) {
            }
            int i62 = -fromInt.r;
            linkResolverDef.getClass();
            Rotation fromInt22 = LinkResolverDef.fromInt(i62);
            Rect rect22 = this.adjustedTargetBounds;
            rect22.getClass();
            ordinal = fromInt22.ordinal();
            if (ordinal == 0) {
            }
        }
        rect.set((int) (rectF.left * min), (int) (rectF.top * min), (int) (rectF.right * min), (int) (rectF.bottom * min));
        if (rect.width() % 2 == 1) {
        }
        if (rect.height() % 2 == 1) {
        }
        int i622 = -fromInt.r;
        linkResolverDef.getClass();
        Rotation fromInt222 = LinkResolverDef.fromInt(i622);
        Rect rect222 = this.adjustedTargetBounds;
        rect222.getClass();
        ordinal = fromInt222.ordinal();
        if (ordinal == 0) {
        }
    }

    public final Size chooseOptimalSize(SizeMap sizeMap, ImageResolution imageResolution) {
        PreviewView previewView = this.previewView;
        int i = previewView.surfaceWidth;
        int i2 = previewView.surfaceHeight;
        if (i < i2) {
            i = i2;
            i2 = i;
        }
        AspectRatio aspectRatio = this.aspectRatio;
        sizeMap.getClass();
        aspectRatio.getClass();
        Object obj = ((ArrayMap) sizeMap.mRatios).get(aspectRatio);
        obj.getClass();
        SortedSet<Size> sortedSet = (SortedSet) obj;
        new ArrayList();
        for (Size size : sortedSet) {
            if (size.width >= i && size.height >= i2) {
                if (Intrinsics.areEqual(imageResolution, ImageResolution.MatchScreen.INSTANCE)) {
                    return size;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        Object last = sortedSet.last();
        last.getClass();
        return (Size) last;
    }

    public final void configureSession(CameraCaptureSession cameraCaptureSession) {
        ScannerView.AnonymousClass1 anonymousClass1 = this.errorCallback;
        try {
            CaptureRequest.Builder builder = this.previewRequestBuilder;
            builder.getClass();
            cameraCaptureSession.setRepeatingRequest(builder.build(), null, null);
        } catch (CameraAccessException e) {
            Timber.Forest.e("Failed to start camera preview because it couldn't access camera", new Object[0], e);
            stop();
            anonymousClass1.invoke();
        } catch (IllegalStateException e2) {
            Timber.Forest.e("Failed to start camera preview.", new Object[0], e2);
            stop();
            anonymousClass1.invoke();
        }
    }

    public final void setDefaultFlashState$1() {
        setFlash(this.cameraInfo.flash ? this.defaultFlashState : FlashState.UNAVAILABLE);
    }

    public final void setFlash(FlashState flashState) {
        this.flash = flashState;
        CaptureRequest.Builder builder = this.previewRequestBuilder;
        if (builder != null) {
            builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(flashState == FlashState.ON ? 2 : 0));
            CameraCaptureSession cameraCaptureSession = this.captureSession;
            if (cameraCaptureSession != null) {
                configureSession(cameraCaptureSession);
            }
        }
        ScannerView$$ExternalSyntheticLambda1 scannerView$$ExternalSyntheticLambda1 = this.flashListener;
        if (scannerView$$ExternalSyntheticLambda1 != null) {
            scannerView$$ExternalSyntheticLambda1.invoke(flashState);
        }
    }

    public final void start() {
        String str;
        CameraInfo cameraInfo;
        Rotation rotation;
        this.loadingCallback.invoke();
        if (this.cameraDevice != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Already started.");
            return;
        }
        Context context = this.context;
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        CameraManager cameraManager = (CameraManager) systemService;
        String[] cameraIdList = cameraManager.getCameraIdList();
        cameraIdList.getClass();
        int length = cameraIdList.length;
        ScannerView.AnonymousClass1 anonymousClass1 = this.errorCallback;
        if (length == 0) {
            Timber.Forest.w("No cameras to open", new Object[0]);
            stop();
            anonymousClass1.invoke();
            cameraInfo = new CameraInfo();
        } else {
            int length2 = cameraIdList.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    str = null;
                    break;
                }
                str = cameraIdList[i];
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                cameraCharacteristics.getClass();
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                int i2 = this.preferredFacing.characteristicValue;
                if (num != null && num.intValue() == i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (str == null) {
                str = (String) ArraysKt___ArraysKt.first(cameraIdList);
            }
            String str2 = str;
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str2);
            cameraCharacteristics2.getClass();
            Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m("Failed to get configuration map: ", str2));
                return;
            }
            android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            android.util.Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(35);
            if (outputSizes == null || outputSizes2 == null) {
                Timber.Forest.w("No preview sizes available", new Object[0]);
                stop();
                anonymousClass1.invoke();
                cameraInfo = new CameraInfo();
            } else {
                Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                int intValue = num3 != null ? num3.intValue() : 0;
                SizeMap sizeMap = new SizeMap(0);
                ArrayMap arrayMap = (ArrayMap) sizeMap.mRatios;
                for (android.util.Size size : outputSizes) {
                    sizeMap.add(new Size(size.getWidth(), size.getHeight()));
                }
                if (!ArrayMap.this.containsKey(this.aspectRatio)) {
                    Object next = ((IndexBasedArrayIterator) ((ArrayMap.KeySet) arrayMap.keySet()).iterator()).next();
                    next.getClass();
                    this.aspectRatio = (AspectRatio) next;
                }
                SizeMap sizeMap2 = new SizeMap(0);
                for (android.util.Size size2 : outputSizes2) {
                    sizeMap2.add(new Size(size2.getWidth(), size2.getHeight()));
                }
                Integer num4 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                if (num4 != null) {
                    int intValue2 = num4.intValue();
                    Rotation.Companion.getClass();
                    rotation = LinkResolverDef.fromInt(intValue2);
                } else {
                    rotation = Rotation.ROTATION_0;
                }
                Object obj = cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                obj.getClass();
                Rect rect = (Rect) obj;
                Integer num5 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                int intValue3 = num5 != null ? num5.intValue() : 0;
                Integer num6 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                int intValue4 = num6 != null ? num6.intValue() : 0;
                Integer num7 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                int intValue5 = num7 != null ? num7.intValue() : 0;
                Object obj2 = cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                obj2.getClass();
                cameraInfo = new CameraInfo(str2, num2, sizeMap, sizeMap2, rotation, rect, intValue, intValue3, intValue4, intValue5, ((Boolean) obj2).booleanValue());
            }
        }
        this.cameraInfo = cameraInfo;
        if (cameraInfo.cameraId == null) {
            anonymousClass1.invoke();
            return;
        }
        setDefaultFlashState$1();
        String str3 = this.cameraInfo.cameraId;
        str3.getClass();
        try {
            this.startingCamera.set(true);
            Object systemService2 = context.getSystemService("camera");
            systemService2.getClass();
            ((CameraManager) systemService2).openCamera(str3, this.cameraOpenCallback, (Handler) null);
        } catch (CameraAccessException e) {
            Timber.Forest.d(new RuntimeException("Failed to open camera: ".concat(str3)).initCause(e));
            stop();
            anonymousClass1.invoke();
        }
    }

    public final void stop() {
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        Surface surface = this.previewSurface;
        if (surface != null) {
            surface.release();
            this.previewSurface = null;
        }
        ImageReader imageReader = this.previewReader;
        if (imageReader != null) {
            imageReader.close();
            Surface surface2 = imageReader.getSurface();
            if (surface2 != null) {
                surface2.release();
            }
            this.previewReader = null;
        }
        setFlash(FlashState.OFF);
        this.startingCamera.set(false);
    }

    public final void toggleFlash() {
        FlashState flashState;
        int ordinal = this.flash.ordinal();
        if (ordinal == 0) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        if (ordinal == 1) {
            flashState = FlashState.ON;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            flashState = FlashState.OFF;
        }
        setFlash(flashState);
    }

    /* renamed from: com.squareup.scannerview.CameraOperator$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends Handler {
        public final /* synthetic */ int $r8$classId;
        public Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Looper looper, int i) {
            super(looper);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0189 A[ORIG_RETURN, RETURN] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            String str;
            boolean z;
            int size;
            Recorder.AnonymousClass4[] anonymousClass4Arr;
            AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams;
            char c = 2;
            int i = 0;
            AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams2 = null;
            switch (this.$r8$classId) {
                case 0:
                    message.getClass();
                    if (message.what != 0) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        return;
                    }
                    CameraOperator cameraOperator = (CameraOperator) this.this$0;
                    Object obj = message.obj;
                    obj.getClass();
                    PreviewFrame previewFrame = (PreviewFrame) obj;
                    Lazy lazy = previewFrame.targetHeight$delegate;
                    Lazy lazy2 = previewFrame.targetWidth$delegate;
                    RealObjectScanner realObjectScanner = RealObjectScanner.INSTANCE;
                    Step step = cameraOperator.step;
                    if (step == null) {
                        return;
                    }
                    ScanType scanType = step.scanType;
                    int ordinal = scanType.ordinal();
                    if (ordinal == 0) {
                        ManualCaptureState manualCaptureState = cameraOperator.manualCaptureState;
                        ManualCaptureState manualCaptureState2 = ManualCaptureState.NO;
                        if (manualCaptureState != manualCaptureState2) {
                            cameraOperator.manualCaptureState = manualCaptureState2;
                            str = null;
                            z = true;
                        }
                        str = null;
                        z = false;
                    } else if (ordinal == 1) {
                        int ordinal2 = cameraOperator.manualCaptureState.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                cameraOperator.manualCaptureState = ManualCaptureState.NO;
                                Bitmap createBitmap = Bitmap.createBitmap(((Number) lazy2.getValue()).intValue(), ((Number) lazy.getValue()).intValue(), Bitmap.Config.RGB_565);
                                createBitmap.getClass();
                                short[] sArr = new short[previewFrame.getCroppedY().size];
                                int i2 = previewFrame.getCroppedY().height;
                                int i3 = 0;
                                while (i3 < i2) {
                                    int i4 = previewFrame.getCroppedY().width * i3;
                                    int i5 = previewFrame.getCroppedY().width;
                                    char c2 = c;
                                    for (int i6 = i; i6 < i5; i6++) {
                                        PixelGrid croppedY = previewFrame.getCroppedY();
                                        int i7 = croppedY.data[(croppedY.pixelStride * i6) + (croppedY.rowStride * i3)] & 255;
                                        int i8 = i7 >> 3;
                                        sArr[i4 + i6] = (short) (((i7 >> 2) << 5) | (i8 << 11) | i8);
                                    }
                                    i3++;
                                    c = c2;
                                    i = 0;
                                }
                                createBitmap.copyPixelsFromBuffer(ShortBuffer.wrap(sArr));
                                if (new FaceDetector(((Number) lazy2.getValue()).intValue(), ((Number) lazy.getValue()).intValue(), 1).findFaces(createBitmap, new FaceDetector.Face[1]) > 0) {
                                    z = true;
                                } else {
                                    cameraOperator.manualErrorCallback.invoke(ManualErrorReason.NO_FACE_DETECTED);
                                    z = false;
                                }
                                str = null;
                            } else if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            } else {
                                cameraOperator.manualCaptureState = ManualCaptureState.NO;
                                str = null;
                                z = true;
                            }
                        }
                        str = null;
                        z = false;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        byte[] bArr = previewFrame.getCroppedY().data;
                        int i9 = previewFrame.getCroppedY().width;
                        int i10 = previewFrame.getCroppedY().height;
                        PlanarYUVLuminanceSource planarYUVLuminanceSource = new PlanarYUVLuminanceSource(bArr, i9, i10, i9, i10);
                        str = RealObjectScanner.tryDecodeSource(planarYUVLuminanceSource);
                        if (str == null) {
                            str = RealObjectScanner.tryDecodeSource(new InvertedLuminanceSource(planarYUVLuminanceSource));
                        }
                        if (str == null) {
                            z = false;
                        }
                        z = true;
                    }
                    cameraOperator.objectFoundCallback.invoke(Boolean.valueOf(z));
                    boolean z2 = (cameraOperator.manualCaptureState != ManualCaptureState.FORCE || scanType == ScanType.MANUAL || scanType == ScanType.MANUAL_FACE) ? false : true;
                    if (z2) {
                        cameraOperator.manualCaptureState = ManualCaptureState.NO;
                    }
                    if (z || z2) {
                        cameraOperator.stepCallback.invoke(new StepResult(step, str, step.bitmapRequired ? new StepResult$BitmapResult$Lazy(LazyKt.lazy(new PreviewFrame$$ExternalSyntheticLambda0(previewFrame, 1))) : null));
                        cameraOperator.step = null;
                        return;
                    }
                    return;
                case 1:
                    int i11 = message.what;
                    if (i11 == -3 || i11 == -2 || i11 == -1) {
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.this$0).get(), message.what);
                        return;
                    } else {
                        if (i11 != 1) {
                            return;
                        }
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                case 2:
                    if (message.what != 1) {
                        super.handleMessage(message);
                        return;
                    }
                    LocalBroadcastManager localBroadcastManager = (LocalBroadcastManager) this.this$0;
                    while (true) {
                        synchronized (localBroadcastManager.mReceivers) {
                            try {
                                size = localBroadcastManager.mPendingBroadcasts.size();
                                if (size <= 0) {
                                    return;
                                }
                                anonymousClass4Arr = new Recorder.AnonymousClass4[size];
                                localBroadcastManager.mPendingBroadcasts.toArray(anonymousClass4Arr);
                                localBroadcastManager.mPendingBroadcasts.clear();
                            } finally {
                            }
                        }
                        for (int i12 = 0; i12 < size; i12++) {
                            Recorder.AnonymousClass4 anonymousClass4 = anonymousClass4Arr[i12];
                            int size2 = ((ArrayList) anonymousClass4.this$0).size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                LocalBroadcastManager.ReceiverRecord receiverRecord = (LocalBroadcastManager.ReceiverRecord) ((ArrayList) anonymousClass4.this$0).get(i13);
                                if (!receiverRecord.dead) {
                                    receiverRecord.receiver.onReceive(localBroadcastManager.mAppContext, (Intent) anonymousClass4.val$audioErrorConsumer);
                                }
                            }
                        }
                    }
                case 3:
                    AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = (AsynchronousMediaCodecBufferEnqueuer) this.this$0;
                    int i14 = message.what;
                    if (i14 == 1) {
                        messageParams = (AsynchronousMediaCodecBufferEnqueuer.MessageParams) message.obj;
                        try {
                            asynchronousMediaCodecBufferEnqueuer.codec.queueInputBuffer(messageParams.index, 0, messageParams.size, messageParams.presentationTimeUs, messageParams.flags);
                        } catch (RuntimeException e) {
                            AtomicReference atomicReference = asynchronousMediaCodecBufferEnqueuer.pendingRuntimeException;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                        }
                    } else {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                asynchronousMediaCodecBufferEnqueuer.conditionVariable.open();
                            } else if (i14 != 4) {
                                AtomicReference atomicReference2 = asynchronousMediaCodecBufferEnqueuer.pendingRuntimeException;
                                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i14));
                                while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                                }
                            } else {
                                try {
                                    asynchronousMediaCodecBufferEnqueuer.codec.setParameters((Bundle) message.obj);
                                } catch (RuntimeException e2) {
                                    AtomicReference atomicReference3 = asynchronousMediaCodecBufferEnqueuer.pendingRuntimeException;
                                    while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                                    }
                                }
                            }
                            if (messageParams2 == null) {
                                ArrayDeque arrayDeque = AsynchronousMediaCodecBufferEnqueuer.MESSAGE_PARAMS_INSTANCE_POOL;
                                synchronized (arrayDeque) {
                                    arrayDeque.add(messageParams2);
                                }
                                return;
                            }
                            return;
                        }
                        messageParams = (AsynchronousMediaCodecBufferEnqueuer.MessageParams) message.obj;
                        int i15 = messageParams.index;
                        MediaCodec.CryptoInfo cryptoInfo = messageParams.cryptoInfo;
                        long j = messageParams.presentationTimeUs;
                        int i16 = messageParams.flags;
                        try {
                            if (Build.VERSION.SDK_INT >= 31) {
                                asynchronousMediaCodecBufferEnqueuer.codec.queueSecureInputBuffer(i15, 0, cryptoInfo, j, i16);
                            } else {
                                synchronized (AsynchronousMediaCodecBufferEnqueuer.QUEUE_SECURE_LOCK) {
                                    asynchronousMediaCodecBufferEnqueuer.codec.queueSecureInputBuffer(i15, 0, cryptoInfo, j, i16);
                                }
                            }
                        } catch (RuntimeException e3) {
                            AtomicReference atomicReference4 = asynchronousMediaCodecBufferEnqueuer.pendingRuntimeException;
                            while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                            }
                        }
                    }
                    messageParams2 = messageParams;
                    if (messageParams2 == null) {
                    }
                case 4:
                    HeatRenderer heatRenderer = (HeatRenderer) this.this$0;
                    message.getClass();
                    int i17 = message.what;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            return;
                        }
                        heatRenderer.coolHeatInternal();
                        return;
                    }
                    int i18 = message.arg1;
                    int i19 = message.arg2;
                    Bitmap bitmap = heatRenderer.heatMap;
                    if (bitmap == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("heatMap");
                        throw null;
                    }
                    BitmapsKt.applyHeat(bitmap, i18 / 4.0f, i19 / 4.0f);
                    Bitmap bitmap2 = heatRenderer.heatMap;
                    if (bitmap2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("heatMap");
                        throw null;
                    }
                    DoubleUtils.updateTexture(heatRenderer.heatMapTextureId, bitmap2, TextureType.COLOR);
                    heatRenderer.redraw();
                    return;
                case 5:
                    TextureViewRenderer textureViewRenderer = (TextureViewRenderer) this.this$0;
                    message.getClass();
                    int i20 = message.what;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            GLES20.glViewport(0, 0, message.arg1, message.arg2);
                            textureViewRenderer.redraw();
                            return;
                        }
                        if (i20 != 2) {
                            return;
                        }
                        Object obj2 = message.obj;
                        obj2.getClass();
                        SurfaceTexture surfaceTexture = (SurfaceTexture) obj2;
                        textureViewRenderer.destroy();
                        WindowSurface windowSurface = textureViewRenderer.windowSurface;
                        if (windowSurface == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("windowSurface");
                            throw null;
                        }
                        windowSurface.release();
                        surfaceTexture.release();
                        return;
                    }
                    Object obj3 = message.obj;
                    obj3.getClass();
                    int i21 = message.arg1;
                    int i22 = message.arg2;
                    WindowSurface windowSurface2 = new WindowSurface((SurfaceTexture) obj3);
                    EglCore eglCore = windowSurface2.eglCore;
                    EGLSurface eGLSurface = windowSurface2.eglSurface;
                    eglCore.getClass();
                    eGLSurface.getClass();
                    if (!EGL14.eglMakeCurrent((EGLDisplay) eglCore.eglDisplay, eGLSurface, eGLSurface, (EGLContext) eglCore.eglContext)) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1("eglMakeCurrent failed");
                        return;
                    }
                    textureViewRenderer.windowSurface = windowSurface2;
                    textureViewRenderer.init(i21, i22);
                    GLES20.glViewport(0, 0, i21, i22);
                    textureViewRenderer.redraw();
                    return;
                default:
                    message.getClass();
                    if (message.what == 0) {
                        ParticleGridRenderer particleGridRenderer = (ParticleGridRenderer) this.this$0;
                        particleGridRenderer.redraw();
                        particleGridRenderer.scheduleFrame();
                        return;
                    }
                    return;
            }
        }

        public /* synthetic */ AnonymousClass2() {
            this.$r8$classId = 1;
        }
    }

    public final class CameraInfo {
        public final Rect arraySize;
        public final String cameraId;
        public final Integer facing;
        public final boolean flash;
        public final SizeMap imageProcessingSizes;
        public final int maxRegionsAe;
        public final int maxRegionsAf;
        public final int maxRegionsAwb;
        public final SizeMap previewSizes;
        public final Rotation rotation;

        public /* synthetic */ CameraInfo() {
            this(null, null, new SizeMap(0), new SizeMap(0), Rotation.ROTATION_0, new Rect(), 0, 0, 0, 0, false);
        }

        public CameraInfo(String str, Integer num, SizeMap sizeMap, SizeMap sizeMap2, Rotation rotation, Rect rect, int i, int i2, int i3, int i4, boolean z) {
            this.cameraId = str;
            this.facing = num;
            this.previewSizes = sizeMap;
            this.imageProcessingSizes = sizeMap2;
            this.rotation = rotation;
            this.arraySize = rect;
            this.maxRegionsAf = i2;
            this.maxRegionsAe = i3;
            this.maxRegionsAwb = i4;
            this.flash = z;
        }
    }

    public final void calculateAdjustedTargetBounds() {
        Size chooseOptimalSize = chooseOptimalSize(this.cameraInfo.imageProcessingSizes, this.imageProcessingResolution);
        calculateAdjustedTargetBounds(chooseOptimalSize.width, chooseOptimalSize.height);
    }
}
