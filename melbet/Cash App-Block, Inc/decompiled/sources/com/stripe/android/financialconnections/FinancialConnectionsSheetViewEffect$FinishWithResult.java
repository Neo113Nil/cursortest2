package com.stripe.android.financialconnections;

import com.datadog.trace.core.util.GlobPattern;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetViewEffect$FinishWithResult extends GlobPattern {
    public final FinancialConnectionsSheetActivityResult result;

    public FinancialConnectionsSheetViewEffect$FinishWithResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        this.result = financialConnectionsSheetActivityResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FinancialConnectionsSheetViewEffect$FinishWithResult) && this.result.equals(((FinancialConnectionsSheetViewEffect$FinishWithResult) obj).result);
    }

    public final int hashCode() {
        return this.result.hashCode() * 31;
    }

    public final String toString() {
        return "FinishWithResult(result=" + this.result + ", finishToast=null)";
    }
}
