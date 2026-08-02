package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class WebLoginConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WebLoginConfig((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WebLoginConfig webLoginConfig = (WebLoginConfig) obj;
        reverseProtoWriter.getClass();
        webLoginConfig.getClass();
        reverseProtoWriter.writeBytes(webLoginConfig.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, webLoginConfig.expires_at);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, webLoginConfig.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WebLoginConfig webLoginConfig = (WebLoginConfig) obj;
        webLoginConfig.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, webLoginConfig.expires_at) + ProtoAdapter.STRING.encodedSizeWithTag(1, webLoginConfig.token) + webLoginConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WebLoginConfig webLoginConfig = (WebLoginConfig) obj;
        webLoginConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = webLoginConfig.expires_at;
        byteString.getClass();
        return new WebLoginConfig(null, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WebLoginConfig webLoginConfig = (WebLoginConfig) obj;
        webLoginConfig.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, webLoginConfig.token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, webLoginConfig.expires_at);
        protoWriter.writeBytes(webLoginConfig.unknownFields());
    }
}
