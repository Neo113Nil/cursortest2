package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzij;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.cash.out.sync_entity.CashOutFeeData;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetSuggestedReordersResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzij", "SuggestedReorders", "Reorder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSuggestedReordersResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSuggestedReordersResponse> CREATOR;
    public final zzij response;

    public final class Reorder extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Reorder> CREATOR;
        public final String attribution_key;
        public final String brand_cashtag;
        public final String brand_token;
        public final String button_title;
        public final LocalFulfillment fulfillment;
        public final LocalImage item_image;
        public final String location_token;
        public final LocalActionOrdering.PastOrder order;
        public final String summary;
        public final String summary_detail;

        static {
            GetSuggestedReordersResponse$Reorder$Companion$ADAPTER$1 getSuggestedReordersResponse$Reorder$Companion$ADAPTER$1 = new GetSuggestedReordersResponse$Reorder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Reorder.class), "type.googleapis.com/squareup.cash.local.client.v1.GetSuggestedReordersResponse.Reorder", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getSuggestedReordersResponse$Reorder$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getSuggestedReordersResponse$Reorder$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reorder(String str, String str2, String str3, String str4, String str5, String str6, LocalImage localImage, String str7, LocalActionOrdering.PastOrder pastOrder, LocalFulfillment localFulfillment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.brand_token = str;
            this.location_token = str2;
            this.attribution_key = str3;
            this.brand_cashtag = str4;
            this.summary = str5;
            this.summary_detail = str6;
            this.item_image = localImage;
            this.button_title = str7;
            this.order = pastOrder;
            this.fulfillment = localFulfillment;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Reorder)) {
                return false;
            }
            Reorder reorder = (Reorder) obj;
            return Intrinsics.areEqual(unknownFields(), reorder.unknownFields()) && Intrinsics.areEqual(this.brand_token, reorder.brand_token) && Intrinsics.areEqual(this.location_token, reorder.location_token) && Intrinsics.areEqual(this.attribution_key, reorder.attribution_key) && Intrinsics.areEqual(this.brand_cashtag, reorder.brand_cashtag) && Intrinsics.areEqual(this.summary, reorder.summary) && Intrinsics.areEqual(this.summary_detail, reorder.summary_detail) && Intrinsics.areEqual(this.item_image, reorder.item_image) && Intrinsics.areEqual(this.button_title, reorder.button_title) && Intrinsics.areEqual(this.order, reorder.order) && Intrinsics.areEqual(this.fulfillment, reorder.fulfillment);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.brand_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.location_token;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.attribution_key;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.brand_cashtag;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.summary;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.summary_detail;
            int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            LocalImage localImage = this.item_image;
            int hashCode8 = (hashCode7 + (localImage != null ? localImage.hashCode() : 0)) * 37;
            String str7 = this.button_title;
            int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
            LocalActionOrdering.PastOrder pastOrder = this.order;
            int hashCode10 = (hashCode9 + (pastOrder != null ? pastOrder.hashCode() : 0)) * 37;
            LocalFulfillment localFulfillment = this.fulfillment;
            int hashCode11 = hashCode10 + (localFulfillment != null ? localFulfillment.hashCode() : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashInRequest.Builder builder = new CashInRequest.Builder(8);
            builder.external_id = this.brand_token;
            builder.passcode_token = this.location_token;
            builder.external_client_transfer_token = this.attribution_key;
            builder.request_context = this.brand_cashtag;
            builder.source = this.summary;
            builder.target = this.summary_detail;
            builder.amount = this.item_image;
            builder.call_context = this.button_title;
            builder.forwarded_call_context = this.order;
            builder.client_verified_digital_wallet = this.fulfillment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.brand_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
            }
            String str2 = this.location_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
            }
            String str3 = this.attribution_key;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "attribution_key=", arrayList);
            }
            String str4 = this.brand_cashtag;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "brand_cashtag=", arrayList);
            }
            String str5 = this.summary;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "summary=", arrayList);
            }
            String str6 = this.summary_detail;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "summary_detail=", arrayList);
            }
            LocalImage localImage = this.item_image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("item_image=", localImage, arrayList);
            }
            String str7 = this.button_title;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "button_title=", arrayList);
            }
            LocalActionOrdering.PastOrder pastOrder = this.order;
            if (pastOrder != null) {
                arrayList.add("order=" + pastOrder);
            }
            LocalFulfillment localFulfillment = this.fulfillment;
            if (localFulfillment != null) {
                arrayList.add("fulfillment=" + localFulfillment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Reorder{", "}", 0, null, null, 56);
        }
    }

    public final class SuggestedReorders extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SuggestedReorders> CREATOR;
        public final Long expires_at;
        public final List reorders;

        static {
            GetSuggestedReordersResponse$SuggestedReorders$Companion$ADAPTER$1 getSuggestedReordersResponse$SuggestedReorders$Companion$ADAPTER$1 = new GetSuggestedReordersResponse$SuggestedReorders$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SuggestedReorders.class), "type.googleapis.com/squareup.cash.local.client.v1.GetSuggestedReordersResponse.SuggestedReorders", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getSuggestedReordersResponse$SuggestedReorders$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getSuggestedReordersResponse$SuggestedReorders$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestedReorders(Long l, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.expires_at = l;
            this.reorders = TransactorKt.immutableCopyOf("reorders", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SuggestedReorders)) {
                return false;
            }
            SuggestedReorders suggestedReorders = (SuggestedReorders) obj;
            return Intrinsics.areEqual(unknownFields(), suggestedReorders.unknownFields()) && Intrinsics.areEqual(this.expires_at, suggestedReorders.expires_at) && Intrinsics.areEqual(this.reorders, suggestedReorders.reorders);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.expires_at;
            int hashCode2 = this.reorders.hashCode() + ((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashOutFeeData.Builder builder = new CashOutFeeData.Builder(2);
            builder.version = this.expires_at;
            builder.min_fee_steps = this.reorders;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.expires_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
            }
            List list = this.reorders;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("reorders=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SuggestedReorders{", "}", 0, null, null, 56);
        }
    }

    static {
        GetSuggestedReordersResponse$Companion$ADAPTER$1 getSuggestedReordersResponse$Companion$ADAPTER$1 = new GetSuggestedReordersResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSuggestedReordersResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetSuggestedReordersResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getSuggestedReordersResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSuggestedReordersResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSuggestedReordersResponse(zzij zzijVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zzijVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSuggestedReordersResponse)) {
            return false;
        }
        GetSuggestedReordersResponse getSuggestedReordersResponse = (GetSuggestedReordersResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSuggestedReordersResponse.unknownFields()) && Intrinsics.areEqual(this.response, getSuggestedReordersResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzij zzijVar = this.response;
        int hashCode2 = hashCode + (zzijVar != null ? zzijVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(5);
        builder.local_buyer = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzij zzijVar = this.response;
        if (zzijVar != null) {
            arrayList.add("response=" + zzijVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSuggestedReordersResponse{", "}", 0, null, null, 56);
    }
}
