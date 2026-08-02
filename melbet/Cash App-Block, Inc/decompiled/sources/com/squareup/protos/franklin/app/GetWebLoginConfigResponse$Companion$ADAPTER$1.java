package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.WebLoginConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetWebLoginConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetWebLoginConfigResponse((WebLoginConfig) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(WebLoginConfig.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetWebLoginConfigResponse getWebLoginConfigResponse = (GetWebLoginConfigResponse) obj;
        reverseProtoWriter.getClass();
        getWebLoginConfigResponse.getClass();
        reverseProtoWriter.writeBytes(getWebLoginConfigResponse.unknownFields());
        WebLoginConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getWebLoginConfigResponse.web_login_config);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetWebLoginConfigResponse getWebLoginConfigResponse = (GetWebLoginConfigResponse) obj;
        getWebLoginConfigResponse.getClass();
        return WebLoginConfig.ADAPTER.encodedSizeWithTag(1, getWebLoginConfigResponse.web_login_config) + getWebLoginConfigResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetWebLoginConfigResponse getWebLoginConfigResponse = (GetWebLoginConfigResponse) obj;
        getWebLoginConfigResponse.getClass();
        WebLoginConfig webLoginConfig = getWebLoginConfigResponse.web_login_config;
        WebLoginConfig webLoginConfig2 = webLoginConfig != null ? (WebLoginConfig) WebLoginConfig.ADAPTER.redact(webLoginConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetWebLoginConfigResponse(webLoginConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetWebLoginConfigResponse getWebLoginConfigResponse = (GetWebLoginConfigResponse) obj;
        getWebLoginConfigResponse.getClass();
        WebLoginConfig.ADAPTER.encodeWithTag(protoWriter, 1, getWebLoginConfigResponse.web_login_config);
        protoWriter.writeBytes(getWebLoginConfigResponse.unknownFields());
    }
}
