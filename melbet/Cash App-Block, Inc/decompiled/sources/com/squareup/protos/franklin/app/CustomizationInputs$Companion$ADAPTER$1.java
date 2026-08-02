package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomizationInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomizationInputs((CardCustomizationInputs) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardCustomizationInputs.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomizationInputs customizationInputs = (CustomizationInputs) obj;
        reverseProtoWriter.getClass();
        customizationInputs.getClass();
        reverseProtoWriter.writeBytes(customizationInputs.unknownFields());
        CardCustomizationInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 1, customizationInputs.card_customization_inputs);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomizationInputs customizationInputs = (CustomizationInputs) obj;
        customizationInputs.getClass();
        return CardCustomizationInputs.ADAPTER.encodedSizeWithTag(1, customizationInputs.card_customization_inputs) + customizationInputs.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomizationInputs customizationInputs = (CustomizationInputs) obj;
        customizationInputs.getClass();
        CardCustomizationInputs cardCustomizationInputs = customizationInputs.card_customization_inputs;
        CardCustomizationInputs cardCustomizationInputs2 = cardCustomizationInputs != null ? (CardCustomizationInputs) CardCustomizationInputs.ADAPTER.redact(cardCustomizationInputs) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CustomizationInputs(cardCustomizationInputs2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomizationInputs customizationInputs = (CustomizationInputs) obj;
        customizationInputs.getClass();
        CardCustomizationInputs.ADAPTER.encodeWithTag(protoWriter, 1, customizationInputs.card_customization_inputs);
        protoWriter.writeBytes(customizationInputs.unknownFields());
    }
}
