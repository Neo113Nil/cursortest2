package com.squareup.protos.cash.local.client.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketingMessageBadge$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketingMessageBadge((String) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketingMessageBadge marketingMessageBadge = (MarketingMessageBadge) obj;
        reverseProtoWriter.getClass();
        marketingMessageBadge.getClass();
        reverseProtoWriter.writeBytes(marketingMessageBadge.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, marketingMessageBadge.viewed);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, marketingMessageBadge.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketingMessageBadge marketingMessageBadge = (MarketingMessageBadge) obj;
        marketingMessageBadge.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, marketingMessageBadge.viewed) + ProtoAdapter.STRING.encodedSizeWithTag(1, marketingMessageBadge.text) + marketingMessageBadge.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketingMessageBadge marketingMessageBadge = (MarketingMessageBadge) obj;
        marketingMessageBadge.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = marketingMessageBadge.text;
        Boolean bool = marketingMessageBadge.viewed;
        byteString.getClass();
        return new MarketingMessageBadge(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketingMessageBadge marketingMessageBadge = (MarketingMessageBadge) obj;
        marketingMessageBadge.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, marketingMessageBadge.text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, marketingMessageBadge.viewed);
        protoWriter.writeBytes(marketingMessageBadge.unknownFields());
    }
}
