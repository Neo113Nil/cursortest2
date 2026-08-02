package com.stripe.android.financialconnections.analytics;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.trace.core.util.JsonObjectUtils;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.attestation.AttestationError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class FinancialConnectionsAnalyticsEvent {
    public final String eventName;
    public final boolean includePrefix;
    public final String name;
    public final Map params;

    public enum AttestationEndpoint {
        LOOKUP("consumer_session_lookup"),
        SIGNUP("link_sign_up");

        public final String analyticsValue;

        AttestationEndpoint(String str) {
            this.analyticsValue = str;
        }
    }

    public final class ConsentAgree extends FinancialConnectionsAnalyticsEvent {
        public static final ConsentAgree INSTANCE = new ConsentAgree(Thread$State$EnumUnboxingLocalUtility.m("pane", FinancialConnectionsSessionManifest.Pane.CONSENT.getValue()), "click.agree", true);

        @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConsentAgree);
        }

        @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent
        public final int hashCode() {
            return 772248265;
        }

        @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent
        public final String toString() {
            return "ConsentAgree";
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Pane.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FinancialConnectionsAnalyticsEvent(Map map, String str, boolean z) {
        this.name = str;
        this.params = map;
        this.includePrefix = z;
        this.eventName = z ? "linked_accounts.".concat(str) : str;
    }

    public static String getAnalyticsValue$financial_connections_release(FinancialConnectionsSessionManifest.Pane pane) {
        pane.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[pane.ordinal()];
        return (i == 1 || i == 2) ? FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.getValue() : pane.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent = (FinancialConnectionsAnalyticsEvent) obj;
        return Intrinsics.areEqual(this.name, financialConnectionsAnalyticsEvent.name) && Intrinsics.areEqual(this.params, financialConnectionsAnalyticsEvent.params) && this.includePrefix == financialConnectionsAnalyticsEvent.includePrefix && Intrinsics.areEqual(this.eventName, financialConnectionsAnalyticsEvent.eventName);
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Map map = this.params;
        return this.eventName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (map != null ? map.hashCode() : 0)) * 31, 31, this.includePrefix);
    }

    public String toString() {
        return "FinancialConnectionsEvent(name='" + this.name + "', params=" + this.params + ")";
    }

    public final class SearchScroll extends FinancialConnectionsAnalyticsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchScroll(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsAnalyticsEvent$VerificationError$Error financialConnectionsAnalyticsEvent$VerificationError$Error) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair(BreadcrumbHelper.Category.ERROR, financialConnectionsAnalyticsEvent$VerificationError$Error.value))), "networking.verification.error", true);
            pane.getClass();
            ConsentAgree.INSTANCE.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchScroll(FinancialConnectionsSessionManifest.Pane pane) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "networking.verification.success", true);
            pane.getClass();
            ConsentAgree.INSTANCE.getClass();
        }
    }

    public final class Click extends FinancialConnectionsAnalyticsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(FinancialConnectionsSessionManifest.Pane pane, Set set, boolean z, int i) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("account_ids", CollectionsKt.joinToString$default(set, " ", null, null, 0, null, null, 62)), new Pair("is_single_account", String.valueOf(z)))), "account_picker.accounts_auto_selected", true);
            pane.getClass();
            set.getClass();
            switch (i) {
                case 3:
                    ConsentAgree.INSTANCE.getClass();
                    super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("account_ids", CollectionsKt.joinToString$default(set, " ", null, null, 0, null, null, 62)), new Pair("is_skip_account_selection", String.valueOf(z)))), "account_picker.accounts_submitted", true);
                    break;
                default:
                    ConsentAgree.INSTANCE.getClass();
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(String str, FinancialConnectionsSessionManifest.Pane pane) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), str, true);
            pane.getClass();
            ConsentAgree.INSTANCE.getClass();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Click(FinancialConnectionsSessionManifest.Pane pane, boolean z, boolean z2, String str) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("is_single_account", String.valueOf(z2)), new Pair("account", str))), r4, true);
            String str2;
            pane.getClass();
            str.getClass();
            if (z) {
                str2 = "click.account_picker.account_selected";
            } else {
                str2 = "click.account_picker.account_unselected";
            }
            ConsentAgree.INSTANCE.getClass();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Click(FinancialConnectionsSessionManifest.Pane pane, Throwable th, String str, Integer num, String str2) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.plus(r4, r5)), "complete", true);
            Map map;
            pane.getClass();
            ConsentAgree.INSTANCE.getClass();
            Map mapOf = MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("num_linked_accounts", num != null ? String.valueOf(num.intValue()) : null), new Pair("type", th == null ? "object" : BreadcrumbHelper.Category.ERROR), new Pair("status", str2));
            if (th != null) {
                map = JsonObjectUtils.toEventParams(str, th);
            } else {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(FinancialConnectionsSessionManifest.Pane pane, int i) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "click.done", true);
            pane.getClass();
            switch (i) {
                case 13:
                    ConsentAgree.INSTANCE.getClass();
                    super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "click.data_access.learn_more", true);
                    break;
                case 16:
                    ConsentAgree.INSTANCE.getClass();
                    super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "click.nav_bar.close", true);
                    break;
                case 25:
                    ConsentAgree.INSTANCE.getClass();
                    super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "pane.loaded", true);
                    break;
                default:
                    ConsentAgree.INSTANCE.getClass();
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(FinancialConnectionsSessionManifest.Pane pane, String str, String str2, String str3) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("status", str2), new Pair("url", str), new Pair("auth_session_id", str3 == null ? "" : str3))), "auth_session.url_received", true);
            pane.getClass();
            str.getClass();
            ConsentAgree.INSTANCE.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(FinancialConnectionsSessionManifest.Pane pane, Throwable th) {
            super(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("error_reason", th instanceof AttestationError ? ((AttestationError) th).errorType.name() : "unknown"))), "attestation.init_failed", true);
            pane.getClass();
            ConsentAgree.INSTANCE.getClass();
        }
    }
}
