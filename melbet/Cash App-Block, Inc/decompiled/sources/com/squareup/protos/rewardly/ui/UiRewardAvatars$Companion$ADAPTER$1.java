package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UiRewardAvatars$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardAvatars(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(UiRewardAvatar.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardAvatars uiRewardAvatars = (UiRewardAvatars) obj;
        reverseProtoWriter.getClass();
        uiRewardAvatars.getClass();
        reverseProtoWriter.writeBytes(uiRewardAvatars.unknownFields());
        UiRewardAvatar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, uiRewardAvatars.reward_avatars);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardAvatars uiRewardAvatars = (UiRewardAvatars) obj;
        uiRewardAvatars.getClass();
        return UiRewardAvatar.ADAPTER.asRepeated().encodedSizeWithTag(1, uiRewardAvatars.reward_avatars) + uiRewardAvatars.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardAvatars uiRewardAvatars = (UiRewardAvatars) obj;
        uiRewardAvatars.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(uiRewardAvatars.reward_avatars, UiRewardAvatar.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiRewardAvatars(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardAvatars uiRewardAvatars = (UiRewardAvatars) obj;
        uiRewardAvatars.getClass();
        UiRewardAvatar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, uiRewardAvatars.reward_avatars);
        protoWriter.writeBytes(uiRewardAvatars.unknownFields());
    }
}
