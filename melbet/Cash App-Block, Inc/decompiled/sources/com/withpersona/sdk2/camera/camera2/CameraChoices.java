package com.withpersona.sdk2.camera.camera2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class CameraChoices {
    public final List backupChoices;
    public final CameraChoice primaryChoice;

    public CameraChoices(CameraChoice cameraChoice, List list) {
        cameraChoice.getClass();
        list.getClass();
        this.primaryChoice = cameraChoice;
        this.backupChoices = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraChoices)) {
            return false;
        }
        CameraChoices cameraChoices = (CameraChoices) obj;
        return Intrinsics.areEqual(this.primaryChoice, cameraChoices.primaryChoice) && Intrinsics.areEqual(this.backupChoices, cameraChoices.backupChoices);
    }

    public final int hashCode() {
        return this.backupChoices.hashCode() + (this.primaryChoice.hashCode() * 31);
    }

    public final String toString() {
        return "CameraChoices(primaryChoice=" + this.primaryChoice + ", backupChoices=" + this.backupChoices + ")";
    }
}
