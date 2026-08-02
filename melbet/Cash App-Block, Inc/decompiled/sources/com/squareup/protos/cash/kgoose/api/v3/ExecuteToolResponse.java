package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result;", "result", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result;", "Companion", "Builder", "Result", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExecuteToolResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExecuteToolResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Result result;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse;", "<init>", "()V", "result", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Result result;

        @Override // com.squareup.wire.Message.Builder
        public ExecuteToolResponse build() {
            return new ExecuteToolResponse(this.result, buildUnknownFields());
        }

        public final Builder result(Result result) {
            this.result = result;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result;", "", "Success", "Error", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result$Error;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result$Success;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Result {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ExecuteToolError#ADAPTER", declaredName = BreadcrumbHelper.Category.ERROR, tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result$Error;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolError;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolError;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolError;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends Result {
            private final ExecuteToolError value;

            public Error(ExecuteToolError executeToolError) {
                executeToolError.getClass();
                this.value = executeToolError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.value, ((Error) obj).value);
            }

            public final ExecuteToolError getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Error(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ExecuteToolSuccess#ADAPTER", declaredName = "success", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result$Success;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Result;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends Result {
            private final ExecuteToolSuccess value;

            public Success(ExecuteToolSuccess executeToolSuccess) {
                executeToolSuccess.getClass();
                this.value = executeToolSuccess;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.areEqual(this.value, ((Success) obj).value);
            }

            public final ExecuteToolSuccess getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Success(value=" + this.value + ")";
            }
        }
    }

    static {
        ExecuteToolResponse$Companion$ADAPTER$1 executeToolResponse$Companion$ADAPTER$1 = new ExecuteToolResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExecuteToolResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ExecuteToolResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/tool_endpoint_messages.proto");
        ADAPTER = executeToolResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(executeToolResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteToolResponse(Result result, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.result = result;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExecuteToolResponse)) {
            return false;
        }
        ExecuteToolResponse executeToolResponse = (ExecuteToolResponse) obj;
        return Intrinsics.areEqual(unknownFields(), executeToolResponse.unknownFields()) && Intrinsics.areEqual(this.result, executeToolResponse.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Result result = this.result;
        int hashCode2 = hashCode + (result != null ? result.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.result = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExecuteToolResponse{", "}", 0, null, null, 56);
    }
}
