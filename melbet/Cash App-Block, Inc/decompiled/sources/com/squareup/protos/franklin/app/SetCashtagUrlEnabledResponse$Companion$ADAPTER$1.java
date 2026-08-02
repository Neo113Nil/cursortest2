package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetCashtagUrlEnabledResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetCashtagUrlEnabledResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetCashtagUrlEnabledResponse((SetCashtagUrlEnabledResponse.Status) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SetCashtagUrlEnabledResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetCashtagUrlEnabledResponse setCashtagUrlEnabledResponse = (SetCashtagUrlEnabledResponse) obj;
        reverseProtoWriter.getClass();
        setCashtagUrlEnabledResponse.getClass();
        reverseProtoWriter.writeBytes(setCashtagUrlEnabledResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setCashtagUrlEnabledResponse.response_context);
        SetCashtagUrlEnabledResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setCashtagUrlEnabledResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetCashtagUrlEnabledResponse setCashtagUrlEnabledResponse = (SetCashtagUrlEnabledResponse) obj;
        setCashtagUrlEnabledResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, setCashtagUrlEnabledResponse.response_context) + SetCashtagUrlEnabledResponse.Status.ADAPTER.encodedSizeWithTag(1, setCashtagUrlEnabledResponse.status) + setCashtagUrlEnabledResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetCashtagUrlEnabledResponse setCashtagUrlEnabledResponse = (SetCashtagUrlEnabledResponse) obj;
        setCashtagUrlEnabledResponse.getClass();
        ResponseContext responseContext = setCashtagUrlEnabledResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetCashtagUrlEnabledResponse.Status status = setCashtagUrlEnabledResponse.status;
        byteString.getClass();
        return new SetCashtagUrlEnabledResponse(status, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetCashtagUrlEnabledResponse setCashtagUrlEnabledResponse = (SetCashtagUrlEnabledResponse) obj;
        setCashtagUrlEnabledResponse.getClass();
        SetCashtagUrlEnabledResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setCashtagUrlEnabledResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, setCashtagUrlEnabledResponse.response_context);
        protoWriter.writeBytes(setCashtagUrlEnabledResponse.unknownFields());
    }
}
