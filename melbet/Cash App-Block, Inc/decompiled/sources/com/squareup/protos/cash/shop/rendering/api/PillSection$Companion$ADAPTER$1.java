package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.PillSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PillSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PillSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PillSection.Pill.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PillSection pillSection = (PillSection) obj;
        reverseProtoWriter.getClass();
        pillSection.getClass();
        reverseProtoWriter.writeBytes(pillSection.unknownFields());
        PillSection.Pill.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, pillSection.pills);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PillSection pillSection = (PillSection) obj;
        pillSection.getClass();
        return PillSection.Pill.ADAPTER.asRepeated().encodedSizeWithTag(1, pillSection.pills) + pillSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PillSection pillSection = (PillSection) obj;
        pillSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(pillSection.pills, PillSection.Pill.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PillSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PillSection pillSection = (PillSection) obj;
        pillSection.getClass();
        PillSection.Pill.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pillSection.pills);
        protoWriter.writeBytes(pillSection.unknownFields());
    }
}
