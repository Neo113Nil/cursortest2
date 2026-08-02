package com.squareup.protos.teamapp.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.teamapp.ui.Duration;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Duration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    Duration.Unit.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new Duration(str, m, (Integer) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "duration");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Duration duration = (Duration) obj;
        reverseProtoWriter.getClass();
        duration.getClass();
        reverseProtoWriter.writeBytes(duration.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, duration.maximum_unit_count);
        Duration.Unit.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, duration.allowed_units);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, duration.duration);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Duration duration = (Duration) obj;
        duration.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(3, duration.maximum_unit_count) + Duration.Unit.ADAPTER.asRepeated().encodedSizeWithTag(2, duration.allowed_units) + ProtoAdapter.STRING.encodedSizeWithTag(1, duration.duration) + duration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Duration duration = (Duration) obj;
        duration.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = duration.duration;
        List list = duration.allowed_units;
        Integer num = duration.maximum_unit_count;
        str.getClass();
        list.getClass();
        byteString.getClass();
        return new Duration(str, list, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Duration duration = (Duration) obj;
        duration.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, duration.duration);
        Duration.Unit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, duration.allowed_units);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, duration.maximum_unit_count);
        protoWriter.writeBytes(duration.unknownFields());
    }
}
