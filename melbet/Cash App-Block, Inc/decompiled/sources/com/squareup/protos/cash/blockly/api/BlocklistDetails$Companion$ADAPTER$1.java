package com.squareup.protos.cash.blockly.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BlocklistDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BlocklistDetails((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BlocklistDetails blocklistDetails = (BlocklistDetails) obj;
        reverseProtoWriter.getClass();
        blocklistDetails.getClass();
        reverseProtoWriter.writeBytes(blocklistDetails.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, blocklistDetails.support_page_client_route_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BlocklistDetails blocklistDetails = (BlocklistDetails) obj;
        blocklistDetails.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, blocklistDetails.support_page_client_route_url) + blocklistDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlocklistDetails blocklistDetails = (BlocklistDetails) obj;
        blocklistDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = blocklistDetails.support_page_client_route_url;
        byteString.getClass();
        return new BlocklistDetails(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlocklistDetails blocklistDetails = (BlocklistDetails) obj;
        blocklistDetails.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blocklistDetails.support_page_client_route_url);
        protoWriter.writeBytes(blocklistDetails.unknownFields());
    }
}
