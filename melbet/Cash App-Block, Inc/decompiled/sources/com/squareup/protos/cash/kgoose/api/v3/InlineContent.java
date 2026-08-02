package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Builder;", "", "placeholder_key", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Content;", "content", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Content;", "Companion", "Builder", "Content", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InlineContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InlineContent> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Content content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String placeholder_key;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent;", "<init>", "()V", "placeholder_key", "", "content", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Content;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Content content;
        public String placeholder_key;

        @Override // com.squareup.wire.Message.Builder
        public InlineContent build() {
            return new InlineContent(this.placeholder_key, this.content, buildUnknownFields());
        }

        public final Builder content(Content content) {
            this.content = content;
            return this;
        }

        public final Builder placeholder_key(String placeholder_key) {
            this.placeholder_key = placeholder_key;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Content;", "", "EditableField", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Content$EditableField;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Content {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.EditableField#ADAPTER", declaredName = "editable_field", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Content$EditableField;", "Lcom/squareup/protos/cash/kgoose/api/v3/InlineContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/EditableField;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EditableField extends Content {
            private final com.squareup.protos.cash.kgoose.api.v3.EditableField value;

            public EditableField(com.squareup.protos.cash.kgoose.api.v3.EditableField editableField) {
                editableField.getClass();
                this.value = editableField;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EditableField) && Intrinsics.areEqual(this.value, ((EditableField) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.EditableField getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EditableField(value=" + this.value + ")";
            }
        }
    }

    static {
        InlineContent$Companion$ADAPTER$1 inlineContent$Companion$ADAPTER$1 = new InlineContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InlineContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.InlineContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = inlineContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inlineContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineContent(String str, Content content, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placeholder_key = str;
        this.content = content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InlineContent)) {
            return false;
        }
        InlineContent inlineContent = (InlineContent) obj;
        return Intrinsics.areEqual(unknownFields(), inlineContent.unknownFields()) && Intrinsics.areEqual(this.placeholder_key, inlineContent.placeholder_key) && Intrinsics.areEqual(this.content, inlineContent.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.placeholder_key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Content content = this.content;
        int hashCode3 = hashCode2 + (content != null ? content.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.placeholder_key = this.placeholder_key;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.placeholder_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "placeholder_key=", arrayList);
        }
        Content content = this.content;
        if (content != null) {
            arrayList.add("content=" + content);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InlineContent{", "}", 0, null, null, 56);
    }
}
