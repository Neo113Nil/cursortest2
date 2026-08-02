package com.stripe.android.financialconnections.model;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class NetworkedAccountsList {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final Boolean acquireConsentOnPrimaryCtaClick;
    public final List data;
    public final Display display;
    public final FinancialConnectionsSessionManifest.Pane nextPaneOnAddAccount;
    public final Map partnerToCoreAuths;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/NetworkedAccountsList$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return NetworkedAccountsList$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(7)), null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(8)), null};
    }

    public /* synthetic */ NetworkedAccountsList(int i, List list, Display display, FinancialConnectionsSessionManifest.Pane pane, Map map, Boolean bool) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, NetworkedAccountsList$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.data = list;
        if ((i & 2) == 0) {
            this.display = null;
        } else {
            this.display = display;
        }
        if ((i & 4) == 0) {
            this.nextPaneOnAddAccount = null;
        } else {
            this.nextPaneOnAddAccount = pane;
        }
        if ((i & 8) == 0) {
            this.partnerToCoreAuths = null;
        } else {
            this.partnerToCoreAuths = map;
        }
        if ((i & 16) == 0) {
            this.acquireConsentOnPrimaryCtaClick = Boolean.FALSE;
        } else {
            this.acquireConsentOnPrimaryCtaClick = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkedAccountsList)) {
            return false;
        }
        NetworkedAccountsList networkedAccountsList = (NetworkedAccountsList) obj;
        return Intrinsics.areEqual(this.data, networkedAccountsList.data) && Intrinsics.areEqual(this.display, networkedAccountsList.display) && this.nextPaneOnAddAccount == networkedAccountsList.nextPaneOnAddAccount && Intrinsics.areEqual(this.partnerToCoreAuths, networkedAccountsList.partnerToCoreAuths) && Intrinsics.areEqual(this.acquireConsentOnPrimaryCtaClick, networkedAccountsList.acquireConsentOnPrimaryCtaClick);
    }

    public final int hashCode() {
        int hashCode = this.data.hashCode() * 31;
        Display display = this.display;
        int hashCode2 = (hashCode + (display == null ? 0 : display.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnAddAccount;
        int hashCode3 = (hashCode2 + (pane == null ? 0 : pane.hashCode())) * 31;
        Map map = this.partnerToCoreAuths;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.acquireConsentOnPrimaryCtaClick;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkedAccountsList(data=");
        sb.append(this.data);
        sb.append(", display=");
        sb.append(this.display);
        sb.append(", nextPaneOnAddAccount=");
        sb.append(this.nextPaneOnAddAccount);
        sb.append(", partnerToCoreAuths=");
        sb.append(this.partnerToCoreAuths);
        sb.append(", acquireConsentOnPrimaryCtaClick=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.acquireConsentOnPrimaryCtaClick, ")");
    }
}
