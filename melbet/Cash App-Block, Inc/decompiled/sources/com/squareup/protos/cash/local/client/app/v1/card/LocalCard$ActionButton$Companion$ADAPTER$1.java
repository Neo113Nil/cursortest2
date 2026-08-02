package com.squareup.protos.cash.local.client.app.v1.card;

import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCard$ActionButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCard.ActionButton((String) obj, (String) obj2, (LocalCard.ActionButton.DisplayCondition) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = LocalCard.ActionButton.DisplayCondition.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCard.ActionButton actionButton = (LocalCard.ActionButton) obj;
        reverseProtoWriter.getClass();
        actionButton.getClass();
        reverseProtoWriter.writeBytes(actionButton.unknownFields());
        LocalCard.ActionButton.DisplayCondition.ADAPTER.encodeWithTag(reverseProtoWriter, 3, actionButton.display_condition);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, actionButton.client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, actionButton.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCard.ActionButton actionButton = (LocalCard.ActionButton) obj;
        actionButton.getClass();
        int size$okio = actionButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalCard.ActionButton.DisplayCondition.ADAPTER.encodedSizeWithTag(3, actionButton.display_condition) + protoAdapter.encodedSizeWithTag(2, actionButton.client_route) + protoAdapter.encodedSizeWithTag(1, actionButton.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCard.ActionButton actionButton = (LocalCard.ActionButton) obj;
        actionButton.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = actionButton.text;
        String str2 = actionButton.client_route;
        LocalCard.ActionButton.DisplayCondition displayCondition = actionButton.display_condition;
        byteString.getClass();
        return new LocalCard.ActionButton(str, str2, displayCondition, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCard.ActionButton actionButton = (LocalCard.ActionButton) obj;
        actionButton.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, actionButton.text);
        protoAdapter.encodeWithTag(protoWriter, 2, actionButton.client_route);
        LocalCard.ActionButton.DisplayCondition.ADAPTER.encodeWithTag(protoWriter, 3, actionButton.display_condition);
        protoWriter.writeBytes(actionButton.unknownFields());
    }
}
