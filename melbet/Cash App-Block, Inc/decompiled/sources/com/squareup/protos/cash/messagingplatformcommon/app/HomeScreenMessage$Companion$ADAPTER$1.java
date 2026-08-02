package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HomeScreenMessage$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new HomeScreenMessage((String) obj, (String) obj2, (String) obj3, (AppMessageAction) obj4, (AppMessageAction) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj4);
            } else if (nextTag == 5) {
                obj5 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj5);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HomeScreenMessage homeScreenMessage = (HomeScreenMessage) obj;
        reverseProtoWriter.getClass();
        homeScreenMessage.getClass();
        reverseProtoWriter.writeBytes(homeScreenMessage.unknownFields());
        ProtoAdapter protoAdapter = AppMessageAction.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, homeScreenMessage.secondary_navigation_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, homeScreenMessage.primary_navigation_action);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, homeScreenMessage.asset_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, homeScreenMessage.message_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, homeScreenMessage.headline);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HomeScreenMessage homeScreenMessage = (HomeScreenMessage) obj;
        homeScreenMessage.getClass();
        int size$okio = homeScreenMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, homeScreenMessage.asset_url) + protoAdapter.encodedSizeWithTag(6, homeScreenMessage.message_text) + protoAdapter.encodedSizeWithTag(1, homeScreenMessage.headline) + size$okio;
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(5, homeScreenMessage.secondary_navigation_action) + protoAdapter2.encodedSizeWithTag(4, homeScreenMessage.primary_navigation_action) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HomeScreenMessage homeScreenMessage = (HomeScreenMessage) obj;
        homeScreenMessage.getClass();
        AppMessageAction appMessageAction = homeScreenMessage.primary_navigation_action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        AppMessageAction appMessageAction3 = homeScreenMessage.secondary_navigation_action;
        AppMessageAction appMessageAction4 = appMessageAction3 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = homeScreenMessage.headline;
        String str2 = homeScreenMessage.message_text;
        String str3 = homeScreenMessage.asset_url;
        byteString.getClass();
        return new HomeScreenMessage(str, str2, str3, appMessageAction2, appMessageAction4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HomeScreenMessage homeScreenMessage = (HomeScreenMessage) obj;
        homeScreenMessage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, homeScreenMessage.headline);
        protoAdapter.encodeWithTag(protoWriter, 6, homeScreenMessage.message_text);
        protoAdapter.encodeWithTag(protoWriter, 2, homeScreenMessage.asset_url);
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, homeScreenMessage.primary_navigation_action);
        protoAdapter2.encodeWithTag(protoWriter, 5, homeScreenMessage.secondary_navigation_action);
        protoWriter.writeBytes(homeScreenMessage.unknownFields());
    }
}
