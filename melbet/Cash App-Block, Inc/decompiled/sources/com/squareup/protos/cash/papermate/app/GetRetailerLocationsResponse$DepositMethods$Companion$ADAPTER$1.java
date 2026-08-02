package com.squareup.protos.cash.papermate.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRetailerLocationsResponse$DepositMethods$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRetailerLocationsResponse.DepositMethods((Boolean) obj, (Boolean) obj2, (Money) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRetailerLocationsResponse.DepositMethods depositMethods = (GetRetailerLocationsResponse.DepositMethods) obj;
        reverseProtoWriter.getClass();
        depositMethods.getClass();
        reverseProtoWriter.writeBytes(depositMethods.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, depositMethods.min_swipe_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, depositMethods.min_scan_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, depositMethods.swipe);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, depositMethods.scan);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRetailerLocationsResponse.DepositMethods depositMethods = (GetRetailerLocationsResponse.DepositMethods) obj;
        depositMethods.getClass();
        int size$okio = depositMethods.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, depositMethods.swipe) + protoAdapter.encodedSizeWithTag(1, depositMethods.scan) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, depositMethods.min_swipe_amount) + protoAdapter2.encodedSizeWithTag(3, depositMethods.min_scan_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRetailerLocationsResponse.DepositMethods depositMethods = (GetRetailerLocationsResponse.DepositMethods) obj;
        depositMethods.getClass();
        Money money = depositMethods.min_scan_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = depositMethods.min_swipe_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = depositMethods.scan;
        Boolean bool2 = depositMethods.swipe;
        byteString.getClass();
        return new GetRetailerLocationsResponse.DepositMethods(bool, bool2, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRetailerLocationsResponse.DepositMethods depositMethods = (GetRetailerLocationsResponse.DepositMethods) obj;
        depositMethods.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, depositMethods.scan);
        protoAdapter.encodeWithTag(protoWriter, 2, depositMethods.swipe);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, depositMethods.min_scan_amount);
        protoAdapter2.encodeWithTag(protoWriter, 4, depositMethods.min_swipe_amount);
        protoWriter.writeBytes(depositMethods.unknownFields());
    }
}
