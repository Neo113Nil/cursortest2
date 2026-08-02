package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCashEarningsConfiguration$Tier$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalCashEarningsConfiguration.Tier((LocalMoney) obj, (Long) obj2, (LocalMoney) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashEarningsConfiguration.Tier tier = (LocalCashEarningsConfiguration.Tier) obj;
        reverseProtoWriter.getClass();
        tier.getClass();
        reverseProtoWriter.writeBytes(tier.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, tier.earning_rate_bps);
        ProtoAdapter protoAdapter2 = LocalMoney.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, tier.cap_absolute_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, tier.cap_subtotal_multiplier_bps);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, tier.subtotal_threshold);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashEarningsConfiguration.Tier tier = (LocalCashEarningsConfiguration.Tier) obj;
        tier.getClass();
        int size$okio = tier.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, tier.subtotal_threshold) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(4, tier.earning_rate_bps) + protoAdapter.encodedSizeWithTag(3, tier.cap_absolute_amount) + protoAdapter2.encodedSizeWithTag(2, tier.cap_subtotal_multiplier_bps) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashEarningsConfiguration.Tier tier = (LocalCashEarningsConfiguration.Tier) obj;
        tier.getClass();
        LocalMoney localMoney = tier.subtotal_threshold;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        LocalMoney localMoney3 = tier.cap_absolute_amount;
        LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = tier.cap_subtotal_multiplier_bps;
        Long l2 = tier.earning_rate_bps;
        byteString.getClass();
        return new LocalCashEarningsConfiguration.Tier(localMoney2, l, localMoney4, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashEarningsConfiguration.Tier tier = (LocalCashEarningsConfiguration.Tier) obj;
        tier.getClass();
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, tier.subtotal_threshold);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, tier.cap_subtotal_multiplier_bps);
        protoAdapter.encodeWithTag(protoWriter, 3, tier.cap_absolute_amount);
        protoAdapter2.encodeWithTag(protoWriter, 4, tier.earning_rate_bps);
        protoWriter.writeBytes(tier.unknownFields());
    }
}
