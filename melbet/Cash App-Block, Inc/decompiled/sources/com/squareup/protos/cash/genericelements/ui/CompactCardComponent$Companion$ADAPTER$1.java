package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CompactCardComponent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CompactCardComponent((TwoColumnComponent) obj, (TextElement) obj2, (StyleAttributes) obj3, (Action) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TwoColumnComponent.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TextElement.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(StyleAttributes.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CompactCardComponent compactCardComponent = (CompactCardComponent) obj;
        reverseProtoWriter.getClass();
        compactCardComponent.getClass();
        reverseProtoWriter.writeBytes(compactCardComponent.unknownFields());
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, compactCardComponent.tap);
        StyleAttributes.ADAPTER.encodeWithTag(reverseProtoWriter, 3, compactCardComponent.attributes);
        TextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, compactCardComponent.description);
        TwoColumnComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, compactCardComponent.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CompactCardComponent compactCardComponent = (CompactCardComponent) obj;
        compactCardComponent.getClass();
        return Action.ADAPTER.encodedSizeWithTag(4, compactCardComponent.tap) + StyleAttributes.ADAPTER.encodedSizeWithTag(3, compactCardComponent.attributes) + TextElement.ADAPTER.encodedSizeWithTag(2, compactCardComponent.description) + TwoColumnComponent.ADAPTER.encodedSizeWithTag(1, compactCardComponent.header) + compactCardComponent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CompactCardComponent compactCardComponent = (CompactCardComponent) obj;
        compactCardComponent.getClass();
        TwoColumnComponent twoColumnComponent = compactCardComponent.header;
        TwoColumnComponent twoColumnComponent2 = twoColumnComponent != null ? (TwoColumnComponent) TwoColumnComponent.ADAPTER.redact(twoColumnComponent) : null;
        TextElement textElement = compactCardComponent.description;
        TextElement textElement2 = textElement != null ? (TextElement) TextElement.ADAPTER.redact(textElement) : null;
        StyleAttributes styleAttributes = compactCardComponent.attributes;
        StyleAttributes styleAttributes2 = styleAttributes != null ? (StyleAttributes) StyleAttributes.ADAPTER.redact(styleAttributes) : null;
        Action action = compactCardComponent.tap;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CompactCardComponent(twoColumnComponent2, textElement2, styleAttributes2, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CompactCardComponent compactCardComponent = (CompactCardComponent) obj;
        compactCardComponent.getClass();
        TwoColumnComponent.ADAPTER.encodeWithTag(protoWriter, 1, compactCardComponent.header);
        TextElement.ADAPTER.encodeWithTag(protoWriter, 2, compactCardComponent.description);
        StyleAttributes.ADAPTER.encodeWithTag(protoWriter, 3, compactCardComponent.attributes);
        Action.ADAPTER.encodeWithTag(protoWriter, 4, compactCardComponent.tap);
        protoWriter.writeBytes(compactCardComponent.unknownFields());
    }
}
