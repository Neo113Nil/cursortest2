package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ListSkillsRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListSkillsRequest$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListSkillsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListSkillsRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 0, tag = 1)
    public final OnBehalfOf on_behalf_of;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ListSkillsRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListSkillsRequest;", "<init>", "()V", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public OnBehalfOf on_behalf_of;

        @Override // com.squareup.wire.Message.Builder
        public ListSkillsRequest build() {
            return new ListSkillsRequest(this.on_behalf_of, buildUnknownFields());
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListSkillsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.ListSkillsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ListSkillsRequest((OnBehalfOf) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ListSkillsRequest listSkillsRequest = (ListSkillsRequest) obj;
                reverseProtoWriter.getClass();
                listSkillsRequest.getClass();
                reverseProtoWriter.writeBytes(listSkillsRequest.unknownFields());
                OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 1, listSkillsRequest.on_behalf_of);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ListSkillsRequest listSkillsRequest = (ListSkillsRequest) obj;
                listSkillsRequest.getClass();
                return OnBehalfOf.ADAPTER.encodedSizeWithTag(1, listSkillsRequest.on_behalf_of) + listSkillsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ListSkillsRequest listSkillsRequest = (ListSkillsRequest) obj;
                listSkillsRequest.getClass();
                OnBehalfOf onBehalfOf = listSkillsRequest.on_behalf_of;
                OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ListSkillsRequest(onBehalfOf2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ListSkillsRequest listSkillsRequest = (ListSkillsRequest) obj;
                listSkillsRequest.getClass();
                OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 1, listSkillsRequest.on_behalf_of);
                protoWriter.writeBytes(listSkillsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSkillsRequest(OnBehalfOf onBehalfOf, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.on_behalf_of = onBehalfOf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListSkillsRequest)) {
            return false;
        }
        ListSkillsRequest listSkillsRequest = (ListSkillsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), listSkillsRequest.unknownFields()) && Intrinsics.areEqual(this.on_behalf_of, listSkillsRequest.on_behalf_of);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode2 = hashCode + (onBehalfOf != null ? onBehalfOf.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.on_behalf_of = this.on_behalf_of;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListSkillsRequest{", "}", 0, null, null, 56);
    }
}
