package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.CreateOrUpdateTimecardResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreateOrUpdateTimecardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        CreateOrUpdateTimecardResponse$Error$ConflictError createOrUpdateTimecardResponse$Error$ConflictError = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrUpdateTimecardResponse((Timecard) obj, m, arrayList, createOrUpdateTimecardResponse$Error$ConflictError, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(TimecardEvent.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList.add(TimecardBreak.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                createOrUpdateTimecardResponse$Error$ConflictError = new CreateOrUpdateTimecardResponse$Error$ConflictError((CreateOrUpdateTimecardResponse.ConflictError) CreateOrUpdateTimecardResponse.ConflictError.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrUpdateTimecardResponse createOrUpdateTimecardResponse = (CreateOrUpdateTimecardResponse) obj;
        reverseProtoWriter.getClass();
        createOrUpdateTimecardResponse.getClass();
        reverseProtoWriter.writeBytes(createOrUpdateTimecardResponse.unknownFields());
        CreateOrUpdateTimecardResponse$Error$ConflictError createOrUpdateTimecardResponse$Error$ConflictError = createOrUpdateTimecardResponse.error;
        if (createOrUpdateTimecardResponse$Error$ConflictError != null) {
            CreateOrUpdateTimecardResponse.ConflictError.ADAPTER.encodeWithTag(reverseProtoWriter, 4, createOrUpdateTimecardResponse$Error$ConflictError.value);
        } else if (createOrUpdateTimecardResponse$Error$ConflictError != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TimecardBreak.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, createOrUpdateTimecardResponse.timecard_breaks);
        TimecardEvent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, createOrUpdateTimecardResponse.timecard_events);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createOrUpdateTimecardResponse.timecard);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrUpdateTimecardResponse createOrUpdateTimecardResponse = (CreateOrUpdateTimecardResponse) obj;
        createOrUpdateTimecardResponse.getClass();
        int encodedSizeWithTag = TimecardBreak.ADAPTER.asRepeated().encodedSizeWithTag(3, createOrUpdateTimecardResponse.timecard_breaks) + TimecardEvent.ADAPTER.asRepeated().encodedSizeWithTag(2, createOrUpdateTimecardResponse.timecard_events) + Timecard.ADAPTER.encodedSizeWithTag(1, createOrUpdateTimecardResponse.timecard) + createOrUpdateTimecardResponse.unknownFields().getSize$okio();
        CreateOrUpdateTimecardResponse$Error$ConflictError createOrUpdateTimecardResponse$Error$ConflictError = createOrUpdateTimecardResponse.error;
        if (createOrUpdateTimecardResponse$Error$ConflictError != null) {
            return CreateOrUpdateTimecardResponse.ConflictError.ADAPTER.encodedSizeWithTag(4, createOrUpdateTimecardResponse$Error$ConflictError.value) + encodedSizeWithTag;
        }
        if (createOrUpdateTimecardResponse$Error$ConflictError == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrUpdateTimecardResponse createOrUpdateTimecardResponse = (CreateOrUpdateTimecardResponse) obj;
        createOrUpdateTimecardResponse.getClass();
        Timecard timecard = createOrUpdateTimecardResponse.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(createOrUpdateTimecardResponse.timecard_events, TimecardEvent.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(createOrUpdateTimecardResponse.timecard_breaks, TimecardBreak.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        CreateOrUpdateTimecardResponse$Error$ConflictError createOrUpdateTimecardResponse$Error$ConflictError = createOrUpdateTimecardResponse.error;
        byteString.getClass();
        return new CreateOrUpdateTimecardResponse(timecard2, m1169redactElements, m1169redactElements2, createOrUpdateTimecardResponse$Error$ConflictError, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrUpdateTimecardResponse createOrUpdateTimecardResponse = (CreateOrUpdateTimecardResponse) obj;
        createOrUpdateTimecardResponse.getClass();
        Timecard.ADAPTER.encodeWithTag(protoWriter, 1, createOrUpdateTimecardResponse.timecard);
        TimecardEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, createOrUpdateTimecardResponse.timecard_events);
        TimecardBreak.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, createOrUpdateTimecardResponse.timecard_breaks);
        CreateOrUpdateTimecardResponse$Error$ConflictError createOrUpdateTimecardResponse$Error$ConflictError = createOrUpdateTimecardResponse.error;
        if (createOrUpdateTimecardResponse$Error$ConflictError != null) {
            CreateOrUpdateTimecardResponse.ConflictError.ADAPTER.encodeWithTag(protoWriter, 4, createOrUpdateTimecardResponse$Error$ConflictError.value);
        } else if (createOrUpdateTimecardResponse$Error$ConflictError != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(createOrUpdateTimecardResponse.unknownFields());
    }
}
