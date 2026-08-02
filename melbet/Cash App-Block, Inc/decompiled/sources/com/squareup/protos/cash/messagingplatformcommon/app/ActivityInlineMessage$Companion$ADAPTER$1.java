package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ActivityInlineMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityInlineMessage((String) obj, (String) obj2, (String) obj3, (AppMessageAction) obj4, (AppMessageAction) obj5, (Boolean) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj4);
                    break;
                case 4:
                    obj5 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj5);
                    break;
                case 5:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityInlineMessage activityInlineMessage = (ActivityInlineMessage) obj;
        reverseProtoWriter.getClass();
        activityInlineMessage.getClass();
        reverseProtoWriter.writeBytes(activityInlineMessage.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, activityInlineMessage.has_viewed);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, activityInlineMessage.increment_activity_badge);
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, activityInlineMessage.secondary_navigation_action);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, activityInlineMessage.primary_navigation_action);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, activityInlineMessage.asset_url);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, activityInlineMessage.message_text);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, activityInlineMessage.headline);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityInlineMessage activityInlineMessage = (ActivityInlineMessage) obj;
        activityInlineMessage.getClass();
        int size$okio = activityInlineMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, activityInlineMessage.asset_url) + protoAdapter.encodedSizeWithTag(6, activityInlineMessage.message_text) + protoAdapter.encodedSizeWithTag(1, activityInlineMessage.headline) + size$okio;
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, activityInlineMessage.secondary_navigation_action) + protoAdapter2.encodedSizeWithTag(3, activityInlineMessage.primary_navigation_action) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter3.encodedSizeWithTag(7, activityInlineMessage.has_viewed) + protoAdapter3.encodedSizeWithTag(5, activityInlineMessage.increment_activity_badge) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityInlineMessage activityInlineMessage = (ActivityInlineMessage) obj;
        activityInlineMessage.getClass();
        AppMessageAction appMessageAction = activityInlineMessage.primary_navigation_action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        AppMessageAction appMessageAction3 = activityInlineMessage.secondary_navigation_action;
        AppMessageAction appMessageAction4 = appMessageAction3 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = activityInlineMessage.headline;
        String str2 = activityInlineMessage.message_text;
        String str3 = activityInlineMessage.asset_url;
        Boolean bool = activityInlineMessage.increment_activity_badge;
        Boolean bool2 = activityInlineMessage.has_viewed;
        byteString.getClass();
        return new ActivityInlineMessage(str, str2, str3, appMessageAction2, appMessageAction4, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityInlineMessage activityInlineMessage = (ActivityInlineMessage) obj;
        activityInlineMessage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, activityInlineMessage.headline);
        protoAdapter.encodeWithTag(protoWriter, 6, activityInlineMessage.message_text);
        protoAdapter.encodeWithTag(protoWriter, 2, activityInlineMessage.asset_url);
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, activityInlineMessage.primary_navigation_action);
        protoAdapter2.encodeWithTag(protoWriter, 4, activityInlineMessage.secondary_navigation_action);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 5, activityInlineMessage.increment_activity_badge);
        protoAdapter3.encodeWithTag(protoWriter, 7, activityInlineMessage.has_viewed);
        protoWriter.writeBytes(activityInlineMessage.unknownFields());
    }
}
