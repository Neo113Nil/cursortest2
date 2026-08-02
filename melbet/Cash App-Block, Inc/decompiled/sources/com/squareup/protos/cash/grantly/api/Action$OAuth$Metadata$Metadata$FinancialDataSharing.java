package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$Metadata$FinancialDataSharing extends HttpHeaderParser {
    public final Action.OAuth.Metadata.FinancialDataSharing value;

    public Action$OAuth$Metadata$Metadata$FinancialDataSharing(Action.OAuth.Metadata.FinancialDataSharing financialDataSharing) {
        financialDataSharing.getClass();
        this.value = financialDataSharing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$OAuth$Metadata$Metadata$FinancialDataSharing) && Intrinsics.areEqual(this.value, ((Action$OAuth$Metadata$Metadata$FinancialDataSharing) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FinancialDataSharing(value=" + this.value + ")";
    }
}
