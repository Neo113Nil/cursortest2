package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetAmountRequest$AmountResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetAmountRequest.AmountResult((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetAmountRequest.AmountResult amountResult = (SetAmountRequest.AmountResult) obj;
        reverseProtoWriter.getClass();
        amountResult.getClass();
        reverseProtoWriter.writeBytes(amountResult.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, amountResult.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetAmountRequest.AmountResult amountResult = (SetAmountRequest.AmountResult) obj;
        amountResult.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, amountResult.amount) + amountResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetAmountRequest.AmountResult amountResult = (SetAmountRequest.AmountResult) obj;
        amountResult.getClass();
        Money money = amountResult.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetAmountRequest.AmountResult(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetAmountRequest.AmountResult amountResult = (SetAmountRequest.AmountResult) obj;
        amountResult.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, amountResult.amount);
        protoWriter.writeBytes(amountResult.unknownFields());
    }
}
