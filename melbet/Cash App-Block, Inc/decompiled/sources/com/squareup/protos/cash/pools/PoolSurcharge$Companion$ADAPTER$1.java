package com.squareup.protos.cash.pools;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PoolSurcharge$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PoolSurcharge((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PoolSurcharge poolSurcharge = (PoolSurcharge) obj;
        reverseProtoWriter.getClass();
        poolSurcharge.getClass();
        reverseProtoWriter.writeBytes(poolSurcharge.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, poolSurcharge.in_network_p2p_credit_card_fee_bps);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PoolSurcharge poolSurcharge = (PoolSurcharge) obj;
        poolSurcharge.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, poolSurcharge.in_network_p2p_credit_card_fee_bps) + poolSurcharge.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PoolSurcharge poolSurcharge = (PoolSurcharge) obj;
        poolSurcharge.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = poolSurcharge.in_network_p2p_credit_card_fee_bps;
        byteString.getClass();
        return new PoolSurcharge(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PoolSurcharge poolSurcharge = (PoolSurcharge) obj;
        poolSurcharge.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, poolSurcharge.in_network_p2p_credit_card_fee_bps);
        protoWriter.writeBytes(poolSurcharge.unknownFields());
    }
}
