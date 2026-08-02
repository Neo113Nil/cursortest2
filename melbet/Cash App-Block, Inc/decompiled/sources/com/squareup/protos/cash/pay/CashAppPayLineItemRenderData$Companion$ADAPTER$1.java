package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayLineItemRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayLineItemRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayLineItemRenderData((String) obj, (String) obj2, (String) obj3, (Money) obj4, (String) obj5, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    m.add(CashAppPayLineItemRenderData.LineItemIncentive.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    arrayList.add(CashAppPayLineItemRenderData.LineItemTax.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayLineItemRenderData cashAppPayLineItemRenderData = (CashAppPayLineItemRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayLineItemRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayLineItemRenderData.unknownFields());
        CashAppPayLineItemRenderData.LineItemTax.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, cashAppPayLineItemRenderData.taxes);
        CashAppPayLineItemRenderData.LineItemIncentive.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, cashAppPayLineItemRenderData.incentives);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cashAppPayLineItemRenderData.image_url);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cashAppPayLineItemRenderData.amount_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashAppPayLineItemRenderData.quantity);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppPayLineItemRenderData.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayLineItemRenderData.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayLineItemRenderData cashAppPayLineItemRenderData = (CashAppPayLineItemRenderData) obj;
        cashAppPayLineItemRenderData.getClass();
        int size$okio = cashAppPayLineItemRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CashAppPayLineItemRenderData.LineItemTax.ADAPTER.asRepeated().encodedSizeWithTag(7, cashAppPayLineItemRenderData.taxes) + CashAppPayLineItemRenderData.LineItemIncentive.ADAPTER.asRepeated().encodedSizeWithTag(6, cashAppPayLineItemRenderData.incentives) + protoAdapter.encodedSizeWithTag(5, cashAppPayLineItemRenderData.image_url) + Money.ADAPTER.encodedSizeWithTag(4, cashAppPayLineItemRenderData.amount_money) + protoAdapter.encodedSizeWithTag(3, cashAppPayLineItemRenderData.quantity) + protoAdapter.encodedSizeWithTag(2, cashAppPayLineItemRenderData.description) + protoAdapter.encodedSizeWithTag(1, cashAppPayLineItemRenderData.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayLineItemRenderData cashAppPayLineItemRenderData = (CashAppPayLineItemRenderData) obj;
        cashAppPayLineItemRenderData.getClass();
        Money money = cashAppPayLineItemRenderData.amount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashAppPayLineItemRenderData.incentives, CashAppPayLineItemRenderData.LineItemIncentive.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cashAppPayLineItemRenderData.taxes, CashAppPayLineItemRenderData.LineItemTax.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayLineItemRenderData.name;
        String str2 = cashAppPayLineItemRenderData.description;
        String str3 = cashAppPayLineItemRenderData.quantity;
        String str4 = cashAppPayLineItemRenderData.image_url;
        byteString.getClass();
        return new CashAppPayLineItemRenderData(str, str2, str3, money2, str4, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayLineItemRenderData cashAppPayLineItemRenderData = (CashAppPayLineItemRenderData) obj;
        cashAppPayLineItemRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayLineItemRenderData.name);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayLineItemRenderData.description);
        protoAdapter.encodeWithTag(protoWriter, 3, cashAppPayLineItemRenderData.quantity);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, cashAppPayLineItemRenderData.amount_money);
        protoAdapter.encodeWithTag(protoWriter, 5, cashAppPayLineItemRenderData.image_url);
        CashAppPayLineItemRenderData.LineItemIncentive.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, cashAppPayLineItemRenderData.incentives);
        CashAppPayLineItemRenderData.LineItemTax.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, cashAppPayLineItemRenderData.taxes);
        protoWriter.writeBytes(cashAppPayLineItemRenderData.unknownFields());
    }
}
