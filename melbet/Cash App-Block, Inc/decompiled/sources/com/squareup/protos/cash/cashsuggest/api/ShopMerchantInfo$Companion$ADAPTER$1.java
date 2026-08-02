package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopMerchantInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShopMerchantInfo((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ShopMerchantInfo shopMerchantInfo = (ShopMerchantInfo) obj;
        reverseProtoWriter.getClass();
        shopMerchantInfo.getClass();
        reverseProtoWriter.writeBytes(shopMerchantInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shopMerchantInfo.user_agent);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shopMerchantInfo.merchant_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShopMerchantInfo shopMerchantInfo = (ShopMerchantInfo) obj;
        shopMerchantInfo.getClass();
        int size$okio = shopMerchantInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, shopMerchantInfo.user_agent) + protoAdapter.encodedSizeWithTag(1, shopMerchantInfo.merchant_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopMerchantInfo shopMerchantInfo = (ShopMerchantInfo) obj;
        shopMerchantInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = shopMerchantInfo.merchant_url;
        String str2 = shopMerchantInfo.user_agent;
        byteString.getClass();
        return new ShopMerchantInfo(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopMerchantInfo shopMerchantInfo = (ShopMerchantInfo) obj;
        shopMerchantInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shopMerchantInfo.merchant_url);
        protoAdapter.encodeWithTag(protoWriter, 2, shopMerchantInfo.user_agent);
        protoWriter.writeBytes(shopMerchantInfo.unknownFields());
    }
}
