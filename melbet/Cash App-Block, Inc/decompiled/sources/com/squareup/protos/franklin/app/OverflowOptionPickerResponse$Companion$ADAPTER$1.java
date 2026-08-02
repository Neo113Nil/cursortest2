package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OverflowOptionPickerResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverflowOptionPickerResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverflowOptionPickerResponse overflowOptionPickerResponse = (OverflowOptionPickerResponse) obj;
        reverseProtoWriter.getClass();
        overflowOptionPickerResponse.getClass();
        reverseProtoWriter.writeBytes(overflowOptionPickerResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overflowOptionPickerResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverflowOptionPickerResponse overflowOptionPickerResponse = (OverflowOptionPickerResponse) obj;
        overflowOptionPickerResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, overflowOptionPickerResponse.response_context) + overflowOptionPickerResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverflowOptionPickerResponse overflowOptionPickerResponse = (OverflowOptionPickerResponse) obj;
        overflowOptionPickerResponse.getClass();
        ResponseContext responseContext = overflowOptionPickerResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverflowOptionPickerResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverflowOptionPickerResponse overflowOptionPickerResponse = (OverflowOptionPickerResponse) obj;
        overflowOptionPickerResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, overflowOptionPickerResponse.response_context);
        protoWriter.writeBytes(overflowOptionPickerResponse.unknownFields());
    }
}
