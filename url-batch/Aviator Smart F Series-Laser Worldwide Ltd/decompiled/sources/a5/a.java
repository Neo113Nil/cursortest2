package a5;

import android.hardware.Camera;
import com.king.zxing.camera.open.CameraFacing;

/* loaded from: classes4.dex */
public final class a {
    private final Camera camera;
    private final CameraFacing facing;
    private final int index;
    private final int orientation;

    public a(int i8, Camera camera, CameraFacing cameraFacing, int i9) {
        this.index = i8;
        this.camera = camera;
        this.facing = cameraFacing;
        this.orientation = i9;
    }

    public Camera getCamera() {
        return this.camera;
    }

    public CameraFacing getFacing() {
        return this.facing;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String toString() {
        return "Camera #" + this.index + " : " + this.facing + ',' + this.orientation;
    }
}
