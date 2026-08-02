package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.CashFlow;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CashFlow$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CashFlow$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashFlow((String) obj, (Money) obj2, (CashFlow.Category) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = CashFlow.Category.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashFlow cashFlow = (CashFlow) obj;
        reverseProtoWriter.getClass();
        cashFlow.getClass();
        reverseProtoWriter.writeBytes(cashFlow.unknownFields());
        CashFlow.Category.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashFlow.category);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashFlow.amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cashFlow.source);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashFlow cashFlow = (CashFlow) obj;
        cashFlow.getClass();
        return CashFlow.Category.ADAPTER.encodedSizeWithTag(3, cashFlow.category) + Money.ADAPTER.encodedSizeWithTag(2, cashFlow.amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, cashFlow.source) + cashFlow.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashFlow cashFlow = (CashFlow) obj;
        cashFlow.getClass();
        Money money = cashFlow.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashFlow.source;
        CashFlow.Category category = cashFlow.category;
        byteString.getClass();
        return new CashFlow(str, money2, category, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashFlow cashFlow = (CashFlow) obj;
        cashFlow.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cashFlow.source);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, cashFlow.amount);
        CashFlow.Category.ADAPTER.encodeWithTag(protoWriter, 3, cashFlow.category);
        protoWriter.writeBytes(cashFlow.unknownFields());
    }
}
