package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.RequestMetadata;
import com.squareup.protos.cash.discover.api.app.v1.message.GetDiscoverContentResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarSection;
import com.squareup.protos.cash.discover.api.app.v1.model.CardSection;
import com.squareup.protos.cash.discover.api.app.v1.model.TextCardSection;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.protos.cash.fiatly.api.v2.P2pCreatePaymentLinkFlowParameters;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.protos.cash.genericelements.ui.BaseElement;
import com.squareup.protos.cash.genericelements.ui.DetailedCardComponent;
import com.squareup.protos.cash.genericelements.ui.ImageElement;
import com.squareup.protos.cash.genericelements.ui.SectionHeaderComponent;
import com.squareup.protos.cash.genericelements.ui.SemanticBackgroundColor;
import com.squareup.protos.cash.genericelements.ui.SemanticIconColor;
import com.squareup.protos.cash.genericelements.ui.StyleAttributes;
import com.squareup.protos.cash.genericelements.ui.TwoColumnComponent;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Discount;
import com.squareup.protos.cash.grantly.api.InTransactionTopUpFlowEndResult;
import com.squareup.protos.cash.grantly.api.InTransactionTopUpInfo;
import com.squareup.protos.cash.grantly.api.PreAuthorizationData;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.cash.guardrails.api.v1.AccountSuspension;
import com.squareup.protos.cash.guardrails.api.v1.AdversityBanner;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationResponse;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.client.app.v1.GetLocalCashDetailResponse;
import com.squareup.protos.cash.local.client.app.v1.GetMarketScreenDataResponse;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenData;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenFeed;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenInformationalContent;
import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageContent;
import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import com.squareup.protos.cash.local.client.app.v1.card.MiniCard;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.Offer;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.paymenttemplate.v1.CreationChannel;
import com.squareup.protos.cash.paymenttemplate.v1.TransactionCategory;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
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
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Text extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Text> CREATOR;
    public final Image icon;
    public final String text;
    public final Color text_color;
    public final TextDecoration text_decoration;
    public final TextStyle text_style;

    static {
        Text$Companion$ADAPTER$1 text$Companion$ADAPTER$1 = new Text$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Text.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.Text", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/text.proto");
        ADAPTER = text$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(text$Companion$ADAPTER$1);
    }

    public /* synthetic */ Text(String str, TextStyle textStyle, TextDecoration textDecoration, Color color, Image image, int i) {
        this(str, (i & 2) != 0 ? null : textStyle, (i & 4) != 0 ? null : textDecoration, (i & 8) != 0 ? null : color, (i & 16) != 0 ? null : image, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text) && this.text_style == text.text_style && this.text_decoration == text.text_decoration && Intrinsics.areEqual(this.text_color, text.text_color) && Intrinsics.areEqual(this.icon, text.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        TextStyle textStyle = this.text_style;
        int hashCode3 = (hashCode2 + (textStyle != null ? textStyle.hashCode() : 0)) * 37;
        TextDecoration textDecoration = this.text_decoration;
        int hashCode4 = (hashCode3 + (textDecoration != null ? textDecoration.hashCode() : 0)) * 37;
        Color color = this.text_color;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode6 = hashCode5 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.text = this.text;
        builder.text_style = this.text_style;
        builder.text_decoration = this.text_decoration;
        builder.text_color = this.text_color;
        builder.icon = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.text != null) {
            arrayList.add("text=██");
        }
        TextStyle textStyle = this.text_style;
        if (textStyle != null) {
            arrayList.add("text_style=" + textStyle);
        }
        TextDecoration textDecoration = this.text_decoration;
        if (textDecoration != null) {
            arrayList.add("text_decoration=" + textDecoration);
        }
        Color color = this.text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object icon;
        public Serializable text;
        public Object text_color;
        public Serializable text_decoration;
        public Object text_style;

        public Builder() {
            this.$r8$classId = 5;
            this.icon = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Text((String) this.text, (TextStyle) this.text_style, (TextDecoration) this.text_decoration, (Color) this.text_color, (Image) this.icon, buildUnknownFields());
                case 1:
                    return new GetDiscoverContentResponse((List) this.text_style, (Integer) this.text_decoration, (String) this.text, (List) this.text_color, (List) this.icon, buildUnknownFields());
                case 2:
                    return new AvatarSection.AvatarItem((ItemMetadata) this.text_style, (Avatar) this.text_decoration, (Text) this.text_color, (String) this.text, (Text) this.icon, buildUnknownFields());
                case 3:
                    return new CardSection.CardItem((ItemMetadata) this.text_style, (Image) this.icon, (Text) this.text_decoration, (Text) this.text_color, (String) this.text, buildUnknownFields());
                case 4:
                    return new TextCardSection.TextCard((Text) this.text, (Text) this.text_style, (Text) this.text_decoration, (Avatar) this.text_color, (TapAction) this.icon, buildUnknownFields());
                case 5:
                    return new SearchRequest((String) this.text, (SearchRequest.Origin) this.text_style, (String) this.text_decoration, (String) this.text_color, (List) this.icon, buildUnknownFields());
                case 6:
                    return new P2pCreatePaymentLinkFlowParameters((Money) this.text_style, (String) this.text, (TransactionCategory) this.text_decoration, (CreationChannel) this.text_color, (String) this.icon, buildUnknownFields());
                case 7:
                    return new ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage((Image) this.icon, (Boolean) this.text, (ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon) this.text_style, (SemanticIconColor) this.text_decoration, (SemanticBackgroundColor) this.text_color, buildUnknownFields());
                case 8:
                    return new DetailedCardComponent((TwoColumnComponent) this.text, (BaseElement) this.text_style, (BaseElement) this.text_decoration, (Action) this.text_color, (StyleAttributes) this.icon, buildUnknownFields());
                case 9:
                    return new ImageElement((Image) this.icon, (Color) this.text_color, (Alignment) this.text_style, (ImageElement.Size) this.text_decoration, (String) this.text, buildUnknownFields());
                case 10:
                    return new SectionHeaderComponent((String) this.text, (String) this.text_style, (BaseElement) this.text_decoration, (Action) this.text_color, (String) this.icon, buildUnknownFields());
                case 11:
                    return new Action.OneTimePayment((Long) this.text_style, (CurrencyCode) this.text_decoration, (String) this.text, (String) this.text_color, (Action.OneTimePayment.CheckoutOptions) this.icon, buildUnknownFields());
                case 12:
                    return new InTransactionTopUpFlowEndResult((InTransactionTopUpInfo) this.text, (Money) this.text_style, (InTransactionTopUpFlowEndResult.InTransactionTopUpResolution) this.text_decoration, (Money) this.text_color, (Money) this.icon, buildUnknownFields());
                case 13:
                    String str = (String) this.text;
                    if (str != null) {
                        return new PreAuthorizationData(str, (List) this.text_style, (Discount) this.text_decoration, (List) this.text_color, (String) this.icon, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "pre_auth_token");
                    throw null;
                case 14:
                    return new UpdateShippingAddressRequest((RequestMetadata) this.text_style, (String) this.text, (String) this.text_decoration, (UpdateShippingAddressRequest.ShippingAddress) this.text_color, (RequestContext) this.icon, buildUnknownFields());
                case 15:
                    return new AccountSuspension((String) this.text, (AccountSuspension.SuspensionState) this.text_style, (String) this.text_decoration, (String) this.text_color, (LocalizableString) this.icon, buildUnknownFields());
                case 16:
                    return new AdversityBanner((String) this.text, (AdversityBanner.Style) this.text_style, (String) this.text_decoration, (String) this.text_color, (LocalizableString) this.icon, buildUnknownFields());
                case 17:
                    return new Order.FeatureMetadata.P2pReceiveMetadata((String) this.text, (String) this.text_style, (Integer) this.text_decoration, (Money) this.text_color, (String) this.icon, buildUnknownFields());
                case 18:
                    return new StartWebAuthnAuthenticationResponse((String) this.text, (String) this.text_style, (String) this.text_decoration, (ByteString) this.text_color, (List) this.icon, buildUnknownFields());
                case 19:
                    return new CashAppLocalOrderRenderData.OrderPaymentData((CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus) this.text_style, (CashInstrumentType) this.text_decoration, (String) this.text, (String) this.text_color, (String) this.icon, buildUnknownFields());
                case 20:
                    return new GetLocalCashDetailResponse((String) this.text, (LocalCashInformationalContent) this.text_style, (LocalCashActivity) this.text_decoration, (ResponseContext) this.text_color, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) this.icon, buildUnknownFields());
                case 21:
                    return new GetMarketScreenDataResponse((ResponseContext) this.text, (MarketScreenData) this.text_style, (Long) this.text_decoration, (MarketScreenFeed) this.text_color, (MarketTilesScreen) this.icon, buildUnknownFields());
                case 22:
                    return new MarketScreenData((MiniCard) this.text_style, (MarketScreenData.ExplainerSection) this.text_decoration, (Boolean) this.text_color, (String) this.text, (List) this.icon, buildUnknownFields());
                case 23:
                    return new MarketScreenData.ExplainerSection((String) this.text, (String) this.text_style, (String) this.text_decoration, (String) this.text_color, (Image) this.icon, buildUnknownFields());
                case 24:
                    return new MarketScreenData.MarketBrand((String) this.text, (String) this.text_style, (MiniCard) this.text_decoration, (String) this.text_color, (String) this.icon, buildUnknownFields());
                case 25:
                    return new MarketScreenInformationalContent((String) this.text, (String) this.text_style, (String) this.text_decoration, (String) this.text_color, (LocalImage) this.icon, buildUnknownFields());
                case 26:
                    return new MarketingMessageContent((String) this.text, (String) this.text_style, (String) this.text_decoration, (LocalImage) this.text_color, (Offer) this.icon, buildUnknownFields());
                case 27:
                    return new LocalAccount((Boolean) this.text, (List) this.text_style, (LocalAccount.EnrollmentStatus) this.text_decoration, (Boolean) this.text_color, (Boolean) this.icon, buildUnknownFields());
                case 28:
                    return new MiniCard((String) this.text, (Color) this.text_color, (Image) this.icon, (Image) this.text_style, (Color) this.text_decoration, buildUnknownFields());
                default:
                    return new LocalPOSCheckIn((LocalPOSCheckIn.State) this.text_style, (Long) this.text_decoration, (String) this.text, (String) this.text_color, (LocalPOSCheckIn.Location) this.icon, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Text(String str, TextStyle textStyle, TextDecoration textDecoration, Color color, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.text_style = textStyle;
        this.text_decoration = textDecoration;
        this.text_color = color;
        this.icon = image;
    }
}
