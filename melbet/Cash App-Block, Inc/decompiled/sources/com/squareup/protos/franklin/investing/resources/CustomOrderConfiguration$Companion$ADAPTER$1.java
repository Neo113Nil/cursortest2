package com.squareup.protos.franklin.investing.resources;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CustomOrderConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomOrderConfiguration(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Period.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomOrderConfiguration customOrderConfiguration = (CustomOrderConfiguration) obj;
        reverseProtoWriter.getClass();
        customOrderConfiguration.getClass();
        reverseProtoWriter.writeBytes(customOrderConfiguration.unknownFields());
        Period.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, customOrderConfiguration.periods);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomOrderConfiguration customOrderConfiguration = (CustomOrderConfiguration) obj;
        customOrderConfiguration.getClass();
        return Period.ADAPTER.asRepeated().encodedSizeWithTag(1, customOrderConfiguration.periods) + customOrderConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomOrderConfiguration customOrderConfiguration = (CustomOrderConfiguration) obj;
        customOrderConfiguration.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(customOrderConfiguration.periods, Period.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CustomOrderConfiguration(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomOrderConfiguration customOrderConfiguration = (CustomOrderConfiguration) obj;
        customOrderConfiguration.getClass();
        Period.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, customOrderConfiguration.periods);
        protoWriter.writeBytes(customOrderConfiguration.unknownFields());
    }
}
