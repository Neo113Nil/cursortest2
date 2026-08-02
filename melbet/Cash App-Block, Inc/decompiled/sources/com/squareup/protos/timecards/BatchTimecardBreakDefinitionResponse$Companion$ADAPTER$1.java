package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BatchTimecardBreakDefinitionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BatchTimecardBreakDefinitionResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TimecardBreakDefinition.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BatchTimecardBreakDefinitionResponse batchTimecardBreakDefinitionResponse = (BatchTimecardBreakDefinitionResponse) obj;
        reverseProtoWriter.getClass();
        batchTimecardBreakDefinitionResponse.getClass();
        reverseProtoWriter.writeBytes(batchTimecardBreakDefinitionResponse.unknownFields());
        TimecardBreakDefinition.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, batchTimecardBreakDefinitionResponse.timecard_break_definition);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BatchTimecardBreakDefinitionResponse batchTimecardBreakDefinitionResponse = (BatchTimecardBreakDefinitionResponse) obj;
        batchTimecardBreakDefinitionResponse.getClass();
        return TimecardBreakDefinition.ADAPTER.asRepeated().encodedSizeWithTag(1, batchTimecardBreakDefinitionResponse.timecard_break_definition) + batchTimecardBreakDefinitionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BatchTimecardBreakDefinitionResponse batchTimecardBreakDefinitionResponse = (BatchTimecardBreakDefinitionResponse) obj;
        batchTimecardBreakDefinitionResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(batchTimecardBreakDefinitionResponse.timecard_break_definition, TimecardBreakDefinition.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BatchTimecardBreakDefinitionResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BatchTimecardBreakDefinitionResponse batchTimecardBreakDefinitionResponse = (BatchTimecardBreakDefinitionResponse) obj;
        batchTimecardBreakDefinitionResponse.getClass();
        TimecardBreakDefinition.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchTimecardBreakDefinitionResponse.timecard_break_definition);
        protoWriter.writeBytes(batchTimecardBreakDefinitionResponse.unknownFields());
    }
}
