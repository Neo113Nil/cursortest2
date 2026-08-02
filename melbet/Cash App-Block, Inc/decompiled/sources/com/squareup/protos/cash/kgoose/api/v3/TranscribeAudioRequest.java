package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TranscribeAudioRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TranscribeAudioRequest$Builder;", "Lokio/ByteString;", "audio_data", "Lokio/ByteString;", "", "mime_type", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TranscribeAudioRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TranscribeAudioRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 0, tag = 1)
    public final ByteString audio_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String mime_type;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TranscribeAudioRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TranscribeAudioRequest;", "<init>", "()V", "audio_data", "Lokio/ByteString;", "mime_type", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public ByteString audio_data;
        public String mime_type;

        public final Builder audio_data(ByteString audio_data) {
            this.audio_data = audio_data;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TranscribeAudioRequest build() {
            return new TranscribeAudioRequest(this.mime_type, this.audio_data, buildUnknownFields());
        }

        public final Builder mime_type(String mime_type) {
            this.mime_type = mime_type;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TranscribeAudioRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.TranscribeAudioRequest$Companion$ADAPTER$1
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
                        return new TranscribeAudioRequest((String) obj2, (ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                TranscribeAudioRequest transcribeAudioRequest = (TranscribeAudioRequest) obj;
                reverseProtoWriter.getClass();
                transcribeAudioRequest.getClass();
                reverseProtoWriter.writeBytes(transcribeAudioRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, transcribeAudioRequest.mime_type);
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, transcribeAudioRequest.audio_data);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                TranscribeAudioRequest transcribeAudioRequest = (TranscribeAudioRequest) obj;
                transcribeAudioRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, transcribeAudioRequest.mime_type) + ProtoAdapter.BYTES.encodedSizeWithTag(1, transcribeAudioRequest.audio_data) + transcribeAudioRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                TranscribeAudioRequest transcribeAudioRequest = (TranscribeAudioRequest) obj;
                transcribeAudioRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                ByteString byteString2 = transcribeAudioRequest.audio_data;
                String str = transcribeAudioRequest.mime_type;
                byteString.getClass();
                return new TranscribeAudioRequest(str, byteString2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                TranscribeAudioRequest transcribeAudioRequest = (TranscribeAudioRequest) obj;
                transcribeAudioRequest.getClass();
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, transcribeAudioRequest.audio_data);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, transcribeAudioRequest.mime_type);
                protoWriter.writeBytes(transcribeAudioRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranscribeAudioRequest(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.audio_data = byteString;
        this.mime_type = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TranscribeAudioRequest)) {
            return false;
        }
        TranscribeAudioRequest transcribeAudioRequest = (TranscribeAudioRequest) obj;
        return Intrinsics.areEqual(unknownFields(), transcribeAudioRequest.unknownFields()) && Intrinsics.areEqual(this.audio_data, transcribeAudioRequest.audio_data) && Intrinsics.areEqual(this.mime_type, transcribeAudioRequest.mime_type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.audio_data;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.mime_type;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.audio_data = this.audio_data;
        builder.mime_type = this.mime_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.audio_data;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("audio_data=", byteString, arrayList);
        }
        String str = this.mime_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "mime_type=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TranscribeAudioRequest{", "}", 0, null, null, 56);
    }
}
