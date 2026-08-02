package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContainerElement$Margin$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContainerElement.Margin((ContainerElement.Margin.MarginSize) obj, (ContainerElement.Margin.MarginSize) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ContainerElement.Margin.MarginSize.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ContainerElement.Margin.MarginSize.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContainerElement.Margin margin = (ContainerElement.Margin) obj;
        reverseProtoWriter.getClass();
        margin.getClass();
        reverseProtoWriter.writeBytes(margin.unknownFields());
        ContainerElement$Margin$MarginSize$Companion$ADAPTER$1 containerElement$Margin$MarginSize$Companion$ADAPTER$1 = ContainerElement.Margin.MarginSize.ADAPTER;
        containerElement$Margin$MarginSize$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 2, margin.right);
        containerElement$Margin$MarginSize$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 1, margin.left);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContainerElement.Margin margin = (ContainerElement.Margin) obj;
        margin.getClass();
        int size$okio = margin.unknownFields().getSize$okio();
        ContainerElement$Margin$MarginSize$Companion$ADAPTER$1 containerElement$Margin$MarginSize$Companion$ADAPTER$1 = ContainerElement.Margin.MarginSize.ADAPTER;
        return containerElement$Margin$MarginSize$Companion$ADAPTER$1.encodedSizeWithTag(2, margin.right) + containerElement$Margin$MarginSize$Companion$ADAPTER$1.encodedSizeWithTag(1, margin.left) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContainerElement.Margin margin = (ContainerElement.Margin) obj;
        margin.getClass();
        ByteString byteString = ByteString.EMPTY;
        ContainerElement.Margin.MarginSize marginSize = margin.left;
        ContainerElement.Margin.MarginSize marginSize2 = margin.right;
        byteString.getClass();
        return new ContainerElement.Margin(marginSize, marginSize2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContainerElement.Margin margin = (ContainerElement.Margin) obj;
        margin.getClass();
        ContainerElement$Margin$MarginSize$Companion$ADAPTER$1 containerElement$Margin$MarginSize$Companion$ADAPTER$1 = ContainerElement.Margin.MarginSize.ADAPTER;
        containerElement$Margin$MarginSize$Companion$ADAPTER$1.encodeWithTag(protoWriter, 1, margin.left);
        containerElement$Margin$MarginSize$Companion$ADAPTER$1.encodeWithTag(protoWriter, 2, margin.right);
        protoWriter.writeBytes(margin.unknownFields());
    }
}
