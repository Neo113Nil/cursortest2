package com.squareup.protos.rewardly.ui;

import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UiRewardSelectionState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzjr zzjrVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardSelectionState((String) obj, zzjrVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                zzjrVar = new UiRewardSelectionState$States$Locked((UiRewardSelectionState.Locked) UiRewardSelectionState.Locked.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzjrVar = new UiRewardSelectionState$States$Unlocked((UiRewardSelectionState.Unlocked) UiRewardSelectionState.Unlocked.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjrVar = new UiRewardSelectionState$States$UnlockInProgress((UiRewardSelectionState.UnlockInProgress) UiRewardSelectionState.UnlockInProgress.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardSelectionState uiRewardSelectionState = (UiRewardSelectionState) obj;
        reverseProtoWriter.getClass();
        uiRewardSelectionState.getClass();
        reverseProtoWriter.writeBytes(uiRewardSelectionState.unknownFields());
        zzjr zzjrVar = uiRewardSelectionState.states;
        if (zzjrVar instanceof UiRewardSelectionState$States$Locked) {
            UiRewardSelectionState.Locked.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((UiRewardSelectionState$States$Locked) zzjrVar).getValue());
        } else if (zzjrVar instanceof UiRewardSelectionState$States$Unlocked) {
            UiRewardSelectionState.Unlocked.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((UiRewardSelectionState$States$Unlocked) zzjrVar).getValue());
        } else if (zzjrVar instanceof UiRewardSelectionState$States$UnlockInProgress) {
            UiRewardSelectionState.UnlockInProgress.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((UiRewardSelectionState$States$UnlockInProgress) zzjrVar).getValue());
        } else if (zzjrVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, uiRewardSelectionState.reward_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardSelectionState uiRewardSelectionState = (UiRewardSelectionState) obj;
        uiRewardSelectionState.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uiRewardSelectionState.reward_token) + uiRewardSelectionState.unknownFields().getSize$okio();
        zzjr zzjrVar = uiRewardSelectionState.states;
        if (zzjrVar instanceof UiRewardSelectionState$States$Locked) {
            return UiRewardSelectionState.Locked.ADAPTER.encodedSizeWithTag(2, ((UiRewardSelectionState$States$Locked) zzjrVar).getValue()) + encodedSizeWithTag;
        }
        if (zzjrVar instanceof UiRewardSelectionState$States$Unlocked) {
            return UiRewardSelectionState.Unlocked.ADAPTER.encodedSizeWithTag(3, ((UiRewardSelectionState$States$Unlocked) zzjrVar).getValue()) + encodedSizeWithTag;
        }
        if (zzjrVar instanceof UiRewardSelectionState$States$UnlockInProgress) {
            return UiRewardSelectionState.UnlockInProgress.ADAPTER.encodedSizeWithTag(4, ((UiRewardSelectionState$States$UnlockInProgress) zzjrVar).getValue()) + encodedSizeWithTag;
        }
        if (zzjrVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardSelectionState uiRewardSelectionState = (UiRewardSelectionState) obj;
        uiRewardSelectionState.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uiRewardSelectionState.reward_token;
        zzjr zzjrVar = uiRewardSelectionState.states;
        byteString.getClass();
        return new UiRewardSelectionState(str, zzjrVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardSelectionState uiRewardSelectionState = (UiRewardSelectionState) obj;
        uiRewardSelectionState.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uiRewardSelectionState.reward_token);
        zzjr zzjrVar = uiRewardSelectionState.states;
        if (zzjrVar instanceof UiRewardSelectionState$States$Locked) {
            UiRewardSelectionState.Locked.ADAPTER.encodeWithTag(protoWriter, 2, ((UiRewardSelectionState$States$Locked) zzjrVar).getValue());
        } else if (zzjrVar instanceof UiRewardSelectionState$States$Unlocked) {
            UiRewardSelectionState.Unlocked.ADAPTER.encodeWithTag(protoWriter, 3, ((UiRewardSelectionState$States$Unlocked) zzjrVar).getValue());
        } else if (zzjrVar instanceof UiRewardSelectionState$States$UnlockInProgress) {
            UiRewardSelectionState.UnlockInProgress.ADAPTER.encodeWithTag(protoWriter, 4, ((UiRewardSelectionState$States$UnlockInProgress) zzjrVar).getValue());
        } else if (zzjrVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(uiRewardSelectionState.unknownFields());
    }
}
