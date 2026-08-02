package com.stripe.android.financialconnections.presentation;

import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.model.LinkBrand;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetNativeState {
    public final boolean completed;
    public final FinancialConnectionsSheetConfiguration configuration;
    public final ElementsSessionContext elementsSessionContext;
    public final boolean firstInit;
    public final FinancialConnectionsSheetFlowType flowType;
    public final FinancialConnectionsSessionManifest.Pane initialPane;
    public final boolean isLinkWithStripe;
    public final LinkBrand linkBrand;
    public final boolean manualEntryUsesMicrodeposits;
    public final boolean reducedBranding;
    public final boolean testMode;
    public final Theme theme;
    public final FinancialConnectionsSheetNativeViewEffect viewEffect;
    public final WebAuthFlowState webAuthFlow;

    public FinancialConnectionsSheetNativeState(FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType, WebAuthFlowState webAuthFlowState, boolean z, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, boolean z2, boolean z3, FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect, boolean z4, FinancialConnectionsSessionManifest.Pane pane, Theme theme, LinkBrand linkBrand, boolean z5, boolean z6, ElementsSessionContext elementsSessionContext) {
        financialConnectionsSheetFlowType.getClass();
        financialConnectionsSheetConfiguration.getClass();
        pane.getClass();
        theme.getClass();
        linkBrand.getClass();
        this.flowType = financialConnectionsSheetFlowType;
        this.webAuthFlow = webAuthFlowState;
        this.firstInit = z;
        this.configuration = financialConnectionsSheetConfiguration;
        this.reducedBranding = z2;
        this.testMode = z3;
        this.viewEffect = financialConnectionsSheetNativeViewEffect;
        this.completed = z4;
        this.initialPane = pane;
        this.theme = theme;
        this.linkBrand = linkBrand;
        this.isLinkWithStripe = z5;
        this.manualEntryUsesMicrodeposits = z6;
        this.elementsSessionContext = elementsSessionContext;
    }

    public static FinancialConnectionsSheetNativeState copy$default(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, WebAuthFlowState webAuthFlowState, FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect, LinkBrand linkBrand, int i) {
        FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType = financialConnectionsSheetNativeState.flowType;
        WebAuthFlowState webAuthFlowState2 = (i & 2) != 0 ? financialConnectionsSheetNativeState.webAuthFlow : webAuthFlowState;
        boolean z = (i & 4) != 0 ? financialConnectionsSheetNativeState.firstInit : false;
        FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = financialConnectionsSheetNativeState.configuration;
        WebAuthFlowState webAuthFlowState3 = webAuthFlowState2;
        boolean z2 = z;
        boolean z3 = financialConnectionsSheetNativeState.reducedBranding;
        boolean z4 = financialConnectionsSheetNativeState.testMode;
        FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect2 = (i & 64) != 0 ? financialConnectionsSheetNativeState.viewEffect : financialConnectionsSheetNativeViewEffect;
        boolean z5 = (i & 128) != 0 ? financialConnectionsSheetNativeState.completed : true;
        FinancialConnectionsSessionManifest.Pane pane = financialConnectionsSheetNativeState.initialPane;
        FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect3 = financialConnectionsSheetNativeViewEffect2;
        boolean z6 = z5;
        Theme theme = financialConnectionsSheetNativeState.theme;
        LinkBrand linkBrand2 = (i & 1024) != 0 ? financialConnectionsSheetNativeState.linkBrand : linkBrand;
        boolean z7 = financialConnectionsSheetNativeState.isLinkWithStripe;
        boolean z8 = financialConnectionsSheetNativeState.manualEntryUsesMicrodeposits;
        ElementsSessionContext elementsSessionContext = financialConnectionsSheetNativeState.elementsSessionContext;
        financialConnectionsSheetNativeState.getClass();
        financialConnectionsSheetFlowType.getClass();
        financialConnectionsSheetConfiguration.getClass();
        pane.getClass();
        theme.getClass();
        linkBrand2.getClass();
        return new FinancialConnectionsSheetNativeState(financialConnectionsSheetFlowType, webAuthFlowState3, z2, financialConnectionsSheetConfiguration, z3, z4, financialConnectionsSheetNativeViewEffect3, z6, pane, theme, linkBrand2, z7, z8, elementsSessionContext);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSheetNativeState)) {
            return false;
        }
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) obj;
        return this.flowType == financialConnectionsSheetNativeState.flowType && this.webAuthFlow.equals(financialConnectionsSheetNativeState.webAuthFlow) && this.firstInit == financialConnectionsSheetNativeState.firstInit && Intrinsics.areEqual(this.configuration, financialConnectionsSheetNativeState.configuration) && this.reducedBranding == financialConnectionsSheetNativeState.reducedBranding && this.testMode == financialConnectionsSheetNativeState.testMode && Intrinsics.areEqual(this.viewEffect, financialConnectionsSheetNativeState.viewEffect) && this.completed == financialConnectionsSheetNativeState.completed && this.initialPane == financialConnectionsSheetNativeState.initialPane && this.theme == financialConnectionsSheetNativeState.theme && this.linkBrand == financialConnectionsSheetNativeState.linkBrand && this.isLinkWithStripe == financialConnectionsSheetNativeState.isLinkWithStripe && this.manualEntryUsesMicrodeposits == financialConnectionsSheetNativeState.manualEntryUsesMicrodeposits && Intrinsics.areEqual(this.elementsSessionContext, financialConnectionsSheetNativeState.elementsSessionContext);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.configuration.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.webAuthFlow.hashCode() + (this.flowType.hashCode() * 31)) * 31, 31, this.firstInit)) * 31, 31, this.reducedBranding), 31, this.testMode);
        FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect = this.viewEffect;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.linkBrand.hashCode() + ((this.theme.hashCode() + ((this.initialPane.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (financialConnectionsSheetNativeViewEffect == null ? 0 : financialConnectionsSheetNativeViewEffect.hashCode())) * 31, 31, this.completed)) * 31)) * 31)) * 31, 31, this.isLinkWithStripe), 31, this.manualEntryUsesMicrodeposits);
        ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
        return m2 + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinancialConnectionsSheetNativeState(flowType=");
        sb.append(this.flowType);
        sb.append(", webAuthFlow=");
        sb.append(this.webAuthFlow);
        sb.append(", firstInit=");
        sb.append(this.firstInit);
        sb.append(", configuration=");
        sb.append(this.configuration);
        sb.append(", reducedBranding=");
        re$$ExternalSyntheticOutline0.m(sb, this.reducedBranding, ", testMode=", this.testMode, ", viewEffect=");
        sb.append(this.viewEffect);
        sb.append(", completed=");
        sb.append(this.completed);
        sb.append(", initialPane=");
        sb.append(this.initialPane);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", linkBrand=");
        sb.append(this.linkBrand);
        sb.append(", isLinkWithStripe=");
        sb.append(this.isLinkWithStripe);
        sb.append(", manualEntryUsesMicrodeposits=");
        sb.append(this.manualEntryUsesMicrodeposits);
        sb.append(", elementsSessionContext=");
        sb.append(this.elementsSessionContext);
        sb.append(")");
        return sb.toString();
    }
}
