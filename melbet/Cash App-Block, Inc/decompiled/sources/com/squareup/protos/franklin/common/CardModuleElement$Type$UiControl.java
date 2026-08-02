package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzds;
import com.squareup.protos.franklin.ui.UiControl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardModuleElement$Type$UiControl extends zzds {
    public final UiControl value;

    public CardModuleElement$Type$UiControl(UiControl uiControl) {
        uiControl.getClass();
        this.value = uiControl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModuleElement$Type$UiControl) && Intrinsics.areEqual(this.value, ((CardModuleElement$Type$UiControl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UiControl(value=" + this.value + ")";
    }
}
