package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetAppConfigRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAppConfigRequest> CREATOR;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetAppConfigRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.GetAppConfigRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetAppConfigRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    protoReader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetAppConfigRequest getAppConfigRequest = (GetAppConfigRequest) obj;
                reverseProtoWriter.getClass();
                getAppConfigRequest.getClass();
                reverseProtoWriter.writeBytes(getAppConfigRequest.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetAppConfigRequest getAppConfigRequest = (GetAppConfigRequest) obj;
                getAppConfigRequest.getClass();
                return getAppConfigRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((GetAppConfigRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetAppConfigRequest(byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetAppConfigRequest getAppConfigRequest = (GetAppConfigRequest) obj;
                getAppConfigRequest.getClass();
                protoWriter.writeBytes(getAppConfigRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppConfigRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetAppConfigRequest) && Intrinsics.areEqual(unknownFields(), ((GetAppConfigRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetProfileRequest.Builder builder = new GetProfileRequest.Builder(21);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "GetAppConfigRequest{}";
    }
}
