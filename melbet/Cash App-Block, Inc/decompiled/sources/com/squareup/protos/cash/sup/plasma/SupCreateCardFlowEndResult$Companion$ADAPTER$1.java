package com.squareup.protos.cash.sup.plasma;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupCreateCardFlowEndResult$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SupCreateCardFlowEndResult((IssuedCard) obj, (Money) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(IssuedCard.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupCreateCardFlowEndResult supCreateCardFlowEndResult = (SupCreateCardFlowEndResult) obj;
        reverseProtoWriter.getClass();
        supCreateCardFlowEndResult.getClass();
        reverseProtoWriter.writeBytes(supCreateCardFlowEndResult.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, supCreateCardFlowEndResult.sup_checkout_id);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, supCreateCardFlowEndResult.authorized_card_amount);
        IssuedCard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, supCreateCardFlowEndResult.sup_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupCreateCardFlowEndResult supCreateCardFlowEndResult = (SupCreateCardFlowEndResult) obj;
        supCreateCardFlowEndResult.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, supCreateCardFlowEndResult.sup_checkout_id) + Money.ADAPTER.encodedSizeWithTag(2, supCreateCardFlowEndResult.authorized_card_amount) + IssuedCard.ADAPTER.encodedSizeWithTag(1, supCreateCardFlowEndResult.sup_card) + supCreateCardFlowEndResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupCreateCardFlowEndResult supCreateCardFlowEndResult = (SupCreateCardFlowEndResult) obj;
        supCreateCardFlowEndResult.getClass();
        IssuedCard issuedCard = supCreateCardFlowEndResult.sup_card;
        IssuedCard issuedCard2 = issuedCard != null ? (IssuedCard) IssuedCard.ADAPTER.redact(issuedCard) : null;
        Money money = supCreateCardFlowEndResult.authorized_card_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = supCreateCardFlowEndResult.sup_checkout_id;
        byteString.getClass();
        return new SupCreateCardFlowEndResult(issuedCard2, money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupCreateCardFlowEndResult supCreateCardFlowEndResult = (SupCreateCardFlowEndResult) obj;
        supCreateCardFlowEndResult.getClass();
        IssuedCard.ADAPTER.encodeWithTag(protoWriter, 1, supCreateCardFlowEndResult.sup_card);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, supCreateCardFlowEndResult.authorized_card_amount);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, supCreateCardFlowEndResult.sup_checkout_id);
        protoWriter.writeBytes(supCreateCardFlowEndResult.unknownFields());
    }
}
