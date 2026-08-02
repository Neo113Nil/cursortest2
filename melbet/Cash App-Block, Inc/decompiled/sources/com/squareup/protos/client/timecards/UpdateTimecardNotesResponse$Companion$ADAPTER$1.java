package com.squareup.protos.client.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpdateTimecardNotesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateTimecardNotesResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateTimecardNotesResponse updateTimecardNotesResponse = (UpdateTimecardNotesResponse) obj;
        reverseProtoWriter.getClass();
        updateTimecardNotesResponse.getClass();
        reverseProtoWriter.writeBytes(updateTimecardNotesResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateTimecardNotesResponse updateTimecardNotesResponse = (UpdateTimecardNotesResponse) obj;
        updateTimecardNotesResponse.getClass();
        return updateTimecardNotesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UpdateTimecardNotesResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateTimecardNotesResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateTimecardNotesResponse updateTimecardNotesResponse = (UpdateTimecardNotesResponse) obj;
        updateTimecardNotesResponse.getClass();
        protoWriter.writeBytes(updateTimecardNotesResponse.unknownFields());
    }
}
