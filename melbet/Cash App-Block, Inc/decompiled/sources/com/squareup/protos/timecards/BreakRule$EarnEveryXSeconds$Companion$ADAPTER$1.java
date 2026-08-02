package com.squareup.protos.timecards;

import com.squareup.protos.timecards.BreakRule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BreakRule$EarnEveryXSeconds$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BreakRule.EarnEveryXSeconds((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BreakRule.EarnEveryXSeconds earnEveryXSeconds = (BreakRule.EarnEveryXSeconds) obj;
        reverseProtoWriter.getClass();
        earnEveryXSeconds.getClass();
        reverseProtoWriter.writeBytes(earnEveryXSeconds.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, earnEveryXSeconds.threshold_seconds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BreakRule.EarnEveryXSeconds earnEveryXSeconds = (BreakRule.EarnEveryXSeconds) obj;
        earnEveryXSeconds.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, earnEveryXSeconds.threshold_seconds) + earnEveryXSeconds.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BreakRule.EarnEveryXSeconds earnEveryXSeconds = (BreakRule.EarnEveryXSeconds) obj;
        earnEveryXSeconds.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = earnEveryXSeconds.threshold_seconds;
        byteString.getClass();
        return new BreakRule.EarnEveryXSeconds(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BreakRule.EarnEveryXSeconds earnEveryXSeconds = (BreakRule.EarnEveryXSeconds) obj;
        earnEveryXSeconds.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, earnEveryXSeconds.threshold_seconds);
        protoWriter.writeBytes(earnEveryXSeconds.unknownFields());
    }
}
