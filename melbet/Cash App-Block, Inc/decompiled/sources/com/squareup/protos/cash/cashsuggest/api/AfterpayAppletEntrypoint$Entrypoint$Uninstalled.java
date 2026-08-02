package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Entrypoint$Uninstalled extends TableQrCodeScannerViewKt {
    public final AfterpayAppletEntrypoint.Uninstalled value;

    public AfterpayAppletEntrypoint$Entrypoint$Uninstalled(AfterpayAppletEntrypoint.Uninstalled uninstalled) {
        uninstalled.getClass();
        this.value = uninstalled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypoint$Entrypoint$Uninstalled) && Intrinsics.areEqual(this.value, ((AfterpayAppletEntrypoint$Entrypoint$Uninstalled) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Uninstalled(value=" + this.value + ")";
    }
}
