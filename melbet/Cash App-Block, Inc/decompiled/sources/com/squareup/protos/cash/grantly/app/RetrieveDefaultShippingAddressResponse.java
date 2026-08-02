package com.squareup.protos.cash.grantly.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/grantly/app/RetrieveDefaultShippingAddressResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/LoanOption$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RetrieveDefaultShippingAddressResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RetrieveDefaultShippingAddressResponse> CREATOR;
    public final ResponseMetadata metadata;
    public final ResponseContext response_context;
    public final ShippingAddress shipping_address;

    static {
        RetrieveDefaultShippingAddressResponse$Companion$ADAPTER$1 retrieveDefaultShippingAddressResponse$Companion$ADAPTER$1 = new RetrieveDefaultShippingAddressResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetrieveDefaultShippingAddressResponse.class), "type.googleapis.com/squareup.cash.grantly.app.RetrieveDefaultShippingAddressResponse", Syntax.PROTO_2, null, "squareup/cash/grantly/app/shipping_address_service.proto");
        ADAPTER = retrieveDefaultShippingAddressResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(retrieveDefaultShippingAddressResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrieveDefaultShippingAddressResponse(ResponseMetadata responseMetadata, ShippingAddress shippingAddress, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = responseMetadata;
        this.shipping_address = shippingAddress;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveDefaultShippingAddressResponse)) {
            return false;
        }
        RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) obj;
        return Intrinsics.areEqual(unknownFields(), retrieveDefaultShippingAddressResponse.unknownFields()) && Intrinsics.areEqual(this.metadata, retrieveDefaultShippingAddressResponse.metadata) && Intrinsics.areEqual(this.shipping_address, retrieveDefaultShippingAddressResponse.shipping_address) && Intrinsics.areEqual(this.response_context, retrieveDefaultShippingAddressResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseMetadata responseMetadata = this.metadata;
        int hashCode2 = (hashCode + (responseMetadata != null ? responseMetadata.hashCode() : 0)) * 37;
        ShippingAddress shippingAddress = this.shipping_address;
        int hashCode3 = (hashCode2 + (shippingAddress != null ? shippingAddress.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode4 = hashCode3 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(29);
        builder.loan_type = this.metadata;
        builder.payment_schedule = this.shipping_address;
        builder.tila_data = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseMetadata responseMetadata = this.metadata;
        if (responseMetadata != null) {
            arrayList.add("metadata=" + responseMetadata);
        }
        ShippingAddress shippingAddress = this.shipping_address;
        if (shippingAddress != null) {
            arrayList.add("shipping_address=" + shippingAddress);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetrieveDefaultShippingAddressResponse{", "}", 0, null, null, 56);
    }
}
