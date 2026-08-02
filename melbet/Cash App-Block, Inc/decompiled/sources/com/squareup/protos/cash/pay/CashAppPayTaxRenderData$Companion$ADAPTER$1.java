package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayTaxRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayTaxRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayTaxRenderData((String) obj, (String) obj2, (Money) obj3, (CashAppPayTaxRenderData.Scope) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = CashAppPayTaxRenderData.Scope.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayTaxRenderData cashAppPayTaxRenderData = (CashAppPayTaxRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayTaxRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayTaxRenderData.unknownFields());
        CashAppPayTaxRenderData.Scope.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cashAppPayTaxRenderData.scope);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashAppPayTaxRenderData.amount_money);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppPayTaxRenderData.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayTaxRenderData.uid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayTaxRenderData cashAppPayTaxRenderData = (CashAppPayTaxRenderData) obj;
        cashAppPayTaxRenderData.getClass();
        int size$okio = cashAppPayTaxRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CashAppPayTaxRenderData.Scope.ADAPTER.encodedSizeWithTag(4, cashAppPayTaxRenderData.scope) + Money.ADAPTER.encodedSizeWithTag(3, cashAppPayTaxRenderData.amount_money) + protoAdapter.encodedSizeWithTag(2, cashAppPayTaxRenderData.name) + protoAdapter.encodedSizeWithTag(1, cashAppPayTaxRenderData.uid) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayTaxRenderData cashAppPayTaxRenderData = (CashAppPayTaxRenderData) obj;
        cashAppPayTaxRenderData.getClass();
        Money money = cashAppPayTaxRenderData.amount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayTaxRenderData.uid;
        String str2 = cashAppPayTaxRenderData.name;
        CashAppPayTaxRenderData.Scope scope = cashAppPayTaxRenderData.scope;
        byteString.getClass();
        return new CashAppPayTaxRenderData(str, str2, money2, scope, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayTaxRenderData cashAppPayTaxRenderData = (CashAppPayTaxRenderData) obj;
        cashAppPayTaxRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayTaxRenderData.uid);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayTaxRenderData.name);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, cashAppPayTaxRenderData.amount_money);
        CashAppPayTaxRenderData.Scope.ADAPTER.encodeWithTag(protoWriter, 4, cashAppPayTaxRenderData.scope);
        protoWriter.writeBytes(cashAppPayTaxRenderData.unknownFields());
    }
}
