package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Entrypoint$OverDue extends TableQrCodeScannerViewKt {
    public final AfterpayAppletEntrypoint.Overdue value;

    public AfterpayAppletEntrypoint$Entrypoint$OverDue(AfterpayAppletEntrypoint.Overdue overdue) {
        overdue.getClass();
        this.value = overdue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypoint$Entrypoint$OverDue) && Intrinsics.areEqual(this.value, ((AfterpayAppletEntrypoint$Entrypoint$OverDue) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OverDue(value=" + this.value + ")";
    }
}
