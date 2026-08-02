package com.withpersona.sdk2.camera.camera2;

import android.util.Range;
import android.util.Size;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.camera.CameraProperties;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class CameraChoice {
    public final ExtraCameraOptions additionalOptions;
    public final CameraProperties cameraProperties;
    public final CameraProperties.FacingMode facingMode;
    public final String id;
    public final double maxFps;
    public final int rotation;
    public final Size size;
    public final Range targetFpsRange;

    public CameraChoice(String str, Size size, double d, Range range, int i, CameraProperties.FacingMode facingMode, ExtraCameraOptions extraCameraOptions) {
        this.id = str;
        this.size = size;
        this.maxFps = d;
        this.targetFpsRange = range;
        this.rotation = i;
        this.facingMode = facingMode;
        this.additionalOptions = extraCameraOptions;
        this.cameraProperties = new CameraProperties(str, facingMode, size, (int) d, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraChoice)) {
            return false;
        }
        CameraChoice cameraChoice = (CameraChoice) obj;
        return this.id.equals(cameraChoice.id) && this.size.equals(cameraChoice.size) && Double.compare(this.maxFps, cameraChoice.maxFps) == 0 && this.targetFpsRange.equals(cameraChoice.targetFpsRange) && this.rotation == cameraChoice.rotation && this.facingMode == cameraChoice.facingMode && this.additionalOptions.equals(cameraChoice.additionalOptions);
    }

    public final int hashCode() {
        return this.additionalOptions.hashCode() + ((this.facingMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rotation, (this.targetFpsRange.hashCode() + Fragment$5$$ExternalSyntheticOutline0.m(this.maxFps, (this.size.hashCode() + (this.id.hashCode() * 31)) * 31, 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "CameraChoice(id=" + this.id + ", size=" + this.size + ", maxFps=" + this.maxFps + ", targetFpsRange=" + this.targetFpsRange + ", rotation=" + this.rotation + ", facingMode=" + this.facingMode + ", additionalOptions=" + this.additionalOptions + ")";
    }
}
