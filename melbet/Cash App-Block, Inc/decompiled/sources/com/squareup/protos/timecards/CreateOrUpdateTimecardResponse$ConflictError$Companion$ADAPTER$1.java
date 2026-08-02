package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.CreateOrUpdateTimecardResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreateOrUpdateTimecardResponse$ConflictError$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrUpdateTimecardResponse.ConflictError((Timecard) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrUpdateTimecardResponse.ConflictError conflictError = (CreateOrUpdateTimecardResponse.ConflictError) obj;
        reverseProtoWriter.getClass();
        conflictError.getClass();
        reverseProtoWriter.writeBytes(conflictError.unknownFields());
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, conflictError.conflicting_timecard);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrUpdateTimecardResponse.ConflictError conflictError = (CreateOrUpdateTimecardResponse.ConflictError) obj;
        conflictError.getClass();
        return Timecard.ADAPTER.encodedSizeWithTag(1, conflictError.conflicting_timecard) + conflictError.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrUpdateTimecardResponse.ConflictError conflictError = (CreateOrUpdateTimecardResponse.ConflictError) obj;
        conflictError.getClass();
        Timecard timecard = conflictError.conflicting_timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateOrUpdateTimecardResponse.ConflictError(timecard2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrUpdateTimecardResponse.ConflictError conflictError = (CreateOrUpdateTimecardResponse.ConflictError) obj;
        conflictError.getClass();
        Timecard.ADAPTER.encodeWithTag(protoWriter, 1, conflictError.conflicting_timecard);
        protoWriter.writeBytes(conflictError.unknownFields());
    }
}
