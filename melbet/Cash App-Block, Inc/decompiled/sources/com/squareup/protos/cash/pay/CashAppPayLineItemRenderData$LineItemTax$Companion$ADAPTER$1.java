package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayLineItemRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayLineItemRenderData$LineItemTax$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayLineItemRenderData.LineItemTax((Money) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CashAppPayLineItemRenderData.LineItemTax lineItemTax = (CashAppPayLineItemRenderData.LineItemTax) obj;
        reverseProtoWriter.getClass();
        lineItemTax.getClass();
        reverseProtoWriter.writeBytes(lineItemTax.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, lineItemTax.amount_money);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, lineItemTax.tax_uid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayLineItemRenderData.LineItemTax lineItemTax = (CashAppPayLineItemRenderData.LineItemTax) obj;
        lineItemTax.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, lineItemTax.amount_money) + ProtoAdapter.STRING.encodedSizeWithTag(1, lineItemTax.tax_uid) + lineItemTax.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayLineItemRenderData.LineItemTax lineItemTax = (CashAppPayLineItemRenderData.LineItemTax) obj;
        lineItemTax.getClass();
        Money money = lineItemTax.amount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = lineItemTax.tax_uid;
        byteString.getClass();
        return new CashAppPayLineItemRenderData.LineItemTax(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayLineItemRenderData.LineItemTax lineItemTax = (CashAppPayLineItemRenderData.LineItemTax) obj;
        lineItemTax.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, lineItemTax.tax_uid);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, lineItemTax.amount_money);
        protoWriter.writeBytes(lineItemTax.unknownFields());
    }
}
