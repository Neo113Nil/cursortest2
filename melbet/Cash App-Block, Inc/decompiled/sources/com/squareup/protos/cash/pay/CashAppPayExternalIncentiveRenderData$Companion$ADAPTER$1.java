package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayExternalIncentiveRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayExternalIncentiveRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayExternalIncentiveRenderData((String) obj, (String) obj2, (Money) obj3, (Integer) obj4, (CashAppPayExternalIncentiveRenderData.Scope) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = CashAppPayExternalIncentiveRenderData.Scope.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayExternalIncentiveRenderData cashAppPayExternalIncentiveRenderData = (CashAppPayExternalIncentiveRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayExternalIncentiveRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayExternalIncentiveRenderData.unknownFields());
        CashAppPayExternalIncentiveRenderData.Scope.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashAppPayExternalIncentiveRenderData.scope);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 4, cashAppPayExternalIncentiveRenderData.bps);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashAppPayExternalIncentiveRenderData.amount_money);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppPayExternalIncentiveRenderData.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayExternalIncentiveRenderData.uid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayExternalIncentiveRenderData cashAppPayExternalIncentiveRenderData = (CashAppPayExternalIncentiveRenderData) obj;
        cashAppPayExternalIncentiveRenderData.getClass();
        int size$okio = cashAppPayExternalIncentiveRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CashAppPayExternalIncentiveRenderData.Scope.ADAPTER.encodedSizeWithTag(5, cashAppPayExternalIncentiveRenderData.scope) + ProtoAdapter.UINT32.encodedSizeWithTag(4, cashAppPayExternalIncentiveRenderData.bps) + Money.ADAPTER.encodedSizeWithTag(3, cashAppPayExternalIncentiveRenderData.amount_money) + protoAdapter.encodedSizeWithTag(2, cashAppPayExternalIncentiveRenderData.name) + protoAdapter.encodedSizeWithTag(1, cashAppPayExternalIncentiveRenderData.uid) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayExternalIncentiveRenderData cashAppPayExternalIncentiveRenderData = (CashAppPayExternalIncentiveRenderData) obj;
        cashAppPayExternalIncentiveRenderData.getClass();
        Money money = cashAppPayExternalIncentiveRenderData.amount_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayExternalIncentiveRenderData.uid;
        String str2 = cashAppPayExternalIncentiveRenderData.name;
        Integer num = cashAppPayExternalIncentiveRenderData.bps;
        CashAppPayExternalIncentiveRenderData.Scope scope = cashAppPayExternalIncentiveRenderData.scope;
        byteString.getClass();
        return new CashAppPayExternalIncentiveRenderData(str, str2, money2, num, scope, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayExternalIncentiveRenderData cashAppPayExternalIncentiveRenderData = (CashAppPayExternalIncentiveRenderData) obj;
        cashAppPayExternalIncentiveRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayExternalIncentiveRenderData.uid);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayExternalIncentiveRenderData.name);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, cashAppPayExternalIncentiveRenderData.amount_money);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, cashAppPayExternalIncentiveRenderData.bps);
        CashAppPayExternalIncentiveRenderData.Scope.ADAPTER.encodeWithTag(protoWriter, 5, cashAppPayExternalIncentiveRenderData.scope);
        protoWriter.writeBytes(cashAppPayExternalIncentiveRenderData.unknownFields());
    }
}
