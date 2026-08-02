package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RewardsData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRewardsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRewardsResponse((RewardsData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RewardsData.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRewardsResponse getRewardsResponse = (GetRewardsResponse) obj;
        reverseProtoWriter.getClass();
        getRewardsResponse.getClass();
        reverseProtoWriter.writeBytes(getRewardsResponse.unknownFields());
        RewardsData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getRewardsResponse.rewards_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRewardsResponse getRewardsResponse = (GetRewardsResponse) obj;
        getRewardsResponse.getClass();
        return RewardsData.ADAPTER.encodedSizeWithTag(1, getRewardsResponse.rewards_data) + getRewardsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRewardsResponse getRewardsResponse = (GetRewardsResponse) obj;
        getRewardsResponse.getClass();
        RewardsData rewardsData = getRewardsResponse.rewards_data;
        RewardsData rewardsData2 = rewardsData != null ? (RewardsData) RewardsData.ADAPTER.redact(rewardsData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetRewardsResponse(rewardsData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRewardsResponse getRewardsResponse = (GetRewardsResponse) obj;
        getRewardsResponse.getClass();
        RewardsData.ADAPTER.encodeWithTag(protoWriter, 1, getRewardsResponse.rewards_data);
        protoWriter.writeBytes(getRewardsResponse.unknownFields());
    }
}
