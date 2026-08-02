package com.squareup.protos.cash.moneymap.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRetailerLocationsResponse$Fee$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetRetailerLocationsResponse.Fee((Money) obj, (Money) obj3, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRetailerLocationsResponse.Fee fee = (GetRetailerLocationsResponse.Fee) obj;
        reverseProtoWriter.getClass();
        fee.getClass();
        reverseProtoWriter.writeBytes(fee.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, fee.waive);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, fee.fee_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fee.charge);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRetailerLocationsResponse.Fee fee = (GetRetailerLocationsResponse.Fee) obj;
        fee.getClass();
        int size$okio = fee.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, fee.waive) + ProtoAdapter.STRING.encodedSizeWithTag(2, fee.fee_type) + protoAdapter.encodedSizeWithTag(1, fee.charge) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRetailerLocationsResponse.Fee fee = (GetRetailerLocationsResponse.Fee) obj;
        fee.getClass();
        Money money = fee.charge;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = fee.waive;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = fee.fee_type;
        byteString.getClass();
        return new GetRetailerLocationsResponse.Fee(money2, money4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRetailerLocationsResponse.Fee fee = (GetRetailerLocationsResponse.Fee) obj;
        fee.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, fee.charge);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fee.fee_type);
        protoAdapter.encodeWithTag(protoWriter, 3, fee.waive);
        protoWriter.writeBytes(fee.unknownFields());
    }
}
