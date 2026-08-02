package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/GetFamilyPendingRequestsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetFamilyPendingRequestsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFamilyPendingRequestsResponse> CREATOR;
    public final PendingRequestsParams pending_requests_parameters;

    static {
        GetFamilyPendingRequestsResponse$Companion$ADAPTER$1 getFamilyPendingRequestsResponse$Companion$ADAPTER$1 = new GetFamilyPendingRequestsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetFamilyPendingRequestsResponse.class), "type.googleapis.com/squareup.cash.aegis.api.GetFamilyPendingRequestsResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/GetFamilyPendingRequestsResponse.proto");
        ADAPTER = getFamilyPendingRequestsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getFamilyPendingRequestsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFamilyPendingRequestsResponse(PendingRequestsParams pendingRequestsParams, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pending_requests_parameters = pendingRequestsParams;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFamilyPendingRequestsResponse)) {
            return false;
        }
        GetFamilyPendingRequestsResponse getFamilyPendingRequestsResponse = (GetFamilyPendingRequestsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getFamilyPendingRequestsResponse.unknownFields()) && Intrinsics.areEqual(this.pending_requests_parameters, getFamilyPendingRequestsResponse.pending_requests_parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PendingRequestsParams pendingRequestsParams = this.pending_requests_parameters;
        int hashCode2 = hashCode + (pendingRequestsParams != null ? pendingRequestsParams.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(17);
        builder.f1245type = this.pending_requests_parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PendingRequestsParams pendingRequestsParams = this.pending_requests_parameters;
        if (pendingRequestsParams != null) {
            arrayList.add("pending_requests_parameters=" + pendingRequestsParams);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFamilyPendingRequestsResponse{", "}", 0, null, null, 56);
    }
}
