package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItem$PreorderingItemSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItem.PreorderingItemSummary((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LocalMenuItem.PreorderingItemSummary preorderingItemSummary = (LocalMenuItem.PreorderingItemSummary) obj;
        reverseProtoWriter.getClass();
        preorderingItemSummary.getClass();
        reverseProtoWriter.writeBytes(preorderingItemSummary.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, preorderingItemSummary.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, preorderingItemSummary.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItem.PreorderingItemSummary preorderingItemSummary = (LocalMenuItem.PreorderingItemSummary) obj;
        preorderingItemSummary.getClass();
        int size$okio = preorderingItemSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, preorderingItemSummary.description) + protoAdapter.encodedSizeWithTag(1, preorderingItemSummary.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItem.PreorderingItemSummary preorderingItemSummary = (LocalMenuItem.PreorderingItemSummary) obj;
        preorderingItemSummary.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = preorderingItemSummary.title;
        String str2 = preorderingItemSummary.description;
        byteString.getClass();
        return new LocalMenuItem.PreorderingItemSummary(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItem.PreorderingItemSummary preorderingItemSummary = (LocalMenuItem.PreorderingItemSummary) obj;
        preorderingItemSummary.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, preorderingItemSummary.title);
        protoAdapter.encodeWithTag(protoWriter, 2, preorderingItemSummary.description);
        protoWriter.writeBytes(preorderingItemSummary.unknownFields());
    }
}
