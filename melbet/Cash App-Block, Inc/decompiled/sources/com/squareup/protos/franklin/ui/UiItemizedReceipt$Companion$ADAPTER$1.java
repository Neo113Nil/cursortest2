package com.squareup.protos.franklin.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiItemizedReceipt$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiItemizedReceipt((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiItemizedReceipt uiItemizedReceipt = (UiItemizedReceipt) obj;
        reverseProtoWriter.getClass();
        uiItemizedReceipt.getClass();
        reverseProtoWriter.writeBytes(uiItemizedReceipt.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, uiItemizedReceipt.render_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, uiItemizedReceipt.transaction_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiItemizedReceipt.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiItemizedReceipt uiItemizedReceipt = (UiItemizedReceipt) obj;
        uiItemizedReceipt.getClass();
        int size$okio = uiItemizedReceipt.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, uiItemizedReceipt.render_json) + protoAdapter.encodedSizeWithTag(2, uiItemizedReceipt.transaction_token) + protoAdapter.encodedSizeWithTag(1, uiItemizedReceipt.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiItemizedReceipt uiItemizedReceipt = (UiItemizedReceipt) obj;
        uiItemizedReceipt.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uiItemizedReceipt.token;
        String str2 = uiItemizedReceipt.transaction_token;
        String str3 = uiItemizedReceipt.render_json;
        byteString.getClass();
        return new UiItemizedReceipt(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiItemizedReceipt uiItemizedReceipt = (UiItemizedReceipt) obj;
        uiItemizedReceipt.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiItemizedReceipt.token);
        protoAdapter.encodeWithTag(protoWriter, 2, uiItemizedReceipt.transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 4, uiItemizedReceipt.render_json);
        protoWriter.writeBytes(uiItemizedReceipt.unknownFields());
    }
}
