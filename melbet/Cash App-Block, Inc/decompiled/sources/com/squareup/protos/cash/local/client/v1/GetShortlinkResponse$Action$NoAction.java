package com.squareup.protos.cash.local.client.v1;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;

/* loaded from: classes7.dex */
public final class GetShortlinkResponse$Action$NoAction extends ViewUtilsKt {
    public final boolean value;

    public GetShortlinkResponse$Action$NoAction(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetShortlinkResponse$Action$NoAction) && this.value == ((GetShortlinkResponse$Action$NoAction) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("NoAction(value=", ")", this.value);
    }
}
