package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Entrypoint$CreditDetails extends TableQrCodeScannerViewKt {
    public final AfterpayAppletEntrypoint.CreditDetails value;

    public AfterpayAppletEntrypoint$Entrypoint$CreditDetails(AfterpayAppletEntrypoint.CreditDetails creditDetails) {
        creditDetails.getClass();
        this.value = creditDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypoint$Entrypoint$CreditDetails) && Intrinsics.areEqual(this.value, ((AfterpayAppletEntrypoint$Entrypoint$CreditDetails) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CreditDetails(value=" + this.value + ")";
    }
}
