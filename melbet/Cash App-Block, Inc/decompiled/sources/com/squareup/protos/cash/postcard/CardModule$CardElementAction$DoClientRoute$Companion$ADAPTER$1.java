package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$DoClientRoute$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.CardElementAction.DoClientRoute((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.CardElementAction.DoClientRoute doClientRoute = (CardModule.CardElementAction.DoClientRoute) obj;
        reverseProtoWriter.getClass();
        doClientRoute.getClass();
        reverseProtoWriter.writeBytes(doClientRoute.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, doClientRoute.url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.CardElementAction.DoClientRoute doClientRoute = (CardModule.CardElementAction.DoClientRoute) obj;
        doClientRoute.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, doClientRoute.url) + doClientRoute.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.CardElementAction.DoClientRoute doClientRoute = (CardModule.CardElementAction.DoClientRoute) obj;
        doClientRoute.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = doClientRoute.url;
        byteString.getClass();
        return new CardModule.CardElementAction.DoClientRoute(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.CardElementAction.DoClientRoute doClientRoute = (CardModule.CardElementAction.DoClientRoute) obj;
        doClientRoute.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, doClientRoute.url);
        protoWriter.writeBytes(doClientRoute.unknownFields());
    }
}
