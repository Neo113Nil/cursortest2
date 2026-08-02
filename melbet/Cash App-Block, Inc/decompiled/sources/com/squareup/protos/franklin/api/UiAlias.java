package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import android.util.JsonWriter;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.LazyListIntervalContent$$ExternalSyntheticLambda0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.exif.ExifInterface;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageType;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.notifications.NotificationPreferenceUpdatedEvent$ClientExperienceVersion;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.protos.cash.usher.api.OnboardingInternalRouteResponse;
import com.squareup.protos.cash.whimsicard.flows.v1.PaymentDeviceConfig;
import com.squareup.protos.cash.whimsicard.flows.v1.PresentationMode;
import com.squareup.protos.cash.whimsicard.syncentity.Action;
import com.squareup.protos.cash.whimsicard.syncentity.StatusDisplay;
import com.squareup.protos.cash.whimsicard.syncentity.Timeline;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetails;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.protos.cryptoinvestflow.CryptoPayrollPreference;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.AddMoneyRequest;
import com.squareup.protos.franklin.app.AppIntroData;
import com.squareup.protos.franklin.app.ApplyRewardCodeResponse;
import com.squareup.protos.franklin.app.CancelPaymentResponse;
import com.squareup.protos.franklin.app.CheckVersionResponse;
import com.squareup.protos.franklin.app.ClaimByPaymentTokenRequest;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import com.squareup.protos.franklin.app.ConfirmPaymentResponse;
import com.squareup.protos.franklin.app.CustomDesign;
import com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsResponse;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataRequest;
import com.squareup.protos.franklin.app.GetLinkedAccountsResponse;
import com.squareup.protos.franklin.app.GetProfileResponse;
import com.squareup.protos.franklin.app.InitiatePaymentResponse;
import com.squareup.protos.franklin.app.InviteContactsResponse;
import com.squareup.protos.franklin.app.LinkBankAccountResponse;
import com.squareup.protos.franklin.app.OAuthResolveFlowResponse;
import com.squareup.protos.franklin.app.PlaidLinkTokenCreateRequest;
import com.squareup.protos.franklin.app.ProfileListConfig;
import com.squareup.protos.franklin.app.RegisterSmsResponse;
import com.squareup.protos.franklin.app.VerifyInstrumentResponse;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.BankAccount;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferInStatus;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.protos.franklin.common.scenarios.PlaidLinkingConfig;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.Serializable;
import java.io.StringWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocket;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okio.ByteString;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class UiAlias extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiAlias> CREATOR;
    public final String canonical_text;
    public final String formatted;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1363type;

    static {
        UiAlias$Companion$ADAPTER$1 uiAlias$Companion$ADAPTER$1 = new UiAlias$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiAlias.class), "type.googleapis.com/squareup.franklin.api.UiAlias", Syntax.PROTO_2, null, "squareup/franklin/UiAliasProto.proto");
        ADAPTER = uiAlias$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiAlias$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiAlias(Type type2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1363type = type2;
        this.canonical_text = str;
        this.formatted = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiAlias)) {
            return false;
        }
        UiAlias uiAlias = (UiAlias) obj;
        return Intrinsics.areEqual(unknownFields(), uiAlias.unknownFields()) && this.f1363type == uiAlias.f1363type && Intrinsics.areEqual(this.canonical_text, uiAlias.canonical_text) && Intrinsics.areEqual(this.formatted, uiAlias.formatted);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1363type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.canonical_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.formatted;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1364type = this.f1363type;
        builder.canonical_text = this.canonical_text;
        builder.formatted = this.formatted;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1363type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        if (this.canonical_text != null) {
            arrayList.add("canonical_text=██");
        }
        if (this.formatted != null) {
            arrayList.add("formatted=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiAlias{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object canonical_text;
        public Object formatted;

        /* renamed from: type, reason: collision with root package name */
        public Object f1364type;

        public Builder() {
            this.$r8$classId = 13;
            this.f1364type = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiAlias((Type) this.f1364type, (String) this.canonical_text, (String) this.formatted, buildUnknownFields());
                case 1:
                    return new VerticalStackedBarGraph.Bar.CategoryTextValue((Color) this.f1364type, (LocalizedString) this.canonical_text, (LocalizedString) this.formatted, buildUnknownFields());
                case 2:
                    return new VerticalStackedBarGraph((List) this.f1364type, (VerticalStackedBarGraph.GraphLegend) this.canonical_text, (List) this.formatted, buildUnknownFields());
                case 3:
                    return new OnboardingInternalRouteResponse((OnboardingInternalRouteResponse.Instruction) this.f1364type, (String) this.canonical_text, (ResponseContext) this.formatted, buildUnknownFields());
                case 4:
                    return new PaymentDeviceConfig((List) this.f1364type, (String) this.canonical_text, (PresentationMode) this.formatted, buildUnknownFields());
                case 5:
                    return new StatusDisplay((LocalizedString) this.f1364type, (LocalizedString) this.canonical_text, (Action) this.formatted, buildUnknownFields());
                case 6:
                    return new Timeline.Step((LocalizedString) this.f1364type, (LocalizedString) this.canonical_text, (Timeline.Step.StepStyle) this.formatted, buildUnknownFields());
                case 7:
                    return new PerformanceDetails((List) this.f1364type, (List) this.canonical_text, (Instant) this.formatted, buildUnknownFields());
                case 8:
                    return new SigningData.AssertionSigningData((String) this.canonical_text, (ByteString) this.f1364type, (ByteString) this.formatted, buildUnknownFields());
                case 9:
                    return new SigningData((Integer) this.f1364type, (ByteString) this.canonical_text, (zzms) this.formatted, buildUnknownFields());
                case 10:
                    return new CryptoPayrollPreference((Integer) this.f1364type, (CurrencyCode) this.canonical_text, (CurrencyCode) this.formatted, buildUnknownFields());
                case 11:
                    return new NotificationPreference((UiAlias) this.f1364type, (Boolean) this.canonical_text, (NotificationPreferenceUpdatedEvent$ClientExperienceVersion) this.formatted, buildUnknownFields());
                case 12:
                    return new AddMoneyRequest((RequestContext) this.f1364type, (Money) this.canonical_text, (AddMoneyRequest.PaymentMethod) this.formatted, buildUnknownFields());
                case 13:
                    String str = (String) this.canonical_text;
                    if (str != null) {
                        return new AppIntroData(str, (List) this.f1364type, (Region) this.formatted, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "action_button_title");
                    throw null;
                case 14:
                    return new ApplyRewardCodeResponse((ResponseContext) this.f1364type, (Boolean) this.canonical_text, (RewardStatus) this.formatted, buildUnknownFields());
                case 15:
                    return new CancelPaymentResponse((ResponseContext) this.f1364type, (CancelPaymentResponse.Status) this.canonical_text, (UiPayment) this.formatted, buildUnknownFields());
                case 16:
                    return new CheckVersionResponse((CheckVersionResponse.Status) this.f1364type, (String) this.canonical_text, (String) this.formatted, buildUnknownFields());
                case 17:
                    return new ClaimByPaymentTokenRequest((RequestContext) this.f1364type, (String) this.canonical_text, (InstrumentSelection) this.formatted, buildUnknownFields());
                case 18:
                    return new ConfirmPasscodeResponse((ResponseContext) this.f1364type, (ConfirmPasscodeResponse.Status) this.formatted, (String) this.canonical_text, buildUnknownFields());
                case 19:
                    return new ConfirmPaymentResponse((ResponseContext) this.f1364type, (ConfirmPaymentResponse.Status) this.canonical_text, (UiPayment) this.formatted, buildUnknownFields());
                case 20:
                    return new CustomDesign((ByteString) this.f1364type, (String) this.canonical_text, (TouchData) this.formatted, buildUnknownFields());
                case 21:
                    return new GetEffectiveCustomerLimitsResponse.LimitForAction((LimitedAction) this.f1364type, (Money) this.formatted, (String) this.canonical_text, buildUnknownFields());
                case 22:
                    return new GetHistoricalExchangeDataRequest((HistoricalRange) this.f1364type, (String) this.canonical_text, (String) this.formatted, buildUnknownFields());
                case 23:
                    return new GetLinkedAccountsResponse((AccountListConfig) this.f1364type, (ResponseContext) this.canonical_text, (ProfileListConfig) this.formatted, buildUnknownFields());
                case 24:
                    return new GetProfileResponse((GetProfileResponse.Status) this.f1364type, (Profile) this.formatted, (String) this.canonical_text, buildUnknownFields());
                case 25:
                    return new InitiatePaymentResponse((ResponseContext) this.f1364type, (InitiatePaymentResponse.Status) this.canonical_text, (ClaimData) this.formatted, buildUnknownFields());
                case 26:
                    return new InviteContactsResponse((ResponseContext) this.f1364type, (List) this.canonical_text, (List) this.formatted, buildUnknownFields());
                case 27:
                    return new LinkBankAccountResponse((ResponseContext) this.f1364type, (BankAccount) this.canonical_text, (Instrument) this.formatted, buildUnknownFields());
                case 28:
                    return new OAuthResolveFlowResponse((ResponseContext) this.f1364type, (OAuthResolveFlowResponse.Status) this.formatted, (String) this.canonical_text, buildUnknownFields());
                default:
                    return new PlaidLinkTokenCreateRequest((Boolean) this.f1364type, (ClientScenario) this.canonical_text, (PlaidLinkingConfig) this.formatted, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }

    public /* synthetic */ UiAlias(Type type2, String str) {
        this(type2, str, null, ByteString.EMPTY);
    }

    /* loaded from: classes.dex */
    public enum Type implements WireEnum {
        SMS(1),
        EMAIL(2),
        APP(3);

        public final int value;
        public static final Companion Companion = new Companion();
        public static final UiAlias$Type$Companion$ADAPTER$1 ADAPTER = new UiAlias$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SMS;
            }
            if (i == 2) {
                return EMAIL;
            }
            if (i != 3) {
                return null;
            }
            return APP;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }

        public final class Companion implements DeferredSocketAdapter.Factory {
            /* renamed from: fromValue, reason: collision with other method in class */
            public static Flow$Type m3942fromValue(int i) {
                switch (i) {
                    case 2:
                        return Flow$Type.REMOVE_BOOST;
                    case 3:
                        return Flow$Type.RECIPIENT_PAYMENT_FLOW;
                    case 4:
                        return Flow$Type.SENDER_PAYMENT_FLOW;
                    case 5:
                        return Flow$Type.ORDER_PIZZA_FLOW;
                    case 6:
                        return Flow$Type.ADD_BOOST;
                    case 7:
                        return Flow$Type.ONBOARDING;
                    case 8:
                        return Flow$Type.LOCK_ISSUED_CARD;
                    case 9:
                        return Flow$Type.DISABLE_ISSUED_CARD;
                    case 10:
                        return Flow$Type.CHANGE_PASSCODE;
                    case 11:
                        return Flow$Type.ACTIVATE_PHYSICAL_CARD;
                    case 12:
                    case 77:
                    case 81:
                    case 88:
                    case 90:
                    case 103:
                    case 108:
                    case 150:
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    case 165:
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    case SDK_ASSET_ICON_PIN_VALUE:
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                    case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                    case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                    case SDK_ASSET_ILLUSTRATION_SECURE_DATA_DARK_APPEARANCE_VALUE:
                    case 338:
                    case 374:
                    case 408:
                    case 467:
                    case 479:
                    case 536:
                    default:
                        return null;
                    case 13:
                        return Flow$Type.REPORT_CARD_LOST_OR_STOLEN;
                    case 14:
                        return Flow$Type.CHANGE_CARD_DESIGN;
                    case 15:
                        return Flow$Type.REQUEST_PHYSICAL_CARD;
                    case 16:
                        return Flow$Type.IDENTITY_VERIFICATION;
                    case 17:
                        return Flow$Type.AMEND_CARD_MAILING_ADDRESS;
                    case 18:
                        return Flow$Type.LINK_PHONE_NUMBER;
                    case 19:
                        return Flow$Type.LINK_EMAIL_ADDRESS;
                    case 20:
                        return Flow$Type.HEAVY_CUSTOMER;
                    case 21:
                        return Flow$Type.INITIATE_CRYPTO_PAYMENT;
                    case 22:
                        return Flow$Type.THIRD_PARTY_AUTHORIZATION;
                    case 23:
                        return Flow$Type.MOBILE_CHECK_DEPOSIT;
                    case 24:
                        return Flow$Type.DISPUTE_CARD_TRANSACTION;
                    case 25:
                        return Flow$Type.EXCEPTION_FLOW;
                    case 26:
                        return Flow$Type.SET_JURISDICTION;
                    case 27:
                        return Flow$Type.GET_DIRECT_DEPOSIT_FORM;
                    case 28:
                        return Flow$Type.REPORT_LOST_CARD;
                    case 29:
                        return Flow$Type.ACTIVATE_PHYSICAL_CARD_IN_POSTCARD;
                    case 30:
                        return Flow$Type.PEERMENTS_SENDER_FLOW;
                    case 31:
                        return Flow$Type.ENABLE_ISSUED_CARD;
                    case 32:
                        return Flow$Type.DISABLE_ISSUED_CARD_IN_POSTCARD;
                    case 33:
                        return Flow$Type.GET_EVENT_BASED_BOOST_DETAIL;
                    case 34:
                        return Flow$Type.UNLOCK_ISSUED_CARD;
                    case 35:
                        return Flow$Type.ACCEPT_CRYPTO_PAYMENT;
                    case 36:
                        return Flow$Type.ACTIVATE_DIRECT_DEPOSIT_ACCOUNT;
                    case 37:
                        return Flow$Type.UNLOCK_QR_CODE_BOOST;
                    case 38:
                        return Flow$Type.FRANKLIN_INVEST_EQUITY_CUSTOMER_ONBOARDING;
                    case 39:
                        return Flow$Type.DDA_DETAILS;
                    case 40:
                        return Flow$Type.GOOGLE_PAY_PROVISIONING;
                    case 41:
                        return Flow$Type.TRANSFER_FUNDS;
                    case 42:
                        return Flow$Type.ACCEPT_INVEST_PAYMENT;
                    case 43:
                        return Flow$Type.EDIT_PROFILE_BIO;
                    case 44:
                        return Flow$Type.REPORT_PROFILE;
                    case 45:
                        return Flow$Type.DECLINE_CRYPTO_PAYMENT;
                    case 46:
                        return Flow$Type.SEND_INVEST_PAYMENT;
                    case 47:
                        return Flow$Type.IDV_IDENTITY_VERIFICATION;
                    case 48:
                        return Flow$Type.INVEST_EQUITY_TRADE;
                    case 49:
                        return Flow$Type.DEPOSIT_PAPER_CASH;
                    case 50:
                        return Flow$Type.GET_BANKING_INTERSTITIAL;
                    case 51:
                        return Flow$Type.TRANSFER_FROM_BANKS;
                    case 52:
                        return Flow$Type.CARD_EXPIRATION;
                    case 53:
                        return Flow$Type.REQUEST_SPONSORSHIP;
                    case 54:
                        return Flow$Type.APPROVE_SPONSORSHIP;
                    case 55:
                        return Flow$Type.INITIATE_TAX_UPGRADE;
                    case 56:
                        return Flow$Type.DEPOSIT_PAPER_CASH_CONFIRMATION;
                    case 57:
                        return Flow$Type.ELECTRONIC_IDENTITY_VERIFICATION;
                    case 58:
                        return Flow$Type.GET_INSTANT_PAYOUT;
                    case 59:
                        return Flow$Type.UNLOCK_BANKING_DEPOSIT_OPTIONS;
                    case 60:
                        return Flow$Type.INITIATE_CRYPTO_WITHDRAWAL;
                    case 61:
                        return Flow$Type.CLOSE_ACCOUNT;
                    case 62:
                        return Flow$Type.ENTER_QR_MARKETING_EVENT;
                    case 63:
                        return Flow$Type.SET_OR_UPDATE_PASSWORD;
                    case 64:
                        return Flow$Type.SET_OR_VERIFY_PASSWORD;
                    case 65:
                        return Flow$Type.INITIATE_GLOBAL_PAYMENT;
                    case 66:
                        return Flow$Type.INITIATE_CRYPTO_DEPOSIT_REVERSAL;
                    case 67:
                        return Flow$Type.REQUIRE_NON_VOIP_PHONE_NUMBER;
                    case 68:
                        return Flow$Type.INVEST_CRYPTO_CUSTOMER_ONBOARDING;
                    case 69:
                        return Flow$Type.ACCEPT_TERMS_OF_SERVICE_AGREEMENT;
                    case 70:
                        return Flow$Type.RECOVER_PASSWORD;
                    case 71:
                        return Flow$Type.DIRECT_DEPOSIT_SWITCH_VIA_PAYROLL;
                    case 72:
                        return Flow$Type.IDV_OR_SPONSORSHIP;
                    case 73:
                        return Flow$Type.CARD_LSB_REORDER;
                    case 74:
                        return Flow$Type.RESEND_SPONSORSHIP_REQUEST;
                    case 75:
                        return Flow$Type.INITIATE_LIGHTNING_WITHDRAWAL;
                    case 76:
                        return Flow$Type.NEW_TO_BOOST_INFORMATION;
                    case 78:
                        return Flow$Type.SEND_PRINT_CHECK;
                    case 79:
                        return Flow$Type.COLLECT_ADDRESS;
                    case 80:
                        return Flow$Type.TOTP;
                    case 82:
                        return Flow$Type.DIRECT_DEPOSIT_SWITCH_VIA_PAYROLL_CONFIRMATION;
                    case 83:
                        return Flow$Type.REQUIRE_SECOND_FACTOR_VERIFICATION;
                    case 84:
                        return Flow$Type.CRYPTO_INVEST_CURRENCY_EXCHANGE;
                    case 85:
                        return Flow$Type.DD_SWITCH_UPSELL_CARD_ACTIVATED;
                    case 86:
                        return Flow$Type.REVIEW_LOGIN;
                    case 87:
                        return Flow$Type.CRYPTO_INVEST_ONBOARDING;
                    case 89:
                        return Flow$Type.REQUIREMENT_TEST_FLOW;
                    case 91:
                        return Flow$Type.GRANTLY_MANAGED_GRANT;
                    case 92:
                        return Flow$Type.CRYPTO_INVEST_CONFIGURE_PAYROLL;
                    case 93:
                        return Flow$Type.ACCEPT_GIFT_CARD_PAYMENT;
                    case 94:
                        return Flow$Type.CANCEL_INVEST_PAYMENT;
                    case 95:
                        return Flow$Type.ROUND_UP_ONBOARDING;
                    case 96:
                        return Flow$Type.CHANGE_ROUND_UP_DESTINATION;
                    case 97:
                        return Flow$Type.INITIATE_BANK_ACCOUNT_LINKING;
                    case 98:
                        return Flow$Type.POST_SIGN_IN;
                    case 99:
                        return Flow$Type.SERVE_AND_VERIFY_CHALLENGE;
                    case 100:
                        return Flow$Type.SET_OR_UPDATE_TRUSTED_CONTACT;
                    case 101:
                        return Flow$Type.INITIATE_FIATLY_PAYMENT;
                    case 102:
                        return Flow$Type.ACQUIRE_ALIAS;
                    case 104:
                        return Flow$Type.FAMILY_ACCOUNT_STATE;
                    case 105:
                        return Flow$Type.PROVISION_GOOGLE_PAY_IN_APP;
                    case 106:
                        return Flow$Type.PAYMENT_FLOW;
                    case 107:
                        return Flow$Type.PROVISION_APPLE_PAY;
                    case 109:
                        return Flow$Type.REMOVE_TRUSTED_CONTACT;
                    case 110:
                        return Flow$Type.INITIATE_AFTERPAY_PAYMENT;
                    case 111:
                        return Flow$Type.LINK_NEW_PAYMENT_CARD;
                    case 112:
                        return Flow$Type.CONVERT_GIFT_CARD_TO_CASH;
                    case 113:
                        return Flow$Type.NEON_EXAMPLE_GIFT_WRAP;
                    case 114:
                        return Flow$Type.ENABLE_AND_UNMASK_ISSUED_CARD;
                    case 115:
                        return Flow$Type.DIRECT_DEPOSIT_SWITCH_UPSELL;
                    case 116:
                        return Flow$Type.GRADUATE_SPONSORSHIP;
                    case 117:
                        return Flow$Type.VERIFY_PASSCODE_OR_ENABLE_SECURITY_LOCK;
                    case 118:
                        return Flow$Type.VERIFY_PASSCODE_IF_SECURITY_LOCK_ENABLED;
                    case 119:
                        return Flow$Type.CHANGE_AFTERPAY_PAYMENT_DATE;
                    case 120:
                        return Flow$Type.CANCEL_PENDING_ROUND_UP_EXECUTION;
                    case 121:
                        return Flow$Type.ADD_EMAIL_ALIAS;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        return Flow$Type.ADD_SMS_ALIAS;
                    case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                        return Flow$Type.ENABLE_SECURITY_LOCk;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        return Flow$Type.DISABLE_SECURITY_LOCK;
                    case 125:
                        return Flow$Type.SET_PASSCODE;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        return Flow$Type.SET_OR_UPDATE_PASSCODE;
                    case 127:
                        return Flow$Type.RESET_PASSCODE;
                    case 128:
                        return Flow$Type.ELIGIBILITY_RESOLUTION;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        return Flow$Type.INIT_REMIT;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        return Flow$Type.SEND_GIFT_CARD_PAYMENT;
                    case 131:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_WITH_SURVEY;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        return Flow$Type.EDIT_CUSTOMER_BIO;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        return Flow$Type.INVEST_TEEN_REQUEST_AUTHORIZATION;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        return Flow$Type.INVEST_SPONSOR_AUTHORIZATION_APPROVAL;
                    case 136:
                        return Flow$Type.CONFIRM_VERIFIED_IDENTITY;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        return Flow$Type.INITIATE_BITCOIN_WITHDRAWAL;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        return Flow$Type.INITIATE_SPLIT;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        return Flow$Type.PAY_BILL;
                    case 140:
                        return Flow$Type.CUSTOMER_STRIKE_WARNING;
                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                        return Flow$Type.CRYPTO_ONBOARDING;
                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                        return Flow$Type.SUP_BNPL_CHECKOUT;
                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                        return Flow$Type.CREATE_OR_TOGGLE_PASSCODE;
                    case 144:
                        return Flow$Type.INVEST_EQUITY_CUSTOMER_ONBOARDING_TRAMPOLINE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                        return Flow$Type.INITIATE_OUTBOUND_PHONE_SUPPORT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                        return Flow$Type.SOURCE_OF_FUNDS_EMPLOYMENT_TRAMPOLINE;
                    case 147:
                        return Flow$Type.INVEST_WHERE_YOU_SHOP_ONBOARDING;
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_VIA_SUBFLOW;
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_WITH_IDV;
                    case 151:
                        return Flow$Type.GET_NON_RECOURSE_PAYOUT;
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                        return Flow$Type.SET_SAVINGS_GOAL;
                    case 153:
                        return Flow$Type.SAVINGS_NUX;
                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                        return Flow$Type.WIRE_TRANSFER;
                    case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                        return Flow$Type.ORDER_TIGERS;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                        return Flow$Type.SUP_BNPL_CANCEL_CARD;
                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                        return Flow$Type.SUP_BNPL_UPDATE_CARD_AMOUNT;
                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        return Flow$Type.INVITE_FRIENDS;
                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        return Flow$Type.BANK_AND_WIRE_TRANSFERS;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        return Flow$Type.ACCEPT_UPDATED_CARD_TERMS;
                    case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                        return Flow$Type.REFRESH_LIGHTNING_INVOICE;
                    case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                        return Flow$Type.LIMITS_SOURCE_OF_FUNDS_COLLECTION;
                    case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                        return Flow$Type.SEND_P2P_FIAT_PAYMENT;
                    case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                        return Flow$Type.CREATE_GROUP;
                    case 167:
                        return Flow$Type.LEAVE_GROUP;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                        return Flow$Type.CREATE_GROUP_EXPENSE;
                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                        return Flow$Type.FIND_MONEY_RETAILERS;
                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                        return Flow$Type.CRYPTO_SOURCE_OF_FUNDS_COLLECTION;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                        return Flow$Type.AUTHENTICATE_TRANSACTIONS;
                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                        return Flow$Type.DOCUMENT_IDENTITY_VERIFICATION;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        return Flow$Type.GROUP_EXPENSE_SLICE_P2P_ACTION;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                        return Flow$Type.SUP_BNPL_MANAGE_CARD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                        return Flow$Type.SANCTIONS_INTERDICTION_INFO_COLLECTION;
                    case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                        return Flow$Type.REVIEW_BUSINESS_ACCOUNT;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                        return Flow$Type.UPDATE_BUSINESS_ACCOUNT_TAX_INFO;
                    case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
                        return Flow$Type.REVIEW_BUSINESS_ACCOUNT_TAX;
                    case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                        return Flow$Type.PIGGYBANK_SAVINGS_ROUND_UP;
                    case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                        return Flow$Type.ORDER_LIONS;
                    case SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE:
                        return Flow$Type.ELIGIBLE_ORDER_LIONS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                        return Flow$Type.DOWNGRADE_BUSINESS_ACCOUNT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_MULTI;
                    case 185:
                        return Flow$Type.INSTANT_PAY_DIRECT_DEPOSIT_SWITCH_OFFER;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                        return Flow$Type.ORDER_CATS;
                    case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                        return Flow$Type.BORROW_UNLOCKED;
                    case 188:
                        return Flow$Type.LINK_ACCOUNT_PRE_AUTH;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                        return Flow$Type.THREE_DOMAIN_SECURE_CHALLENGE;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                        return Flow$Type.LINK_ACCOUNT_POST_AUTH;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                        return Flow$Type.EXEMPLAR_TREEHOUSE_BLOCKER_PASSTHROUGH;
                    case 192:
                        return Flow$Type.DISABLE_RECURRING_EQUITY_BUY;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                        return Flow$Type.CREATE_OR_EDIT_RECURRING_PAYMENT;
                    case SDK_ASSET_ICON_EXTERNAL_VALUE:
                        return Flow$Type.REFUND_GIFT_CARD_PAYMENT;
                    case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                        return Flow$Type.LINK_CARD;
                    case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                        return Flow$Type.SPICE_REQUEST;
                    case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                        return Flow$Type.HAS_SUFFICIENT_FUNDS_OR_LINKED_CARD;
                    case SDK_ASSET_ICON_ARROW_UP_VALUE:
                        return Flow$Type.INITIATE_IN_APP_BROWSER_FOR_OFFER;
                    case SDK_ASSET_ICON_CANCEL_VALUE:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_MULTI_VARIANT;
                    case 200:
                        return Flow$Type.PLASMA_SUBFLOW_WRAPPER;
                    case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
                        return Flow$Type.ORDER_RABBITS;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                        return Flow$Type.BORROW_UNDERWRITING;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                        return Flow$Type.PLASMA_REQUIREMENT_WRAPPER;
                    case SDK_ASSET_ICON_CLEARED_REC_VALUE:
                        return Flow$Type.OVERDRAFT;
                    case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                        return Flow$Type.ENABLE_RECURRING_EQUITY_BUY;
                    case SDK_ASSET_ICON_CLOCK_VALUE:
                        return Flow$Type.SUP_CREATE_CARD;
                    case SDK_ASSET_ICON_COMMENT_VALUE:
                        return Flow$Type.SUP_EDIT_CARD;
                    case SDK_ASSET_ICON_INCOME_VALUE:
                        return Flow$Type.SUP_ADJUST_AMOUNT;
                    case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                        return Flow$Type.SUP_CANCEL_CARD;
                    case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                        return Flow$Type.CANCEL_P2P_FIAT_PAYMENT;
                    case 211:
                        return Flow$Type.DISABLE_RECURRING_EQUITY_BUY_V2;
                    case SDK_ASSET_ICON_OVERRIDE_VALUE:
                        return Flow$Type.IDENTITY_HUB;
                    case SDK_ASSET_ICON_PAUSE_VALUE:
                        return Flow$Type.OVERDRAFT_ACTIVATION;
                    case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                        return Flow$Type.DRAKE_PRESALE_MARCH_2023;
                    case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                        return Flow$Type.OVERDRAFT_PAYMENT;
                    case SDK_ASSET_ICON_PROGRESS_VALUE:
                        return Flow$Type.RETROACTIVE_FINANCING_INITIATE_LOAN_FLOW;
                    case SDK_ASSET_ICON_QUESTION_VALUE:
                        return Flow$Type.REFUND_P2P_FIAT_PAYMENT;
                    case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                        return Flow$Type.INVEST_EQUITY_CUSTOMER_ONBOARDING;
                    case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                        return Flow$Type.RETROACTIVE_FINANCING_OVERVIEW_FLOW;
                    case SDK_ASSET_ICON_SUBMIT_VALUE:
                        return Flow$Type.LINK_CARD_AUTH;
                    case SDK_ASSET_ICON_SUBTRACT_VALUE:
                        return Flow$Type.EDIT_PAYCHECK_ALLOCATION;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                        return Flow$Type.DISABLE_RECURRING_CRYPTO_BUY;
                    case 224:
                        return Flow$Type.DISABLE_RECURRING_CRYPTO_BUY_2;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE:
                        return Flow$Type.UPSELL_LINKED_DEBIT;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                        return Flow$Type.MULTI_APPROVE_SPONSORSHIP;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                        return Flow$Type.INITIATE_SEND_BITCOIN;
                    case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                        return Flow$Type.SKIP_SCHEDULED_RECURRING_PAYMENT;
                    case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                        return Flow$Type.VIEW_PAYMENT_PLAN_FLOW;
                    case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                        return Flow$Type.RESEND_SPONSORSHIP_FEATURE_INVITATION_REQUEST;
                    case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                        return Flow$Type.APPROVE_DEPENDENT_DISPUTE;
                    case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                        return Flow$Type.REQUIREMENT_WRAPPER;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                        return Flow$Type.EDIT_BUSINESS_LOCATION_FLOW;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                        return Flow$Type.VERIFY_INSTRUMENT_ACCESS_FLOW;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                        return Flow$Type.CREATE_SECONDARY_PROFILE;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                        return Flow$Type.EDIT_BUSINESS_CATEGORY_FLOW;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                        return Flow$Type.EDIT_INSTAGRAM_FOR_C4B_FLOW;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                        return Flow$Type.DISPUTE_STEP_UP;
                    case 239:
                        return Flow$Type.GLOBAL_SOURCE_OF_FUNDS_COLLECTION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                        return Flow$Type.CBCA_CAPSULE_JUNE_2023;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                        return Flow$Type.INSTRUMENT_SELECTION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                        return Flow$Type.CARD_ORDER_STATUS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                        return Flow$Type.DISCOVER_CASH_CARD_UPSELL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                        return Flow$Type.SET_ADDRESS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                        return Flow$Type.ACCOUNT_RECOVERY;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                        return Flow$Type.INITIATE_MULTICURRENCY_PAYMENT_FOR_REGION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                        return Flow$Type.INITIATE_MULTICURRENCY_PAYMENT_FOR_RECIPIENT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                        return Flow$Type.BORROW_ONBOARDING;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE:
                        return Flow$Type.INVEST_YOUR_PAYCHECK_CONFIRMATION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                        return Flow$Type.POSTBANK_RETRIEVE_BANKING_INFORMATION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                        return Flow$Type.ENABLE_BALANCE_BASED_ADD_CASH;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                        return Flow$Type.EDIT_BALANCE_BASED_ADD_CASH_MINIMUM_BALANCE_AMOUNT;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                        return Flow$Type.EDIT_BALANCE_BASED_ADD_CASH_INCREMENT_AMOUNT;
                    case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                        return Flow$Type.DISABLE_BALANCE_BASED_ADD_CASH;
                    case 255:
                        return Flow$Type.INVEST_GRADUATE_SPONSORSHIP;
                    case 256:
                        return Flow$Type.PLAN_TODAY_FLOW;
                    case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                        return Flow$Type.ACCEPT_MULTICURRENCY_QUOTE;
                    case SDK_ASSET_HEADER_BOLT_VALUE:
                        return Flow$Type.CRYPTO_INVEST_CURRENCY_EXCHANGE_ROW;
                    case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                        return Flow$Type.EXEMPLAR_BLOCKER_SHOWCASE;
                    case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_TREEHOUSE_RESUME_TO_PLASMA;
                    case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                        return Flow$Type.C4B_ONBOARDING;
                    case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                        return Flow$Type.C4B_KYB;
                    case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                        return Flow$Type.EDIT_BUSINESS_NAME_FLOW;
                    case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                        return Flow$Type.PLASMA_REQUIREMENT_WRAPPER_FOR_FRANKLIN;
                    case SDK_ASSET_HEADER_SHIELD_VALUE:
                        return Flow$Type.PIGGYBANK_SAVINGS_AUTO_SAVE;
                    case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                        return Flow$Type.CANCEL_REMIT;
                    case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                        return Flow$Type.PIGGYBANK_AUTO_SAVE_ONBOARDING;
                    case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                        return Flow$Type.BANK_AND_WIRES_TRANSFER_V2;
                    case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                        return Flow$Type.REVIEW_EXISTING_DISPUTE_REQUEST;
                    case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                        return Flow$Type.WIRE_TRANSFER_VERIFY_IDENTITY;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE:
                        return Flow$Type.WIRE_TRANSFER_VIEW_ACCOUNT_DETAILS;
                    case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                        return Flow$Type.INITIATE_LOAN;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                        return Flow$Type.BUSINESS_ACCOUNT_CREATION;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                        return Flow$Type.PERSONAL_USE_WARNING;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                        return Flow$Type.MANAGED_CUSTOMER_REQUEST;
                    case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                        return Flow$Type.COLLECT_LEGAL_NAME;
                    case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                        return Flow$Type.INITIATE_LOAN_PAYMENT;
                    case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_VIA_CANCELABLE_SUBFLOW_FLOW;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                        return Flow$Type.PERSONAL_INFORMATION_REFRESH_FLOW;
                    case 280:
                        return Flow$Type.C4B_KYB_REMEDIATION;
                    case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                        return Flow$Type.BANKING_ADD_BILLER;
                    case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                        return Flow$Type.BANKING_PAY_BILL;
                    case SDK_ASSET_ILLUSTRATION_CARD_VALUE:
                        return Flow$Type.INITIATE_TAX_UPGRADE_V2;
                    case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                        return Flow$Type.ACCOUNT_RECOVERY_ACCOUNT_IDENTIFICATION_SUBFLOW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                        return Flow$Type.REVIEW_P2P_REFUND_REQUEST;
                    case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                        return Flow$Type.CAP_SPLIT_PAYMENT_OWNER;
                    case SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE:
                        return Flow$Type.CAP_SPLIT_PAYMENT_PARTICIPANT;
                    case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                        return Flow$Type.W9_WEBVIEW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE:
                        return Flow$Type.REFERRAL_PROGRAM;
                    case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                        return Flow$Type.DRAKE_PRESALE_FALL_2023;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                        return Flow$Type.PERSONAL_USE_VIOLATION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                        return Flow$Type.C4B_SAM_PERSONAL_FEATURE_RESTRICTED;
                    case SDK_ASSET_LOADING_INDICATOR_VALUE:
                        return Flow$Type.TIDAL_DISCOUNT_DEC_2023;
                    case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                        return Flow$Type.STANDALONE_DIDV;
                    case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                        return Flow$Type.DX_ALPHA_FLOW;
                    case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                        return Flow$Type.DX_BETA_FLOW;
                    case SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE:
                        return Flow$Type.C4B_KYB_PERSONAL_FEATURE_RESTRICTED_FLOW;
                    case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                        return Flow$Type.REMIT_NOTIFICATION_MESSAGE;
                    case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
                        return Flow$Type.DIDV_REFRESH;
                    case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                        return Flow$Type.EXEMPLAR_DUMMY_IDLE_FLOW;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                        return Flow$Type.DISPUTE_ADD_EVIDENCE_POST_SUBMISSION;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                        return Flow$Type.SPONSORSHIP_INFO_NOTIFICATION;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                        return Flow$Type.REMIT_SCAM_FLOW;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                        return Flow$Type.CONFIRM_REQUESTOR_INFORMATION;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                        return Flow$Type.CASH_LOCAL_ONBOARDING;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                        return Flow$Type.BANKING_EBILL_FURTHER_ACTION;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                        return Flow$Type.BUSINESS_IDV;
                    case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                        return Flow$Type.REVIEW_RECEIPTS;
                    case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_DARK_APPEARANCE_VALUE:
                        return Flow$Type.C4B_SQ_ONBOARDING;
                    case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                        return Flow$Type.CARD_SPENDING_INSIGHTS_NUX;
                    case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                        return Flow$Type.ACQUIRE_CREDIT;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                        return Flow$Type.ACCOUNT_RECOVERY_VERIFY_LINKED_CASH_CARD;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                        return Flow$Type.ACCOUNT_RECOVERY_VERIFY_LINKED_DEBIT_CARD;
                    case SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE:
                        return Flow$Type.CONFIRM_PATH_TO_BORROW;
                    case 320:
                        return Flow$Type.LINK_BANK_TO_BORROW;
                    case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                        return Flow$Type.DIRECT_DEPOSIT_SWITCH_TO_BORROW;
                    case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                        return Flow$Type.CREATE_SECONDARY_PERSONAL_PROFILE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                        return Flow$Type.RESUME_P2P_FIAT_PAYMENT;
                    case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                        return Flow$Type.BLOCK_UNBLOCK_CARD_MERCHANT;
                    case SDK_ASSET_ICON_REPORT_VALUE:
                        return Flow$Type.BITCOIN_WITHDRAWAL_ACCEPT_SCAM_WARNING;
                    case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                        return Flow$Type.CASH_LOCAL_SIGNUP_BONUS_PAYOUT;
                    case SDK_ASSET_ICON_UPLOAD_VALUE:
                        return Flow$Type.BANKING_REMOVE_BILLER;
                    case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                        return Flow$Type.PAYCHECKS_HOME_DIRECT_DEPOSIT;
                    case SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE:
                        return Flow$Type.INSTANT_VIRTUAL_CARD_ACCESS;
                    case 330:
                        return Flow$Type.UPDATE_ALIAS;
                    case 331:
                        return Flow$Type.MERCHANT_BLOCK_INFO;
                    case 332:
                        return Flow$Type.DIRECT_DEPOSIT_UPSELL;
                    case 333:
                        return Flow$Type.CHANGE_LOAN_AUTOPAY;
                    case 334:
                        return Flow$Type.SET_BLOCK_STATE;
                    case 335:
                        return Flow$Type.INITIATE_BITCOIN_DEPOSIT_REVERSAL;
                    case 336:
                        return Flow$Type.BANKING_DISCONNECT_BILL;
                    case 337:
                        return Flow$Type.GRANTLY_SECURITY_LOCK;
                    case 339:
                        return Flow$Type.BANKING_EDIT_BILL_NICKNAME;
                    case 340:
                        return Flow$Type.C4B_SAM_PERSONAL_ACCOUNT_INTRO;
                    case 341:
                        return Flow$Type.PAYCHECKS_APPLET_ONBOARDING;
                    case 342:
                        return Flow$Type.C4B_TRANSFER_INVEST_EQUITY_ASSETS_FLOW;
                    case 343:
                        return Flow$Type.LINK_BANK_ACCOUNT_FOR_ENHANCED_VERIFICATION;
                    case 344:
                        return Flow$Type.C4B_FEATURE_RESTRICTION_DOWNGRADE_FLOW;
                    case 345:
                        return Flow$Type.BANKING_RECONNECT_BILL;
                    case 346:
                        return Flow$Type.REMEDIATE_IDV;
                    case 347:
                        return Flow$Type.VIEW_AP_PAYMENT_PLAN_FLOW;
                    case 348:
                        return Flow$Type.C4B_AUTO_DOWNGRADED;
                    case 349:
                        return Flow$Type.RE_IDV;
                    case 350:
                        return Flow$Type.P2P_SELECT_ISSUE_TYPE;
                    case 351:
                        return Flow$Type.REVIEW_PERSONAL_INFORMATION;
                    case 352:
                        return Flow$Type.C4B_TTP_ONBOARDING;
                    case 353:
                        return Flow$Type.JANUS_HAS_PASSCODE;
                    case 354:
                        return Flow$Type.UPLOAD_DEBIT_CARD_PHOTO_FOR_ENHANCED_VERIFICATION;
                    case 355:
                        return Flow$Type.RAFFLE_BUY;
                    case 356:
                        return Flow$Type.PORTFOLIO_PLAYGROUND;
                    case 357:
                        return Flow$Type.OAUTH_OIDC;
                    case 358:
                        return Flow$Type.C4B_TTP_RECEIPTS;
                    case 359:
                        return Flow$Type.INPUT_INFO_RE_EIDV;
                    case 360:
                        return Flow$Type.EDIT_INFO_RE_EIDV;
                    case 361:
                        return Flow$Type.LOCAL_TESTING_RE_IDV;
                    case 362:
                        return Flow$Type.CASH_LOCAL_ONBOARDING_FROM_IN_APP_UPSELL;
                    case 363:
                        return Flow$Type.OMS_INITIATE_AP_LOAN_PAYMENT_FLOW;
                    case 364:
                        return Flow$Type.OMS_VIEW_AP_PAYMENT_PLAN_FLOW;
                    case 365:
                        return Flow$Type.DEPENDENT_P2P_POSSIBLE_UNKNOWN_PEER_CONTEXT;
                    case 366:
                        return Flow$Type.P2P_ACTIONABLE_CLAIM;
                    case 367:
                        return Flow$Type.P2P_NON_ACTIONABLE_CLAIM;
                    case 368:
                        return Flow$Type.LOGIN_V2;
                    case 369:
                        return Flow$Type.CONVERT_STANDARD_CASH_OUT_TO_INSTANT;
                    case Constants.ID_KROGER /* 370 */:
                        return Flow$Type.RE_EIDV;
                    case 371:
                        return Flow$Type.P2P_BAM_APPEAL;
                    case 372:
                        return Flow$Type.OMS_VIEW_DOCUMENT_SELECTION_FLOW;
                    case 373:
                        return Flow$Type.DISPLAY_NAME;
                    case 375:
                        return Flow$Type.CANCEL_SPONSORSHIP;
                    case 376:
                        return Flow$Type.SET_SAVINGS_GOAL_V2;
                    case 377:
                        return Flow$Type.LIVENESS_VERIFICATION;
                    case 378:
                        return Flow$Type.REQUEST_SPONSOR_LED_SPONSORSHIP;
                    case 379:
                        return Flow$Type.APPROVE_SPONSOR_LED_SPONSORSHIP;
                    case 380:
                        return Flow$Type.C4B_TTP_REFUND;
                    case 381:
                        return Flow$Type.INITIATE_BITCOIN_WITHDRAWAL_DOMAIN;
                    case 382:
                        return Flow$Type.C4B_KYB_INVALIDATED_IDV;
                    case 383:
                        return Flow$Type.INVEST_EQUITY_TRADE_BUY;
                    case MLKEMEngine.KyberPolyBytes /* 384 */:
                        return Flow$Type.INVEST_EQUITY_TRADE_SELL;
                    case 385:
                        return Flow$Type.TRANSFER_CASHTAG;
                    case 386:
                        return Flow$Type.ENABLE_SECURITY_LOCK_FOR_MOVE_MONEY;
                    case 387:
                        return Flow$Type.AFTERPAY_CARD_FINANCE_FEE;
                    case 388:
                        return Flow$Type.LENDING_IDENTITY_RE_VERIFICATION;
                    case 389:
                        return Flow$Type.CASH_LOCAL_LINK_DEBIT_EDUCATION;
                    case 390:
                        return Flow$Type.UPDATE_SAVINGS_GOAL_V2;
                    case 391:
                        return Flow$Type.REMOVE_SAVINGS_GOAL_V2;
                    case 392:
                        return Flow$Type.PLASMA_REQUIREMENT_WRAPPER_DEMO;
                    case 393:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_WITH_PARAMETERS;
                    case 394:
                        return Flow$Type.EDIT_PAYCHECK_MULTI_ALLOCATION;
                    case 395:
                        return Flow$Type.LINK_BANK_ACCOUNT;
                    case 396:
                        return Flow$Type.LINK_BANK_ACCOUNT_PLAID;
                    case 397:
                        return Flow$Type.LINK_BANK_ACCOUNT_MANUAL;
                    case 398:
                        return Flow$Type.CASH_LOCAL_MINIMAL_ONBOARDING_FLOW;
                    case 399:
                        return Flow$Type.OMS_CHANGE_LOAN_AUTOPAY_FLOW;
                    case 400:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_CUSTOM_BLOCKER;
                    case HttpStatusCode.UNAUTHORIZED_401 /* 401 */:
                        return Flow$Type.INITIATE_CASH_CARD_DISPUTE;
                    case 402:
                        return Flow$Type.AFTERPAY_APPLET_ONBOARDING;
                    case 403:
                        return Flow$Type.AFTERPAY_CARD_AVAILABLE_TO_SPEND;
                    case HttpStatusCode.NOT_FOUND_404 /* 404 */:
                        return Flow$Type.INITIATE_BITCOIN_DEPOSIT_CONFIRMATION;
                    case 405:
                        return Flow$Type.OMS_INITIATE_LOAN_PAYMENT_FLOW;
                    case 406:
                        return Flow$Type.CONFIRM_PHONE_SUPPORT_ATTEMPT_FLOW;
                    case 407:
                        return Flow$Type.VIEW_CLAIM_SUBMISSION;
                    case HttpStatusCode.CONFLICT_409 /* 409 */:
                        return Flow$Type.SCAM_SUSPENSION_STATE;
                    case 410:
                        return Flow$Type.APPEALS_SUBMISSION;
                    case 411:
                        return Flow$Type.REDIRECT_TEST_FLOW;
                    case 412:
                        return Flow$Type.C4B_TTP_PAYMENT_ELIGIBILITY_CHECK;
                    case HttpStatusCode.PAYLOAD_TOO_LARGE_413 /* 413 */:
                        return Flow$Type.CASH_LOCAL_COMPLETE_ORDER;
                    case 414:
                        return Flow$Type.SAVINGS_TRANSFER_FLOW;
                    case 415:
                        return Flow$Type.REQUEST_P2P_FIAT_PAYMENT;
                    case 416:
                        return Flow$Type.SAVINGS_UNSUPPORTED_FLOW;
                    case 417:
                        return Flow$Type.VIEW_CLAIM_RESOLUTION_EXPLANATION;
                    case 418:
                        return Flow$Type.SET_SCHEDULED_RELOAD;
                    case 419:
                        return Flow$Type.CRYPTO_INVEST_CHANGE_RECURRING_BUY;
                    case 420:
                        return Flow$Type.CHANGE_BITCOIN_WITHDRAWAL_SPEED;
                    case 421:
                        return Flow$Type.REPORT_PROFILE_WITH_DETAILS;
                    case HttpStatusCode.UNPROCESSABLE_ENTITY_422 /* 422 */:
                        return Flow$Type.INITIATE_BITCOIN_LIGHTNING_WITHDRAWAL_DOMAIN;
                    case 423:
                        return Flow$Type.MANAGE_SAVINGS_ROUND_UPS;
                    case 424:
                        return Flow$Type.LINK_INSTRUMENT_CUSTOMER_DENYLISTED;
                    case 425:
                        return Flow$Type.FACTOR_VERIFICATION;
                    case 426:
                        return Flow$Type.SHOW_CARD_DETAILS;
                    case 427:
                        return Flow$Type.BITCOIN_WITHDRAWAL_SELF_ATTESTATION;
                    case 428:
                        return Flow$Type.ACCOUNT_LINKING;
                    case HttpStatusCode.TOO_MANY_REQUESTS_429 /* 429 */:
                        return Flow$Type.THREE_DS_AUTHENTICATION;
                    case 430:
                        return Flow$Type.BITCOIN_SCAM_PROTECTION;
                    case 431:
                        return Flow$Type.DISPLAY_NAME_MIGRATION;
                    case 432:
                        return Flow$Type.VERIFY_EMAIL;
                    case 433:
                        return Flow$Type.VERIFY_PHONE_NUMBER;
                    case 434:
                        return Flow$Type.SPONSOR_ONBOARDING_CONTROLS;
                    case 435:
                        return Flow$Type.ACCOUNT_IDENTIFICATION;
                    case 436:
                        return Flow$Type.PREAUTHENTICATED_TRUST_PILOT_REVIEW;
                    case 437:
                        return Flow$Type.MONEY_POOL_OWNER_CONTRIBUTION;
                    case 438:
                        return Flow$Type.SEND_POOL_CONTRIBUTION_PAYMENT;
                    case 439:
                        return Flow$Type.ENTER_REFERRAL_CODE;
                    case 440:
                        return Flow$Type.ACCESS_ORCHESTRATOR;
                    case 441:
                        return Flow$Type.SEND_OON_POOL_CONTRIBUTION_PAYMENT;
                    case 442:
                        return Flow$Type.BITCOIN_IDV;
                    case 443:
                        return Flow$Type.CLOSE_MONEY_POOL;
                    case 444:
                        return Flow$Type.LEAVE_MONEY_POOL;
                    case 445:
                        return Flow$Type.REFERRAL_STATUS;
                    case 446:
                        return Flow$Type.VERIFY_PASSCODE;
                    case 447:
                        return Flow$Type.INAUTHENTIC_ACCOUNT_SUSPENSION_STATE;
                    case 448:
                        return Flow$Type.ALIAS_MANAGEMENT;
                    case 449:
                        return Flow$Type.BITCOIN_SCAM_INFO;
                    case 450:
                        return Flow$Type.AUTOMATIONS_EDIT_PAYCHECK_MULTI_ALLOCATION;
                    case 451:
                        return Flow$Type.ONBOARDING_ENTER_REFERRAL_CODE;
                    case 452:
                        return Flow$Type.SIGNUP;
                    case 453:
                        return Flow$Type.INVEST_OPT_OUT_OF_CONVERSION;
                    case Constants.METRO_BY_T_MOBILE /* 454 */:
                        return Flow$Type.REPORT_MISSING_BOOST;
                    case 455:
                        return Flow$Type.VIEW_MONEY_POOL;
                    case 456:
                        return Flow$Type.PROMOTION_OPT_IN;
                    case 457:
                        return Flow$Type.INITIATE_CLAIM;
                    case 458:
                        return Flow$Type.TRANSFER_IN_SETUP_FLOW;
                    case 459:
                        return Flow$Type.TRANSFER_OUT_SETUP_FLOW;
                    case 460:
                        return Flow$Type.TRANSACTION_EDIT_AND_CONFIRM_FLOW;
                    case 461:
                        return Flow$Type.TRANSFER_OPTION_SELECTION_FLOW;
                    case 462:
                        return Flow$Type.INITIATE_CASH_APP_PAY_CLAIM;
                    case 463:
                        return Flow$Type.RESOLVE_B_NOTICE;
                    case 464:
                        return Flow$Type.TOGGLE_PREPURCHASE;
                    case 465:
                        return Flow$Type.ADD_MONEY_TO_SAVINGS_BALANCE;
                    case 466:
                        return Flow$Type.WITHDRAW_MONEY_FROM_SAVINGS_BALANCE;
                    case 468:
                        return Flow$Type.DEBIT_FLEX_CARD_ONBOARDING;
                    case 469:
                        return Flow$Type.PREPURCHASE_UPGRADE;
                    case 470:
                        return Flow$Type.HUMAN_CONFIRMATION;
                    case 471:
                        return Flow$Type.APPROVE_FAMILY_SAVINGS_YIELD;
                    case 472:
                        return Flow$Type.SEND_OON_P2P_PAYMENT;
                    case 473:
                        return Flow$Type.W9_CONSENT_COLLECTION;
                    case 474:
                        return Flow$Type.MAGIC_LINK;
                    case 475:
                        return Flow$Type.CASH_OUT_INSTRUMENT_SELECTION_FLOW;
                    case 476:
                        return Flow$Type.CASH_IN_INSTRUMENT_SELECTION_FLOW;
                    case 477:
                        return Flow$Type.EXEMPLAR_ORDER_PIZZA_WITH_MONEYBOT;
                    case 478:
                        return Flow$Type.SAVINGS_RESOLVE_B_NOTICE;
                    case 480:
                        return Flow$Type.SPONSOR_LED_KID_ONBOARDING;
                    case 481:
                        return Flow$Type.PREPURCHASE_INELIGIBLE;
                    case 482:
                        return Flow$Type.DEVICE_MANAGEMENT;
                    case 483:
                        return Flow$Type.C4B_LISTING_CREATION_ELIGIBILITY_CHECK;
                    case 484:
                        return Flow$Type.PROMOTIONS_SPONSOR_AUTHORIZATION_APPROVAL;
                    case 485:
                        return Flow$Type.PROMOTIONS_TEEN_AUTHORIZATION_REQUEST_STATUS;
                    case 486:
                        return Flow$Type.C4B_LISTING_PAYMENT;
                    case 487:
                        return Flow$Type.DENYLIST_APPEAL;
                    case 488:
                        return Flow$Type.POOL;
                    case 489:
                        return Flow$Type.CANCEL_STANDARD_CASH_OUT;
                    case 490:
                        return Flow$Type.WEB_PASSKEY_UPSELL;
                    case 491:
                        return Flow$Type.ENABLE_SCHEDULED_RELOAD;
                    case 492:
                        return Flow$Type.UPDATE_SCHEDULED_RELOAD_AMOUNT;
                    case 493:
                        return Flow$Type.UPDATE_SCHEDULED_RELOAD_FREQUENCY;
                    case 494:
                        return Flow$Type.CRYPTO_INVEST_CURRENCY_EXCHANGE_SPARKY;
                    case 495:
                        return Flow$Type.ADD_MONEY_TO_SAVINGS_BALANCE_ALIAS;
                    case 496:
                        return Flow$Type.P2P_SENDER_CONFIRM_RECIPIENT_PHONE;
                    case 497:
                        return Flow$Type.SEND_OON_P2P_PAYMENT_FOR_CASHTAG;
                    case 498:
                        return Flow$Type.VALIDATE_P2P_PAYMENT;
                    case 499:
                        return Flow$Type.P2P_CREATE_PAYMENT_LINK;
                    case 500:
                        return Flow$Type.GPT_STORE_CONFIRM_ACTION;
                    case 501:
                        return Flow$Type.RECURRING_TRANSACTION;
                    case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                        return Flow$Type.RECURRING_TRANSACTION_SETUP;
                    case 503:
                        return Flow$Type.DISABLE_SCHEDULED_RELOAD;
                    case 504:
                        return Flow$Type.RECURRING_EDIT;
                    case 505:
                        return Flow$Type.ASSIGN_NEW_CASHTAG;
                    case 506:
                        return Flow$Type.SIGN_OUT_OF_DEVICE;
                    case 507:
                        return Flow$Type.STABLECOIN_WITHDRAWAL;
                    case 508:
                        return Flow$Type.REDIRECT_STABLECOIN_DEPOSIT;
                    case 509:
                        return Flow$Type.CANCEL_PENDING_NOTARY_REVIEW_BITCOIN_WITHDRAWAL;
                    case 510:
                        return Flow$Type.REQUEST_TAP_TO_PAY_DEVICE;
                    case 511:
                        return Flow$Type.LINK_CARD_TO_MERCHANTS;
                    case 512:
                        return Flow$Type.CARD_ORDERING_FLOW;
                    case 513:
                        return Flow$Type.INVEST_EQUITY_CUSTOMER_ONBOARDING_V2;
                    case 514:
                        return Flow$Type.INDIVIDUAL_ACCOUNT_ONBOARDING_V2;
                    case 515:
                        return Flow$Type.CUSTODIAL_ACCOUNT_ONBOARDING_V2;
                    case 516:
                        return Flow$Type.REQUEST_PUSH_NOTIFICATIONS;
                    case 517:
                        return Flow$Type.SELECT_PAYMENT_DEVICE;
                    case 518:
                        return Flow$Type.LINK_BANK_ACCOUNT_PLAID_THEN_REDIRECT;
                    case 519:
                        return Flow$Type.TRANSACTION_AUTHENTICATION;
                    case 520:
                        return Flow$Type.CAPITAL_ONE_DDS_AUTHENTICATION;
                    case 521:
                        return Flow$Type.RESTRICTION_HOLDING_PERIOD_INFO;
                    case 522:
                        return Flow$Type.RESTRICTION_CANT_SEND_INFO;
                    case 523:
                        return Flow$Type.CREATE_CARD_DESIGN_V2;
                    case 524:
                        return Flow$Type.ORDER_PAYMENT_TOKEN_DEVICE;
                    case 525:
                        return Flow$Type.PROVISION_PAYMENT_TOKEN_DEVICE;
                    case 526:
                        return Flow$Type.DEPROVISION_PAYMENT_TOKEN_DEVICE;
                    case 527:
                        return Flow$Type.P2P_INSUFFICIENT_FUNDS;
                    case 528:
                        return Flow$Type.VALIDATE_CARD_ORDER_ELIGIBILITY;
                    case 529:
                        return Flow$Type.SECONDARY_BUSINESS_ACCOUNT_ELIGIBILITY_FLOW;
                    case 530:
                        return Flow$Type.GET_WALLET_ADDRESSES;
                    case 531:
                        return Flow$Type.LOCK_PAYMENT_TOKEN_DEVICE;
                    case 532:
                        return Flow$Type.UNLOCK_PAYMENT_TOKEN_DEVICE;
                    case 533:
                        return Flow$Type.SUSPENSION_STATE;
                    case 534:
                        return Flow$Type.ELIGIBILITY_VIOLATION_RESOLUTION;
                    case 535:
                        return Flow$Type.TRUST_HUB_ALERT_POC;
                    case 537:
                        return Flow$Type.SET_CASHTAG_IN_PROFILE;
                    case 538:
                        return Flow$Type.RESUME_POOL_CONTRIBUTION_PAYMENT;
                    case 539:
                        return Flow$Type.WITHDRAW_CLAIM;
                    case 540:
                        return Flow$Type.P2P_INSTRUMENT_SELECTION;
                    case 541:
                        return Flow$Type.STABLECOIN_DEPOSIT_ELIGIBILITY;
                    case 542:
                        return Flow$Type.SQUARE_STAFF_ONBOARDING;
                    case 543:
                        return Flow$Type.SECURITY_LOCK_UPSELL_WITH_PASSCODE_CREATION_SUBFLOW;
                    case 544:
                        return Flow$Type.PHONE_PLAN_ENROLLMENT;
                    case 545:
                        return Flow$Type.CASH_SUBSCRIPTION_PAYMENT;
                    case 546:
                        return Flow$Type.P2P_RECOVERABLE_FUNDING_FAILURE;
                    case 547:
                        return Flow$Type.PROMOTIONS_SPONSOR_AUTHORIZATION_APPROVAL_ALL_TEENS;
                    case 548:
                        return Flow$Type.CREATE_JOINT_ACCOUNT;
                    case 549:
                        return Flow$Type.CRYPTO_INVEST_CONVERSION_P2P_INFLOWS;
                    case 550:
                        return Flow$Type.ORDER_PAYMENT_DEVICE;
                    case 551:
                        return Flow$Type.EARNER_ONBOARDING_FLOW;
                    case 552:
                        return Flow$Type.DENYLIST_APPEAL_VERIFICATION;
                    case 553:
                        return Flow$Type.PHONE_PLAN_INSTALLATION;
                    case 554:
                        return Flow$Type.PHONE_PLAN_PORT_STATUS;
                    case 555:
                        return Flow$Type.ORDER_PAYMENT_CARD;
                    case 556:
                        return Flow$Type.LOGIN_ACCOUNT_IDENTIFICATION;
                    case 557:
                        return Flow$Type.CONTEXTUAL_ONBOARDING_AUTH;
                    case 558:
                        return Flow$Type.DEBIT_FLEX_VIRTUAL_CARD_ISSUANCE;
                    case 559:
                        return Flow$Type.LOGIN_ACCOUNT_SELECTION;
                    case 560:
                        return Flow$Type.REPORT_PAYMENT_DEVICE;
                    case 561:
                        return Flow$Type.REPORT_PAYMENT_TOKEN_DEVICE;
                    case 562:
                        return Flow$Type.PHONE_PLAN_NEW_LINE_STATUS;
                    case 563:
                        return Flow$Type.PHONE_PLAN;
                    case 564:
                        return Flow$Type.CASH_LITE_ONBOARDING;
                    case 565:
                        return Flow$Type.CANCEL_RECURRING_PAYMENT;
                    case 566:
                        return Flow$Type.LINKED_BUSINESSES;
                    case 567:
                        return Flow$Type.CASH_LITE_KYC;
                    case 568:
                        return Flow$Type.AUTO_RELOAD_SETUP_BALANCE_BASED_ADD_CASH;
                    case 569:
                        return Flow$Type.CREATE_RECURRING_P2P_PAYMENT;
                    case 570:
                        return Flow$Type.PROVIDE_LEGAL_NAME_AND_BIRTHDATE;
                    case 571:
                        return Flow$Type.PHONE_PLAN_CANCELLATION;
                    case 572:
                        return Flow$Type.PHONE_PLAN_RESUME;
                    case 573:
                        return Flow$Type.AGENT_CREATION;
                    case 574:
                        return Flow$Type.PHONE_PLAN_DETAILS;
                    case 575:
                        return Flow$Type.PHONE_PLAN_PAYMENT;
                    case 576:
                        return Flow$Type.ADD_PASSKEY;
                    case 577:
                        return Flow$Type.AUTO_WITHDRAWAL_BITCOIN;
                    case 578:
                        return Flow$Type.ORDER_CASH_LITE_CARD;
                    case 579:
                        return Flow$Type.CASH_LITE_SELF_CUSTODIAL_PAYMENT;
                    case 580:
                        return Flow$Type.CASH_LITE_CASH_OUT;
                    case 581:
                        return Flow$Type.LITE_DISABLE_ISSUED_CARD;
                    case 582:
                        return Flow$Type.LITE_ENABLE_ISSUED_CARD;
                    case 583:
                        return Flow$Type.CASH_LITE_BITCOIN_WITHDRAWAL;
                    case 584:
                        return Flow$Type.DATA_SHARING_MANAGEMENT;
                    case 585:
                        return Flow$Type.FINISH_SETUP;
                    case 586:
                        return Flow$Type.GRADUATE_MANAGED_ACCOUNT;
                    case 587:
                        return Flow$Type.REPORT_CASH_LITE_CARD;
                    case 588:
                        return Flow$Type.CASH_LITE_RECOVERY;
                    case 589:
                        return Flow$Type.CASH_LITE_GOOGLE_PAY_PUSH_PROVISIONING;
                    case 590:
                        return Flow$Type.CASH_LITE_APPLE_PAY_PUSH_PROVISIONING;
                    case 591:
                        return Flow$Type.CASH_LITE_GOOGLE_PAY_APP_TO_APP_VERIFICATION;
                    case 592:
                        return Flow$Type.CASH_LITE_APPLE_PAY_APP_TO_APP_VERIFICATION;
                    case 593:
                        return Flow$Type.CASH_LOCAL_CHANGE_GEO;
                    case 594:
                        return Flow$Type.CUSTOMER_SELF_SERVICE_CANCEL_STANDARD_CASH_OUT;
                    case 595:
                        return Flow$Type.CANCEL_BILL_OR_SUBSCRIPTION;
                    case 596:
                        return Flow$Type.SUPERSTACKING;
                    case 597:
                        return Flow$Type.CASH_LITE_STABLECOIN_WITHDRAWAL;
                }
            }

            public static void writeArray(JsonWriter jsonWriter, int i, Function1 function1) {
                if (i == 1) {
                    function1.invoke(jsonWriter);
                    return;
                }
                jsonWriter.beginArray();
                function1.invoke(jsonWriter);
                jsonWriter.endArray();
            }

            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
            public SocketAdapter create(SSLSocket sSLSocket) {
                Class<?> cls = sSLSocket.getClass();
                Class<?> cls2 = cls;
                while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
                    cls2 = cls2.getSuperclass();
                    if (cls2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m((Class) cls, "No OpenSSLSocketImpl superclass of socket of type "));
                        return null;
                    }
                }
                return new AndroidSocketAdapter(cls2);
            }

            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
            public boolean matchesSocket(SSLSocket sSLSocket) {
                return StringsKt__StringsJVMKt.startsWith(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
            }

            public String toJson(ExifInterface exifInterface) {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                jsonWriter.beginObject();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap[] hashMapArr = exifInterface.mAttributes;
                ArrayList arrayList = new ArrayList();
                for (HashMap hashMap : hashMapArr) {
                    hashMap.getClass();
                    CollectionsKt__MutableCollectionsKt.addAll(hashMap.entrySet(), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!linkedHashSet.contains((String) ((Map.Entry) next).getKey())) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    Serializable value = ((ExifInterface.ExifAttribute) entry.getValue()).getValue(exifInterface.mExifByteOrder);
                    if (value != null) {
                        Function1 valueWriter = valueWriter(value);
                        if (valueWriter != null) {
                            JsonWriter name = jsonWriter.name(str);
                            name.getClass();
                            valueWriter.invoke(name);
                        }
                        str.getClass();
                        linkedHashSet.add(str);
                    }
                }
                jsonWriter.endObject();
                jsonWriter.close();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                return stringWriter2;
            }

            public Function1 valueWriter(Object obj) {
                if (obj == null) {
                    return new FlowStarter$$ExternalSyntheticLambda0(27);
                }
                if (obj instanceof String) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(obj, 26);
                }
                if (obj instanceof Long) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(obj, 1);
                }
                if (obj instanceof Double) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(obj, 2);
                }
                if (obj instanceof Number) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(obj, 3);
                }
                if (obj instanceof Boolean) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(obj, 4);
                }
                if (obj instanceof ExifInterface.Rational) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(obj, 5);
                }
                if (obj instanceof double[]) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 6);
                }
                if (obj instanceof float[]) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 7);
                }
                if (obj instanceof long[]) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 8);
                }
                if (obj instanceof ULongArray) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 11);
                }
                if (obj instanceof int[]) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 20);
                }
                if (obj instanceof UIntArray) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 21);
                }
                if (obj instanceof short[]) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 22);
                }
                if (obj instanceof UShortArray) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 23);
                }
                if (obj instanceof byte[]) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 24);
                }
                if (obj instanceof UByteArray) {
                    return new LazyListIntervalContent$$ExternalSyntheticLambda0(this, obj, 25);
                }
                if (obj instanceof Object[]) {
                    return new BadgedBoxKt$$ExternalSyntheticLambda0(14, obj, this);
                }
                Timber.Forest.e(new AssertionError(Recorder$$ExternalSyntheticOutline2.m("unhandled type, type=", Reflection.factory.getOrCreateKotlinClass(obj.getClass()).getQualifiedName())));
                return null;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static EnableCryptocurrencyTransferInStatus m3945fromValue(int i) {
                if (i == 1) {
                    return EnableCryptocurrencyTransferInStatus.DEPOSITS_DISALLOWED;
                }
                if (i == 2) {
                    return EnableCryptocurrencyTransferInStatus.DEPOSITS_CAN_ENABLE;
                }
                if (i == 3) {
                    return EnableCryptocurrencyTransferInStatus.DEPOSITS_PENDING_REVIEW;
                }
                if (i == 4) {
                    return EnableCryptocurrencyTransferInStatus.DEPOSITS_ENABLED;
                }
                if (i != 5) {
                    return null;
                }
                return EnableCryptocurrencyTransferInStatus.DEPOSITS_MISMATCHED_IDV;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static VerifyInstrumentResponse.Status m3944fromValue(int i) {
                if (i == 0) {
                    return VerifyInstrumentResponse.Status.INVALID;
                }
                if (i == 1) {
                    return VerifyInstrumentResponse.Status.SUCCESS;
                }
                if (i == 2) {
                    return VerifyInstrumentResponse.Status.FAILURE;
                }
                if (i == 3) {
                    return VerifyInstrumentResponse.Status.TOO_MANY_ATTEMPTS;
                }
                if (i != 4) {
                    return null;
                }
                return VerifyInstrumentResponse.Status.CONCURRENT_MODIFICATION;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static RegisterSmsResponse.Status m3943fromValue(int i) {
                if (i == 0) {
                    return RegisterSmsResponse.Status.INVALID;
                }
                if (i == 1) {
                    return RegisterSmsResponse.Status.SUCCESS;
                }
                if (i == 2) {
                    return RegisterSmsResponse.Status.INVALID_SMS_NUMBER;
                }
                if (i == 3) {
                    return RegisterSmsResponse.Status.TOO_MANY_REQUESTS;
                }
                if (i == 5) {
                    return RegisterSmsResponse.Status.DUPLICATE_SMS_NUMBER;
                }
                if (i != 6) {
                    return null;
                }
                return RegisterSmsResponse.Status.CUSTOMER_DOES_NOT_EXIST;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static SyncValueType m3947fromValue(int i) {
                switch (i) {
                    case 0:
                        return SyncValueType.DO_NOT_USE_SYNC_VALUE_TYPE;
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 79:
                    case 80:
                    case 101:
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    case 125:
                    case 140:
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    default:
                        return null;
                    case 2:
                        return SyncValueType.INSTRUMENT;
                    case 11:
                        return SyncValueType.EQUITIES_PURCHASE_ATM_PICKER;
                    case 12:
                        return SyncValueType.BITCOIN_PURCHASE_ATM_PICKER;
                    case 13:
                        return SyncValueType.BALANCE_SNAPSHOT;
                    case 14:
                        return SyncValueType.DDA;
                    case 15:
                        return SyncValueType.ACCESS;
                    case 16:
                        return SyncValueType.ADDRESS;
                    case 17:
                        return SyncValueType.STATUS_AND_LIMITS;
                    case 18:
                        return SyncValueType.APP_MESSAGES;
                    case 19:
                        return SyncValueType.CORE_CUSTOMER;
                    case 20:
                        return SyncValueType.EXPERIMENTS;
                    case 21:
                        return SyncValueType.ISSUED_CARD;
                    case 22:
                        return SyncValueType.MARKETING;
                    case 23:
                        return SyncValueType.P2P_SETTINGS;
                    case 24:
                        return SyncValueType.SCHEDULED_PAYMENTS;
                    case 25:
                        return SyncValueType.TAX;
                    case 26:
                        return SyncValueType.PUBLIC_PROFILE;
                    case 27:
                        return SyncValueType.PROFILE_ALIAS;
                    case 28:
                        return SyncValueType.LOYALTY_PROFILE;
                    case 29:
                        return SyncValueType.CHECK_DEPOSIT_PROFILE;
                    case 30:
                        return SyncValueType.INVESTMENT_NOTIFICATION_SETTINGS;
                    case 31:
                        return SyncValueType.PROFILE_DETAILS;
                    case 32:
                        return SyncValueType.CRYPTO_WALLET;
                    case 33:
                        return SyncValueType.BANKING_TAB;
                    case 34:
                        return SyncValueType.JURISDICTION_CONFIG;
                    case 35:
                        return SyncValueType.CRYPTOCURRENCY;
                    case 36:
                        return SyncValueType.EXCHANGE_DATA;
                    case 37:
                        return SyncValueType.NOTIFICATION_PREFERENCE;
                    case 38:
                        return SyncValueType.DATA_PRIVACY_SETTINGS;
                    case 39:
                        return SyncValueType.PASSWORD_INFO;
                    case 40:
                        return SyncValueType.OTP_INFO;
                    case 41:
                        return SyncValueType.FAMILY_ACCOUNT;
                    case 42:
                        return SyncValueType.INVESTING_AUTOMATION;
                    case 43:
                        return SyncValueType.LENDING_INFO;
                    case 44:
                        return SyncValueType.TRUSTED_CONTACT;
                    case 45:
                        return SyncValueType.IDV_STATE;
                    case 46:
                        return SyncValueType.CRYPTOCURRENCY_PROFILE;
                    case 47:
                        return SyncValueType.INVEST_AUTOMATOR_NOTIFICATION_SETTINGS;
                    case 48:
                        return SyncValueType.FAVORITE;
                    case 49:
                        return SyncValueType.SAVINGS_CONFIG;
                    case 50:
                        return SyncValueType.SAVINGS_HOME;
                    case 51:
                        return SyncValueType.INVEST_PORTFOLIO_STATE;
                    case 52:
                        return SyncValueType.INVEST_TRADING_STATE;
                    case 53:
                        return SyncValueType.SAVINGS_FOLDER;
                    case 54:
                        return SyncValueType.TIGERS;
                    case 55:
                        return SyncValueType.WIRES;
                    case 56:
                        return SyncValueType.TAXUPG;
                    case 57:
                        return SyncValueType.TAXEFI;
                    case 58:
                        return SyncValueType.CASH_LIMITS;
                    case 59:
                        return SyncValueType.LIONS;
                    case 60:
                        return SyncValueType.DEVICE;
                    case 61:
                        return SyncValueType.LIMITS_PAGELET_INLINE_MESSAGE;
                    case 62:
                        return SyncValueType.SCHEMA_VERSIONS;
                    case 63:
                        return SyncValueType.CATS;
                    case 64:
                        return SyncValueType.INSTRUMENT_LINKING_OPTION;
                    case 65:
                        return SyncValueType.RABBITS;
                    case 66:
                        return SyncValueType.OVERDRAFT_STATUS;
                    case 67:
                        return SyncValueType.OVERDRAFT_USAGE;
                    case 68:
                        return SyncValueType.INSTRUMENT_LINKING_OPTIONS;
                    case 69:
                        return SyncValueType.IDENTITY_HUB_STATE;
                    case 70:
                        return SyncValueType.APP_LOCK;
                    case 71:
                        return SyncValueType.SPONSORSHIP_CRYPTO_AUTHORIZATION;
                    case 72:
                        return SyncValueType.OFFER_CUSTOMER_PREFERENCE;
                    case 73:
                        return SyncValueType.PASSKEY_OPTIONS;
                    case 74:
                        return SyncValueType.PAYCHECKS_ALLOCATION_DISTRIBUTION;
                    case 75:
                        return SyncValueType.PAYCHECKS_UI_CONFIGURATION;
                    case 76:
                        return SyncValueType.PAYCHECKS_UI_STATE;
                    case 77:
                        return SyncValueType.PAPER_CASH_DEPOSIT_ELIGIBILITY;
                    case 78:
                        return SyncValueType.CHECK_DEPOSIT_ELIGIBILITY;
                    case 81:
                        return SyncValueType.BORROW_APPLET_CREDIT_LIMIT_BORROW_TILE;
                    case 82:
                        return SyncValueType.C4B_PROFILE;
                    case 83:
                        return SyncValueType.REACTIONS_AVAILABLE;
                    case 84:
                        return SyncValueType.BORROW_APPLET_PAYMENT_TIMELINE_TILE;
                    case 85:
                        return SyncValueType.BORROW_APPLET_BULLETINS_TILE;
                    case 86:
                        return SyncValueType.INTERNATIONAL_PAYMENT_CONFIG;
                    case 87:
                        return SyncValueType.BORROW_APPLET_LOAN_HISTORY_TILE;
                    case 88:
                        return SyncValueType.ADD_CASH_ATM_PICKER_CONFIG;
                    case 89:
                        return SyncValueType.INTERNATIONAL_PAYMENT_CONFIG_NOTIFICATIONS;
                    case 90:
                        return SyncValueType.BALANCE_BASED_ADD_CASH_PREFERENCE;
                    case 91:
                        return SyncValueType.BORROW_DATA;
                    case 92:
                        return SyncValueType.GLOBAL_BORROW_DATA;
                    case 93:
                        return SyncValueType.TRANSACTION_ACTIVITY_CONFIG;
                    case 94:
                        return SyncValueType.DISPLAY_NAME_DETAILS;
                    case 95:
                        return SyncValueType.INVEST_YOUR_PAYCHECK_AUTOMATION;
                    case 96:
                        return SyncValueType.BUSINESS_ADDRESS;
                    case 97:
                        return SyncValueType.COMMERCE_BROWSER_AUTOFILL_PREFERENCES;
                    case 98:
                        return SyncValueType.AVAILABLE_PAYMENT_PAD_THEMES;
                    case 99:
                        return SyncValueType.FAMILY_TILE;
                    case 100:
                        return SyncValueType.FDIC_INSURANCE_CUSTOMER_STATUS;
                    case 102:
                        return SyncValueType.PERSONAL_INFO_CTA_BANNER;
                    case 103:
                        return SyncValueType.INPUTTED_LEGAL_NAME;
                    case 104:
                        return SyncValueType.PROFILE_PAGE_UPSELL_COMPONENT;
                    case 105:
                        return SyncValueType.C4B_IDENTITY_HUB_STATE;
                    case 106:
                        return SyncValueType.BTC_APPLET_RENDERING_STATE;
                    case 107:
                        return SyncValueType.SHIPPING_ADDRESS;
                    case 108:
                        return SyncValueType.INVEST_DIVIDEND_SETTING;
                    case 109:
                        return SyncValueType.PROFILE_UPSELL_CONFIGURATION;
                    case 110:
                        return SyncValueType.PROFILE_PAGE_UPSELL_COMPONENT_V2;
                    case 111:
                        return SyncValueType.SUP_OFFERS_TAB_CREDIT_LINE;
                    case 112:
                        return SyncValueType.C4B_KYB_ELIGIBILITY_WARNING;
                    case 113:
                        return SyncValueType.CARD_SPENDING_INSIGHTS_CONFIG;
                    case 114:
                        return SyncValueType.CARD_SPENDING_INSIGHTS_HOME;
                    case 115:
                        return SyncValueType.SAVINGS_APPLET;
                    case 116:
                        return SyncValueType.AFTERPAY_PREPURCHASE_DATA;
                    case 117:
                        return SyncValueType.CARD_TAB_SCHEME;
                    case 118:
                        return SyncValueType.SCENARIO_PLAN;
                    case 119:
                        return SyncValueType.BILLS_APPLET;
                    case 120:
                        return SyncValueType.BILLS_CONFIG;
                    case 121:
                        return SyncValueType.LOCAL_CARD;
                    case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                        return SyncValueType.C4B_TAP_TO_PAY;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        return SyncValueType.NOTIFICATION_SETTINGS;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        return SyncValueType.CARD_THEME_DEFINITIONS;
                    case 127:
                        return SyncValueType.SUPPORT_PHONE_CONFIRMATION;
                    case 128:
                        return SyncValueType.APP_THEME_DEFINITIONS;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        return SyncValueType.ACCOUNTS;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        return SyncValueType.VERSIONED_SAVINGS_FOLDERS;
                    case 131:
                        return SyncValueType.VERSIONED_SAVINGS_SCREENS;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        return SyncValueType.LOCAL_ACCOUNT;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        return SyncValueType.BITCOIN_PERFORMANCE_SUMMARY;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        return SyncValueType.BITCOIN_PERFORMANCE_DETAILS;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        return SyncValueType.C4B_EARNINGS_TRACKER_SUMMARY;
                    case 136:
                        return SyncValueType.FEATURE_ELIGIBILITY_REFRESH_POLICY;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        return SyncValueType.BITCOIN_PERFORMANCE_DETAILS_UI;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        return SyncValueType.BITCOIN_PERFORMANCE_DETAILS_USER_INTERFACE;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        return SyncValueType.CASH_APP_CARD;
                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                        return SyncValueType.LOCAL_CASH_BALANCE;
                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                        return SyncValueType.CASH_SUGGEST_SHOPPING_PREFERENCE;
                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                        return SyncValueType.BORROW_APPLET_LINKS_TILE;
                    case 144:
                        return SyncValueType.SAVINGS_EXTERNAL_ELEMENTS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                        return SyncValueType.TAP_TO_PAY_DESCRIPTION_SUGGESTIONS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                        return SyncValueType.CASH_O_CLOCK_PREFERENCE;
                    case 147:
                        return SyncValueType.DISPLAY_NAME;
                    case 150:
                        return SyncValueType.ACCOUNT_SUSPENSION;
                    case 151:
                        return SyncValueType.MULTI_INSTRUMENT_LINKING_OPTIONS;
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                        return SyncValueType.CASH_OUT_INSTRUMENT_CAPABILITY_CONFIG;
                    case 153:
                        return SyncValueType.BORROW_LIMIT_HUB_DATA;
                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                        return SyncValueType.PREPURCHASE_CASH_CARD_DATA;
                    case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                        return SyncValueType.P2P_ALLOWLIST_CUSTOMER;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                        return SyncValueType.P2P_CONTROL;
                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                        return SyncValueType.CASH_GREEN;
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                        return SyncValueType.GREEN_BENEFITS;
                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        return SyncValueType.GREEN_BOOKLET;
                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        return SyncValueType.CASH_CREDIT_SCORE_SUMMARY;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        return SyncValueType.CLIENT_SYNC_CONFIG;
                    case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                        return SyncValueType.BADGES;
                    case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                        return SyncValueType.KGOOSE_USER_SETTINGS;
                    case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                        return SyncValueType.KGOOSE_GLOBAL_USER_SETTINGS;
                    case 165:
                        return SyncValueType.AUTHORIZED_ACCOUNT;
                    case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                        return SyncValueType.CROW_RESTRICTIONS_DATA;
                    case 167:
                        return SyncValueType.ADVERSITY_BANNER;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                        return SyncValueType.BANKING_BENEFITS_CONFIG;
                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                        return SyncValueType.MONEY_TAB;
                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                        return SyncValueType.LOCAL_POS_CHECK_IN;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                        return SyncValueType.DEMAND_DEPOSIT_ACCOUNT;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                        return SyncValueType.INVEST_PORTFOLIOS_PERFORMANCE;
                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                        return SyncValueType.CASH_CREDIT_SCORE;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        return SyncValueType.CASH_OUT_FEE_DATA;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                        return SyncValueType.RECIPIENT_SUGGESTIONS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                        return SyncValueType.CASH_APP_TAG;
                    case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                        return SyncValueType.INVEST_PORTFOLIOS_HISTORICAL_DATA;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                        return SyncValueType.CARD_SKIN_ASSETS;
                    case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
                        return SyncValueType.PHONE_PLAN_APPLET;
                    case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                        return SyncValueType.TAG_THEME_DEFINITIONS;
                    case SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE:
                        return SyncValueType.BTC_P2P_CONVERSION_BPS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                        return SyncValueType.PAYMENT_DEVICE_PRESENTATION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                        return SyncValueType.LOCAL_EARNING_CARD;
                    case 185:
                        return SyncValueType.EARNINGS_HOME_UI_STATE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                        return SyncValueType.EARNINGS_APPLET_UI_STATE;
                    case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                        return SyncValueType.CASH_FOR_WORK_APPLET;
                    case 188:
                        return SyncValueType.AUTO_BTC_WITHDRAW_THRESHOLD;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                        return SyncValueType.FINISH_SETUP_TILE;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                        return SyncValueType.EARNER_ENROLLMENT_STATE;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                        return SyncValueType.CASH_LITE_DEFAULT_BANK_ACCOUNT;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static SyncInvestmentCategory.CategoryType m3946fromValue(int i) {
                if (i == 0) {
                    return SyncInvestmentCategory.CategoryType.DO_NOT_USE_CATEGORY_TYPE;
                }
                if (i == 1) {
                    return SyncInvestmentCategory.CategoryType.CATEGORY;
                }
                if (i == 2) {
                    return SyncInvestmentCategory.CategoryType.SUBCATEGORY;
                }
                if (i == 3) {
                    return SyncInvestmentCategory.CategoryType.TOP_LEVEL_UI;
                }
                if (i == 4) {
                    return SyncInvestmentCategory.CategoryType.PERFORMANCE;
                }
                if (i != 5) {
                    return null;
                }
                return SyncInvestmentCategory.CategoryType.ADVANCED;
            }

            public static Metadata.EntityType fromValue(int i) {
                switch (i) {
                    case 0:
                        return Metadata.EntityType.UNKNOWN;
                    case 1:
                        return Metadata.EntityType.CUSTOMER;
                    case 2:
                        return Metadata.EntityType.AP_STORE;
                    case 3:
                        return Metadata.EntityType.BOOST_MERCHANT;
                    case 4:
                        return Metadata.EntityType.PRODUCT;
                    case 5:
                        return Metadata.EntityType.SQ_MERCHANT;
                    case 6:
                        return Metadata.EntityType.CAP;
                    case 7:
                        return Metadata.EntityType.APP_FEATURE;
                    case 8:
                        return Metadata.EntityType.STOCK;
                    case 9:
                        return Metadata.EntityType.OFFER;
                    case 10:
                        return Metadata.EntityType.BUSINESS;
                    case 11:
                        return Metadata.EntityType.CASH_AFTERPAY;
                    case 12:
                        return Metadata.EntityType.LOCAL_BRAND;
                    default:
                        return null;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static MarketingMessageType m3941fromValue(int i) {
                if (i == 0) {
                    return MarketingMessageType.MARKETING_MESSAGE_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return MarketingMessageType.MARKETING_MESSAGE_TYPE_GENERAL;
                }
                if (i == 2) {
                    return MarketingMessageType.MARKETING_MESSAGE_TYPE_PROMOTIONAL;
                }
                if (i == 3) {
                    return MarketingMessageType.MARKETING_MESSAGE_TYPE_COUPON;
                }
                if (i != 4) {
                    return null;
                }
                return MarketingMessageType.MARKETING_MESSAGE_TYPE_COUPON_WITH_ITEM;
            }
        }
    }
}
