package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetApOrdersHubResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetApOrdersHubResponse((Summary) obj, m, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Summary.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(OrderHubRow.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetApOrdersHubResponse getApOrdersHubResponse = (GetApOrdersHubResponse) obj;
        reverseProtoWriter.getClass();
        getApOrdersHubResponse.getClass();
        reverseProtoWriter.writeBytes(getApOrdersHubResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getApOrdersHubResponse.next_completed_orders_pagination_token);
        OrderHubRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getApOrdersHubResponse.rows);
        Summary.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getApOrdersHubResponse.summary);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetApOrdersHubResponse getApOrdersHubResponse = (GetApOrdersHubResponse) obj;
        getApOrdersHubResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, getApOrdersHubResponse.next_completed_orders_pagination_token) + OrderHubRow.ADAPTER.asRepeated().encodedSizeWithTag(2, getApOrdersHubResponse.rows) + Summary.ADAPTER.encodedSizeWithTag(1, getApOrdersHubResponse.summary) + getApOrdersHubResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetApOrdersHubResponse getApOrdersHubResponse = (GetApOrdersHubResponse) obj;
        getApOrdersHubResponse.getClass();
        Summary summary = getApOrdersHubResponse.summary;
        Summary summary2 = summary != null ? (Summary) Summary.ADAPTER.redact(summary) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getApOrdersHubResponse.rows, OrderHubRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getApOrdersHubResponse.next_completed_orders_pagination_token;
        byteString.getClass();
        return new GetApOrdersHubResponse(summary2, m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetApOrdersHubResponse getApOrdersHubResponse = (GetApOrdersHubResponse) obj;
        getApOrdersHubResponse.getClass();
        Summary.ADAPTER.encodeWithTag(protoWriter, 1, getApOrdersHubResponse.summary);
        OrderHubRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getApOrdersHubResponse.rows);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getApOrdersHubResponse.next_completed_orders_pagination_token);
        protoWriter.writeBytes(getApOrdersHubResponse.unknownFields());
    }
}
