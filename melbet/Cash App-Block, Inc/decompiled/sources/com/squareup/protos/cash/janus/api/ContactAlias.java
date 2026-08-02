package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import app.cash.zipline.internal.LogAndroidKt;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TextRow;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedIcon;
import com.squareup.cash.crypto.CryptoPaymentEntryPoint;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.cash.lynx.api.v1_0.model.BankMetadata;
import com.squareup.cash.lynx.api.v1_0.model.BankinfoDetails;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentVerificationDetails;
import com.squareup.cash.p2p.engine.api.v1.PaymentStateCode;
import com.squareup.protos.cash.aegis.sync_values.Dependent;
import com.squareup.protos.cash.aegis.sync_values.LockCardWarning;
import com.squareup.protos.cash.aegis.sync_values.SendCashCta;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.protos.cash.aegis.sync_values.Text;
import com.squareup.protos.cash.agentcore.api.v1.AgentAccount;
import com.squareup.protos.cash.bankinfo.api.Bank$DisplaySettings;
import com.squareup.protos.cash.blockstable.api.v1.Asset;
import com.squareup.protos.cash.blockstable.api.v1.AvailableNetwork;
import com.squareup.protos.cash.blockstable.api.v1.Chain;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common.CardDetailsProto$DisplaySettings;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet$Content$PasteboardTextLines;
import com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection;
import com.squareup.protos.cash.cashsuggest.api.CreditDetailSheet;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.cashsuggest.api.ItemMetadata;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchRequest;
import com.squareup.protos.cash.cashsuggest.api.RowSection;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import com.squareup.protos.cash.compass.api.Platform;
import com.squareup.protos.cash.compass.api.SetGpsConsentStatusRequest;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchRequest;
import com.squareup.protos.cash.customersearch.api.SearchCommonCardSection;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarOverlayCardSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.discover.api.app.v1.model.RowSection;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoHalfSheet;
import com.squareup.protos.cash.discover.api.app.v1.model.TileSection;
import com.squareup.protos.cash.discover.api.app.v2.api.Summary;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.protos.cash.fiatly.api.v2.PaymentStateCategory;
import com.squareup.protos.cash.fiatly.api.v2.PaymentUpdate;
import com.squareup.protos.cash.fiatly.api.v2.SenderProfileData;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.ArcadeButtonElement;
import com.squareup.protos.cash.genericelements.ui.TextElement;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import com.squareup.protos.cash.grantly.api.DeliveryInstructions;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsResponse;
import com.squareup.protos.cash.kgoose.syncentity.CashGlobalUserSettings;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.UiAvatar;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContactAlias extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContactAlias> CREATOR;
    public final ContactAliasType alias_type;
    public final String alias_value;
    public final String customer_token;
    public final String hashed_alias_token;
    public final Long linked_at;
    public final Long updated_at;
    public final Long version;

    static {
        ContactAlias$Companion$ADAPTER$1 contactAlias$Companion$ADAPTER$1 = new ContactAlias$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContactAlias.class), "type.googleapis.com/squareup.cash.janus.api.ContactAlias", Syntax.PROTO_2, null, "squareup/cash/janus/api/AccountHolder.proto");
        ADAPTER = contactAlias$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(contactAlias$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactAlias(String str, ContactAliasType contactAliasType, String str2, String str3, Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.alias_type = contactAliasType;
        this.alias_value = str2;
        this.hashed_alias_token = str3;
        this.updated_at = l;
        this.linked_at = l2;
        this.version = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContactAlias)) {
            return false;
        }
        ContactAlias contactAlias = (ContactAlias) obj;
        return Intrinsics.areEqual(unknownFields(), contactAlias.unknownFields()) && Intrinsics.areEqual(this.customer_token, contactAlias.customer_token) && this.alias_type == contactAlias.alias_type && Intrinsics.areEqual(this.alias_value, contactAlias.alias_value) && Intrinsics.areEqual(this.hashed_alias_token, contactAlias.hashed_alias_token) && Intrinsics.areEqual(this.updated_at, contactAlias.updated_at) && Intrinsics.areEqual(this.linked_at, contactAlias.linked_at) && Intrinsics.areEqual(this.version, contactAlias.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ContactAliasType contactAliasType = this.alias_type;
        int hashCode3 = (hashCode2 + (contactAliasType != null ? contactAliasType.hashCode() : 0)) * 37;
        String str2 = this.alias_value;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.hashed_alias_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.updated_at;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.linked_at;
        int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.version;
        int hashCode8 = hashCode7 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.customer_token = this.customer_token;
        builder.alias_type = this.alias_type;
        builder.alias_value = this.alias_value;
        builder.hashed_alias_token = this.hashed_alias_token;
        builder.updated_at = this.updated_at;
        builder.linked_at = this.linked_at;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        ContactAliasType contactAliasType = this.alias_type;
        if (contactAliasType != null) {
            arrayList.add("alias_type=" + contactAliasType);
        }
        if (this.alias_value != null) {
            arrayList.add("alias_value=██");
        }
        String str2 = this.hashed_alias_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "hashed_alias_token=", arrayList);
        }
        Long l = this.updated_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l, arrayList);
        }
        Long l2 = this.linked_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("linked_at=", l2, arrayList);
        }
        Long l3 = this.version;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContactAlias{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object alias_type;
        public Serializable alias_value;
        public Serializable customer_token;
        public Serializable hashed_alias_token;
        public Object linked_at;
        public Object updated_at;
        public Object version;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 16:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.alias_type = emptyList;
                    this.updated_at = emptyList;
                    this.linked_at = emptyList;
                    break;
                default:
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    this.updated_at = emptyList2;
                    this.version = emptyList2;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ContactAlias((String) this.customer_token, (ContactAliasType) this.alias_type, (String) this.alias_value, (String) this.hashed_alias_token, (Long) this.updated_at, (Long) this.linked_at, (Long) this.version, buildUnknownFields());
                case 1:
                    return new TextRow((TintedIcon) this.hashed_alias_token, (String) this.customer_token, (String) this.alias_value, (RowAction) this.alias_type, (Boolean) this.updated_at, (Boolean) this.linked_at, (Boolean) this.version, buildUnknownFields());
                case 2:
                    return new BankMetadata((String) this.customer_token, (String) this.alias_value, (Country) this.alias_type, (BankMetadata.DisplaySettings) this.updated_at, (String) this.hashed_alias_token, (List) this.linked_at, (CardDetailsProto$DisplaySettings) this.version, buildUnknownFields());
                case 3:
                    return new BankinfoDetails((String) this.customer_token, (String) this.alias_value, (Country) this.alias_type, (Bank$DisplaySettings) this.updated_at, (String) this.hashed_alias_token, (List) this.linked_at, (CardDetailsProto$DisplaySettings) this.version, buildUnknownFields());
                case 4:
                    return new InstrumentVerificationDetails((Boolean) this.alias_type, (Long) this.updated_at, (String) this.customer_token, (String) this.alias_value, (String) this.hashed_alias_token, (String) this.linked_at, (String) this.version, buildUnknownFields());
                case 5:
                    return new Dependent((String) this.customer_token, (SponsorshipState) this.hashed_alias_token, (SendCashCta) this.alias_type, (LockCardWarning) this.updated_at, (Text) this.linked_at, (SponsorshipTier) this.version, (String) this.alias_value, buildUnknownFields());
                case 6:
                    return new AgentAccount((String) this.customer_token, (String) this.alias_value, (String) this.hashed_alias_token, (String) this.alias_type, (String) this.updated_at, (Money) this.linked_at, (Grant) this.version, buildUnknownFields());
                case 7:
                    return new AvailableNetwork((Chain) this.alias_type, (String) this.customer_token, (String) this.alias_value, (Money) this.updated_at, (Asset) this.linked_at, (String) this.hashed_alias_token, (Money) this.version, buildUnknownFields());
                case 8:
                    return new CardSpendingInsightsConfig((LocalizedString) this.customer_token, (LocalizedString) this.alias_value, (CardSpendingInsightsConfig.OverviewSection) this.hashed_alias_token, (CardSpendingInsightsConfig.InsightsSection) this.alias_type, (CardSpendingInsightsConfig.ActivitySection) this.updated_at, (LocalizedString) this.linked_at, (LocalizedString) this.version, buildUnknownFields());
                case 9:
                    return new AfterpayMerchantSheet((UiAvatar) this.customer_token, (LocalizedString) this.alias_value, (LocalizedString) this.hashed_alias_token, (AfterpayMerchantSheet$Content$PasteboardTextLines) this.alias_type, (Button) this.updated_at, (AnalyticsEvent) this.linked_at, (AnalyticsEvent) this.version, buildUnknownFields());
                case 10:
                    return new AvatarOverlayCardSection.InfoOverlayCardItem((ItemMetadata) this.customer_token, (Image) this.alias_value, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.hashed_alias_token, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.alias_type, (ShopInfoResponse) this.updated_at, (Color) this.linked_at, (Boolean) this.version, buildUnknownFields());
                case 11:
                    return new CreditDetailSheet.DetailRow((CreditLineType) this.customer_token, (CreditDetailSheet.DetailRow.DisplayStyle) this.alias_value, (LocalizedString) this.hashed_alias_token, (LocalizedString) this.alias_type, (Icon) this.updated_at, (TapAction) this.linked_at, (Boolean) this.version, buildUnknownFields());
                case 12:
                    String str = (String) this.customer_token;
                    String str2 = (String) this.alias_value;
                    String str3 = (String) this.hashed_alias_token;
                    String str4 = (String) this.alias_type;
                    return new OffersTabSearchRequest(str, str2, str3, (List) this.updated_at, (List) this.version, str4, (String) this.linked_at, buildUnknownFields());
                case 13:
                    return new RowSection.RowItem((ItemMetadata) this.alias_value, (Avatar) this.hashed_alias_token, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.alias_type, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.updated_at, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.linked_at, (String) this.customer_token, (com.squareup.protos.cash.p2p.profile_directory.ui.Button) this.version, buildUnknownFields());
                case 14:
                    return new SetGpsConsentStatusRequest((String) this.customer_token, (String) this.alias_value, (GpsConsentStatus) this.alias_type, (Platform) this.linked_at, (Long) this.updated_at, (Boolean) this.version, (String) this.hashed_alias_token, buildUnknownFields());
                case 15:
                    return new InitiateBitcoinWithdrawal$Request((String) this.customer_token, (RequestContext) this.alias_type, (LogAndroidKt) this.updated_at, (String) this.alias_value, (CryptoAmount) this.linked_at, (String) this.hashed_alias_token, (CryptoPaymentEntryPoint) this.version, buildUnknownFields());
                case 16:
                    return new RecipientSelectorSearchRequest((String) this.customer_token, (String) this.alias_value, (Boolean) this.hashed_alias_token, (List) this.alias_type, (List) this.updated_at, (List) this.linked_at, (Boolean) this.version, buildUnknownFields());
                case 17:
                    return new SearchCommonCardSection.SearchCommonCardItem((Metadata) this.alias_value, (Image) this.hashed_alias_token, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.alias_type, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.updated_at, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.linked_at, (com.squareup.protos.cash.p2p.profile_directory.ui.Text) this.version, (String) this.customer_token, buildUnknownFields());
                case 18:
                    return new AvatarOverlayCardSection.InfoOverlayCardItem((com.squareup.protos.cash.discover.api.app.v1.model.ItemMetadata) this.customer_token, (Image) this.alias_value, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.hashed_alias_token, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.alias_type, (com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoResponse) this.updated_at, (Color) this.linked_at, (Boolean) this.version, buildUnknownFields());
                case 19:
                    return new com.squareup.protos.cash.discover.api.app.v1.model.Button((Button.ButtonAction) this.alias_value, (String) this.customer_token, (ShopInfoHalfSheet) this.hashed_alias_token, (Color) this.alias_type, (FetcherKt) this.updated_at, (Button.ButtonStyle) this.linked_at, (Button.ButtonSize) this.version, buildUnknownFields());
                case 20:
                    return new RowSection.RowItem((com.squareup.protos.cash.discover.api.app.v1.model.ItemMetadata) this.alias_value, (com.squareup.protos.cash.discover.api.app.v1.model.Avatar) this.hashed_alias_token, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.alias_type, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.updated_at, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.linked_at, (String) this.customer_token, (com.squareup.protos.cash.discover.api.app.v1.model.Button) this.version, buildUnknownFields());
                case 21:
                    return new TileSection((Image) this.customer_token, (Double) this.alias_value, (TileSection.Composition) this.hashed_alias_token, (TileSection.ElementPlacement) this.alias_type, (TileSection.ElementPlacement) this.updated_at, (TileSection.SubtitlePlacement) this.linked_at, (DetailsPage) this.version, buildUnknownFields());
                case 22:
                    return new Summary((com.squareup.protos.cash.discover.api.app.v2.model.Text) this.alias_value, (com.squareup.protos.cash.discover.api.app.v2.model.Text) this.hashed_alias_token, (com.squareup.protos.cash.discover.api.app.v2.model.Text) this.alias_type, (com.squareup.protos.cash.discover.api.app.v2.model.Text) this.updated_at, (List) this.linked_at, (List) this.version, (String) this.customer_token, buildUnknownFields());
                case 23:
                    return new RowSection.SearchRow((String) this.customer_token, (UiAvatar) this.alias_type, (com.squareup.protos.cash.discover.api.app.v2.model.Text) this.updated_at, (com.squareup.protos.cash.discover.api.app.v2.model.Text) this.linked_at, (String) this.alias_value, (String) this.hashed_alias_token, (Boolean) this.version, buildUnknownFields());
                case 24:
                    return new PaymentUpdate((String) this.customer_token, (String) this.alias_value, (Money) this.hashed_alias_token, (PaymentStateCode) this.alias_type, (SenderProfileData) this.linked_at, (PaymentStateCategory) this.version, (Long) this.updated_at, buildUnknownFields());
                case 25:
                    return new ArcadeButtonElement((String) this.customer_token, (Action) this.alias_value, (ArcadeButtonElement.State) this.hashed_alias_token, (ArcadeButtonElement.Size) this.alias_type, (ArcadeButtonElement.Prominence) this.updated_at, (Boolean) this.linked_at, (Alignment) this.version, buildUnknownFields());
                case 26:
                    return new TextElement((String) this.customer_token, (TextElement.Style) this.alias_value, (Alignment) this.hashed_alias_token, (Color) this.alias_type, (Integer) this.updated_at, (VerticalAlignment) this.linked_at, (Boolean) this.version, buildUnknownFields());
                case 27:
                    return new UpdateShippingAddressRequest.ShippingAddress((ShippingAddressSource) this.hashed_alias_token, (String) this.customer_token, (FullName) this.alias_type, (GlobalAddress) this.updated_at, (Phone) this.linked_at, (String) this.alias_value, (DeliveryInstructions) this.version, buildUnknownFields());
                case 28:
                    return new GetWebAuthnCredentialsResponse.Credential((String) this.customer_token, (String) this.alias_value, (Long) this.updated_at, (Long) this.linked_at, (String) this.hashed_alias_token, (String) this.alias_type, (GetWebAuthnCredentialsResponse.Credential.DeviceType) this.version, buildUnknownFields());
                default:
                    return new CashGlobalUserSettings((String) this.customer_token, (String) this.alias_value, (String) this.hashed_alias_token, (String) this.alias_type, (String) this.updated_at, (String) this.linked_at, (Map) this.version, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
