package com.stripe.android.financialconnections.navigation;

import androidx.appcompat.widget.TintInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavType;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes8.dex */
public abstract class Destination {
    public final ArrayList arguments;
    public final Function3 composable;
    public final Lazy fullRoute$delegate;
    public final boolean logPaneLaunched;
    public final String route;

    public final class AccountPicker extends Destination {
        public static final AccountPicker INSTANCE = new AccountPicker(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER.getValue(), true, DestinationKt.f819lambda$610989204);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AccountPicker);
        }

        public final int hashCode() {
            return -1299547952;
        }

        public final String toString() {
            return "AccountPicker";
        }
    }

    public final class AccountUpdateRequired extends Destination {
        public static final AccountUpdateRequired INSTANCE = new AccountUpdateRequired(FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED.getValue(), false, DestinationKt.f818lambda$513144654);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AccountUpdateRequired);
        }

        public final int hashCode() {
            return -283574838;
        }

        public final String toString() {
            return "AccountUpdateRequired";
        }
    }

    public final class AttachLinkedPaymentAccount extends Destination {
        public static final AttachLinkedPaymentAccount INSTANCE = new AttachLinkedPaymentAccount(FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT.getValue(), true, DestinationKt.f815lambda$258743460);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AttachLinkedPaymentAccount);
        }

        public final int hashCode() {
            return -1220396016;
        }

        public final String toString() {
            return "AttachLinkedPaymentAccount";
        }
    }

    public final class BankAuthRepair extends Destination {
        public static final BankAuthRepair INSTANCE = new BankAuthRepair(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR.getValue(), true, DestinationKt.lambda$1251583312);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BankAuthRepair);
        }

        public final int hashCode() {
            return -501991012;
        }

        public final String toString() {
            return "BankAuthRepair";
        }
    }

    public final class Consent extends Destination {
        public static final Consent INSTANCE = new Consent(FinancialConnectionsSessionManifest.Pane.CONSENT.getValue(), true, DestinationKt.lambda$1970641677);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Consent);
        }

        public final int hashCode() {
            return 170523535;
        }

        public final String toString() {
            return "Consent";
        }
    }

    public final class Error extends Destination {
        public static final Error INSTANCE = new Error(FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR.getValue(), false, DestinationKt.lambda$1233481887);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -498440515;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Exit extends Destination {
        public static final Exit INSTANCE = new Exit(FinancialConnectionsSessionManifest.Pane.EXIT.getValue(), false, DestinationKt.f816lambda$361367997);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1124451895;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class IDConsentContent extends Destination {
        public static final IDConsentContent INSTANCE = new IDConsentContent(FinancialConnectionsSessionManifest.Pane.ID_CONSENT_CONTENT.getValue(), true, DestinationKt.f820lambda$734344057);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IDConsentContent);
        }

        public final int hashCode() {
            return -1829603067;
        }

        public final String toString() {
            return "IDConsentContent";
        }
    }

    public final class InstitutionPicker extends Destination {
        public static final InstitutionPicker INSTANCE = new InstitutionPicker(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER.getValue(), true, DestinationKt.lambda$1079878273);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InstitutionPicker);
        }

        public final int hashCode() {
            return -1980129893;
        }

        public final String toString() {
            return "InstitutionPicker";
        }
    }

    public final class LinkAccountPicker extends Destination {
        public static final LinkAccountPicker INSTANCE = new LinkAccountPicker(FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER.getValue(), true, DestinationKt.lambda$1350225286);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkAccountPicker);
        }

        public final int hashCode() {
            return 637099126;
        }

        public final String toString() {
            return "LinkAccountPicker";
        }
    }

    public final class LinkLogin extends Destination {
        public static final LinkLogin INSTANCE = new LinkLogin(FinancialConnectionsSessionManifest.Pane.LINK_LOGIN.getValue(), true, DestinationKt.f812lambda$1533051144);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkLogin);
        }

        public final int hashCode() {
            return -541889084;
        }

        public final String toString() {
            return "LinkLogin";
        }
    }

    public final class ManualEntry extends Destination {
        public static final ManualEntry INSTANCE = new ManualEntry(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY.getValue(), true, DestinationKt.f811lambda$1053306213);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManualEntry);
        }

        public final int hashCode() {
            return 299603265;
        }

        public final String toString() {
            return "ManualEntry";
        }
    }

    public final class ManualEntrySuccess extends Destination {
        public static final ManualEntrySuccess INSTANCE = new ManualEntrySuccess(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS.getValue(), true, DestinationKt.lambda$554929450);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManualEntrySuccess);
        }

        public final int hashCode() {
            return -1795356798;
        }

        public final String toString() {
            return "ManualEntrySuccess";
        }
    }

    public final class NetworkingLinkLoginWarmup extends Destination {
        public static final NetworkingLinkLoginWarmup INSTANCE;

        static {
            String value = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP.getValue();
            TintInfo tintInfo = new TintInfo();
            tintInfo.mTintList = NavType.StringType;
            tintInfo.mHasTintMode = true;
            INSTANCE = new NetworkingLinkLoginWarmup(value, true, CollectionsKt__CollectionsJVMKt.listOf(new NamedNavArgument("next_pane_on_disable_networking", tintInfo.build())), DestinationKt.f814lambda$247343796);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkingLinkLoginWarmup);
        }

        public final int hashCode() {
            return 2003945200;
        }

        public final String toString() {
            return "NetworkingLinkLoginWarmup";
        }
    }

    public final class NetworkingLinkSignup extends Destination {
        public static final NetworkingLinkSignup INSTANCE = new NetworkingLinkSignup(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE.getValue(), true, DestinationKt.lambda$256068251);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkingLinkSignup);
        }

        public final int hashCode() {
            return -498526607;
        }

        public final String toString() {
            return "NetworkingLinkSignup";
        }
    }

    public final class NetworkingLinkVerification extends Destination {
        public static final NetworkingLinkVerification INSTANCE = new NetworkingLinkVerification(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION.getValue(), true, DestinationKt.lambda$528080184);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkingLinkVerification);
        }

        public final int hashCode() {
            return -309046092;
        }

        public final String toString() {
            return "NetworkingLinkVerification";
        }
    }

    public final class NetworkingSaveToLinkVerification extends Destination {
        public static final NetworkingSaveToLinkVerification INSTANCE = new NetworkingSaveToLinkVerification(FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION.getValue(), true, DestinationKt.lambda$1575816320);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkingSaveToLinkVerification);
        }

        public final int hashCode() {
            return -206442900;
        }

        public final String toString() {
            return "NetworkingSaveToLinkVerification";
        }
    }

    public final class Notice extends Destination {
        public static final Notice INSTANCE = new Notice(FinancialConnectionsSessionManifest.Pane.NOTICE.getValue(), false, DestinationKt.f810lambda$1040114807);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Notice);
        }

        public final int hashCode() {
            return 1983158467;
        }

        public final String toString() {
            return "Notice";
        }
    }

    public final class PartnerAuth extends Destination {
        public static final PartnerAuth INSTANCE = new PartnerAuth(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.getValue(), true, DestinationKt.f813lambda$1823417641);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PartnerAuth);
        }

        public final int hashCode() {
            return 1608450949;
        }

        public final String toString() {
            return "PartnerAuth";
        }
    }

    public final class PartnerAuthDrawer extends Destination {
        public static final PartnerAuthDrawer INSTANCE = new PartnerAuthDrawer(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER.getValue(), true, DestinationKt.lambda$1516541222);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PartnerAuthDrawer);
        }

        public final int hashCode() {
            return 1701540054;
        }

        public final String toString() {
            return "PartnerAuthDrawer";
        }
    }

    public final class Reset extends Destination {
        public static final Reset INSTANCE = new Reset(FinancialConnectionsSessionManifest.Pane.RESET.getValue(), true, DestinationKt.f817lambda$404597064);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Reset);
        }

        public final int hashCode() {
            return -486821372;
        }

        public final String toString() {
            return "Reset";
        }
    }

    public final class Success extends Destination {
        public static final Success INSTANCE = new Success(FinancialConnectionsSessionManifest.Pane.SUCCESS.getValue(), true, DestinationKt.lambda$633501636);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 1646820216;
        }

        public final String toString() {
            return "Success";
        }
    }

    public Destination(String str, boolean z, List list, Function3 function3) {
        this.route = str;
        this.logPaneLaunched = z;
        this.composable = function3;
        TintInfo tintInfo = new TintInfo();
        tintInfo.mTintList = NavType.StringType;
        tintInfo.mHasTintMode = true;
        this.arguments = CollectionsKt.plus((Iterable) list, (Collection) CollectionsKt__CollectionsJVMKt.listOf(new NamedNavArgument("referrer", tintInfo.build())));
        this.fullRoute$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 16));
    }

    public static String invoke$default(Destination destination, FinancialConnectionsSessionManifest.Pane pane) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        destination.getClass();
        pane.getClass();
        return DestinationKt.appendParamValues(destination.route, MapsKt__MapsKt.plus(emptyMap, new Pair("referrer", pane.getValue())));
    }

    public final void Composable(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        int i2;
        NavBackStackEntry navBackStackEntry2;
        navBackStackEntry.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1572890450);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        int i4 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            Object[] objArr = new Object[0];
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new ConsumerSession$$ExternalSyntheticLambda0(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                navBackStackEntry2 = navBackStackEntry;
                gapComposer.startReplaceGroup(110251060);
            } else {
                gapComposer.startReplaceGroup(114106251);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(navBackStackEntry) | gapComposer.changedInstance(parentViewModel) | gapComposer.changed(mutableState);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    navBackStackEntry2 = navBackStackEntry;
                    rememberedValue2 = new Logger$_log$2(navBackStackEntry2, parentViewModel, mutableState, null, 19);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    navBackStackEntry2 = navBackStackEntry;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            }
            gapComposer.end(false);
            this.composable.invoke(navBackStackEntry2, gapComposer, Integer.valueOf(i2 & 14));
        } else {
            navBackStackEntry2 = navBackStackEntry;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(this, navBackStackEntry2, i, i4);
        }
    }

    public final String getFullRoute() {
        return (String) this.fullRoute$delegate.getValue();
    }

    public Destination(String str, boolean z, Function3 function3) {
        this(str, z, EmptyList.INSTANCE, function3);
    }
}
