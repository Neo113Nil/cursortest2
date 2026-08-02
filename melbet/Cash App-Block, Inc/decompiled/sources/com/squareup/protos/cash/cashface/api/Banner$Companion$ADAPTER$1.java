package com.squareup.protos.cash.cashface.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Banner$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Banner((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Banner banner = (Banner) obj;
        reverseProtoWriter.getClass();
        banner.getClass();
        reverseProtoWriter.writeBytes(banner.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, banner.banner_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Banner banner = (Banner) obj;
        banner.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, banner.banner_color) + banner.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Banner banner = (Banner) obj;
        banner.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = banner.banner_color;
        byteString.getClass();
        return new Banner(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Banner banner = (Banner) obj;
        banner.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, banner.banner_color);
        protoWriter.writeBytes(banner.unknownFields());
    }
}
