package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Builder;", "", "id", "Ljava/lang/String;", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result;", "result", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result;", "tooltip", "tooltip_category", "Companion", "Builder", "Result", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToolRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ToolRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireSealedOneof(schemaIndex = 2)
    public final Result result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 5)
    public final String tooltip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 6)
    public final String tooltip_category;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest;", "<init>", "()V", "id", "", "status", "result", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result;", "tooltip", "tooltip_category", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String id;
        public Result result;
        public String status;
        public String tooltip;
        public String tooltip_category;

        @Override // com.squareup.wire.Message.Builder
        public ToolRequest build() {
            return new ToolRequest(this.id, this.status, this.result, this.tooltip, this.tooltip_category, buildUnknownFields());
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder result(Result result) {
            this.result = result;
            return this;
        }

        public final Builder status(String status) {
            this.status = status;
            return this;
        }

        public final Builder tooltip(String tooltip) {
            this.tooltip = tooltip;
            return this;
        }

        public final Builder tooltip_category(String tooltip_category) {
            this.tooltip_category = tooltip_category;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result;", "", "Value", "Error", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result$Error;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result$Value;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Result {

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = BreadcrumbHelper.Category.ERROR, tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result$Error;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result;", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends Result {
            private final String value;

            public Error(String str) {
                str.getClass();
                this.value = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.value, ((Error) obj).value);
            }

            public final String getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(value=", this.value, ")");
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ToolCall#ADAPTER", declaredName = "value", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result$Value;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest$Result;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolCall;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolCall;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ToolCall;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Value extends Result {
            private final ToolCall value;

            public Value(ToolCall toolCall) {
                toolCall.getClass();
                this.value = toolCall;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Value) && Intrinsics.areEqual(this.value, ((Value) obj).value);
            }

            public final ToolCall getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Value(value=" + this.value + ")";
            }
        }
    }

    static {
        ToolRequest$Companion$ADAPTER$1 toolRequest$Companion$ADAPTER$1 = new ToolRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ToolRequest.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ToolRequest", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = toolRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(toolRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolRequest(String str, String str2, Result result, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.status = str2;
        this.result = result;
        this.tooltip = str3;
        this.tooltip_category = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ToolRequest)) {
            return false;
        }
        ToolRequest toolRequest = (ToolRequest) obj;
        return Intrinsics.areEqual(unknownFields(), toolRequest.unknownFields()) && Intrinsics.areEqual(this.id, toolRequest.id) && Intrinsics.areEqual(this.status, toolRequest.status) && Intrinsics.areEqual(this.result, toolRequest.result) && Intrinsics.areEqual(this.tooltip, toolRequest.tooltip) && Intrinsics.areEqual(this.tooltip_category, toolRequest.tooltip_category);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.status;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Result result = this.result;
        int hashCode4 = (hashCode3 + (result != null ? result.hashCode() : 0)) * 37;
        String str3 = this.tooltip;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.tooltip_category;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.status = this.status;
        builder.result = this.result;
        builder.tooltip = this.tooltip;
        builder.tooltip_category = this.tooltip_category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.status;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "status=", arrayList);
        }
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        if (this.tooltip != null) {
            arrayList.add("tooltip=██");
        }
        if (this.tooltip_category != null) {
            arrayList.add("tooltip_category=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ToolRequest{", "}", 0, null, null, 56);
    }
}
