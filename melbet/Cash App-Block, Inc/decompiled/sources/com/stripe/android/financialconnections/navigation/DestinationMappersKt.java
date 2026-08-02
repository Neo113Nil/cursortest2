package com.stripe.android.financialconnections.navigation;

import androidx.navigation.NavDestination;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class DestinationMappersKt {
    public static final Map paneToDestination = MapsKt__MapsKt.mapOf(new Pair(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, Destination.InstitutionPicker.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.CONSENT, Destination.Consent.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, Destination.PartnerAuth.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER, Destination.PartnerAuthDrawer.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER, Destination.AccountPicker.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.SUCCESS, Destination.Success.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY, Destination.ManualEntry.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT, Destination.AttachLinkedPaymentAccount.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE, Destination.NetworkingLinkSignup.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, Destination.LinkLogin.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP, Destination.NetworkingLinkLoginWarmup.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION, Destination.NetworkingLinkVerification.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION, Destination.NetworkingSaveToLinkVerification.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER, Destination.LinkAccountPicker.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.RESET, Destination.Reset.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR, Destination.Error.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.EXIT, Destination.Exit.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR, Destination.BankAuthRepair.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS, Destination.ManualEntrySuccess.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.NOTICE, Destination.Notice.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED, Destination.AccountUpdateRequired.INSTANCE), new Pair(FinancialConnectionsSessionManifest.Pane.ID_CONSENT_CONTENT, Destination.IDConsentContent.INSTANCE));

    public static final Destination getDestination(FinancialConnectionsSessionManifest.Pane pane) {
        pane.getClass();
        Destination destination = (Destination) paneToDestination.get(pane);
        if (destination != null) {
            return destination;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) pane, "No corresponding destination for ");
        return null;
    }

    public static final FinancialConnectionsSessionManifest.Pane getPane(NavDestination navDestination) {
        Object obj;
        FinancialConnectionsSessionManifest.Pane pane;
        navDestination.getClass();
        Iterator it = paneToDestination.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Destination) ((Map.Entry) obj).getValue()).getFullRoute(), navDestination.impl.route)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && (pane = (FinancialConnectionsSessionManifest.Pane) entry.getKey()) != null) {
            return pane;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) navDestination, "No corresponding destination for ");
        return null;
    }
}
