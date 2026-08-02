package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes8.dex */
public final class ShareNetworkedAccountsResponse {
    public static final Companion Companion = new Companion();
    public final Display display;
    public final FinancialConnectionsSessionManifest.Pane nextPane;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ShareNetworkedAccountsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareNetworkedAccountsResponse(int i, FinancialConnectionsSessionManifest.Pane pane, Display display) {
        if ((i & 1) == 0) {
            this.nextPane = null;
        } else {
            this.nextPane = pane;
        }
        if ((i & 2) == 0) {
            this.display = null;
        } else {
            this.display = display;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareNetworkedAccountsResponse)) {
            return false;
        }
        ShareNetworkedAccountsResponse shareNetworkedAccountsResponse = (ShareNetworkedAccountsResponse) obj;
        return this.nextPane == shareNetworkedAccountsResponse.nextPane && Intrinsics.areEqual(this.display, shareNetworkedAccountsResponse.display);
    }

    public final int hashCode() {
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        int hashCode = (pane == null ? 0 : pane.hashCode()) * 31;
        Display display = this.display;
        return hashCode + (display != null ? display.hashCode() : 0);
    }

    public final String toString() {
        return "ShareNetworkedAccountsResponse(nextPane=" + this.nextPane + ", display=" + this.display + ")";
    }
}
