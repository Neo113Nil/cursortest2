package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzju;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.protos.cash.local.client.app.v1.BrandTile;
import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
import com.squareup.protos.cash.local.client.v1.CurbsidePickupSettings;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.messagingplatformcommon.app.ActivityInlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.DetailsPageView;
import com.squareup.protos.cash.messagingplatformcommon.app.HeroTileView;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Text;
import com.squareup.protos.cash.money.content.FinishSetupTileV1;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.p2p.profile_directory.ui.Range;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet;
import com.squareup.protos.cash.p2p.profile_directory.ui.TextStyle;
import com.squareup.protos.cash.pay.CashAppPayLineItemRenderData;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.referly.api.incentives.client.AvailablePromotion;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsMetadata;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.IconId;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.ZeroResultsMessageSection;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsight;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsightType;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;
import com.squareup.protos.common.Money;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PoolParticipant extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PoolParticipant> CREATOR;
    public final Long added_at;
    public final Money aggregated_contribution_amount;
    public final String cashtag;
    public final String customer_identifier;
    public final String full_name;
    public final PoolParticipantType participant_type;
    public final String profile_photo_url;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object added_at;
        public Object aggregated_contribution_amount;
        public Object cashtag;
        public Serializable customer_identifier;
        public Object full_name;
        public Object participant_type;
        public Object profile_photo_url;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new PoolParticipant((String) this.customer_identifier, (Long) this.added_at, (String) this.full_name, (String) this.profile_photo_url, (PoolParticipantType) this.participant_type, (String) this.cashtag, (Money) this.aggregated_contribution_amount, buildUnknownFields());
                case 1:
                    String str = (String) this.customer_identifier;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(str, "brand_token");
                        throw null;
                    }
                    String str2 = (String) this.full_name;
                    if (str2 != null) {
                        return new BrandTile(str, str2, (LocalColor) this.cashtag, (LocalColor) this.added_at, (LocalImage) this.participant_type, (String) this.profile_photo_url, (LocalColor) this.aggregated_contribution_amount, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str2, "name");
                    throw null;
                case 2:
                    return new LocalEarningCard((String) this.customer_identifier, (String) this.full_name, (String) this.profile_photo_url, (LocalImage) this.added_at, (LocalEarningCard.EarningState) this.participant_type, (LocalEarningCard.Source) this.aggregated_contribution_amount, (String) this.cashtag, buildUnknownFields());
                case 3:
                    return new LocalCheckoutLocationSummary((String) this.customer_identifier, (LocalAddress) this.cashtag, (String) this.full_name, (String) this.profile_photo_url, (Boolean) this.added_at, (CurbsidePickupSettings) this.participant_type, (List) this.aggregated_contribution_amount, buildUnknownFields());
                case 4:
                    return new LocalMenuItemModifierList.Modifier((String) this.customer_identifier, (String) this.full_name, (LocalMoney) this.profile_photo_url, (Boolean) this.cashtag, (LocalMenuAvailability) this.added_at, (LocalImage) this.participant_type, (List) this.aggregated_contribution_amount, buildUnknownFields());
                case 5:
                    return new ActivityInlineMessage((String) this.customer_identifier, (String) this.full_name, (String) this.profile_photo_url, (AppMessageAction) this.cashtag, (AppMessageAction) this.added_at, (Boolean) this.participant_type, (Boolean) this.aggregated_contribution_amount, buildUnknownFields());
                case 6:
                    return new HeroTileView((Image) this.customer_identifier, (Double) this.full_name, (AppMessageAction) this.profile_photo_url, (Text) this.cashtag, (Text) this.added_at, (Text) this.participant_type, (DetailsPageView) this.aggregated_contribution_amount, buildUnknownFields());
                case 7:
                    return new InlineMessage((InlineMessage.Placement) this.profile_photo_url, (zzju) this.cashtag, (String) this.customer_identifier, (String) this.full_name, (AppMessageAction) this.added_at, (AppMessageAction) this.participant_type, (Boolean) this.aggregated_contribution_amount, buildUnknownFields());
                case 8:
                    return new FinishSetupTileV1((String) this.customer_identifier, (Integer) this.profile_photo_url, (Integer) this.cashtag, (com.squareup.protos.cash.ui.Image) this.added_at, (String) this.full_name, (Boolean) this.participant_type, (Boolean) this.aggregated_contribution_amount, buildUnknownFields());
                case 9:
                    return new Button((Button.ButtonAction) this.full_name, (String) this.customer_identifier, (ShopInfoHalfSheet) this.profile_photo_url, (Color) this.cashtag, (ErrorEvent.Companion) this.added_at, (Button.ButtonStyle) this.participant_type, (Button.ButtonSize) this.aggregated_contribution_amount, buildUnknownFields());
                case 10:
                    return new HighlightText((String) this.customer_identifier, (Range) this.full_name, (TextStyle) this.profile_photo_url, (Color) this.cashtag, (TextStyle) this.added_at, (Color) this.participant_type, (com.squareup.protos.cash.ui.Image) this.aggregated_contribution_amount, buildUnknownFields());
                case 11:
                    return new CashAppPayLineItemRenderData((String) this.customer_identifier, (String) this.full_name, (String) this.profile_photo_url, (Money) this.aggregated_contribution_amount, (String) this.cashtag, (List) this.added_at, (List) this.participant_type, buildUnknownFields());
                case 12:
                    return new CashAppPayMerchantRenderData((String) this.customer_identifier, (String) this.full_name, (String) this.profile_photo_url, (String) this.cashtag, (CashAppPayMerchantRenderData.LogoUrls) this.added_at, (CashAppPayMerchantRenderData.BrandColors) this.participant_type, (Boolean) this.aggregated_contribution_amount, buildUnknownFields());
                case 13:
                    return new ContributionRecord((String) this.customer_identifier, (Long) this.added_at, (Long) this.cashtag, (String) this.full_name, (TransactionType) this.participant_type, (PoolContributionStatus) this.aggregated_contribution_amount, (String) this.profile_photo_url, buildUnknownFields());
                case 14:
                    return new PoolOwnerContributionFlowParameters((String) this.customer_identifier, (Money) this.aggregated_contribution_amount, (String) this.full_name, (BalanceSnapshot) this.added_at, (InstrumentType) this.participant_type, (String) this.profile_photo_url, (String) this.cashtag, buildUnknownFields());
                case 15:
                    return new CardModule.LineItemElement((CardModule.InformationSource) this.full_name, (String) this.customer_identifier, (CardModule.Push) this.profile_photo_url, (LocalizedString) this.cashtag, (Icon) this.added_at, (LocalizedString) this.participant_type, (Boolean) this.aggregated_contribution_amount, buildUnknownFields());
                case 16:
                    return new AvailablePromotion((String) this.customer_identifier, (String) this.full_name, (String) this.profile_photo_url, (String) this.cashtag, (com.squareup.protos.cash.ui.Image) this.added_at, (String) this.participant_type, (String) this.aggregated_contribution_amount, buildUnknownFields());
                case 17:
                    return new AnalyticsMetadata((String) this.customer_identifier, (String) this.full_name, (AnalyticsMetadata.EntityType) this.added_at, (String) this.profile_photo_url, (String) this.cashtag, (String) this.participant_type, (String) this.aggregated_contribution_amount, buildUnknownFields());
                case 18:
                    return new AvatarCarouselSection.AvatarItem((AnalyticsEvent) this.customer_identifier, (TapAction) this.full_name, (UiAvatar) this.profile_photo_url, (LocalizedString) this.cashtag, (EngagedItemToken) this.added_at, (AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata) this.participant_type, (LocalizedString) this.aggregated_contribution_amount, buildUnknownFields());
                case 19:
                    return new FilterGroupSection.FilterGroupItem.FilterItem((String) this.customer_identifier, (TapAction) this.profile_photo_url, (Icon) this.cashtag, (LocalizedString) this.added_at, (LocalizedString) this.participant_type, (String) this.full_name, (com.squareup.protos.cash.ui.Image) this.aggregated_contribution_amount, buildUnknownFields());
                case 20:
                    return new FilterGroupSection.FilterGroupItem.Sheet((LocalizedString) this.full_name, (List) this.profile_photo_url, (FilterGroupSection.FilterGroupItem.ItemLayout) this.cashtag, (com.squareup.protos.cash.shop.rendering.api.Button) this.added_at, (com.squareup.protos.cash.shop.rendering.api.Button) this.participant_type, (AnalyticsEvent) this.aggregated_contribution_amount, (String) this.customer_identifier, buildUnknownFields());
                case 21:
                    return new FormattedDetail((Icon) this.customer_identifier, (LocalizedString) this.full_name, (FormattedDetail.CreditInfoCheck) this.profile_photo_url, (FormattedDetail.LoanInfoCheck) this.cashtag, (FormattedDetail.CountdownInfoCheck) this.added_at, (IconId) this.participant_type, (StyledText) this.aggregated_contribution_amount, buildUnknownFields());
                case 22:
                    return new InfoSheet((LocalizedString) this.customer_identifier, (LocalizedString) this.full_name, (AnalyticsEvent) this.profile_photo_url, (AnalyticsEvent) this.cashtag, (com.squareup.protos.cash.shop.rendering.api.Button) this.added_at, (List) this.participant_type, (UiAvatar) this.aggregated_contribution_amount, buildUnknownFields());
                case 23:
                    return new SectionHeader((LocalizedString) this.customer_identifier, (LocalizedString) this.full_name, (com.squareup.protos.cash.shop.rendering.api.Button) this.profile_photo_url, (TapAction) this.cashtag, (SectionHeader.DisplayEffect) this.added_at, (StyledText) this.participant_type, (StyledText) this.aggregated_contribution_amount, buildUnknownFields());
                case 24:
                    return new ZeroResultsMessageSection((com.squareup.protos.cash.ui.Image) this.customer_identifier, (LocalizedString) this.full_name, (LocalizedString) this.profile_photo_url, (com.squareup.protos.cash.shop.rendering.api.Button) this.cashtag, (AnalyticsEvent) this.added_at, (StyledText) this.participant_type, (StyledText) this.aggregated_contribution_amount, buildUnknownFields());
                case 25:
                    return new CardSpendingInsight((CardSpendingInsightType) this.customer_identifier, (List) this.full_name, (HorizontalBarGraph) this.profile_photo_url, (ColoredButton) this.cashtag, (TextSize) this.added_at, (LocalizedString) this.participant_type, (List) this.aggregated_contribution_amount, buildUnknownFields());
                case 26:
                    return new ChatMessage((String) this.customer_identifier, (Long) this.added_at, (String) this.full_name, (ChatMessage.Body) this.profile_photo_url, (zzlk) this.cashtag, (List) this.participant_type, (ChatMessage.Disclaimer) this.aggregated_contribution_amount, buildUnknownFields());
                case 27:
                    return new SupportPhoneStatusResponse.Active((SupportPhoneStatusResponse.ActiveStatus) this.added_at, (SupportPhoneStatusResponse.ServiceAvailability) this.participant_type, (String) this.customer_identifier, (String) this.full_name, (Boolean) this.aggregated_contribution_amount, (String) this.profile_photo_url, (String) this.cashtag, buildUnknownFields());
                case 28:
                    return new LineGraph.Line.DataPoint((Long) this.added_at, (Long) this.customer_identifier, (LocalizedString) this.full_name, (LocalizedString) this.profile_photo_url, (LocalizedString) this.cashtag, (Icon) this.participant_type, (Color) this.aggregated_contribution_amount, buildUnknownFields());
                default:
                    return new PerformanceDetailsUiSection.Row.MoreInfo((String) this.customer_identifier, (String) this.full_name, (String) this.profile_photo_url, (String) this.cashtag, (LocalizableString) this.added_at, (LocalizableString) this.participant_type, (LocalizableString) this.aggregated_contribution_amount, buildUnknownFields());
            }
        }
    }

    static {
        PoolParticipant$Companion$ADAPTER$1 poolParticipant$Companion$ADAPTER$1 = new PoolParticipant$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PoolParticipant.class), "type.googleapis.com/squareup.cash.pools.v1beta.PoolParticipant", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = poolParticipant$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(poolParticipant$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolParticipant(String str, Long l, String str2, String str3, PoolParticipantType poolParticipantType, String str4, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_identifier = str;
        this.added_at = l;
        this.full_name = str2;
        this.profile_photo_url = str3;
        this.participant_type = poolParticipantType;
        this.cashtag = str4;
        this.aggregated_contribution_amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoolParticipant)) {
            return false;
        }
        PoolParticipant poolParticipant = (PoolParticipant) obj;
        return Intrinsics.areEqual(unknownFields(), poolParticipant.unknownFields()) && Intrinsics.areEqual(this.customer_identifier, poolParticipant.customer_identifier) && Intrinsics.areEqual(this.added_at, poolParticipant.added_at) && Intrinsics.areEqual(this.full_name, poolParticipant.full_name) && Intrinsics.areEqual(this.profile_photo_url, poolParticipant.profile_photo_url) && this.participant_type == poolParticipant.participant_type && Intrinsics.areEqual(this.cashtag, poolParticipant.cashtag) && Intrinsics.areEqual(this.aggregated_contribution_amount, poolParticipant.aggregated_contribution_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_identifier;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.added_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.full_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.profile_photo_url;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        PoolParticipantType poolParticipantType = this.participant_type;
        int hashCode6 = (hashCode5 + (poolParticipantType != null ? poolParticipantType.hashCode() : 0)) * 37;
        String str4 = this.cashtag;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Money money = this.aggregated_contribution_amount;
        int hashCode8 = hashCode7 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.customer_identifier = this.customer_identifier;
        builder.added_at = this.added_at;
        builder.full_name = this.full_name;
        builder.profile_photo_url = this.profile_photo_url;
        builder.participant_type = this.participant_type;
        builder.cashtag = this.cashtag;
        builder.aggregated_contribution_amount = this.aggregated_contribution_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_identifier=", arrayList);
        }
        Long l = this.added_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("added_at=", l, arrayList);
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.profile_photo_url != null) {
            arrayList.add("profile_photo_url=██");
        }
        PoolParticipantType poolParticipantType = this.participant_type;
        if (poolParticipantType != null) {
            arrayList.add("participant_type=" + poolParticipantType);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        Money money = this.aggregated_contribution_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("aggregated_contribution_amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PoolParticipant{", "}", 0, null, null, 56);
    }
}
