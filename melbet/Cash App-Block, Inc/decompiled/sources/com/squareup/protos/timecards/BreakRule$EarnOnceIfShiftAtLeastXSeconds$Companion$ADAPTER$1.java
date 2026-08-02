package com.squareup.protos.timecards;

import com.squareup.protos.timecards.BreakRule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BreakRule$EarnOnceIfShiftAtLeastXSeconds$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BreakRule.EarnOnceIfShiftAtLeastXSeconds((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BreakRule.EarnOnceIfShiftAtLeastXSeconds earnOnceIfShiftAtLeastXSeconds = (BreakRule.EarnOnceIfShiftAtLeastXSeconds) obj;
        reverseProtoWriter.getClass();
        earnOnceIfShiftAtLeastXSeconds.getClass();
        reverseProtoWriter.writeBytes(earnOnceIfShiftAtLeastXSeconds.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, earnOnceIfShiftAtLeastXSeconds.threshold_seconds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BreakRule.EarnOnceIfShiftAtLeastXSeconds earnOnceIfShiftAtLeastXSeconds = (BreakRule.EarnOnceIfShiftAtLeastXSeconds) obj;
        earnOnceIfShiftAtLeastXSeconds.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, earnOnceIfShiftAtLeastXSeconds.threshold_seconds) + earnOnceIfShiftAtLeastXSeconds.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BreakRule.EarnOnceIfShiftAtLeastXSeconds earnOnceIfShiftAtLeastXSeconds = (BreakRule.EarnOnceIfShiftAtLeastXSeconds) obj;
        earnOnceIfShiftAtLeastXSeconds.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = earnOnceIfShiftAtLeastXSeconds.threshold_seconds;
        byteString.getClass();
        return new BreakRule.EarnOnceIfShiftAtLeastXSeconds(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BreakRule.EarnOnceIfShiftAtLeastXSeconds earnOnceIfShiftAtLeastXSeconds = (BreakRule.EarnOnceIfShiftAtLeastXSeconds) obj;
        earnOnceIfShiftAtLeastXSeconds.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, earnOnceIfShiftAtLeastXSeconds.threshold_seconds);
        protoWriter.writeBytes(earnOnceIfShiftAtLeastXSeconds.unknownFields());
    }
}
