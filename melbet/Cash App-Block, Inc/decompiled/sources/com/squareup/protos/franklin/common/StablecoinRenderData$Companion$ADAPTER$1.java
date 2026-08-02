package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StablecoinRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new StablecoinRenderData((String) obj, (StablecoinRejectReason) obj2, (String) obj3, (String) obj4, (Money) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = StablecoinRejectReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StablecoinRenderData stablecoinRenderData = (StablecoinRenderData) obj;
        reverseProtoWriter.getClass();
        stablecoinRenderData.getClass();
        reverseProtoWriter.writeBytes(stablecoinRenderData.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 5, stablecoinRenderData.source_amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, stablecoinRenderData.exchange_rate);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, stablecoinRenderData.network);
        StablecoinRejectReason.ADAPTER.encodeWithTag(reverseProtoWriter, 2, stablecoinRenderData.reject_reason);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, stablecoinRenderData.block_explorer_link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StablecoinRenderData stablecoinRenderData = (StablecoinRenderData) obj;
        stablecoinRenderData.getClass();
        int size$okio = stablecoinRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(5, stablecoinRenderData.source_amount) + protoAdapter.encodedSizeWithTag(4, stablecoinRenderData.exchange_rate) + protoAdapter.encodedSizeWithTag(3, stablecoinRenderData.network) + StablecoinRejectReason.ADAPTER.encodedSizeWithTag(2, stablecoinRenderData.reject_reason) + protoAdapter.encodedSizeWithTag(1, stablecoinRenderData.block_explorer_link) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StablecoinRenderData stablecoinRenderData = (StablecoinRenderData) obj;
        stablecoinRenderData.getClass();
        Money money = stablecoinRenderData.source_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = stablecoinRenderData.block_explorer_link;
        StablecoinRejectReason stablecoinRejectReason = stablecoinRenderData.reject_reason;
        String str2 = stablecoinRenderData.network;
        String str3 = stablecoinRenderData.exchange_rate;
        byteString.getClass();
        return new StablecoinRenderData(str, stablecoinRejectReason, str2, str3, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StablecoinRenderData stablecoinRenderData = (StablecoinRenderData) obj;
        stablecoinRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, stablecoinRenderData.block_explorer_link);
        StablecoinRejectReason.ADAPTER.encodeWithTag(protoWriter, 2, stablecoinRenderData.reject_reason);
        protoAdapter.encodeWithTag(protoWriter, 3, stablecoinRenderData.network);
        protoAdapter.encodeWithTag(protoWriter, 4, stablecoinRenderData.exchange_rate);
        Money.ADAPTER.encodeWithTag(protoWriter, 5, stablecoinRenderData.source_amount);
        protoWriter.writeBytes(stablecoinRenderData.unknownFields());
    }
}
