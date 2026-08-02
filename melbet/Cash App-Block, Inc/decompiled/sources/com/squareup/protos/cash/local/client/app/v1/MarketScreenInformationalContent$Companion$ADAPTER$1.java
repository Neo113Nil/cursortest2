package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenInformationalContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenInformationalContent((String) obj, (String) obj2, (String) obj3, (String) obj4, (LocalImage) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenInformationalContent marketScreenInformationalContent = (MarketScreenInformationalContent) obj;
        reverseProtoWriter.getClass();
        marketScreenInformationalContent.getClass();
        reverseProtoWriter.writeBytes(marketScreenInformationalContent.unknownFields());
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 5, marketScreenInformationalContent.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, marketScreenInformationalContent.button_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, marketScreenInformationalContent.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, marketScreenInformationalContent.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, marketScreenInformationalContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenInformationalContent marketScreenInformationalContent = (MarketScreenInformationalContent) obj;
        marketScreenInformationalContent.getClass();
        int size$okio = marketScreenInformationalContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalImage.ADAPTER.encodedSizeWithTag(5, marketScreenInformationalContent.image) + protoAdapter.encodedSizeWithTag(4, marketScreenInformationalContent.button_client_route) + protoAdapter.encodedSizeWithTag(3, marketScreenInformationalContent.button_text) + protoAdapter.encodedSizeWithTag(2, marketScreenInformationalContent.body) + protoAdapter.encodedSizeWithTag(1, marketScreenInformationalContent.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenInformationalContent marketScreenInformationalContent = (MarketScreenInformationalContent) obj;
        marketScreenInformationalContent.getClass();
        LocalImage localImage = marketScreenInformationalContent.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = marketScreenInformationalContent.title;
        String str2 = marketScreenInformationalContent.body;
        String str3 = marketScreenInformationalContent.button_text;
        String str4 = marketScreenInformationalContent.button_client_route;
        byteString.getClass();
        return new MarketScreenInformationalContent(str, str2, str3, str4, localImage2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenInformationalContent marketScreenInformationalContent = (MarketScreenInformationalContent) obj;
        marketScreenInformationalContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, marketScreenInformationalContent.title);
        protoAdapter.encodeWithTag(protoWriter, 2, marketScreenInformationalContent.body);
        protoAdapter.encodeWithTag(protoWriter, 3, marketScreenInformationalContent.button_text);
        protoAdapter.encodeWithTag(protoWriter, 4, marketScreenInformationalContent.button_client_route);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 5, marketScreenInformationalContent.image);
        protoWriter.writeBytes(marketScreenInformationalContent.unknownFields());
    }
}
