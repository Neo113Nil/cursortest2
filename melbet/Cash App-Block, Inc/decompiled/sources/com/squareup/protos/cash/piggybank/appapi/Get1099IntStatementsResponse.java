package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.GetCashInAccountResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/piggybank/appapi/Get1099IntStatementsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GetCashInAccountResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Get1099IntStatementsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Get1099IntStatementsResponse> CREATOR;
    public final List documents;
    public final ResponseContext response_context;

    static {
        Get1099IntStatementsResponse$Companion$ADAPTER$1 get1099IntStatementsResponse$Companion$ADAPTER$1 = new Get1099IntStatementsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Get1099IntStatementsResponse.class), "type.googleapis.com/squareup.cash.piggybank.appapi.Get1099IntStatementsResponse", Syntax.PROTO_2, null, "squareup/cash/app/get_1099_int_statements.proto");
        ADAPTER = get1099IntStatementsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(get1099IntStatementsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Get1099IntStatementsResponse(ResponseContext responseContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.response_context = responseContext;
        this.documents = TransactorKt.immutableCopyOf("documents", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Get1099IntStatementsResponse)) {
            return false;
        }
        Get1099IntStatementsResponse get1099IntStatementsResponse = (Get1099IntStatementsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), get1099IntStatementsResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, get1099IntStatementsResponse.response_context) && Intrinsics.areEqual(this.documents, get1099IntStatementsResponse.documents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = this.documents.hashCode() + ((hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetCashInAccountResponse.Builder builder = new GetCashInAccountResponse.Builder(6);
        builder.response_context = this.response_context;
        builder.account_info_rows = this.documents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        List list = this.documents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("documents=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Get1099IntStatementsResponse{", "}", 0, null, null, 56);
    }
}
