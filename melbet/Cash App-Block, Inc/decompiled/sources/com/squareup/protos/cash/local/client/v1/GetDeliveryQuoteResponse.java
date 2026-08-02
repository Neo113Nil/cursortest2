package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzia;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetDeliveryQuoteResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzia", "DeliveryQuote", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetDeliveryQuoteResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDeliveryQuoteResponse> CREATOR;
    public final zzia response;

    public final class DeliveryQuote extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DeliveryQuote> CREATOR;
        public final String brand_token;
        public final LocalMoney delivery_fee;
        public final LocalFulfillment fulfillment;
        public final LocalLocationSummary location_summary;

        static {
            GetDeliveryQuoteResponse$DeliveryQuote$Companion$ADAPTER$1 getDeliveryQuoteResponse$DeliveryQuote$Companion$ADAPTER$1 = new GetDeliveryQuoteResponse$DeliveryQuote$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeliveryQuote.class), "type.googleapis.com/squareup.cash.local.client.v1.GetDeliveryQuoteResponse.DeliveryQuote", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getDeliveryQuoteResponse$DeliveryQuote$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getDeliveryQuoteResponse$DeliveryQuote$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeliveryQuote(String str, LocalLocationSummary localLocationSummary, LocalFulfillment localFulfillment, LocalMoney localMoney, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.brand_token = str;
            this.location_summary = localLocationSummary;
            this.fulfillment = localFulfillment;
            this.delivery_fee = localMoney;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeliveryQuote)) {
                return false;
            }
            DeliveryQuote deliveryQuote = (DeliveryQuote) obj;
            return Intrinsics.areEqual(unknownFields(), deliveryQuote.unknownFields()) && Intrinsics.areEqual(this.brand_token, deliveryQuote.brand_token) && Intrinsics.areEqual(this.location_summary, deliveryQuote.location_summary) && Intrinsics.areEqual(this.fulfillment, deliveryQuote.fulfillment) && Intrinsics.areEqual(this.delivery_fee, deliveryQuote.delivery_fee);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.brand_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalLocationSummary localLocationSummary = this.location_summary;
            int hashCode3 = (hashCode2 + (localLocationSummary != null ? localLocationSummary.hashCode() : 0)) * 37;
            LocalFulfillment localFulfillment = this.fulfillment;
            int hashCode4 = (hashCode3 + (localFulfillment != null ? localFulfillment.hashCode() : 0)) * 37;
            LocalMoney localMoney = this.delivery_fee;
            int hashCode5 = hashCode4 + (localMoney != null ? localMoney.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(4, false);
            builder.id = this.brand_token;
            builder.last_4 = this.location_summary;
            builder.gift_card_id = this.fulfillment;
            builder.gift_card_amount = this.delivery_fee;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.brand_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
            }
            LocalLocationSummary localLocationSummary = this.location_summary;
            if (localLocationSummary != null) {
                arrayList.add("location_summary=" + localLocationSummary);
            }
            LocalFulfillment localFulfillment = this.fulfillment;
            if (localFulfillment != null) {
                arrayList.add("fulfillment=" + localFulfillment);
            }
            LocalMoney localMoney = this.delivery_fee;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("delivery_fee=", localMoney, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DeliveryQuote{", "}", 0, null, null, 56);
        }
    }

    static {
        GetDeliveryQuoteResponse$Companion$ADAPTER$1 getDeliveryQuoteResponse$Companion$ADAPTER$1 = new GetDeliveryQuoteResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDeliveryQuoteResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetDeliveryQuoteResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getDeliveryQuoteResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDeliveryQuoteResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeliveryQuoteResponse(zzia zziaVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zziaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDeliveryQuoteResponse)) {
            return false;
        }
        GetDeliveryQuoteResponse getDeliveryQuoteResponse = (GetDeliveryQuoteResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDeliveryQuoteResponse.unknownFields()) && Intrinsics.areEqual(this.response, getDeliveryQuoteResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzia zziaVar = this.response;
        int hashCode2 = hashCode + (zziaVar != null ? zziaVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(29);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzia zziaVar = this.response;
        if (zziaVar != null) {
            arrayList.add("response=" + zziaVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDeliveryQuoteResponse{", "}", 0, null, null, 56);
    }
}
