package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashLiteCashOutFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashLiteCashOutFlowParameters((String) obj, (Money) obj2, (CashOutType) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = CashOutType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashLiteCashOutFlowParameters cashLiteCashOutFlowParameters = (CashLiteCashOutFlowParameters) obj;
        reverseProtoWriter.getClass();
        cashLiteCashOutFlowParameters.getClass();
        reverseProtoWriter.writeBytes(cashLiteCashOutFlowParameters.unknownFields());
        CashOutType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashLiteCashOutFlowParameters.f1250type);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashLiteCashOutFlowParameters.customer_supplied_amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cashLiteCashOutFlowParameters.external_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashLiteCashOutFlowParameters cashLiteCashOutFlowParameters = (CashLiteCashOutFlowParameters) obj;
        cashLiteCashOutFlowParameters.getClass();
        return CashOutType.ADAPTER.encodedSizeWithTag(3, cashLiteCashOutFlowParameters.f1250type) + Money.ADAPTER.encodedSizeWithTag(2, cashLiteCashOutFlowParameters.customer_supplied_amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, cashLiteCashOutFlowParameters.external_id) + cashLiteCashOutFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashLiteCashOutFlowParameters cashLiteCashOutFlowParameters = (CashLiteCashOutFlowParameters) obj;
        cashLiteCashOutFlowParameters.getClass();
        Money money = cashLiteCashOutFlowParameters.customer_supplied_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashLiteCashOutFlowParameters.external_id;
        CashOutType cashOutType = cashLiteCashOutFlowParameters.f1250type;
        byteString.getClass();
        return new CashLiteCashOutFlowParameters(str, money2, cashOutType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashLiteCashOutFlowParameters cashLiteCashOutFlowParameters = (CashLiteCashOutFlowParameters) obj;
        cashLiteCashOutFlowParameters.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cashLiteCashOutFlowParameters.external_id);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, cashLiteCashOutFlowParameters.customer_supplied_amount);
        CashOutType.ADAPTER.encodeWithTag(protoWriter, 3, cashLiteCashOutFlowParameters.f1250type);
        protoWriter.writeBytes(cashLiteCashOutFlowParameters.unknownFields());
    }
}
