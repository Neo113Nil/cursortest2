package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuHours$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalMenuHours((LocalMenuHoursState) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LocalMenuHoursState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuHours localMenuHours = (LocalMenuHours) obj;
        reverseProtoWriter.getClass();
        localMenuHours.getClass();
        reverseProtoWriter.writeBytes(localMenuHours.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localMenuHours.next_available_formatted);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuHours.hours_formatted);
        LocalMenuHoursState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localMenuHours.state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuHours localMenuHours = (LocalMenuHours) obj;
        localMenuHours.getClass();
        int encodedSizeWithTag = LocalMenuHoursState.ADAPTER.encodedSizeWithTag(1, localMenuHours.state) + localMenuHours.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, localMenuHours.next_available_formatted) + protoAdapter.encodedSizeWithTag(2, localMenuHours.hours_formatted) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuHours localMenuHours = (LocalMenuHours) obj;
        localMenuHours.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalMenuHoursState localMenuHoursState = localMenuHours.state;
        String str = localMenuHours.hours_formatted;
        String str2 = localMenuHours.next_available_formatted;
        byteString.getClass();
        return new LocalMenuHours(localMenuHoursState, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuHours localMenuHours = (LocalMenuHours) obj;
        localMenuHours.getClass();
        LocalMenuHoursState.ADAPTER.encodeWithTag(protoWriter, 1, localMenuHours.state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuHours.hours_formatted);
        protoAdapter.encodeWithTag(protoWriter, 3, localMenuHours.next_available_formatted);
        protoWriter.writeBytes(localMenuHours.unknownFields());
    }
}
