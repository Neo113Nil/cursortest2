package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.TwoColumnComponent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TwoColumnComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TwoColumnComponent((BaseElement) obj, (BaseElement) obj2, (ColumnWidth) obj3, (TwoColumnComponent.Spacing) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = ColumnWidth.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = TwoColumnComponent.Spacing.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TwoColumnComponent twoColumnComponent = (TwoColumnComponent) obj;
        reverseProtoWriter.getClass();
        twoColumnComponent.getClass();
        reverseProtoWriter.writeBytes(twoColumnComponent.unknownFields());
        TwoColumnComponent.Spacing.ADAPTER.encodeWithTag(reverseProtoWriter, 4, twoColumnComponent.spacing_between);
        ColumnWidth.ADAPTER.encodeWithTag(reverseProtoWriter, 3, twoColumnComponent.column_width);
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, twoColumnComponent.right);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, twoColumnComponent.left);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TwoColumnComponent twoColumnComponent = (TwoColumnComponent) obj;
        twoColumnComponent.getClass();
        int size$okio = twoColumnComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        return TwoColumnComponent.Spacing.ADAPTER.encodedSizeWithTag(4, twoColumnComponent.spacing_between) + ColumnWidth.ADAPTER.encodedSizeWithTag(3, twoColumnComponent.column_width) + protoAdapter.encodedSizeWithTag(2, twoColumnComponent.right) + protoAdapter.encodedSizeWithTag(1, twoColumnComponent.left) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TwoColumnComponent twoColumnComponent = (TwoColumnComponent) obj;
        twoColumnComponent.getClass();
        BaseElement baseElement = twoColumnComponent.left;
        BaseElement baseElement2 = baseElement != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement) : null;
        BaseElement baseElement3 = twoColumnComponent.right;
        BaseElement baseElement4 = baseElement3 != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement3) : null;
        ByteString byteString = ByteString.EMPTY;
        ColumnWidth columnWidth = twoColumnComponent.column_width;
        TwoColumnComponent.Spacing spacing = twoColumnComponent.spacing_between;
        byteString.getClass();
        return new TwoColumnComponent(baseElement2, baseElement4, columnWidth, spacing, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TwoColumnComponent twoColumnComponent = (TwoColumnComponent) obj;
        twoColumnComponent.getClass();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, twoColumnComponent.left);
        protoAdapter.encodeWithTag(protoWriter, 2, twoColumnComponent.right);
        ColumnWidth.ADAPTER.encodeWithTag(protoWriter, 3, twoColumnComponent.column_width);
        TwoColumnComponent.Spacing.ADAPTER.encodeWithTag(protoWriter, 4, twoColumnComponent.spacing_between);
        protoWriter.writeBytes(twoColumnComponent.unknownFields());
    }
}
