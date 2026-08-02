package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ApplyRewardCodeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ApplyRewardCodeResponse((ResponseContext) obj, (Boolean) obj2, (RewardStatus) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(RewardStatus.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ApplyRewardCodeResponse applyRewardCodeResponse = (ApplyRewardCodeResponse) obj;
        reverseProtoWriter.getClass();
        applyRewardCodeResponse.getClass();
        reverseProtoWriter.writeBytes(applyRewardCodeResponse.unknownFields());
        RewardStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, applyRewardCodeResponse.reward_status);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, applyRewardCodeResponse.valid);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, applyRewardCodeResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ApplyRewardCodeResponse applyRewardCodeResponse = (ApplyRewardCodeResponse) obj;
        applyRewardCodeResponse.getClass();
        return RewardStatus.ADAPTER.encodedSizeWithTag(4, applyRewardCodeResponse.reward_status) + ProtoAdapter.BOOL.encodedSizeWithTag(1, applyRewardCodeResponse.valid) + ResponseContext.ADAPTER.encodedSizeWithTag(5, applyRewardCodeResponse.response_context) + applyRewardCodeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ApplyRewardCodeResponse applyRewardCodeResponse = (ApplyRewardCodeResponse) obj;
        applyRewardCodeResponse.getClass();
        ResponseContext responseContext = applyRewardCodeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        RewardStatus rewardStatus = applyRewardCodeResponse.reward_status;
        RewardStatus rewardStatus2 = rewardStatus != null ? (RewardStatus) RewardStatus.ADAPTER.redact(rewardStatus) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = applyRewardCodeResponse.valid;
        byteString.getClass();
        return new ApplyRewardCodeResponse(responseContext2, bool, rewardStatus2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ApplyRewardCodeResponse applyRewardCodeResponse = (ApplyRewardCodeResponse) obj;
        applyRewardCodeResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 5, applyRewardCodeResponse.response_context);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, applyRewardCodeResponse.valid);
        RewardStatus.ADAPTER.encodeWithTag(protoWriter, 4, applyRewardCodeResponse.reward_status);
        protoWriter.writeBytes(applyRewardCodeResponse.unknownFields());
    }
}
