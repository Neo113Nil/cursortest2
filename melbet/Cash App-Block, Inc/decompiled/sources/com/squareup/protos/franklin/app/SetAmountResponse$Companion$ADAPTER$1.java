package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetAmountResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetAmountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetAmountResponse((ResponseContext) obj, (SetAmountResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SetAmountResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetAmountResponse setAmountResponse = (SetAmountResponse) obj;
        reverseProtoWriter.getClass();
        setAmountResponse.getClass();
        reverseProtoWriter.writeBytes(setAmountResponse.unknownFields());
        SetAmountResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setAmountResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setAmountResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetAmountResponse setAmountResponse = (SetAmountResponse) obj;
        setAmountResponse.getClass();
        return SetAmountResponse.Status.ADAPTER.encodedSizeWithTag(2, setAmountResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, setAmountResponse.response_context) + setAmountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetAmountResponse setAmountResponse = (SetAmountResponse) obj;
        setAmountResponse.getClass();
        ResponseContext responseContext = setAmountResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetAmountResponse.Status status = setAmountResponse.status;
        byteString.getClass();
        return new SetAmountResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetAmountResponse setAmountResponse = (SetAmountResponse) obj;
        setAmountResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setAmountResponse.response_context);
        SetAmountResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, setAmountResponse.status);
        protoWriter.writeBytes(setAmountResponse.unknownFields());
    }
}
