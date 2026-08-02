package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Entrypoint$V3TextBrief extends TableQrCodeScannerViewKt {
    public final AfterpayAppletEntrypoint.V3TextBrief value;

    public AfterpayAppletEntrypoint$Entrypoint$V3TextBrief(AfterpayAppletEntrypoint.V3TextBrief v3TextBrief) {
        v3TextBrief.getClass();
        this.value = v3TextBrief;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) && Intrinsics.areEqual(this.value, ((AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "V3TextBrief(value=" + this.value + ")";
    }
}
