package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListJoinedMoneyPoolsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListJoinedMoneyPoolsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MoneyPool.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListJoinedMoneyPoolsResponse listJoinedMoneyPoolsResponse = (ListJoinedMoneyPoolsResponse) obj;
        reverseProtoWriter.getClass();
        listJoinedMoneyPoolsResponse.getClass();
        reverseProtoWriter.writeBytes(listJoinedMoneyPoolsResponse.unknownFields());
        MoneyPool.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listJoinedMoneyPoolsResponse.pools);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListJoinedMoneyPoolsResponse listJoinedMoneyPoolsResponse = (ListJoinedMoneyPoolsResponse) obj;
        listJoinedMoneyPoolsResponse.getClass();
        return MoneyPool.ADAPTER.asRepeated().encodedSizeWithTag(1, listJoinedMoneyPoolsResponse.pools) + listJoinedMoneyPoolsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListJoinedMoneyPoolsResponse listJoinedMoneyPoolsResponse = (ListJoinedMoneyPoolsResponse) obj;
        listJoinedMoneyPoolsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listJoinedMoneyPoolsResponse.pools, MoneyPool.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ListJoinedMoneyPoolsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListJoinedMoneyPoolsResponse listJoinedMoneyPoolsResponse = (ListJoinedMoneyPoolsResponse) obj;
        listJoinedMoneyPoolsResponse.getClass();
        MoneyPool.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listJoinedMoneyPoolsResponse.pools);
        protoWriter.writeBytes(listJoinedMoneyPoolsResponse.unknownFields());
    }
}
