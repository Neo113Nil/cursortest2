package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/blockly/api/GetBlockedCustomersResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/ResponseMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetBlockedCustomersResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBlockedCustomersResponse> CREATOR;
    public final List blocked_customers;
    public final BlocklistDetails blocklist_details;

    static {
        GetBlockedCustomersResponse$Companion$ADAPTER$1 getBlockedCustomersResponse$Companion$ADAPTER$1 = new GetBlockedCustomersResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBlockedCustomersResponse.class), "type.googleapis.com/squareup.cash.blockly.api.GetBlockedCustomersResponse", Syntax.PROTO_2, null, "squareup/cash/blockly/api/GetBlockedCustomers.proto");
        ADAPTER = getBlockedCustomersResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBlockedCustomersResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBlockedCustomersResponse(List list, BlocklistDetails blocklistDetails, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.blocklist_details = blocklistDetails;
        this.blocked_customers = TransactorKt.immutableCopyOf("blocked_customers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBlockedCustomersResponse)) {
            return false;
        }
        GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBlockedCustomersResponse.unknownFields()) && Intrinsics.areEqual(this.blocked_customers, getBlockedCustomersResponse.blocked_customers) && Intrinsics.areEqual(this.blocklist_details, getBlockedCustomersResponse.blocklist_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.blocked_customers);
        BlocklistDetails blocklistDetails = this.blocklist_details;
        int hashCode = m + (blocklistDetails != null ? blocklistDetails.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(5);
        builder.errors = this.blocked_customers;
        builder.result = this.blocklist_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.blocked_customers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("blocked_customers=", arrayList, list);
        }
        BlocklistDetails blocklistDetails = this.blocklist_details;
        if (blocklistDetails != null) {
            arrayList.add("blocklist_details=" + blocklistDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBlockedCustomersResponse{", "}", 0, null, null, 56);
    }
}
