package com.squareup.protos.cash.blockstable.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashapproxy.api.Divider;
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
public final class GetDepositAddressRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDepositAddressRequest> CREATOR;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetDepositAddressRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blockstable.api.v1.GetDepositAddressRequest$Companion$ADAPTER$1
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
                        return new GetDepositAddressRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    protoReader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetDepositAddressRequest getDepositAddressRequest = (GetDepositAddressRequest) obj;
                reverseProtoWriter.getClass();
                getDepositAddressRequest.getClass();
                reverseProtoWriter.writeBytes(getDepositAddressRequest.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetDepositAddressRequest getDepositAddressRequest = (GetDepositAddressRequest) obj;
                getDepositAddressRequest.getClass();
                return getDepositAddressRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((GetDepositAddressRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetDepositAddressRequest(byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetDepositAddressRequest getDepositAddressRequest = (GetDepositAddressRequest) obj;
                getDepositAddressRequest.getClass();
                protoWriter.writeBytes(getDepositAddressRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDepositAddressRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetDepositAddressRequest) && Intrinsics.areEqual(unknownFields(), ((GetDepositAddressRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Divider.Builder builder = new Divider.Builder(20);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "GetDepositAddressRequest{}";
    }
}
