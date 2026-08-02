package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingRenderData$BnplData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LendingRenderData.BnplData((Integer) obj, (Integer) obj2, (Money) obj3, (Money) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingRenderData.BnplData bnplData = (LendingRenderData.BnplData) obj;
        reverseProtoWriter.getClass();
        bnplData.getClass();
        reverseProtoWriter.writeBytes(bnplData.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, bnplData.final_payment);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, bnplData.late_fee);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bnplData.total_purchase_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, bnplData.number_of_payments);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, bnplData.payment_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingRenderData.BnplData bnplData = (LendingRenderData.BnplData) obj;
        bnplData.getClass();
        int size$okio = bnplData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, bnplData.number_of_payments) + protoAdapter.encodedSizeWithTag(1, bnplData.payment_number) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(5, bnplData.final_payment) + protoAdapter2.encodedSizeWithTag(4, bnplData.late_fee) + protoAdapter2.encodedSizeWithTag(3, bnplData.total_purchase_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingRenderData.BnplData bnplData = (LendingRenderData.BnplData) obj;
        bnplData.getClass();
        Money money = bnplData.total_purchase_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = bnplData.late_fee;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = bnplData.payment_number;
        Integer num2 = bnplData.number_of_payments;
        Boolean bool = bnplData.final_payment;
        byteString.getClass();
        return new LendingRenderData.BnplData(num, num2, money2, money4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingRenderData.BnplData bnplData = (LendingRenderData.BnplData) obj;
        bnplData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, bnplData.payment_number);
        protoAdapter.encodeWithTag(protoWriter, 2, bnplData.number_of_payments);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, bnplData.total_purchase_amount);
        protoAdapter2.encodeWithTag(protoWriter, 4, bnplData.late_fee);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, bnplData.final_payment);
        protoWriter.writeBytes(bnplData.unknownFields());
    }
}
