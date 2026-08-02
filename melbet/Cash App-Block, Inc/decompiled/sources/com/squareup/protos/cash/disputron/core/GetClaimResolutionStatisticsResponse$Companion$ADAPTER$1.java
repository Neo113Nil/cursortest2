package com.squareup.protos.cash.disputron.core;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetClaimResolutionStatisticsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetClaimResolutionStatisticsResponse((Integer) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetClaimResolutionStatisticsResponse getClaimResolutionStatisticsResponse = (GetClaimResolutionStatisticsResponse) obj;
        reverseProtoWriter.getClass();
        getClaimResolutionStatisticsResponse.getClass();
        reverseProtoWriter.writeBytes(getClaimResolutionStatisticsResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getClaimResolutionStatisticsResponse.active_claims);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getClaimResolutionStatisticsResponse.total_claims);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetClaimResolutionStatisticsResponse getClaimResolutionStatisticsResponse = (GetClaimResolutionStatisticsResponse) obj;
        getClaimResolutionStatisticsResponse.getClass();
        int size$okio = getClaimResolutionStatisticsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(2, getClaimResolutionStatisticsResponse.active_claims) + protoAdapter.encodedSizeWithTag(1, getClaimResolutionStatisticsResponse.total_claims) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetClaimResolutionStatisticsResponse getClaimResolutionStatisticsResponse = (GetClaimResolutionStatisticsResponse) obj;
        getClaimResolutionStatisticsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = getClaimResolutionStatisticsResponse.total_claims;
        Integer num2 = getClaimResolutionStatisticsResponse.active_claims;
        byteString.getClass();
        return new GetClaimResolutionStatisticsResponse(num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetClaimResolutionStatisticsResponse getClaimResolutionStatisticsResponse = (GetClaimResolutionStatisticsResponse) obj;
        getClaimResolutionStatisticsResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, getClaimResolutionStatisticsResponse.total_claims);
        protoAdapter.encodeWithTag(protoWriter, 2, getClaimResolutionStatisticsResponse.active_claims);
        protoWriter.writeBytes(getClaimResolutionStatisticsResponse.unknownFields());
    }
}
