package com.squareup.protos.cash.paychecks.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPayersForCustomerResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPayersForCustomerResponse(m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Payer.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(CustomerInfo.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(CustomerInfo.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPayersForCustomerResponse getPayersForCustomerResponse = (GetPayersForCustomerResponse) obj;
        reverseProtoWriter.getClass();
        getPayersForCustomerResponse.getClass();
        reverseProtoWriter.writeBytes(getPayersForCustomerResponse.unknownFields());
        ProtoAdapter protoAdapter = CustomerInfo.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, getPayersForCustomerResponse.recent_senders);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, getPayersForCustomerResponse.tagged_payers);
        Payer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getPayersForCustomerResponse.payers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPayersForCustomerResponse getPayersForCustomerResponse = (GetPayersForCustomerResponse) obj;
        getPayersForCustomerResponse.getClass();
        int encodedSizeWithTag = Payer.ADAPTER.asRepeated().encodedSizeWithTag(1, getPayersForCustomerResponse.payers) + getPayersForCustomerResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CustomerInfo.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, getPayersForCustomerResponse.recent_senders) + protoAdapter.asRepeated().encodedSizeWithTag(2, getPayersForCustomerResponse.tagged_payers) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPayersForCustomerResponse getPayersForCustomerResponse = (GetPayersForCustomerResponse) obj;
        getPayersForCustomerResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getPayersForCustomerResponse.payers, Payer.ADAPTER);
        List list = getPayersForCustomerResponse.tagged_payers;
        ProtoAdapter protoAdapter = CustomerInfo.ADAPTER;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getPayersForCustomerResponse.recent_senders, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPayersForCustomerResponse(m1169redactElements, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPayersForCustomerResponse getPayersForCustomerResponse = (GetPayersForCustomerResponse) obj;
        getPayersForCustomerResponse.getClass();
        Payer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getPayersForCustomerResponse.payers);
        ProtoAdapter protoAdapter = CustomerInfo.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, getPayersForCustomerResponse.tagged_payers);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, getPayersForCustomerResponse.recent_senders);
        protoWriter.writeBytes(getPayersForCustomerResponse.unknownFields());
    }
}
