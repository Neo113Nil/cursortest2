package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Activity;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/GetOperationResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Activity$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetOperationResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetOperationResponse> CREATOR;

    /* renamed from: operation, reason: collision with root package name */
    public final Operation f1252operation;

    static {
        GetOperationResponse$Companion$ADAPTER$1 getOperationResponse$Companion$ADAPTER$1 = new GetOperationResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetOperationResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.GetOperationResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = getOperationResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getOperationResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOperationResponse(Operation operation2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1252operation = operation2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetOperationResponse)) {
            return false;
        }
        GetOperationResponse getOperationResponse = (GetOperationResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getOperationResponse.unknownFields()) && Intrinsics.areEqual(this.f1252operation, getOperationResponse.f1252operation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Operation operation2 = this.f1252operation;
        int hashCode2 = hashCode + (operation2 != null ? operation2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(17);
        builder.activity = this.f1252operation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Operation operation2 = this.f1252operation;
        if (operation2 != null) {
            arrayList.add("operation=" + operation2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOperationResponse{", "}", 0, null, null, 56);
    }
}
