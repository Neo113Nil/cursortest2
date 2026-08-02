package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.TwoColumnRowComponent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TwoColumnRowComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TwoColumnRowComponent(m, arrayList, (Action) obj, (TwoColumnRowComponent.Spacing) obj2, (ColumnWidth) obj3, (VerticalAlignment) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(BaseElement.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    arrayList.add(BaseElement.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj);
                    break;
                case 4:
                    try {
                        obj2 = TwoColumnRowComponent.Spacing.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    try {
                        obj3 = ColumnWidth.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 6:
                    try {
                        obj4 = VerticalAlignment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TwoColumnRowComponent twoColumnRowComponent = (TwoColumnRowComponent) obj;
        reverseProtoWriter.getClass();
        twoColumnRowComponent.getClass();
        reverseProtoWriter.writeBytes(twoColumnRowComponent.unknownFields());
        VerticalAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 6, twoColumnRowComponent.vertical_alignment);
        ColumnWidth.ADAPTER.encodeWithTag(reverseProtoWriter, 5, twoColumnRowComponent.column_width);
        TwoColumnRowComponent.Spacing.ADAPTER.encodeWithTag(reverseProtoWriter, 4, twoColumnRowComponent.spacing_between);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, twoColumnRowComponent.action);
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, twoColumnRowComponent.right);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, twoColumnRowComponent.left);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TwoColumnRowComponent twoColumnRowComponent = (TwoColumnRowComponent) obj;
        twoColumnRowComponent.getClass();
        int size$okio = twoColumnRowComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        return VerticalAlignment.ADAPTER.encodedSizeWithTag(6, twoColumnRowComponent.vertical_alignment) + ColumnWidth.ADAPTER.encodedSizeWithTag(5, twoColumnRowComponent.column_width) + TwoColumnRowComponent.Spacing.ADAPTER.encodedSizeWithTag(4, twoColumnRowComponent.spacing_between) + Action.ADAPTER.encodedSizeWithTag(3, twoColumnRowComponent.action) + protoAdapter.asRepeated().encodedSizeWithTag(2, twoColumnRowComponent.right) + protoAdapter.asRepeated().encodedSizeWithTag(1, twoColumnRowComponent.left) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TwoColumnRowComponent twoColumnRowComponent = (TwoColumnRowComponent) obj;
        twoColumnRowComponent.getClass();
        List list = twoColumnRowComponent.left;
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(twoColumnRowComponent.right, protoAdapter);
        Action action = twoColumnRowComponent.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        TwoColumnRowComponent.Spacing spacing = twoColumnRowComponent.spacing_between;
        ColumnWidth columnWidth = twoColumnRowComponent.column_width;
        VerticalAlignment verticalAlignment = twoColumnRowComponent.vertical_alignment;
        byteString.getClass();
        return new TwoColumnRowComponent(m1169redactElements, m1169redactElements2, action2, spacing, columnWidth, verticalAlignment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TwoColumnRowComponent twoColumnRowComponent = (TwoColumnRowComponent) obj;
        twoColumnRowComponent.getClass();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, twoColumnRowComponent.left);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, twoColumnRowComponent.right);
        Action.ADAPTER.encodeWithTag(protoWriter, 3, twoColumnRowComponent.action);
        TwoColumnRowComponent.Spacing.ADAPTER.encodeWithTag(protoWriter, 4, twoColumnRowComponent.spacing_between);
        ColumnWidth.ADAPTER.encodeWithTag(protoWriter, 5, twoColumnRowComponent.column_width);
        VerticalAlignment.ADAPTER.encodeWithTag(protoWriter, 6, twoColumnRowComponent.vertical_alignment);
        protoWriter.writeBytes(twoColumnRowComponent.unknownFields());
    }
}
