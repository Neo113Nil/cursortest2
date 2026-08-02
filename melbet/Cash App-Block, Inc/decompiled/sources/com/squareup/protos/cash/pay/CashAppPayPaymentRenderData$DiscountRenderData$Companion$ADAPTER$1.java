package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayPaymentRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayPaymentRenderData$DiscountRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayPaymentRenderData.DiscountRenderData((Money) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayPaymentRenderData.DiscountRenderData discountRenderData = (CashAppPayPaymentRenderData.DiscountRenderData) obj;
        reverseProtoWriter.getClass();
        discountRenderData.getClass();
        reverseProtoWriter.writeBytes(discountRenderData.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, discountRenderData.total_discount_money);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, discountRenderData.incentive_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayPaymentRenderData.DiscountRenderData discountRenderData = (CashAppPayPaymentRenderData.DiscountRenderData) obj;
        discountRenderData.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, discountRenderData.total_discount_money) + ProtoAdapter.STRING.encodedSizeWithTag(1, discountRenderData.incentive_id) + discountRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayPaymentRenderData.DiscountRenderData discountRenderData = (CashAppPayPaymentRenderData.DiscountRenderData) obj;
        discountRenderData.getClass();
        Money money = discountRenderData.total_discount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = discountRenderData.incentive_id;
        byteString.getClass();
        return new CashAppPayPaymentRenderData.DiscountRenderData(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayPaymentRenderData.DiscountRenderData discountRenderData = (CashAppPayPaymentRenderData.DiscountRenderData) obj;
        discountRenderData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, discountRenderData.incentive_id);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, discountRenderData.total_discount_money);
        protoWriter.writeBytes(discountRenderData.unknownFields());
    }
}
