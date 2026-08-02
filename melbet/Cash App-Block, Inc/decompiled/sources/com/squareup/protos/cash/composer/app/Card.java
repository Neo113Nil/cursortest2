package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import app.cash.local.views.internal.menus.LocalMenuCardKt;
import app.cash.redwood.yoga.internal.YGFloatOptional;
import app.cash.trifle.KeyHandle;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.GetWalletAddressesError;
import com.squareup.protos.cash.cashliteflow.api.v1.GetWalletAddressesResponse;
import com.squareup.protos.cash.cashliteflow.blockers.v1.ApplePayPushProvisioningFailureReason;
import com.squareup.protos.cash.cashliteflow.blockers.v1.CashLiteApplePayPushProvisioningInputs;
import com.squareup.protos.cash.cashliteflow.blockers.v1.CashLiteGooglePayPushProvisioningInputs;
import com.squareup.protos.cash.cashliteflow.blockers.v1.GooglePayPushProvisioningFailureReason;
import com.squareup.protos.cash.cashliteflow.blockers.v1.PushProvisioningStatus;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BitcoinReceiveArtifact;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.CreateBitcoinAddressResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.PrepareUserOpResponse;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleRequest;
import com.squareup.protos.cash.cashsourceoffunds.api.v1.DismissLimitsPageletMessageResponse;
import com.squareup.protos.cash.cashstorefronts.api.BusinessStatus;
import com.squareup.protos.cash.cashstorefronts.api.BusinessType;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
import com.squareup.protos.cash.cashstorefronts.api.Identifier;
import com.squareup.protos.cash.cashstorefronts.api.IdentifierType;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletActivityHistoryResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchRequest;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetPreload;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionPreload;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.protos.cash.cashsuggest.api.PaymentMgmtSection;
import com.squareup.protos.cash.cashsuggest.api.PlaceholderSection;
import com.squareup.protos.cash.cashsuggest.api.PrepurchaseCardToggleSection;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.cashsuggest.api.TotalBalanceSection;
import com.squareup.protos.cash.clientsync.service.SyncTopic;
import com.squareup.protos.cash.clientsync.service.TargetEntities;
import com.squareup.protos.cash.clientsync.service.TargetSpecifications;
import com.squareup.protos.cash.composer.app.TextElement;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.common.Money;
import com.squareup.protos.consentsys.service.CopyParameters;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Card extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Card> CREATOR;
    public final KeyHandle.Companion asset;
    public final String image_url;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object asset;
        public Object image_url;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Card((String) this.image_url, (KeyHandle.Companion) this.asset, buildUnknownFields());
                case 1:
                    return new GetWalletAddressesResponse((List) this.image_url, (GetWalletAddressesError) this.asset, buildUnknownFields());
                case 2:
                    return new CashLiteApplePayPushProvisioningInputs((PushProvisioningStatus) this.image_url, (ApplePayPushProvisioningFailureReason) this.asset, buildUnknownFields());
                case 3:
                    return new CashLiteGooglePayPushProvisioningInputs((PushProvisioningStatus) this.image_url, (GooglePayPushProvisioningFailureReason) this.asset, buildUnknownFields());
                case 4:
                    return new CreateBitcoinAddressResponse((String) this.image_url, (BitcoinReceiveArtifact) this.asset, buildUnknownFields());
                case 5:
                    return new PrepareUserOpResponse((ByteString) this.image_url, (List) this.asset, buildUnknownFields());
                case 6:
                    return new PersonalizedAdsToggleRequest((CopyParameters) this.image_url, (PersonalizedAdsToggleRequest.OptType) this.asset, buildUnknownFields());
                case 7:
                    return new DismissLimitsPageletMessageResponse((ResponseContext) this.image_url, (ResponseContext) this.asset, buildUnknownFields());
                case 8:
                    return new BusinessStatus((BusinessType) this.image_url, (Boolean) this.asset, buildUnknownFields());
                case 9:
                    return new ExternalAppLink((ExternalAppLink.AppLinkAndroid) this.image_url, (ExternalAppLink.AppLinkIOS) this.asset, buildUnknownFields());
                case 10:
                    return new Identifier((IdentifierType) this.asset, (String) this.image_url, buildUnknownFields());
                case 11:
                    return new AfterpayAppletActivityHistoryResponse((LocalizedString) this.image_url, (Footer) this.asset, buildUnknownFields());
                case 12:
                    return new AfterpayAppletHome.OnDisplayMessage((String) this.image_url, (LocalMenuCardKt) this.asset, buildUnknownFields());
                case 13:
                    return new AfterpayAppletSearchRequest.RecentlyViewed((Long) this.image_url, (EngagedItemToken) this.asset, buildUnknownFields());
                case 14:
                    return new AfterpayMerchantSheetResponse((AfterpayMerchantSheet) this.image_url, (Long) this.asset, buildUnknownFields());
                case 15:
                    return new AppletCardSection.ButtonTextFooter((LocalizedString) this.image_url, (Button) this.asset, buildUnknownFields());
                case 16:
                    return new HeroBalanceSection.SectionCTA((LocalizedString) this.image_url, (TapAction) this.asset, buildUnknownFields());
                case 17:
                    return new InAppBrowserMetadata.IABMetadataAffiliateBoost((String) this.image_url, (RewardAmount) this.asset, buildUnknownFields());
                case 18:
                    return new OfferSheetPreload((OfferSheetKey) this.image_url, (OffersSheetResponse) this.asset, buildUnknownFields());
                case 19:
                    return new OffersTabCollectionPreload((String) this.image_url, (OffersTabCollectionResponse) this.asset, buildUnknownFields());
                case 20:
                    return new OrderListSection((List) this.image_url, (YGFloatOptional) this.asset, buildUnknownFields());
                case 21:
                    return new PaymentMgmtSection.BalanceRow((LocalizedString) this.image_url, (Money) this.asset, buildUnknownFields());
                case 22:
                    return new PlaceholderSection((PlaceholderSection.Identifier) this.image_url, (Map) this.asset, buildUnknownFields());
                case 23:
                    return new PrepurchaseCardToggleSection((PrepurchaseCardToggleSection.ToggleState) this.image_url, (PrepurchaseCardToggleSection.ToggleState) this.asset, buildUnknownFields());
                case 24:
                    return new PrepurchaseCardToggleSection.ToggleState((AppletCardSection.StandardHeader) this.image_url, (LocalizedString) this.asset, buildUnknownFields());
                case 25:
                    return new RetroOrderSelectionResponse.TextLineItemSection((List) this.image_url, (RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle) this.asset, buildUnknownFields());
                case 26:
                    return new TotalBalanceSection((LocalizedString) this.image_url, (TappableIcon) this.asset, buildUnknownFields());
                case 27:
                    return new TargetEntities((TargetSpecifications) this.image_url, (List) this.asset, buildUnknownFields());
                case 28:
                    return new TargetSpecifications((SyncTopic) this.image_url, (List) this.asset, buildUnknownFields());
                default:
                    return new TextElement((String) this.image_url, (TextElement.TextStyle) this.asset, buildUnknownFields());
            }
        }
    }

    static {
        Card$Companion$ADAPTER$1 card$Companion$ADAPTER$1 = new Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Card.class), "type.googleapis.com/squareup.cash.composer.app.Card", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
        ADAPTER = card$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(card$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card(String str, KeyHandle.Companion companion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image_url = str;
        this.asset = companion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && Intrinsics.areEqual(this.image_url, card.image_url) && Intrinsics.areEqual(this.asset, card.asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.image_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        KeyHandle.Companion companion = this.asset;
        int hashCode3 = hashCode2 + (companion != null ? companion.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.image_url = this.image_url;
        builder.asset = this.asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.image_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
        }
        KeyHandle.Companion companion = this.asset;
        if (companion != null) {
            arrayList.add("asset=" + companion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Card(Card$Asset$Image card$Asset$Image) {
        this(null, card$Asset$Image, ByteString.EMPTY);
    }
}
