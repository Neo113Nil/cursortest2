package com.squareup.protos.cash.blockly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BlocklyCustomerMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BlocklyCustomerMetadata((String) obj, (String) obj2, (String) obj3, (Cashtag) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                obj4 = TransactorKt.decodeMessageOrMerge(Cashtag.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BlocklyCustomerMetadata blocklyCustomerMetadata = (BlocklyCustomerMetadata) obj;
        reverseProtoWriter.getClass();
        blocklyCustomerMetadata.getClass();
        reverseProtoWriter.writeBytes(blocklyCustomerMetadata.unknownFields());
        Cashtag.ADAPTER.encodeWithTag(reverseProtoWriter, 4, blocklyCustomerMetadata.cashtag);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, blocklyCustomerMetadata.full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, blocklyCustomerMetadata.profile_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, blocklyCustomerMetadata.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BlocklyCustomerMetadata blocklyCustomerMetadata = (BlocklyCustomerMetadata) obj;
        blocklyCustomerMetadata.getClass();
        int size$okio = blocklyCustomerMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Cashtag.ADAPTER.encodedSizeWithTag(4, blocklyCustomerMetadata.cashtag) + protoAdapter.encodedSizeWithTag(3, blocklyCustomerMetadata.full_name) + protoAdapter.encodedSizeWithTag(2, blocklyCustomerMetadata.profile_photo_url) + protoAdapter.encodedSizeWithTag(1, blocklyCustomerMetadata.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlocklyCustomerMetadata blocklyCustomerMetadata = (BlocklyCustomerMetadata) obj;
        blocklyCustomerMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = blocklyCustomerMetadata.customer_token;
        byteString.getClass();
        return new BlocklyCustomerMetadata(str, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlocklyCustomerMetadata blocklyCustomerMetadata = (BlocklyCustomerMetadata) obj;
        blocklyCustomerMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, blocklyCustomerMetadata.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, blocklyCustomerMetadata.profile_photo_url);
        protoAdapter.encodeWithTag(protoWriter, 3, blocklyCustomerMetadata.full_name);
        Cashtag.ADAPTER.encodeWithTag(protoWriter, 4, blocklyCustomerMetadata.cashtag);
        protoWriter.writeBytes(blocklyCustomerMetadata.unknownFields());
    }
}
