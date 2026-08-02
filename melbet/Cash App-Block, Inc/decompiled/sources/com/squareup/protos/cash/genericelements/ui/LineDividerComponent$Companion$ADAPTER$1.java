package com.squareup.protos.cash.genericelements.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LineDividerComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LineDividerComponent((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LineDividerComponent lineDividerComponent = (LineDividerComponent) obj;
        reverseProtoWriter.getClass();
        lineDividerComponent.getClass();
        reverseProtoWriter.writeBytes(lineDividerComponent.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, lineDividerComponent.use_padding);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LineDividerComponent lineDividerComponent = (LineDividerComponent) obj;
        lineDividerComponent.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, lineDividerComponent.use_padding) + lineDividerComponent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LineDividerComponent lineDividerComponent = (LineDividerComponent) obj;
        lineDividerComponent.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = lineDividerComponent.use_padding;
        byteString.getClass();
        return new LineDividerComponent(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LineDividerComponent lineDividerComponent = (LineDividerComponent) obj;
        lineDividerComponent.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, lineDividerComponent.use_padding);
        protoWriter.writeBytes(lineDividerComponent.unknownFields());
    }
}
