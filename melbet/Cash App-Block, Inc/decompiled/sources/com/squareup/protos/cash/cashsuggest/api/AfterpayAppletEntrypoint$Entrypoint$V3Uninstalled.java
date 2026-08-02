package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled extends TableQrCodeScannerViewKt {
    public final AfterpayAppletEntrypoint.V3Uninstalled value;

    public AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled(AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled) {
        v3Uninstalled.getClass();
        this.value = v3Uninstalled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) && Intrinsics.areEqual(this.value, ((AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "V3Uninstalled(value=" + this.value + ")";
    }
}
