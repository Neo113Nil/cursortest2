package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class HalfSheetMessage$SecondaryNavigationAction$SecondaryButton extends zzjr {
    public final AppMessageAction value;

    public HalfSheetMessage$SecondaryNavigationAction$SecondaryButton(AppMessageAction appMessageAction) {
        appMessageAction.getClass();
        this.value = appMessageAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) && Intrinsics.areEqual(this.value, ((HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) obj).value);
    }

    public final AppMessageAction getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SecondaryButton(value=" + this.value + ")";
    }
}
