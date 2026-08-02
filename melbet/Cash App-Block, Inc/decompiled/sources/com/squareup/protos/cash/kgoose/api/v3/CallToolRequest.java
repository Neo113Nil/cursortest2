package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CallToolRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CallToolRequest$Builder;", "", "extension_name", "Ljava/lang/String;", "tool_name", "arguments_json", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "source", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "", "headers", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallToolRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CallToolRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String arguments_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String extension_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final Map<String, String> headers;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Source#ADAPTER", schemaIndex = 4, tag = 5)
    public final Source source;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Tenancy#ADAPTER", schemaIndex = 5, tag = 6)
    public final Tenancy tenancy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String tool_name;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CallToolRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CallToolRequest;", "<init>", "()V", "extension_name", "", "tool_name", "arguments_json", "headers", "", "source", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String arguments_json;
        public String extension_name;
        public Map<String, String> headers;
        public Source source;
        public Tenancy tenancy;
        public String tool_name;

        public Builder() {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.headers = emptyMap;
        }

        public final Builder arguments_json(String arguments_json) {
            this.arguments_json = arguments_json;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CallToolRequest build() {
            return new CallToolRequest(this.extension_name, this.tool_name, this.arguments_json, this.headers, this.source, this.tenancy, buildUnknownFields());
        }

        public final Builder extension_name(String extension_name) {
            this.extension_name = extension_name;
            return this;
        }

        public final Builder headers(Map<String, String> headers) {
            headers.getClass();
            this.headers = headers;
            return this;
        }

        public final Builder source(Source source) {
            this.source = source;
            return this;
        }

        public final Builder tenancy(Tenancy tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        public final Builder tool_name(String tool_name) {
            this.tool_name = tool_name;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CallToolRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        CallToolRequest$Companion$ADAPTER$1 callToolRequest$Companion$ADAPTER$1 = new CallToolRequest$Companion$ADAPTER$1(orCreateKotlinClass);
        ADAPTER = callToolRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(callToolRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallToolRequest(String str, String str2, String str3, Map map, Source source, Tenancy tenancy, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.extension_name = str;
        this.tool_name = str2;
        this.arguments_json = str3;
        this.source = source;
        this.tenancy = tenancy;
        this.headers = TransactorKt.immutableCopyOf("headers", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CallToolRequest)) {
            return false;
        }
        CallToolRequest callToolRequest = (CallToolRequest) obj;
        return Intrinsics.areEqual(unknownFields(), callToolRequest.unknownFields()) && Intrinsics.areEqual(this.extension_name, callToolRequest.extension_name) && Intrinsics.areEqual(this.tool_name, callToolRequest.tool_name) && Intrinsics.areEqual(this.arguments_json, callToolRequest.arguments_json) && Intrinsics.areEqual(this.headers, callToolRequest.headers) && this.source == callToolRequest.source && this.tenancy == callToolRequest.tenancy;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.extension_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.tool_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.arguments_json;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, this.headers, 37);
        Source source = this.source;
        int hashCode4 = (m + (source != null ? source.hashCode() : 0)) * 37;
        Tenancy tenancy = this.tenancy;
        int hashCode5 = hashCode4 + (tenancy != null ? tenancy.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.extension_name = this.extension_name;
        builder.tool_name = this.tool_name;
        builder.arguments_json = this.arguments_json;
        builder.headers = this.headers;
        builder.source = this.source;
        builder.tenancy = this.tenancy;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.extension_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "extension_name=", arrayList);
        }
        String str2 = this.tool_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "tool_name=", arrayList);
        }
        String str3 = this.arguments_json;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "arguments_json=", arrayList);
        }
        if (!this.headers.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("headers=", this.headers, arrayList);
        }
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        Tenancy tenancy = this.tenancy;
        if (tenancy != null) {
            arrayList.add("tenancy=" + tenancy);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CallToolRequest{", "}", 0, null, null, 56);
    }
}
