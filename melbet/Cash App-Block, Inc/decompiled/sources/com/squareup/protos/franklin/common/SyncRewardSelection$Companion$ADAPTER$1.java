package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncRewardSelection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncRewardSelection((RewardSelection) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RewardSelection.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncRewardSelection syncRewardSelection = (SyncRewardSelection) obj;
        reverseProtoWriter.getClass();
        syncRewardSelection.getClass();
        reverseProtoWriter.writeBytes(syncRewardSelection.unknownFields());
        RewardSelection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncRewardSelection.reward_selection);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncRewardSelection syncRewardSelection = (SyncRewardSelection) obj;
        syncRewardSelection.getClass();
        return RewardSelection.ADAPTER.encodedSizeWithTag(1, syncRewardSelection.reward_selection) + syncRewardSelection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncRewardSelection syncRewardSelection = (SyncRewardSelection) obj;
        syncRewardSelection.getClass();
        RewardSelection rewardSelection = syncRewardSelection.reward_selection;
        RewardSelection rewardSelection2 = rewardSelection != null ? (RewardSelection) RewardSelection.ADAPTER.redact(rewardSelection) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncRewardSelection(rewardSelection2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncRewardSelection syncRewardSelection = (SyncRewardSelection) obj;
        syncRewardSelection.getClass();
        RewardSelection.ADAPTER.encodeWithTag(protoWriter, 1, syncRewardSelection.reward_selection);
        protoWriter.writeBytes(syncRewardSelection.unknownFields());
    }
}
