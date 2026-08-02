package com.stripe.android.financialconnections.features.linkaccountpicker;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LinkAccountPickerState {
    public final Async payload;
    public final Async selectNetworkedAccountAsync;
    public final LinkAccountPickerState$ViewEffect$OpenUrl viewEffect;

    public final class Payload {
        public final String aboveCta;
        public final List accounts;
        public final boolean acquireConsentOnPrimaryCtaClick;
        public final AddNewAccount addNewAccount;
        public final String consumerSessionClientSecret;
        public final String defaultCta;
        public final DataAccessNotice defaultDataAccessNotice;
        public final DataAccessNotice multipleAccountTypesSelectedDataAccessNotice;
        public final FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount;
        public final Map partnerToCoreAuths;
        public final List selectedAccountIds;
        public final boolean singleAccount;
        public final String title;

        public Payload(String str, List list, List list2, AddNewAccount addNewAccount, String str2, String str3, FinancialConnectionsSessionManifest.Pane pane, Map map, boolean z, DataAccessNotice dataAccessNotice, String str4, DataAccessNotice dataAccessNotice2, boolean z2) {
            str.getClass();
            list2.getClass();
            addNewAccount.getClass();
            str2.getClass();
            str3.getClass();
            this.title = str;
            this.accounts = list;
            this.selectedAccountIds = list2;
            this.addNewAccount = addNewAccount;
            this.consumerSessionClientSecret = str2;
            this.defaultCta = str3;
            this.nextPaneOnNewAccount = pane;
            this.partnerToCoreAuths = map;
            this.singleAccount = z;
            this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
            this.aboveCta = str4;
            this.defaultDataAccessNotice = dataAccessNotice2;
            this.acquireConsentOnPrimaryCtaClick = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.areEqual(this.title, payload.title) && this.accounts.equals(payload.accounts) && Intrinsics.areEqual(this.selectedAccountIds, payload.selectedAccountIds) && Intrinsics.areEqual(this.addNewAccount, payload.addNewAccount) && Intrinsics.areEqual(this.consumerSessionClientSecret, payload.consumerSessionClientSecret) && Intrinsics.areEqual(this.defaultCta, payload.defaultCta) && this.nextPaneOnNewAccount == payload.nextPaneOnNewAccount && Intrinsics.areEqual(this.partnerToCoreAuths, payload.partnerToCoreAuths) && this.singleAccount == payload.singleAccount && Intrinsics.areEqual(this.multipleAccountTypesSelectedDataAccessNotice, payload.multipleAccountTypesSelectedDataAccessNotice) && Intrinsics.areEqual(this.aboveCta, payload.aboveCta) && Intrinsics.areEqual(this.defaultDataAccessNotice, payload.defaultDataAccessNotice) && this.acquireConsentOnPrimaryCtaClick == payload.acquireConsentOnPrimaryCtaClick;
        }

        public final ArrayList getSelectedAccounts() {
            List list = this.accounts;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.selectedAccountIds.contains(((LinkedAccount) obj).account.id)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.addNewAccount.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.accounts), 31, this.selectedAccountIds)) * 31, 31, this.consumerSessionClientSecret), 31, this.defaultCta);
            FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnNewAccount;
            int hashCode = (m + (pane == null ? 0 : pane.hashCode())) * 31;
            Map map = this.partnerToCoreAuths;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.singleAccount);
            DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
            int hashCode2 = (m2 + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31;
            String str = this.aboveCta;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            DataAccessNotice dataAccessNotice2 = this.defaultDataAccessNotice;
            return Boolean.hashCode(this.acquireConsentOnPrimaryCtaClick) + ((hashCode3 + (dataAccessNotice2 != null ? dataAccessNotice2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Payload(title=", this.title, ", accounts=", ", selectedAccountIds=", this.accounts);
            m.append(this.selectedAccountIds);
            m.append(", addNewAccount=");
            m.append(this.addNewAccount);
            m.append(", consumerSessionClientSecret=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.consumerSessionClientSecret, ", defaultCta=", this.defaultCta, ", nextPaneOnNewAccount=");
            m.append(this.nextPaneOnNewAccount);
            m.append(", partnerToCoreAuths=");
            m.append(this.partnerToCoreAuths);
            m.append(", singleAccount=");
            m.append(this.singleAccount);
            m.append(", multipleAccountTypesSelectedDataAccessNotice=");
            m.append(this.multipleAccountTypesSelectedDataAccessNotice);
            m.append(", aboveCta=");
            m.append(this.aboveCta);
            m.append(", defaultDataAccessNotice=");
            m.append(this.defaultDataAccessNotice);
            m.append(", acquireConsentOnPrimaryCtaClick=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.acquireConsentOnPrimaryCtaClick, ")");
        }
    }

    public LinkAccountPickerState(Async async, Async async2, LinkAccountPickerState$ViewEffect$OpenUrl linkAccountPickerState$ViewEffect$OpenUrl) {
        async.getClass();
        async2.getClass();
        this.payload = async;
        this.selectNetworkedAccountAsync = async2;
        this.viewEffect = linkAccountPickerState$ViewEffect$OpenUrl;
    }

    public static LinkAccountPickerState copy$default(LinkAccountPickerState linkAccountPickerState, Async async, Async async2, LinkAccountPickerState$ViewEffect$OpenUrl linkAccountPickerState$ViewEffect$OpenUrl, int i) {
        if ((i & 1) != 0) {
            async = linkAccountPickerState.payload;
        }
        if ((i & 2) != 0) {
            async2 = linkAccountPickerState.selectNetworkedAccountAsync;
        }
        if ((i & 4) != 0) {
            linkAccountPickerState$ViewEffect$OpenUrl = linkAccountPickerState.viewEffect;
        }
        linkAccountPickerState.getClass();
        async.getClass();
        async2.getClass();
        return new LinkAccountPickerState(async, async2, linkAccountPickerState$ViewEffect$OpenUrl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkAccountPickerState)) {
            return false;
        }
        LinkAccountPickerState linkAccountPickerState = (LinkAccountPickerState) obj;
        return Intrinsics.areEqual(this.payload, linkAccountPickerState.payload) && Intrinsics.areEqual(this.selectNetworkedAccountAsync, linkAccountPickerState.selectNetworkedAccountAsync) && Intrinsics.areEqual(this.viewEffect, linkAccountPickerState.viewEffect);
    }

    public final int hashCode() {
        int hashCode = (this.selectNetworkedAccountAsync.hashCode() + (this.payload.hashCode() * 31)) * 31;
        LinkAccountPickerState$ViewEffect$OpenUrl linkAccountPickerState$ViewEffect$OpenUrl = this.viewEffect;
        return hashCode + (linkAccountPickerState$ViewEffect$OpenUrl == null ? 0 : linkAccountPickerState$ViewEffect$OpenUrl.hashCode());
    }

    public final String toString() {
        return "LinkAccountPickerState(payload=" + this.payload + ", selectNetworkedAccountAsync=" + this.selectNetworkedAccountAsync + ", viewEffect=" + this.viewEffect + ")";
    }
}
