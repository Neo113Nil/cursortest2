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
public final class CashAppPayLineItemRenderData$LineItemIncentive$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayLineItemRenderData.LineItemIncentive((Money) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CashAppPayLineItemRenderData.LineItemIncentive lineItemIncentive = (CashAppPayLineItemRenderData.LineItemIncentive) obj;
        reverseProtoWriter.getClass();
        lineItemIncentive.getClass();
        reverseProtoWriter.writeBytes(lineItemIncentive.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, lineItemIncentive.amount_money);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, lineItemIncentive.external_incentive_uid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayLineItemRenderData.LineItemIncentive lineItemIncentive = (CashAppPayLineItemRenderData.LineItemIncentive) obj;
        lineItemIncentive.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, lineItemIncentive.amount_money) + ProtoAdapter.STRING.encodedSizeWithTag(1, lineItemIncentive.external_incentive_uid) + lineItemIncentive.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayLineItemRenderData.LineItemIncentive lineItemIncentive = (CashAppPayLineItemRenderData.LineItemIncentive) obj;
        lineItemIncentive.getClass();
        Money money = lineItemIncentive.amount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = lineItemIncentive.external_incentive_uid;
        byteString.getClass();
        return new CashAppPayLineItemRenderData.LineItemIncentive(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayLineItemRenderData.LineItemIncentive lineItemIncentive = (CashAppPayLineItemRenderData.LineItemIncentive) obj;
        lineItemIncentive.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, lineItemIncentive.external_incentive_uid);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, lineItemIncentive.amount_money);
        protoWriter.writeBytes(lineItemIncentive.unknownFields());
    }
}
