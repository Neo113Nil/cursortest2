package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzhx;
import com.google.android.gms.internal.mlkit_vision_common.zzjw;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentScope;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.kgoose.client.ClientKickoffParams;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalMenuCategoryCollection;
import com.squareup.protos.cash.local.client.v1.LocalStoredInstrument;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.protos.cash.local.client.v1.RequiredInput;
import com.squareup.protos.cash.lynx.api.v1_0.CompleteStripeLinkRequest;
import com.squareup.protos.cash.marketdata.model.InvestmentAnalystOpinions;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HomeScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message$VisualAsset$Avatar;
import com.squareup.protos.cash.messagingplatformcommon.app.MoneybotSuggestionView;
import com.squareup.protos.cash.messagingplatformcommon.app.StatusResultMessage;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.DismissInAppMessageRequest;
import com.squareup.protos.cash.nearby.api.v1.ConnectionData;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.p2p.profile_directory.ui.TextDecoration;
import com.squareup.protos.cash.p2p.profile_directory.ui.TextStyle;
import com.squareup.protos.cash.pay.CashAppPayExternalIncentiveRenderData;
import com.squareup.protos.cash.pay.CashAppPayInstrumentRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.paymenttemplate.v1.CreatePaymentTemplateResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.invest.ui.Section;
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

/* loaded from: classes7.dex */
public final class BrandBanner extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BrandBanner> CREATOR;
    public final BrandBanner$Action$ApplySingleOffer action;
    public final LocalImage icon;
    public final LocalColor icon_background_color;
    public final BrandBanner$Subtitle$SubtitleText subtitle;
    public final BrandBanner$Title$TitleText title;

    static {
        BrandBanner$Companion$ADAPTER$1 brandBanner$Companion$ADAPTER$1 = new BrandBanner$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrandBanner.class), "type.googleapis.com/squareup.cash.local.client.v1.BrandBanner", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_banner.proto");
        ADAPTER = brandBanner$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(brandBanner$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandBanner(LocalImage localImage, BrandBanner$Title$TitleText brandBanner$Title$TitleText, BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText, BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer, LocalColor localColor, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = localImage;
        this.title = brandBanner$Title$TitleText;
        this.subtitle = brandBanner$Subtitle$SubtitleText;
        this.action = brandBanner$Action$ApplySingleOffer;
        this.icon_background_color = localColor;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BrandBanner)) {
            return false;
        }
        BrandBanner brandBanner = (BrandBanner) obj;
        return Intrinsics.areEqual(unknownFields(), brandBanner.unknownFields()) && Intrinsics.areEqual(this.icon, brandBanner.icon) && Intrinsics.areEqual(this.title, brandBanner.title) && Intrinsics.areEqual(this.subtitle, brandBanner.subtitle) && Intrinsics.areEqual(this.action, brandBanner.action) && Intrinsics.areEqual(this.icon_background_color, brandBanner.icon_background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalImage localImage = this.icon;
        int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
        BrandBanner$Title$TitleText brandBanner$Title$TitleText = this.title;
        int hashCode3 = (hashCode2 + (brandBanner$Title$TitleText != null ? brandBanner$Title$TitleText.value.hashCode() : 0)) * 37;
        BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText = this.subtitle;
        int hashCode4 = (hashCode3 + (brandBanner$Subtitle$SubtitleText != null ? brandBanner$Subtitle$SubtitleText.value.hashCode() : 0)) * 37;
        BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer = this.action;
        int hashCode5 = (hashCode4 + (brandBanner$Action$ApplySingleOffer != null ? brandBanner$Action$ApplySingleOffer.hashCode() : 0)) * 37;
        LocalColor localColor = this.icon_background_color;
        int hashCode6 = hashCode5 + (localColor != null ? localColor.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.icon = this.icon;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.action = this.action;
        builder.icon_background_color = this.icon_background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalImage localImage = this.icon;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", localImage, arrayList);
        }
        BrandBanner$Title$TitleText brandBanner$Title$TitleText = this.title;
        if (brandBanner$Title$TitleText != null) {
            arrayList.add("title=" + brandBanner$Title$TitleText);
        }
        BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText = this.subtitle;
        if (brandBanner$Subtitle$SubtitleText != null) {
            arrayList.add("subtitle=" + brandBanner$Subtitle$SubtitleText);
        }
        BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer = this.action;
        if (brandBanner$Action$ApplySingleOffer != null) {
            arrayList.add("action=" + brandBanner$Action$ApplySingleOffer);
        }
        LocalColor localColor = this.icon_background_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon_background_color=", localColor, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrandBanner{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object action;
        public Serializable icon;
        public Object icon_background_color;
        public Object subtitle;
        public Object title;

        public Builder() {
            this.$r8$classId = 4;
            this.icon_background_color = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BrandBanner((LocalImage) this.icon, (BrandBanner$Title$TitleText) this.title, (BrandBanner$Subtitle$SubtitleText) this.subtitle, (BrandBanner$Action$ApplySingleOffer) this.action, (LocalColor) this.icon_background_color, buildUnknownFields());
                case 1:
                    return new LocalPOSCheckIn.Location((String) this.icon, (String) this.title, (LocalPOSCheckIn.MiniCard) this.subtitle, (LocalPOSCheckIn.Color) this.action, (String) this.icon_background_color, buildUnknownFields());
                case 2:
                    return new GetBrandProfileResponse((Long) this.icon, (zzhx) this.title, (Boolean) this.subtitle, (LocalBuyer) this.action, (LocalUserIntent) this.icon_background_color, buildUnknownFields());
                case 3:
                    return new GetEditorialResponse.EditorialContent.Text((String) this.icon, (GetEditorialResponse.EditorialContent.Text.Alignment) this.title, (GetEditorialResponse.EditorialContent.Text.Font) this.subtitle, (LocalColor) this.icon_background_color, (Long) this.action, buildUnknownFields());
                case 4:
                    return new GetFulfillmentSchedulingQuoteRequest((String) this.icon, (String) this.title, (String) this.subtitle, (StorageEvent) this.action, (List) this.icon_background_color, buildUnknownFields());
                case 5:
                    return new LocalCashConfiguration((LocalMoney) this.icon, (String) this.title, (Long) this.subtitle, (Boolean) this.action, (LocalCashConfiguration.ApplicationMethod) this.icon_background_color, buildUnknownFields());
                case 6:
                    return new LocalCashInformationalContent((LocalNumberedList) this.title, (String) this.subtitle, (String) this.action, (LocalImage) this.icon, (LocalButton) this.icon_background_color, buildUnknownFields());
                case 7:
                    return new LocalCashMarketingContent((LocalCashMarketingContent.Template) this.icon, (LocalCashMarketingContent.Template) this.title, (LocalCashMarketingContent.Template) this.subtitle, (LocalCashMarketingContent.Template) this.action, (LocalCashMarketingContent.Template) this.icon_background_color, buildUnknownFields());
                case 8:
                    return new LocalCashMarketingContent.Template((LocalMoney) this.icon, (String) this.title, (String) this.subtitle, (String) this.action, (String) this.icon_background_color, buildUnknownFields());
                case 9:
                    return new LocalMenuCategoryCollection((String) this.icon, (String) this.title, (List) this.subtitle, (LocalMenuHours) this.action, (LocalMenuCategoryCollection.Type) this.icon_background_color, buildUnknownFields());
                case 10:
                    return new LocalStoredInstrument((String) this.icon, (LocalStoredInstrument.Type) this.title, (String) this.subtitle, (String) this.action, (String) this.icon_background_color, buildUnknownFields());
                case 11:
                    return new POSBrandOnboarding.BrandCard((String) this.title, (LocalImage) this.icon, (LocalColor) this.icon_background_color, (LocalColor) this.subtitle, (LocalColor) this.action, buildUnknownFields());
                case 12:
                    return new POSBrandOnboarding.LocalCashDetails((Long) this.title, (LocalImage) this.icon, (String) this.subtitle, (ShortlinkAction) this.action, (String) this.icon_background_color, buildUnknownFields());
                case 13:
                    return new RequiredInput((String) this.icon, (RequiredInput.InputType) this.title, (RequiredInput.State) this.subtitle, (InputSpecification) this.action, (LocalErrorResponse.Error) this.icon_background_color, buildUnknownFields());
                case 14:
                    return new ShippingRate((String) this.icon, (String) this.title, (LocalMoney) this.subtitle, (String) this.action, (ShippingCarrier) this.icon_background_color, buildUnknownFields());
                case 15:
                    return new CompleteStripeLinkRequest((String) this.icon, (String) this.title, (RequestContext) this.subtitle, (String) this.action, (InstrumentScope) this.icon_background_color, buildUnknownFields());
                case 16:
                    return new InvestmentAnalystOpinions((String) this.icon, (Integer) this.title, (List) this.subtitle, (Integer) this.action, (Section.Row.MoreInfo) this.icon_background_color, buildUnknownFields());
                case 17:
                    return new InvestmentEntityStats((Long) this.icon, (List) this.title, (String) this.subtitle, (InvestmentEntityStats.InvestmentEntityStatsDetails) this.action, (Long) this.icon_background_color, buildUnknownFields());
                case 18:
                    return new GetInvestingMetricsResponse((Long) this.icon, (InvestmentEntityStats) this.title, (InvestmentFinancials) this.subtitle, (InvestmentEarnings) this.action, (InvestmentAnalystOpinions) this.icon_background_color, buildUnknownFields());
                case 19:
                    return new CardMessage((CardMessage.Placement) this.icon, (ActionEvent.Os.Companion) this.title, (String) this.subtitle, (String) this.action, (AppMessageAction) this.icon_background_color, buildUnknownFields());
                case 20:
                    return new HomeScreenMessage((String) this.icon, (String) this.title, (String) this.subtitle, (AppMessageAction) this.action, (AppMessageAction) this.icon_background_color, buildUnknownFields());
                case 21:
                    return new InlineV2Message((InlineV2Message.Placement) this.icon, (InlineV2Message$VisualAsset$Avatar) this.title, (String) this.subtitle, (String) this.action, (String) this.icon_background_color, buildUnknownFields());
                case 22:
                    return new MoneybotSuggestionView((UiAvatar) this.icon, (String) this.title, (ClientKickoffParams) this.subtitle, (String) this.action, (MoneybotSuggestionView.Category) this.icon_background_color, buildUnknownFields());
                case 23:
                    return new StatusResultMessage((StatusResultMessage.Placement) this.icon, (zzjw) this.title, (String) this.subtitle, (String) this.action, (AppMessageAction) this.icon_background_color, buildUnknownFields());
                case 24:
                    return new DismissInAppMessageRequest((String) this.icon, (Long) this.title, (String) this.subtitle, (String) this.action, (Long) this.icon_background_color, buildUnknownFields());
                case 25:
                    return new Text((String) this.icon, (TextStyle) this.title, (TextDecoration) this.subtitle, (Color) this.action, (Image) this.icon_background_color, buildUnknownFields());
                case 26:
                    return new CashAppPayExternalIncentiveRenderData((String) this.icon, (String) this.title, (Money) this.subtitle, (Integer) this.action, (CashAppPayExternalIncentiveRenderData.Scope) this.icon_background_color, buildUnknownFields());
                case 27:
                    return new CashAppPayInstrumentRenderData((String) this.icon, (String) this.title, (CashInstrumentType) this.subtitle, (InstrumentType) this.action, (String) this.icon_background_color, buildUnknownFields());
                case 28:
                    return new CashAppPayOrderRenderData.OrderAggregations((CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations) this.icon, (String) this.title, (String) this.subtitle, (String) this.action, (String) this.icon_background_color, buildUnknownFields());
                default:
                    return new CreatePaymentTemplateResponse((String) this.icon, (ConnectionData) this.title, (Long) this.subtitle, (String) this.action, (String) this.icon_background_color, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
