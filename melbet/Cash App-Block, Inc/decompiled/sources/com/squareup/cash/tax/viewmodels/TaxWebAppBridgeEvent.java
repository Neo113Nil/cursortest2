package com.squareup.cash.tax.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.primitives.TaxToolbarConfig;
import com.squareup.cash.tax.viewmodels.interfaces.CloseKeyboard;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TaxWebAppBridgeEvent {

    public final class FinishCashAppTaxes implements TaxWebAppBridgeEvent {
        public static final FinishCashAppTaxes INSTANCE = new FinishCashAppTaxes();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FinishCashAppTaxes);
        }

        public final int hashCode() {
            return 1352332105;
        }

        public final String toString() {
            return "FinishCashAppTaxes";
        }
    }

    public final class FinishedPageLoad implements TaxWebAppBridgeEvent {
        public static final FinishedPageLoad INSTANCE = new FinishedPageLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FinishedPageLoad);
        }

        public final int hashCode() {
            return -462385102;
        }

        public final String toString() {
            return "FinishedPageLoad";
        }
    }

    public final class NewPageLoad implements TaxWebAppBridgeEvent {
        public static final NewPageLoad INSTANCE = new NewPageLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewPageLoad);
        }

        public final int hashCode() {
            return 529259882;
        }

        public final String toString() {
            return "NewPageLoad";
        }
    }

    public final class OpenExternalUrl implements PresenterHandledTaxWebAppBridgeEvent {
        public final String url;

        public OpenExternalUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenExternalUrl) && Intrinsics.areEqual(this.url, ((OpenExternalUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenExternalUrl(url=", this.url, ")");
        }
    }

    /* loaded from: classes9.dex */
    public final class OpenNativeDeepLink implements PresenterHandledTaxWebAppBridgeEvent, CloseKeyboard {
        public final WebViewState currentWebViewState;
        public final String deepLinkUrl;
        public final boolean doNotRoute;
        public final String eventId;

        public OpenNativeDeepLink(String str, String str2, boolean z, WebViewState webViewState) {
            str.getClass();
            this.eventId = str;
            this.deepLinkUrl = str2;
            this.doNotRoute = z;
            this.currentWebViewState = webViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenNativeDeepLink)) {
                return false;
            }
            OpenNativeDeepLink openNativeDeepLink = (OpenNativeDeepLink) obj;
            return Intrinsics.areEqual(this.eventId, openNativeDeepLink.eventId) && Intrinsics.areEqual(this.deepLinkUrl, openNativeDeepLink.deepLinkUrl) && this.doNotRoute == openNativeDeepLink.doNotRoute && this.currentWebViewState.equals(openNativeDeepLink.currentWebViewState);
        }

        public final int hashCode() {
            int hashCode = this.eventId.hashCode() * 31;
            String str = this.deepLinkUrl;
            return this.currentWebViewState.currentUrl.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.doNotRoute);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenNativeDeepLink(eventId=", this.eventId, ", deepLinkUrl=", this.deepLinkUrl, ", doNotRoute=");
            m.append(this.doNotRoute);
            m.append(", currentWebViewState=");
            m.append(this.currentWebViewState);
            m.append(")");
            return m.toString();
        }
    }

    public final class OpenTaxDialog implements PresenterHandledTaxWebAppBridgeEvent, CloseKeyboard {
        public final TaxDialogDataModel taxDialogModel;

        public OpenTaxDialog(TaxDialogDataModel taxDialogDataModel) {
            this.taxDialogModel = taxDialogDataModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTaxDialog) && this.taxDialogModel.equals(((OpenTaxDialog) obj).taxDialogModel);
        }

        public final int hashCode() {
            return this.taxDialogModel.hashCode();
        }

        public final String toString() {
            return "OpenTaxDialog(taxDialogModel=" + this.taxDialogModel + ")";
        }
    }

    public final class OpenTaxMenuSheet implements PresenterHandledTaxWebAppBridgeEvent, CloseKeyboard {
        public final List taxMenuItems;

        public OpenTaxMenuSheet(List list) {
            list.getClass();
            this.taxMenuItems = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTaxMenuSheet) && Intrinsics.areEqual(this.taxMenuItems, ((OpenTaxMenuSheet) obj).taxMenuItems);
        }

        public final int hashCode() {
            return this.taxMenuItems.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("OpenTaxMenuSheet(taxMenuItems=", ")", this.taxMenuItems);
        }
    }

    public final class OpenTaxesFlowLoadingScreen implements PresenterHandledTaxWebAppBridgeEvent, CloseKeyboard {
        public final String deepLinkUrl;

        public OpenTaxesFlowLoadingScreen(String str) {
            this.deepLinkUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTaxesFlowLoadingScreen) && Intrinsics.areEqual(this.deepLinkUrl, ((OpenTaxesFlowLoadingScreen) obj).deepLinkUrl);
        }

        public final int hashCode() {
            String str = this.deepLinkUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenTaxesFlowLoadingScreen(deepLinkUrl=", this.deepLinkUrl, ")");
        }
    }

    public interface PresenterHandledTaxWebAppBridgeEvent extends TaxWebAppBridgeEvent {
    }

    public final class ToolbarUpdate implements TaxWebAppBridgeEvent {
        public final TaxToolbarConfig toolbarConfig;

        public ToolbarUpdate(TaxToolbarConfig taxToolbarConfig) {
            taxToolbarConfig.getClass();
            this.toolbarConfig = taxToolbarConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToolbarUpdate) && Intrinsics.areEqual(this.toolbarConfig, ((ToolbarUpdate) obj).toolbarConfig);
        }

        public final int hashCode() {
            return this.toolbarConfig.hashCode();
        }

        public final String toString() {
            return "ToolbarUpdate(toolbarConfig=" + this.toolbarConfig + ")";
        }
    }
}
