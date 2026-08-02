package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SelectOptionResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectOptionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectOptionResponse((ResponseContext) obj, (SelectOptionResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = SelectOptionResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 8) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectOptionResponse selectOptionResponse = (SelectOptionResponse) obj;
        reverseProtoWriter.getClass();
        selectOptionResponse.getClass();
        reverseProtoWriter.writeBytes(selectOptionResponse.unknownFields());
        SelectOptionResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectOptionResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, selectOptionResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectOptionResponse selectOptionResponse = (SelectOptionResponse) obj;
        selectOptionResponse.getClass();
        return SelectOptionResponse.Status.ADAPTER.encodedSizeWithTag(1, selectOptionResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(8, selectOptionResponse.response_context) + selectOptionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectOptionResponse selectOptionResponse = (SelectOptionResponse) obj;
        selectOptionResponse.getClass();
        ResponseContext responseContext = selectOptionResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SelectOptionResponse.Status status = selectOptionResponse.status;
        byteString.getClass();
        return new SelectOptionResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectOptionResponse selectOptionResponse = (SelectOptionResponse) obj;
        selectOptionResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 8, selectOptionResponse.response_context);
        SelectOptionResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, selectOptionResponse.status);
        protoWriter.writeBytes(selectOptionResponse.unknownFields());
    }
}
