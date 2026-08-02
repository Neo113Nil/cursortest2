package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.cash.plasma.ui.inputs.WebViewCallbackInputs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$WebviewResult extends zzdi {
    public final WebViewCallbackInputs value;

    public SubmitFormRequest$ElementResult$Result$WebviewResult(WebViewCallbackInputs webViewCallbackInputs) {
        webViewCallbackInputs.getClass();
        this.value = webViewCallbackInputs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$WebviewResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$WebviewResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "WebviewResult(value=" + this.value + ")";
    }
}
