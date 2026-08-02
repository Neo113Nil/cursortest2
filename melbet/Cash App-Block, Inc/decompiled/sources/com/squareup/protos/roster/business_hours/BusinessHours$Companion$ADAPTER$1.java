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
public final class BusinessHours$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BusinessHours(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BusinessHoursPeriod.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BusinessHours businessHours = (BusinessHours) obj;
        reverseProtoWriter.getClass();
        businessHours.getClass();
        reverseProtoWriter.writeBytes(businessHours.unknownFields());
        BusinessHoursPeriod.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, businessHours.periods);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BusinessHours businessHours = (BusinessHours) obj;
        businessHours.getClass();
        return BusinessHoursPeriod.ADAPTER.asRepeated().encodedSizeWithTag(1, businessHours.periods) + businessHours.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BusinessHours businessHours = (BusinessHours) obj;
        businessHours.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(businessHours.periods, BusinessHoursPeriod.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BusinessHours(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BusinessHours businessHours = (BusinessHours) obj;
        businessHours.getClass();
        BusinessHoursPeriod.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, businessHours.periods);
        protoWriter.writeBytes(businessHours.unknownFields());
    }
}
