package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAvailableNetworksResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAvailableNetworksResponse((ResponseContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AvailableNetwork.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAvailableNetworksResponse getAvailableNetworksResponse = (GetAvailableNetworksResponse) obj;
        reverseProtoWriter.getClass();
        getAvailableNetworksResponse.getClass();
        reverseProtoWriter.writeBytes(getAvailableNetworksResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getAvailableNetworksResponse.response_context);
        AvailableNetwork.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAvailableNetworksResponse.available_networks);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAvailableNetworksResponse getAvailableNetworksResponse = (GetAvailableNetworksResponse) obj;
        getAvailableNetworksResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, getAvailableNetworksResponse.response_context) + AvailableNetwork.ADAPTER.asRepeated().encodedSizeWithTag(1, getAvailableNetworksResponse.available_networks) + getAvailableNetworksResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAvailableNetworksResponse getAvailableNetworksResponse = (GetAvailableNetworksResponse) obj;
        getAvailableNetworksResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAvailableNetworksResponse.available_networks, AvailableNetwork.ADAPTER);
        ResponseContext responseContext = getAvailableNetworksResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAvailableNetworksResponse(responseContext2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAvailableNetworksResponse getAvailableNetworksResponse = (GetAvailableNetworksResponse) obj;
        getAvailableNetworksResponse.getClass();
        AvailableNetwork.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAvailableNetworksResponse.available_networks);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getAvailableNetworksResponse.response_context);
        protoWriter.writeBytes(getAvailableNetworksResponse.unknownFields());
    }
}
