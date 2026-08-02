package com.squareup.protos.cash.sup.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.lending.sync_values.SupOffersTabCreditLine;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/sup/api/v1/GetDefaultCreditLineResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetDefaultCreditLineResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDefaultCreditLineResponse> CREATOR;
    public final SupOffersTabCreditLine credit_line;

    static {
        GetDefaultCreditLineResponse$Companion$ADAPTER$1 getDefaultCreditLineResponse$Companion$ADAPTER$1 = new GetDefaultCreditLineResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDefaultCreditLineResponse.class), "type.googleapis.com/squareup.cash.sup.api.v1.GetDefaultCreditLineResponse", Syntax.PROTO_2, null, "squareup/cash/sup/api/v1/merchant_config.proto");
        ADAPTER = getDefaultCreditLineResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDefaultCreditLineResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDefaultCreditLineResponse(SupOffersTabCreditLine supOffersTabCreditLine, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.credit_line = supOffersTabCreditLine;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDefaultCreditLineResponse)) {
            return false;
        }
        GetDefaultCreditLineResponse getDefaultCreditLineResponse = (GetDefaultCreditLineResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDefaultCreditLineResponse.unknownFields()) && Intrinsics.areEqual(this.credit_line, getDefaultCreditLineResponse.credit_line);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SupOffersTabCreditLine supOffersTabCreditLine = this.credit_line;
        int hashCode2 = hashCode + (supOffersTabCreditLine != null ? supOffersTabCreditLine.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(25);
        builder.pool_lifecycle_filter = this.credit_line;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SupOffersTabCreditLine supOffersTabCreditLine = this.credit_line;
        if (supOffersTabCreditLine != null) {
            arrayList.add("credit_line=" + supOffersTabCreditLine);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDefaultCreditLineResponse{", "}", 0, null, null, 56);
    }
}
