package com.squareup.protos.cash.sup.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RetrievePlanDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RetrievePlanDetailsResponse((Money) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RetrievePlanDetailsResponse retrievePlanDetailsResponse = (RetrievePlanDetailsResponse) obj;
        reverseProtoWriter.getClass();
        retrievePlanDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(retrievePlanDetailsResponse.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, retrievePlanDetailsResponse.estimated_total);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, retrievePlanDetailsResponse.down_payment);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RetrievePlanDetailsResponse retrievePlanDetailsResponse = (RetrievePlanDetailsResponse) obj;
        retrievePlanDetailsResponse.getClass();
        int size$okio = retrievePlanDetailsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, retrievePlanDetailsResponse.estimated_total) + protoAdapter.encodedSizeWithTag(1, retrievePlanDetailsResponse.down_payment) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RetrievePlanDetailsResponse retrievePlanDetailsResponse = (RetrievePlanDetailsResponse) obj;
        retrievePlanDetailsResponse.getClass();
        Money money = retrievePlanDetailsResponse.down_payment;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = retrievePlanDetailsResponse.estimated_total;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RetrievePlanDetailsResponse(money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RetrievePlanDetailsResponse retrievePlanDetailsResponse = (RetrievePlanDetailsResponse) obj;
        retrievePlanDetailsResponse.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, retrievePlanDetailsResponse.down_payment);
        protoAdapter.encodeWithTag(protoWriter, 2, retrievePlanDetailsResponse.estimated_total);
        protoWriter.writeBytes(retrievePlanDetailsResponse.unknownFields());
    }
}
