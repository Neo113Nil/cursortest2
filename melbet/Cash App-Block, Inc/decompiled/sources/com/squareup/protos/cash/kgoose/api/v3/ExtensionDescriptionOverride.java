package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionDescriptionOverride;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionDescriptionOverride$Builder;", "", "extension_name", "Ljava/lang/String;", "instruction", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolDescriptionOverride;", "tool_overrides", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionDescriptionOverride extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExtensionDescriptionOverride> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String extension_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String instruction;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ToolDescriptionOverride#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<ToolDescriptionOverride> tool_overrides;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionDescriptionOverride$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionDescriptionOverride;", "<init>", "()V", "extension_name", "", "instruction", "tool_overrides", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolDescriptionOverride;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String extension_name;
        public String instruction;
        public List<ToolDescriptionOverride> tool_overrides = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public ExtensionDescriptionOverride build() {
            return new ExtensionDescriptionOverride(this.extension_name, this.instruction, this.tool_overrides, buildUnknownFields());
        }

        public final Builder extension_name(String extension_name) {
            this.extension_name = extension_name;
            return this;
        }

        public final Builder instruction(String instruction) {
            this.instruction = instruction;
            return this;
        }

        public final Builder tool_overrides(List<ToolDescriptionOverride> tool_overrides) {
            tool_overrides.getClass();
            TransactorKt.checkElementsNotNull(tool_overrides);
            this.tool_overrides = tool_overrides;
            return this;
        }
    }

    static {
        ExtensionDescriptionOverride$Companion$ADAPTER$1 extensionDescriptionOverride$Companion$ADAPTER$1 = new ExtensionDescriptionOverride$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExtensionDescriptionOverride.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ExtensionDescriptionOverride", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/extension_messages.proto");
        ADAPTER = extensionDescriptionOverride$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(extensionDescriptionOverride$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionDescriptionOverride(String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.extension_name = str;
        this.instruction = str2;
        this.tool_overrides = TransactorKt.immutableCopyOf("tool_overrides", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtensionDescriptionOverride)) {
            return false;
        }
        ExtensionDescriptionOverride extensionDescriptionOverride = (ExtensionDescriptionOverride) obj;
        return Intrinsics.areEqual(unknownFields(), extensionDescriptionOverride.unknownFields()) && Intrinsics.areEqual(this.extension_name, extensionDescriptionOverride.extension_name) && Intrinsics.areEqual(this.instruction, extensionDescriptionOverride.instruction) && Intrinsics.areEqual(this.tool_overrides, extensionDescriptionOverride.tool_overrides);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.extension_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instruction;
        int hashCode3 = this.tool_overrides.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.extension_name = this.extension_name;
        builder.instruction = this.instruction;
        builder.tool_overrides = this.tool_overrides;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.extension_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "extension_name=", arrayList);
        }
        String str2 = this.instruction;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instruction=", arrayList);
        }
        if (!this.tool_overrides.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tool_overrides=", arrayList, this.tool_overrides);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExtensionDescriptionOverride{", "}", 0, null, null, 56);
    }
}
