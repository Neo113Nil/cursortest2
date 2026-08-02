package com.squareup.protos.cash.plasma.common;

import com.datadog.android.rum.model.ErrorEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InstrumentSelectionOption$SelectionOption$DigitalWallet extends ErrorEvent.Csp.Companion {
    public final DigitalWalletSelectionOption value;

    public InstrumentSelectionOption$SelectionOption$DigitalWallet(DigitalWalletSelectionOption digitalWalletSelectionOption) {
        digitalWalletSelectionOption.getClass();
        this.value = digitalWalletSelectionOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentSelectionOption$SelectionOption$DigitalWallet) && Intrinsics.areEqual(this.value, ((InstrumentSelectionOption$SelectionOption$DigitalWallet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DigitalWallet(value=" + this.value + ")";
    }
}
