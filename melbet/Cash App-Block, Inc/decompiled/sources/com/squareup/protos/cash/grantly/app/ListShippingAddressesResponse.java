package com.squareup.protos.cash.grantly.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.PaginationResponseMetadata;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/grantly/app/ListShippingAddressesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$CardPii$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListShippingAddressesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListShippingAddressesResponse> CREATOR;
    public final ResponseMetadata metadata;
    public final PaginationResponseMetadata pagination;
    public final ResponseContext response_context;
    public final List shipping_addresses;

    static {
        ListShippingAddressesResponse$Companion$ADAPTER$1 listShippingAddressesResponse$Companion$ADAPTER$1 = new ListShippingAddressesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListShippingAddressesResponse.class), "type.googleapis.com/squareup.cash.grantly.app.ListShippingAddressesResponse", Syntax.PROTO_2, null, "squareup/cash/grantly/app/shipping_address_service.proto");
        ADAPTER = listShippingAddressesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listShippingAddressesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListShippingAddressesResponse(ResponseMetadata responseMetadata, PaginationResponseMetadata paginationResponseMetadata, List list, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.metadata = responseMetadata;
        this.pagination = paginationResponseMetadata;
        this.response_context = responseContext;
        this.shipping_addresses = TransactorKt.immutableCopyOf("shipping_addresses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListShippingAddressesResponse)) {
            return false;
        }
        ListShippingAddressesResponse listShippingAddressesResponse = (ListShippingAddressesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listShippingAddressesResponse.unknownFields()) && Intrinsics.areEqual(this.metadata, listShippingAddressesResponse.metadata) && Intrinsics.areEqual(this.pagination, listShippingAddressesResponse.pagination) && Intrinsics.areEqual(this.shipping_addresses, listShippingAddressesResponse.shipping_addresses) && Intrinsics.areEqual(this.response_context, listShippingAddressesResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseMetadata responseMetadata = this.metadata;
        int hashCode2 = (hashCode + (responseMetadata != null ? responseMetadata.hashCode() : 0)) * 37;
        PaginationResponseMetadata paginationResponseMetadata = this.pagination;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (paginationResponseMetadata != null ? paginationResponseMetadata.hashCode() : 0)) * 37, 37, this.shipping_addresses);
        ResponseContext responseContext = this.response_context;
        int hashCode3 = m + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(21, false);
        builder.postal_code = this.metadata;
        builder.last_four_digits = this.pagination;
        builder.expiration = this.shipping_addresses;
        builder.ciphertext_ = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseMetadata responseMetadata = this.metadata;
        if (responseMetadata != null) {
            arrayList.add("metadata=" + responseMetadata);
        }
        PaginationResponseMetadata paginationResponseMetadata = this.pagination;
        if (paginationResponseMetadata != null) {
            arrayList.add("pagination=" + paginationResponseMetadata);
        }
        List list = this.shipping_addresses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("shipping_addresses=", arrayList, list);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListShippingAddressesResponse{", "}", 0, null, null, 56);
    }
}
