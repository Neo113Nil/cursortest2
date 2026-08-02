package com.stripe.android.financialconnections;

import com.datadog.trace.core.util.GlobPattern;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow extends GlobPattern {
    public final FinancialConnectionsSheetConfiguration configuration;
    public final ElementsSessionContext elementsSessionContext;
    public final FinancialConnectionsSheetFlowType flowType;
    public final SynchronizeSessionResponse initialSyncResponse;

    public FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow(FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, SynchronizeSessionResponse synchronizeSessionResponse, ElementsSessionContext elementsSessionContext) {
        financialConnectionsSheetConfiguration.getClass();
        this.flowType = financialConnectionsSheetFlowType;
        this.configuration = financialConnectionsSheetConfiguration;
        this.initialSyncResponse = synchronizeSessionResponse;
        this.elementsSessionContext = elementsSessionContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow)) {
            return false;
        }
        FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow financialConnectionsSheetViewEffect$OpenNativeAuthFlow = (FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow) obj;
        return this.flowType == financialConnectionsSheetViewEffect$OpenNativeAuthFlow.flowType && Intrinsics.areEqual(this.configuration, financialConnectionsSheetViewEffect$OpenNativeAuthFlow.configuration) && this.initialSyncResponse.equals(financialConnectionsSheetViewEffect$OpenNativeAuthFlow.initialSyncResponse) && Intrinsics.areEqual(this.elementsSessionContext, financialConnectionsSheetViewEffect$OpenNativeAuthFlow.elementsSessionContext);
    }

    public final int hashCode() {
        int hashCode = (this.initialSyncResponse.hashCode() + ((this.configuration.hashCode() + (this.flowType.hashCode() * 31)) * 31)) * 31;
        ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
        return hashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
    }

    public final String toString() {
        return "OpenNativeAuthFlow(flowType=" + this.flowType + ", configuration=" + this.configuration + ", initialSyncResponse=" + this.initialSyncResponse + ", elementsSessionContext=" + this.elementsSessionContext + ")";
    }
}
