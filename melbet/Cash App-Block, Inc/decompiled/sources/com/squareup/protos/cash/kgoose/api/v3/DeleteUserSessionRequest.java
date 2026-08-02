package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionRequest$Builder;", "", "session_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "", "ttl_days", "Ljava/lang/Integer;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeleteUserSessionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeleteUserSessionRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 1, tag = 2)
    public final OnBehalfOf on_behalf_of;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    public final Integer ttl_days;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionRequest;", "<init>", "()V", "session_id", "", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "ttl_days", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public OnBehalfOf on_behalf_of;
        public String session_id;
        public Integer ttl_days;

        @Override // com.squareup.wire.Message.Builder
        public DeleteUserSessionRequest build() {
            return new DeleteUserSessionRequest(this.session_id, this.on_behalf_of, this.ttl_days, buildUnknownFields());
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }

        public final Builder ttl_days(Integer ttl_days) {
            this.ttl_days = ttl_days;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DeleteUserSessionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.DeleteUserSessionRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new DeleteUserSessionRequest((String) obj, (OnBehalfOf) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                DeleteUserSessionRequest deleteUserSessionRequest = (DeleteUserSessionRequest) obj;
                reverseProtoWriter.getClass();
                deleteUserSessionRequest.getClass();
                reverseProtoWriter.writeBytes(deleteUserSessionRequest.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, deleteUserSessionRequest.ttl_days);
                OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 2, deleteUserSessionRequest.on_behalf_of);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, deleteUserSessionRequest.session_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DeleteUserSessionRequest deleteUserSessionRequest = (DeleteUserSessionRequest) obj;
                deleteUserSessionRequest.getClass();
                return ProtoAdapter.INT32.encodedSizeWithTag(3, deleteUserSessionRequest.ttl_days) + OnBehalfOf.ADAPTER.encodedSizeWithTag(2, deleteUserSessionRequest.on_behalf_of) + ProtoAdapter.STRING.encodedSizeWithTag(1, deleteUserSessionRequest.session_id) + deleteUserSessionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DeleteUserSessionRequest deleteUserSessionRequest = (DeleteUserSessionRequest) obj;
                deleteUserSessionRequest.getClass();
                OnBehalfOf onBehalfOf = deleteUserSessionRequest.on_behalf_of;
                OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = deleteUserSessionRequest.session_id;
                Integer num = deleteUserSessionRequest.ttl_days;
                byteString.getClass();
                return new DeleteUserSessionRequest(str, onBehalfOf2, num, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DeleteUserSessionRequest deleteUserSessionRequest = (DeleteUserSessionRequest) obj;
                deleteUserSessionRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteUserSessionRequest.session_id);
                OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 2, deleteUserSessionRequest.on_behalf_of);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, deleteUserSessionRequest.ttl_days);
                protoWriter.writeBytes(deleteUserSessionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteUserSessionRequest(String str, OnBehalfOf onBehalfOf, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.session_id = str;
        this.on_behalf_of = onBehalfOf;
        this.ttl_days = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteUserSessionRequest)) {
            return false;
        }
        DeleteUserSessionRequest deleteUserSessionRequest = (DeleteUserSessionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), deleteUserSessionRequest.unknownFields()) && Intrinsics.areEqual(this.session_id, deleteUserSessionRequest.session_id) && Intrinsics.areEqual(this.on_behalf_of, deleteUserSessionRequest.on_behalf_of) && Intrinsics.areEqual(this.ttl_days, deleteUserSessionRequest.ttl_days);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.session_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode3 = (hashCode2 + (onBehalfOf != null ? onBehalfOf.hashCode() : 0)) * 37;
        Integer num = this.ttl_days;
        int hashCode4 = hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.session_id = this.session_id;
        builder.on_behalf_of = this.on_behalf_of;
        builder.ttl_days = this.ttl_days;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "session_id=", arrayList);
        }
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        Integer num = this.ttl_days;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("ttl_days=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeleteUserSessionRequest{", "}", 0, null, null, 56);
    }
}
