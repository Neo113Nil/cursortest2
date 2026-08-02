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
public final class ListOwnedMoneyPoolsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListOwnedMoneyPoolsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ListOwnedMoneyPoolsResponse listOwnedMoneyPoolsResponse = (ListOwnedMoneyPoolsResponse) obj;
        reverseProtoWriter.getClass();
        listOwnedMoneyPoolsResponse.getClass();
        reverseProtoWriter.writeBytes(listOwnedMoneyPoolsResponse.unknownFields());
        MoneyPool.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listOwnedMoneyPoolsResponse.pools);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListOwnedMoneyPoolsResponse listOwnedMoneyPoolsResponse = (ListOwnedMoneyPoolsResponse) obj;
        listOwnedMoneyPoolsResponse.getClass();
        return MoneyPool.ADAPTER.asRepeated().encodedSizeWithTag(1, listOwnedMoneyPoolsResponse.pools) + listOwnedMoneyPoolsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListOwnedMoneyPoolsResponse listOwnedMoneyPoolsResponse = (ListOwnedMoneyPoolsResponse) obj;
        listOwnedMoneyPoolsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listOwnedMoneyPoolsResponse.pools, MoneyPool.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ListOwnedMoneyPoolsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListOwnedMoneyPoolsResponse listOwnedMoneyPoolsResponse = (ListOwnedMoneyPoolsResponse) obj;
        listOwnedMoneyPoolsResponse.getClass();
        MoneyPool.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listOwnedMoneyPoolsResponse.pools);
        protoWriter.writeBytes(listOwnedMoneyPoolsResponse.unknownFields());
    }
}
