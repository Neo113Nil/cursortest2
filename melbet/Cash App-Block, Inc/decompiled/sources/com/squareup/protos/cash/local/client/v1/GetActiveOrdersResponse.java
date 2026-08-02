package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.InputValue;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetActiveOrdersResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/InputValue$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetActiveOrdersResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetActiveOrdersResponse> CREATOR;
    public final List active_orders;
    public final LocalErrorResponse error_response;

    static {
        GetActiveOrdersResponse$Companion$ADAPTER$1 getActiveOrdersResponse$Companion$ADAPTER$1 = new GetActiveOrdersResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetActiveOrdersResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetActiveOrdersResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getActiveOrdersResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getActiveOrdersResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActiveOrdersResponse(List list, LocalErrorResponse localErrorResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.error_response = localErrorResponse;
        this.active_orders = TransactorKt.immutableCopyOf("active_orders", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetActiveOrdersResponse)) {
            return false;
        }
        GetActiveOrdersResponse getActiveOrdersResponse = (GetActiveOrdersResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getActiveOrdersResponse.unknownFields()) && Intrinsics.areEqual(this.active_orders, getActiveOrdersResponse.active_orders) && Intrinsics.areEqual(this.error_response, getActiveOrdersResponse.error_response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.active_orders);
        LocalErrorResponse localErrorResponse = this.error_response;
        int hashCode = m + (localErrorResponse != null ? localErrorResponse.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(7);
        builder.input_id = this.active_orders;
        builder.value = this.error_response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.active_orders;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("active_orders=", arrayList, list);
        }
        LocalErrorResponse localErrorResponse = this.error_response;
        if (localErrorResponse != null) {
            arrayList.add("error_response=" + localErrorResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetActiveOrdersResponse{", "}", 0, null, null, 56);
    }
}
