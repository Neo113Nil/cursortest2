package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptRequest$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "", "selected_prompt_id", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateInChatPromptRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateInChatPromptRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 0, tag = 1)
    public final OnBehalfOf on_behalf_of;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String selected_prompt_id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptRequest;", "<init>", "()V", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "selected_prompt_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public OnBehalfOf on_behalf_of;
        public String selected_prompt_id;

        @Override // com.squareup.wire.Message.Builder
        public UpdateInChatPromptRequest build() {
            return new UpdateInChatPromptRequest(this.on_behalf_of, this.selected_prompt_id, buildUnknownFields());
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }

        public final Builder selected_prompt_id(String selected_prompt_id) {
            this.selected_prompt_id = selected_prompt_id;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateInChatPromptRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.UpdateInChatPromptRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateInChatPromptRequest((OnBehalfOf) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateInChatPromptRequest updateInChatPromptRequest = (UpdateInChatPromptRequest) obj;
                reverseProtoWriter.getClass();
                updateInChatPromptRequest.getClass();
                reverseProtoWriter.writeBytes(updateInChatPromptRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, updateInChatPromptRequest.selected_prompt_id);
                OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateInChatPromptRequest.on_behalf_of);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateInChatPromptRequest updateInChatPromptRequest = (UpdateInChatPromptRequest) obj;
                updateInChatPromptRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, updateInChatPromptRequest.selected_prompt_id) + OnBehalfOf.ADAPTER.encodedSizeWithTag(1, updateInChatPromptRequest.on_behalf_of) + updateInChatPromptRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateInChatPromptRequest updateInChatPromptRequest = (UpdateInChatPromptRequest) obj;
                updateInChatPromptRequest.getClass();
                OnBehalfOf onBehalfOf = updateInChatPromptRequest.on_behalf_of;
                OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = updateInChatPromptRequest.selected_prompt_id;
                byteString.getClass();
                return new UpdateInChatPromptRequest(onBehalfOf2, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateInChatPromptRequest updateInChatPromptRequest = (UpdateInChatPromptRequest) obj;
                updateInChatPromptRequest.getClass();
                OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 1, updateInChatPromptRequest.on_behalf_of);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateInChatPromptRequest.selected_prompt_id);
                protoWriter.writeBytes(updateInChatPromptRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInChatPromptRequest(OnBehalfOf onBehalfOf, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.on_behalf_of = onBehalfOf;
        this.selected_prompt_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateInChatPromptRequest)) {
            return false;
        }
        UpdateInChatPromptRequest updateInChatPromptRequest = (UpdateInChatPromptRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateInChatPromptRequest.unknownFields()) && Intrinsics.areEqual(this.on_behalf_of, updateInChatPromptRequest.on_behalf_of) && Intrinsics.areEqual(this.selected_prompt_id, updateInChatPromptRequest.selected_prompt_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode2 = (hashCode + (onBehalfOf != null ? onBehalfOf.hashCode() : 0)) * 37;
        String str = this.selected_prompt_id;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.on_behalf_of = this.on_behalf_of;
        builder.selected_prompt_id = this.selected_prompt_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        String str = this.selected_prompt_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_prompt_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateInChatPromptRequest{", "}", 0, null, null, 56);
    }
}
