package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$Toggle$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.Toggle((CardModule.CardElementAction) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModule.CardElementAction.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.Toggle toggle = (CardModule.Toggle) obj;
        reverseProtoWriter.getClass();
        toggle.getClass();
        reverseProtoWriter.writeBytes(toggle.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, toggle.is_toggled);
        CardModule.CardElementAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, toggle.card_element_action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.Toggle toggle = (CardModule.Toggle) obj;
        toggle.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, toggle.is_toggled) + CardModule.CardElementAction.ADAPTER.encodedSizeWithTag(1, toggle.card_element_action) + toggle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.Toggle toggle = (CardModule.Toggle) obj;
        toggle.getClass();
        CardModule.CardElementAction cardElementAction = toggle.card_element_action;
        CardModule.CardElementAction cardElementAction2 = cardElementAction != null ? (CardModule.CardElementAction) CardModule.CardElementAction.ADAPTER.redact(cardElementAction) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = toggle.is_toggled;
        byteString.getClass();
        return new CardModule.Toggle(cardElementAction2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.Toggle toggle = (CardModule.Toggle) obj;
        toggle.getClass();
        CardModule.CardElementAction.ADAPTER.encodeWithTag(protoWriter, 1, toggle.card_element_action);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, toggle.is_toggled);
        protoWriter.writeBytes(toggle.unknownFields());
    }
}
