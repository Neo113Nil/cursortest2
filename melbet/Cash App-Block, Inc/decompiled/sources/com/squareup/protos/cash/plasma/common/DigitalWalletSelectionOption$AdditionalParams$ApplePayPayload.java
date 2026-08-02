package com.squareup.protos.cash.plasma.common;

import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload extends zzkh {
    public final DigitalWalletSelectionOption.ApplePayPayload value;

    public DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload(DigitalWalletSelectionOption.ApplePayPayload applePayPayload) {
        applePayPayload.getClass();
        this.value = applePayPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload) && Intrinsics.areEqual(this.value, ((DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ApplePayPayload(value=" + this.value + ")";
    }
}
