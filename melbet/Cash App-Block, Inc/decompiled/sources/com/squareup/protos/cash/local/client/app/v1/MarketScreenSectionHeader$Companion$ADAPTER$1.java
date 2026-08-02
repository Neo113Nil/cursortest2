package com.squareup.protos.cash.local.client.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenSectionHeader$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenSectionHeader((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        MarketScreenSectionHeader marketScreenSectionHeader = (MarketScreenSectionHeader) obj;
        reverseProtoWriter.getClass();
        marketScreenSectionHeader.getClass();
        reverseProtoWriter.writeBytes(marketScreenSectionHeader.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, marketScreenSectionHeader.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenSectionHeader marketScreenSectionHeader = (MarketScreenSectionHeader) obj;
        marketScreenSectionHeader.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, marketScreenSectionHeader.title) + marketScreenSectionHeader.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenSectionHeader marketScreenSectionHeader = (MarketScreenSectionHeader) obj;
        marketScreenSectionHeader.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = marketScreenSectionHeader.title;
        byteString.getClass();
        return new MarketScreenSectionHeader(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenSectionHeader marketScreenSectionHeader = (MarketScreenSectionHeader) obj;
        marketScreenSectionHeader.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, marketScreenSectionHeader.title);
        protoWriter.writeBytes(marketScreenSectionHeader.unknownFields());
    }
}
