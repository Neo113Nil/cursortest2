package com.squareup.protos.timecards;

import com.squareup.protos.timecards.CalculationTotal;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CalculationTotal$MapEntry$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CalculationTotal.MapEntry((CalculationTotal.PayState) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CalculationTotal.PayState.ADAPTER.decode(protoReader);
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
        CalculationTotal.MapEntry mapEntry = (CalculationTotal.MapEntry) obj;
        reverseProtoWriter.getClass();
        mapEntry.getClass();
        reverseProtoWriter.writeBytes(mapEntry.unknownFields());
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 2, mapEntry.seconds);
        CalculationTotal.PayState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, mapEntry.pay_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalculationTotal.MapEntry mapEntry = (CalculationTotal.MapEntry) obj;
        mapEntry.getClass();
        return ProtoAdapter.UINT32.encodedSizeWithTag(2, mapEntry.seconds) + CalculationTotal.PayState.ADAPTER.encodedSizeWithTag(1, mapEntry.pay_state) + mapEntry.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalculationTotal.MapEntry mapEntry = (CalculationTotal.MapEntry) obj;
        mapEntry.getClass();
        ByteString byteString = ByteString.EMPTY;
        CalculationTotal.PayState payState = mapEntry.pay_state;
        Integer num = mapEntry.seconds;
        byteString.getClass();
        return new CalculationTotal.MapEntry(payState, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CalculationTotal.MapEntry mapEntry = (CalculationTotal.MapEntry) obj;
        mapEntry.getClass();
        CalculationTotal.PayState.ADAPTER.encodeWithTag(protoWriter, 1, mapEntry.pay_state);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, mapEntry.seconds);
        protoWriter.writeBytes(mapEntry.unknownFields());
    }
}
