package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetCountryResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetCountryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetCountryResponse((ResponseContext) obj, (SetCountryResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SetCountryResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetCountryResponse setCountryResponse = (SetCountryResponse) obj;
        reverseProtoWriter.getClass();
        setCountryResponse.getClass();
        reverseProtoWriter.writeBytes(setCountryResponse.unknownFields());
        SetCountryResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setCountryResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setCountryResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetCountryResponse setCountryResponse = (SetCountryResponse) obj;
        setCountryResponse.getClass();
        return SetCountryResponse.Status.ADAPTER.encodedSizeWithTag(2, setCountryResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, setCountryResponse.response_context) + setCountryResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetCountryResponse setCountryResponse = (SetCountryResponse) obj;
        setCountryResponse.getClass();
        ResponseContext responseContext = setCountryResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetCountryResponse.Status status = setCountryResponse.status;
        byteString.getClass();
        return new SetCountryResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetCountryResponse setCountryResponse = (SetCountryResponse) obj;
        setCountryResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setCountryResponse.response_context);
        SetCountryResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, setCountryResponse.status);
        protoWriter.writeBytes(setCountryResponse.unknownFields());
    }
}
