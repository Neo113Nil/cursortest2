package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PhysicalCardData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PhysicalCardData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PhysicalCardData((PhysicalCardData.State) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PhysicalCardData.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PhysicalCardData physicalCardData = (PhysicalCardData) obj;
        reverseProtoWriter.getClass();
        physicalCardData.getClass();
        reverseProtoWriter.writeBytes(physicalCardData.unknownFields());
        PhysicalCardData.State.ADAPTER.encodeWithTag(reverseProtoWriter, 1, physicalCardData.physical_card_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PhysicalCardData physicalCardData = (PhysicalCardData) obj;
        physicalCardData.getClass();
        return PhysicalCardData.State.ADAPTER.encodedSizeWithTag(1, physicalCardData.physical_card_state) + physicalCardData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PhysicalCardData physicalCardData = (PhysicalCardData) obj;
        physicalCardData.getClass();
        ByteString byteString = ByteString.EMPTY;
        PhysicalCardData.State state = physicalCardData.physical_card_state;
        byteString.getClass();
        return new PhysicalCardData(state, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PhysicalCardData physicalCardData = (PhysicalCardData) obj;
        physicalCardData.getClass();
        PhysicalCardData.State.ADAPTER.encodeWithTag(protoWriter, 1, physicalCardData.physical_card_state);
        protoWriter.writeBytes(physicalCardData.unknownFields());
    }
}
