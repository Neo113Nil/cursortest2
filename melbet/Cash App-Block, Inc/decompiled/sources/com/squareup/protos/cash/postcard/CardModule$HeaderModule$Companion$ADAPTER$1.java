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
public final class CardModule$HeaderModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeaderModule((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeaderModule headerModule = (CardModule.HeaderModule) obj;
        reverseProtoWriter.getClass();
        headerModule.getClass();
        reverseProtoWriter.writeBytes(headerModule.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, headerModule.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeaderModule headerModule = (CardModule.HeaderModule) obj;
        headerModule.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, headerModule.title) + headerModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeaderModule headerModule = (CardModule.HeaderModule) obj;
        headerModule.getClass();
        LocalizedString localizedString = headerModule.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.HeaderModule(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeaderModule headerModule = (CardModule.HeaderModule) obj;
        headerModule.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, headerModule.title);
        protoWriter.writeBytes(headerModule.unknownFields());
    }
}
