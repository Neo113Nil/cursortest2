package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$AvatarTextFooter$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AppletCardSection.AvatarTextFooter(m, (LocalizedString) obj, (LocalizedString) obj2, (com.squareup.protos.cash.shop.rendering.api.TapAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                obj3 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.AvatarTextFooter avatarTextFooter = (AppletCardSection.AvatarTextFooter) obj;
        reverseProtoWriter.getClass();
        avatarTextFooter.getClass();
        reverseProtoWriter.writeBytes(avatarTextFooter.unknownFields());
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, avatarTextFooter.tap_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, avatarTextFooter.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, avatarTextFooter.title);
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, avatarTextFooter.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppletCardSection.AvatarTextFooter avatarTextFooter = (AppletCardSection.AvatarTextFooter) obj;
        avatarTextFooter.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.asRepeated().encodedSizeWithTag(1, avatarTextFooter.avatar) + avatarTextFooter.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(4, avatarTextFooter.tap_action) + protoAdapter.encodedSizeWithTag(3, avatarTextFooter.subtitle) + protoAdapter.encodedSizeWithTag(2, avatarTextFooter.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.AvatarTextFooter avatarTextFooter = (AppletCardSection.AvatarTextFooter) obj;
        avatarTextFooter.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(avatarTextFooter.avatar, UiAvatar.ADAPTER);
        LocalizedString localizedString = avatarTextFooter.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = avatarTextFooter.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = avatarTextFooter.tap_action;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction2 = tapAction != null ? (com.squareup.protos.cash.shop.rendering.api.TapAction) com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AppletCardSection.AvatarTextFooter(m1169redactElements, localizedString2, localizedString4, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.AvatarTextFooter avatarTextFooter = (AppletCardSection.AvatarTextFooter) obj;
        avatarTextFooter.getClass();
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, avatarTextFooter.avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, avatarTextFooter.title);
        protoAdapter.encodeWithTag(protoWriter, 3, avatarTextFooter.subtitle);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(protoWriter, 4, avatarTextFooter.tap_action);
        protoWriter.writeBytes(avatarTextFooter.unknownFields());
    }
}
