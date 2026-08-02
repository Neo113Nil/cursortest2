package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AutomaticClockoutDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AutomaticClockoutDetails((Timecard) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AutomaticClockoutDetails automaticClockoutDetails = (AutomaticClockoutDetails) obj;
        reverseProtoWriter.getClass();
        automaticClockoutDetails.getClass();
        reverseProtoWriter.writeBytes(automaticClockoutDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, automaticClockoutDetails.scheduled_clockout_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, automaticClockoutDetails.automatically_clocked_out_at);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, automaticClockoutDetails.timecard);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AutomaticClockoutDetails automaticClockoutDetails = (AutomaticClockoutDetails) obj;
        automaticClockoutDetails.getClass();
        int encodedSizeWithTag = Timecard.ADAPTER.encodedSizeWithTag(1, automaticClockoutDetails.timecard) + automaticClockoutDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, automaticClockoutDetails.scheduled_clockout_at) + protoAdapter.encodedSizeWithTag(2, automaticClockoutDetails.automatically_clocked_out_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AutomaticClockoutDetails automaticClockoutDetails = (AutomaticClockoutDetails) obj;
        automaticClockoutDetails.getClass();
        Timecard timecard = automaticClockoutDetails.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = automaticClockoutDetails.automatically_clocked_out_at;
        String str2 = automaticClockoutDetails.scheduled_clockout_at;
        byteString.getClass();
        return new AutomaticClockoutDetails(timecard2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AutomaticClockoutDetails automaticClockoutDetails = (AutomaticClockoutDetails) obj;
        automaticClockoutDetails.getClass();
        Timecard.ADAPTER.encodeWithTag(protoWriter, 1, automaticClockoutDetails.timecard);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, automaticClockoutDetails.automatically_clocked_out_at);
        protoAdapter.encodeWithTag(protoWriter, 4, automaticClockoutDetails.scheduled_clockout_at);
        protoWriter.writeBytes(automaticClockoutDetails.unknownFields());
    }
}
