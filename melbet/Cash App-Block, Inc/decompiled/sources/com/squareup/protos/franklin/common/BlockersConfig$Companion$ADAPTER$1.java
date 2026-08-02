package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BlockersConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BlockersConfig((Boolean) obj, (String) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BlockersConfig blockersConfig = (BlockersConfig) obj;
        reverseProtoWriter.getClass();
        blockersConfig.getClass();
        reverseProtoWriter.writeBytes(blockersConfig.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, blockersConfig.target_balance_amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, blockersConfig.add_cash_header_text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, blockersConfig.address_typeahead_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BlockersConfig blockersConfig = (BlockersConfig) obj;
        blockersConfig.getClass();
        return Money.ADAPTER.encodedSizeWithTag(3, blockersConfig.target_balance_amount) + ProtoAdapter.STRING.encodedSizeWithTag(2, blockersConfig.add_cash_header_text) + ProtoAdapter.BOOL.encodedSizeWithTag(1, blockersConfig.address_typeahead_enabled) + blockersConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlockersConfig blockersConfig = (BlockersConfig) obj;
        blockersConfig.getClass();
        Money money = blockersConfig.target_balance_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = blockersConfig.address_typeahead_enabled;
        String str = blockersConfig.add_cash_header_text;
        byteString.getClass();
        return new BlockersConfig(bool, str, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlockersConfig blockersConfig = (BlockersConfig) obj;
        blockersConfig.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, blockersConfig.address_typeahead_enabled);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, blockersConfig.add_cash_header_text);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, blockersConfig.target_balance_amount);
        protoWriter.writeBytes(blockersConfig.unknownFields());
    }
}
