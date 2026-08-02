package com.squareup.protos.cash.customersearch.api;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.zipline.internal.SignaturePayloadKt;

/* loaded from: classes7.dex */
public final class Filter$Option$Toggle extends SignaturePayloadKt {
    public final boolean value;

    public Filter$Option$Toggle(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Filter$Option$Toggle) && this.value == ((Filter$Option$Toggle) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("Toggle(value=", ")", this.value);
    }
}
