package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBuyer$LocalBuyerGuest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalBuyer.LocalBuyerGuest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LocalBuyer.LocalBuyerGuest localBuyerGuest = (LocalBuyer.LocalBuyerGuest) obj;
        reverseProtoWriter.getClass();
        localBuyerGuest.getClass();
        reverseProtoWriter.writeBytes(localBuyerGuest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, localBuyerGuest.anonymous_user_app_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalBuyer.LocalBuyerGuest localBuyerGuest = (LocalBuyer.LocalBuyerGuest) obj;
        localBuyerGuest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, localBuyerGuest.anonymous_user_app_token) + localBuyerGuest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBuyer.LocalBuyerGuest localBuyerGuest = (LocalBuyer.LocalBuyerGuest) obj;
        localBuyerGuest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localBuyerGuest.anonymous_user_app_token;
        byteString.getClass();
        return new LocalBuyer.LocalBuyerGuest(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBuyer.LocalBuyerGuest localBuyerGuest = (LocalBuyer.LocalBuyerGuest) obj;
        localBuyerGuest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, localBuyerGuest.anonymous_user_app_token);
        protoWriter.writeBytes(localBuyerGuest.unknownFields());
    }
}
