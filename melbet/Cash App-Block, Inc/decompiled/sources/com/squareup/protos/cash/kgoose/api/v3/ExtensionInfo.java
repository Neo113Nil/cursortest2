package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionInfo$Builder;", "", "name", "Ljava/lang/String;", "description", "", "tool_count", "Ljava/lang/Integer;", "", "any_tool_requires_user_auth", "Ljava/lang/Boolean;", "auth_satisfied_for_caller", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExtensionInfo> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 6)
    public final Boolean any_tool_requires_user_auth;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 7)
    public final Boolean auth_satisfied_for_caller;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 5)
    public final Integer tool_count;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionInfo;", "<init>", "()V", "name", "", "description", "tool_count", "", "Ljava/lang/Integer;", "any_tool_requires_user_auth", "", "Ljava/lang/Boolean;", "auth_satisfied_for_caller", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionInfo$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionInfo$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean any_tool_requires_user_auth;
        public Boolean auth_satisfied_for_caller;
        public String description;
        public String name;
        public Integer tool_count;

        public final Builder any_tool_requires_user_auth(Boolean any_tool_requires_user_auth) {
            this.any_tool_requires_user_auth = any_tool_requires_user_auth;
            return this;
        }

        public final Builder auth_satisfied_for_caller(Boolean auth_satisfied_for_caller) {
            this.auth_satisfied_for_caller = auth_satisfied_for_caller;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExtensionInfo build() {
            return new ExtensionInfo(this.name, this.description, this.tool_count, this.any_tool_requires_user_auth, this.auth_satisfied_for_caller, buildUnknownFields());
        }

        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder tool_count(Integer tool_count) {
            this.tool_count = tool_count;
            return this;
        }
    }

    static {
        ExtensionInfo$Companion$ADAPTER$1 extensionInfo$Companion$ADAPTER$1 = new ExtensionInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExtensionInfo.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ExtensionInfo", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/tool_endpoint_messages.proto");
        ADAPTER = extensionInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(extensionInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionInfo(String str, String str2, Integer num, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.description = str2;
        this.tool_count = num;
        this.any_tool_requires_user_auth = bool;
        this.auth_satisfied_for_caller = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtensionInfo)) {
            return false;
        }
        ExtensionInfo extensionInfo = (ExtensionInfo) obj;
        return Intrinsics.areEqual(unknownFields(), extensionInfo.unknownFields()) && Intrinsics.areEqual(this.name, extensionInfo.name) && Intrinsics.areEqual(this.description, extensionInfo.description) && Intrinsics.areEqual(this.tool_count, extensionInfo.tool_count) && Intrinsics.areEqual(this.any_tool_requires_user_auth, extensionInfo.any_tool_requires_user_auth) && Intrinsics.areEqual(this.auth_satisfied_for_caller, extensionInfo.auth_satisfied_for_caller);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.tool_count;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.any_tool_requires_user_auth;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.auth_satisfied_for_caller;
        int hashCode6 = hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.description = this.description;
        builder.tool_count = this.tool_count;
        builder.any_tool_requires_user_auth = this.any_tool_requires_user_auth;
        builder.auth_satisfied_for_caller = this.auth_satisfied_for_caller;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        Integer num = this.tool_count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("tool_count=", num, arrayList);
        }
        Boolean bool = this.any_tool_requires_user_auth;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("any_tool_requires_user_auth=", bool, arrayList);
        }
        Boolean bool2 = this.auth_satisfied_for_caller;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("auth_satisfied_for_caller=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExtensionInfo{", "}", 0, null, null, 56);
    }
}
