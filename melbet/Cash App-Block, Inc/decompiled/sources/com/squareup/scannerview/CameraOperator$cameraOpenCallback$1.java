package com.squareup.scannerview;

import android.hardware.camera2.CameraDevice;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.atomicfu.AtomicRef;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class CameraOperator$cameraOpenCallback$1 extends CameraDevice.StateCallback {
    public final /* synthetic */ int $r8$classId = 1;
    public Object this$0;

    public CameraOperator$cameraOpenCallback$1(CameraOperator cameraOperator) {
        this.this$0 = cameraOperator;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        int i = this.$r8$classId;
        cameraDevice.getClass();
        switch (i) {
            case 0:
                CameraOperator cameraOperator = (CameraOperator) this.this$0;
                cameraOperator.cameraDevice = null;
                cameraOperator.startingCamera.set(false);
                break;
            default:
                Iterator it = ((List) ((AtomicRef) this.this$0).value).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        int i = this.$r8$classId;
        cameraDevice.getClass();
        switch (i) {
            case 0:
                CameraOperator cameraOperator = (CameraOperator) this.this$0;
                cameraOperator.cameraDevice = null;
                cameraOperator.startingCamera.set(false);
                break;
            default:
                Iterator it = ((List) ((AtomicRef) this.this$0).value).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        int i2 = this.$r8$classId;
        cameraDevice.getClass();
        switch (i2) {
            case 0:
                Timber.Forest.e(new IllegalStateException(Recorder$$ExternalSyntheticOutline1.m("onError: ", i, cameraDevice.getId(), " (", ")")));
                CameraOperator cameraOperator = (CameraOperator) this.this$0;
                cameraOperator.cameraDevice = null;
                cameraOperator.startingCamera.set(false);
                cameraOperator.errorCallback.invoke();
                break;
            default:
                Iterator it = ((List) ((AtomicRef) this.this$0).value).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        int i = this.$r8$classId;
        cameraDevice.getClass();
        switch (i) {
            case 0:
                CameraOperator cameraOperator = (CameraOperator) this.this$0;
                AtomicBoolean atomicBoolean = cameraOperator.startingCamera;
                if (atomicBoolean.get()) {
                    atomicBoolean.set(false);
                    cameraOperator.cameraDevice = cameraDevice;
                    CameraOperator.access$startCaptureSession(cameraOperator);
                    break;
                }
                break;
            default:
                Iterator it = ((List) ((AtomicRef) this.this$0).value).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public /* synthetic */ CameraOperator$cameraOpenCallback$1() {
    }
}
