package com.squareup.protos.cash.appthemes;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Gradient$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Gradient(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Color.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Gradient gradient = (Gradient) obj;
        reverseProtoWriter.getClass();
        gradient.getClass();
        reverseProtoWriter.writeBytes(gradient.unknownFields());
        Color.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, gradient.colors);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Gradient gradient = (Gradient) obj;
        gradient.getClass();
        return Color.ADAPTER.asRepeated().encodedSizeWithTag(1, gradient.colors) + gradient.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Gradient gradient = (Gradient) obj;
        gradient.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(gradient.colors, Color.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Gradient(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Gradient gradient = (Gradient) obj;
        gradient.getClass();
        Color.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, gradient.colors);
        protoWriter.writeBytes(gradient.unknownFields());
    }
}
