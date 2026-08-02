package com.squareup.protos.cash.grantly.app;

import android.os.Parcelable;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/grantly/app/RetrieveShippingAddressResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RetrieveShippingAddressResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RetrieveShippingAddressResponse> CREATOR;
    public final ResponseMetadata metadata;
    public final ShippingAddress shipping_address;

    static {
        RetrieveShippingAddressResponse$Companion$ADAPTER$1 retrieveShippingAddressResponse$Companion$ADAPTER$1 = new RetrieveShippingAddressResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetrieveShippingAddressResponse.class), "type.googleapis.com/squareup.cash.grantly.app.RetrieveShippingAddressResponse", Syntax.PROTO_2, null, "squareup/cash/grantly/app/shipping_address_service.proto");
        ADAPTER = retrieveShippingAddressResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(retrieveShippingAddressResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrieveShippingAddressResponse(ResponseMetadata responseMetadata, ShippingAddress shippingAddress, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = responseMetadata;
        this.shipping_address = shippingAddress;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveShippingAddressResponse)) {
            return false;
        }
        RetrieveShippingAddressResponse retrieveShippingAddressResponse = (RetrieveShippingAddressResponse) obj;
        return Intrinsics.areEqual(unknownFields(), retrieveShippingAddressResponse.unknownFields()) && Intrinsics.areEqual(this.metadata, retrieveShippingAddressResponse.metadata) && Intrinsics.areEqual(this.shipping_address, retrieveShippingAddressResponse.shipping_address);
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
        int hashCode3 = hashCode2 + (shippingAddress != null ? shippingAddress.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(4);
        builder.card_type = this.metadata;
        builder.card_pii = this.shipping_address;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetrieveShippingAddressResponse{", "}", 0, null, null, 56);
    }
}
