package com.stripe.android.uicore;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public final class FormInsets {
    public final float bottom;
    public final float end;
    public final float start;
    public final float top;

    public FormInsets(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormInsets)) {
            return false;
        }
        FormInsets formInsets = (FormInsets) obj;
        return Float.compare(this.start, formInsets.start) == 0 && Float.compare(this.top, formInsets.top) == 0 && Float.compare(this.end, formInsets.end) == 0 && Float.compare(this.bottom, formInsets.bottom) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.bottom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.end, CameraState$Type$EnumUnboxingLocalUtility.m(this.top, Float.hashCode(this.start) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormInsets(start=", this.start, ", top=", this.top, ", end=");
        m.append(this.end);
        m.append(", bottom=");
        m.append(this.bottom);
        m.append(")");
        return m.toString();
    }
}
