package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ValueUnitComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ValueUnitComponent((TextElement) obj, (TextElement) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TextElement.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TextElement.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ValueUnitComponent valueUnitComponent = (ValueUnitComponent) obj;
        reverseProtoWriter.getClass();
        valueUnitComponent.getClass();
        reverseProtoWriter.writeBytes(valueUnitComponent.unknownFields());
        ProtoAdapter protoAdapter = TextElement.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, valueUnitComponent.unit_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, valueUnitComponent.numerical_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ValueUnitComponent valueUnitComponent = (ValueUnitComponent) obj;
        valueUnitComponent.getClass();
        int size$okio = valueUnitComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = TextElement.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, valueUnitComponent.unit_description) + protoAdapter.encodedSizeWithTag(1, valueUnitComponent.numerical_value) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ValueUnitComponent valueUnitComponent = (ValueUnitComponent) obj;
        valueUnitComponent.getClass();
        TextElement textElement = valueUnitComponent.numerical_value;
        TextElement textElement2 = textElement != null ? (TextElement) TextElement.ADAPTER.redact(textElement) : null;
        TextElement textElement3 = valueUnitComponent.unit_description;
        TextElement textElement4 = textElement3 != null ? (TextElement) TextElement.ADAPTER.redact(textElement3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ValueUnitComponent(textElement2, textElement4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ValueUnitComponent valueUnitComponent = (ValueUnitComponent) obj;
        valueUnitComponent.getClass();
        ProtoAdapter protoAdapter = TextElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, valueUnitComponent.numerical_value);
        protoAdapter.encodeWithTag(protoWriter, 2, valueUnitComponent.unit_description);
        protoWriter.writeBytes(valueUnitComponent.unknownFields());
    }
}
