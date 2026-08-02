package com.squareup.protos.franklin.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RewardSelection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzee rewardSelection$States$UnlockInProgress;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        zzee zzeeVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardSelection((String) obj, (String) obj2, (Long) obj3, zzeeVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 3:
                    rewardSelection$States$UnlockInProgress = new RewardSelection$States$UnlockInProgress((RewardSelection.UnlockInProgress) RewardSelection.UnlockInProgress.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    rewardSelection$States$UnlockInProgress = new RewardSelection$States$Active((RewardSelection.Active) RewardSelection.Active.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    rewardSelection$States$UnlockInProgress = new RewardSelection$States$Disabled((RewardSelection.Disabled) RewardSelection.Disabled.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzeeVar = rewardSelection$States$UnlockInProgress;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardSelection rewardSelection = (RewardSelection) obj;
        reverseProtoWriter.getClass();
        rewardSelection.getClass();
        reverseProtoWriter.writeBytes(rewardSelection.unknownFields());
        zzee zzeeVar = rewardSelection.states;
        if (zzeeVar instanceof RewardSelection$States$UnlockInProgress) {
            RewardSelection.UnlockInProgress.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((RewardSelection$States$UnlockInProgress) zzeeVar).getValue());
        } else if (zzeeVar instanceof RewardSelection$States$Active) {
            RewardSelection.Active.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((RewardSelection$States$Active) zzeeVar).getValue());
        } else if (zzeeVar instanceof RewardSelection$States$Disabled) {
            RewardSelection.Disabled.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((RewardSelection$States$Disabled) zzeeVar).getValue());
        } else if (zzeeVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, rewardSelection.version);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, rewardSelection.reward_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, rewardSelection.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RewardSelection rewardSelection = (RewardSelection) obj;
        rewardSelection.getClass();
        int size$okio = rewardSelection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, rewardSelection.version) + protoAdapter.encodedSizeWithTag(1, rewardSelection.reward_token) + protoAdapter.encodedSizeWithTag(6, rewardSelection.token) + size$okio;
        zzee zzeeVar = rewardSelection.states;
        if (zzeeVar instanceof RewardSelection$States$UnlockInProgress) {
            return RewardSelection.UnlockInProgress.ADAPTER.encodedSizeWithTag(3, ((RewardSelection$States$UnlockInProgress) zzeeVar).getValue()) + encodedSizeWithTag;
        }
        if (zzeeVar instanceof RewardSelection$States$Active) {
            return RewardSelection.Active.ADAPTER.encodedSizeWithTag(4, ((RewardSelection$States$Active) zzeeVar).getValue()) + encodedSizeWithTag;
        }
        if (zzeeVar instanceof RewardSelection$States$Disabled) {
            return RewardSelection.Disabled.ADAPTER.encodedSizeWithTag(5, ((RewardSelection$States$Disabled) zzeeVar).getValue()) + encodedSizeWithTag;
        }
        if (zzeeVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RewardSelection rewardSelection = (RewardSelection) obj;
        rewardSelection.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = rewardSelection.token;
        String str2 = rewardSelection.reward_token;
        Long l = rewardSelection.version;
        zzee zzeeVar = rewardSelection.states;
        byteString.getClass();
        return new RewardSelection(str, str2, l, zzeeVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardSelection rewardSelection = (RewardSelection) obj;
        rewardSelection.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 6, rewardSelection.token);
        protoAdapter.encodeWithTag(protoWriter, 1, rewardSelection.reward_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rewardSelection.version);
        zzee zzeeVar = rewardSelection.states;
        if (zzeeVar instanceof RewardSelection$States$UnlockInProgress) {
            RewardSelection.UnlockInProgress.ADAPTER.encodeWithTag(protoWriter, 3, ((RewardSelection$States$UnlockInProgress) zzeeVar).getValue());
        } else if (zzeeVar instanceof RewardSelection$States$Active) {
            RewardSelection.Active.ADAPTER.encodeWithTag(protoWriter, 4, ((RewardSelection$States$Active) zzeeVar).getValue());
        } else if (zzeeVar instanceof RewardSelection$States$Disabled) {
            RewardSelection.Disabled.ADAPTER.encodeWithTag(protoWriter, 5, ((RewardSelection$States$Disabled) zzeeVar).getValue());
        } else if (zzeeVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(rewardSelection.unknownFields());
    }
}
