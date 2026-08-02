package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.BlankDividerElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BlankDividerElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BlankDividerElement((BlankDividerElement.Size) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BlankDividerElement.Size.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BlankDividerElement blankDividerElement = (BlankDividerElement) obj;
        reverseProtoWriter.getClass();
        blankDividerElement.getClass();
        reverseProtoWriter.writeBytes(blankDividerElement.unknownFields());
        BlankDividerElement.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 1, blankDividerElement.size);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BlankDividerElement blankDividerElement = (BlankDividerElement) obj;
        blankDividerElement.getClass();
        return BlankDividerElement.Size.ADAPTER.encodedSizeWithTag(1, blankDividerElement.size) + blankDividerElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlankDividerElement blankDividerElement = (BlankDividerElement) obj;
        blankDividerElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        BlankDividerElement.Size size = blankDividerElement.size;
        byteString.getClass();
        return new BlankDividerElement(size, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlankDividerElement blankDividerElement = (BlankDividerElement) obj;
        blankDividerElement.getClass();
        BlankDividerElement.Size.ADAPTER.encodeWithTag(protoWriter, 1, blankDividerElement.size);
        protoWriter.writeBytes(blankDividerElement.unknownFields());
    }
}
