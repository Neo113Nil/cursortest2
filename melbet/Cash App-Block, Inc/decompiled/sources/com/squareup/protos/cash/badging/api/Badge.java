package com.squareup.protos.cash.badging.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.zipline.loader.LoaderAndroidKt;
import coil3.network.internal.Utils_androidKt;
import coil3.size.ViewSizeResolverKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cashlynxflow.api.v2.AuthorizeDigitalWalletPaymentRequest;
import com.squareup.cash.idv.ProfilePageUpsellComponentV2;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.payments.presenters.UtilsKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.protos.cash.aegis.sync_values.GraduationCta;
import com.squareup.protos.cash.balancemover.api.v1.SavingsMoveCashRequest;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.cash.blockstable.api.v1.InitiateWithdrawalRequest;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AppContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportRequest;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CustomerContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.DeviceContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.FeatureContext;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection;
import com.squareup.protos.cash.cashsuggest.api.CreditLineData;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.cashsuggest.api.ItemMetadata;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.cashsuggest.api.PaymentDue;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.protos.cash.compass.api.CellTowerInfo;
import com.squareup.protos.cash.compass.api.GpsDataContext;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection;
import com.squareup.protos.cash.deviceintegritly.api.ValidateAttestationRequest;
import com.squareup.protos.cash.deviceintegritly.api.ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarOverlayCardSection;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.BaseElement;
import com.squareup.protos.cash.genericelements.ui.Button$IconButtonElement;
import com.squareup.protos.cash.genericelements.ui.Button$Type;
import com.squareup.protos.cash.genericelements.ui.CellActivityComponent;
import com.squareup.protos.cash.genericelements.ui.ColumnWidth;
import com.squareup.protos.cash.genericelements.ui.SemanticBackgroundColor;
import com.squareup.protos.cash.genericelements.ui.StyleAttributes;
import com.squareup.protos.cash.genericelements.ui.TwoColumnCardComponent;
import com.squareup.protos.cash.genericelements.ui.TwoColumnComponent;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import com.squareup.protos.cash.giftly.app.GiftCardType;
import com.squareup.protos.cash.grantly.api.DeliveryInstructions;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.investcrypto.event.CryptoOrderEvent;
import com.squareup.protos.cash.investcrypto.event.LedgerProcessor;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.investcrypto.resources.OrderStateReason;
import com.squareup.protos.cash.janus.api.FinishWebAuthnRegistrationRequest;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class Badge extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Badge> CREATOR;
    public final List count_groups;
    public final Long created_at;
    public final String customer_token;
    public final String external_token;
    public final Long external_version;
    public final Boolean is_badged;
    public final ItemType item_type;
    public final Long updated_at;

    static {
        Badge$Companion$ADAPTER$1 badge$Companion$ADAPTER$1 = new Badge$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Badge.class), "type.googleapis.com/squareup.cash.badging.api.Badge", Syntax.PROTO_2, null, "squareup/cash/badging/api/models.proto");
        ADAPTER = badge$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(badge$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Badge(String str, String str2, Long l, Long l2, Long l3, Boolean bool, ItemType itemType, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.external_token = str;
        this.customer_token = str2;
        this.external_version = l;
        this.updated_at = l2;
        this.created_at = l3;
        this.is_badged = bool;
        this.item_type = itemType;
        this.count_groups = TransactorKt.immutableCopyOf("count_groups", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return Intrinsics.areEqual(unknownFields(), badge.unknownFields()) && Intrinsics.areEqual(this.external_token, badge.external_token) && Intrinsics.areEqual(this.customer_token, badge.customer_token) && Intrinsics.areEqual(this.external_version, badge.external_version) && Intrinsics.areEqual(this.updated_at, badge.updated_at) && Intrinsics.areEqual(this.created_at, badge.created_at) && Intrinsics.areEqual(this.is_badged, badge.is_badged) && this.item_type == badge.item_type && Intrinsics.areEqual(this.count_groups, badge.count_groups);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.external_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.external_version;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.created_at;
        int hashCode6 = (hashCode5 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Boolean bool = this.is_badged;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ItemType itemType = this.item_type;
        int hashCode8 = this.count_groups.hashCode() + ((hashCode7 + (itemType != null ? itemType.hashCode() : 0)) * 37);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.external_token = this.external_token;
        builder.customer_token = this.customer_token;
        builder.external_version = this.external_version;
        builder.updated_at = this.updated_at;
        builder.created_at = this.created_at;
        builder.is_badged = this.is_badged;
        builder.item_type = this.item_type;
        builder.count_groups = this.count_groups;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.external_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_token=", arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        Long l = this.external_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("external_version=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        Long l3 = this.created_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l3, arrayList);
        }
        Boolean bool = this.is_badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
        }
        ItemType itemType = this.item_type;
        if (itemType != null) {
            arrayList.add("item_type=" + itemType);
        }
        List list = this.count_groups;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("count_groups=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Badge{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object count_groups;
        public Object created_at;
        public Serializable customer_token;
        public Object external_token;
        public Object external_version;
        public Object is_badged;
        public Object item_type;
        public Serializable updated_at;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 15:
                    this.count_groups = EmptyList.INSTANCE;
                    break;
                default:
                    this.count_groups = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Badge((String) this.external_token, (String) this.customer_token, (Long) this.external_version, (Long) this.updated_at, (Long) this.created_at, (Boolean) this.is_badged, (ItemType) this.item_type, (List) this.count_groups, buildUnknownFields());
                case 1:
                    return new AuthorizeDigitalWalletPaymentRequest((UtilsKt) this.external_version, (RequestContext) this.updated_at, (String) this.external_token, (String) this.customer_token, (String) this.created_at, (String) this.is_badged, (String) this.item_type, (GlobalAddress) this.count_groups, buildUnknownFields());
                case 2:
                    return new ProfilePageUpsellComponentV2((ProfilePageUpsellComponentV2.Icon) this.external_version, (String) this.external_token, (String) this.customer_token, (String) this.updated_at, (String) this.created_at, (ProfilePageUpsellComponentV2.IconV2) this.is_badged, (LocalizableString) this.item_type, (LocalizableString) this.count_groups, buildUnknownFields());
                case 3:
                    return new ComposePlatform.Modifier.Size((Expression) this.external_token, (Expression) this.customer_token, (Expression) this.external_version, (Expression) this.updated_at, (Expression) this.created_at, (Expression) this.is_badged, (Expression) this.item_type, (Expression) this.count_groups, buildUnknownFields());
                case 4:
                    return new CashCreditScoreHomeData.ScoreSummary((CashCreditScoreHomeData.Visualization) this.customer_token, (Integer) this.external_version, (Integer) this.updated_at, (String) this.external_token, (Icon) this.created_at, (LocalizedString) this.is_badged, (LocalizedString) this.item_type, (CashCreditScoreHomeData.Action) this.count_groups, buildUnknownFields());
                case 5:
                    return new DeviceInfo((Long) this.external_version, (String) this.external_token, (String) this.customer_token, (String) this.created_at, (DeviceInfo.DeviceType) this.is_badged, (String) this.item_type, (DeviceInfo.Status) this.count_groups, (Long) this.updated_at, buildUnknownFields());
                case 6:
                    return new GraduationCta((String) this.external_token, (String) this.customer_token, (String) this.external_version, (String) this.updated_at, (Image) this.created_at, (LocalizableString) this.is_badged, (LocalizableString) this.item_type, (LocalizableString) this.count_groups, buildUnknownFields());
                case 7:
                    return new SavingsMoveCashRequest((RequestContext) this.external_version, (String) this.external_token, (String) this.customer_token, (String) this.updated_at, (Money) this.created_at, (SavingsTransferContext) this.is_badged, (BalanceSnapshot) this.item_type, (String) this.count_groups, buildUnknownFields());
                case 8:
                    return new InitiateWithdrawalRequest((String) this.external_token, (RequestContext) this.external_version, (String) this.customer_token, (Money) this.updated_at, (String) this.created_at, (String) this.is_badged, (String) this.item_type, (String) this.count_groups, buildUnknownFields());
                case 9:
                    return new CreateBugReportRequest((String) this.external_token, (String) this.customer_token, (List) this.count_groups, (CustomerContext) this.external_version, (AppContext) this.updated_at, (DeviceContext) this.created_at, (String) this.is_badged, (FeatureContext) this.item_type, buildUnknownFields());
                case 10:
                    return new GetListingDetailsResponse((String) this.external_token, (GetListingDetailsResponse.Customer) this.external_version, (Money) this.updated_at, (String) this.customer_token, (String) this.created_at, (String) this.item_type, (GetListingDetailsResponse.CoverImage) this.count_groups, (Boolean) this.is_badged, buildUnknownFields());
                case 11:
                    return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage((Long) this.external_version, (Long) this.updated_at, (Long) this.created_at, (Double) this.is_badged, (String) this.external_token, (String) this.customer_token, (String) this.item_type, (zzuh) this.count_groups, buildUnknownFields());
                case 12:
                    return new AppletCardSection.TileCarousel.Tile((UiAvatar) this.external_token, (LocalizedString) this.customer_token, (Image) this.external_version, (AppletCardSection.TileCarousel.Tile.OverlayColor) this.updated_at, (Boolean) this.is_badged, (EngagedItemToken) this.created_at, (TapAction) this.item_type, (AnalyticsEvent) this.count_groups, buildUnknownFields());
                case 13:
                    return new AvatarOverlayCardSection.AvatarOverlayCardItem((ItemMetadata) this.customer_token, (Image) this.external_version, (ImageLayout) this.updated_at, (Avatar) this.created_at, (Text) this.is_badged, (Text) this.item_type, (String) this.external_token, (ShopInfoResponse) this.count_groups, buildUnknownFields());
                case 14:
                    return new CreditLineData((CreditLineType) this.external_token, (Money) this.customer_token, (Money) this.external_version, (Money) this.updated_at, (Money) this.created_at, (List) this.count_groups, (Money) this.is_badged, (PaymentDue) this.item_type, buildUnknownFields());
                case 15:
                    return new OffersTabCollectionResponse((LocalizedString) this.updated_at, (List) this.count_groups, (Long) this.external_version, (AnalyticsEvent) this.created_at, (FormattedDetail) this.is_badged, (String) this.external_token, (String) this.customer_token, (OffersTabCollectionResponse.InStoreBoostMetadata) this.item_type, buildUnknownFields());
                case 16:
                    return new CellTowerInfo((Integer) this.external_token, (Integer) this.customer_token, (Long) this.external_version, (Integer) this.updated_at, (Integer) this.created_at, (Integer) this.item_type, (Boolean) this.is_badged, (RadioType) this.count_groups, buildUnknownFields());
                case 17:
                    return new GpsDataContext((Long) this.external_version, (String) this.external_token, (String) this.customer_token, (String) this.updated_at, (String) this.created_at, (String) this.is_badged, (String) this.item_type, (GpsDataContext.Environment) this.count_groups, buildUnknownFields());
                case 18:
                    return new SearchCommonSection((LoaderAndroidKt) this.external_token, (Integer) this.customer_token, (Text) this.external_version, (Text) this.updated_at, (Button) this.created_at, (SearchCommonSection.Layout) this.is_badged, (Button) this.item_type, (com.squareup.protos.cash.customersearch.api.TapAction) this.count_groups, buildUnknownFields());
                case 19:
                    return new ValidateAttestationRequest((String) this.external_token, (String) this.customer_token, (String) this.external_version, (ByteString) this.updated_at, (Integer) this.created_at, (Integer) this.is_badged, (ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation) this.item_type, (ByteString) this.count_groups, buildUnknownFields());
                case 20:
                    return new AvatarOverlayCardSection.AvatarOverlayCardItem((com.squareup.protos.cash.discover.api.app.v1.model.ItemMetadata) this.customer_token, (Image) this.external_version, (com.squareup.protos.cash.discover.api.app.v1.model.ImageLayout) this.updated_at, (com.squareup.protos.cash.discover.api.app.v1.model.Avatar) this.created_at, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.is_badged, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.item_type, (String) this.external_token, (com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoResponse) this.count_groups, buildUnknownFields());
                case 21:
                    return new ArcadeBadgedAvatarElement((ArcadeBadgedAvatarElement.Size) this.external_version, (String) this.external_token, (SemanticBackgroundColor) this.updated_at, (String) this.customer_token, (zzbc) this.created_at, (Utils_androidKt) this.is_badged, (Alignment) this.item_type, (Color) this.count_groups, buildUnknownFields());
                case 22:
                    return new ArcadeTextElement((String) this.external_token, (ArcadeTextElement.Style) this.customer_token, (Alignment) this.external_version, (Color) this.updated_at, (ArcadeTextElement.SemanticTextColor) this.created_at, (Integer) this.item_type, (VerticalAlignment) this.count_groups, (Boolean) this.is_badged, buildUnknownFields());
                case 23:
                    return new Button$IconButtonElement((Image) this.external_token, (Action) this.customer_token, (Button$Type) this.external_version, (Button$IconButtonElement.State) this.updated_at, (Button$IconButtonElement.Size) this.created_at, (Alignment) this.is_badged, (Color) this.item_type, (Color) this.count_groups, buildUnknownFields());
                case 24:
                    return new CellActivityComponent((BaseElement) this.external_version, (String) this.external_token, (BaseElement) this.updated_at, (ViewSizeResolverKt) this.created_at, (Action) this.item_type, (String) this.customer_token, (String) this.count_groups, (Boolean) this.is_badged, buildUnknownFields());
                case 25:
                    return new TwoColumnCardComponent((List) this.count_groups, (List) this.external_token, (ColumnWidth) this.customer_token, (Action) this.external_version, (StyleAttributes) this.updated_at, (TwoColumnComponent) this.created_at, (TwoColumnCardComponent.Spacing) this.is_badged, (VerticalAlignment) this.item_type, buildUnknownFields());
                case 26:
                    return new GiftCardType((String) this.external_token, (String) this.customer_token, (String) this.external_version, (String) this.updated_at, (Image) this.created_at, (String) this.is_badged, (List) this.count_groups, (Color) this.item_type, buildUnknownFields());
                case 27:
                    return new CreateShippingAddressRequest.ShippingAddress((String) this.external_token, (ShippingAddressSource) this.external_version, (String) this.customer_token, (FullName) this.updated_at, (GlobalAddress) this.created_at, (Phone) this.is_badged, (String) this.item_type, (DeliveryInstructions) this.count_groups, buildUnknownFields());
                case 28:
                    return new CryptoOrderEvent((Order) this.external_token, (Long) this.external_version, (Long) this.updated_at, (Long) this.created_at, (OrderStateReason) this.customer_token, (LedgerProcessor) this.is_badged, (Region) this.item_type, (Long) this.count_groups, buildUnknownFields());
                default:
                    return new FinishWebAuthnRegistrationRequest((String) this.external_token, (String) this.customer_token, (String) this.external_version, (ByteString) this.updated_at, (ByteString) this.created_at, (ByteString) this.is_badged, (RequestContext) this.item_type, (ByteString) this.count_groups, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
