package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingRenderData$ContextCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingRenderData.ContextCard((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LendingRenderData.ContextCard contextCard = (LendingRenderData.ContextCard) obj;
        reverseProtoWriter.getClass();
        contextCard.getClass();
        reverseProtoWriter.writeBytes(contextCard.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, contextCard.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, contextCard.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingRenderData.ContextCard contextCard = (LendingRenderData.ContextCard) obj;
        contextCard.getClass();
        int size$okio = contextCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, contextCard.body) + protoAdapter.encodedSizeWithTag(1, contextCard.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingRenderData.ContextCard contextCard = (LendingRenderData.ContextCard) obj;
        contextCard.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = contextCard.title;
        String str2 = contextCard.body;
        byteString.getClass();
        return new LendingRenderData.ContextCard(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingRenderData.ContextCard contextCard = (LendingRenderData.ContextCard) obj;
        contextCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, contextCard.title);
        protoAdapter.encodeWithTag(protoWriter, 2, contextCard.body);
        protoWriter.writeBytes(contextCard.unknownFields());
    }
}
