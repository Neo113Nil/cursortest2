package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjh;
import com.google.android.gms.internal.mlkit_vision_common.zzjk;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.p2pencore.v1.RecurringPayment;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.local.client.v1.AppointmentSlotSpec;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.protos.cash.local.client.v1.LocalOnboardingUpsell;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionAvailability;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder;
import com.squareup.protos.cash.marketdata.GetCustomerNewsResponse;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.cash.marketdata.model.PortfolioNews;
import com.squareup.protos.cash.marketdata.model.SectorsDetails;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsResponse;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFixed;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageText;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageUnorderedListItem;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.protos.cash.nearby.api.v1.ConnectionData;
import com.squareup.protos.cash.nearby.api.v1.CreateNearbySessionResponse;
import com.squareup.protos.cash.nearby.api.v1.NearbySession;
import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsRequest;
import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsResponse;
import com.squareup.protos.cash.p2pencoreedge.plasma.flows.Type;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GiftCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GiftCard> CREATOR;
    public final LocalMoney gift_card_amount;
    public final String gift_card_id;
    public final String id;
    public final String last_4;

    static {
        GiftCard$Companion$ADAPTER$1 giftCard$Companion$ADAPTER$1 = new GiftCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCard.class), "type.googleapis.com/squareup.cash.local.client.v1.GiftCard", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = giftCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCard(String str, String str2, LocalMoney localMoney, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.last_4 = str2;
        this.gift_card_amount = localMoney;
        this.gift_card_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftCard)) {
            return false;
        }
        GiftCard giftCard = (GiftCard) obj;
        return Intrinsics.areEqual(unknownFields(), giftCard.unknownFields()) && Intrinsics.areEqual(this.id, giftCard.id) && Intrinsics.areEqual(this.last_4, giftCard.last_4) && Intrinsics.areEqual(this.gift_card_amount, giftCard.gift_card_amount) && Intrinsics.areEqual(this.gift_card_id, giftCard.gift_card_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.last_4;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.gift_card_amount;
        int hashCode4 = (hashCode3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        String str3 = this.gift_card_id;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.id = this.id;
        builder.last_4 = this.last_4;
        builder.gift_card_amount = this.gift_card_amount;
        builder.gift_card_id = this.gift_card_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.id != null) {
            arrayList.add("id=██");
        }
        String str = this.last_4;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "last_4=", arrayList);
        }
        LocalMoney localMoney = this.gift_card_amount;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("gift_card_amount=", localMoney, arrayList);
        }
        String str2 = this.gift_card_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "gift_card_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCard{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object gift_card_amount;
        public Object gift_card_id;
        public Serializable id;
        public Serializable last_4;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 14:
                    this.gift_card_amount = EmptyList.INSTANCE;
                    break;
                default:
                    this.gift_card_amount = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GiftCard((String) this.id, (String) this.last_4, (LocalMoney) this.gift_card_amount, (String) this.gift_card_id, buildUnknownFields());
                case 1:
                    return new AppointmentSlotSpec.AvailableSlot((String) this.id, (Instant) this.gift_card_id, (Instant) this.gift_card_amount, (String) this.last_4, buildUnknownFields());
                case 2:
                    return new CreateCartResponse.CartLoyaltySummary((LocalLoyaltyProgram) this.last_4, (LocalLoyaltyAccount) this.gift_card_id, (List) this.gift_card_amount, (String) this.id, buildUnknownFields());
                case 3:
                    return new GetDeliveryQuoteRequest((String) this.id, (LocalAddress) this.gift_card_id, (String) this.last_4, (List) this.gift_card_amount, buildUnknownFields());
                case 4:
                    return new GetDeliveryQuoteResponse.DeliveryQuote((String) this.id, (LocalLocationSummary) this.last_4, (LocalFulfillment) this.gift_card_id, (LocalMoney) this.gift_card_amount, buildUnknownFields());
                case 5:
                    return new GetEditorialResponse((String) this.id, (String) this.last_4, (List) this.gift_card_id, (GetEditorialResponse.ShareLinkInfo) this.gift_card_amount, buildUnknownFields());
                case 6:
                    return new LocalActionP2P((Boolean) this.last_4, (String) this.id, (Boolean) this.gift_card_id, (Boolean) this.gift_card_amount, buildUnknownFields());
                case 7:
                    return new LocalCashEarningsConfiguration.Tier((LocalMoney) this.gift_card_amount, (Long) this.id, (LocalMoney) this.last_4, (Long) this.gift_card_id, buildUnknownFields());
                case 8:
                    return new LocalInStoreOrderingIntent((String) this.id, (String) this.last_4, (LocalShoppingCart) this.gift_card_id, (LocalCart) this.gift_card_amount, buildUnknownFields());
                case 9:
                    return new LocalMenuComboCategory((String) this.id, (String) this.last_4, (List) this.gift_card_id, (LocalImage) this.gift_card_amount, buildUnknownFields());
                case 10:
                    return new LocalMenuItem.ModifierListConfig((String) this.id, (Integer) this.last_4, (Integer) this.gift_card_id, (Boolean) this.gift_card_amount, buildUnknownFields());
                case 11:
                    return new LocalMiniCard((LocalColor) this.id, (LocalImage) this.last_4, (LocalImage) this.gift_card_id, (LocalColor) this.gift_card_amount, buildUnknownFields());
                case 12:
                    return new LocalNumberedListItem((Long) this.gift_card_id, (String) this.id, (String) this.last_4, (LocalImage) this.gift_card_amount, buildUnknownFields());
                case 13:
                    return new LocalOnboardingUpsell((String) this.id, (String) this.last_4, (LocalOnboardingUpsell.Button) this.gift_card_id, (LegalConsent) this.gift_card_amount, buildUnknownFields());
                case 14:
                    return new UpdateCartRequest((String) this.id, (String) this.last_4, (CreateCartRequest) this.gift_card_id, (List) this.gift_card_amount, buildUnknownFields());
                case 15:
                    return new UpdateUserIntentRequest((String) this.id, (String) this.last_4, (String) this.gift_card_id, (zzjh) this.gift_card_amount, buildUnknownFields());
                case 16:
                    return new LoyaltyPromotionSheetPlaceholder((LoyaltyPromotionAvailability) this.id, (LoyaltyPromotionSheetPlaceholder.LocationData) this.last_4, (AnalyticsEvent) this.gift_card_id, (Color) this.gift_card_amount, buildUnknownFields());
                case 17:
                    return new GetCustomerNewsResponse((PortfolioNews) this.id, (PortfolioNews) this.last_4, (Integer) this.gift_card_id, (Long) this.gift_card_amount, buildUnknownFields());
                case 18:
                    return new InvestmentEarnings.Earning((String) this.id, (String) this.last_4, (Money) this.gift_card_id, (zzjk) this.gift_card_amount, buildUnknownFields());
                case 19:
                    return new GetETFDetailsResponse((Long) this.id, (HoldingsDetails) this.last_4, (SectorsDetails) this.gift_card_id, (Long) this.gift_card_amount, buildUnknownFields());
                case 20:
                    return new CurrentPrice((String) this.id, (Money) this.last_4, (Money) this.gift_card_id, (Long) this.gift_card_amount, buildUnknownFields());
                case 21:
                    return new AppMessageAction((String) this.id, (String) this.last_4, (String) this.gift_card_id, (Color) this.gift_card_amount, buildUnknownFields());
                case 22:
                    return new ImageFixed((String) this.id, (Integer) this.last_4, (Integer) this.gift_card_id, (Image) this.gift_card_amount, buildUnknownFields());
                case 23:
                    return new Video((String) this.id, (String) this.last_4, (Boolean) this.gift_card_id, (Video.AudioPreference) this.gift_card_amount, buildUnknownFields());
                case 24:
                    return new DetailsPageUnorderedListItem((Icon) this.id, (DetailsPageText) this.last_4, (DetailsPageText) this.gift_card_id, (DetailsPageUnorderedListItem.IconAlignment) this.gift_card_amount, buildUnknownFields());
                case 25:
                    return new SelectInstrumentRequest.ApplePayPayload((String) this.id, (SelectInstrumentRequest.ApplePayPayload.Header) this.gift_card_amount, (String) this.last_4, (String) this.gift_card_id, buildUnknownFields());
                case 26:
                    return new CreateNearbySessionResponse((NearbySession) this.id, (ConnectionData) this.last_4, (ByteString) this.gift_card_id, (Long) this.gift_card_amount, buildUnknownFields());
                case 27:
                    return new GetRecurringPaymentsRequest((String) this.id, (String) this.last_4, (Type) this.gift_card_id, (Boolean) this.gift_card_amount, buildUnknownFields());
                case 28:
                    return new GetRecurringPaymentsResponse.RecurringPaymentWrapper((RecurringPayment) this.gift_card_amount, (String) this.id, (String) this.last_4, (String) this.gift_card_id, buildUnknownFields());
                default:
                    return new GetRetailerLocationsResponse.DepositMethods((Boolean) this.id, (Boolean) this.last_4, (Money) this.gift_card_id, (Money) this.gift_card_amount, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(boolean z) {
            this.$r8$classId = 27;
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
