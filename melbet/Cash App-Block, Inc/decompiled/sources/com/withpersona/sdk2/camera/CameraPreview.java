package com.withpersona.sdk2.camera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCapture$$ExternalSyntheticLambda3;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.LensFacingCameraFilter;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda17;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda2;
import androidx.camera.view.PreviewView;
import androidx.core.content.PermissionChecker;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.squareup.scannerview.TextSetter;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import io.noties.markwon.MarkwonConfiguration;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DispatcherExecutor;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.oneformapp.schema.Schema;
import okhttp3.FormBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class CameraPreview {
    public MarkwonConfiguration currentCameraSession;
    public final SdkFilesManager sdkFilesManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes9.dex */
    public final class CameraDirection {
        public static final /* synthetic */ CameraDirection[] $VALUES;
        public static final CameraDirection BACK;
        public static final CameraDirection EXTERNAL;
        public static final CameraDirection FRONT;

        static {
            CameraDirection cameraDirection = new CameraDirection("FRONT", 0);
            FRONT = cameraDirection;
            CameraDirection cameraDirection2 = new CameraDirection("BACK", 1);
            BACK = cameraDirection2;
            CameraDirection cameraDirection3 = new CameraDirection("EXTERNAL", 2);
            EXTERNAL = cameraDirection3;
            $VALUES = new CameraDirection[]{cameraDirection, cameraDirection2, cameraDirection3};
        }

        public static CameraDirection valueOf(String str) {
            return (CameraDirection) Enum.valueOf(CameraDirection.class, str);
        }

        public static CameraDirection[] values() {
            return (CameraDirection[]) $VALUES.clone();
        }
    }

    public CameraPreview(SdkFilesManager sdkFilesManager) {
        sdkFilesManager.getClass();
        this.sdkFilesManager = sdkFilesManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: IllegalArgumentException -> 0x0095, TryCatch #0 {IllegalArgumentException -> 0x0095, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x001f, B:10:0x004d, B:11:0x004f, B:13:0x005a, B:17:0x0060, B:23:0x006a, B:24:0x006c, B:26:0x0078, B:32:0x007f, B:33:0x0089, B:38:0x008b, B:40:0x0044, B:42:0x004a, B:43:0x0038, B:45:0x003e), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[EDGE_INSN: B:35:0x008a->B:36:0x008a BREAK  A[LOOP:0: B:17:0x0060->B:28:0x007c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CameraProperties retrieveCameraProperties(LifecycleCamera lifecycleCamera) {
        CameraProperties.FacingMode facingMode;
        Range[] rangeArr;
        int i;
        int i2;
        int i3;
        try {
            CameraInfo cameraInfo = lifecycleCamera.getCameraInfo();
            cameraInfo.getClass();
            Camera2CameraInfo from = Camera2CameraInfo.from(cameraInfo);
            String str = from.cameraId;
            str.getClass();
            Rect rect = (Rect) from.getCameraCharacteristic(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                rect = new Rect();
            }
            Size size = new Size(rect.width(), rect.height());
            Integer num = (Integer) from.getCameraCharacteristic(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1) {
                facingMode = CameraProperties.FacingMode.Environment;
                rangeArr = (Range[]) from.getCameraCharacteristic(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                i = 0;
                if (rangeArr != null && rangeArr.length != 0) {
                    int i4 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 >= rangeArr.length) {
                            break;
                        }
                        i3 = i2 + 1;
                        try {
                            Integer num2 = (Integer) rangeArr[i2].getUpper();
                            if (num2.intValue() > i4) {
                                i4 = num2.intValue();
                            }
                            i2 = i3;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                    i = i4;
                }
                return new CameraProperties(str, facingMode, size, i, 16, 0);
            }
            if (num.intValue() == 0) {
                facingMode = CameraProperties.FacingMode.User;
                rangeArr = (Range[]) from.getCameraCharacteristic(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                i = 0;
                if (rangeArr != null) {
                    int i42 = 0;
                    i2 = 0;
                    while (true) {
                        if (i2 >= rangeArr.length) {
                        }
                        i2 = i3;
                    }
                    i = i42;
                }
                return new CameraProperties(str, facingMode, size, i, 16, 0);
            }
            facingMode = CameraProperties.FacingMode.Unknown;
            rangeArr = (Range[]) from.getCameraCharacteristic(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            i = 0;
            if (rangeArr != null) {
            }
            return new CameraProperties(str, facingMode, size, i, 16, 0);
        } catch (IllegalArgumentException unused) {
            return new CameraProperties(null, null, null, 0, 31, 0);
        }
    }

    public final void rebind(PreviewView previewView, CameraDirection cameraDirection, ImageAnalysis.Analyzer analyzer, boolean z, Function1 function1) {
        previewView.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new LensFacingCameraFilter(cameraDirection == CameraDirection.FRONT ? 0 : 1));
        previewView.post(new VideoCapture$$ExternalSyntheticLambda2(previewView, analyzer, z, new CameraSelector(linkedHashSet), this, function1));
    }

    public final boolean startVideo(Context context, boolean z) {
        Recorder recorder;
        context.getClass();
        MarkwonConfiguration markwonConfiguration = this.currentCameraSession;
        if (markwonConfiguration == null || ((TextSetter) markwonConfiguration.spansFactory) != null || (recorder = (Recorder) markwonConfiguration.linkResolver) == null) {
            return false;
        }
        SdkFilesManager sdkFilesManager = this.sdkFilesManager;
        sdkFilesManager.getClass();
        TextSetter textSetter = new TextSetter(context, recorder, sdkFilesManager, z);
        if (((TextSetter) textSetter.scannerText) == null) {
            File newRandomSessionFile = sdkFilesManager.newRandomSessionFile("mp4");
            boolean z2 = PermissionChecker.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
            if (z && !z2) {
                throw new MissingAudioPermissionError();
            }
            Schema schema = new Schema(context, recorder, new PreviewView.AnonymousClass1(newRandomSessionFile).build());
            if (z && z2) {
                schema.withAudioEnabled();
            }
            textSetter.scannerText = new TextSetter(schema.start((Executor) textSetter.textView, new Recorder$$ExternalSyntheticLambda17(textSetter, 5)), newRandomSessionFile);
        }
        markwonConfiguration.spansFactory = textSetter;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: stopVideo-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4086stopVideoIoAF18A(ContinuationImpl continuationImpl) {
        CameraPreview$stopVideo$1 cameraPreview$stopVideo$1;
        int i;
        MarkwonConfiguration markwonConfiguration;
        Object m3983stopIoAF18A;
        if (continuationImpl instanceof CameraPreview$stopVideo$1) {
            cameraPreview$stopVideo$1 = (CameraPreview$stopVideo$1) continuationImpl;
            int i2 = cameraPreview$stopVideo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cameraPreview$stopVideo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cameraPreview$stopVideo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraPreview$stopVideo$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    markwonConfiguration = this.currentCameraSession;
                    if (markwonConfiguration == null) {
                        Result.Companion companion = Result.Companion;
                        return new Result.Failure(new NoActiveRecordingError());
                    }
                    TextSetter textSetter = (TextSetter) markwonConfiguration.spansFactory;
                    if (textSetter == null) {
                        Result.Companion companion2 = Result.Companion;
                        return new Result.Failure(new NoActiveRecordingError());
                    }
                    cameraPreview$stopVideo$1.L$0 = markwonConfiguration;
                    cameraPreview$stopVideo$1.label = 1;
                    m3983stopIoAF18A = textSetter.m3983stopIoAF18A(cameraPreview$stopVideo$1);
                    if (m3983stopIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    markwonConfiguration = cameraPreview$stopVideo$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    m3983stopIoAF18A = ((Result) obj).value;
                }
                markwonConfiguration.spansFactory = null;
                return m3983stopIoAF18A;
            }
        }
        cameraPreview$stopVideo$1 = new CameraPreview$stopVideo$1(this, continuationImpl);
        Object obj2 = cameraPreview$stopVideo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraPreview$stopVideo$1.label;
        if (i != 0) {
        }
        markwonConfiguration.spansFactory = null;
        return m3983stopIoAF18A;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: takePicture-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4087takePicturegIAlus(SdkFilesManager sdkFilesManager, ContinuationImpl continuationImpl) {
        CameraPreview$takePicture$1 cameraPreview$takePicture$1;
        int i;
        if (continuationImpl instanceof CameraPreview$takePicture$1) {
            cameraPreview$takePicture$1 = (CameraPreview$takePicture$1) continuationImpl;
            int i2 = cameraPreview$takePicture$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cameraPreview$takePicture$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cameraPreview$takePicture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraPreview$takePicture$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cameraPreview$takePicture$1.label = 1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(cameraPreview$takePicture$1));
                    MarkwonConfiguration markwonConfiguration = this.currentCameraSession;
                    ImageCapture imageCapture = markwonConfiguration != null ? (ImageCapture) markwonConfiguration.syntaxHighlight : null;
                    if (imageCapture == null) {
                        Result.Companion companion = Result.Companion;
                        safeContinuation.resumeWith(new Result(new Result.Failure(new NoSuitableCameraError())));
                    } else {
                        File newRandomSessionFile = sdkFilesManager.newRandomSessionFile("jpg");
                        UseCaseGroup useCaseGroup = new UseCaseGroup(newRandomSessionFile);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DispatcherExecutor dispatcherExecutor = new DispatcherExecutor(MainDispatcherLoader.dispatcher.immediate);
                        FormBody.Builder builder = new FormBody.Builder(safeContinuation, newRandomSessionFile);
                        if (Looper.getMainLooper() != Looper.myLooper()) {
                            zzabp.mainThreadExecutor().execute(new ImageCapture$$ExternalSyntheticLambda3(imageCapture, useCaseGroup, dispatcherExecutor, builder, 0));
                        } else {
                            imageCapture.takePictureInternal(dispatcherExecutor, null, builder, useCaseGroup);
                        }
                    }
                    obj = safeContinuation.getOrThrow();
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
        cameraPreview$takePicture$1 = new CameraPreview$takePicture$1(this, continuationImpl);
        Object obj2 = cameraPreview$takePicture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraPreview$takePicture$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).value;
    }
}
