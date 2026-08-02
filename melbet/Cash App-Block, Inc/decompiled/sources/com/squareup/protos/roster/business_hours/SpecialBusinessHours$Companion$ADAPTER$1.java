package com.squareup.protos.roster.business_hours;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SpecialBusinessHours$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SpecialBusinessHours(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SpecialBusinessHoursPeriod.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SpecialBusinessHours specialBusinessHours = (SpecialBusinessHours) obj;
        reverseProtoWriter.getClass();
        specialBusinessHours.getClass();
        reverseProtoWriter.writeBytes(specialBusinessHours.unknownFields());
        SpecialBusinessHoursPeriod.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, specialBusinessHours.periods);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SpecialBusinessHours specialBusinessHours = (SpecialBusinessHours) obj;
        specialBusinessHours.getClass();
        return SpecialBusinessHoursPeriod.ADAPTER.asRepeated().encodedSizeWithTag(1, specialBusinessHours.periods) + specialBusinessHours.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SpecialBusinessHours specialBusinessHours = (SpecialBusinessHours) obj;
        specialBusinessHours.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(specialBusinessHours.periods, SpecialBusinessHoursPeriod.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SpecialBusinessHours(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SpecialBusinessHours specialBusinessHours = (SpecialBusinessHours) obj;
        specialBusinessHours.getClass();
        SpecialBusinessHoursPeriod.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, specialBusinessHours.periods);
        protoWriter.writeBytes(specialBusinessHours.unknownFields());
    }
}
