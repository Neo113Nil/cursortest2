package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShowToast$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShowToast((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShowToast showToast = (ShowToast) obj;
        reverseProtoWriter.getClass();
        showToast.getClass();
        reverseProtoWriter.writeBytes(showToast.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, showToast.tap_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, showToast.action_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, showToast.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, showToast.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShowToast showToast = (ShowToast) obj;
        showToast.getClass();
        int size$okio = showToast.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, showToast.tap_client_route) + protoAdapter.encodedSizeWithTag(3, showToast.action_button_title) + protoAdapter.encodedSizeWithTag(2, showToast.body) + protoAdapter.encodedSizeWithTag(1, showToast.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShowToast showToast = (ShowToast) obj;
        showToast.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = showToast.title;
        String str2 = showToast.body;
        String str3 = showToast.action_button_title;
        String str4 = showToast.tap_client_route;
        byteString.getClass();
        return new ShowToast(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShowToast showToast = (ShowToast) obj;
        showToast.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, showToast.title);
        protoAdapter.encodeWithTag(protoWriter, 2, showToast.body);
        protoAdapter.encodeWithTag(protoWriter, 3, showToast.action_button_title);
        protoAdapter.encodeWithTag(protoWriter, 4, showToast.tap_client_route);
        protoWriter.writeBytes(showToast.unknownFields());
    }
}
