package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetRewardStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRewardStatusResponse((RewardStatus) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RewardStatus.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRewardStatusResponse getRewardStatusResponse = (GetRewardStatusResponse) obj;
        reverseProtoWriter.getClass();
        getRewardStatusResponse.getClass();
        reverseProtoWriter.writeBytes(getRewardStatusResponse.unknownFields());
        RewardStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getRewardStatusResponse.reward_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRewardStatusResponse getRewardStatusResponse = (GetRewardStatusResponse) obj;
        getRewardStatusResponse.getClass();
        return RewardStatus.ADAPTER.encodedSizeWithTag(1, getRewardStatusResponse.reward_status) + getRewardStatusResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRewardStatusResponse getRewardStatusResponse = (GetRewardStatusResponse) obj;
        getRewardStatusResponse.getClass();
        RewardStatus rewardStatus = getRewardStatusResponse.reward_status;
        RewardStatus rewardStatus2 = rewardStatus != null ? (RewardStatus) RewardStatus.ADAPTER.redact(rewardStatus) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetRewardStatusResponse(rewardStatus2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRewardStatusResponse getRewardStatusResponse = (GetRewardStatusResponse) obj;
        getRewardStatusResponse.getClass();
        RewardStatus.ADAPTER.encodeWithTag(protoWriter, 1, getRewardStatusResponse.reward_status);
        protoWriter.writeBytes(getRewardStatusResponse.unknownFields());
    }
}
