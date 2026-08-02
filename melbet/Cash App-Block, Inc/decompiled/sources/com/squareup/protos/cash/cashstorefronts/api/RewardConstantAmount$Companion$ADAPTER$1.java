package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RewardConstantAmount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardConstantAmount((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardConstantAmount rewardConstantAmount = (RewardConstantAmount) obj;
        reverseProtoWriter.getClass();
        rewardConstantAmount.getClass();
        reverseProtoWriter.writeBytes(rewardConstantAmount.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, rewardConstantAmount.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RewardConstantAmount rewardConstantAmount = (RewardConstantAmount) obj;
        rewardConstantAmount.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, rewardConstantAmount.amount) + rewardConstantAmount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RewardConstantAmount rewardConstantAmount = (RewardConstantAmount) obj;
        rewardConstantAmount.getClass();
        Money money = rewardConstantAmount.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RewardConstantAmount(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardConstantAmount rewardConstantAmount = (RewardConstantAmount) obj;
        rewardConstantAmount.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, rewardConstantAmount.amount);
        protoWriter.writeBytes(rewardConstantAmount.unknownFields());
    }
}
