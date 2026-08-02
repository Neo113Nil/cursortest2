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
public final class AdminListCustomerMoneyPoolsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AdminListCustomerMoneyPoolsResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MoneyPool.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AdminListCustomerMoneyPoolsResponse adminListCustomerMoneyPoolsResponse = (AdminListCustomerMoneyPoolsResponse) obj;
        reverseProtoWriter.getClass();
        adminListCustomerMoneyPoolsResponse.getClass();
        reverseProtoWriter.writeBytes(adminListCustomerMoneyPoolsResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, adminListCustomerMoneyPoolsResponse.next_page_token);
        MoneyPool.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, adminListCustomerMoneyPoolsResponse.pools);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AdminListCustomerMoneyPoolsResponse adminListCustomerMoneyPoolsResponse = (AdminListCustomerMoneyPoolsResponse) obj;
        adminListCustomerMoneyPoolsResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, adminListCustomerMoneyPoolsResponse.next_page_token) + MoneyPool.ADAPTER.asRepeated().encodedSizeWithTag(1, adminListCustomerMoneyPoolsResponse.pools) + adminListCustomerMoneyPoolsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AdminListCustomerMoneyPoolsResponse adminListCustomerMoneyPoolsResponse = (AdminListCustomerMoneyPoolsResponse) obj;
        adminListCustomerMoneyPoolsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(adminListCustomerMoneyPoolsResponse.pools, MoneyPool.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = adminListCustomerMoneyPoolsResponse.next_page_token;
        byteString.getClass();
        return new AdminListCustomerMoneyPoolsResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AdminListCustomerMoneyPoolsResponse adminListCustomerMoneyPoolsResponse = (AdminListCustomerMoneyPoolsResponse) obj;
        adminListCustomerMoneyPoolsResponse.getClass();
        MoneyPool.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, adminListCustomerMoneyPoolsResponse.pools);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, adminListCustomerMoneyPoolsResponse.next_page_token);
        protoWriter.writeBytes(adminListCustomerMoneyPoolsResponse.unknownFields());
    }
}
