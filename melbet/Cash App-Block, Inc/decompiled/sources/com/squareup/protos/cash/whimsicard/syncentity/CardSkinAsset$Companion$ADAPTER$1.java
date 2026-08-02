package com.squareup.protos.cash.whimsicard.syncentity;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardSkinAsset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSkinAsset((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSkinAsset cardSkinAsset = (CardSkinAsset) obj;
        reverseProtoWriter.getClass();
        cardSkinAsset.getClass();
        reverseProtoWriter.writeBytes(cardSkinAsset.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardSkinAsset.asset_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardSkinAsset.skin_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSkinAsset cardSkinAsset = (CardSkinAsset) obj;
        cardSkinAsset.getClass();
        int size$okio = cardSkinAsset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, cardSkinAsset.asset_url) + protoAdapter.encodedSizeWithTag(1, cardSkinAsset.skin_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSkinAsset cardSkinAsset = (CardSkinAsset) obj;
        cardSkinAsset.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cardSkinAsset.skin_token;
        String str2 = cardSkinAsset.asset_url;
        byteString.getClass();
        return new CardSkinAsset(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSkinAsset cardSkinAsset = (CardSkinAsset) obj;
        cardSkinAsset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cardSkinAsset.skin_token);
        protoAdapter.encodeWithTag(protoWriter, 2, cardSkinAsset.asset_url);
        protoWriter.writeBytes(cardSkinAsset.unknownFields());
    }
}
