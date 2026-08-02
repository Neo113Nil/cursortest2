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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIRequest$Builder;", "", "user_prompt", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "session_id", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "model", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraftUIRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DraftUIRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ChatContext#ADAPTER", schemaIndex = 1, tag = 2)
    public final ChatContext chat_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Model#ADAPTER", schemaIndex = 4, tag = 5)
    public final Model model;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 2, tag = 3)
    public final OnBehalfOf on_behalf_of;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String user_prompt;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIRequest;", "<init>", "()V", "user_prompt", "", "chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "session_id", "model", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public ChatContext chat_context;
        public Model model;
        public OnBehalfOf on_behalf_of;
        public String session_id;
        public String user_prompt;

        @Override // com.squareup.wire.Message.Builder
        public DraftUIRequest build() {
            return new DraftUIRequest(this.user_prompt, this.chat_context, this.on_behalf_of, this.session_id, this.model, buildUnknownFields());
        }

        public final Builder chat_context(ChatContext chat_context) {
            this.chat_context = chat_context;
            return this;
        }

        public final Builder model(Model model) {
            this.model = model;
            return this;
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }

        public final Builder user_prompt(String user_prompt) {
            this.user_prompt = user_prompt;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DraftUIRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.DraftUIRequest$Companion$ADAPTER$1
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
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new DraftUIRequest((String) obj, (ChatContext) obj2, (OnBehalfOf) obj3, (String) obj4, (Model) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(ChatContext.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj3);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = TransactorKt.decodeMessageOrMerge(Model.ADAPTER, protoReader, obj5);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                DraftUIRequest draftUIRequest = (DraftUIRequest) obj;
                reverseProtoWriter.getClass();
                draftUIRequest.getClass();
                reverseProtoWriter.writeBytes(draftUIRequest.unknownFields());
                Model.ADAPTER.encodeWithTag(reverseProtoWriter, 5, draftUIRequest.model);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, draftUIRequest.session_id);
                OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 3, draftUIRequest.on_behalf_of);
                ChatContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, draftUIRequest.chat_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, draftUIRequest.user_prompt);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DraftUIRequest draftUIRequest = (DraftUIRequest) obj;
                draftUIRequest.getClass();
                int size$okio = draftUIRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Model.ADAPTER.encodedSizeWithTag(5, draftUIRequest.model) + protoAdapter2.encodedSizeWithTag(4, draftUIRequest.session_id) + OnBehalfOf.ADAPTER.encodedSizeWithTag(3, draftUIRequest.on_behalf_of) + ChatContext.ADAPTER.encodedSizeWithTag(2, draftUIRequest.chat_context) + protoAdapter2.encodedSizeWithTag(1, draftUIRequest.user_prompt) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DraftUIRequest draftUIRequest = (DraftUIRequest) obj;
                draftUIRequest.getClass();
                ChatContext chatContext = draftUIRequest.chat_context;
                ChatContext chatContext2 = chatContext != null ? (ChatContext) ChatContext.ADAPTER.redact(chatContext) : null;
                OnBehalfOf onBehalfOf = draftUIRequest.on_behalf_of;
                OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
                Model model = draftUIRequest.model;
                Model model2 = model != null ? (Model) Model.ADAPTER.redact(model) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = draftUIRequest.user_prompt;
                String str2 = draftUIRequest.session_id;
                byteString.getClass();
                return new DraftUIRequest(str, chatContext2, onBehalfOf2, str2, model2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DraftUIRequest draftUIRequest = (DraftUIRequest) obj;
                draftUIRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, draftUIRequest.user_prompt);
                ChatContext.ADAPTER.encodeWithTag(protoWriter, 2, draftUIRequest.chat_context);
                OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 3, draftUIRequest.on_behalf_of);
                protoAdapter2.encodeWithTag(protoWriter, 4, draftUIRequest.session_id);
                Model.ADAPTER.encodeWithTag(protoWriter, 5, draftUIRequest.model);
                protoWriter.writeBytes(draftUIRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftUIRequest(String str, ChatContext chatContext, OnBehalfOf onBehalfOf, String str2, Model model, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.user_prompt = str;
        this.chat_context = chatContext;
        this.on_behalf_of = onBehalfOf;
        this.session_id = str2;
        this.model = model;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DraftUIRequest)) {
            return false;
        }
        DraftUIRequest draftUIRequest = (DraftUIRequest) obj;
        return Intrinsics.areEqual(unknownFields(), draftUIRequest.unknownFields()) && Intrinsics.areEqual(this.user_prompt, draftUIRequest.user_prompt) && Intrinsics.areEqual(this.chat_context, draftUIRequest.chat_context) && Intrinsics.areEqual(this.on_behalf_of, draftUIRequest.on_behalf_of) && Intrinsics.areEqual(this.session_id, draftUIRequest.session_id) && Intrinsics.areEqual(this.model, draftUIRequest.model);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.user_prompt;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ChatContext chatContext = this.chat_context;
        int hashCode3 = (hashCode2 + (chatContext != null ? chatContext.hashCode() : 0)) * 37;
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode4 = (hashCode3 + (onBehalfOf != null ? onBehalfOf.hashCode() : 0)) * 37;
        String str2 = this.session_id;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Model model = this.model;
        int hashCode6 = hashCode5 + (model != null ? model.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.user_prompt = this.user_prompt;
        builder.chat_context = this.chat_context;
        builder.on_behalf_of = this.on_behalf_of;
        builder.session_id = this.session_id;
        builder.model = this.model;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.user_prompt;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "user_prompt=", arrayList);
        }
        ChatContext chatContext = this.chat_context;
        if (chatContext != null) {
            arrayList.add("chat_context=" + chatContext);
        }
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        String str2 = this.session_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "session_id=", arrayList);
        }
        Model model = this.model;
        if (model != null) {
            arrayList.add("model=" + model);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DraftUIRequest{", "}", 0, null, null, 56);
    }
}
