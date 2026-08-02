package com.squareup.protos.franklin.app;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzdj;

/* loaded from: classes8.dex */
public final class SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult extends zzdj {
    public final boolean value;

    public SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult) && this.value == ((SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("SelectedFallbackResult(value=", ")", this.value);
    }
}
