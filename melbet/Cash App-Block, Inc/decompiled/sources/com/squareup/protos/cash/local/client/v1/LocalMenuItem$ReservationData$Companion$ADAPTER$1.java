package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItem$ReservationData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItem.ReservationData(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItem.ReservationData reservationData = (LocalMenuItem.ReservationData) obj;
        reverseProtoWriter.getClass();
        reservationData.getClass();
        reverseProtoWriter.writeBytes(reservationData.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItem.ReservationData reservationData = (LocalMenuItem.ReservationData) obj;
        reservationData.getClass();
        return reservationData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((LocalMenuItem.ReservationData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalMenuItem.ReservationData(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItem.ReservationData reservationData = (LocalMenuItem.ReservationData) obj;
        reservationData.getClass();
        protoWriter.writeBytes(reservationData.unknownFields());
    }
}
