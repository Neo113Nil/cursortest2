package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/Chip$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/Chip;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Chip$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Chip((ChipType) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ChipType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Chip chip = (Chip) obj;
        reverseProtoWriter.getClass();
        chip.getClass();
        reverseProtoWriter.writeBytes(chip.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, chip.text);
        ChipType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, chip.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Chip chip = (Chip) obj;
        chip.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, chip.text) + ChipType.ADAPTER.encodedSizeWithTag(1, chip.type) + chip.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Chip chip = (Chip) obj;
        chip.getClass();
        ByteString byteString = ByteString.EMPTY;
        ChipType chipType = chip.type;
        byteString.getClass();
        return new Chip(chipType, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Chip chip = (Chip) obj;
        chip.getClass();
        ChipType.ADAPTER.encodeWithTag(protoWriter, 1, chip.type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chip.text);
        protoWriter.writeBytes(chip.unknownFields());
    }
}
