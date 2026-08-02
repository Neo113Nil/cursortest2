package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetPaymentRewardStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPaymentRewardStatusResponse((PaymentRewardStatus) obj, (RewardStatus) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PaymentRewardStatus.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(RewardStatus.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaymentRewardStatusResponse getPaymentRewardStatusResponse = (GetPaymentRewardStatusResponse) obj;
        reverseProtoWriter.getClass();
        getPaymentRewardStatusResponse.getClass();
        reverseProtoWriter.writeBytes(getPaymentRewardStatusResponse.unknownFields());
        RewardStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getPaymentRewardStatusResponse.reward_status);
        PaymentRewardStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPaymentRewardStatusResponse.payment_reward_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPaymentRewardStatusResponse getPaymentRewardStatusResponse = (GetPaymentRewardStatusResponse) obj;
        getPaymentRewardStatusResponse.getClass();
        return RewardStatus.ADAPTER.encodedSizeWithTag(2, getPaymentRewardStatusResponse.reward_status) + PaymentRewardStatus.ADAPTER.encodedSizeWithTag(1, getPaymentRewardStatusResponse.payment_reward_status) + getPaymentRewardStatusResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaymentRewardStatusResponse getPaymentRewardStatusResponse = (GetPaymentRewardStatusResponse) obj;
        getPaymentRewardStatusResponse.getClass();
        PaymentRewardStatus paymentRewardStatus = getPaymentRewardStatusResponse.payment_reward_status;
        PaymentRewardStatus paymentRewardStatus2 = paymentRewardStatus != null ? (PaymentRewardStatus) PaymentRewardStatus.ADAPTER.redact(paymentRewardStatus) : null;
        RewardStatus rewardStatus = getPaymentRewardStatusResponse.reward_status;
        RewardStatus rewardStatus2 = rewardStatus != null ? (RewardStatus) RewardStatus.ADAPTER.redact(rewardStatus) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPaymentRewardStatusResponse(paymentRewardStatus2, rewardStatus2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaymentRewardStatusResponse getPaymentRewardStatusResponse = (GetPaymentRewardStatusResponse) obj;
        getPaymentRewardStatusResponse.getClass();
        PaymentRewardStatus.ADAPTER.encodeWithTag(protoWriter, 1, getPaymentRewardStatusResponse.payment_reward_status);
        RewardStatus.ADAPTER.encodeWithTag(protoWriter, 2, getPaymentRewardStatusResponse.reward_status);
        protoWriter.writeBytes(getPaymentRewardStatusResponse.unknownFields());
    }
}
