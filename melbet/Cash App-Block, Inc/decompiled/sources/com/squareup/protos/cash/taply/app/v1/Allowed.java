package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.squareup.protos.cash.appthemes.AppThemeName;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.pay.CashAppPayTaxRenderData;
import com.squareup.protos.cash.piggybank.api.v2.SavingsBalance;
import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import com.squareup.protos.cash.portfolios.syncvalues.BalanceHistory;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosHistoricalDataValue;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.app.AppTheme;
import com.squareup.protos.cash.postcard.app.AppThemeState;
import com.squareup.protos.cash.postcard.app.KnotEntryPoint;
import com.squareup.protos.cash.postcard.app.KnotSdkConfig;
import com.squareup.protos.cash.recipientsuggestion.CustomerData;
import com.squareup.protos.cash.recipientsuggestion.SuggestedRecipient;
import com.squareup.protos.cash.recipientsuggestion.SuggestionSource;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.cash.registrar.api.StatementDescriptor;
import com.squareup.protos.cash.security.SetPasswordResponse;
import com.squareup.protos.cash.security.VerifyPasswordResponse;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AvatarItem;
import com.squareup.protos.cash.shop.rendering.api.CountdownCaption;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.HomeSection;
import com.squareup.protos.cash.shop.rendering.api.MultiOffersSheet;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.cash.spendinginsights.SpendingAnalysisCategory;
import com.squareup.protos.cash.sup.api.v1.AvailableCreditLimit;
import com.squareup.protos.cash.sup.api.v1.GetMerchantConfigResponse;
import com.squareup.protos.cash.supportal.app.GetChatMessagesResponse;
import com.squareup.protos.cash.syncentitygateway.api.SyncTopicEntitiesClientError;
import com.squareup.protos.cash.syncentitygateway.api.SyncTopicEntitiesClientRequest;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.protos.cash.transfers.AddCashHalfSheetWithEntryParameters;
import com.squareup.protos.cash.transfers.AddMoneyParams;
import com.squareup.protos.cash.transfers.TransferClientRouteSource;
import com.squareup.protos.cash.transfers.WithdrawParams;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
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
public final class Allowed extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Allowed> CREATOR;
    public final EncryptedCardData card_encryption_data;
    public final String customer_token_hash_email;
    public final DeviceMetadata device_metadata;
    public final SuccessScreen success_screen;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object card_encryption_data;
        public Serializable customer_token_hash_email;
        public Object device_metadata;
        public Object success_screen;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Allowed((EncryptedCardData) this.card_encryption_data, (String) this.customer_token_hash_email, (DeviceMetadata) this.device_metadata, (SuccessScreen) this.success_screen, buildUnknownFields());
                case 1:
                    return new CashAppPayLoanSummaryRenderData.Fee((Money) this.card_encryption_data, (Long) this.customer_token_hash_email, (Long) this.device_metadata, (CashAppPayLoanSummaryRenderData.Fee.FeeType) this.success_screen, buildUnknownFields());
                case 2:
                    return new CashAppPayOrderRenderData.RetroEligibility((CashAppPayOrderRenderData.RetroEligibility.UiState) this.card_encryption_data, (CashAppPayOrderRenderData.RetroEligibility.EligibleData) this.customer_token_hash_email, (CashAppPayOrderRenderData.RetroEligibility.ConvertedData) this.device_metadata, (Long) this.success_screen, buildUnknownFields());
                case 3:
                    return new CashAppPayTaxRenderData((String) this.customer_token_hash_email, (String) this.card_encryption_data, (Money) this.device_metadata, (CashAppPayTaxRenderData.Scope) this.success_screen, buildUnknownFields());
                case 4:
                    return new SavingsBalance((String) this.customer_token_hash_email, (String) this.device_metadata, (Money) this.card_encryption_data, (String) this.success_screen, buildUnknownFields());
                case 5:
                    return new DigitalWalletSelectionOption.ApplePayPayload((String) this.customer_token_hash_email, (DigitalWalletSelectionOption.ApplePayPayload.Header) this.card_encryption_data, (String) this.device_metadata, (String) this.success_screen, buildUnknownFields());
                case 6:
                    return new PortfoliosHistoricalDataValue((BalanceHistory) this.card_encryption_data, (Long) this.customer_token_hash_email, (HistoricalRange) this.device_metadata, (List) this.success_screen, buildUnknownFields());
                case 7:
                    return new CardModule.CallToActionModule((Image) this.card_encryption_data, (LocalizedString) this.customer_token_hash_email, (LocalizedString) this.device_metadata, (CardModule.Button) this.success_screen, buildUnknownFields());
                case 8:
                    return new CardModule.CardElementAction.OpenDialog((LocalizedString) this.card_encryption_data, (LocalizedString) this.customer_token_hash_email, (CardModule.CardElementAction.OpenDialog.OpenDialogButton) this.device_metadata, (CardModule.CardElementAction.OpenDialog.OpenDialogButton) this.success_screen, buildUnknownFields());
                case 9:
                    return new AppTheme((AppThemeName) this.card_encryption_data, (AppThemeState) this.device_metadata, (LocalizedString) this.success_screen, (String) this.customer_token_hash_email, buildUnknownFields());
                case 10:
                    return new KnotSdkConfig((Boolean) this.card_encryption_data, (Boolean) this.customer_token_hash_email, (KnotEntryPoint) this.device_metadata, (List) this.success_screen, buildUnknownFields());
                case 11:
                    return new SuggestedRecipient((String) this.customer_token_hash_email, (Double) this.card_encryption_data, (SuggestionSource) this.device_metadata, (CustomerData) this.success_screen, buildUnknownFields());
                case 12:
                    return new StatementDescriptor((String) this.customer_token_hash_email, (StatementCoverage) this.card_encryption_data, (String) this.device_metadata, (String) this.success_screen, buildUnknownFields());
                case 13:
                    return new SetPasswordResponse((ResponseContext) this.card_encryption_data, (String) this.customer_token_hash_email, (String) this.device_metadata, (Long) this.success_screen, buildUnknownFields());
                case 14:
                    return new VerifyPasswordResponse((ResponseContext) this.card_encryption_data, (String) this.customer_token_hash_email, (Long) this.device_metadata, (Boolean) this.success_screen, buildUnknownFields());
                case 15:
                    return new AvatarItem((AnalyticsEvent) this.card_encryption_data, (TapAction) this.customer_token_hash_email, (UiAvatar) this.device_metadata, (EngagedItemToken) this.success_screen, buildUnknownFields());
                case 16:
                    return new CountdownCaption((Long) this.card_encryption_data, (Image) this.customer_token_hash_email, (StyledText) this.device_metadata, (Long) this.success_screen, buildUnknownFields());
                case 17:
                    return new FilterGroupSection.FilterGroupItem((LocalizedString) this.card_encryption_data, (ErrorEvent.Os.Companion) this.device_metadata, (FilterGroupSection.FilterGroupItem.Sheet) this.success_screen, (String) this.customer_token_hash_email, buildUnknownFields());
                case 18:
                    return new HomeSection((AnalyticsEvent) this.card_encryption_data, (SectionHeader) this.device_metadata, (String) this.customer_token_hash_email, (zzku) this.success_screen, buildUnknownFields());
                case 19:
                    return new MultiOffersSheet((Avatar) this.card_encryption_data, (String) this.customer_token_hash_email, (String) this.device_metadata, (List) this.success_screen, buildUnknownFields());
                case 20:
                    return new TappableIcon((TapAction) this.card_encryption_data, (Icon) this.customer_token_hash_email, (LocalizedString) this.device_metadata, (LocalizedString) this.success_screen, buildUnknownFields());
                case 21:
                    return new SpendingAnalysisCategory((LocalizedString) this.card_encryption_data, (LocalizedString) this.customer_token_hash_email, (Image) this.device_metadata, (ColoredButton) this.success_screen, buildUnknownFields());
                case 22:
                    return new GetMerchantConfigResponse((AvailableCreditLimit) this.card_encryption_data, (Boolean) this.customer_token_hash_email, (Long) this.device_metadata, (Long) this.success_screen, buildUnknownFields());
                case 23:
                    return new GetChatMessagesResponse((List) this.card_encryption_data, (Boolean) this.customer_token_hash_email, (Boolean) this.device_metadata, (GetChatMessagesResponse.Conversation) this.success_screen, buildUnknownFields());
                case 24:
                    return new SyncTopicEntitiesClientError((SyncTopicEntitiesClientRequest) this.card_encryption_data, (Integer) this.device_metadata, (String) this.customer_token_hash_email, (Integer) this.success_screen, buildUnknownFields());
                case 25:
                    return new OnFidesmoProvisioningStartRequest((String) this.customer_token_hash_email, (FidesmoEncryptionData) this.card_encryption_data, (DeviceProvisioningStatus) this.device_metadata, (RequestContext) this.success_screen, buildUnknownFields());
                case 26:
                    return new TagThemeDefinition((String) this.customer_token_hash_email, (LocalizedString) this.card_encryption_data, (TagThemeDefinition.TagFormFactor) this.device_metadata, (TagThemeDefinition.TagVariant) this.success_screen, buildUnknownFields());
                case 27:
                    return new AddCashHalfSheetWithEntryParameters((String) this.customer_token_hash_email, (LocalizedString) this.card_encryption_data, (String) this.device_metadata, (Money) this.success_screen, buildUnknownFields());
                case 28:
                    return new AddMoneyParams((Money) this.card_encryption_data, (String) this.customer_token_hash_email, (TransferClientRouteSource) this.device_metadata, (Boolean) this.success_screen, buildUnknownFields());
                default:
                    return new WithdrawParams((Money) this.card_encryption_data, (DepositPreference) this.device_metadata, (String) this.customer_token_hash_email, (TransferClientRouteSource) this.success_screen, buildUnknownFields());
            }
        }
    }

    static {
        Allowed$Companion$ADAPTER$1 allowed$Companion$ADAPTER$1 = new Allowed$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Allowed.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.Allowed", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = allowed$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(allowed$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Allowed(EncryptedCardData encryptedCardData, String str, DeviceMetadata deviceMetadata, SuccessScreen successScreen, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_encryption_data = encryptedCardData;
        this.customer_token_hash_email = str;
        this.device_metadata = deviceMetadata;
        this.success_screen = successScreen;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Allowed)) {
            return false;
        }
        Allowed allowed = (Allowed) obj;
        return Intrinsics.areEqual(unknownFields(), allowed.unknownFields()) && Intrinsics.areEqual(this.card_encryption_data, allowed.card_encryption_data) && Intrinsics.areEqual(this.customer_token_hash_email, allowed.customer_token_hash_email) && Intrinsics.areEqual(this.device_metadata, allowed.device_metadata) && Intrinsics.areEqual(this.success_screen, allowed.success_screen);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EncryptedCardData encryptedCardData = this.card_encryption_data;
        int hashCode2 = (hashCode + (encryptedCardData != null ? encryptedCardData.hashCode() : 0)) * 37;
        String str = this.customer_token_hash_email;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        DeviceMetadata deviceMetadata = this.device_metadata;
        int hashCode4 = (hashCode3 + (deviceMetadata != null ? deviceMetadata.hashCode() : 0)) * 37;
        SuccessScreen successScreen = this.success_screen;
        int hashCode5 = hashCode4 + (successScreen != null ? successScreen.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.card_encryption_data = this.card_encryption_data;
        builder.customer_token_hash_email = this.customer_token_hash_email;
        builder.device_metadata = this.device_metadata;
        builder.success_screen = this.success_screen;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.card_encryption_data != null) {
            arrayList.add("card_encryption_data=██");
        }
        if (this.customer_token_hash_email != null) {
            arrayList.add("customer_token_hash_email=██");
        }
        DeviceMetadata deviceMetadata = this.device_metadata;
        if (deviceMetadata != null) {
            arrayList.add("device_metadata=" + deviceMetadata);
        }
        SuccessScreen successScreen = this.success_screen;
        if (successScreen != null) {
            arrayList.add("success_screen=" + successScreen);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Allowed{", "}", 0, null, null, 56);
    }
}
