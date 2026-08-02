package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StartTimecardBreakRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StartTimecardBreakRequest((String) obj, (String) obj2, (String) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StartTimecardBreakRequest startTimecardBreakRequest = (StartTimecardBreakRequest) obj;
        reverseProtoWriter.getClass();
        startTimecardBreakRequest.getClass();
        reverseProtoWriter.writeBytes(startTimecardBreakRequest.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, startTimecardBreakRequest.version_number);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, startTimecardBreakRequest.break_definition_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, startTimecardBreakRequest.timecard_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, startTimecardBreakRequest.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartTimecardBreakRequest startTimecardBreakRequest = (StartTimecardBreakRequest) obj;
        startTimecardBreakRequest.getClass();
        int size$okio = startTimecardBreakRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(4, startTimecardBreakRequest.version_number) + protoAdapter.encodedSizeWithTag(3, startTimecardBreakRequest.break_definition_token) + protoAdapter.encodedSizeWithTag(2, startTimecardBreakRequest.timecard_token) + protoAdapter.encodedSizeWithTag(1, startTimecardBreakRequest.merchant_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartTimecardBreakRequest startTimecardBreakRequest = (StartTimecardBreakRequest) obj;
        startTimecardBreakRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = startTimecardBreakRequest.merchant_token;
        String str2 = startTimecardBreakRequest.timecard_token;
        String str3 = startTimecardBreakRequest.break_definition_token;
        Long l = startTimecardBreakRequest.version_number;
        byteString.getClass();
        return new StartTimecardBreakRequest(str, str2, str3, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartTimecardBreakRequest startTimecardBreakRequest = (StartTimecardBreakRequest) obj;
        startTimecardBreakRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, startTimecardBreakRequest.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 2, startTimecardBreakRequest.timecard_token);
        protoAdapter.encodeWithTag(protoWriter, 3, startTimecardBreakRequest.break_definition_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, startTimecardBreakRequest.version_number);
        protoWriter.writeBytes(startTimecardBreakRequest.unknownFields());
    }
}
