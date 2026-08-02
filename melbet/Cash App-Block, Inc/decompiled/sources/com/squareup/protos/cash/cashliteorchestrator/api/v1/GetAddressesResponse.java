package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.TrustsData;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/GetAddressesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/TrustsData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAddressesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAddressesResponse> CREATOR;
    public final List addresses;

    static {
        GetAddressesResponse$Companion$ADAPTER$1 getAddressesResponse$Companion$ADAPTER$1 = new GetAddressesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAddressesResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.GetAddressesResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/address_service.proto");
        ADAPTER = getAddressesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAddressesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAddressesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.addresses = TransactorKt.immutableCopyOf("addresses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAddressesResponse)) {
            return false;
        }
        GetAddressesResponse getAddressesResponse = (GetAddressesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAddressesResponse.unknownFields()) && Intrinsics.areEqual(this.addresses, getAddressesResponse.addresses);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.addresses.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TrustsData.Builder builder = new TrustsData.Builder(6);
        builder.trust = this.addresses;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.addresses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("addresses=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAddressesResponse{", "}", 0, null, null, 56);
    }
}
