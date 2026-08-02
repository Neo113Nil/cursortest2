package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiRewardSelectionState$UnlockInProgress$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiRewardSelectionState.UnlockInProgress((String) obj, (String) obj2, (UiRewardSelectionState.UnlockInProgress.Button) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(UiRewardSelectionState.UnlockInProgress.Button.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardSelectionState.UnlockInProgress unlockInProgress = (UiRewardSelectionState.UnlockInProgress) obj;
        reverseProtoWriter.getClass();
        unlockInProgress.getClass();
        reverseProtoWriter.writeBytes(unlockInProgress.unknownFields());
        UiRewardSelectionState.UnlockInProgress.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, unlockInProgress.button);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, unlockInProgress.styled_progress_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, unlockInProgress.fallback_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardSelectionState.UnlockInProgress unlockInProgress = (UiRewardSelectionState.UnlockInProgress) obj;
        unlockInProgress.getClass();
        int size$okio = unlockInProgress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return UiRewardSelectionState.UnlockInProgress.Button.ADAPTER.encodedSizeWithTag(3, unlockInProgress.button) + protoAdapter.encodedSizeWithTag(2, unlockInProgress.styled_progress_text) + protoAdapter.encodedSizeWithTag(1, unlockInProgress.fallback_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardSelectionState.UnlockInProgress unlockInProgress = (UiRewardSelectionState.UnlockInProgress) obj;
        unlockInProgress.getClass();
        UiRewardSelectionState.UnlockInProgress.Button button = unlockInProgress.button;
        UiRewardSelectionState.UnlockInProgress.Button button2 = button != null ? (UiRewardSelectionState.UnlockInProgress.Button) UiRewardSelectionState.UnlockInProgress.Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = unlockInProgress.fallback_text;
        String str2 = unlockInProgress.styled_progress_text;
        byteString.getClass();
        return new UiRewardSelectionState.UnlockInProgress(str, str2, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardSelectionState.UnlockInProgress unlockInProgress = (UiRewardSelectionState.UnlockInProgress) obj;
        unlockInProgress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, unlockInProgress.fallback_text);
        protoAdapter.encodeWithTag(protoWriter, 2, unlockInProgress.styled_progress_text);
        UiRewardSelectionState.UnlockInProgress.Button.ADAPTER.encodeWithTag(protoWriter, 3, unlockInProgress.button);
        protoWriter.writeBytes(unlockInProgress.unknownFields());
    }
}
