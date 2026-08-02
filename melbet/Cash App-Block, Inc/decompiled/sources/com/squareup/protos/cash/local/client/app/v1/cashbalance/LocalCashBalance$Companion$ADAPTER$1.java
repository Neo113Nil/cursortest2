package com.squareup.protos.cash.local.client.app.v1.cashbalance;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCashBalance$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCashBalance((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashBalance localCashBalance = (LocalCashBalance) obj;
        reverseProtoWriter.getClass();
        localCashBalance.getClass();
        reverseProtoWriter.writeBytes(localCashBalance.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, localCashBalance.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashBalance localCashBalance = (LocalCashBalance) obj;
        localCashBalance.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, localCashBalance.amount) + localCashBalance.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashBalance localCashBalance = (LocalCashBalance) obj;
        localCashBalance.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = localCashBalance.amount;
        byteString.getClass();
        return new LocalCashBalance(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashBalance localCashBalance = (LocalCashBalance) obj;
        localCashBalance.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, localCashBalance.amount);
        protoWriter.writeBytes(localCashBalance.unknownFields());
    }
}
