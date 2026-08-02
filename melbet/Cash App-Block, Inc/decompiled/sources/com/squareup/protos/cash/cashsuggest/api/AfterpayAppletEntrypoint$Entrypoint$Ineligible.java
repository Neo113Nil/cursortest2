package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Entrypoint$Ineligible extends TableQrCodeScannerViewKt {
    public final AfterpayAppletEntrypoint.Ineligible value;

    public AfterpayAppletEntrypoint$Entrypoint$Ineligible(AfterpayAppletEntrypoint.Ineligible ineligible) {
        ineligible.getClass();
        this.value = ineligible;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypoint$Entrypoint$Ineligible) && Intrinsics.areEqual(this.value, ((AfterpayAppletEntrypoint$Entrypoint$Ineligible) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Ineligible(value=" + this.value + ")";
    }
}
