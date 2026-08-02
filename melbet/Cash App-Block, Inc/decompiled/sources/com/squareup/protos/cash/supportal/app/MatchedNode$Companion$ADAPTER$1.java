package com.squareup.protos.cash.supportal.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MatchedNode$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MatchedNode((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MatchedNode matchedNode = (MatchedNode) obj;
        reverseProtoWriter.getClass();
        matchedNode.getClass();
        reverseProtoWriter.writeBytes(matchedNode.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, matchedNode.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, matchedNode.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, matchedNode.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MatchedNode matchedNode = (MatchedNode) obj;
        matchedNode.getClass();
        int size$okio = matchedNode.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, matchedNode.subtitle) + protoAdapter.encodedSizeWithTag(2, matchedNode.title) + protoAdapter.encodedSizeWithTag(1, matchedNode.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MatchedNode matchedNode = (MatchedNode) obj;
        matchedNode.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = matchedNode.token;
        String str2 = matchedNode.title;
        String str3 = matchedNode.subtitle;
        byteString.getClass();
        return new MatchedNode(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MatchedNode matchedNode = (MatchedNode) obj;
        matchedNode.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, matchedNode.token);
        protoAdapter.encodeWithTag(protoWriter, 2, matchedNode.title);
        protoAdapter.encodeWithTag(protoWriter, 3, matchedNode.subtitle);
        protoWriter.writeBytes(matchedNode.unknownFields());
    }
}
