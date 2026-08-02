package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$Push$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.Push((CardModule.CardElementAction) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModule.CardElementAction.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.Push push = (CardModule.Push) obj;
        reverseProtoWriter.getClass();
        push.getClass();
        reverseProtoWriter.writeBytes(push.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, push.text);
        CardModule.CardElementAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, push.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.Push push = (CardModule.Push) obj;
        push.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, push.text) + CardModule.CardElementAction.ADAPTER.encodedSizeWithTag(1, push.action) + push.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.Push push = (CardModule.Push) obj;
        push.getClass();
        CardModule.CardElementAction cardElementAction = push.action;
        CardModule.CardElementAction cardElementAction2 = cardElementAction != null ? (CardModule.CardElementAction) CardModule.CardElementAction.ADAPTER.redact(cardElementAction) : null;
        LocalizedString localizedString = push.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.Push(cardElementAction2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.Push push = (CardModule.Push) obj;
        push.getClass();
        CardModule.CardElementAction.ADAPTER.encodeWithTag(protoWriter, 1, push.action);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, push.text);
        protoWriter.writeBytes(push.unknownFields());
    }
}
