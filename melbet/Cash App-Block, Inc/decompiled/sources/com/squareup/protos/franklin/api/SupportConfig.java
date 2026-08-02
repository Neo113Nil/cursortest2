package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForBookletResponse;
import com.squareup.cash.cashcommercebrowser.api.v1.ShoppingCartProduct;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.protos.cash.cashapproxy.api.ChangeApPaymentMethodResponse;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportResponse;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.contacts.app.InstantMessageAddress;
import com.squareup.protos.cash.customersearch.api.ShopSearchBrandsRequest;
import com.squareup.protos.cash.customersearch.api.ShopSearchProductFiltersRequest;
import com.squareup.protos.cash.fiatly.api.v2.SenderProfileData;
import com.squareup.protos.cash.genericelements.ui.CopyCodeElement;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.janus.api.AccountParams;
import com.squareup.protos.cash.local.client.app.v1.card.BrandCardDetails;
import com.squareup.protos.cash.local.client.v1.GetEditorialRequest;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsRequest;
import com.squareup.protos.cash.local.client.v1.LegalConsent;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemOptionValue;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.peddle.app.UpdateAdvertiseIdRequest;
import com.squareup.protos.cash.postcard.app.CardDetails;
import com.squareup.protos.cash.sup.api.v1.GetMerchantConfigRequest;
import com.squareup.protos.cash.sup.plasma.SupCreateCardFlowParameters;
import com.squareup.protos.cash.supportal.app.MatchedNode;
import com.squareup.protos.cash.supportal.app.OpenChatRequest;
import com.squareup.protos.cash.treelot.app.TreehouseApp;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupportConfig> CREATOR;
    public final String contact_support_url;
    public final String privacy_policy_url;
    public final String terms_of_service_url;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String contact_support_url;
        public String privacy_policy_url;
        public String terms_of_service_url;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SupportConfig(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 1:
                    return new GetBankingBenefitsForBookletResponse.Benefit(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 2:
                    return new ShoppingCartProduct(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 3:
                    return new MobilePlanHome.Link(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 4:
                    return new ChangeApPaymentMethodResponse(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 5:
                    return new CreateBugReportResponse(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 6:
                    return new KybEligibilityWarning.Action(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 7:
                    return new InstantMessageAddress(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 8:
                    return new ShopSearchBrandsRequest(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 9:
                    return new ShopSearchProductFiltersRequest(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 10:
                    return new SenderProfileData(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 11:
                    return new CopyCodeElement(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 12:
                    return new Action.RecurringDeposits(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 13:
                    return new AccountParams.EntryDialog(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 14:
                    return new BrandCardDetails(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 15:
                    return new GetEditorialRequest(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 16:
                    String str = this.contact_support_url;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(str, "coupon_code");
                        throw null;
                    }
                    String str2 = this.privacy_policy_url;
                    if (str2 == null) {
                        TransactorKt.missingRequiredFields(str2, "brand_token");
                        throw null;
                    }
                    String str3 = this.terms_of_service_url;
                    if (str3 != null) {
                        return new GetMarketingCouponOfferDetailsRequest(str, str2, str3, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str3, "location_token");
                    throw null;
                case 17:
                    return new LegalConsent(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 18:
                    return new LocalMenuItemOptionValue(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 19:
                    return new GetRetailerLocationsResponse.LocationDetail(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 20:
                    return new GetPaperCashDepositBarcodeResponse.Failure(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 21:
                    return new CashAppPayMerchantRenderData.BrandColors(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 22:
                    return new CashAppPayMerchantRenderData.LogoUrls(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 23:
                    return new UpdateAdvertiseIdRequest(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 24:
                    return new CardDetails(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 25:
                    return new GetMerchantConfigRequest(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 26:
                    return new SupCreateCardFlowParameters(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 27:
                    return new MatchedNode(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                case 28:
                    return new OpenChatRequest(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
                default:
                    return new TreehouseApp(this.contact_support_url, this.privacy_policy_url, this.terms_of_service_url, buildUnknownFields());
            }
        }
    }

    static {
        SupportConfig$Companion$ADAPTER$1 supportConfig$Companion$ADAPTER$1 = new SupportConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportConfig.class), "type.googleapis.com/squareup.franklin.api.SupportConfig", Syntax.PROTO_2, null, "squareup/franklin/api/support_config.proto");
        ADAPTER = supportConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supportConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportConfig(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.contact_support_url = str;
        this.privacy_policy_url = str2;
        this.terms_of_service_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportConfig)) {
            return false;
        }
        SupportConfig supportConfig = (SupportConfig) obj;
        return Intrinsics.areEqual(unknownFields(), supportConfig.unknownFields()) && Intrinsics.areEqual(this.contact_support_url, supportConfig.contact_support_url) && Intrinsics.areEqual(this.privacy_policy_url, supportConfig.privacy_policy_url) && Intrinsics.areEqual(this.terms_of_service_url, supportConfig.terms_of_service_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.contact_support_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.privacy_policy_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.terms_of_service_url;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.contact_support_url = this.contact_support_url;
        builder.privacy_policy_url = this.privacy_policy_url;
        builder.terms_of_service_url = this.terms_of_service_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.contact_support_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "contact_support_url=", arrayList);
        }
        String str2 = this.privacy_policy_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "privacy_policy_url=", arrayList);
        }
        String str3 = this.terms_of_service_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "terms_of_service_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportConfig{", "}", 0, null, null, 56);
    }
}
