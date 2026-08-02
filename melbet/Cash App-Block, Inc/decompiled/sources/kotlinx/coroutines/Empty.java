package kotlinx.coroutines;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class Empty implements Incomplete {
    public final boolean isActive;

    public Empty(boolean z) {
        this.isActive = z;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final NodeList getList() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return this.isActive;
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("Empty{"), this.isActive ? "Active" : "New", '}');
    }
}
