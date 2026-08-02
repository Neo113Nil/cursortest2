package com.stripe.android.financialconnections;

import com.datadog.trace.core.util.GlobPattern;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl extends GlobPattern {
    public final String url;

    public FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl(String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl) && Intrinsics.areEqual(this.url, ((FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenAuthFlowWithUrl(url=", this.url, ")");
    }
}
