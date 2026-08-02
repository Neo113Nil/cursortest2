package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/ExecuteUserOpResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/Row$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExecuteUserOpResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExecuteUserOpResponse> CREATOR;
    public final OperationStatus operation_status;
    public final String operation_token;
    public final String user_op_hash;

    static {
        ExecuteUserOpResponse$Companion$ADAPTER$1 executeUserOpResponse$Companion$ADAPTER$1 = new ExecuteUserOpResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExecuteUserOpResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.ExecuteUserOpResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = executeUserOpResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(executeUserOpResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteUserOpResponse(String str, String str2, OperationStatus operationStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.user_op_hash = str;
        this.operation_token = str2;
        this.operation_status = operationStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExecuteUserOpResponse)) {
            return false;
        }
        ExecuteUserOpResponse executeUserOpResponse = (ExecuteUserOpResponse) obj;
        return Intrinsics.areEqual(unknownFields(), executeUserOpResponse.unknownFields()) && Intrinsics.areEqual(this.user_op_hash, executeUserOpResponse.user_op_hash) && Intrinsics.areEqual(this.operation_token, executeUserOpResponse.operation_token) && this.operation_status == executeUserOpResponse.operation_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.user_op_hash;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.operation_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        OperationStatus operationStatus = this.operation_status;
        int hashCode4 = hashCode3 + (operationStatus != null ? operationStatus.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(17);
        builder.title = this.user_op_hash;
        builder.subtitle = this.operation_token;
        builder.action = this.operation_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.user_op_hash;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "user_op_hash=", arrayList);
        }
        String str2 = this.operation_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "operation_token=", arrayList);
        }
        OperationStatus operationStatus = this.operation_status;
        if (operationStatus != null) {
            arrayList.add("operation_status=" + operationStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExecuteUserOpResponse{", "}", 0, null, null, 56);
    }
}
