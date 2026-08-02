package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig$Builder;", "", "name", "Ljava/lang/String;", "instruction", "", "version", "Ljava/lang/Integer;", "", "auto_picked", "Ljava/lang/Boolean;", "parent_extension", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig;", "tools", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExtensionConfig> CREATOR;
    public static final boolean DEFAULT_AUTO_PICKED = true;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean auto_picked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String instruction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String parent_extension;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ToolConfig#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<ToolConfig> tools;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer version;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "<init>", "()V", "name", "", "instruction", "tools", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig;", "version", "", "Ljava/lang/Integer;", "auto_picked", "", "Ljava/lang/Boolean;", "parent_extension", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean auto_picked;
        public String instruction;
        public String name;
        public String parent_extension;
        public List<ToolConfig> tools = EmptyList.INSTANCE;
        public Integer version;

        public final Builder auto_picked(Boolean auto_picked) {
            this.auto_picked = auto_picked;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExtensionConfig build() {
            return new ExtensionConfig(this.name, this.instruction, this.tools, this.version, this.auto_picked, this.parent_extension, buildUnknownFields());
        }

        public final Builder instruction(String instruction) {
            this.instruction = instruction;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder parent_extension(String parent_extension) {
            this.parent_extension = parent_extension;
            return this;
        }

        public final Builder tools(List<ToolConfig> tools) {
            tools.getClass();
            TransactorKt.checkElementsNotNull(tools);
            this.tools = tools;
            return this;
        }

        public final Builder version(Integer version) {
            this.version = version;
            return this;
        }
    }

    static {
        ExtensionConfig$Companion$ADAPTER$1 extensionConfig$Companion$ADAPTER$1 = new ExtensionConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExtensionConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ExtensionConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/extension_messages.proto");
        ADAPTER = extensionConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(extensionConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionConfig(String str, String str2, List list, Integer num, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.name = str;
        this.instruction = str2;
        this.version = num;
        this.auto_picked = bool;
        this.parent_extension = str3;
        this.tools = TransactorKt.immutableCopyOf("tools", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtensionConfig)) {
            return false;
        }
        ExtensionConfig extensionConfig = (ExtensionConfig) obj;
        return Intrinsics.areEqual(unknownFields(), extensionConfig.unknownFields()) && Intrinsics.areEqual(this.name, extensionConfig.name) && Intrinsics.areEqual(this.instruction, extensionConfig.instruction) && Intrinsics.areEqual(this.tools, extensionConfig.tools) && Intrinsics.areEqual(this.version, extensionConfig.version) && Intrinsics.areEqual(this.auto_picked, extensionConfig.auto_picked) && Intrinsics.areEqual(this.parent_extension, extensionConfig.parent_extension);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instruction;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.tools);
        Integer num = this.version;
        int hashCode3 = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.auto_picked;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.parent_extension;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.instruction = this.instruction;
        builder.tools = this.tools;
        builder.version = this.version;
        builder.auto_picked = this.auto_picked;
        builder.parent_extension = this.parent_extension;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.instruction;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instruction=", arrayList);
        }
        if (!this.tools.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tools=", arrayList, this.tools);
        }
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        Boolean bool = this.auto_picked;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("auto_picked=", bool, arrayList);
        }
        String str3 = this.parent_extension;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "parent_extension=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExtensionConfig{", "}", 0, null, null, 56);
    }
}
