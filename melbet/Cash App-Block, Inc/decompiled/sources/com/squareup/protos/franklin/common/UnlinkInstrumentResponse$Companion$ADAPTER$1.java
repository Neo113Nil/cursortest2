package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.UnlinkInstrumentResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UnlinkInstrumentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UnlinkInstrumentResponse((ResponseContext) obj, (String) obj2, (UnlinkInstrumentResponse.Status) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = UnlinkInstrumentResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnlinkInstrumentResponse unlinkInstrumentResponse = (UnlinkInstrumentResponse) obj;
        reverseProtoWriter.getClass();
        unlinkInstrumentResponse.getClass();
        reverseProtoWriter.writeBytes(unlinkInstrumentResponse.unknownFields());
        UnlinkInstrumentResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 3, unlinkInstrumentResponse.status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, unlinkInstrumentResponse.verification_instrument_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, unlinkInstrumentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UnlinkInstrumentResponse unlinkInstrumentResponse = (UnlinkInstrumentResponse) obj;
        unlinkInstrumentResponse.getClass();
        return UnlinkInstrumentResponse.Status.ADAPTER.encodedSizeWithTag(3, unlinkInstrumentResponse.status) + ProtoAdapter.STRING.encodedSizeWithTag(1, unlinkInstrumentResponse.verification_instrument_token) + ResponseContext.ADAPTER.encodedSizeWithTag(2, unlinkInstrumentResponse.response_context) + unlinkInstrumentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UnlinkInstrumentResponse unlinkInstrumentResponse = (UnlinkInstrumentResponse) obj;
        unlinkInstrumentResponse.getClass();
        ResponseContext responseContext = unlinkInstrumentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = unlinkInstrumentResponse.verification_instrument_token;
        UnlinkInstrumentResponse.Status status = unlinkInstrumentResponse.status;
        byteString.getClass();
        return new UnlinkInstrumentResponse(responseContext2, str, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnlinkInstrumentResponse unlinkInstrumentResponse = (UnlinkInstrumentResponse) obj;
        unlinkInstrumentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, unlinkInstrumentResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, unlinkInstrumentResponse.verification_instrument_token);
        UnlinkInstrumentResponse.Status.ADAPTER.encodeWithTag(protoWriter, 3, unlinkInstrumentResponse.status);
        protoWriter.writeBytes(unlinkInstrumentResponse.unknownFields());
    }
}
