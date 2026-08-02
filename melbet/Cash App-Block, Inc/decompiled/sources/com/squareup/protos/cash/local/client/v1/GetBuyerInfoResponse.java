package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzhz;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetBuyerInfoResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzhz", "BuyerInfo", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetBuyerInfoResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBuyerInfoResponse> CREATOR;
    public final zzhz response;

    public final class BuyerInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BuyerInfo> CREATOR;
        public final LocalCart active_cart;
        public final Boolean can_follow_brand;
        public final BrandBanner cart_banner;
        public final Boolean follows_brand;
        public final LocalLoyaltyAccount loyalty_account;
        public final BrandBanner profile_banner;

        static {
            GetBuyerInfoResponse$BuyerInfo$Companion$ADAPTER$1 getBuyerInfoResponse$BuyerInfo$Companion$ADAPTER$1 = new GetBuyerInfoResponse$BuyerInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BuyerInfo.class), "type.googleapis.com/squareup.cash.local.client.v1.GetBuyerInfoResponse.BuyerInfo", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getBuyerInfoResponse$BuyerInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getBuyerInfoResponse$BuyerInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyerInfo(BrandBanner brandBanner, BrandBanner brandBanner2, Boolean bool, Boolean bool2, LocalLoyaltyAccount localLoyaltyAccount, LocalCart localCart, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.profile_banner = brandBanner;
            this.cart_banner = brandBanner2;
            this.follows_brand = bool;
            this.can_follow_brand = bool2;
            this.loyalty_account = localLoyaltyAccount;
            this.active_cart = localCart;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BuyerInfo)) {
                return false;
            }
            BuyerInfo buyerInfo = (BuyerInfo) obj;
            return Intrinsics.areEqual(unknownFields(), buyerInfo.unknownFields()) && Intrinsics.areEqual(this.profile_banner, buyerInfo.profile_banner) && Intrinsics.areEqual(this.cart_banner, buyerInfo.cart_banner) && Intrinsics.areEqual(this.follows_brand, buyerInfo.follows_brand) && Intrinsics.areEqual(this.can_follow_brand, buyerInfo.can_follow_brand) && Intrinsics.areEqual(this.loyalty_account, buyerInfo.loyalty_account) && Intrinsics.areEqual(this.active_cart, buyerInfo.active_cart);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            BrandBanner brandBanner = this.profile_banner;
            int hashCode2 = (hashCode + (brandBanner != null ? brandBanner.hashCode() : 0)) * 37;
            BrandBanner brandBanner2 = this.cart_banner;
            int hashCode3 = (hashCode2 + (brandBanner2 != null ? brandBanner2.hashCode() : 0)) * 37;
            Boolean bool = this.follows_brand;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.can_follow_brand;
            int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            LocalLoyaltyAccount localLoyaltyAccount = this.loyalty_account;
            int hashCode6 = (hashCode5 + (localLoyaltyAccount != null ? localLoyaltyAccount.hashCode() : 0)) * 37;
            LocalCart localCart = this.active_cart;
            int hashCode7 = hashCode6 + (localCart != null ? localCart.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ExpenseSlice.Builder builder = new ExpenseSlice.Builder(12);
            builder.requester = this.profile_banner;
            builder.responder = this.cart_banner;
            builder.amount = this.follows_brand;
            builder.status = this.can_follow_brand;
            builder.slice_token = this.loyalty_account;
            builder.action = this.active_cart;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BrandBanner brandBanner = this.profile_banner;
            if (brandBanner != null) {
                arrayList.add("profile_banner=" + brandBanner);
            }
            BrandBanner brandBanner2 = this.cart_banner;
            if (brandBanner2 != null) {
                arrayList.add("cart_banner=" + brandBanner2);
            }
            Boolean bool = this.follows_brand;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("follows_brand=", bool, arrayList);
            }
            Boolean bool2 = this.can_follow_brand;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("can_follow_brand=", bool2, arrayList);
            }
            LocalLoyaltyAccount localLoyaltyAccount = this.loyalty_account;
            if (localLoyaltyAccount != null) {
                arrayList.add("loyalty_account=" + localLoyaltyAccount);
            }
            LocalCart localCart = this.active_cart;
            if (localCart != null) {
                arrayList.add("active_cart=" + localCart);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BuyerInfo{", "}", 0, null, null, 56);
        }
    }

    static {
        GetBuyerInfoResponse$Companion$ADAPTER$1 getBuyerInfoResponse$Companion$ADAPTER$1 = new GetBuyerInfoResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBuyerInfoResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetBuyerInfoResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getBuyerInfoResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBuyerInfoResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBuyerInfoResponse(zzhz zzhzVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zzhzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBuyerInfoResponse)) {
            return false;
        }
        GetBuyerInfoResponse getBuyerInfoResponse = (GetBuyerInfoResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBuyerInfoResponse.unknownFields()) && Intrinsics.areEqual(this.response, getBuyerInfoResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzhz zzhzVar = this.response;
        int hashCode2 = hashCode + (zzhzVar != null ? zzhzVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(28);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzhz zzhzVar = this.response;
        if (zzhzVar != null) {
            arrayList.add("response=" + zzhzVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBuyerInfoResponse{", "}", 0, null, null, 56);
    }
}
