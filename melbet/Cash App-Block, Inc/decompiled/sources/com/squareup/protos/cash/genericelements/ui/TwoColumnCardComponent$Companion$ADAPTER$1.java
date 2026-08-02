package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.TwoColumnCardComponent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TwoColumnCardComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TwoColumnCardComponent(m, arrayList, (ColumnWidth) obj, (Action) obj2, (StyleAttributes) obj3, (TwoColumnComponent) obj4, (TwoColumnCardComponent.Spacing) obj5, (VerticalAlignment) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(BaseElement.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    arrayList.add(BaseElement.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    try {
                        obj = ColumnWidth.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj2 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj2);
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(StyleAttributes.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(TwoColumnComponent.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    try {
                        obj5 = TwoColumnCardComponent.Spacing.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    try {
                        obj6 = VerticalAlignment.ADAPTER.decode(protoReader);
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
        TwoColumnCardComponent twoColumnCardComponent = (TwoColumnCardComponent) obj;
        reverseProtoWriter.getClass();
        twoColumnCardComponent.getClass();
        reverseProtoWriter.writeBytes(twoColumnCardComponent.unknownFields());
        VerticalAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 8, twoColumnCardComponent.vertical_alignment);
        TwoColumnCardComponent.Spacing.ADAPTER.encodeWithTag(reverseProtoWriter, 7, twoColumnCardComponent.spacing_between);
        TwoColumnComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, twoColumnCardComponent.header);
        StyleAttributes.ADAPTER.encodeWithTag(reverseProtoWriter, 5, twoColumnCardComponent.style_attributes);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, twoColumnCardComponent.action);
        ColumnWidth.ADAPTER.encodeWithTag(reverseProtoWriter, 3, twoColumnCardComponent.column_width);
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, twoColumnCardComponent.right);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, twoColumnCardComponent.left);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TwoColumnCardComponent twoColumnCardComponent = (TwoColumnCardComponent) obj;
        twoColumnCardComponent.getClass();
        int size$okio = twoColumnCardComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        return VerticalAlignment.ADAPTER.encodedSizeWithTag(8, twoColumnCardComponent.vertical_alignment) + TwoColumnCardComponent.Spacing.ADAPTER.encodedSizeWithTag(7, twoColumnCardComponent.spacing_between) + TwoColumnComponent.ADAPTER.encodedSizeWithTag(6, twoColumnCardComponent.header) + StyleAttributes.ADAPTER.encodedSizeWithTag(5, twoColumnCardComponent.style_attributes) + Action.ADAPTER.encodedSizeWithTag(4, twoColumnCardComponent.action) + ColumnWidth.ADAPTER.encodedSizeWithTag(3, twoColumnCardComponent.column_width) + protoAdapter.asRepeated().encodedSizeWithTag(2, twoColumnCardComponent.right) + protoAdapter.asRepeated().encodedSizeWithTag(1, twoColumnCardComponent.left) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TwoColumnCardComponent twoColumnCardComponent = (TwoColumnCardComponent) obj;
        twoColumnCardComponent.getClass();
        List list = twoColumnCardComponent.left;
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(twoColumnCardComponent.right, protoAdapter);
        Action action = twoColumnCardComponent.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        StyleAttributes styleAttributes = twoColumnCardComponent.style_attributes;
        StyleAttributes styleAttributes2 = styleAttributes != null ? (StyleAttributes) StyleAttributes.ADAPTER.redact(styleAttributes) : null;
        TwoColumnComponent twoColumnComponent = twoColumnCardComponent.header;
        TwoColumnComponent twoColumnComponent2 = twoColumnComponent != null ? (TwoColumnComponent) TwoColumnComponent.ADAPTER.redact(twoColumnComponent) : null;
        ByteString byteString = ByteString.EMPTY;
        ColumnWidth columnWidth = twoColumnCardComponent.column_width;
        TwoColumnCardComponent.Spacing spacing = twoColumnCardComponent.spacing_between;
        VerticalAlignment verticalAlignment = twoColumnCardComponent.vertical_alignment;
        byteString.getClass();
        return new TwoColumnCardComponent(m1169redactElements, m1169redactElements2, columnWidth, action2, styleAttributes2, twoColumnComponent2, spacing, verticalAlignment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TwoColumnCardComponent twoColumnCardComponent = (TwoColumnCardComponent) obj;
        twoColumnCardComponent.getClass();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, twoColumnCardComponent.left);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, twoColumnCardComponent.right);
        ColumnWidth.ADAPTER.encodeWithTag(protoWriter, 3, twoColumnCardComponent.column_width);
        Action.ADAPTER.encodeWithTag(protoWriter, 4, twoColumnCardComponent.action);
        StyleAttributes.ADAPTER.encodeWithTag(protoWriter, 5, twoColumnCardComponent.style_attributes);
        TwoColumnComponent.ADAPTER.encodeWithTag(protoWriter, 6, twoColumnCardComponent.header);
        TwoColumnCardComponent.Spacing.ADAPTER.encodeWithTag(protoWriter, 7, twoColumnCardComponent.spacing_between);
        VerticalAlignment.ADAPTER.encodeWithTag(protoWriter, 8, twoColumnCardComponent.vertical_alignment);
        protoWriter.writeBytes(twoColumnCardComponent.unknownFields());
    }
}
