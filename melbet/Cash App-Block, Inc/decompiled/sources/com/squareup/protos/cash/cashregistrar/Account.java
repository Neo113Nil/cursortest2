package com.squareup.protos.cash.cashregistrar;

import android.os.Parcelable;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import app.cash.redwood.widget.ComposeHelpersKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreatePaymentResponse;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.PaymentActivity;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ReceiptData;
import com.squareup.protos.cash.cashface.api.AnalyticsData;
import com.squareup.protos.cash.cashface.api.GetGenericElementTreeResponse;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashfavorites.api.v1.AddFavoriteRequest;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.AvailableAsset;
import com.squareup.protos.cash.cashliteflow.api.v1.AvailableChain;
import com.squareup.protos.cash.cashliteflow.api.v1.AvailableNetwork;
import com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionApplePayResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionStatus;
import com.squareup.protos.cash.cashliteflow.api.v1.WalletAddress;
import com.squareup.protos.cash.cashliteflow.api.v1.WalletAddressAsset;
import com.squareup.protos.cash.cashliteflow.api.v1.WalletAddressChain;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.SignedEnvelope;
import com.squareup.protos.cash.cashstorefronts.api.GetBusinessProfileRequest;
import com.squareup.protos.cash.cashstorefronts.api.ImageAsset;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.AvatarSection;
import com.squareup.protos.cash.cashsuggest.api.Banner;
import com.squareup.protos.cash.cashsuggest.api.CardSection;
import com.squareup.protos.cash.cashsuggest.api.CreditDetailSheet;
import com.squareup.protos.cash.cashsuggest.api.CreditRingSection;
import com.squareup.protos.cash.cashsuggest.api.HeroUpsellSection;
import com.squareup.protos.cash.cashsuggest.api.ItemMetadata;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.SheetType;
import com.squareup.protos.cash.cashvoice.verification.app.v1.PhoneVerificationAttemptState;
import com.squareup.protos.cash.cashvoice.verification.app.v1.RejectPhoneVerificationAttemptResponse;
import com.squareup.protos.cash.commerce.CommerceRefund;
import com.squareup.protos.cash.compass.api.WifiContext;
import com.squareup.protos.cash.composer.app.VideoAsset;
import com.squareup.protos.cash.composer.app.VideoAsset$FormFactor$VideoFill;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.protos.cash.customersearch.api.ShopSearchProductsRequest;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Account extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Account> CREATOR;
    public final String account_token;
    public final AccountType account_type;
    public final String customer_token;
    public final String display_name;
    public final Boolean is_sponsored_account;

    static {
        Account$Companion$ADAPTER$1 account$Companion$ADAPTER$1 = new Account$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Account.class), "type.googleapis.com/squareup.cashregistrar.Account", Syntax.PROTO_2, null, "squareup/accountstatement/account_statement.proto");
        ADAPTER = account$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(account$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Account(String str, AccountType accountType, String str2, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.account_type = accountType;
        this.account_token = str2;
        this.is_sponsored_account = bool;
        this.display_name = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        return Intrinsics.areEqual(unknownFields(), account.unknownFields()) && Intrinsics.areEqual(this.customer_token, account.customer_token) && this.account_type == account.account_type && Intrinsics.areEqual(this.account_token, account.account_token) && Intrinsics.areEqual(this.is_sponsored_account, account.is_sponsored_account) && Intrinsics.areEqual(this.display_name, account.display_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        AccountType accountType = this.account_type;
        int hashCode3 = (hashCode2 + (accountType != null ? accountType.hashCode() : 0)) * 37;
        String str2 = this.account_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.is_sponsored_account;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.display_name;
        int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.customer_token = this.customer_token;
        builder.account_type = this.account_type;
        builder.account_token = this.account_token;
        builder.is_sponsored_account = this.is_sponsored_account;
        builder.display_name = this.display_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        AccountType accountType = this.account_type;
        if (accountType != null) {
            arrayList.add("account_type=" + accountType);
        }
        String str2 = this.account_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_token=", arrayList);
        }
        Boolean bool = this.is_sponsored_account;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_sponsored_account=", bool, arrayList);
        }
        String str3 = this.display_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Account{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object account_token;
        public Object account_type;
        public Object customer_token;
        public Object display_name;
        public Object is_sponsored_account;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 29:
                    this.account_type = EmptyList.INSTANCE;
                    break;
                default:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.customer_token = emptyList;
                    this.account_token = emptyList;
                    this.display_name = emptyList;
                    this.account_type = emptyList;
                    this.is_sponsored_account = emptyList;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Account((String) this.customer_token, (AccountType) this.account_type, (String) this.account_token, (Boolean) this.is_sponsored_account, (String) this.display_name, buildUnknownFields());
                case 1:
                    return new CreatePaymentResponse((CreatePaymentResponse.Result) this.display_name, (String) this.customer_token, (String) this.account_token, (LocalizedString) this.account_type, (LocalizedString) this.is_sponsored_account, buildUnknownFields());
                case 2:
                    return new ReceiptData((String) this.customer_token, (String) this.account_token, (String) this.display_name, (PaymentActivity) this.account_type, (UiAvatar) this.is_sponsored_account, buildUnknownFields());
                case 3:
                    return new GetGenericElementTreeResponse((List) this.account_token, (AnalyticsData) this.display_name, (AnalyticsEvent) this.account_type, (AnalyticsEvent) this.is_sponsored_account, (String) this.customer_token, buildUnknownFields());
                case 4:
                    return new ContextWrapper((String) this.customer_token, (String) this.account_token, (ByteString) this.account_type, (String) this.display_name, (ContextWrapper.Origin) this.is_sponsored_account, buildUnknownFields());
                case 5:
                    return new GenericProfileElement.AchievementsWidgetElement((String) this.customer_token, (String) this.account_token, (String) this.display_name, (List) this.account_type, (Long) this.is_sponsored_account, buildUnknownFields());
                case 6:
                    return new GenericProfileElement.CardElement((GenericProfileElement) this.customer_token, (GenericProfileElement) this.account_token, (GenericProfileElement) this.display_name, (GenericProfileElement) this.account_type, (GenericProfileElement) this.is_sponsored_account, buildUnknownFields());
                case 7:
                    return new AddFavoriteRequest((String) this.customer_token, (RequestContext) this.display_name, (Instant) this.account_type, (FavoriteOrigin) this.is_sponsored_account, (String) this.account_token, buildUnknownFields());
                case 8:
                    return new GetCustomerLimitsResponse.LimitsSection((String) this.customer_token, (List) this.account_type, (String) this.account_token, (GetCustomerLimitsResponse.LimitsSection.SectionType) this.is_sponsored_account, (String) this.display_name, buildUnknownFields());
                case 9:
                    return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar((String) this.customer_token, (String) this.account_token, (Double) this.account_type, (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type) this.is_sponsored_account, (String) this.display_name, buildUnknownFields());
                case 10:
                    return new AvailableNetwork((AvailableChain) this.display_name, (String) this.customer_token, (String) this.account_token, (Money) this.account_type, (AvailableAsset) this.is_sponsored_account, buildUnknownFields());
                case 11:
                    return new PushProvisionApplePayResponse((ResponseContext) this.account_type, (String) this.customer_token, (String) this.account_token, (String) this.display_name, (PushProvisionStatus) this.is_sponsored_account, buildUnknownFields());
                case 12:
                    return new WalletAddress((String) this.customer_token, (String) this.account_token, (String) this.display_name, (WalletAddressChain) this.account_type, (WalletAddressAsset) this.is_sponsored_account, buildUnknownFields());
                case 13:
                    return new SignedEnvelope((ByteString) this.account_type, (String) this.customer_token, (String) this.account_token, (String) this.display_name, (String) this.is_sponsored_account, buildUnknownFields());
                case 14:
                    return new GetBusinessProfileRequest((List) this.customer_token, (List) this.account_token, (List) this.display_name, (List) this.account_type, (List) this.is_sponsored_account, buildUnknownFields());
                case 15:
                    return new ImageAsset((Image) this.account_token, (String) this.customer_token, (ImageAsset.TextColor) this.display_name, (ImageAsset.DimmerMode) this.account_type, (ImageAsset.ImageType) this.is_sponsored_account, buildUnknownFields());
                case 16:
                    return new AfterpayAppletEntrypoint((LocalizedString) this.customer_token, (TableQrCodeScannerViewKt) this.account_token, (com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent) this.display_name, (com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent) this.account_type, (AfterpayAppletEntrypoint.TileConfiguration) this.is_sponsored_account, buildUnknownFields());
                case 17:
                    return new AppletCardSection.StandardHeader((Money) this.customer_token, (LocalizedString) this.account_token, (TappableIcon) this.display_name, (LocalizedString) this.account_type, (AppletCardSection.StandardHeader.DisplayStyle) this.is_sponsored_account, buildUnknownFields());
                case 18:
                    return new AvatarSection.AvatarItem((ItemMetadata) this.account_token, (Avatar) this.display_name, (Text) this.account_type, (String) this.customer_token, (Text) this.is_sponsored_account, buildUnknownFields());
                case 19:
                    return new Banner((UiAvatar) this.customer_token, (LocalizedString) this.account_token, (LocalizedString) this.display_name, (LocalizedString) this.account_type, (TapAction) this.is_sponsored_account, buildUnknownFields());
                case 20:
                    return new CardSection.CardItem((ItemMetadata) this.account_token, (Image) this.display_name, (Text) this.account_type, (Text) this.is_sponsored_account, (String) this.customer_token, buildUnknownFields());
                case 21:
                    return new CreditRingSection((LocalizedString) this.customer_token, (Icon) this.account_token, (CreditDetailSheet) this.display_name, (Boolean) this.is_sponsored_account, (com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent) this.account_type, buildUnknownFields());
                case 22:
                    return new HeroUpsellSection((LocalizedString) this.customer_token, (LocalizedString) this.account_token, (Image) this.display_name, (LocalizedString) this.account_type, (HeroUpsellSection.SectionCTA) this.is_sponsored_account, buildUnknownFields());
                case 23:
                    return new OfferSheetKey((SheetType) this.customer_token, (OfferType) this.account_token, (ComposeHelpersKt) this.display_name, (OfferSheetKey.PresentingContext) this.account_type, (Boolean) this.is_sponsored_account, buildUnknownFields());
                case 24:
                    return new RejectPhoneVerificationAttemptResponse((PhoneVerificationAttemptState) this.account_type, (String) this.customer_token, (String) this.account_token, (ResponseContext) this.is_sponsored_account, (String) this.display_name, buildUnknownFields());
                case 25:
                    return new CommerceRefund((String) this.customer_token, (Money) this.account_token, (Money) this.display_name, (Long) this.account_type, (CommerceRefund.RefundState) this.is_sponsored_account, buildUnknownFields());
                case 26:
                    return new WifiContext((String) this.customer_token, (String) this.account_token, (Integer) this.display_name, (Integer) this.account_type, (List) this.is_sponsored_account, buildUnknownFields());
                case 27:
                    return new VideoAsset((String) this.customer_token, (String) this.account_token, (String) this.display_name, (Boolean) this.is_sponsored_account, (VideoAsset$FormFactor$VideoFill) this.account_type, buildUnknownFields());
                case 28:
                    return new ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow((Image) this.customer_token, (HighlightText) this.account_token, (HighlightText) this.display_name, (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata) this.account_type, (Integer) this.is_sponsored_account, buildUnknownFields());
                default:
                    return new ShopSearchProductsRequest((String) this.customer_token, (String) this.account_token, (String) this.display_name, (String) this.is_sponsored_account, (List) this.account_type, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
