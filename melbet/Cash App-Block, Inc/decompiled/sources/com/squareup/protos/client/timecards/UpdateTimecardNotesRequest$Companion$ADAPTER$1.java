package com.squareup.protos.client.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpdateTimecardNotesRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateTimecardNotesRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        UpdateTimecardNotesRequest updateTimecardNotesRequest = (UpdateTimecardNotesRequest) obj;
        reverseProtoWriter.getClass();
        updateTimecardNotesRequest.getClass();
        reverseProtoWriter.writeBytes(updateTimecardNotesRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, updateTimecardNotesRequest.note_content);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, updateTimecardNotesRequest.timecard_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateTimecardNotesRequest updateTimecardNotesRequest = (UpdateTimecardNotesRequest) obj;
        updateTimecardNotesRequest.getClass();
        int size$okio = updateTimecardNotesRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, updateTimecardNotesRequest.note_content) + protoAdapter.encodedSizeWithTag(1, updateTimecardNotesRequest.timecard_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateTimecardNotesRequest updateTimecardNotesRequest = (UpdateTimecardNotesRequest) obj;
        updateTimecardNotesRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = updateTimecardNotesRequest.timecard_token;
        String str2 = updateTimecardNotesRequest.note_content;
        byteString.getClass();
        return new UpdateTimecardNotesRequest(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateTimecardNotesRequest updateTimecardNotesRequest = (UpdateTimecardNotesRequest) obj;
        updateTimecardNotesRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, updateTimecardNotesRequest.timecard_token);
        protoAdapter.encodeWithTag(protoWriter, 2, updateTimecardNotesRequest.note_content);
        protoWriter.writeBytes(updateTimecardNotesRequest.unknownFields());
    }
}
