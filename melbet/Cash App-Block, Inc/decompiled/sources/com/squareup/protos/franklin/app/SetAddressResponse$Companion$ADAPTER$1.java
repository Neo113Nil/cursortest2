package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.app.SetAddressResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SetAddressResponse((ResponseContext) obj, (SetAddressResponse.Status) obj2, (GlobalAddress) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = SetAddressResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 8) {
                obj3 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj3);
            } else if (nextTag != 10) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetAddressResponse setAddressResponse = (SetAddressResponse) obj;
        reverseProtoWriter.getClass();
        setAddressResponse.getClass();
        reverseProtoWriter.writeBytes(setAddressResponse.unknownFields());
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 8, setAddressResponse.postal_address);
        SetAddressResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setAddressResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 10, setAddressResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetAddressResponse setAddressResponse = (SetAddressResponse) obj;
        setAddressResponse.getClass();
        return GlobalAddress.ADAPTER.encodedSizeWithTag(8, setAddressResponse.postal_address) + SetAddressResponse.Status.ADAPTER.encodedSizeWithTag(1, setAddressResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(10, setAddressResponse.response_context) + setAddressResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetAddressResponse setAddressResponse = (SetAddressResponse) obj;
        setAddressResponse.getClass();
        ResponseContext responseContext = setAddressResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetAddressResponse.Status status = setAddressResponse.status;
        byteString.getClass();
        return new SetAddressResponse(responseContext2, status, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetAddressResponse setAddressResponse = (SetAddressResponse) obj;
        setAddressResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 10, setAddressResponse.response_context);
        SetAddressResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setAddressResponse.status);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 8, setAddressResponse.postal_address);
        protoWriter.writeBytes(setAddressResponse.unknownFields());
    }
}
