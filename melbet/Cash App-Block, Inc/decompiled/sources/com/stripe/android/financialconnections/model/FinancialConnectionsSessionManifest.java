package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.Cta;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import com.stripe.android.model.LinkBrand;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Serializable
/* loaded from: classes8.dex */
public final class FinancialConnectionsSessionManifest implements Parcelable {
    public static final Lazy[] $childSerializers;
    public final AccountDisconnectionMethod accountDisconnectionMethod;
    public final String accountholderCustomerEmailAddress;
    public final Boolean accountholderIsLinkConsumer;
    public final String accountholderPhoneNumber;
    public final String accountholderToken;
    public final FinancialConnectionsAuthorizationSession activeAuthSession;
    public final FinancialConnectionsInstitution activeInstitution;
    public final boolean allowManualEntry;
    public final boolean appVerificationEnabled;
    public final String assignmentEventId;
    public final String businessName;
    public final String cancelUrl;
    public final String connectPlatformName;
    public final String connectedAccountName;
    public final String consentAcquiredAt;
    public final boolean consentRequired;
    public final boolean customManualEntryHandling;
    public final boolean disableLinkMoreAccounts;
    public final TextUpdate displayText;
    public final Map experimentAssignments;
    public final Map features;
    public final String hostedAuthUrl;
    public final String id;
    public final FinancialConnectionsInstitution initialInstitution;
    public final boolean instantVerificationDisabled;
    public final boolean institutionSearchDisabled;
    public final Boolean isEndUserFacing;
    public final Boolean isLinkWithStripe;
    public final Boolean isNetworkingUserFlow;
    public final Boolean isStripeDirect;
    public final LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior;
    public final boolean livemode;
    public final ManualEntryMode manualEntryMode;
    public final boolean manualEntryUsesMicrodeposits;
    public final boolean mobileHandoffEnabled;
    public final Map modalCustomization;
    public final Pane nextPane;
    public final FinancialConnectionsAccount.SupportedPaymentMethodTypes paymentMethodType;
    public final List permissions;
    public final Product product;
    public final LinkBrand rawLinkBrand;
    public final boolean singleAccount;
    public final Boolean skipSuccessPane;
    public final String successUrl;
    public final Theme theme;
    public final boolean useSingleSortSearch;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FinancialConnectionsSessionManifest> CREATOR = new Cta.Creator(23);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "DASHBOARD", "EMAIL", "SUPPORT", "LINK", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class AccountDisconnectionMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountDisconnectionMethod[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("dashboard")
        public static final AccountDisconnectionMethod DASHBOARD = new AccountDisconnectionMethod("DASHBOARD", 0, "dashboard");

        @SerialName("email")
        public static final AccountDisconnectionMethod EMAIL = new AccountDisconnectionMethod("EMAIL", 1, "email");

        @SerialName("support")
        public static final AccountDisconnectionMethod SUPPORT = new AccountDisconnectionMethod("SUPPORT", 2, "support");

        @SerialName("link")
        public static final AccountDisconnectionMethod LINK = new AccountDisconnectionMethod("LINK", 3, "link");

        @SerialName("unknown")
        public static final AccountDisconnectionMethod UNKNOWN = new AccountDisconnectionMethod("UNKNOWN", 4, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) AccountDisconnectionMethod.getEntries().toArray(new AccountDisconnectionMethod[0]), AccountDisconnectionMethod.UNKNOWN);
        }

        private static final /* synthetic */ AccountDisconnectionMethod[] $values() {
            return new AccountDisconnectionMethod[]{DASHBOARD, EMAIL, SUPPORT, LINK, UNKNOWN};
        }

        static {
            AccountDisconnectionMethod[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private AccountDisconnectionMethod(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AccountDisconnectionMethod valueOf(String str) {
            return (AccountDisconnectionMethod) Enum.valueOf(AccountDisconnectionMethod.class, str);
        }

        public static AccountDisconnectionMethod[] values() {
            return (AccountDisconnectionMethod[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsSessionManifest$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "SILENT_SUCCESS", "USER_ERROR", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class LinkAccountSessionCancellationBehavior {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LinkAccountSessionCancellationBehavior[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("treat_as_silent_success")
        public static final LinkAccountSessionCancellationBehavior SILENT_SUCCESS = new LinkAccountSessionCancellationBehavior("SILENT_SUCCESS", 0, "treat_as_silent_success");

        @SerialName("treat_as_user_error")
        public static final LinkAccountSessionCancellationBehavior USER_ERROR = new LinkAccountSessionCancellationBehavior("USER_ERROR", 1, "treat_as_user_error");

        @SerialName("unknown")
        public static final LinkAccountSessionCancellationBehavior UNKNOWN = new LinkAccountSessionCancellationBehavior("UNKNOWN", 2, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) LinkAccountSessionCancellationBehavior.getEntries().toArray(new LinkAccountSessionCancellationBehavior[0]), LinkAccountSessionCancellationBehavior.UNKNOWN);
        }

        private static final /* synthetic */ LinkAccountSessionCancellationBehavior[] $values() {
            return new LinkAccountSessionCancellationBehavior[]{SILENT_SUCCESS, USER_ERROR, UNKNOWN};
        }

        static {
            LinkAccountSessionCancellationBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private LinkAccountSessionCancellationBehavior(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static LinkAccountSessionCancellationBehavior valueOf(String str) {
            return (LinkAccountSessionCancellationBehavior) Enum.valueOf(LinkAccountSessionCancellationBehavior.class, str);
        }

        public static LinkAccountSessionCancellationBehavior[] values() {
            return (LinkAccountSessionCancellationBehavior[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "ACCOUNT_PICKER", "ATTACH_LINKED_PAYMENT_ACCOUNT", "AUTH_OPTIONS", "CONSENT", "BANK_AUTH_REPAIR", "ID_CONSENT_CONTENT", "INSTITUTION_PICKER", "LINK_CONSENT", "LINK_LOGIN", "MANUAL_ENTRY", "MANUAL_ENTRY_SUCCESS", "NETWORKING_LINK_LOGIN_WARMUP", "NETWORKING_LINK_SIGNUP_PANE", "NETWORKING_LINK_VERIFICATION", "PARTNER_AUTH", "SUCCESS", "UNEXPECTED_ERROR", "LINK_ACCOUNT_PICKER", "PARTNER_AUTH_DRAWER", "NETWORKING_SAVE_TO_LINK_VERIFICATION", "NOTICE", "RESET", "ACCOUNT_UPDATE_REQUIRED", "EXIT", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Pane {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Pane[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("account_picker")
        public static final Pane ACCOUNT_PICKER = new Pane("ACCOUNT_PICKER", 0, "account_picker");

        @SerialName("attach_linked_payment_account")
        public static final Pane ATTACH_LINKED_PAYMENT_ACCOUNT = new Pane("ATTACH_LINKED_PAYMENT_ACCOUNT", 1, "attach_linked_payment_account");

        @SerialName("auth_options")
        public static final Pane AUTH_OPTIONS = new Pane("AUTH_OPTIONS", 2, "auth_options");

        @SerialName("consent")
        public static final Pane CONSENT = new Pane("CONSENT", 3, "consent");

        @SerialName("bank_auth_repair")
        public static final Pane BANK_AUTH_REPAIR = new Pane("BANK_AUTH_REPAIR", 4, "bank_auth_repair");

        @SerialName("id_consent_content")
        public static final Pane ID_CONSENT_CONTENT = new Pane("ID_CONSENT_CONTENT", 5, "id_consent_content");

        @SerialName("institution_picker")
        public static final Pane INSTITUTION_PICKER = new Pane("INSTITUTION_PICKER", 6, "institution_picker");

        @SerialName("link_consent")
        public static final Pane LINK_CONSENT = new Pane("LINK_CONSENT", 7, "link_consent");

        @SerialName("link_login")
        public static final Pane LINK_LOGIN = new Pane("LINK_LOGIN", 8, "link_login");

        @SerialName("manual_entry")
        public static final Pane MANUAL_ENTRY = new Pane("MANUAL_ENTRY", 9, "manual_entry");

        @SerialName("manual_entry_success")
        public static final Pane MANUAL_ENTRY_SUCCESS = new Pane("MANUAL_ENTRY_SUCCESS", 10, "manual_entry_success");

        @SerialName("networking_link_login_warmup")
        public static final Pane NETWORKING_LINK_LOGIN_WARMUP = new Pane("NETWORKING_LINK_LOGIN_WARMUP", 11, "networking_link_login_warmup");

        @SerialName("networking_link_signup_pane")
        public static final Pane NETWORKING_LINK_SIGNUP_PANE = new Pane("NETWORKING_LINK_SIGNUP_PANE", 12, "networking_link_signup_pane");

        @SerialName("networking_link_verification")
        public static final Pane NETWORKING_LINK_VERIFICATION = new Pane("NETWORKING_LINK_VERIFICATION", 13, "networking_link_verification");

        @SerialName("partner_auth")
        public static final Pane PARTNER_AUTH = new Pane("PARTNER_AUTH", 14, "partner_auth");

        @SerialName("success")
        public static final Pane SUCCESS = new Pane("SUCCESS", 15, "success");

        @SerialName("unexpected_error")
        public static final Pane UNEXPECTED_ERROR = new Pane("UNEXPECTED_ERROR", 16, "unexpected_error");

        @SerialName("link_account_picker")
        public static final Pane LINK_ACCOUNT_PICKER = new Pane("LINK_ACCOUNT_PICKER", 17, "link_account_picker");

        @SerialName("partner_auth_drawer")
        public static final Pane PARTNER_AUTH_DRAWER = new Pane("PARTNER_AUTH_DRAWER", 18, "partner_auth_drawer");

        @SerialName("networking_save_to_link_verification")
        public static final Pane NETWORKING_SAVE_TO_LINK_VERIFICATION = new Pane("NETWORKING_SAVE_TO_LINK_VERIFICATION", 19, "networking_save_to_link_verification");

        @SerialName("notice")
        public static final Pane NOTICE = new Pane("NOTICE", 20, "notice");

        @SerialName("reset")
        public static final Pane RESET = new Pane("RESET", 21, "reset");

        @SerialName("account_update_required")
        public static final Pane ACCOUNT_UPDATE_REQUIRED = new Pane("ACCOUNT_UPDATE_REQUIRED", 22, "account_update_required");

        @SerialName("exit")
        public static final Pane EXIT = new Pane("EXIT", 23, "exit");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Pane.getEntries().toArray(new Pane[0]), Pane.UNEXPECTED_ERROR);
        }

        private static final /* synthetic */ Pane[] $values() {
            return new Pane[]{ACCOUNT_PICKER, ATTACH_LINKED_PAYMENT_ACCOUNT, AUTH_OPTIONS, CONSENT, BANK_AUTH_REPAIR, ID_CONSENT_CONTENT, INSTITUTION_PICKER, LINK_CONSENT, LINK_LOGIN, MANUAL_ENTRY, MANUAL_ENTRY_SUCCESS, NETWORKING_LINK_LOGIN_WARMUP, NETWORKING_LINK_SIGNUP_PANE, NETWORKING_LINK_VERIFICATION, PARTNER_AUTH, SUCCESS, UNEXPECTED_ERROR, LINK_ACCOUNT_PICKER, PARTNER_AUTH_DRAWER, NETWORKING_SAVE_TO_LINK_VERIFICATION, NOTICE, RESET, ACCOUNT_UPDATE_REQUIRED, EXIT};
        }

        static {
            Pane[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Pane(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Pane valueOf(String str) {
            return (Pane) Enum.valueOf(Pane.class, str);
        }

        public static Pane[] values() {
            return (Pane[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "BILLPAY", "CANARY", "CAPITAL", "CAPITAL_HOSTED", "DASHBOARD", "DIRECT_ONBOARDING", "DIRECT_SETTINGS", "EMERALD", "EXPRESS_ONBOARDING", "EXTERNAL_API", "INSTANT_DEBITS", "ISSUING", "LCPM", "LINK_WITH_NETWORKING", "OPAL", "PAYMENT_FLOWS", "RESERVE_APPEALS", "STANDARD_ONBOARDING", "STRIPE_CARD", "SUPPORT_SITE", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Product {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Product[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("billpay")
        public static final Product BILLPAY = new Product("BILLPAY", 0, "billpay");

        @SerialName("canary")
        public static final Product CANARY = new Product("CANARY", 1, "canary");

        @SerialName("capital")
        public static final Product CAPITAL = new Product("CAPITAL", 2, "capital");

        @SerialName("capital_hosted")
        public static final Product CAPITAL_HOSTED = new Product("CAPITAL_HOSTED", 3, "capital_hosted");

        @SerialName("dashboard")
        public static final Product DASHBOARD = new Product("DASHBOARD", 4, "dashboard");

        @SerialName("direct_onboarding")
        public static final Product DIRECT_ONBOARDING = new Product("DIRECT_ONBOARDING", 5, "direct_onboarding");

        @SerialName("direct_settings")
        public static final Product DIRECT_SETTINGS = new Product("DIRECT_SETTINGS", 6, "direct_settings");

        @SerialName("emerald")
        public static final Product EMERALD = new Product("EMERALD", 7, "emerald");

        @SerialName("express_onboarding")
        public static final Product EXPRESS_ONBOARDING = new Product("EXPRESS_ONBOARDING", 8, "express_onboarding");

        @SerialName("external_api")
        public static final Product EXTERNAL_API = new Product("EXTERNAL_API", 9, "external_api");

        @SerialName("instant_debits")
        public static final Product INSTANT_DEBITS = new Product("INSTANT_DEBITS", 10, "instant_debits");

        @SerialName("issuing")
        public static final Product ISSUING = new Product("ISSUING", 11, "issuing");

        @SerialName("lcpm")
        public static final Product LCPM = new Product("LCPM", 12, "lcpm");

        @SerialName("link_with_networking")
        public static final Product LINK_WITH_NETWORKING = new Product("LINK_WITH_NETWORKING", 13, "link_with_networking");

        @SerialName("opal")
        public static final Product OPAL = new Product("OPAL", 14, "opal");

        @SerialName("payment_flows")
        public static final Product PAYMENT_FLOWS = new Product("PAYMENT_FLOWS", 15, "payment_flows");

        @SerialName("reserve_appeals")
        public static final Product RESERVE_APPEALS = new Product("RESERVE_APPEALS", 16, "reserve_appeals");

        @SerialName("standard_onboarding")
        public static final Product STANDARD_ONBOARDING = new Product("STANDARD_ONBOARDING", 17, "standard_onboarding");

        @SerialName("stripe_card")
        public static final Product STRIPE_CARD = new Product("STRIPE_CARD", 18, "stripe_card");

        @SerialName("support_site")
        public static final Product SUPPORT_SITE = new Product("SUPPORT_SITE", 19, "support_site");

        @SerialName("unknown")
        public static final Product UNKNOWN = new Product("UNKNOWN", 20, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Product.getEntries().toArray(new Product[0]), Product.UNKNOWN);
        }

        private static final /* synthetic */ Product[] $values() {
            return new Product[]{BILLPAY, CANARY, CAPITAL, CAPITAL_HOSTED, DASHBOARD, DIRECT_ONBOARDING, DIRECT_SETTINGS, EMERALD, EXPRESS_ONBOARDING, EXTERNAL_API, INSTANT_DEBITS, ISSUING, LCPM, LINK_WITH_NETWORKING, OPAL, PAYMENT_FLOWS, RESERVE_APPEALS, STANDARD_ONBOARDING, STRIPE_CARD, SUPPORT_SITE, UNKNOWN};
        }

        static {
            Product[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Product(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Product valueOf(String str) {
            return (Product) Enum.valueOf(Product.class, str);
        }

        public static Product[] values() {
            return (Product[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0006\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "<init>", "(Ljava/lang/String;I)V", "Companion", "Serializer", "LIGHT", "DASHBOARD_LIGHT", "LINK_LIGHT", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Theme {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("light")
        public static final Theme LIGHT = new Theme("LIGHT", 0);

        @SerialName("dashboard_light")
        public static final Theme DASHBOARD_LIGHT = new Theme("DASHBOARD_LIGHT", 1);

        @SerialName("link_light")
        public static final Theme LINK_LIGHT = new Theme("LINK_LIGHT", 2);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Theme.getEntries().toArray(new Theme[0]), Theme.LIGHT);
        }

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{LIGHT, DASHBOARD_LIGHT, LINK_LIGHT};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Theme(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Body$$ExternalSyntheticLambda0(28)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Body$$ExternalSyntheticLambda0(29)), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(1)), null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(2)), null, null, null, null, null};
    }

    public FinancialConnectionsSessionManifest(int i, int i2, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Pane pane, ManualEntryMode manualEntryMode, List list, Product product, boolean z11, boolean z12, AccountDisconnectionMethod accountDisconnectionMethod, String str3, Boolean bool, String str4, String str5, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str6, String str7, String str8, String str9, String str10, Map map, TextUpdate textUpdate, Map map2, String str11, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, String str12, Boolean bool6, Theme theme, LinkBrand linkBrand) {
        if (262143 != (i & 262143)) {
            int[] iArr = {i, i2};
            int[] iArr2 = {262143, 0};
            SerialDescriptor descriptor = FinancialConnectionsSessionManifest$$serializer.INSTANCE.getDescriptor();
            descriptor.getClass();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < 2; i3++) {
                int i4 = iArr2[i3] & (~iArr[i3]);
                if (i4 != 0) {
                    for (int i5 = 0; i5 < 32; i5++) {
                        if ((i4 & 1) != 0) {
                            arrayList.add(descriptor.getElementName((i3 * 32) + i5));
                        }
                        i4 >>>= 1;
                    }
                }
            }
            throw new MissingFieldException(descriptor.getSerialName(), arrayList);
        }
        this.allowManualEntry = z;
        this.consentRequired = z2;
        this.consentAcquiredAt = str;
        this.customManualEntryHandling = z3;
        this.disableLinkMoreAccounts = z4;
        this.id = str2;
        this.instantVerificationDisabled = z5;
        this.institutionSearchDisabled = z6;
        this.appVerificationEnabled = z7;
        this.livemode = z8;
        this.manualEntryUsesMicrodeposits = z9;
        this.mobileHandoffEnabled = z10;
        this.nextPane = pane;
        this.manualEntryMode = manualEntryMode;
        this.permissions = list;
        this.product = product;
        this.singleAccount = z11;
        this.useSingleSortSearch = z12;
        if ((262144 & i) == 0) {
            this.accountDisconnectionMethod = null;
        } else {
            this.accountDisconnectionMethod = accountDisconnectionMethod;
        }
        if ((524288 & i) == 0) {
            this.accountholderCustomerEmailAddress = null;
        } else {
            this.accountholderCustomerEmailAddress = str3;
        }
        if ((1048576 & i) == 0) {
            this.accountholderIsLinkConsumer = null;
        } else {
            this.accountholderIsLinkConsumer = bool;
        }
        if ((2097152 & i) == 0) {
            this.accountholderPhoneNumber = null;
        } else {
            this.accountholderPhoneNumber = str4;
        }
        if ((4194304 & i) == 0) {
            this.accountholderToken = null;
        } else {
            this.accountholderToken = str5;
        }
        if ((8388608 & i) == 0) {
            this.activeAuthSession = null;
        } else {
            this.activeAuthSession = financialConnectionsAuthorizationSession;
        }
        if ((16777216 & i) == 0) {
            this.activeInstitution = null;
        } else {
            this.activeInstitution = financialConnectionsInstitution;
        }
        if ((33554432 & i) == 0) {
            this.assignmentEventId = null;
        } else {
            this.assignmentEventId = str6;
        }
        if ((67108864 & i) == 0) {
            this.businessName = null;
        } else {
            this.businessName = str7;
        }
        if ((134217728 & i) == 0) {
            this.cancelUrl = null;
        } else {
            this.cancelUrl = str8;
        }
        if ((268435456 & i) == 0) {
            this.connectPlatformName = null;
        } else {
            this.connectPlatformName = str9;
        }
        if ((536870912 & i) == 0) {
            this.connectedAccountName = null;
        } else {
            this.connectedAccountName = str10;
        }
        if ((1073741824 & i) == 0) {
            this.experimentAssignments = null;
        } else {
            this.experimentAssignments = map;
        }
        if ((i & PKIFailureInfo.systemUnavail) == 0) {
            this.displayText = null;
        } else {
            this.displayText = textUpdate;
        }
        if ((i2 & 1) == 0) {
            this.features = null;
        } else {
            this.features = map2;
        }
        if ((i2 & 2) == 0) {
            this.hostedAuthUrl = null;
        } else {
            this.hostedAuthUrl = str11;
        }
        if ((i2 & 4) == 0) {
            this.initialInstitution = null;
        } else {
            this.initialInstitution = financialConnectionsInstitution2;
        }
        if ((i2 & 8) == 0) {
            this.isEndUserFacing = null;
        } else {
            this.isEndUserFacing = bool2;
        }
        if ((i2 & 16) == 0) {
            this.isLinkWithStripe = null;
        } else {
            this.isLinkWithStripe = bool3;
        }
        if ((i2 & 32) == 0) {
            this.isNetworkingUserFlow = null;
        } else {
            this.isNetworkingUserFlow = bool4;
        }
        if ((i2 & 64) == 0) {
            this.isStripeDirect = null;
        } else {
            this.isStripeDirect = bool5;
        }
        if ((i2 & 128) == 0) {
            this.linkAccountSessionCancellationBehavior = null;
        } else {
            this.linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior;
        }
        if ((i2 & 256) == 0) {
            this.modalCustomization = null;
        } else {
            this.modalCustomization = map3;
        }
        if ((i2 & 512) == 0) {
            this.paymentMethodType = null;
        } else {
            this.paymentMethodType = supportedPaymentMethodTypes;
        }
        if ((i2 & 1024) == 0) {
            this.successUrl = null;
        } else {
            this.successUrl = str12;
        }
        if ((i2 & 2048) == 0) {
            this.skipSuccessPane = null;
        } else {
            this.skipSuccessPane = bool6;
        }
        if ((i2 & 4096) == 0) {
            this.theme = null;
        } else {
            this.theme = theme;
        }
        if ((i2 & PKIFailureInfo.certRevoked) == 0) {
            this.rawLinkBrand = null;
        } else {
            this.rawLinkBrand = linkBrand;
        }
    }

    public static FinancialConnectionsSessionManifest copy$default(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, LinkBrand linkBrand, int i, int i2) {
        String str;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2;
        boolean z = financialConnectionsSessionManifest.allowManualEntry;
        boolean z2 = financialConnectionsSessionManifest.consentRequired;
        String str2 = financialConnectionsSessionManifest.consentAcquiredAt;
        boolean z3 = financialConnectionsSessionManifest.customManualEntryHandling;
        boolean z4 = financialConnectionsSessionManifest.disableLinkMoreAccounts;
        String str3 = financialConnectionsSessionManifest.id;
        boolean z5 = financialConnectionsSessionManifest.instantVerificationDisabled;
        boolean z6 = financialConnectionsSessionManifest.institutionSearchDisabled;
        boolean z7 = financialConnectionsSessionManifest.appVerificationEnabled;
        boolean z8 = financialConnectionsSessionManifest.livemode;
        boolean z9 = financialConnectionsSessionManifest.manualEntryUsesMicrodeposits;
        boolean z10 = financialConnectionsSessionManifest.mobileHandoffEnabled;
        Pane pane = financialConnectionsSessionManifest.nextPane;
        ManualEntryMode manualEntryMode = financialConnectionsSessionManifest.manualEntryMode;
        List list = financialConnectionsSessionManifest.permissions;
        Product product = financialConnectionsSessionManifest.product;
        boolean z11 = financialConnectionsSessionManifest.singleAccount;
        boolean z12 = financialConnectionsSessionManifest.useSingleSortSearch;
        AccountDisconnectionMethod accountDisconnectionMethod = financialConnectionsSessionManifest.accountDisconnectionMethod;
        String str4 = financialConnectionsSessionManifest.accountholderCustomerEmailAddress;
        Boolean bool = financialConnectionsSessionManifest.accountholderIsLinkConsumer;
        String str5 = financialConnectionsSessionManifest.accountholderPhoneNumber;
        String str6 = financialConnectionsSessionManifest.accountholderToken;
        if ((i & 8388608) != 0) {
            str = str6;
            financialConnectionsAuthorizationSession2 = financialConnectionsSessionManifest.activeAuthSession;
        } else {
            str = str6;
            financialConnectionsAuthorizationSession2 = financialConnectionsAuthorizationSession;
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession3 = financialConnectionsAuthorizationSession2;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = (i & 16777216) != 0 ? financialConnectionsSessionManifest.activeInstitution : financialConnectionsInstitution;
        String str7 = financialConnectionsSessionManifest.assignmentEventId;
        String str8 = financialConnectionsSessionManifest.businessName;
        String str9 = financialConnectionsSessionManifest.cancelUrl;
        String str10 = financialConnectionsSessionManifest.connectPlatformName;
        String str11 = financialConnectionsSessionManifest.connectedAccountName;
        Map map = financialConnectionsSessionManifest.experimentAssignments;
        TextUpdate textUpdate = financialConnectionsSessionManifest.displayText;
        Map map2 = financialConnectionsSessionManifest.features;
        String str12 = financialConnectionsSessionManifest.hostedAuthUrl;
        FinancialConnectionsInstitution financialConnectionsInstitution3 = financialConnectionsSessionManifest.initialInstitution;
        Boolean bool2 = financialConnectionsSessionManifest.isEndUserFacing;
        Boolean bool3 = financialConnectionsSessionManifest.isLinkWithStripe;
        Boolean bool4 = financialConnectionsSessionManifest.isNetworkingUserFlow;
        Boolean bool5 = financialConnectionsSessionManifest.isStripeDirect;
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = financialConnectionsSessionManifest.linkAccountSessionCancellationBehavior;
        Map map3 = financialConnectionsSessionManifest.modalCustomization;
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = financialConnectionsSessionManifest.paymentMethodType;
        String str13 = financialConnectionsSessionManifest.successUrl;
        Boolean bool6 = financialConnectionsSessionManifest.skipSuccessPane;
        Theme theme = financialConnectionsSessionManifest.theme;
        LinkBrand linkBrand2 = (i2 & PKIFailureInfo.certRevoked) != 0 ? financialConnectionsSessionManifest.rawLinkBrand : linkBrand;
        financialConnectionsSessionManifest.getClass();
        str3.getClass();
        pane.getClass();
        manualEntryMode.getClass();
        list.getClass();
        product.getClass();
        return new FinancialConnectionsSessionManifest(z, z2, str2, z3, z4, str3, z5, z6, z7, z8, z9, z10, pane, manualEntryMode, list, product, z11, z12, accountDisconnectionMethod, str4, bool, str5, str, financialConnectionsAuthorizationSession3, financialConnectionsInstitution2, str7, str8, str9, str10, str11, map, textUpdate, map2, str12, financialConnectionsInstitution3, bool2, bool3, bool4, bool5, linkAccountSessionCancellationBehavior, map3, supportedPaymentMethodTypes, str13, bool6, theme, linkBrand2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSessionManifest)) {
            return false;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
        return this.allowManualEntry == financialConnectionsSessionManifest.allowManualEntry && this.consentRequired == financialConnectionsSessionManifest.consentRequired && Intrinsics.areEqual(this.consentAcquiredAt, financialConnectionsSessionManifest.consentAcquiredAt) && this.customManualEntryHandling == financialConnectionsSessionManifest.customManualEntryHandling && this.disableLinkMoreAccounts == financialConnectionsSessionManifest.disableLinkMoreAccounts && Intrinsics.areEqual(this.id, financialConnectionsSessionManifest.id) && this.instantVerificationDisabled == financialConnectionsSessionManifest.instantVerificationDisabled && this.institutionSearchDisabled == financialConnectionsSessionManifest.institutionSearchDisabled && this.appVerificationEnabled == financialConnectionsSessionManifest.appVerificationEnabled && this.livemode == financialConnectionsSessionManifest.livemode && this.manualEntryUsesMicrodeposits == financialConnectionsSessionManifest.manualEntryUsesMicrodeposits && this.mobileHandoffEnabled == financialConnectionsSessionManifest.mobileHandoffEnabled && this.nextPane == financialConnectionsSessionManifest.nextPane && this.manualEntryMode == financialConnectionsSessionManifest.manualEntryMode && Intrinsics.areEqual(this.permissions, financialConnectionsSessionManifest.permissions) && this.product == financialConnectionsSessionManifest.product && this.singleAccount == financialConnectionsSessionManifest.singleAccount && this.useSingleSortSearch == financialConnectionsSessionManifest.useSingleSortSearch && this.accountDisconnectionMethod == financialConnectionsSessionManifest.accountDisconnectionMethod && Intrinsics.areEqual(this.accountholderCustomerEmailAddress, financialConnectionsSessionManifest.accountholderCustomerEmailAddress) && Intrinsics.areEqual(this.accountholderIsLinkConsumer, financialConnectionsSessionManifest.accountholderIsLinkConsumer) && Intrinsics.areEqual(this.accountholderPhoneNumber, financialConnectionsSessionManifest.accountholderPhoneNumber) && Intrinsics.areEqual(this.accountholderToken, financialConnectionsSessionManifest.accountholderToken) && Intrinsics.areEqual(this.activeAuthSession, financialConnectionsSessionManifest.activeAuthSession) && Intrinsics.areEqual(this.activeInstitution, financialConnectionsSessionManifest.activeInstitution) && Intrinsics.areEqual(this.assignmentEventId, financialConnectionsSessionManifest.assignmentEventId) && Intrinsics.areEqual(this.businessName, financialConnectionsSessionManifest.businessName) && Intrinsics.areEqual(this.cancelUrl, financialConnectionsSessionManifest.cancelUrl) && Intrinsics.areEqual(this.connectPlatformName, financialConnectionsSessionManifest.connectPlatformName) && Intrinsics.areEqual(this.connectedAccountName, financialConnectionsSessionManifest.connectedAccountName) && Intrinsics.areEqual(this.experimentAssignments, financialConnectionsSessionManifest.experimentAssignments) && Intrinsics.areEqual(this.displayText, financialConnectionsSessionManifest.displayText) && Intrinsics.areEqual(this.features, financialConnectionsSessionManifest.features) && Intrinsics.areEqual(this.hostedAuthUrl, financialConnectionsSessionManifest.hostedAuthUrl) && Intrinsics.areEqual(this.initialInstitution, financialConnectionsSessionManifest.initialInstitution) && Intrinsics.areEqual(this.isEndUserFacing, financialConnectionsSessionManifest.isEndUserFacing) && Intrinsics.areEqual(this.isLinkWithStripe, financialConnectionsSessionManifest.isLinkWithStripe) && Intrinsics.areEqual(this.isNetworkingUserFlow, financialConnectionsSessionManifest.isNetworkingUserFlow) && Intrinsics.areEqual(this.isStripeDirect, financialConnectionsSessionManifest.isStripeDirect) && this.linkAccountSessionCancellationBehavior == financialConnectionsSessionManifest.linkAccountSessionCancellationBehavior && Intrinsics.areEqual(this.modalCustomization, financialConnectionsSessionManifest.modalCustomization) && this.paymentMethodType == financialConnectionsSessionManifest.paymentMethodType && Intrinsics.areEqual(this.successUrl, financialConnectionsSessionManifest.successUrl) && Intrinsics.areEqual(this.skipSuccessPane, financialConnectionsSessionManifest.skipSuccessPane) && this.theme == financialConnectionsSessionManifest.theme && this.rawLinkBrand == financialConnectionsSessionManifest.rawLinkBrand;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.allowManualEntry) * 31, 31, this.consentRequired);
        String str = this.consentAcquiredAt;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.product.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.manualEntryMode.hashCode() + ((this.nextPane.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.customManualEntryHandling), 31, this.disableLinkMoreAccounts), 31, this.id), 31, this.instantVerificationDisabled), 31, this.institutionSearchDisabled), 31, this.appVerificationEnabled), 31, this.livemode), 31, this.manualEntryUsesMicrodeposits), 31, this.mobileHandoffEnabled)) * 31)) * 31, 31, this.permissions)) * 31, 31, this.singleAccount), 31, this.useSingleSortSearch);
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        int hashCode = (m2 + (accountDisconnectionMethod == null ? 0 : accountDisconnectionMethod.hashCode())) * 31;
        String str2 = this.accountholderCustomerEmailAddress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.accountholderIsLinkConsumer;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.accountholderPhoneNumber;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountholderToken;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        int hashCode6 = (hashCode5 + (financialConnectionsAuthorizationSession == null ? 0 : financialConnectionsAuthorizationSession.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution = this.activeInstitution;
        int hashCode7 = (hashCode6 + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode())) * 31;
        String str5 = this.assignmentEventId;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.businessName;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cancelUrl;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.connectPlatformName;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.connectedAccountName;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Map map = this.experimentAssignments;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        TextUpdate textUpdate = this.displayText;
        int hashCode14 = (hashCode13 + (textUpdate == null ? 0 : textUpdate.hashCode())) * 31;
        Map map2 = this.features;
        int hashCode15 = (hashCode14 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str10 = this.hostedAuthUrl;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = this.initialInstitution;
        int hashCode17 = (hashCode16 + (financialConnectionsInstitution2 == null ? 0 : financialConnectionsInstitution2.hashCode())) * 31;
        Boolean bool2 = this.isEndUserFacing;
        int hashCode18 = (hashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLinkWithStripe;
        int hashCode19 = (hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNetworkingUserFlow;
        int hashCode20 = (hashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isStripeDirect;
        int hashCode21 = (hashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        int hashCode22 = (hashCode21 + (linkAccountSessionCancellationBehavior == null ? 0 : linkAccountSessionCancellationBehavior.hashCode())) * 31;
        Map map3 = this.modalCustomization;
        int hashCode23 = (hashCode22 + (map3 == null ? 0 : map3.hashCode())) * 31;
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        int hashCode24 = (hashCode23 + (supportedPaymentMethodTypes == null ? 0 : supportedPaymentMethodTypes.hashCode())) * 31;
        String str11 = this.successUrl;
        int hashCode25 = (hashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool6 = this.skipSuccessPane;
        int hashCode26 = (hashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Theme theme = this.theme;
        int hashCode27 = (hashCode26 + (theme == null ? 0 : theme.hashCode())) * 31;
        LinkBrand linkBrand = this.rawLinkBrand;
        return hashCode27 + (linkBrand != null ? linkBrand.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("FinancialConnectionsSessionManifest(allowManualEntry=", ", consentRequired=", ", consentAcquiredAt=", this.allowManualEntry, this.consentRequired);
        NavAction$$ExternalSyntheticOutline0.m(m, this.consentAcquiredAt, ", customManualEntryHandling=", this.customManualEntryHandling, ", disableLinkMoreAccounts=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.disableLinkMoreAccounts, ", id=", this.id, ", instantVerificationDisabled=");
        re$$ExternalSyntheticOutline0.m(m, this.instantVerificationDisabled, ", institutionSearchDisabled=", this.institutionSearchDisabled, ", appVerificationEnabled=");
        re$$ExternalSyntheticOutline0.m(m, this.appVerificationEnabled, ", livemode=", this.livemode, ", manualEntryUsesMicrodeposits=");
        re$$ExternalSyntheticOutline0.m(m, this.manualEntryUsesMicrodeposits, ", mobileHandoffEnabled=", this.mobileHandoffEnabled, ", nextPane=");
        m.append(this.nextPane);
        m.append(", manualEntryMode=");
        m.append(this.manualEntryMode);
        m.append(", permissions=");
        m.append(this.permissions);
        m.append(", product=");
        m.append(this.product);
        m.append(", singleAccount=");
        re$$ExternalSyntheticOutline0.m(m, this.singleAccount, ", useSingleSortSearch=", this.useSingleSortSearch, ", accountDisconnectionMethod=");
        m.append(this.accountDisconnectionMethod);
        m.append(", accountholderCustomerEmailAddress=");
        m.append(this.accountholderCustomerEmailAddress);
        m.append(", accountholderIsLinkConsumer=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.accountholderIsLinkConsumer, ", accountholderPhoneNumber=", this.accountholderPhoneNumber, ", accountholderToken=");
        m.append(this.accountholderToken);
        m.append(", activeAuthSession=");
        m.append(this.activeAuthSession);
        m.append(", activeInstitution=");
        m.append(this.activeInstitution);
        m.append(", assignmentEventId=");
        m.append(this.assignmentEventId);
        m.append(", businessName=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.businessName, ", cancelUrl=", this.cancelUrl, ", connectPlatformName=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.connectPlatformName, ", connectedAccountName=", this.connectedAccountName, ", experimentAssignments=");
        m.append(this.experimentAssignments);
        m.append(", displayText=");
        m.append(this.displayText);
        m.append(", features=");
        m.append(this.features);
        m.append(", hostedAuthUrl=");
        m.append(this.hostedAuthUrl);
        m.append(", initialInstitution=");
        m.append(this.initialInstitution);
        m.append(", isEndUserFacing=");
        m.append(this.isEndUserFacing);
        m.append(", isLinkWithStripe=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.isLinkWithStripe, ", isNetworkingUserFlow=", this.isNetworkingUserFlow, ", isStripeDirect=");
        m.append(this.isStripeDirect);
        m.append(", linkAccountSessionCancellationBehavior=");
        m.append(this.linkAccountSessionCancellationBehavior);
        m.append(", modalCustomization=");
        m.append(this.modalCustomization);
        m.append(", paymentMethodType=");
        m.append(this.paymentMethodType);
        m.append(", successUrl=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.successUrl, ", skipSuccessPane=", this.skipSuccessPane, ", theme=");
        m.append(this.theme);
        m.append(", rawLinkBrand=");
        m.append(this.rawLinkBrand);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.allowManualEntry ? 1 : 0);
        parcel.writeInt(this.consentRequired ? 1 : 0);
        parcel.writeString(this.consentAcquiredAt);
        parcel.writeInt(this.customManualEntryHandling ? 1 : 0);
        parcel.writeInt(this.disableLinkMoreAccounts ? 1 : 0);
        parcel.writeString(this.id);
        parcel.writeInt(this.instantVerificationDisabled ? 1 : 0);
        parcel.writeInt(this.institutionSearchDisabled ? 1 : 0);
        parcel.writeInt(this.appVerificationEnabled ? 1 : 0);
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeInt(this.manualEntryUsesMicrodeposits ? 1 : 0);
        parcel.writeInt(this.mobileHandoffEnabled ? 1 : 0);
        parcel.writeString(this.nextPane.name());
        parcel.writeString(this.manualEntryMode.name());
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.permissions, parcel);
        while (m.hasNext()) {
            parcel.writeString(((FinancialConnectionsAccount.Permissions) m.next()).name());
        }
        parcel.writeString(this.product.name());
        parcel.writeInt(this.singleAccount ? 1 : 0);
        parcel.writeInt(this.useSingleSortSearch ? 1 : 0);
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        if (accountDisconnectionMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(accountDisconnectionMethod.name());
        }
        parcel.writeString(this.accountholderCustomerEmailAddress);
        Boolean bool = this.accountholderIsLinkConsumer;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        parcel.writeString(this.accountholderPhoneNumber);
        parcel.writeString(this.accountholderToken);
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        if (financialConnectionsAuthorizationSession == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsAuthorizationSession.writeToParcel(parcel, i);
        }
        FinancialConnectionsInstitution financialConnectionsInstitution = this.activeInstitution;
        if (financialConnectionsInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsInstitution.writeToParcel(parcel, i);
        }
        parcel.writeString(this.assignmentEventId);
        parcel.writeString(this.businessName);
        parcel.writeString(this.cancelUrl);
        parcel.writeString(this.connectPlatformName);
        parcel.writeString(this.connectedAccountName);
        Map map = this.experimentAssignments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator m2 = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
            while (m2.hasNext()) {
                Map.Entry entry = (Map.Entry) m2.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        TextUpdate textUpdate = this.displayText;
        if (textUpdate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textUpdate.writeToParcel(parcel, i);
        }
        Map map2 = this.features;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator m3 = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map2);
            while (m3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) m3.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeInt(((Boolean) entry2.getValue()).booleanValue() ? 1 : 0);
            }
        }
        parcel.writeString(this.hostedAuthUrl);
        FinancialConnectionsInstitution financialConnectionsInstitution2 = this.initialInstitution;
        if (financialConnectionsInstitution2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsInstitution2.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isEndUserFacing;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.isLinkWithStripe;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.isNetworkingUserFlow;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.isStripeDirect;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool5);
        }
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        if (linkAccountSessionCancellationBehavior == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(linkAccountSessionCancellationBehavior.name());
        }
        Map map3 = this.modalCustomization;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator m4 = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map3);
            while (m4.hasNext()) {
                Map.Entry entry3 = (Map.Entry) m4.next();
                parcel.writeString((String) entry3.getKey());
                parcel.writeInt(((Boolean) entry3.getValue()).booleanValue() ? 1 : 0);
            }
        }
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        if (supportedPaymentMethodTypes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(supportedPaymentMethodTypes.name());
        }
        parcel.writeString(this.successUrl);
        Boolean bool6 = this.skipSuccessPane;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool6);
        }
        Theme theme = this.theme;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
        LinkBrand linkBrand = this.rawLinkBrand;
        if (linkBrand == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(linkBrand.name());
        }
    }

    public FinancialConnectionsSessionManifest(boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Pane pane, ManualEntryMode manualEntryMode, List list, Product product, boolean z11, boolean z12, AccountDisconnectionMethod accountDisconnectionMethod, String str3, Boolean bool, String str4, String str5, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str6, String str7, String str8, String str9, String str10, Map map, TextUpdate textUpdate, Map map2, String str11, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, String str12, Boolean bool6, Theme theme, LinkBrand linkBrand) {
        str2.getClass();
        pane.getClass();
        manualEntryMode.getClass();
        product.getClass();
        this.allowManualEntry = z;
        this.consentRequired = z2;
        this.consentAcquiredAt = str;
        this.customManualEntryHandling = z3;
        this.disableLinkMoreAccounts = z4;
        this.id = str2;
        this.instantVerificationDisabled = z5;
        this.institutionSearchDisabled = z6;
        this.appVerificationEnabled = z7;
        this.livemode = z8;
        this.manualEntryUsesMicrodeposits = z9;
        this.mobileHandoffEnabled = z10;
        this.nextPane = pane;
        this.manualEntryMode = manualEntryMode;
        this.permissions = list;
        this.product = product;
        this.singleAccount = z11;
        this.useSingleSortSearch = z12;
        this.accountDisconnectionMethod = accountDisconnectionMethod;
        this.accountholderCustomerEmailAddress = str3;
        this.accountholderIsLinkConsumer = bool;
        this.accountholderPhoneNumber = str4;
        this.accountholderToken = str5;
        this.activeAuthSession = financialConnectionsAuthorizationSession;
        this.activeInstitution = financialConnectionsInstitution;
        this.assignmentEventId = str6;
        this.businessName = str7;
        this.cancelUrl = str8;
        this.connectPlatformName = str9;
        this.connectedAccountName = str10;
        this.experimentAssignments = map;
        this.displayText = textUpdate;
        this.features = map2;
        this.hostedAuthUrl = str11;
        this.initialInstitution = financialConnectionsInstitution2;
        this.isEndUserFacing = bool2;
        this.isLinkWithStripe = bool3;
        this.isNetworkingUserFlow = bool4;
        this.isStripeDirect = bool5;
        this.linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior;
        this.modalCustomization = map3;
        this.paymentMethodType = supportedPaymentMethodTypes;
        this.successUrl = str12;
        this.skipSuccessPane = bool6;
        this.theme = theme;
        this.rawLinkBrand = linkBrand;
    }
}
