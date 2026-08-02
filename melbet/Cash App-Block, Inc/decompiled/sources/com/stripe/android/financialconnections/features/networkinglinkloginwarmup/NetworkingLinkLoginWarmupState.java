package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.model.LinkBrand;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NetworkingLinkLoginWarmupState {
    public final Async continueAsync;
    public final Async disableNetworkingAsync;
    public final boolean isInstantDebits;
    public final LinkBrand linkBrand;
    public final String nextPaneOnDisableNetworking;
    public final Async payload;
    public final FinancialConnectionsSessionManifest.Pane referrer;

    public final class Payload {
        public final String email;
        public final String merchantName;
        public final String redactedEmail;
        public final String sessionId;
        public final boolean verifiedFlow;

        public Payload(String str, String str2, String str3, String str4, boolean z) {
            str4.getClass();
            this.merchantName = str;
            this.email = str2;
            this.redactedEmail = str3;
            this.verifiedFlow = z;
            this.sessionId = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.areEqual(this.merchantName, payload.merchantName) && this.email.equals(payload.email) && this.redactedEmail.equals(payload.redactedEmail) && this.verifiedFlow == payload.verifiedFlow && Intrinsics.areEqual(this.sessionId, payload.sessionId);
        }

        public final int hashCode() {
            String str = this.merchantName;
            return this.sessionId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.email), 31, this.redactedEmail), 31, this.verifiedFlow);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Payload(merchantName=", this.merchantName, ", email=", this.email, ", redactedEmail=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.redactedEmail, ", verifiedFlow=", this.verifiedFlow, ", sessionId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.sessionId, ")");
        }
    }

    public NetworkingLinkLoginWarmupState(FinancialConnectionsSessionManifest.Pane pane, String str, Async async, Async async2, Async async3, boolean z, LinkBrand linkBrand) {
        async.getClass();
        async2.getClass();
        async3.getClass();
        linkBrand.getClass();
        this.referrer = pane;
        this.nextPaneOnDisableNetworking = str;
        this.payload = async;
        this.disableNetworkingAsync = async2;
        this.continueAsync = async3;
        this.isInstantDebits = z;
        this.linkBrand = linkBrand;
    }

    public static NetworkingLinkLoginWarmupState copy$default(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, Async async, Async async2, Async async3, int i) {
        FinancialConnectionsSessionManifest.Pane pane = networkingLinkLoginWarmupState.referrer;
        String str = networkingLinkLoginWarmupState.nextPaneOnDisableNetworking;
        networkingLinkLoginWarmupState.getClass();
        if ((i & 8) != 0) {
            async = networkingLinkLoginWarmupState.payload;
        }
        Async async4 = async;
        if ((i & 16) != 0) {
            async2 = networkingLinkLoginWarmupState.disableNetworkingAsync;
        }
        Async async5 = async2;
        if ((i & 32) != 0) {
            async3 = networkingLinkLoginWarmupState.continueAsync;
        }
        Async async6 = async3;
        boolean z = networkingLinkLoginWarmupState.isInstantDebits;
        LinkBrand linkBrand = networkingLinkLoginWarmupState.linkBrand;
        networkingLinkLoginWarmupState.getClass();
        async4.getClass();
        async5.getClass();
        async6.getClass();
        linkBrand.getClass();
        return new NetworkingLinkLoginWarmupState(pane, str, async4, async5, async6, z, linkBrand);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkingLinkLoginWarmupState)) {
            return false;
        }
        NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState = (NetworkingLinkLoginWarmupState) obj;
        return this.referrer == networkingLinkLoginWarmupState.referrer && Intrinsics.areEqual(this.nextPaneOnDisableNetworking, networkingLinkLoginWarmupState.nextPaneOnDisableNetworking) && Intrinsics.areEqual(this.payload, networkingLinkLoginWarmupState.payload) && Intrinsics.areEqual(this.disableNetworkingAsync, networkingLinkLoginWarmupState.disableNetworkingAsync) && Intrinsics.areEqual(this.continueAsync, networkingLinkLoginWarmupState.continueAsync) && this.isInstantDebits == networkingLinkLoginWarmupState.isInstantDebits && this.linkBrand == networkingLinkLoginWarmupState.linkBrand;
    }

    public final int hashCode() {
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        int hashCode = (pane == null ? 0 : pane.hashCode()) * 31;
        String str = this.nextPaneOnDisableNetworking;
        return this.linkBrand.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.continueAsync.hashCode() + ((this.disableNetworkingAsync.hashCode() + ((this.payload.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 961)) * 31)) * 31)) * 31, 31, this.isInstantDebits);
    }

    public final String toString() {
        return "NetworkingLinkLoginWarmupState(referrer=" + this.referrer + ", nextPaneOnDisableNetworking=" + this.nextPaneOnDisableNetworking + ", consumerEmail=null, payload=" + this.payload + ", disableNetworkingAsync=" + this.disableNetworkingAsync + ", continueAsync=" + this.continueAsync + ", isInstantDebits=" + this.isInstantDebits + ", linkBrand=" + this.linkBrand + ")";
    }
}
