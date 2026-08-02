package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AvatarItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AvatarItem((AnalyticsEvent) obj, (TapAction) obj2, (UiAvatar) obj3, (EngagedItemToken) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarItem avatarItem = (AvatarItem) obj;
        reverseProtoWriter.getClass();
        avatarItem.getClass();
        reverseProtoWriter.writeBytes(avatarItem.unknownFields());
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 5, avatarItem.engaged_token);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, avatarItem.avatar);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, avatarItem.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatarItem.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarItem avatarItem = (AvatarItem) obj;
        avatarItem.getClass();
        return EngagedItemToken.ADAPTER.encodedSizeWithTag(5, avatarItem.engaged_token) + UiAvatar.ADAPTER.encodedSizeWithTag(3, avatarItem.avatar) + TapAction.ADAPTER.encodedSizeWithTag(2, avatarItem.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, avatarItem.analytics_view_event) + avatarItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarItem avatarItem = (AvatarItem) obj;
        avatarItem.getClass();
        AnalyticsEvent analyticsEvent = avatarItem.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TapAction tapAction = avatarItem.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        UiAvatar uiAvatar = avatarItem.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        EngagedItemToken engagedItemToken = avatarItem.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AvatarItem(analyticsEvent2, tapAction2, uiAvatar2, engagedItemToken2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarItem avatarItem = (AvatarItem) obj;
        avatarItem.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, avatarItem.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, avatarItem.tap_action);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 3, avatarItem.avatar);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 5, avatarItem.engaged_token);
        protoWriter.writeBytes(avatarItem.unknownFields());
    }
}
