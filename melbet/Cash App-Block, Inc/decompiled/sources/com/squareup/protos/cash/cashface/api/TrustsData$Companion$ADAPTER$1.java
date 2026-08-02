package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TrustsData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TrustsData(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Trust.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TrustsData trustsData = (TrustsData) obj;
        reverseProtoWriter.getClass();
        trustsData.getClass();
        reverseProtoWriter.writeBytes(trustsData.unknownFields());
        Trust.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, trustsData.trust);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TrustsData trustsData = (TrustsData) obj;
        trustsData.getClass();
        return Trust.ADAPTER.asRepeated().encodedSizeWithTag(1, trustsData.trust) + trustsData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TrustsData trustsData = (TrustsData) obj;
        trustsData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(trustsData.trust, Trust.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TrustsData(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TrustsData trustsData = (TrustsData) obj;
        trustsData.getClass();
        Trust.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, trustsData.trust);
        protoWriter.writeBytes(trustsData.unknownFields());
    }
}
