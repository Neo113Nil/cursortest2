package com.squareup.protos.cash.blockly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.blockly.common.BlockType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BlocklyCustomer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BlocklyCustomer((Boolean) obj, (BlocklyCustomerMetadata) obj2, (String) obj3, (String) obj4, (BlockType) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BlocklyCustomerMetadata.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = BlockType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BlocklyCustomer blocklyCustomer = (BlocklyCustomer) obj;
        reverseProtoWriter.getClass();
        blocklyCustomer.getClass();
        reverseProtoWriter.writeBytes(blocklyCustomer.unknownFields());
        BlockType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, blocklyCustomer.block_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, blocklyCustomer.flow_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, blocklyCustomer.blocker_override_customer_token);
        BlocklyCustomerMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 2, blocklyCustomer.metadata);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, blocklyCustomer.is_blocked);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BlocklyCustomer blocklyCustomer = (BlocklyCustomer) obj;
        blocklyCustomer.getClass();
        int encodedSizeWithTag = BlocklyCustomerMetadata.ADAPTER.encodedSizeWithTag(2, blocklyCustomer.metadata) + ProtoAdapter.BOOL.encodedSizeWithTag(1, blocklyCustomer.is_blocked) + blocklyCustomer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return BlockType.ADAPTER.encodedSizeWithTag(5, blocklyCustomer.block_type) + protoAdapter.encodedSizeWithTag(4, blocklyCustomer.flow_url) + protoAdapter.encodedSizeWithTag(3, blocklyCustomer.blocker_override_customer_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlocklyCustomer blocklyCustomer = (BlocklyCustomer) obj;
        blocklyCustomer.getClass();
        BlocklyCustomerMetadata blocklyCustomerMetadata = blocklyCustomer.metadata;
        BlocklyCustomerMetadata blocklyCustomerMetadata2 = blocklyCustomerMetadata != null ? (BlocklyCustomerMetadata) BlocklyCustomerMetadata.ADAPTER.redact(blocklyCustomerMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = blocklyCustomer.is_blocked;
        String str = blocklyCustomer.blocker_override_customer_token;
        String str2 = blocklyCustomer.flow_url;
        BlockType blockType = blocklyCustomer.block_type;
        byteString.getClass();
        return new BlocklyCustomer(bool, blocklyCustomerMetadata2, str, str2, blockType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlocklyCustomer blocklyCustomer = (BlocklyCustomer) obj;
        blocklyCustomer.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, blocklyCustomer.is_blocked);
        BlocklyCustomerMetadata.ADAPTER.encodeWithTag(protoWriter, 2, blocklyCustomer.metadata);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, blocklyCustomer.blocker_override_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 4, blocklyCustomer.flow_url);
        BlockType.ADAPTER.encodeWithTag(protoWriter, 5, blocklyCustomer.block_type);
        protoWriter.writeBytes(blocklyCustomer.unknownFields());
    }
}
