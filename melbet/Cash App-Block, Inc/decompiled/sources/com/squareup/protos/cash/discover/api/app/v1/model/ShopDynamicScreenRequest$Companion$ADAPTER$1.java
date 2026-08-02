package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopDynamicScreenRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShopDynamicScreenRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopDynamicScreenRequest shopDynamicScreenRequest = (ShopDynamicScreenRequest) obj;
        reverseProtoWriter.getClass();
        shopDynamicScreenRequest.getClass();
        reverseProtoWriter.writeBytes(shopDynamicScreenRequest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, shopDynamicScreenRequest.request_body);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShopDynamicScreenRequest shopDynamicScreenRequest = (ShopDynamicScreenRequest) obj;
        shopDynamicScreenRequest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, shopDynamicScreenRequest.request_body) + shopDynamicScreenRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopDynamicScreenRequest shopDynamicScreenRequest = (ShopDynamicScreenRequest) obj;
        shopDynamicScreenRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = shopDynamicScreenRequest.request_body;
        byteString.getClass();
        return new ShopDynamicScreenRequest(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopDynamicScreenRequest shopDynamicScreenRequest = (ShopDynamicScreenRequest) obj;
        shopDynamicScreenRequest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shopDynamicScreenRequest.request_body);
        protoWriter.writeBytes(shopDynamicScreenRequest.unknownFields());
    }
}
