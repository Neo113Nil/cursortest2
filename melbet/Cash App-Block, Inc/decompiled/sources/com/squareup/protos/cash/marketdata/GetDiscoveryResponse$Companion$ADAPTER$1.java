package com.squareup.protos.cash.marketdata;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityCategory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDiscoveryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDiscoveryResponse(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InvestmentEntityCategory.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(InvestmentEntityCategory.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDiscoveryResponse getDiscoveryResponse = (GetDiscoveryResponse) obj;
        reverseProtoWriter.getClass();
        getDiscoveryResponse.getClass();
        reverseProtoWriter.writeBytes(getDiscoveryResponse.unknownFields());
        ProtoAdapter protoAdapter = InvestmentEntityCategory.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, getDiscoveryResponse.search_categories);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, getDiscoveryResponse.categories);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDiscoveryResponse getDiscoveryResponse = (GetDiscoveryResponse) obj;
        getDiscoveryResponse.getClass();
        int size$okio = getDiscoveryResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = InvestmentEntityCategory.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, getDiscoveryResponse.search_categories) + protoAdapter.asRepeated().encodedSizeWithTag(1, getDiscoveryResponse.categories) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDiscoveryResponse getDiscoveryResponse = (GetDiscoveryResponse) obj;
        getDiscoveryResponse.getClass();
        List list = getDiscoveryResponse.categories;
        ProtoAdapter protoAdapter = InvestmentEntityCategory.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getDiscoveryResponse.search_categories, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetDiscoveryResponse(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDiscoveryResponse getDiscoveryResponse = (GetDiscoveryResponse) obj;
        getDiscoveryResponse.getClass();
        ProtoAdapter protoAdapter = InvestmentEntityCategory.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, getDiscoveryResponse.categories);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, getDiscoveryResponse.search_categories);
        protoWriter.writeBytes(getDiscoveryResponse.unknownFields());
    }
}
