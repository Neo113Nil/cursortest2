package com.withpersona.sdk2.camera.camera2;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes8.dex */
public final class CameraCaptureSessionWrapper {
    public static final LinkResolverDef Companion = new LinkResolverDef(18);
    public final CameraCharacteristics cameraCharacteristics;
    public final CameraChoice cameraChoice;
    public final ContextScope coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
    public boolean enableTorch;
    public final Handler handler;
    public MeteringRectangle meteringRect;
    public StandaloneCoroutine resetFocusJob;
    public CameraCaptureSession session;
    public final List targets;

    public CameraCaptureSessionWrapper(CameraChoice cameraChoice, List list, Handler handler, CameraCharacteristics cameraCharacteristics) {
        this.cameraChoice = cameraChoice;
        this.targets = list;
        this.handler = handler;
        this.cameraCharacteristics = cameraCharacteristics;
    }

    public static final Object access$createCaptureSession(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, final CameraDevice cameraDevice, CameraCaptureSessionWrapper$Companion$create$1 cameraCaptureSessionWrapper$Companion$create$1) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(cameraCaptureSessionWrapper$Companion$create$1));
        CameraCaptureSession.StateCallback stateCallback = new CameraCaptureSession.StateCallback() { // from class: com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$createCaptureSession$2$stateCallback$1
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                cameraCaptureSession.getClass();
                RuntimeException runtimeException = new RuntimeException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Camera ", cameraDevice.getId(), " session configuration failed"));
                Result.Companion companion = Result.Companion;
                SafeContinuation.this.resumeWith(new Result.Failure(runtimeException));
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                cameraCaptureSession.getClass();
                Result.Companion companion = Result.Companion;
                SafeContinuation.this.resumeWith(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public final void onReady(CameraCaptureSession cameraCaptureSession) {
                cameraCaptureSession.getClass();
            }
        };
        List<Surface> list = cameraCaptureSessionWrapper.targets;
        Handler handler = cameraCaptureSessionWrapper.handler;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                OutputConfiguration outputConfiguration = new OutputConfiguration(it.next());
                ExtraCameraOptions extraCameraOptions = cameraCaptureSessionWrapper.cameraChoice.additionalOptions;
                outputConfiguration.setDynamicRangeProfile(1L);
                arrayList.add(outputConfiguration);
            }
            cameraDevice.createCaptureSessionByOutputConfigurations(arrayList, stateCallback, handler);
        } else {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        }
        Object orThrow = safeContinuation.getOrThrow();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return orThrow;
    }

    public final void updateRepeatingRequest() {
        CameraCaptureSession cameraCaptureSession = this.session;
        if (cameraCaptureSession == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            throw null;
        }
        CameraChoice cameraChoice = this.cameraChoice;
        ExtraCameraOptions extraCameraOptions = cameraChoice.additionalOptions;
        CaptureRequest.Builder createCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(1);
        Iterator it = this.targets.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget((Surface) it.next());
        }
        createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, cameraChoice.targetFpsRange);
        if (this.enableTorch) {
            createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
        }
        MeteringRectangle meteringRectangle = this.meteringRect;
        if (meteringRectangle != null) {
            Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
            if ((num != null ? num.intValue() : 0) >= 1) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            }
        }
        CaptureRequest build = createCaptureRequest.build();
        build.getClass();
        CameraCaptureSession cameraCaptureSession2 = this.session;
        if (cameraCaptureSession2 != null) {
            cameraCaptureSession2.setRepeatingRequest(build, null, this.handler);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            throw null;
        }
    }
}
