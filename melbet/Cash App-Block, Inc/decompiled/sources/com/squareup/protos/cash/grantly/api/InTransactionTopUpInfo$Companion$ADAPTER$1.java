package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InTransactionTopUpInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InTransactionTopUpInfo((Instrument) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InTransactionTopUpInfo inTransactionTopUpInfo = (InTransactionTopUpInfo) obj;
        reverseProtoWriter.getClass();
        inTransactionTopUpInfo.getClass();
        reverseProtoWriter.writeBytes(inTransactionTopUpInfo.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, inTransactionTopUpInfo.minimum_required_top_up_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, inTransactionTopUpInfo.top_up_amount);
        Instrument.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inTransactionTopUpInfo.selected_instrument);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InTransactionTopUpInfo inTransactionTopUpInfo = (InTransactionTopUpInfo) obj;
        inTransactionTopUpInfo.getClass();
        int encodedSizeWithTag = Instrument.ADAPTER.encodedSizeWithTag(1, inTransactionTopUpInfo.selected_instrument) + inTransactionTopUpInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, inTransactionTopUpInfo.minimum_required_top_up_amount) + protoAdapter.encodedSizeWithTag(2, inTransactionTopUpInfo.top_up_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InTransactionTopUpInfo inTransactionTopUpInfo = (InTransactionTopUpInfo) obj;
        inTransactionTopUpInfo.getClass();
        Instrument instrument = inTransactionTopUpInfo.selected_instrument;
        Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
        Money money = inTransactionTopUpInfo.top_up_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = inTransactionTopUpInfo.minimum_required_top_up_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InTransactionTopUpInfo(instrument2, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InTransactionTopUpInfo inTransactionTopUpInfo = (InTransactionTopUpInfo) obj;
        inTransactionTopUpInfo.getClass();
        Instrument.ADAPTER.encodeWithTag(protoWriter, 1, inTransactionTopUpInfo.selected_instrument);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, inTransactionTopUpInfo.top_up_amount);
        protoAdapter.encodeWithTag(protoWriter, 3, inTransactionTopUpInfo.minimum_required_top_up_amount);
        protoWriter.writeBytes(inTransactionTopUpInfo.unknownFields());
    }
}
