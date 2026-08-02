package com.squareup.protos.timecards;

import com.squareup.protos.timecards.OvertimeRule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OvertimeRule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OvertimeRule((OvertimeRule.Reason) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = OvertimeRule.Reason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OvertimeRule overtimeRule = (OvertimeRule) obj;
        reverseProtoWriter.getClass();
        overtimeRule.getClass();
        reverseProtoWriter.writeBytes(overtimeRule.unknownFields());
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 2, overtimeRule.trigger_seconds);
        OvertimeRule.Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overtimeRule.reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OvertimeRule overtimeRule = (OvertimeRule) obj;
        overtimeRule.getClass();
        return ProtoAdapter.UINT32.encodedSizeWithTag(2, overtimeRule.trigger_seconds) + OvertimeRule.Reason.ADAPTER.encodedSizeWithTag(1, overtimeRule.reason) + overtimeRule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OvertimeRule overtimeRule = (OvertimeRule) obj;
        overtimeRule.getClass();
        ByteString byteString = ByteString.EMPTY;
        OvertimeRule.Reason reason = overtimeRule.reason;
        Integer num = overtimeRule.trigger_seconds;
        byteString.getClass();
        return new OvertimeRule(reason, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OvertimeRule overtimeRule = (OvertimeRule) obj;
        overtimeRule.getClass();
        OvertimeRule.Reason.ADAPTER.encodeWithTag(protoWriter, 1, overtimeRule.reason);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, overtimeRule.trigger_seconds);
        protoWriter.writeBytes(overtimeRule.unknownFields());
    }
}
