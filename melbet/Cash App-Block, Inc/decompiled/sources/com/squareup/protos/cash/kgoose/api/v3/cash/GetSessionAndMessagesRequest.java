package com.squareup.protos.cash.kgoose.api.v3.cash;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesRequest$Builder;", "", "session_id", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetSessionAndMessagesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSessionAndMessagesRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String session_id;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesRequest;", "<init>", "()V", "session_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String session_id;

        @Override // com.squareup.wire.Message.Builder
        public GetSessionAndMessagesRequest build() {
            return new GetSessionAndMessagesRequest(this.session_id, buildUnknownFields());
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetSessionAndMessagesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.cash.GetSessionAndMessagesRequest$Companion$ADAPTER$1
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
                        return new GetSessionAndMessagesRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetSessionAndMessagesRequest getSessionAndMessagesRequest = (GetSessionAndMessagesRequest) obj;
                reverseProtoWriter.getClass();
                getSessionAndMessagesRequest.getClass();
                reverseProtoWriter.writeBytes(getSessionAndMessagesRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getSessionAndMessagesRequest.session_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetSessionAndMessagesRequest getSessionAndMessagesRequest = (GetSessionAndMessagesRequest) obj;
                getSessionAndMessagesRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getSessionAndMessagesRequest.session_id) + getSessionAndMessagesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetSessionAndMessagesRequest getSessionAndMessagesRequest = (GetSessionAndMessagesRequest) obj;
                getSessionAndMessagesRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getSessionAndMessagesRequest.session_id;
                byteString.getClass();
                return new GetSessionAndMessagesRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetSessionAndMessagesRequest getSessionAndMessagesRequest = (GetSessionAndMessagesRequest) obj;
                getSessionAndMessagesRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSessionAndMessagesRequest.session_id);
                protoWriter.writeBytes(getSessionAndMessagesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSessionAndMessagesRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.session_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSessionAndMessagesRequest)) {
            return false;
        }
        GetSessionAndMessagesRequest getSessionAndMessagesRequest = (GetSessionAndMessagesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getSessionAndMessagesRequest.unknownFields()) && Intrinsics.areEqual(this.session_id, getSessionAndMessagesRequest.session_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.session_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.session_id = this.session_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "session_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSessionAndMessagesRequest{", "}", 0, null, null, 56);
    }
}
