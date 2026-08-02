package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$MoneyInputResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.MoneyInputResult((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SubmitFormRequest.ElementResult.MoneyInputResult moneyInputResult = (SubmitFormRequest.ElementResult.MoneyInputResult) obj;
        reverseProtoWriter.getClass();
        moneyInputResult.getClass();
        reverseProtoWriter.writeBytes(moneyInputResult.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, moneyInputResult.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.MoneyInputResult moneyInputResult = (SubmitFormRequest.ElementResult.MoneyInputResult) obj;
        moneyInputResult.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, moneyInputResult.amount) + moneyInputResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFormRequest.ElementResult.MoneyInputResult moneyInputResult = (SubmitFormRequest.ElementResult.MoneyInputResult) obj;
        moneyInputResult.getClass();
        Money money = moneyInputResult.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.MoneyInputResult(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.MoneyInputResult moneyInputResult = (SubmitFormRequest.ElementResult.MoneyInputResult) obj;
        moneyInputResult.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, moneyInputResult.amount);
        protoWriter.writeBytes(moneyInputResult.unknownFields());
    }
}
