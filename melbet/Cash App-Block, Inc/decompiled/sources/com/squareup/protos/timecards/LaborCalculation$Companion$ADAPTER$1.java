package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LaborCalculation$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LaborCalculation((String) obj, (Long) obj2, (Money) obj3, (Money) obj4, (Money) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LaborCalculation laborCalculation = (LaborCalculation) obj;
        reverseProtoWriter.getClass();
        laborCalculation.getClass();
        reverseProtoWriter.writeBytes(laborCalculation.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, laborCalculation.labor_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, laborCalculation.premium_hourly_rate);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, laborCalculation.base_hourly_rate);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 2, laborCalculation.paid_seconds);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, laborCalculation.job_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LaborCalculation laborCalculation = (LaborCalculation) obj;
        laborCalculation.getClass();
        int encodedSizeWithTag = ProtoAdapter.UINT64.encodedSizeWithTag(2, laborCalculation.paid_seconds) + ProtoAdapter.STRING.encodedSizeWithTag(1, laborCalculation.job_title) + laborCalculation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, laborCalculation.labor_money) + protoAdapter.encodedSizeWithTag(4, laborCalculation.premium_hourly_rate) + protoAdapter.encodedSizeWithTag(3, laborCalculation.base_hourly_rate) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LaborCalculation laborCalculation = (LaborCalculation) obj;
        laborCalculation.getClass();
        Money money = laborCalculation.base_hourly_rate;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = laborCalculation.premium_hourly_rate;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = laborCalculation.labor_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = laborCalculation.job_title;
        Long l = laborCalculation.paid_seconds;
        byteString.getClass();
        return new LaborCalculation(str, l, money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LaborCalculation laborCalculation = (LaborCalculation) obj;
        laborCalculation.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, laborCalculation.job_title);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, laborCalculation.paid_seconds);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, laborCalculation.base_hourly_rate);
        protoAdapter.encodeWithTag(protoWriter, 4, laborCalculation.premium_hourly_rate);
        protoAdapter.encodeWithTag(protoWriter, 5, laborCalculation.labor_money);
        protoWriter.writeBytes(laborCalculation.unknownFields());
    }
}
