package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopBrowseRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShopBrowseRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopBrowseRequest shopBrowseRequest = (ShopBrowseRequest) obj;
        reverseProtoWriter.getClass();
        shopBrowseRequest.getClass();
        reverseProtoWriter.writeBytes(shopBrowseRequest.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShopBrowseRequest shopBrowseRequest = (ShopBrowseRequest) obj;
        shopBrowseRequest.getClass();
        return shopBrowseRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ShopBrowseRequest) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ShopBrowseRequest(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopBrowseRequest shopBrowseRequest = (ShopBrowseRequest) obj;
        shopBrowseRequest.getClass();
        protoWriter.writeBytes(shopBrowseRequest.unknownFields());
    }
}
