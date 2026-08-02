package com.squareup.protos.cash.nearby.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetNearbySessionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetNearbySessionResponse((NearbySession) obj, (GetNearbySessionResponse.ErrorCode) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(NearbySession.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = GetNearbySessionResponse.ErrorCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNearbySessionResponse getNearbySessionResponse = (GetNearbySessionResponse) obj;
        reverseProtoWriter.getClass();
        getNearbySessionResponse.getClass();
        reverseProtoWriter.writeBytes(getNearbySessionResponse.unknownFields());
        GetNearbySessionResponse.ErrorCode.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getNearbySessionResponse.error_code);
        NearbySession.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getNearbySessionResponse.nearby_session);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNearbySessionResponse getNearbySessionResponse = (GetNearbySessionResponse) obj;
        getNearbySessionResponse.getClass();
        return GetNearbySessionResponse.ErrorCode.ADAPTER.encodedSizeWithTag(2, getNearbySessionResponse.error_code) + NearbySession.ADAPTER.encodedSizeWithTag(1, getNearbySessionResponse.nearby_session) + getNearbySessionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNearbySessionResponse getNearbySessionResponse = (GetNearbySessionResponse) obj;
        getNearbySessionResponse.getClass();
        NearbySession nearbySession = getNearbySessionResponse.nearby_session;
        NearbySession nearbySession2 = nearbySession != null ? (NearbySession) NearbySession.ADAPTER.redact(nearbySession) : null;
        ByteString byteString = ByteString.EMPTY;
        GetNearbySessionResponse.ErrorCode errorCode = getNearbySessionResponse.error_code;
        byteString.getClass();
        return new GetNearbySessionResponse(nearbySession2, errorCode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNearbySessionResponse getNearbySessionResponse = (GetNearbySessionResponse) obj;
        getNearbySessionResponse.getClass();
        NearbySession.ADAPTER.encodeWithTag(protoWriter, 1, getNearbySessionResponse.nearby_session);
        GetNearbySessionResponse.ErrorCode.ADAPTER.encodeWithTag(protoWriter, 2, getNearbySessionResponse.error_code);
        protoWriter.writeBytes(getNearbySessionResponse.unknownFields());
    }
}
