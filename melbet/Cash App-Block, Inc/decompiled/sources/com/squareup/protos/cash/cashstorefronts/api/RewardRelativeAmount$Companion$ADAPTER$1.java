package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RewardRelativeAmount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardRelativeAmount((Money) obj2, (Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardRelativeAmount rewardRelativeAmount = (RewardRelativeAmount) obj;
        reverseProtoWriter.getClass();
        rewardRelativeAmount.getClass();
        reverseProtoWriter.writeBytes(rewardRelativeAmount.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, rewardRelativeAmount.max_reward);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, rewardRelativeAmount.basis_points);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RewardRelativeAmount rewardRelativeAmount = (RewardRelativeAmount) obj;
        rewardRelativeAmount.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, rewardRelativeAmount.max_reward) + ProtoAdapter.INT32.encodedSizeWithTag(1, rewardRelativeAmount.basis_points) + rewardRelativeAmount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RewardRelativeAmount rewardRelativeAmount = (RewardRelativeAmount) obj;
        rewardRelativeAmount.getClass();
        Money money = rewardRelativeAmount.max_reward;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = rewardRelativeAmount.basis_points;
        byteString.getClass();
        return new RewardRelativeAmount(money2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardRelativeAmount rewardRelativeAmount = (RewardRelativeAmount) obj;
        rewardRelativeAmount.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rewardRelativeAmount.basis_points);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, rewardRelativeAmount.max_reward);
        protoWriter.writeBytes(rewardRelativeAmount.unknownFields());
    }
}
