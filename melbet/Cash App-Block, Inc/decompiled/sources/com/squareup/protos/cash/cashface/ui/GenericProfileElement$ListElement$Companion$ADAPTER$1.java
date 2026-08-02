package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ListElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ListElement((GenericProfileElement.ListElement.Direction) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GenericProfileElement.ListElement.Direction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GenericProfileElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ListElement listElement = (GenericProfileElement.ListElement) obj;
        reverseProtoWriter.getClass();
        listElement.getClass();
        reverseProtoWriter.writeBytes(listElement.unknownFields());
        GenericProfileElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, listElement.elements);
        GenericProfileElement.ListElement.Direction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, listElement.scroll_direction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ListElement listElement = (GenericProfileElement.ListElement) obj;
        listElement.getClass();
        return GenericProfileElement.ADAPTER.asRepeated().encodedSizeWithTag(2, listElement.elements) + GenericProfileElement.ListElement.Direction.ADAPTER.encodedSizeWithTag(1, listElement.scroll_direction) + listElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ListElement listElement = (GenericProfileElement.ListElement) obj;
        listElement.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listElement.elements, GenericProfileElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        GenericProfileElement.ListElement.Direction direction = listElement.scroll_direction;
        byteString.getClass();
        return new GenericProfileElement.ListElement(direction, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ListElement listElement = (GenericProfileElement.ListElement) obj;
        listElement.getClass();
        GenericProfileElement.ListElement.Direction.ADAPTER.encodeWithTag(protoWriter, 1, listElement.scroll_direction);
        GenericProfileElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, listElement.elements);
        protoWriter.writeBytes(listElement.unknownFields());
    }
}
