package com.squareup.protos.cash.blockly.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AllowlistCustomer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AllowlistCustomer((BlocklyCustomerMetadata) obj, (Boolean) obj2, (String) obj3, (Long) obj4, (Long) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(BlocklyCustomerMetadata.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AllowlistCustomer allowlistCustomer = (AllowlistCustomer) obj;
        reverseProtoWriter.getClass();
        allowlistCustomer.getClass();
        reverseProtoWriter.writeBytes(allowlistCustomer.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, allowlistCustomer.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, allowlistCustomer.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, allowlistCustomer.created_at);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, allowlistCustomer.updated_by_customer_token);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, allowlistCustomer.is_in_allowlist);
        BlocklyCustomerMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, allowlistCustomer.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AllowlistCustomer allowlistCustomer = (AllowlistCustomer) obj;
        allowlistCustomer.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, allowlistCustomer.updated_by_customer_token) + ProtoAdapter.BOOL.encodedSizeWithTag(2, allowlistCustomer.is_in_allowlist) + BlocklyCustomerMetadata.ADAPTER.encodedSizeWithTag(1, allowlistCustomer.metadata) + allowlistCustomer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(6, allowlistCustomer.version) + protoAdapter.encodedSizeWithTag(5, allowlistCustomer.updated_at) + protoAdapter.encodedSizeWithTag(4, allowlistCustomer.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AllowlistCustomer allowlistCustomer = (AllowlistCustomer) obj;
        allowlistCustomer.getClass();
        BlocklyCustomerMetadata blocklyCustomerMetadata = allowlistCustomer.metadata;
        return AllowlistCustomer.copy$default(allowlistCustomer, blocklyCustomerMetadata != null ? (BlocklyCustomerMetadata) BlocklyCustomerMetadata.ADAPTER.redact(blocklyCustomerMetadata) : null, null, ByteString.EMPTY, 62);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AllowlistCustomer allowlistCustomer = (AllowlistCustomer) obj;
        allowlistCustomer.getClass();
        BlocklyCustomerMetadata.ADAPTER.encodeWithTag(protoWriter, 1, allowlistCustomer.metadata);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, allowlistCustomer.is_in_allowlist);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, allowlistCustomer.updated_by_customer_token);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 4, allowlistCustomer.created_at);
        protoAdapter.encodeWithTag(protoWriter, 5, allowlistCustomer.updated_at);
        protoAdapter.encodeWithTag(protoWriter, 6, allowlistCustomer.version);
        protoWriter.writeBytes(allowlistCustomer.unknownFields());
    }
}
