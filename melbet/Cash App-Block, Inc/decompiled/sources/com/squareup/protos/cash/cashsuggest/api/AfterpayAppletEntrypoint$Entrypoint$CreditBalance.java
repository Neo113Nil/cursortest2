package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Entrypoint$CreditBalance extends TableQrCodeScannerViewKt {
    public final AfterpayAppletEntrypoint.CreditBalance value;

    public AfterpayAppletEntrypoint$Entrypoint$CreditBalance(AfterpayAppletEntrypoint.CreditBalance creditBalance) {
        creditBalance.getClass();
        this.value = creditBalance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypoint$Entrypoint$CreditBalance) && Intrinsics.areEqual(this.value, ((AfterpayAppletEntrypoint$Entrypoint$CreditBalance) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CreditBalance(value=" + this.value + ")";
    }
}
