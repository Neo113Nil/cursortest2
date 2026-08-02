package com.squareup.protos.cash.plasma.common;

import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload extends zzkh {
    public final DigitalWalletSelectionOption.GooglePayPayload value;

    public DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload(DigitalWalletSelectionOption.GooglePayPayload googlePayPayload) {
        googlePayPayload.getClass();
        this.value = googlePayPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload) && Intrinsics.areEqual(this.value, ((DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GooglePayPayload(value=" + this.value + ")";
    }
}
