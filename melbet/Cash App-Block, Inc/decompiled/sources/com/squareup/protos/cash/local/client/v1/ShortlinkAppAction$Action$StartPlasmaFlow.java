package com.squareup.protos.cash.local.client.v1;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzje;

/* loaded from: classes7.dex */
public final class ShortlinkAppAction$Action$StartPlasmaFlow extends zzje {
    public final boolean value;

    public ShortlinkAppAction$Action$StartPlasmaFlow(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortlinkAppAction$Action$StartPlasmaFlow) && this.value == ((ShortlinkAppAction$Action$StartPlasmaFlow) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("StartPlasmaFlow(value=", ")", this.value);
    }
}
