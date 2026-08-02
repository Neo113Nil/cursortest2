package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FullWidthComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FullWidthComponent((BaseElement) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FullWidthComponent fullWidthComponent = (FullWidthComponent) obj;
        reverseProtoWriter.getClass();
        fullWidthComponent.getClass();
        reverseProtoWriter.writeBytes(fullWidthComponent.unknownFields());
        BaseElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fullWidthComponent.element);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FullWidthComponent fullWidthComponent = (FullWidthComponent) obj;
        fullWidthComponent.getClass();
        return BaseElement.ADAPTER.encodedSizeWithTag(1, fullWidthComponent.element) + fullWidthComponent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FullWidthComponent fullWidthComponent = (FullWidthComponent) obj;
        fullWidthComponent.getClass();
        BaseElement baseElement = fullWidthComponent.element;
        BaseElement baseElement2 = baseElement != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FullWidthComponent(baseElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FullWidthComponent fullWidthComponent = (FullWidthComponent) obj;
        fullWidthComponent.getClass();
        BaseElement.ADAPTER.encodeWithTag(protoWriter, 1, fullWidthComponent.element);
        protoWriter.writeBytes(fullWidthComponent.unknownFields());
    }
}
