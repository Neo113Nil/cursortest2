package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpsellCardSection$AvatarStack$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpsellCardSection.AvatarStack(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(UiAvatar.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpsellCardSection.AvatarStack avatarStack = (UpsellCardSection.AvatarStack) obj;
        reverseProtoWriter.getClass();
        avatarStack.getClass();
        reverseProtoWriter.writeBytes(avatarStack.unknownFields());
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, avatarStack.avatars);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpsellCardSection.AvatarStack avatarStack = (UpsellCardSection.AvatarStack) obj;
        avatarStack.getClass();
        return UiAvatar.ADAPTER.asRepeated().encodedSizeWithTag(1, avatarStack.avatars) + avatarStack.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpsellCardSection.AvatarStack avatarStack = (UpsellCardSection.AvatarStack) obj;
        avatarStack.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(avatarStack.avatars, UiAvatar.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpsellCardSection.AvatarStack(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpsellCardSection.AvatarStack avatarStack = (UpsellCardSection.AvatarStack) obj;
        avatarStack.getClass();
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, avatarStack.avatars);
        protoWriter.writeBytes(avatarStack.unknownFields());
    }
}
