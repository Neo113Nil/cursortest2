package com.squareup.protos.cash.nearby.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateNearbySessionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreateNearbySessionResponse((NearbySession) obj, (ConnectionData) obj2, (ByteString) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(NearbySession.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ConnectionData.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateNearbySessionResponse createNearbySessionResponse = (CreateNearbySessionResponse) obj;
        reverseProtoWriter.getClass();
        createNearbySessionResponse.getClass();
        reverseProtoWriter.writeBytes(createNearbySessionResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, createNearbySessionResponse.expired_at_millis);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, createNearbySessionResponse.nearby_session_uuid);
        ConnectionData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createNearbySessionResponse.connection_data);
        NearbySession.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createNearbySessionResponse.nearby_session);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateNearbySessionResponse createNearbySessionResponse = (CreateNearbySessionResponse) obj;
        createNearbySessionResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(4, createNearbySessionResponse.expired_at_millis) + ProtoAdapter.BYTES.encodedSizeWithTag(3, createNearbySessionResponse.nearby_session_uuid) + ConnectionData.ADAPTER.encodedSizeWithTag(2, createNearbySessionResponse.connection_data) + NearbySession.ADAPTER.encodedSizeWithTag(1, createNearbySessionResponse.nearby_session) + createNearbySessionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateNearbySessionResponse createNearbySessionResponse = (CreateNearbySessionResponse) obj;
        createNearbySessionResponse.getClass();
        NearbySession nearbySession = createNearbySessionResponse.nearby_session;
        NearbySession nearbySession2 = nearbySession != null ? (NearbySession) NearbySession.ADAPTER.redact(nearbySession) : null;
        ConnectionData connectionData = createNearbySessionResponse.connection_data;
        ConnectionData connectionData2 = connectionData != null ? (ConnectionData) ConnectionData.ADAPTER.redact(connectionData) : null;
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = createNearbySessionResponse.nearby_session_uuid;
        Long l = createNearbySessionResponse.expired_at_millis;
        byteString.getClass();
        return new CreateNearbySessionResponse(nearbySession2, connectionData2, byteString2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateNearbySessionResponse createNearbySessionResponse = (CreateNearbySessionResponse) obj;
        createNearbySessionResponse.getClass();
        NearbySession.ADAPTER.encodeWithTag(protoWriter, 1, createNearbySessionResponse.nearby_session);
        ConnectionData.ADAPTER.encodeWithTag(protoWriter, 2, createNearbySessionResponse.connection_data);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, createNearbySessionResponse.nearby_session_uuid);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, createNearbySessionResponse.expired_at_millis);
        protoWriter.writeBytes(createNearbySessionResponse.unknownFields());
    }
}
