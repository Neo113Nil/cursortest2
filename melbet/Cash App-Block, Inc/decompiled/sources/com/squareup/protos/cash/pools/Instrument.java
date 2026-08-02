package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.activity.CashAppLocalPaymentRenderData;
import com.squareup.protos.cash.local.client.app.v1.BulkRemoveBrandsRequest;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsRequest;
import com.squareup.protos.cash.local.client.app.v1.GetMarketingMessageRequest;
import com.squareup.protos.cash.local.client.app.v1.ListMarketingMessagesRequest;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenSectionHeader;
import com.squareup.protos.cash.local.client.v1.ConfirmArrivalRequest;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersRequest;
import com.squareup.protos.cash.local.client.v1.InvokeClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.local.client.v1.RedirectToWeb;
import com.squareup.protos.cash.local.client.v1.TagDefinition;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityCategoryEntry;
import com.squareup.protos.cash.marketdata.model.OpenUrlAction;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsRequest;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsRequest;
import com.squareup.protos.cash.nearby.api.v1.NFCPayload;
import com.squareup.protos.cash.orderly.app.afterpaystatements.ListStatementsAppApiRequest;
import com.squareup.protos.cash.orderly.app_data.InternallyCreatedOrder;
import com.squareup.protos.cash.paymenttemplate.v1.GetPaymentTemplateRequest;
import com.squareup.protos.cash.paymenttemplate.v1.UsdcP2pMethodDetail;
import com.squareup.protos.cash.piggybank.appapi.GetInterestSettingsRequest;
import com.squareup.protos.cash.plasma.callcontext.AuthorizedPrincipal;
import com.squareup.protos.cash.postbank.api.GetDirectDepositFormRequest;
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

/* loaded from: classes7.dex */
public final class Instrument extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Instrument> CREATOR;
    public final String token;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Instrument(this.token, buildUnknownFields());
                case 1:
                    return new CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail(this.token, buildUnknownFields());
                case 2:
                    return new CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail(this.token, buildUnknownFields());
                case 3:
                    return new CashAppLocalPaymentRenderData.Actions(this.token, buildUnknownFields());
                case 4:
                    String str = this.token;
                    if (str != null) {
                        return new BulkRemoveBrandsRequest.RemoveBrandRequest(str, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "brand_token");
                    throw null;
                case 5:
                    String str2 = this.token;
                    if (str2 != null) {
                        return new BulkUpdateBrandsRequest.AddBrandRequest(str2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str2, "brand_token");
                    throw null;
                case 6:
                    String str3 = this.token;
                    if (str3 != null) {
                        return new BulkUpdateBrandsRequest.RemoveBrandRequest(str3, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str3, "brand_token");
                    throw null;
                case 7:
                    String str4 = this.token;
                    if (str4 != null) {
                        return new GetMarketingMessageRequest(str4, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str4, "marketing_message_token");
                    throw null;
                case 8:
                    return new ListMarketingMessagesRequest(this.token, buildUnknownFields());
                case 9:
                    return new MarketScreenSectionHeader(this.token, buildUnknownFields());
                case 10:
                    return new ConfirmArrivalRequest(this.token, buildUnknownFields());
                case 11:
                    return new GetSuggestedReordersRequest(this.token, buildUnknownFields());
                case 12:
                    return new InvokeClientRoute(this.token, buildUnknownFields());
                case 13:
                    return new LocalBuyer.LocalBuyerGuest(this.token, buildUnknownFields());
                case 14:
                    return new RedirectToWeb(this.token, buildUnknownFields());
                case 15:
                    return new TagDefinition.Membership(this.token, buildUnknownFields());
                case 16:
                    return new InvestmentEntityCategoryEntry(this.token, buildUnknownFields());
                case 17:
                    return new OpenUrlAction(this.token, buildUnknownFields());
                case 18:
                    return new GetETFDetailsRequest(this.token, buildUnknownFields());
                case 19:
                    return new GetInvestingMetricsRequest(this.token, buildUnknownFields());
                case 20:
                    return new NFCPayload(this.token, buildUnknownFields());
                case 21:
                    return new ListStatementsAppApiRequest(this.token, buildUnknownFields());
                case 22:
                    String str5 = this.token;
                    if (str5 != null) {
                        return new InternallyCreatedOrder(str5, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str5, "order_id");
                    throw null;
                case 23:
                    return new GetPaymentTemplateRequest(this.token, buildUnknownFields());
                case 24:
                    return new UsdcP2pMethodDetail(this.token, buildUnknownFields());
                case 25:
                    return new GetInterestSettingsRequest(this.token, buildUnknownFields());
                case 26:
                    return new AuthorizedPrincipal(this.token, buildUnknownFields());
                case 27:
                    return new CloseMoneyPoolFlowParameters(this.token, buildUnknownFields());
                case 28:
                    return new GetMoneyPoolRequest(this.token, buildUnknownFields());
                default:
                    return new GetDirectDepositFormRequest(this.token, buildUnknownFields());
            }
        }
    }

    static {
        Instrument$Companion$ADAPTER$1 instrument$Companion$ADAPTER$1 = new Instrument$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Instrument.class), "type.googleapis.com/squareup.cash.pools.v1beta.Instrument", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = instrument$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrument$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Instrument(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Instrument)) {
            return false;
        }
        Instrument instrument = (Instrument) obj;
        return Intrinsics.areEqual(unknownFields(), instrument.unknownFields()) && Intrinsics.areEqual(this.token, instrument.token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Instrument{", "}", 0, null, null, 56);
    }
}
