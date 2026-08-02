package com.squareup.protos.document;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.cash.gambit.api.v1.checkdeposit.DeclineReason;
import com.squareup.protos.cash.local.client.v1.GetMapLocationsResponse;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemComboSlot;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemVariation;
import com.squareup.protos.cash.local.client.v1.LocalMiniCard;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityTradability;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityVisibility;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.cash.notificationsettings.api.v1.CategoryPreferenceUpdate;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.protos.cash.piggybank.api.v2.InterestRate;
import com.squareup.protos.cash.piggybank.api.v2.SavingsBalance;
import com.squareup.protos.cash.piggybank.api.v2.SavingsCustomer;
import com.squareup.protos.cash.piggybank.api.v2.SavingsGoal;
import com.squareup.protos.cash.piggybank.appapi.AutomationSection;
import com.squareup.protos.cash.piggybank.appapi.GetSavingsOverviewResponse;
import com.squareup.protos.cash.piggybank.appapi.SavingsConfig;
import com.squareup.protos.cash.postbank.api.GetDirectDepositFormResponse;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.ClusterInfoItem;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.OfferTimelineSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection;
import com.squareup.protos.cash.shop.rendering.api.UpsellSheet;
import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.protos.cash.taply.syncvalues.PhysicalTagOrderState;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.app.RegisterEmailRequest;
import com.squareup.protos.franklin.app.VerifyIdentityRequest;
import com.squareup.protos.franklin.common.CheckDepositRenderData;
import com.squareup.protos.franklin.common.DeviceLocationHeuristics;
import com.squareup.protos.franklin.common.InstrumentLinkingOption;
import com.squareup.protos.franklin.common.KeyedCard;
import com.squareup.protos.franklin.common.LinkingAction;
import com.squareup.protos.franklin.common.PaperCashDepositRenderData;
import com.squareup.protos.franklin.common.RecurringTransferRenderData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
import com.squareup.protos.franklin.experiments.bouncer.CardScanResult;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.savings.VersionedSavingsFolders;

/* loaded from: classes8.dex */
public final class DocumentEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DocumentEntity> CREATOR;
    public final String category;
    public final String client_route;
    public final LocalizableString localizable_title;
    public final String owner_token;
    public final String title;
    public final String token;
    public final String url;
    public final VersionData version_data;

    static {
        DocumentEntity$Companion$ADAPTER$1 documentEntity$Companion$ADAPTER$1 = new DocumentEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DocumentEntity.class), "type.googleapis.com/squareup.document.DocumentEntity", Syntax.PROTO_2, null, "squareup/document/document.proto");
        ADAPTER = documentEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(documentEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentEntity(String str, String str2, String str3, String str4, String str5, VersionData versionData, String str6, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.category = str;
        this.token = str2;
        this.title = str3;
        this.client_route = str4;
        this.url = str5;
        this.version_data = versionData;
        this.owner_token = str6;
        this.localizable_title = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DocumentEntity)) {
            return false;
        }
        DocumentEntity documentEntity = (DocumentEntity) obj;
        return Intrinsics.areEqual(unknownFields(), documentEntity.unknownFields()) && Intrinsics.areEqual(this.category, documentEntity.category) && Intrinsics.areEqual(this.token, documentEntity.token) && Intrinsics.areEqual(this.title, documentEntity.title) && Intrinsics.areEqual(this.client_route, documentEntity.client_route) && Intrinsics.areEqual(this.url, documentEntity.url) && Intrinsics.areEqual(this.version_data, documentEntity.version_data) && Intrinsics.areEqual(this.owner_token, documentEntity.owner_token) && Intrinsics.areEqual(this.localizable_title, documentEntity.localizable_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.category;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.client_route;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.url;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        VersionData versionData = this.version_data;
        int hashCode7 = (hashCode6 + (versionData != null ? versionData.hashCode() : 0)) * 37;
        String str6 = this.owner_token;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_title;
        int hashCode9 = hashCode8 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.category = this.category;
        builder.token = this.token;
        builder.title = this.title;
        builder.client_route = this.client_route;
        builder.url = this.url;
        builder.version_data = this.version_data;
        builder.owner_token = this.owner_token;
        builder.localizable_title = this.localizable_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.category;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "category=", arrayList);
        }
        String str2 = this.token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token=", arrayList);
        }
        String str3 = this.title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
        }
        String str4 = this.client_route;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "client_route=", arrayList);
        }
        String str5 = this.url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "url=", arrayList);
        }
        VersionData versionData = this.version_data;
        if (versionData != null) {
            arrayList.add("version_data=" + versionData);
        }
        String str6 = this.owner_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "owner_token=", arrayList);
        }
        LocalizableString localizableString = this.localizable_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DocumentEntity{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object category;
        public Object client_route;
        public Object localizable_title;
        public Object owner_token;
        public Object title;
        public Serializable token;
        public Object url;
        public Object version_data;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 23:
                    this.localizable_title = EmptyList.INSTANCE;
                    break;
                default:
                    this.owner_token = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new DocumentEntity((String) this.category, (String) this.token, (String) this.title, (String) this.client_route, (String) this.url, (VersionData) this.version_data, (String) this.owner_token, (LocalizableString) this.localizable_title, buildUnknownFields());
                case 1:
                    String str = (String) this.category;
                    if (str != null) {
                        return new GetMapLocationsResponse.MapLocation(str, (String) this.token, (LocalLocationSummary) this.client_route, (String) this.title, (LocalMiniCard) this.url, (LocalColor) this.owner_token, (LocalColor) this.version_data, (LocalEstimatedCompletionDuration) this.localizable_title, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "brand_token");
                    throw null;
                case 2:
                    return new LocalMenuItemComboSlot((String) this.category, (String) this.token, (String) this.title, (List) this.url, (List) this.owner_token, (String) this.client_route, (Integer) this.version_data, (List) this.localizable_title, buildUnknownFields());
                case 3:
                    return new LocalMenuItemModifierList.NestedModifierList((String) this.category, (String) this.token, (Integer) this.title, (Integer) this.client_route, (Boolean) this.url, (List) this.owner_token, (Integer) this.version_data, (Boolean) this.localizable_title, buildUnknownFields());
                case 4:
                    return new LocalMenuItemVariation((String) this.category, (String) this.token, (LocalMoney) this.title, (LocalMenuItemDeal) this.client_route, (LocalMenuAvailability) this.url, (List) this.owner_token, (List) this.version_data, (LocalMenuItemVariation.ReservationVariationData) this.localizable_title, buildUnknownFields());
                case 5:
                    return new POSLocalCashRedemption((String) this.category, (String) this.token, (String) this.title, (LocalMiniCard) this.owner_token, (LocalColor) this.version_data, (String) this.client_route, (List) this.localizable_title, (String) this.url, buildUnknownFields());
                case 6:
                    return new HoldingsDetails.Holding((String) this.category, (String) this.token, (String) this.title, (InvestmentEntityVisibility) this.owner_token, (InvestmentEntityTradability) this.version_data, (String) this.client_route, (String) this.url, (Long) this.localizable_title, buildUnknownFields());
                case 7:
                    return new GetInvestmentEntityHistoricalDataResponse((Long) this.category, (Long) this.token, (CurrencyCode) this.title, (List) this.client_route, (Long) this.url, (Long) this.owner_token, (Long) this.version_data, (List) this.localizable_title, buildUnknownFields());
                case 8:
                    return new CategoryPreferenceUpdate((String) this.category, (NotificationCategory) this.token, (ClientChannelState) this.title, (ClientChannelState) this.client_route, (ClientChannelState) this.url, (Long) this.owner_token, (NotificationCategoryExtraConfig) this.version_data, (Boolean) this.localizable_title, buildUnknownFields());
                case 9:
                    return new UiCategoryNotificationPreference((NotificationCategory) this.token, (String) this.category, (ClientChannelState) this.title, (ClientChannelState) this.client_route, (ClientChannelState) this.url, (List) this.owner_token, (Long) this.version_data, (NotificationCategoryExtraConfig) this.localizable_title, buildUnknownFields());
                case 10:
                    return new CashAppPayRenderData.Refund((String) this.category, (String) this.token, (Money) this.client_route, (Money) this.url, (Long) this.owner_token, (Long) this.version_data, (Long) this.localizable_title, (String) this.title, buildUnknownFields());
                case 11:
                    return new GetSavingsOverviewResponse((ResponseContext) this.category, (SavingsCustomer) this.token, (SavingsBalance) this.title, (SavingsGoal) this.client_route, (InterestRate) this.url, (VersionedSavingsFolders) this.owner_token, (AutomationSection) this.version_data, (SavingsConfig) this.localizable_title, buildUnknownFields());
                case 12:
                    return new GetDirectDepositFormResponse((String) this.category, (String) this.token, (String) this.title, (String) this.client_route, (Boolean) this.owner_token, (String) this.url, (Long) this.version_data, (Money) this.localizable_title, buildUnknownFields());
                case 13:
                    return new CardModule.StatusElement((CardModule.InformationSource) this.category, (CardModule.StatusElement.Icon) this.token, (CardModule.StatusElement.Accessory) this.title, (LocalizedString) this.client_route, (LocalizedString) this.url, (CardModule.Button) this.owner_token, (LocalizedString) this.version_data, (Boolean) this.localizable_title, buildUnknownFields());
                case 14:
                    return new ClusterInfoItem((LocalizedString) this.category, (TapAction) this.token, (Button) this.title, (ClusterInfoItem.ClusterColorTheme) this.client_route, (AnalyticsEvent) this.url, (FormattedDetail) this.owner_token, (StyledText) this.version_data, (Color) this.localizable_title, buildUnknownFields());
                case 15:
                    return new OfferTimelineSheet((OfferType) this.title, (String) this.category, (Image) this.client_route, (List) this.url, (Button) this.owner_token, (Button) this.version_data, (LocalizedString) this.localizable_title, (String) this.token, buildUnknownFields());
                case 16:
                    return new RowSection.FilterRow((AnalyticsEvent) this.category, (RowSection.FilterRow.FilterTapAction) this.token, (UiAvatar) this.title, (LocalizedString) this.client_route, (LocalizedString) this.url, (StyledText) this.owner_token, (StyledText) this.version_data, (Avatar) this.localizable_title, buildUnknownFields());
                case 17:
                    return new UpsellCardSection((LocalizedString) this.category, (LocalizedString) this.token, (Button) this.title, (zzlf) this.client_route, (zzlg) this.url, (TapAction) this.owner_token, (AnalyticsEvent) this.version_data, (Boolean) this.localizable_title, buildUnknownFields());
                case 18:
                    return new UpsellSheet((LongTaskEvent.Companion) this.category, (LocalizedString) this.token, (LocalizedString) this.title, (AnalyticsEvent) this.client_route, (AnalyticsEvent) this.url, (LocalizedString) this.owner_token, (Button) this.version_data, (Button) this.localizable_title, buildUnknownFields());
                case 19:
                    return new SupportChatStatusResponse((Boolean) this.token, (Long) this.title, (Long) this.client_route, (Long) this.url, (Long) this.owner_token, (List) this.version_data, (String) this.category, (zzlo) this.localizable_title, buildUnknownFields());
                case 20:
                    return new CashAppTag.Tag((String) this.category, (String) this.token, (Boolean) this.title, (Boolean) this.client_route, (CashAppTag.TagLifecycleState) this.url, (PhysicalTagOrderState) this.owner_token, (Boolean) this.version_data, (Image) this.localizable_title, buildUnknownFields());
                case 21:
                    return new VerticalStackedBarGraph.Bar((LocalizedString) this.category, (LocalizedString) this.token, (LocalizedString) this.title, (List) this.client_route, (VerticalStackedBarGraph.Bar.CategoryTextValue) this.url, (LocalizedString) this.owner_token, (LocalizedString) this.version_data, (LocalizedString) this.localizable_title, buildUnknownFields());
                case 22:
                    return new RegisterEmailRequest((RequestContext) this.client_route, (String) this.category, (RegisterEmailRequest.Scenario) this.url, (List) this.owner_token, (Boolean) this.version_data, (String) this.token, (DeviceLocationHeuristics) this.localizable_title, (String) this.title, buildUnknownFields());
                case 23:
                    return new VerifyIdentityRequest((RequestContext) this.owner_token, (String) this.category, (String) this.token, (String) this.title, (String) this.client_route, (GlobalAddress) this.version_data, (List) this.localizable_title, (String) this.url, buildUnknownFields());
                case 24:
                    return new CheckDepositRenderData((String) this.category, (String) this.token, (CheckDepositRenderData.Status) this.title, (DeclineReason) this.client_route, (CheckDepositRenderData.ReviewResult) this.url, (Long) this.owner_token, (Money) this.version_data, (Long) this.localizable_title, buildUnknownFields());
                case 25:
                    return new InstrumentLinkingOption((List) this.title, (String) this.category, (LocalizableString) this.localizable_title, (String) this.token, (LocalizableString) this.client_route, (Long) this.url, (Boolean) this.owner_token, (LinkingAction) this.version_data, buildUnknownFields());
                case 26:
                    return new KeyedCard((String) this.category, (String) this.token, (String) this.title, (String) this.client_route, (String) this.url, (InstrumentType) this.version_data, (String) this.owner_token, (CardScanResult) this.localizable_title, buildUnknownFields());
                case 27:
                    return new PaperCashDepositRenderData((String) this.category, (String) this.token, (String) this.title, (String) this.client_route, (String) this.url, (String) this.owner_token, (String) this.version_data, (LocalizableString) this.localizable_title, buildUnknownFields());
                case 28:
                    return new RecurringTransferRenderData((String) this.category, (Long) this.url, (Long) this.owner_token, (String) this.token, (String) this.title, (String) this.client_route, (SavingsTransferRenderData.SavingsFolderMetadata) this.version_data, (Integer) this.localizable_title, buildUnknownFields());
                default:
                    return new SavingsTransferRenderData((StoredValueBalance.Type) this.title, (StoredValueBalance.Type) this.client_route, (Boolean) this.url, (String) this.category, (String) this.token, (Boolean) this.owner_token, (SavingsTransferRenderData.SavingsFolderMetadata) this.version_data, (SavingsTransferRenderData.SavingsFolderMetadata) this.localizable_title, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
