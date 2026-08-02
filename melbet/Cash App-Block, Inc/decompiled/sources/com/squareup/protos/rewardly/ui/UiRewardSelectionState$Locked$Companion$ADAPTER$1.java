package com.squareup.protos.rewardly.ui;

import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiRewardSelectionState$Locked$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardSelectionState.Locked((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardSelectionState.Locked locked = (UiRewardSelectionState.Locked) obj;
        reverseProtoWriter.getClass();
        locked.getClass();
        reverseProtoWriter.writeBytes(locked.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, locked.styled_progress_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardSelectionState.Locked locked = (UiRewardSelectionState.Locked) obj;
        locked.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, locked.styled_progress_text) + locked.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardSelectionState.Locked locked = (UiRewardSelectionState.Locked) obj;
        locked.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = locked.styled_progress_text;
        byteString.getClass();
        return new UiRewardSelectionState.Locked(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardSelectionState.Locked locked = (UiRewardSelectionState.Locked) obj;
        locked.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, locked.styled_progress_text);
        protoWriter.writeBytes(locked.unknownFields());
    }
}
