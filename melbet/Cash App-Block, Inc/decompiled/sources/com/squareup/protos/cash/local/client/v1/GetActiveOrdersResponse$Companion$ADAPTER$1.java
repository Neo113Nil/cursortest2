package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetActiveOrdersResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetActiveOrdersResponse(m, (LocalErrorResponse) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalOrder.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LocalErrorResponse.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetActiveOrdersResponse getActiveOrdersResponse = (GetActiveOrdersResponse) obj;
        reverseProtoWriter.getClass();
        getActiveOrdersResponse.getClass();
        reverseProtoWriter.writeBytes(getActiveOrdersResponse.unknownFields());
        LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getActiveOrdersResponse.error_response);
        LocalOrder.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getActiveOrdersResponse.active_orders);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetActiveOrdersResponse getActiveOrdersResponse = (GetActiveOrdersResponse) obj;
        getActiveOrdersResponse.getClass();
        return LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, getActiveOrdersResponse.error_response) + LocalOrder.ADAPTER.asRepeated().encodedSizeWithTag(1, getActiveOrdersResponse.active_orders) + getActiveOrdersResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetActiveOrdersResponse getActiveOrdersResponse = (GetActiveOrdersResponse) obj;
        getActiveOrdersResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getActiveOrdersResponse.active_orders, LocalOrder.ADAPTER);
        LocalErrorResponse localErrorResponse = getActiveOrdersResponse.error_response;
        LocalErrorResponse localErrorResponse2 = localErrorResponse != null ? (LocalErrorResponse) LocalErrorResponse.ADAPTER.redact(localErrorResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetActiveOrdersResponse(m1169redactElements, localErrorResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetActiveOrdersResponse getActiveOrdersResponse = (GetActiveOrdersResponse) obj;
        getActiveOrdersResponse.getClass();
        LocalOrder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getActiveOrdersResponse.active_orders);
        LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, getActiveOrdersResponse.error_response);
        protoWriter.writeBytes(getActiveOrdersResponse.unknownFields());
    }
}
