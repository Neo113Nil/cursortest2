package com.squareup.protos.cash.sup.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AvailableCreditLimit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvailableCreditLimit((Money) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AvailableCreditLimit availableCreditLimit = (AvailableCreditLimit) obj;
        reverseProtoWriter.getClass();
        availableCreditLimit.getClass();
        reverseProtoWriter.writeBytes(availableCreditLimit.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, availableCreditLimit.cart_minimum);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, availableCreditLimit.available_limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvailableCreditLimit availableCreditLimit = (AvailableCreditLimit) obj;
        availableCreditLimit.getClass();
        int size$okio = availableCreditLimit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, availableCreditLimit.cart_minimum) + protoAdapter.encodedSizeWithTag(1, availableCreditLimit.available_limit) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvailableCreditLimit availableCreditLimit = (AvailableCreditLimit) obj;
        availableCreditLimit.getClass();
        Money money = availableCreditLimit.available_limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = availableCreditLimit.cart_minimum;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AvailableCreditLimit(money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvailableCreditLimit availableCreditLimit = (AvailableCreditLimit) obj;
        availableCreditLimit.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, availableCreditLimit.available_limit);
        protoAdapter.encodeWithTag(protoWriter, 2, availableCreditLimit.cart_minimum);
        protoWriter.writeBytes(availableCreditLimit.unknownFields());
    }
}
