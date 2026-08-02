package com.squareup.protos.cash.grantly.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressResponse;
import com.squareup.protos.common.location.GlobalAddress;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/grantly/app/UpdateShippingAddressResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/app/CreateShippingAddressResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateShippingAddressResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateShippingAddressResponse> CREATOR;
    public final GlobalAddress corrected_address;
    public final ResponseMetadata metadata;
    public final ResponseContext response_context;
    public final ShippingAddress shipping_address;

    static {
        UpdateShippingAddressResponse$Companion$ADAPTER$1 updateShippingAddressResponse$Companion$ADAPTER$1 = new UpdateShippingAddressResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateShippingAddressResponse.class), "type.googleapis.com/squareup.cash.grantly.app.UpdateShippingAddressResponse", Syntax.PROTO_2, null, "squareup/cash/grantly/app/shipping_address_service.proto");
        ADAPTER = updateShippingAddressResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateShippingAddressResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateShippingAddressResponse(ResponseMetadata responseMetadata, ShippingAddress shippingAddress, GlobalAddress globalAddress, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = responseMetadata;
        this.shipping_address = shippingAddress;
        this.corrected_address = globalAddress;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateShippingAddressResponse)) {
            return false;
        }
        UpdateShippingAddressResponse updateShippingAddressResponse = (UpdateShippingAddressResponse) obj;
        return Intrinsics.areEqual(unknownFields(), updateShippingAddressResponse.unknownFields()) && Intrinsics.areEqual(this.metadata, updateShippingAddressResponse.metadata) && Intrinsics.areEqual(this.shipping_address, updateShippingAddressResponse.shipping_address) && Intrinsics.areEqual(this.corrected_address, updateShippingAddressResponse.corrected_address) && Intrinsics.areEqual(this.response_context, updateShippingAddressResponse.response_context);
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
        GlobalAddress globalAddress = this.corrected_address;
        int hashCode4 = (hashCode3 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode5 = hashCode4 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CreateShippingAddressResponse.Builder builder = new CreateShippingAddressResponse.Builder(1);
        builder.metadata = this.metadata;
        builder.shipping_address = this.shipping_address;
        builder.corrected_address = this.corrected_address;
        builder.response_context = this.response_context;
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
        if (this.corrected_address != null) {
            arrayList.add("corrected_address=██");
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateShippingAddressResponse{", "}", 0, null, null, 56);
    }
}
