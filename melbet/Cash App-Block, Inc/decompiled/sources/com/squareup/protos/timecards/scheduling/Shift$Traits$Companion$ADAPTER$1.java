package com.squareup.protos.timecards.scheduling;

import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Shift$Traits$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Shift.Traits((Shift.Traits.Status) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Shift.Traits.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Shift.Traits traits = (Shift.Traits) obj;
        reverseProtoWriter.getClass();
        traits.getClass();
        reverseProtoWriter.writeBytes(traits.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, traits.is_unscheduled);
        Shift.Traits.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, traits.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Shift.Traits traits = (Shift.Traits) obj;
        traits.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, traits.is_unscheduled) + Shift.Traits.Status.ADAPTER.encodedSizeWithTag(1, traits.status) + traits.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Shift.Traits traits = (Shift.Traits) obj;
        traits.getClass();
        ByteString byteString = ByteString.EMPTY;
        Shift.Traits.Status status = traits.status;
        Boolean bool = traits.is_unscheduled;
        byteString.getClass();
        return new Shift.Traits(status, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Shift.Traits traits = (Shift.Traits) obj;
        traits.getClass();
        Shift.Traits.Status.ADAPTER.encodeWithTag(protoWriter, 1, traits.status);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, traits.is_unscheduled);
        protoWriter.writeBytes(traits.unknownFields());
    }
}
