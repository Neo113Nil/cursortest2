package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayPayoutRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayPayoutRenderData((String) obj, (CashAppPayMerchantRenderData) obj2, (Money) obj3, (Long) obj4, (String) obj5, (CashAppPayInstrumentRenderData) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(CashAppPayMerchantRenderData.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(CashAppPayInstrumentRenderData.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayPayoutRenderData cashAppPayPayoutRenderData = (CashAppPayPayoutRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayPayoutRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayPayoutRenderData.unknownFields());
        CashAppPayInstrumentRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cashAppPayPayoutRenderData.destination_instrument);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cashAppPayPayoutRenderData.note);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, cashAppPayPayoutRenderData.display_date);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashAppPayPayoutRenderData.payout_money);
        CashAppPayMerchantRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashAppPayPayoutRenderData.merchant);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayPayoutRenderData.payout_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayPayoutRenderData cashAppPayPayoutRenderData = (CashAppPayPayoutRenderData) obj;
        cashAppPayPayoutRenderData.getClass();
        int size$okio = cashAppPayPayoutRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CashAppPayInstrumentRenderData.ADAPTER.encodedSizeWithTag(6, cashAppPayPayoutRenderData.destination_instrument) + protoAdapter.encodedSizeWithTag(5, cashAppPayPayoutRenderData.note) + ProtoAdapter.INT64.encodedSizeWithTag(4, cashAppPayPayoutRenderData.display_date) + Money.ADAPTER.encodedSizeWithTag(3, cashAppPayPayoutRenderData.payout_money) + CashAppPayMerchantRenderData.ADAPTER.encodedSizeWithTag(2, cashAppPayPayoutRenderData.merchant) + protoAdapter.encodedSizeWithTag(1, cashAppPayPayoutRenderData.payout_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayPayoutRenderData cashAppPayPayoutRenderData = (CashAppPayPayoutRenderData) obj;
        cashAppPayPayoutRenderData.getClass();
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = cashAppPayPayoutRenderData.merchant;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData2 = cashAppPayMerchantRenderData != null ? (CashAppPayMerchantRenderData) CashAppPayMerchantRenderData.ADAPTER.redact(cashAppPayMerchantRenderData) : null;
        Money money = cashAppPayPayoutRenderData.payout_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = cashAppPayPayoutRenderData.destination_instrument;
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData2 = cashAppPayInstrumentRenderData != null ? (CashAppPayInstrumentRenderData) CashAppPayInstrumentRenderData.ADAPTER.redact(cashAppPayInstrumentRenderData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayPayoutRenderData.payout_id;
        Long l = cashAppPayPayoutRenderData.display_date;
        String str2 = cashAppPayPayoutRenderData.note;
        byteString.getClass();
        return new CashAppPayPayoutRenderData(str, cashAppPayMerchantRenderData2, money2, l, str2, cashAppPayInstrumentRenderData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayPayoutRenderData cashAppPayPayoutRenderData = (CashAppPayPayoutRenderData) obj;
        cashAppPayPayoutRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayPayoutRenderData.payout_id);
        CashAppPayMerchantRenderData.ADAPTER.encodeWithTag(protoWriter, 2, cashAppPayPayoutRenderData.merchant);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, cashAppPayPayoutRenderData.payout_money);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, cashAppPayPayoutRenderData.display_date);
        protoAdapter.encodeWithTag(protoWriter, 5, cashAppPayPayoutRenderData.note);
        CashAppPayInstrumentRenderData.ADAPTER.encodeWithTag(protoWriter, 6, cashAppPayPayoutRenderData.destination_instrument);
        protoWriter.writeBytes(cashAppPayPayoutRenderData.unknownFields());
    }
}
