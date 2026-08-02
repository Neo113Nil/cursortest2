package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import coil3.network.internal.UtilsKt;
import coil3.transform.TransformationsKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bumptech.glide.module.ManifestParser;
import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.protos.cash.api.PaginationResponseMetadata;
import com.squareup.protos.cash.api.RequestMetadata;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.protos.cash.deviceintegritly.api.SendSignedMRIContextRequest;
import com.squareup.protos.cash.discover.api.app.v1.model.Avatar;
import com.squareup.protos.cash.discover.api.app.v1.model.HeroImage;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.cash.fx.app.ExchangeRate;
import com.squareup.protos.cash.fx.app.StreamExchangeRateUpdate;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.AnalyticsData;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.protos.cash.genericelements.ui.BaseElement;
import com.squareup.protos.cash.genericelements.ui.ButtonCtaGroupComponent;
import com.squareup.protos.cash.genericelements.ui.ColumnWidth;
import com.squareup.protos.cash.genericelements.ui.CompactCardComponent;
import com.squareup.protos.cash.genericelements.ui.ComponentElement;
import com.squareup.protos.cash.genericelements.ui.ListUnorderedComponent;
import com.squareup.protos.cash.genericelements.ui.PillTextElement;
import com.squareup.protos.cash.genericelements.ui.SemanticBackgroundColor;
import com.squareup.protos.cash.genericelements.ui.SemanticIconColor;
import com.squareup.protos.cash.genericelements.ui.SeriesContainer;
import com.squareup.protos.cash.genericelements.ui.StyleAttributes;
import com.squareup.protos.cash.genericelements.ui.TextElement;
import com.squareup.protos.cash.genericelements.ui.TwoColumnComponent;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.SessionScope;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.ListShippingAddressesResponse;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.RetrieveShippingAddressResponse;
import com.squareup.protos.cash.grantly.app.UpdateDefaultShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.UpdateDefaultShippingAddressResponse;
import com.squareup.protos.cash.investautomator.api.flows.InitiateChangeRoundUpDestinationFlowParameters;
import com.squareup.protos.cash.investautomator.api.flows.UpdateAutomationForFlowRequest;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerControls;
import com.squareup.protos.cash.investcustomer.api.v1.GetCustomerControlsResponse;
import com.squareup.protos.cash.investcustomer.api.v1.drip.DividendSetting;
import com.squareup.protos.cash.investcustomer.api.v1.drip.SetCustomerDividendSettingsRequest;
import com.squareup.protos.cash.investcustomer.api.v1.drip.SetCustomerDividendSettingsResponse;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.protos.cash.janus.api.AuthorizationContext;
import com.squareup.protos.cash.janus.api.AuthorizedPrincipal;
import com.squareup.protos.cash.janus.api.AuthorizedRelationship;
import com.squareup.protos.cash.janus.api.CreateSecondaryPersonalAccountEntryPoint;
import com.squareup.protos.cash.janus.api.CreateSecondaryPersonalAccountFlowParams;
import com.squareup.protos.cash.janus.api.FinishWebAuthnAuthenticationResponse;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.protos.cash.janus.api.GetLoginScenarioPlanResponse;
import com.squareup.protos.cash.janus.api.RegisterProspectTokenResponse;
import com.squareup.protos.cash.janus.api.RemoveAccountResponse;
import com.squareup.protos.cash.janus.api.SwitchAccountResponse;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAuthorizedAccount;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.client.app.v1.CreateAppOrderRequest;
import com.squareup.protos.cash.local.client.app.v1.CreateAppOrderResponse;
import com.squareup.protos.cash.local.client.app.v1.GetAppShortlinkRequest;
import com.squareup.protos.cash.local.client.app.v1.GetAppShortlinkResponse;
import com.squareup.protos.cash.local.client.app.v1.GetMarketingMessageResponse;
import com.squareup.protos.cash.local.client.app.v1.GetStaffBrandDetailsResponse;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenFeed;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessage;
import com.squareup.protos.cash.local.client.app.v1.StaffBrandDetails;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.app.v1.card.MiniCard;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.CreateOrderRequest;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.common.values.LocalCash;
import com.squareup.protos.cash.plasma.common.CallContext;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.app.ProfileListConfig;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Card extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Card> CREATOR;
    public final CardPii card_pii;
    public final InstrumentType card_type;

    static {
        Card$Companion$ADAPTER$1 card$Companion$ADAPTER$1 = new Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Card.class), "type.googleapis.com/squareup.cash.grantly.api.Card", Syntax.PROTO_2, null, "squareup/cash/grantly/api/in_transaction_top_up_flow_end_result.proto");
        ADAPTER = card$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(card$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card(InstrumentType instrumentType, CardPii cardPii, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_type = instrumentType;
        this.card_pii = cardPii;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && this.card_type == card.card_type && Intrinsics.areEqual(this.card_pii, card.card_pii);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentType instrumentType = this.card_type;
        int hashCode2 = (hashCode + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        CardPii cardPii = this.card_pii;
        int hashCode3 = hashCode2 + (cardPii != null ? cardPii.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.card_type = this.card_type;
        builder.card_pii = this.card_pii;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InstrumentType instrumentType = this.card_type;
        if (instrumentType != null) {
            arrayList.add("card_type=" + instrumentType);
        }
        if (this.card_pii != null) {
            arrayList.add("card_pii=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object card_pii;
        public Object card_type;

        public Builder() {
            this.$r8$classId = 15;
            this.card_pii = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Card((InstrumentType) this.card_type, (CardPii) this.card_pii, buildUnknownFields());
                case 1:
                    return new Action.OneTimePayment.CheckoutOptions((Boolean) this.card_type, (Action.ScopeOptions) this.card_pii, buildUnknownFields());
                case 2:
                    return new Action.ShadowAccount((Action.ShadowAccount.Integration) this.card_type, (String) this.card_pii, buildUnknownFields());
                case 3:
                    SessionScope.Type type2 = (SessionScope.Type) this.card_type;
                    if (type2 != null) {
                        return new SessionScope(type2, (SessionScope$Details$RequestsDecideScopeDetails) this.card_pii, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(type2, "type");
                    throw null;
                case 4:
                    return new RetrieveShippingAddressResponse((ResponseMetadata) this.card_type, (ShippingAddress) this.card_pii, buildUnknownFields());
                case 5:
                    return new UpdateDefaultShippingAddressResponse((ResponseMetadata) this.card_type, (ResponseContext) this.card_pii, buildUnknownFields());
                case 6:
                    return new InitiateChangeRoundUpDestinationFlowParameters((CallContext) this.card_type, (Automation) this.card_pii, buildUnknownFields());
                case 7:
                    return new UpdateAutomationForFlowRequest((RequestContext) this.card_type, (Automation) this.card_pii, buildUnknownFields());
                case 8:
                    return new GetCustomerControlsResponse((String) this.card_type, (CustomerControls) this.card_pii, buildUnknownFields());
                case 9:
                    DividendSetting dividendSetting = (DividendSetting) this.card_type;
                    if (dividendSetting != null) {
                        return new SetCustomerDividendSettingsRequest(dividendSetting, (RequestContext) this.card_pii, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(dividendSetting, "setting");
                    throw null;
                case 10:
                    return new SetCustomerDividendSettingsResponse((DividendSetting) this.card_type, (ResponseContext) this.card_pii, buildUnknownFields());
                case 11:
                    return new SubmitInvestmentEntitySelectionRequest((RequestContext) this.card_type, (zzbs) this.card_pii, buildUnknownFields());
                case 12:
                    return new AuthorizationContext((AuthorizedPrincipal) this.card_type, (AuthorizedRelationship) this.card_pii, buildUnknownFields());
                case 13:
                    return new CreateSecondaryPersonalAccountFlowParams((CreateSecondaryPersonalAccountEntryPoint) this.card_type, (String) this.card_pii, buildUnknownFields());
                case 14:
                    return new FinishWebAuthnAuthenticationResponse((ResponseContext) this.card_type, (ClientScenario) this.card_pii, buildUnknownFields());
                case 15:
                    return new GetAccountSettingsResponse.SettingCollection((GetAccountSettingsResponse.SettingType) this.card_type, (List) this.card_pii, buildUnknownFields());
                case 16:
                    return new GetAccountSettingsResponse.SettingCollection.Setting((GetAccountSettingsResponse.SettingName) this.card_type, (Boolean) this.card_pii, buildUnknownFields());
                case 17:
                    return new RemoveAccountResponse((AccountListConfig) this.card_type, (ProfileListConfig) this.card_pii, buildUnknownFields());
                case 18:
                    return new SwitchAccountResponse((ResponseContext) this.card_type, (AuthorizationContext) this.card_pii, buildUnknownFields());
                case 19:
                    return new SyncValueAuthorizedAccount((com.squareup.protos.cash.janus.syncvalues.AuthorizedPrincipal) this.card_type, (com.squareup.protos.cash.janus.syncvalues.AuthorizedRelationship) this.card_pii, buildUnknownFields());
                case 20:
                    return new CashAppLocalOrderRenderData.LocalCashData((Money) this.card_type, (LocalCash) this.card_pii, buildUnknownFields());
                case 21:
                    return new CreateAppOrderRequest((RequestContext) this.card_type, (CreateOrderRequest) this.card_pii, buildUnknownFields());
                case 22:
                    return new CreateAppOrderResponse((ResponseContext) this.card_type, (CreateOrderResponse) this.card_pii, buildUnknownFields());
                case 23:
                    return new GetAppShortlinkRequest((RequestContext) this.card_type, (GetShortlinkRequest) this.card_pii, buildUnknownFields());
                case 24:
                    return new GetAppShortlinkResponse((ResponseContext) this.card_type, (GetShortlinkResponse) this.card_pii, buildUnknownFields());
                case 25:
                    return new GetMarketingMessageResponse((MarketingMessage) this.card_type, (LocalErrorResponse) this.card_pii, buildUnknownFields());
                case 26:
                    return new GetStaffBrandDetailsResponse((Map) this.card_type, (LocalErrorResponse) this.card_pii, buildUnknownFields());
                case 27:
                    return new MarketScreenFeed((List) this.card_type, (MiniCard) this.card_pii, buildUnknownFields());
                case 28:
                    return new LocalPOSCheckIn.MiniCard((LocalPOSCheckIn.Color) this.card_type, (LocalPOSCheckIn.Image) this.card_pii, buildUnknownFields());
                default:
                    return new CreateOrderRequest.CalculatedChargesBreakdownRow((String) this.card_type, (LocalMoney) this.card_pii, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }

    public final class CardPii extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardPii> CREATOR;
        public final ByteString ciphertext_;
        public final Expiration expiration;
        public final String last_four_digits;
        public final String postal_code;

        static {
            Card$CardPii$Companion$ADAPTER$1 card$CardPii$Companion$ADAPTER$1 = new Card$CardPii$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardPii.class), "type.googleapis.com/squareup.cash.grantly.api.Card.CardPii", Syntax.PROTO_2, null, "squareup/cash/grantly/api/in_transaction_top_up_flow_end_result.proto");
            ADAPTER = card$CardPii$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(card$CardPii$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardPii(String str, Expiration expiration, String str2, ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            byteString2.getClass();
            this.postal_code = str;
            this.expiration = expiration;
            this.last_four_digits = str2;
            this.ciphertext_ = byteString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardPii)) {
                return false;
            }
            CardPii cardPii = (CardPii) obj;
            return Intrinsics.areEqual(unknownFields(), cardPii.unknownFields()) && Intrinsics.areEqual(this.postal_code, cardPii.postal_code) && Intrinsics.areEqual(this.expiration, cardPii.expiration) && Intrinsics.areEqual(this.last_four_digits, cardPii.last_four_digits) && Intrinsics.areEqual(this.ciphertext_, cardPii.ciphertext_);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.postal_code;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Expiration expiration = this.expiration;
            int hashCode3 = (hashCode2 + (expiration != null ? expiration.hashCode() : 0)) * 37;
            String str2 = this.last_four_digits;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            ByteString byteString = this.ciphertext_;
            int hashCode5 = hashCode4 + (byteString != null ? byteString.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0, false);
            builder.postal_code = this.postal_code;
            builder.expiration = this.expiration;
            builder.last_four_digits = this.last_four_digits;
            builder.ciphertext_ = this.ciphertext_;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.postal_code != null) {
                arrayList.add("postal_code=██");
            }
            Expiration expiration = this.expiration;
            if (expiration != null) {
                arrayList.add("expiration=" + expiration);
            }
            String str = this.last_four_digits;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "last_four_digits=", arrayList);
            }
            ByteString byteString = this.ciphertext_;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("ciphertext_=", byteString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardPii{", "}", 0, null, null, 56);
        }

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Object ciphertext_;
            public Object expiration;
            public Serializable last_four_digits;
            public Object postal_code;

            public Builder(int i) {
                this.$r8$classId = i;
                switch (i) {
                    case 3:
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        this.expiration = emptyMap;
                        break;
                    default:
                        this.expiration = EmptyList.INSTANCE;
                        break;
                }
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new CardPii((String) this.postal_code, (Expiration) this.expiration, (String) this.last_four_digits, (ByteString) this.ciphertext_, buildUnknownFields());
                    case 1:
                        return new PlayIntegrityVerdict.AppIntegrity((PlayIntegrityVerdict.AppIntegrity.AppRecognitionVerdict) this.expiration, (String) this.postal_code, (List) this.ciphertext_, (String) this.last_four_digits, buildUnknownFields());
                    case 2:
                        return new PlayIntegrityVerdict((PlayIntegrityVerdict.RequestDetails) this.postal_code, (PlayIntegrityVerdict.AppIntegrity) this.last_four_digits, (List) this.expiration, (PlayIntegrityVerdict.AccountDetails) this.ciphertext_, buildUnknownFields());
                    case 3:
                        return new SendSignedMRIContextRequest((SignedSerializedMRIContext) this.postal_code, (MRIContext) this.last_four_digits, (Map) this.expiration, (SigningData) this.ciphertext_, buildUnknownFields());
                    case 4:
                        return new Avatar((Avatar.Initials) this.last_four_digits, (Image) this.expiration, (Image) this.ciphertext_, (String) this.postal_code, buildUnknownFields());
                    case 5:
                        return new HeroImage((Image) this.postal_code, (Double) this.last_four_digits, (HeroImage.HeroImagePlacement) this.expiration, (Color) this.ciphertext_, buildUnknownFields());
                    case 6:
                        return new InitiatePersonalizedPaymentRequest((InitiatePaymentRequest) this.last_four_digits, (Personalization) this.expiration, (String) this.postal_code, (PersonalizationInput) this.ciphertext_, buildUnknownFields());
                    case 7:
                        return new StreamExchangeRateUpdate((ExchangeRate) this.postal_code, (CurrencyCode) this.last_four_digits, (CurrencyCode) this.expiration, (Long) this.ciphertext_, buildUnknownFields());
                    case 8:
                        return new com.squareup.protos.cash.genericelements.ui.Action((UtilsKt) this.postal_code, (AnalyticsData) this.last_four_digits, (AnalyticsEvent) this.expiration, (Boolean) this.ciphertext_, buildUnknownFields());
                    case 9:
                        return new ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon((String) this.postal_code, (SemanticIconColor) this.last_four_digits, (Boolean) this.expiration, (SemanticBackgroundColor) this.ciphertext_, buildUnknownFields());
                    case 10:
                        return new ButtonCtaGroupComponent((ButtonCtaGroupComponent.Direction) this.last_four_digits, (String) this.postal_code, (Boolean) this.expiration, (List) this.ciphertext_, buildUnknownFields());
                    case 11:
                        return new CompactCardComponent((TwoColumnComponent) this.postal_code, (TextElement) this.last_four_digits, (StyleAttributes) this.expiration, (com.squareup.protos.cash.genericelements.ui.Action) this.ciphertext_, buildUnknownFields());
                    case 12:
                        return new ComponentElement((TransformationsKt) this.postal_code, (AnalyticsData) this.last_four_digits, (AnalyticsEvent) this.expiration, (List) this.ciphertext_, buildUnknownFields());
                    case 13:
                        return new ListUnorderedComponent.Item((String) this.postal_code, (String) this.last_four_digits, (com.squareup.protos.cash.genericelements.ui.Action) this.expiration, (String) this.ciphertext_, buildUnknownFields());
                    case 14:
                        return new PillTextElement((String) this.postal_code, (Color) this.last_four_digits, (Color) this.expiration, (Alignment) this.ciphertext_, buildUnknownFields());
                    case 15:
                        return new SeriesContainer((List) this.postal_code, (SeriesContainer.Scroll) this.last_four_digits, (Boolean) this.expiration, (StyleAttributes) this.ciphertext_, buildUnknownFields());
                    case 16:
                        return new TwoColumnComponent((BaseElement) this.postal_code, (BaseElement) this.last_four_digits, (ColumnWidth) this.expiration, (TwoColumnComponent.Spacing) this.ciphertext_, buildUnknownFields());
                    case 17:
                        return new Action.OAuth.Metadata.FinancialDataSharing((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes) this.postal_code, (Action.OAuth.Metadata.FinancialDataSharing.DataRecipient) this.last_four_digits, (List) this.expiration, (Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration) this.ciphertext_, buildUnknownFields());
                    case 18:
                        return new Action.OnFilePayment((String) this.postal_code, (String) this.last_four_digits, (Action.OnFilePayment.Context) this.expiration, (Action.OnFilePayment.CheckoutOptions) this.ciphertext_, buildUnknownFields());
                    case 19:
                        return new PaymentSchedule((Integer) this.postal_code, (Boolean) this.last_four_digits, (Long) this.expiration, (Money) this.ciphertext_, buildUnknownFields());
                    case 20:
                        return new CreateShippingAddressRequest((RequestMetadata) this.last_four_digits, (String) this.postal_code, (CreateShippingAddressRequest.ShippingAddress) this.expiration, (RequestContext) this.ciphertext_, buildUnknownFields());
                    case 21:
                        return new ListShippingAddressesResponse((ResponseMetadata) this.postal_code, (PaginationResponseMetadata) this.last_four_digits, (List) this.expiration, (ResponseContext) this.ciphertext_, buildUnknownFields());
                    case 22:
                        return new RetrieveDefaultShippingAddressRequest((RequestMetadata) this.last_four_digits, (String) this.postal_code, (Boolean) this.expiration, (RequestContext) this.ciphertext_, buildUnknownFields());
                    case 23:
                        return new UpdateDefaultShippingAddressRequest((RequestMetadata) this.expiration, (String) this.postal_code, (String) this.last_four_digits, (RequestContext) this.ciphertext_, buildUnknownFields());
                    case 24:
                        return new Order.RecurringSchedule((Order.RecurringSchedule.Frequency) this.last_four_digits, (List) this.expiration, (String) this.postal_code, (Integer) this.ciphertext_, buildUnknownFields());
                    case 25:
                        return new GetLoginScenarioPlanResponse((GetLoginScenarioPlanResponse.Status) this.expiration, (ResponseContext) this.ciphertext_, (String) this.postal_code, (String) this.last_four_digits, buildUnknownFields());
                    case 26:
                        return new RegisterProspectTokenResponse((ResponseContext) this.last_four_digits, (RegisterProspectTokenResponse.Status) this.expiration, (String) this.postal_code, (RegisterProspectTokenResponse.AliasType) this.ciphertext_, buildUnknownFields());
                    case 27:
                        return new CashAppLocalOrderRenderData.AdjustmentLine((CashAppLocalOrderRenderData.AdjustmentLine.Type) this.last_four_digits, (Money) this.expiration, (ManifestParser) this.ciphertext_, (String) this.postal_code, buildUnknownFields());
                    case 28:
                        return new StaffBrandDetails((LocalColor) this.postal_code, (LocalColor) this.last_four_digits, (LocalImage) this.expiration, (LocalColor) this.ciphertext_, buildUnknownFields());
                    default:
                        return new LocalCard.ColorPalette((Color) this.postal_code, (Color) this.last_four_digits, (Color) this.expiration, (Color) this.ciphertext_, buildUnknownFields());
                }
            }

            public /* synthetic */ Builder(int i, boolean z) {
                this.$r8$classId = i;
            }
        }
    }
}
