package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/api/v1/GetAchCashInAccountResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GetCashInAccountResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAchCashInAccountResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAchCashInAccountResponse> CREATOR;
    public final List account_info_rows;
    public final ResponseContext response_context;

    static {
        GetAchCashInAccountResponse$Companion$ADAPTER$1 getAchCashInAccountResponse$Companion$ADAPTER$1 = new GetAchCashInAccountResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAchCashInAccountResponse.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.GetAchCashInAccountResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/cash_in.proto");
        ADAPTER = getAchCashInAccountResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAchCashInAccountResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAchCashInAccountResponse(ResponseContext responseContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.response_context = responseContext;
        this.account_info_rows = TransactorKt.immutableCopyOf("account_info_rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAchCashInAccountResponse)) {
            return false;
        }
        GetAchCashInAccountResponse getAchCashInAccountResponse = (GetAchCashInAccountResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAchCashInAccountResponse.unknownFields()) && Intrinsics.areEqual(this.account_info_rows, getAchCashInAccountResponse.account_info_rows) && Intrinsics.areEqual(this.response_context, getAchCashInAccountResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.account_info_rows);
        ResponseContext responseContext = this.response_context;
        int hashCode = m + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetCashInAccountResponse.Builder builder = new GetCashInAccountResponse.Builder(3);
        builder.account_info_rows = this.account_info_rows;
        builder.response_context = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.account_info_rows.isEmpty()) {
            arrayList.add("account_info_rows=██");
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAchCashInAccountResponse{", "}", 0, null, null, 56);
    }
}
