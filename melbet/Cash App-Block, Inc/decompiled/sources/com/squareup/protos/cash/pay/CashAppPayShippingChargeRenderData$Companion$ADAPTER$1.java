package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayShippingChargeRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayShippingChargeRenderData((Money) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        CashAppPayShippingChargeRenderData cashAppPayShippingChargeRenderData = (CashAppPayShippingChargeRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayShippingChargeRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayShippingChargeRenderData.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashAppPayShippingChargeRenderData.amount_money);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppPayShippingChargeRenderData.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayShippingChargeRenderData.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayShippingChargeRenderData cashAppPayShippingChargeRenderData = (CashAppPayShippingChargeRenderData) obj;
        cashAppPayShippingChargeRenderData.getClass();
        int size$okio = cashAppPayShippingChargeRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(3, cashAppPayShippingChargeRenderData.amount_money) + protoAdapter.encodedSizeWithTag(2, cashAppPayShippingChargeRenderData.description) + protoAdapter.encodedSizeWithTag(1, cashAppPayShippingChargeRenderData.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayShippingChargeRenderData cashAppPayShippingChargeRenderData = (CashAppPayShippingChargeRenderData) obj;
        cashAppPayShippingChargeRenderData.getClass();
        Money money = cashAppPayShippingChargeRenderData.amount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayShippingChargeRenderData.name;
        String str2 = cashAppPayShippingChargeRenderData.description;
        byteString.getClass();
        return new CashAppPayShippingChargeRenderData(money2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayShippingChargeRenderData cashAppPayShippingChargeRenderData = (CashAppPayShippingChargeRenderData) obj;
        cashAppPayShippingChargeRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayShippingChargeRenderData.name);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayShippingChargeRenderData.description);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, cashAppPayShippingChargeRenderData.amount_money);
        protoWriter.writeBytes(cashAppPayShippingChargeRenderData.unknownFields());
    }
}
