package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CompactInfoComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CompactInfoComponent((TwoColumnComponent) obj, (TextElement) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TwoColumnComponent.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TextElement.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CompactInfoComponent compactInfoComponent = (CompactInfoComponent) obj;
        reverseProtoWriter.getClass();
        compactInfoComponent.getClass();
        reverseProtoWriter.writeBytes(compactInfoComponent.unknownFields());
        TextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, compactInfoComponent.description);
        TwoColumnComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, compactInfoComponent.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CompactInfoComponent compactInfoComponent = (CompactInfoComponent) obj;
        compactInfoComponent.getClass();
        return TextElement.ADAPTER.encodedSizeWithTag(2, compactInfoComponent.description) + TwoColumnComponent.ADAPTER.encodedSizeWithTag(1, compactInfoComponent.header) + compactInfoComponent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CompactInfoComponent compactInfoComponent = (CompactInfoComponent) obj;
        compactInfoComponent.getClass();
        TwoColumnComponent twoColumnComponent = compactInfoComponent.header;
        TwoColumnComponent twoColumnComponent2 = twoColumnComponent != null ? (TwoColumnComponent) TwoColumnComponent.ADAPTER.redact(twoColumnComponent) : null;
        TextElement textElement = compactInfoComponent.description;
        TextElement textElement2 = textElement != null ? (TextElement) TextElement.ADAPTER.redact(textElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CompactInfoComponent(twoColumnComponent2, textElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CompactInfoComponent compactInfoComponent = (CompactInfoComponent) obj;
        compactInfoComponent.getClass();
        TwoColumnComponent.ADAPTER.encodeWithTag(protoWriter, 1, compactInfoComponent.header);
        TextElement.ADAPTER.encodeWithTag(protoWriter, 2, compactInfoComponent.description);
        protoWriter.writeBytes(compactInfoComponent.unknownFields());
    }
}
