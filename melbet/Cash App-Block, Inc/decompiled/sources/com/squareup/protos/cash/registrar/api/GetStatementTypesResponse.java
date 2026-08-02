package com.squareup.protos.cash.registrar.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/registrar/api/GetStatementTypesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetStatementTypesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetStatementTypesResponse> CREATOR;
    public final List statement_type_details;

    static {
        GetStatementTypesResponse$Companion$ADAPTER$1 getStatementTypesResponse$Companion$ADAPTER$1 = new GetStatementTypesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetStatementTypesResponse.class), "type.googleapis.com/squareup.cash.registrar.api.GetStatementTypesResponse", Syntax.PROTO_2, null, "squareup/cash/registrar/api/get_statement_types.proto");
        ADAPTER = getStatementTypesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getStatementTypesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStatementTypesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.statement_type_details = TransactorKt.immutableCopyOf("statement_type_details", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStatementTypesResponse)) {
            return false;
        }
        GetStatementTypesResponse getStatementTypesResponse = (GetStatementTypesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getStatementTypesResponse.unknownFields()) && Intrinsics.areEqual(this.statement_type_details, getStatementTypesResponse.statement_type_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.statement_type_details.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(18, false);
        builder.pools = this.statement_type_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.statement_type_details;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("statement_type_details=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetStatementTypesResponse{", "}", 0, null, null, 56);
    }
}
