package com.squareup.protos.cash.semaphore.api;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.ListPoolsRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/semaphore/api/GetFeatureLensResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetFeatureLensResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFeatureLensResponse> CREATOR;
    public final VendedFlags flags;

    static {
        GetFeatureLensResponse$Companion$ADAPTER$1 getFeatureLensResponse$Companion$ADAPTER$1 = new GetFeatureLensResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetFeatureLensResponse.class), "type.googleapis.com/squareup.cash.semaphore.api.GetFeatureLensResponse", Syntax.PROTO_2, null, "squareup/cash/semaphore/api/SemaphoreCustomerCircumstance.proto");
        ADAPTER = getFeatureLensResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getFeatureLensResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeatureLensResponse(VendedFlags vendedFlags, ByteString byteString) {
        super(ADAPTER, byteString);
        vendedFlags.getClass();
        byteString.getClass();
        this.flags = vendedFlags;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFeatureLensResponse)) {
            return false;
        }
        GetFeatureLensResponse getFeatureLensResponse = (GetFeatureLensResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getFeatureLensResponse.unknownFields()) && Intrinsics.areEqual(this.flags, getFeatureLensResponse.flags);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.flags.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(15);
        builder.pool_lifecycle_filter = this.flags;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("flags=" + this.flags);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFeatureLensResponse{", "}", 0, null, null, 56);
    }
}
