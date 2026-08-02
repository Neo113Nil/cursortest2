package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Activity;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/GetPaymentReceiptDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Activity$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPaymentReceiptDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPaymentReceiptDetailsResponse> CREATOR;
    public final ReceiptData receipt_details;

    static {
        GetPaymentReceiptDetailsResponse$Companion$ADAPTER$1 getPaymentReceiptDetailsResponse$Companion$ADAPTER$1 = new GetPaymentReceiptDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPaymentReceiptDetailsResponse.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.GetPaymentReceiptDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/receipt_data.proto");
        ADAPTER = getPaymentReceiptDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaymentReceiptDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaymentReceiptDetailsResponse(ReceiptData receiptData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.receipt_details = receiptData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPaymentReceiptDetailsResponse)) {
            return false;
        }
        GetPaymentReceiptDetailsResponse getPaymentReceiptDetailsResponse = (GetPaymentReceiptDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPaymentReceiptDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.receipt_details, getPaymentReceiptDetailsResponse.receipt_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ReceiptData receiptData = this.receipt_details;
        int hashCode2 = hashCode + (receiptData != null ? receiptData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(6);
        builder.activity = this.receipt_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ReceiptData receiptData = this.receipt_details;
        if (receiptData != null) {
            arrayList.add("receipt_details=" + receiptData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPaymentReceiptDetailsResponse{", "}", 0, null, null, 56);
    }
}
