package com.squareup.protos.cash.badging.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BadgingData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BadgingData(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Badge.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BadgingData badgingData = (BadgingData) obj;
        reverseProtoWriter.getClass();
        badgingData.getClass();
        reverseProtoWriter.writeBytes(badgingData.unknownFields());
        Badge.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, badgingData.badges);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BadgingData badgingData = (BadgingData) obj;
        badgingData.getClass();
        return Badge.ADAPTER.asRepeated().encodedSizeWithTag(1, badgingData.badges) + badgingData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BadgingData badgingData = (BadgingData) obj;
        badgingData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(badgingData.badges, Badge.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BadgingData(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BadgingData badgingData = (BadgingData) obj;
        badgingData.getClass();
        Badge.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, badgingData.badges);
        protoWriter.writeBytes(badgingData.unknownFields());
    }
}
