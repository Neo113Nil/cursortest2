package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class IconTextSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new IconTextSection((Icon) obj, (TintedIcon) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (TapAction) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 3) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag == 4) {
                obj5 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj5);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TintedIcon.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IconTextSection iconTextSection = (IconTextSection) obj;
        reverseProtoWriter.getClass();
        iconTextSection.getClass();
        reverseProtoWriter.writeBytes(iconTextSection.unknownFields());
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, iconTextSection.tap_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, iconTextSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, iconTextSection.title);
        TintedIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 5, iconTextSection.tinted_icon);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, iconTextSection.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IconTextSection iconTextSection = (IconTextSection) obj;
        iconTextSection.getClass();
        int encodedSizeWithTag = TintedIcon.ADAPTER.encodedSizeWithTag(5, iconTextSection.tinted_icon) + Icon.ADAPTER.encodedSizeWithTag(1, iconTextSection.icon) + iconTextSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return TapAction.ADAPTER.encodedSizeWithTag(4, iconTextSection.tap_action) + protoAdapter.encodedSizeWithTag(3, iconTextSection.subtitle) + protoAdapter.encodedSizeWithTag(2, iconTextSection.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IconTextSection iconTextSection = (IconTextSection) obj;
        iconTextSection.getClass();
        Icon icon = iconTextSection.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        TintedIcon tintedIcon = iconTextSection.tinted_icon;
        TintedIcon tintedIcon2 = tintedIcon != null ? (TintedIcon) TintedIcon.ADAPTER.redact(tintedIcon) : null;
        LocalizedString localizedString = iconTextSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = iconTextSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        TapAction tapAction = iconTextSection.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new IconTextSection(icon2, tintedIcon2, localizedString2, localizedString4, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IconTextSection iconTextSection = (IconTextSection) obj;
        iconTextSection.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, iconTextSection.icon);
        TintedIcon.ADAPTER.encodeWithTag(protoWriter, 5, iconTextSection.tinted_icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, iconTextSection.title);
        protoAdapter.encodeWithTag(protoWriter, 3, iconTextSection.subtitle);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 4, iconTextSection.tap_action);
        protoWriter.writeBytes(iconTextSection.unknownFields());
    }
}
