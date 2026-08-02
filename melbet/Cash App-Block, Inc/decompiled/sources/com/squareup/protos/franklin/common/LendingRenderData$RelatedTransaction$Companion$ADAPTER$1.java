package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingRenderData$RelatedTransaction$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LendingRenderData.RelatedTransaction((Money) obj, (LendingRenderData.RelatedTransaction.Type) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = LendingRenderData.RelatedTransaction.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingRenderData.RelatedTransaction relatedTransaction = (LendingRenderData.RelatedTransaction) obj;
        reverseProtoWriter.getClass();
        relatedTransaction.getClass();
        reverseProtoWriter.writeBytes(relatedTransaction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, relatedTransaction.applied_percentage);
        LendingRenderData.RelatedTransaction.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 2, relatedTransaction.f1382type);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, relatedTransaction.transaction_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingRenderData.RelatedTransaction relatedTransaction = (LendingRenderData.RelatedTransaction) obj;
        relatedTransaction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, relatedTransaction.applied_percentage) + LendingRenderData.RelatedTransaction.Type.ADAPTER.encodedSizeWithTag(2, relatedTransaction.f1382type) + Money.ADAPTER.encodedSizeWithTag(1, relatedTransaction.transaction_amount) + relatedTransaction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingRenderData.RelatedTransaction relatedTransaction = (LendingRenderData.RelatedTransaction) obj;
        relatedTransaction.getClass();
        Money money = relatedTransaction.transaction_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        LendingRenderData.RelatedTransaction.Type type2 = relatedTransaction.f1382type;
        String str = relatedTransaction.applied_percentage;
        byteString.getClass();
        return new LendingRenderData.RelatedTransaction(money2, type2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingRenderData.RelatedTransaction relatedTransaction = (LendingRenderData.RelatedTransaction) obj;
        relatedTransaction.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, relatedTransaction.transaction_amount);
        LendingRenderData.RelatedTransaction.Type.ADAPTER.encodeWithTag(protoWriter, 2, relatedTransaction.f1382type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, relatedTransaction.applied_percentage);
        protoWriter.writeBytes(relatedTransaction.unknownFields());
    }
}
