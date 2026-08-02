package com.squareup.protos.cash.investautomator.model;

import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Automation$AllocationStrategy$RoundUp$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Automation.AllocationStrategy.RoundUp((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Automation.AllocationStrategy.RoundUp roundUp = (Automation.AllocationStrategy.RoundUp) obj;
        reverseProtoWriter.getClass();
        roundUp.getClass();
        reverseProtoWriter.writeBytes(roundUp.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, roundUp.multiplier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Automation.AllocationStrategy.RoundUp roundUp = (Automation.AllocationStrategy.RoundUp) obj;
        roundUp.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, roundUp.multiplier) + roundUp.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Automation.AllocationStrategy.RoundUp roundUp = (Automation.AllocationStrategy.RoundUp) obj;
        roundUp.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = roundUp.multiplier;
        byteString.getClass();
        return new Automation.AllocationStrategy.RoundUp(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Automation.AllocationStrategy.RoundUp roundUp = (Automation.AllocationStrategy.RoundUp) obj;
        roundUp.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, roundUp.multiplier);
        protoWriter.writeBytes(roundUp.unknownFields());
    }
}
