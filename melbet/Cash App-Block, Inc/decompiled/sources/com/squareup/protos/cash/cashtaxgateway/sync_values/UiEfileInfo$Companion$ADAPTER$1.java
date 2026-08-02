package com.squareup.protos.cash.cashtaxgateway.sync_values;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UiEfileInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiEfileInfo((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        UiEfileInfo uiEfileInfo = (UiEfileInfo) obj;
        reverseProtoWriter.getClass();
        uiEfileInfo.getClass();
        reverseProtoWriter.writeBytes(uiEfileInfo.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, uiEfileInfo.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiEfileInfo uiEfileInfo = (UiEfileInfo) obj;
        uiEfileInfo.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, uiEfileInfo.customer_token) + uiEfileInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiEfileInfo uiEfileInfo = (UiEfileInfo) obj;
        uiEfileInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uiEfileInfo.customer_token;
        byteString.getClass();
        return new UiEfileInfo(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiEfileInfo uiEfileInfo = (UiEfileInfo) obj;
        uiEfileInfo.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uiEfileInfo.customer_token);
        protoWriter.writeBytes(uiEfileInfo.unknownFields());
    }
}
