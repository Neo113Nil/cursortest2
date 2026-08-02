package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ValueUnitElement$Split$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ValueUnitElement.Split((String) obj2, (Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ValueUnitElement.Split split = (GenericProfileElement.ValueUnitElement.Split) obj;
        reverseProtoWriter.getClass();
        split.getClass();
        reverseProtoWriter.writeBytes(split.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, split.unit_description_suffix);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, split.numerical_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ValueUnitElement.Split split = (GenericProfileElement.ValueUnitElement.Split) obj;
        split.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, split.unit_description_suffix) + ProtoAdapter.INT64.encodedSizeWithTag(1, split.numerical_value) + split.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ValueUnitElement.Split split = (GenericProfileElement.ValueUnitElement.Split) obj;
        split.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = split.numerical_value;
        String str = split.unit_description_suffix;
        byteString.getClass();
        return new GenericProfileElement.ValueUnitElement.Split(str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ValueUnitElement.Split split = (GenericProfileElement.ValueUnitElement.Split) obj;
        split.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, split.numerical_value);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, split.unit_description_suffix);
        protoWriter.writeBytes(split.unknownFields());
    }
}
