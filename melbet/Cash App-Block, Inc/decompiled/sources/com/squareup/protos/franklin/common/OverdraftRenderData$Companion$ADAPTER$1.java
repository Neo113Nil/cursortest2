package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OverdraftRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftRenderData((Money) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftRenderData overdraftRenderData = (OverdraftRenderData) obj;
        reverseProtoWriter.getClass();
        overdraftRenderData.getClass();
        reverseProtoWriter.writeBytes(overdraftRenderData.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, overdraftRenderData.total_transaction_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, overdraftRenderData.overdraft_amount_used);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftRenderData overdraftRenderData = (OverdraftRenderData) obj;
        overdraftRenderData.getClass();
        int size$okio = overdraftRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, overdraftRenderData.total_transaction_amount) + protoAdapter.encodedSizeWithTag(1, overdraftRenderData.overdraft_amount_used) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftRenderData overdraftRenderData = (OverdraftRenderData) obj;
        overdraftRenderData.getClass();
        Money money = overdraftRenderData.overdraft_amount_used;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = overdraftRenderData.total_transaction_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverdraftRenderData(money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftRenderData overdraftRenderData = (OverdraftRenderData) obj;
        overdraftRenderData.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, overdraftRenderData.overdraft_amount_used);
        protoAdapter.encodeWithTag(protoWriter, 2, overdraftRenderData.total_transaction_amount);
        protoWriter.writeBytes(overdraftRenderData.unknownFields());
    }
}
