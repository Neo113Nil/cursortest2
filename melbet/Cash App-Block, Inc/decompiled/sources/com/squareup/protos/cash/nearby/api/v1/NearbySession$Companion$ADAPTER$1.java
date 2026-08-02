package com.squareup.protos.cash.nearby.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NearbySession$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NearbySession((NearbyContext) obj, (BroadcasterProfileData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(NearbyContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BroadcasterProfileData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NearbySession nearbySession = (NearbySession) obj;
        reverseProtoWriter.getClass();
        nearbySession.getClass();
        reverseProtoWriter.writeBytes(nearbySession.unknownFields());
        BroadcasterProfileData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, nearbySession.broadcaster_profile_data);
        NearbyContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, nearbySession.nearby_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NearbySession nearbySession = (NearbySession) obj;
        nearbySession.getClass();
        return BroadcasterProfileData.ADAPTER.encodedSizeWithTag(2, nearbySession.broadcaster_profile_data) + NearbyContext.ADAPTER.encodedSizeWithTag(1, nearbySession.nearby_context) + nearbySession.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NearbySession nearbySession = (NearbySession) obj;
        nearbySession.getClass();
        NearbyContext nearbyContext = nearbySession.nearby_context;
        NearbyContext nearbyContext2 = nearbyContext != null ? (NearbyContext) NearbyContext.ADAPTER.redact(nearbyContext) : null;
        BroadcasterProfileData broadcasterProfileData = nearbySession.broadcaster_profile_data;
        BroadcasterProfileData broadcasterProfileData2 = broadcasterProfileData != null ? (BroadcasterProfileData) BroadcasterProfileData.ADAPTER.redact(broadcasterProfileData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new NearbySession(nearbyContext2, broadcasterProfileData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NearbySession nearbySession = (NearbySession) obj;
        nearbySession.getClass();
        NearbyContext.ADAPTER.encodeWithTag(protoWriter, 1, nearbySession.nearby_context);
        BroadcasterProfileData.ADAPTER.encodeWithTag(protoWriter, 2, nearbySession.broadcaster_profile_data);
        protoWriter.writeBytes(nearbySession.unknownFields());
    }
}
