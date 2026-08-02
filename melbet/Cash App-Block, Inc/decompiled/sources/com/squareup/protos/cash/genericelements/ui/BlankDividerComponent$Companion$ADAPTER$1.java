package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.BlankDividerComponent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BlankDividerComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BlankDividerComponent((BlankDividerComponent.Size) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BlankDividerComponent.Size.ADAPTER.decode(protoReader);
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
        BlankDividerComponent blankDividerComponent = (BlankDividerComponent) obj;
        reverseProtoWriter.getClass();
        blankDividerComponent.getClass();
        reverseProtoWriter.writeBytes(blankDividerComponent.unknownFields());
        BlankDividerComponent.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 1, blankDividerComponent.size);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BlankDividerComponent blankDividerComponent = (BlankDividerComponent) obj;
        blankDividerComponent.getClass();
        return BlankDividerComponent.Size.ADAPTER.encodedSizeWithTag(1, blankDividerComponent.size) + blankDividerComponent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlankDividerComponent blankDividerComponent = (BlankDividerComponent) obj;
        blankDividerComponent.getClass();
        ByteString byteString = ByteString.EMPTY;
        BlankDividerComponent.Size size = blankDividerComponent.size;
        byteString.getClass();
        return new BlankDividerComponent(size, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlankDividerComponent blankDividerComponent = (BlankDividerComponent) obj;
        blankDividerComponent.getClass();
        BlankDividerComponent.Size.ADAPTER.encodeWithTag(protoWriter, 1, blankDividerComponent.size);
        protoWriter.writeBytes(blankDividerComponent.unknownFields());
    }
}
