package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarTextSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarTextSection(m, (LocalizedString) obj, (LocalizedString) obj2, (TapAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(UiAvatar.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarTextSection avatarTextSection = (AvatarTextSection) obj;
        reverseProtoWriter.getClass();
        avatarTextSection.getClass();
        reverseProtoWriter.writeBytes(avatarTextSection.unknownFields());
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, avatarTextSection.tap_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, avatarTextSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, avatarTextSection.title);
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, avatarTextSection.avatars);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarTextSection avatarTextSection = (AvatarTextSection) obj;
        avatarTextSection.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.asRepeated().encodedSizeWithTag(1, avatarTextSection.avatars) + avatarTextSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return TapAction.ADAPTER.encodedSizeWithTag(4, avatarTextSection.tap_action) + protoAdapter.encodedSizeWithTag(3, avatarTextSection.subtitle) + protoAdapter.encodedSizeWithTag(2, avatarTextSection.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarTextSection avatarTextSection = (AvatarTextSection) obj;
        avatarTextSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(avatarTextSection.avatars, UiAvatar.ADAPTER);
        LocalizedString localizedString = avatarTextSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = avatarTextSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        TapAction tapAction = avatarTextSection.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AvatarTextSection(m1169redactElements, localizedString2, localizedString4, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarTextSection avatarTextSection = (AvatarTextSection) obj;
        avatarTextSection.getClass();
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, avatarTextSection.avatars);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, avatarTextSection.title);
        protoAdapter.encodeWithTag(protoWriter, 3, avatarTextSection.subtitle);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 4, avatarTextSection.tap_action);
        protoWriter.writeBytes(avatarTextSection.unknownFields());
    }
}
