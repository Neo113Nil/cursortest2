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
public final class TappableIcon$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TappableIcon((TapAction) obj, (Icon) obj2, (LocalizedString) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TappableIcon tappableIcon = (TappableIcon) obj;
        reverseProtoWriter.getClass();
        tappableIcon.getClass();
        reverseProtoWriter.writeBytes(tappableIcon.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, tappableIcon.accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, tappableIcon.accessibility_label);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tappableIcon.arcade_icon);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tappableIcon.tap_action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TappableIcon tappableIcon = (TappableIcon) obj;
        tappableIcon.getClass();
        int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(2, tappableIcon.arcade_icon) + TapAction.ADAPTER.encodedSizeWithTag(1, tappableIcon.tap_action) + tappableIcon.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, tappableIcon.accessibility_text) + protoAdapter.encodedSizeWithTag(3, tappableIcon.accessibility_label) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TappableIcon tappableIcon = (TappableIcon) obj;
        tappableIcon.getClass();
        TapAction tapAction = tappableIcon.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Icon icon = tappableIcon.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = tappableIcon.accessibility_label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = tappableIcon.accessibility_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TappableIcon(tapAction2, icon2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TappableIcon tappableIcon = (TappableIcon) obj;
        tappableIcon.getClass();
        TapAction.ADAPTER.encodeWithTag(protoWriter, 1, tappableIcon.tap_action);
        Icon.ADAPTER.encodeWithTag(protoWriter, 2, tappableIcon.arcade_icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, tappableIcon.accessibility_label);
        protoAdapter.encodeWithTag(protoWriter, 4, tappableIcon.accessibility_text);
        protoWriter.writeBytes(tappableIcon.unknownFields());
    }
}
