package com.squareup.protos.rewardly.ui;

import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiRewardSelectionState$Unlocked$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardSelectionState.Unlocked(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardSelectionState.Unlocked unlocked = (UiRewardSelectionState.Unlocked) obj;
        reverseProtoWriter.getClass();
        unlocked.getClass();
        reverseProtoWriter.writeBytes(unlocked.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardSelectionState.Unlocked unlocked = (UiRewardSelectionState.Unlocked) obj;
        unlocked.getClass();
        return unlocked.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UiRewardSelectionState.Unlocked) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiRewardSelectionState.Unlocked(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardSelectionState.Unlocked unlocked = (UiRewardSelectionState.Unlocked) obj;
        unlocked.getClass();
        protoWriter.writeBytes(unlocked.unknownFields());
    }
}
