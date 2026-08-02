package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v1.model.TextCardSection;
import com.squareup.protos.cash.genericelements.ui.PlaceholderContainer;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.groups.PrimaryAction;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.janus.api.AuthorizedPrincipal;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsRequest;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusRequest;
import com.squareup.protos.cash.local.client.v1.BrandTag;
import com.squareup.protos.cash.local.client.v1.GetActiveOrdersRequest;
import com.squareup.protos.cash.local.client.v1.GetCartRequest;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse;
import com.squareup.protos.cash.local.client.v1.GetOrderRequest;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.protos.cash.local.client.v1.LocalOnboardingUpsell;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionAvailability;
import com.squareup.protos.cash.lynx.api.v1_0.InitiateStripeLinkResponse;
import com.squareup.protos.cash.marketdata.model.DisplayMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.BoostMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.ShareSheet;
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
public final class FullName extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FullName> CREATOR;
    public final String family_name;
    public final String given_name;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String family_name;
        public String given_name;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new FullName(this.given_name, this.family_name, buildUnknownFields());
                case 1:
                    return new TextCardSection.OverflowCard(this.given_name, this.family_name, buildUnknownFields());
                case 2:
                    return new PlaceholderContainer(this.given_name, this.family_name, buildUnknownFields());
                case 3:
                    return new Action.LinkAccount(this.given_name, this.family_name, buildUnknownFields());
                case 4:
                    return new Action.OnFileDeposit(this.given_name, this.family_name, buildUnknownFields());
                case 5:
                    return new Action.OnFilePayout(this.given_name, this.family_name, buildUnknownFields());
                case 6:
                    return new LoanParty(this.given_name, this.family_name, buildUnknownFields());
                case 7:
                    return new PrimaryAction(this.given_name, this.family_name, buildUnknownFields());
                case 8:
                    return new Order.FeatureMetadata.CanceledSponsorshipMetadata(this.given_name, this.family_name, buildUnknownFields());
                case 9:
                    return new Order.OrderSponsorship(this.given_name, this.family_name, buildUnknownFields());
                case 10:
                    return new AuthorizedPrincipal(this.given_name, this.family_name, buildUnknownFields());
                case 11:
                    return new CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail(this.given_name, this.family_name, buildUnknownFields());
                case 12:
                    String str = this.given_name;
                    if (str != null) {
                        return new BulkAddBrandsRequest.AddBrandRequest(str, this.family_name, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "brand_token");
                    throw null;
                case 13:
                    return new LocalPOSCheckIn.Color(this.given_name, this.family_name, buildUnknownFields());
                case 14:
                    return new LocalPOSCheckIn.Image(this.given_name, this.family_name, buildUnknownFields());
                case 15:
                    return new BatchGetLocationStatusRequest.GetLocationStatusRequest(this.given_name, this.family_name, buildUnknownFields());
                case 16:
                    return new BrandTag(this.given_name, this.family_name, buildUnknownFields());
                case 17:
                    return new GetActiveOrdersRequest(this.given_name, this.family_name, buildUnknownFields());
                case 18:
                    return new GetCartRequest(this.given_name, this.family_name, buildUnknownFields());
                case 19:
                    return new GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine(this.given_name, this.family_name, buildUnknownFields());
                case 20:
                    return new GetOrderRequest(this.given_name, this.family_name, buildUnknownFields());
                case 21:
                    return new LocalMenuItem.PreorderingItemSummary(this.given_name, this.family_name, buildUnknownFields());
                case 22:
                    return new LocalOnboardingUpsell.Button(this.given_name, this.family_name, buildUnknownFields());
                case 23:
                    return new LocalProfileWidget.LinksData.Link(this.given_name, this.family_name, buildUnknownFields());
                case 24:
                    String str2 = this.given_name;
                    if (str2 != null) {
                        return new ShortlinkAction(str2, this.family_name, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str2, "shortlink_key");
                    throw null;
                case 25:
                    return new LoyaltyPromotionAvailability.DayTime(this.given_name, this.family_name, buildUnknownFields());
                case 26:
                    return new InitiateStripeLinkResponse(this.given_name, this.family_name, buildUnknownFields());
                case 27:
                    return new DisplayMessageAction(this.given_name, this.family_name, buildUnknownFields());
                case 28:
                    return new BoostMessage(this.given_name, this.family_name, buildUnknownFields());
                default:
                    return new ShareSheet(this.given_name, this.family_name, buildUnknownFields());
            }
        }
    }

    static {
        FullName$Companion$ADAPTER$1 fullName$Companion$ADAPTER$1 = new FullName$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FullName.class), "type.googleapis.com/squareup.cash.grantly.api.FullName", Syntax.PROTO_2, null, "squareup/cash/grantly/api/shipping_address.proto");
        ADAPTER = fullName$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fullName$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullName(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.given_name = str;
        this.family_name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FullName)) {
            return false;
        }
        FullName fullName = (FullName) obj;
        return Intrinsics.areEqual(unknownFields(), fullName.unknownFields()) && Intrinsics.areEqual(this.given_name, fullName.given_name) && Intrinsics.areEqual(this.family_name, fullName.family_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.given_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.family_name;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.given_name = this.given_name;
        builder.family_name = this.family_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.given_name != null) {
            arrayList.add("given_name=██");
        }
        if (this.family_name != null) {
            arrayList.add("family_name=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FullName{", "}", 0, null, null, 56);
    }

    public /* synthetic */ FullName(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }
}
