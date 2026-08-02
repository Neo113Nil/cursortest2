package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShareSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShareSheet((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ShareSheet shareSheet = (ShareSheet) obj;
        reverseProtoWriter.getClass();
        shareSheet.getClass();
        reverseProtoWriter.writeBytes(shareSheet.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shareSheet.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shareSheet.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShareSheet shareSheet = (ShareSheet) obj;
        shareSheet.getClass();
        int size$okio = shareSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, shareSheet.url) + protoAdapter.encodedSizeWithTag(1, shareSheet.message) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShareSheet shareSheet = (ShareSheet) obj;
        shareSheet.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = shareSheet.message;
        String str2 = shareSheet.url;
        byteString.getClass();
        return new ShareSheet(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShareSheet shareSheet = (ShareSheet) obj;
        shareSheet.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shareSheet.message);
        protoAdapter.encodeWithTag(protoWriter, 2, shareSheet.url);
        protoWriter.writeBytes(shareSheet.unknownFields());
    }
}
