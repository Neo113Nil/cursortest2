package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GiftCardRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCardRenderData$GiftCardType$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GiftCardRenderData.GiftCardType((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCardRenderData.GiftCardType giftCardType = (GiftCardRenderData.GiftCardType) obj;
        reverseProtoWriter.getClass();
        giftCardType.getClass();
        reverseProtoWriter.writeBytes(giftCardType.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, giftCardType.dark_theme_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, giftCardType.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, giftCardType.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCardRenderData.GiftCardType giftCardType = (GiftCardRenderData.GiftCardType) obj;
        giftCardType.getClass();
        int size$okio = giftCardType.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, giftCardType.dark_theme_icon_url) + protoAdapter.encodedSizeWithTag(2, giftCardType.icon_url) + protoAdapter.encodedSizeWithTag(1, giftCardType.display_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCardRenderData.GiftCardType giftCardType = (GiftCardRenderData.GiftCardType) obj;
        giftCardType.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = giftCardType.display_name;
        String str2 = giftCardType.icon_url;
        String str3 = giftCardType.dark_theme_icon_url;
        byteString.getClass();
        return new GiftCardRenderData.GiftCardType(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCardRenderData.GiftCardType giftCardType = (GiftCardRenderData.GiftCardType) obj;
        giftCardType.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, giftCardType.display_name);
        protoAdapter.encodeWithTag(protoWriter, 2, giftCardType.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 3, giftCardType.dark_theme_icon_url);
        protoWriter.writeBytes(giftCardType.unknownFields());
    }
}
