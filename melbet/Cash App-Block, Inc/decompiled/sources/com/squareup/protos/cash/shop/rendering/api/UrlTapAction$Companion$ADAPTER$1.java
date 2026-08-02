package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UrlTapAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UrlTapAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        UrlTapAction urlTapAction = (UrlTapAction) obj;
        reverseProtoWriter.getClass();
        urlTapAction.getClass();
        reverseProtoWriter.writeBytes(urlTapAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, urlTapAction.action_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UrlTapAction urlTapAction = (UrlTapAction) obj;
        urlTapAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, urlTapAction.action_url) + urlTapAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UrlTapAction urlTapAction = (UrlTapAction) obj;
        urlTapAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = urlTapAction.action_url;
        byteString.getClass();
        return new UrlTapAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UrlTapAction urlTapAction = (UrlTapAction) obj;
        urlTapAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlTapAction.action_url);
        protoWriter.writeBytes(urlTapAction.unknownFields());
    }
}
