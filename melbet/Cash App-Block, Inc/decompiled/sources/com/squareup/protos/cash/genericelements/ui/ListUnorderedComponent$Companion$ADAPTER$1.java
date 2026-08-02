package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.ListUnorderedComponent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListUnorderedComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListUnorderedComponent((ListUnorderedComponent.Style) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ListUnorderedComponent.Style.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ListUnorderedComponent.Item.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListUnorderedComponent listUnorderedComponent = (ListUnorderedComponent) obj;
        reverseProtoWriter.getClass();
        listUnorderedComponent.getClass();
        reverseProtoWriter.writeBytes(listUnorderedComponent.unknownFields());
        ListUnorderedComponent.Item.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, listUnorderedComponent.items);
        ListUnorderedComponent.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 1, listUnorderedComponent.style);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListUnorderedComponent listUnorderedComponent = (ListUnorderedComponent) obj;
        listUnorderedComponent.getClass();
        return ListUnorderedComponent.Item.ADAPTER.asRepeated().encodedSizeWithTag(2, listUnorderedComponent.items) + ListUnorderedComponent.Style.ADAPTER.encodedSizeWithTag(1, listUnorderedComponent.style) + listUnorderedComponent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListUnorderedComponent listUnorderedComponent = (ListUnorderedComponent) obj;
        listUnorderedComponent.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listUnorderedComponent.items, ListUnorderedComponent.Item.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ListUnorderedComponent.Style style = listUnorderedComponent.style;
        byteString.getClass();
        return new ListUnorderedComponent(style, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListUnorderedComponent listUnorderedComponent = (ListUnorderedComponent) obj;
        listUnorderedComponent.getClass();
        ListUnorderedComponent.Style.ADAPTER.encodeWithTag(protoWriter, 1, listUnorderedComponent.style);
        ListUnorderedComponent.Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, listUnorderedComponent.items);
        protoWriter.writeBytes(listUnorderedComponent.unknownFields());
    }
}
