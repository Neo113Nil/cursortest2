package com.squareup.protos.giftly;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.gms.internal.mlkit_vision_face.zzjd;
import com.google.android.gms.internal.mlkit_vision_face.zzji;
import com.google.android.gms.internal.mlkit_vision_face.zzjj;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.clients.Version;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.FeatureSet;
import com.squareup.protos.cash.local.client.v1.LegalConsent;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalBrand$CashBackOffer$Percentage;
import com.squareup.protos.cash.local.client.v1.LocalCashConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutBrandSummary;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalMiniCard;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalOnboardingUpsell;
import com.squareup.protos.cash.local.client.v1.LocalPaymentOption;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.protos.cash.local.client.v1.PreferredPaymentMethod;
import com.squareup.protos.cash.local.client.v1.ShippingRateConfiguration;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.common.UnlinkInstrumentResponse;
import com.squareup.protos.franklin.investing.UpdateInvestmentHoldingRequest;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.lending.GetLoanHistoryResponse;
import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.protos.franklin.lending.SyncPrepurchaseCashCardResponse;
import com.squareup.protos.franklin.ui.IdentityHubState;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.franklin.ui.UiCoreCustomer;
import com.squareup.protos.investing.notifications.settings.NotificationSettingsOption;
import com.squareup.protos.investing.notifications.settings.NotificationsSettingsOptionsConfiguration;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.lending.sync_values.Tile;
import com.squareup.protos.loyalizer.UiLoyaltyNotificationPreference;
import com.squareup.protos.merchants.api.UserLocale;
import com.squareup.protos.payrollconnector.common.Employer;
import com.squareup.protos.payrollconnector.common.PayrollProviderType;
import com.squareup.protos.payrollconnector.common.PayrollVendor;
import com.squareup.protos.payrollconnector.common.SourceIdentifier;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GiftCard> CREATOR;
    public final String activation_text;
    public final Image card;
    public final String current_amount_text;
    public final String current_status_description_text;
    public final List details;
    public final String gift_card_type_description;
    public final LocalizableString localizable_activation_text;
    public final LocalizableString localizable_current_amount_text;
    public final LocalizableString localizable_current_status_description_text;
    public final LocalizableString localizable_gift_card_type_description;
    public final LocalizableString localizable_original_amount_text;
    public final LocalizableString localizable_preview_title;
    public final LocalizableString localizable_subtitle;
    public final LocalizableString localizable_title;
    public final Image logo;
    public final List options;
    public final String original_amount_text;
    public final String preview_title;
    public final List senders;
    public final String status;
    public final String stored_value_balance_token;
    public final String subtitle;
    public final Color themed_color;
    public final String title;
    public final String token;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable activation_text;
        public AndroidMessage card;
        public Serializable current_amount_text;
        public Object current_status_description_text;
        public List details;
        public Object gift_card_type_description;
        public Object localizable_activation_text;
        public Object localizable_current_amount_text;
        public Object localizable_current_status_description_text;
        public Object localizable_gift_card_type_description;
        public Object localizable_original_amount_text;
        public Serializable localizable_preview_title;
        public Object localizable_subtitle;
        public Object localizable_title;
        public Serializable logo;
        public Object options;
        public Serializable original_amount_text;
        public Object preview_title;
        public Object senders;
        public Serializable status;
        public Serializable stored_value_balance_token;
        public Serializable subtitle;
        public Object themed_color;
        public Object title;
        public Object token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GiftCard((String) this.token, (String) this.status, (String) this.title, (LocalizableString) this.localizable_title, (String) this.subtitle, (LocalizableString) this.localizable_subtitle, (Color) this.themed_color, (Image) this.logo, this.details, (List) this.senders, (String) this.activation_text, (LocalizableString) this.localizable_activation_text, (String) this.original_amount_text, (LocalizableString) this.localizable_original_amount_text, (String) this.current_amount_text, (LocalizableString) this.localizable_current_amount_text, (String) this.stored_value_balance_token, (String) this.gift_card_type_description, (LocalizableString) this.localizable_gift_card_type_description, (String) this.current_status_description_text, (LocalizableString) this.localizable_current_status_description_text, (Image) this.card, (List) this.options, (String) this.preview_title, (LocalizableString) this.localizable_preview_title, buildUnknownFields());
                case 1:
                    return new CreateCartResponse((zzho) this.token, this.details, (List) this.senders, (List) this.options, (LocalTippingConfiguration) this.status, (LocalPaymentOption) this.title, (LegalConsent) this.subtitle, (LocalOnboardingUpsell) this.activation_text, (LocalFulfillment) this.original_amount_text, (LocalCashConfiguration) this.current_amount_text, (LocalCashEarningsConfiguration) this.stored_value_balance_token, (List) this.gift_card_type_description, (PreferredPaymentMethod) this.current_status_description_text, (BrandBanner) this.preview_title, (CreateCartResponse.CartLoyaltySummary) this.localizable_title, (List) this.localizable_subtitle, (LocalMoney) this.localizable_activation_text, (Boolean) this.localizable_original_amount_text, (List) this.localizable_current_amount_text, (List) this.localizable_gift_card_type_description, (LocalCheckoutBrandSummary) this.localizable_current_status_description_text, (LocalCheckoutLocationSummary) this.localizable_preview_title, (List) this.themed_color, (Boolean) this.logo, (ShippingRateConfiguration) this.card, buildUnknownFields());
                case 2:
                    String str = (String) this.token;
                    if (str != null) {
                        return new LocalBrand(str, (String) this.status, (LocalColor) this.current_amount_text, (LocalColor) this.stored_value_balance_token, (LocalImage) this.gift_card_type_description, (LocalBrand$CashBackOffer$Percentage) this.current_status_description_text, (Long) this.preview_title, (LocalLocationDetail) this.localizable_title, this.details, (String) this.title, (String) this.subtitle, (LocalMiniCard) this.localizable_subtitle, (LocalBrand.Banner) this.localizable_activation_text, (LocalCashConfiguration) this.localizable_original_amount_text, (LocalEstimatedCompletionDuration) this.localizable_current_amount_text, (LocalBrand.RequiredLocationSelection) this.localizable_gift_card_type_description, (LocalImage) this.localizable_current_status_description_text, (String) this.activation_text, (LocalBrand.WebLayoutType) this.localizable_preview_title, (FeatureSet) this.themed_color, (LocalBrand.FulfillmentSelection) this.logo, (LocalBrand.LocationFulfillmentSummary) this.card, (Boolean) this.senders, (LocalColor) this.options, (String) this.original_amount_text, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "token");
                    throw null;
                default:
                    return new CashAppPayOrderRenderData((String) this.token, (String) this.status, (Long) this.activation_text, (Money) this.original_amount_text, (Money) this.current_amount_text, (Money) this.stored_value_balance_token, (Money) this.gift_card_type_description, (CashAppPayMerchantRenderData) this.current_status_description_text, this.details, (List) this.senders, (List) this.options, (List) this.preview_title, (List) this.localizable_title, (List) this.localizable_subtitle, (List) this.localizable_activation_text, (List) this.localizable_original_amount_text, (List) this.localizable_current_amount_text, (List) this.localizable_gift_card_type_description, (List) this.localizable_current_status_description_text, (CashAppPayOrderRenderData.OrderAggregations) this.localizable_preview_title, (GlobalAddress) this.themed_color, (String) this.title, (String) this.subtitle, (CashAppPayOrderRenderData.Product) this.logo, (CashAppPayOrderRenderData.RetroEligibility) this.card, buildUnknownFields());
            }
        }
    }

    public final class GiftCardSender extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GiftCardSender> CREATOR;
        public final String amount_text;
        public final String from_customer_token;
        public final LocalizableString localizable_amount_text;
        public final LocalizableString localizable_note;
        public final String note;

        static {
            GiftCard$GiftCardSender$Companion$ADAPTER$1 giftCard$GiftCardSender$Companion$ADAPTER$1 = new GiftCard$GiftCardSender$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardSender.class), "type.googleapis.com/squareup.giftly.GiftCard.GiftCardSender", Syntax.PROTO_2, null, "squareup/giftly/gift_card.proto");
            ADAPTER = giftCard$GiftCardSender$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCard$GiftCardSender$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GiftCardSender(String str, String str2, LocalizableString localizableString, String str3, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.from_customer_token = str;
            this.note = str2;
            this.localizable_note = localizableString;
            this.amount_text = str3;
            this.localizable_amount_text = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GiftCardSender)) {
                return false;
            }
            GiftCardSender giftCardSender = (GiftCardSender) obj;
            return Intrinsics.areEqual(unknownFields(), giftCardSender.unknownFields()) && Intrinsics.areEqual(this.from_customer_token, giftCardSender.from_customer_token) && Intrinsics.areEqual(this.note, giftCardSender.note) && Intrinsics.areEqual(this.localizable_note, giftCardSender.localizable_note) && Intrinsics.areEqual(this.amount_text, giftCardSender.amount_text) && Intrinsics.areEqual(this.localizable_amount_text, giftCardSender.localizable_amount_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.from_customer_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.note;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_note;
            int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str3 = this.amount_text;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_amount_text;
            int hashCode6 = hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(24, false);
            builder.alias = this.from_customer_token;
            builder.verified = this.note;
            builder.expires_at = this.localizable_note;
            builder.version = this.amount_text;
            builder.display_date = this.localizable_amount_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.from_customer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "from_customer_token=", arrayList);
            }
            if (this.note != null) {
                arrayList.add("note=██");
            }
            if (this.localizable_note != null) {
                arrayList.add("localizable_note=██");
            }
            String str2 = this.amount_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "amount_text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_amount_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_amount_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardSender{", "}", 0, null, null, 56);
        }
    }

    public final class Options extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Options> CREATOR;
        public final ClientScenario client_scenario;
        public final String label;
        public final LocalizableString localizable_label;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Object client_scenario;
            public Object label;
            public Object localizable_label;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Options((String) this.label, (LocalizableString) this.localizable_label, (ClientScenario) this.client_scenario, buildUnknownFields());
                    case 1:
                        return new SyncInvestmentHolding.DailyGainParams((Long) this.localizable_label, (String) this.label, (Money) this.client_scenario, buildUnknownFields());
                    case 2:
                        return new UnlinkInstrumentResponse((ResponseContext) this.localizable_label, (String) this.label, (UnlinkInstrumentResponse.Status) this.client_scenario, buildUnknownFields());
                    case 3:
                        return new UpdateInvestmentHoldingRequest((RequestContext) this.localizable_label, (String) this.label, (UpdateInvestmentHoldingRequest.Action) this.client_scenario, buildUnknownFields());
                    case 4:
                        return new CreditLine.CreditLineLimitData.Bullet((String) this.label, (CreditLine.CreditLineLimitData.Bullet.Icon) this.client_scenario, (LocalizableString) this.localizable_label, buildUnknownFields());
                    case 5:
                        return new GetLoanHistoryResponse((ResponseContext) this.localizable_label, (String) this.label, (List) this.client_scenario, buildUnknownFields());
                    case 6:
                        return new LoanTransaction.LoanCharge((LoanTransaction.LoanCharge.ChargeType) this.label, (Money) this.localizable_label, (Money) this.client_scenario, buildUnknownFields());
                    case 7:
                        return new SyncPrepurchaseCashCardResponse((ResponseContext) this.label, (PrepurchaseCashCardAppletData) this.localizable_label, (List) this.client_scenario, buildUnknownFields());
                    case 8:
                        return new IdentityHubState((IdentityHubState.EntrypointStatus) this.label, (Boolean) this.localizable_label, (Long) this.client_scenario, buildUnknownFields());
                    case 9:
                        return new RewardSelection.UnlockInProgress.ProgressBar((Integer) this.label, (Integer) this.localizable_label, (RewardSelection.UnlockInProgress.ProgressBar.Type) this.client_scenario, buildUnknownFields());
                    case 10:
                        return new UiCoreCustomer((String) this.label, (Long) this.localizable_label, (Region) this.client_scenario, buildUnknownFields());
                    case 11:
                        return new NotificationSettingsOption((String) this.label, (Boolean) this.localizable_label, (NotificationsSettingsOptionsConfiguration) this.client_scenario, buildUnknownFields());
                    case 12:
                        return new PrepurchaseAfterpayAppletData.ButtonData.Content((zzjd) this.localizable_label, (LocalizedString) this.client_scenario, (String) this.label, buildUnknownFields());
                    case 13:
                        return new AppSupport((List) this.label, (Version) this.localizable_label, (Version) this.client_scenario, buildUnknownFields());
                    case 14:
                        return new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet((BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon) this.label, (LocalizedString) this.localizable_label, (Icon) this.client_scenario, buildUnknownFields());
                    case 15:
                        return new BorrowAppletLinksTile.Data((LocalizedString) this.label, (List) this.localizable_label, (BorrowAppletLinksTile.Data.Button) this.client_scenario, buildUnknownFields());
                    case 16:
                        return new BorrowAppletLoanHistoryTile.Data((LocalizedString) this.label, (List) this.localizable_label, (BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) this.client_scenario, buildUnknownFields());
                    case 17:
                        return new BorrowData.AppletData((List) this.label, (List) this.localizable_label, (LocalizedString) this.client_scenario, buildUnknownFields());
                    case 18:
                        return new BorrowData.AppletData.EntryPointData((List) this.label, (zzji) this.localizable_label, (zzjj) this.client_scenario, buildUnknownFields());
                    case 19:
                        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile((LocalizedString) this.label, (List) this.localizable_label, (BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge) this.client_scenario, buildUnknownFields());
                    case 20:
                        return new BorrowLimitHubData.LimitProgressSection((BorrowLimitHubData.LimitProgressSection.TextStack) this.label, (BorrowLimitHubData.LimitProgressSection.TextStack) this.localizable_label, (BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar) this.client_scenario, buildUnknownFields());
                    case 21:
                        return new LendingInfo((Boolean) this.label, (LendingInfo.AccessData) this.localizable_label, (LendingInfo.FirstTimeBorrowData) this.client_scenario, buildUnknownFields());
                    case 22:
                        return new LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent((List) this.label, (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData) this.localizable_label, (List) this.client_scenario, buildUnknownFields());
                    case 23:
                        return new LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow((LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon) this.localizable_label, (String) this.label, (String) this.client_scenario, buildUnknownFields());
                    case 24:
                        return new Tile((List) this.label, (Color) this.localizable_label, (Tile.AbstractC0074Tile) this.client_scenario, buildUnknownFields());
                    case 25:
                        return new UiLoyaltyNotificationPreference((String) this.label, (Boolean) this.client_scenario, (LocalizableString) this.localizable_label, buildUnknownFields());
                    case 26:
                        return new UserLocale((Country) this.localizable_label, (String) this.label, (CurrencyCode) this.client_scenario, buildUnknownFields());
                    case 27:
                        return new Employer((String) this.label, (String) this.localizable_label, (SourceIdentifier) this.client_scenario, buildUnknownFields());
                    case 28:
                        return new SourceIdentifier((PayrollVendor) this.localizable_label, (String) this.label, (PayrollProviderType) this.client_scenario, buildUnknownFields());
                    default:
                        return new UiRewardProgramDetails.BottomUpsell((Icon) this.client_scenario, (String) this.label, (String) this.localizable_label, buildUnknownFields());
                }
            }
        }

        static {
            GiftCard$Options$Companion$ADAPTER$1 giftCard$Options$Companion$ADAPTER$1 = new GiftCard$Options$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Options.class), "type.googleapis.com/squareup.giftly.GiftCard.Options", Syntax.PROTO_2, null, "squareup/giftly/gift_card.proto");
            ADAPTER = giftCard$Options$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCard$Options$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Options(String str, LocalizableString localizableString, ClientScenario clientScenario, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.localizable_label = localizableString;
            this.client_scenario = clientScenario;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            return Intrinsics.areEqual(unknownFields(), options.unknownFields()) && Intrinsics.areEqual(this.label, options.label) && Intrinsics.areEqual(this.localizable_label, options.localizable_label) && this.client_scenario == options.client_scenario;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_label;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            ClientScenario clientScenario = this.client_scenario;
            int hashCode4 = hashCode3 + (clientScenario != null ? clientScenario.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.label = this.label;
            builder.localizable_label = this.localizable_label;
            builder.client_scenario = this.client_scenario;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            LocalizableString localizableString = this.localizable_label;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_label=", localizableString, arrayList);
            }
            ClientScenario clientScenario = this.client_scenario;
            if (clientScenario != null) {
                Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Options{", "}", 0, null, null, 56);
        }
    }

    static {
        GiftCard$Companion$ADAPTER$1 giftCard$Companion$ADAPTER$1 = new GiftCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCard.class), "type.googleapis.com/squareup.giftly.GiftCard", Syntax.PROTO_2, null, "squareup/giftly/gift_card.proto");
        ADAPTER = giftCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCard(String str, String str2, String str3, LocalizableString localizableString, String str4, LocalizableString localizableString2, Color color, Image image, List list, List list2, String str5, LocalizableString localizableString3, String str6, LocalizableString localizableString4, String str7, LocalizableString localizableString5, String str8, String str9, LocalizableString localizableString6, String str10, LocalizableString localizableString7, Image image2, List list3, String str11, LocalizableString localizableString8, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.token = str;
        this.status = str2;
        this.title = str3;
        this.localizable_title = localizableString;
        this.subtitle = str4;
        this.localizable_subtitle = localizableString2;
        this.themed_color = color;
        this.logo = image;
        this.activation_text = str5;
        this.localizable_activation_text = localizableString3;
        this.original_amount_text = str6;
        this.localizable_original_amount_text = localizableString4;
        this.current_amount_text = str7;
        this.localizable_current_amount_text = localizableString5;
        this.stored_value_balance_token = str8;
        this.gift_card_type_description = str9;
        this.localizable_gift_card_type_description = localizableString6;
        this.current_status_description_text = str10;
        this.localizable_current_status_description_text = localizableString7;
        this.card = image2;
        this.preview_title = str11;
        this.localizable_preview_title = localizableString8;
        this.details = TransactorKt.immutableCopyOf("details", list);
        this.senders = TransactorKt.immutableCopyOf("senders", list2);
        this.options = TransactorKt.immutableCopyOf("options", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftCard)) {
            return false;
        }
        GiftCard giftCard = (GiftCard) obj;
        return Intrinsics.areEqual(unknownFields(), giftCard.unknownFields()) && Intrinsics.areEqual(this.token, giftCard.token) && Intrinsics.areEqual(this.status, giftCard.status) && Intrinsics.areEqual(this.title, giftCard.title) && Intrinsics.areEqual(this.localizable_title, giftCard.localizable_title) && Intrinsics.areEqual(this.subtitle, giftCard.subtitle) && Intrinsics.areEqual(this.localizable_subtitle, giftCard.localizable_subtitle) && Intrinsics.areEqual(this.themed_color, giftCard.themed_color) && Intrinsics.areEqual(this.logo, giftCard.logo) && Intrinsics.areEqual(this.details, giftCard.details) && Intrinsics.areEqual(this.senders, giftCard.senders) && Intrinsics.areEqual(this.activation_text, giftCard.activation_text) && Intrinsics.areEqual(this.localizable_activation_text, giftCard.localizable_activation_text) && Intrinsics.areEqual(this.original_amount_text, giftCard.original_amount_text) && Intrinsics.areEqual(this.localizable_original_amount_text, giftCard.localizable_original_amount_text) && Intrinsics.areEqual(this.current_amount_text, giftCard.current_amount_text) && Intrinsics.areEqual(this.localizable_current_amount_text, giftCard.localizable_current_amount_text) && Intrinsics.areEqual(this.stored_value_balance_token, giftCard.stored_value_balance_token) && Intrinsics.areEqual(this.gift_card_type_description, giftCard.gift_card_type_description) && Intrinsics.areEqual(this.localizable_gift_card_type_description, giftCard.localizable_gift_card_type_description) && Intrinsics.areEqual(this.current_status_description_text, giftCard.current_status_description_text) && Intrinsics.areEqual(this.localizable_current_status_description_text, giftCard.localizable_current_status_description_text) && Intrinsics.areEqual(this.card, giftCard.card) && Intrinsics.areEqual(this.options, giftCard.options) && Intrinsics.areEqual(this.preview_title, giftCard.preview_title) && Intrinsics.areEqual(this.localizable_preview_title, giftCard.localizable_preview_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.status;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_title;
        int hashCode5 = (hashCode4 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str4 = this.subtitle;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_subtitle;
        int hashCode7 = (hashCode6 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        Color color = this.themed_color;
        int hashCode8 = (hashCode7 + (color != null ? color.hashCode() : 0)) * 37;
        Image image = this.logo;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (image != null ? image.hashCode() : 0)) * 37, 37, this.details), 37, this.senders);
        String str5 = this.activation_text;
        int hashCode9 = (m + (str5 != null ? str5.hashCode() : 0)) * 37;
        LocalizableString localizableString3 = this.localizable_activation_text;
        int hashCode10 = (hashCode9 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
        String str6 = this.original_amount_text;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        LocalizableString localizableString4 = this.localizable_original_amount_text;
        int hashCode12 = (hashCode11 + (localizableString4 != null ? localizableString4.hashCode() : 0)) * 37;
        String str7 = this.current_amount_text;
        int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 37;
        LocalizableString localizableString5 = this.localizable_current_amount_text;
        int hashCode14 = (hashCode13 + (localizableString5 != null ? localizableString5.hashCode() : 0)) * 37;
        String str8 = this.stored_value_balance_token;
        int hashCode15 = (hashCode14 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.gift_card_type_description;
        int hashCode16 = (hashCode15 + (str9 != null ? str9.hashCode() : 0)) * 37;
        LocalizableString localizableString6 = this.localizable_gift_card_type_description;
        int hashCode17 = (hashCode16 + (localizableString6 != null ? localizableString6.hashCode() : 0)) * 37;
        String str10 = this.current_status_description_text;
        int hashCode18 = (hashCode17 + (str10 != null ? str10.hashCode() : 0)) * 37;
        LocalizableString localizableString7 = this.localizable_current_status_description_text;
        int hashCode19 = (hashCode18 + (localizableString7 != null ? localizableString7.hashCode() : 0)) * 37;
        Image image2 = this.card;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode19 + (image2 != null ? image2.hashCode() : 0)) * 37, 37, this.options);
        String str11 = this.preview_title;
        int hashCode20 = (m2 + (str11 != null ? str11.hashCode() : 0)) * 37;
        LocalizableString localizableString8 = this.localizable_preview_title;
        int hashCode21 = hashCode20 + (localizableString8 != null ? localizableString8.hashCode() : 0);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.status = this.status;
        builder.title = this.title;
        builder.localizable_title = this.localizable_title;
        builder.subtitle = this.subtitle;
        builder.localizable_subtitle = this.localizable_subtitle;
        builder.themed_color = this.themed_color;
        builder.logo = this.logo;
        builder.details = this.details;
        builder.senders = this.senders;
        builder.activation_text = this.activation_text;
        builder.localizable_activation_text = this.localizable_activation_text;
        builder.original_amount_text = this.original_amount_text;
        builder.localizable_original_amount_text = this.localizable_original_amount_text;
        builder.current_amount_text = this.current_amount_text;
        builder.localizable_current_amount_text = this.localizable_current_amount_text;
        builder.stored_value_balance_token = this.stored_value_balance_token;
        builder.gift_card_type_description = this.gift_card_type_description;
        builder.localizable_gift_card_type_description = this.localizable_gift_card_type_description;
        builder.current_status_description_text = this.current_status_description_text;
        builder.localizable_current_status_description_text = this.localizable_current_status_description_text;
        builder.card = this.card;
        builder.options = this.options;
        builder.preview_title = this.preview_title;
        builder.localizable_preview_title = this.localizable_preview_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.status;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "status=", arrayList);
        }
        String str3 = this.title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
        }
        LocalizableString localizableString = this.localizable_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
        }
        String str4 = this.subtitle;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "subtitle=", arrayList);
        }
        LocalizableString localizableString2 = this.localizable_subtitle;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
        }
        Color color = this.themed_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("themed_color=", color, arrayList);
        }
        Image image = this.logo;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("logo=", image, arrayList);
        }
        List list = this.details;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("details=", arrayList, list);
        }
        List list2 = this.senders;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("senders=", arrayList, list2);
        }
        String str5 = this.activation_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "activation_text=", arrayList);
        }
        LocalizableString localizableString3 = this.localizable_activation_text;
        if (localizableString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_activation_text=", localizableString3, arrayList);
        }
        String str6 = this.original_amount_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "original_amount_text=", arrayList);
        }
        LocalizableString localizableString4 = this.localizable_original_amount_text;
        if (localizableString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_original_amount_text=", localizableString4, arrayList);
        }
        String str7 = this.current_amount_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "current_amount_text=", arrayList);
        }
        LocalizableString localizableString5 = this.localizable_current_amount_text;
        if (localizableString5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_current_amount_text=", localizableString5, arrayList);
        }
        String str8 = this.stored_value_balance_token;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "stored_value_balance_token=", arrayList);
        }
        String str9 = this.gift_card_type_description;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "gift_card_type_description=", arrayList);
        }
        LocalizableString localizableString6 = this.localizable_gift_card_type_description;
        if (localizableString6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_gift_card_type_description=", localizableString6, arrayList);
        }
        String str10 = this.current_status_description_text;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "current_status_description_text=", arrayList);
        }
        LocalizableString localizableString7 = this.localizable_current_status_description_text;
        if (localizableString7 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_current_status_description_text=", localizableString7, arrayList);
        }
        Image image2 = this.card;
        if (image2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("card=", image2, arrayList);
        }
        List list3 = this.options;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("options=", arrayList, list3);
        }
        String str11 = this.preview_title;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "preview_title=", arrayList);
        }
        LocalizableString localizableString8 = this.localizable_preview_title;
        if (localizableString8 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_preview_title=", localizableString8, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCard{", "}", 0, null, null, 56);
    }
}
