package com.squareup.protos.cash.local.activity;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$OrderLine$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppLocalOrderRenderData.OrderLine((String) obj, (Integer) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData.OrderLine orderLine = (CashAppLocalOrderRenderData.OrderLine) obj;
        reverseProtoWriter.getClass();
        orderLine.getClass();
        reverseProtoWriter.writeBytes(orderLine.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, orderLine.total_price);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, orderLine.quantity);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, orderLine.item_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData.OrderLine orderLine = (CashAppLocalOrderRenderData.OrderLine) obj;
        orderLine.getClass();
        return Money.ADAPTER.encodedSizeWithTag(3, orderLine.total_price) + ProtoAdapter.INT32.encodedSizeWithTag(2, orderLine.quantity) + ProtoAdapter.STRING.encodedSizeWithTag(1, orderLine.item_name) + orderLine.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.OrderLine orderLine = (CashAppLocalOrderRenderData.OrderLine) obj;
        orderLine.getClass();
        Money money = orderLine.total_price;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = orderLine.item_name;
        Integer num = orderLine.quantity;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.OrderLine(str, num, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.OrderLine orderLine = (CashAppLocalOrderRenderData.OrderLine) obj;
        orderLine.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, orderLine.item_name);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, orderLine.quantity);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, orderLine.total_price);
        protoWriter.writeBytes(orderLine.unknownFields());
    }
}
