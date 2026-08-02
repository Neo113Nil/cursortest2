package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig$Builder;", "", "client_key", "Ljava/lang/String;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/McpKeyDescriptor;", "mcp_key_descriptor", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class McpDecryptionConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<McpDecryptionConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 3)
    public final String client_key;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.McpKeyDescriptor#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<McpKeyDescriptor> mcp_key_descriptor;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig;", "<init>", "()V", "mcp_key_descriptor", "", "Lcom/squareup/protos/cash/kgoose/api/v3/McpKeyDescriptor;", "client_key", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String client_key;
        public List<McpKeyDescriptor> mcp_key_descriptor = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public McpDecryptionConfig build() {
            return new McpDecryptionConfig(this.mcp_key_descriptor, this.client_key, buildUnknownFields());
        }

        public final Builder client_key(String client_key) {
            this.client_key = client_key;
            return this;
        }

        public final Builder mcp_key_descriptor(List<McpKeyDescriptor> mcp_key_descriptor) {
            mcp_key_descriptor.getClass();
            TransactorKt.checkElementsNotNull(mcp_key_descriptor);
            this.mcp_key_descriptor = mcp_key_descriptor;
            return this;
        }
    }

    static {
        McpDecryptionConfig$Companion$ADAPTER$1 mcpDecryptionConfig$Companion$ADAPTER$1 = new McpDecryptionConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(McpDecryptionConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.McpDecryptionConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = mcpDecryptionConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(mcpDecryptionConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpDecryptionConfig(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.client_key = str;
        this.mcp_key_descriptor = TransactorKt.immutableCopyOf("mcp_key_descriptor", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof McpDecryptionConfig)) {
            return false;
        }
        McpDecryptionConfig mcpDecryptionConfig = (McpDecryptionConfig) obj;
        return Intrinsics.areEqual(unknownFields(), mcpDecryptionConfig.unknownFields()) && Intrinsics.areEqual(this.mcp_key_descriptor, mcpDecryptionConfig.mcp_key_descriptor) && Intrinsics.areEqual(this.client_key, mcpDecryptionConfig.client_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.mcp_key_descriptor);
        String str = this.client_key;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.mcp_key_descriptor = this.mcp_key_descriptor;
        builder.client_key = this.client_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.mcp_key_descriptor.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("mcp_key_descriptor=", arrayList, this.mcp_key_descriptor);
        }
        if (this.client_key != null) {
            arrayList.add("client_key=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "McpDecryptionConfig{", "}", 0, null, null, 56);
    }
}
