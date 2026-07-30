package a5;

import android.hardware.Camera;
import com.king.zxing.camera.open.CameraFacing;

/* loaded from: classes4.dex */
public final class b {
    public static final int NO_REQUESTED_CAMERA = -1;

    private b() {
    }

    public static a open(int i8) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            b5.b.w("No cameras!");
            return null;
        }
        if (i8 >= numberOfCameras) {
            b5.b.w("Requested camera does not exist: " + i8);
            return null;
        }
        if (i8 <= -1) {
            i8 = 0;
            int i9 = 0;
            while (i9 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i9, cameraInfo);
                if (CameraFacing.values()[cameraInfo.facing] == CameraFacing.BACK) {
                    break;
                }
                i9++;
            }
            if (i9 == numberOfCameras) {
                b5.b.i("No camera facing " + CameraFacing.BACK + "; returning camera #0");
            } else {
                i8 = i9;
            }
        }
        b5.b.i("Opening camera #" + i8);
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i8, cameraInfo2);
        Camera open = Camera.open(i8);
        if (open == null) {
            return null;
        }
        return new a(i8, open, CameraFacing.values()[cameraInfo2.facing], cameraInfo2.orientation);
    }
}
