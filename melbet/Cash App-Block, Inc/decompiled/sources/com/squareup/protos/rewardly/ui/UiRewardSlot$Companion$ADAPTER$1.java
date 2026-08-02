package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiRewardSlot$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiRewardSlot((String) obj, (RewardSlotState) obj2, (UiSelectedReward) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = RewardSlotState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(UiSelectedReward.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardSlot uiRewardSlot = (UiRewardSlot) obj;
        reverseProtoWriter.getClass();
        uiRewardSlot.getClass();
        reverseProtoWriter.writeBytes(uiRewardSlot.unknownFields());
        UiSelectedReward.ADAPTER.encodeWithTag(reverseProtoWriter, 3, uiRewardSlot.selected_reward);
        RewardSlotState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiRewardSlot.state);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, uiRewardSlot.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardSlot uiRewardSlot = (UiRewardSlot) obj;
        uiRewardSlot.getClass();
        return UiSelectedReward.ADAPTER.encodedSizeWithTag(3, uiRewardSlot.selected_reward) + RewardSlotState.ADAPTER.encodedSizeWithTag(2, uiRewardSlot.state) + ProtoAdapter.STRING.encodedSizeWithTag(1, uiRewardSlot.token) + uiRewardSlot.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardSlot uiRewardSlot = (UiRewardSlot) obj;
        uiRewardSlot.getClass();
        UiSelectedReward uiSelectedReward = uiRewardSlot.selected_reward;
        UiSelectedReward uiSelectedReward2 = uiSelectedReward != null ? (UiSelectedReward) UiSelectedReward.ADAPTER.redact(uiSelectedReward) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = uiRewardSlot.token;
        RewardSlotState rewardSlotState = uiRewardSlot.state;
        byteString.getClass();
        return new UiRewardSlot(str, rewardSlotState, uiSelectedReward2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardSlot uiRewardSlot = (UiRewardSlot) obj;
        uiRewardSlot.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uiRewardSlot.token);
        RewardSlotState.ADAPTER.encodeWithTag(protoWriter, 2, uiRewardSlot.state);
        UiSelectedReward.ADAPTER.encodeWithTag(protoWriter, 3, uiRewardSlot.selected_reward);
        protoWriter.writeBytes(uiRewardSlot.unknownFields());
    }
}
