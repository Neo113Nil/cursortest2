package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class IssuedCardElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new IssuedCardElement((String) obj, (CardModuleElement) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CardModuleElement.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CardModuleElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IssuedCardElement issuedCardElement = (IssuedCardElement) obj;
        reverseProtoWriter.getClass();
        issuedCardElement.getClass();
        reverseProtoWriter.writeBytes(issuedCardElement.unknownFields());
        ProtoAdapter protoAdapter = CardModuleElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, issuedCardElement.overflow_controls);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, issuedCardElement.primary_control);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, issuedCardElement.card_identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IssuedCardElement issuedCardElement = (IssuedCardElement) obj;
        issuedCardElement.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, issuedCardElement.card_identifier) + issuedCardElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CardModuleElement.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, issuedCardElement.overflow_controls) + protoAdapter.encodedSizeWithTag(2, issuedCardElement.primary_control) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IssuedCardElement issuedCardElement = (IssuedCardElement) obj;
        issuedCardElement.getClass();
        CardModuleElement cardModuleElement = issuedCardElement.primary_control;
        CardModuleElement cardModuleElement2 = cardModuleElement != null ? (CardModuleElement) CardModuleElement.ADAPTER.redact(cardModuleElement) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(issuedCardElement.overflow_controls, CardModuleElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = issuedCardElement.card_identifier;
        byteString.getClass();
        return new IssuedCardElement(str, cardModuleElement2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IssuedCardElement issuedCardElement = (IssuedCardElement) obj;
        issuedCardElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, issuedCardElement.card_identifier);
        ProtoAdapter protoAdapter = CardModuleElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, issuedCardElement.primary_control);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, issuedCardElement.overflow_controls);
        protoWriter.writeBytes(issuedCardElement.unknownFields());
    }
}
