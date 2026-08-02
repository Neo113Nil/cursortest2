package com.squareup.protos.cash.plasma.ui.inputs;

import com.squareup.protos.cash.plasma.ui.inputs.WebViewCallbackInputs;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class WebViewCallbackInputs$QueryParam$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WebViewCallbackInputs.QueryParam((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        WebViewCallbackInputs.QueryParam queryParam = (WebViewCallbackInputs.QueryParam) obj;
        reverseProtoWriter.getClass();
        queryParam.getClass();
        reverseProtoWriter.writeBytes(queryParam.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, queryParam.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, queryParam.key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WebViewCallbackInputs.QueryParam queryParam = (WebViewCallbackInputs.QueryParam) obj;
        queryParam.getClass();
        int size$okio = queryParam.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, queryParam.value) + protoAdapter.encodedSizeWithTag(1, queryParam.key) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WebViewCallbackInputs.QueryParam queryParam = (WebViewCallbackInputs.QueryParam) obj;
        queryParam.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = queryParam.key;
        byteString.getClass();
        return new WebViewCallbackInputs.QueryParam(str, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WebViewCallbackInputs.QueryParam queryParam = (WebViewCallbackInputs.QueryParam) obj;
        queryParam.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, queryParam.key);
        protoAdapter.encodeWithTag(protoWriter, 2, queryParam.value);
        protoWriter.writeBytes(queryParam.unknownFields());
    }
}
