package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StopTimecardBreakRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StopTimecardBreakRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StopTimecardBreakRequest stopTimecardBreakRequest = (StopTimecardBreakRequest) obj;
        reverseProtoWriter.getClass();
        stopTimecardBreakRequest.getClass();
        reverseProtoWriter.writeBytes(stopTimecardBreakRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, stopTimecardBreakRequest.timecard_break_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, stopTimecardBreakRequest.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StopTimecardBreakRequest stopTimecardBreakRequest = (StopTimecardBreakRequest) obj;
        stopTimecardBreakRequest.getClass();
        int size$okio = stopTimecardBreakRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, stopTimecardBreakRequest.timecard_break_token) + protoAdapter.encodedSizeWithTag(1, stopTimecardBreakRequest.merchant_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StopTimecardBreakRequest stopTimecardBreakRequest = (StopTimecardBreakRequest) obj;
        stopTimecardBreakRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = stopTimecardBreakRequest.merchant_token;
        String str2 = stopTimecardBreakRequest.timecard_break_token;
        byteString.getClass();
        return new StopTimecardBreakRequest(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StopTimecardBreakRequest stopTimecardBreakRequest = (StopTimecardBreakRequest) obj;
        stopTimecardBreakRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, stopTimecardBreakRequest.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 2, stopTimecardBreakRequest.timecard_break_token);
        protoWriter.writeBytes(stopTimecardBreakRequest.unknownFields());
    }
}
