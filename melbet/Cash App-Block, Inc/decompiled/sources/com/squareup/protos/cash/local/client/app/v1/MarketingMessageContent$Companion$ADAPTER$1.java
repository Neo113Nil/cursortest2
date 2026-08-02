package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.Offer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketingMessageContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MarketingMessageContent((String) obj, (String) obj2, (String) obj3, (LocalImage) obj4, (Offer) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Offer.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketingMessageContent marketingMessageContent = (MarketingMessageContent) obj;
        reverseProtoWriter.getClass();
        marketingMessageContent.getClass();
        reverseProtoWriter.writeBytes(marketingMessageContent.unknownFields());
        Offer.ADAPTER.encodeWithTag(reverseProtoWriter, 5, marketingMessageContent.offer);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, marketingMessageContent.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, marketingMessageContent.image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, marketingMessageContent.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, marketingMessageContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketingMessageContent marketingMessageContent = (MarketingMessageContent) obj;
        marketingMessageContent.getClass();
        int size$okio = marketingMessageContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Offer.ADAPTER.encodedSizeWithTag(5, marketingMessageContent.offer) + LocalImage.ADAPTER.encodedSizeWithTag(4, marketingMessageContent.image) + protoAdapter.encodedSizeWithTag(3, marketingMessageContent.image_url) + protoAdapter.encodedSizeWithTag(2, marketingMessageContent.subtitle) + protoAdapter.encodedSizeWithTag(1, marketingMessageContent.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketingMessageContent marketingMessageContent = (MarketingMessageContent) obj;
        marketingMessageContent.getClass();
        LocalImage localImage = marketingMessageContent.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        Offer offer = marketingMessageContent.offer;
        Offer offer2 = offer != null ? (Offer) Offer.ADAPTER.redact(offer) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = marketingMessageContent.title;
        String str2 = marketingMessageContent.subtitle;
        String str3 = marketingMessageContent.image_url;
        byteString.getClass();
        return new MarketingMessageContent(str, str2, str3, localImage2, offer2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketingMessageContent marketingMessageContent = (MarketingMessageContent) obj;
        marketingMessageContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, marketingMessageContent.title);
        protoAdapter.encodeWithTag(protoWriter, 2, marketingMessageContent.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, marketingMessageContent.image_url);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 4, marketingMessageContent.image);
        Offer.ADAPTER.encodeWithTag(protoWriter, 5, marketingMessageContent.offer);
        protoWriter.writeBytes(marketingMessageContent.unknownFields());
    }
}
