package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief extends TableQrCodeScannerViewKt {
    public final AfterpayAppletEntrypoint.V3LoanBrief value;

    public AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief(AfterpayAppletEntrypoint.V3LoanBrief v3LoanBrief) {
        v3LoanBrief.getClass();
        this.value = v3LoanBrief;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) && Intrinsics.areEqual(this.value, ((AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "V3LoanBrief(value=" + this.value + ")";
    }
}
