package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public final class CardBlockedBusinessesUIConfig$NavigationHelpItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardBlockedBusinessesUIConfig.NavigationHelpItem((String) obj, (CdfEvent) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardBlockedBusinessesUIConfig.NavigationHelpItem navigationHelpItem = (CardBlockedBusinessesUIConfig.NavigationHelpItem) obj;
        reverseProtoWriter.getClass();
        navigationHelpItem.getClass();
        reverseProtoWriter.writeBytes(navigationHelpItem.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, navigationHelpItem.navigation_item_accessibility_text);
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, navigationHelpItem.navigation_item_action_event);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, navigationHelpItem.navigation_item_action_client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardBlockedBusinessesUIConfig.NavigationHelpItem navigationHelpItem = (CardBlockedBusinessesUIConfig.NavigationHelpItem) obj;
        navigationHelpItem.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, navigationHelpItem.navigation_item_accessibility_text) + CdfEvent.ADAPTER.encodedSizeWithTag(2, navigationHelpItem.navigation_item_action_event) + ProtoAdapter.STRING.encodedSizeWithTag(1, navigationHelpItem.navigation_item_action_client_route) + navigationHelpItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardBlockedBusinessesUIConfig.NavigationHelpItem navigationHelpItem = (CardBlockedBusinessesUIConfig.NavigationHelpItem) obj;
        navigationHelpItem.getClass();
        CdfEvent cdfEvent = navigationHelpItem.navigation_item_action_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        LocalizedString localizedString = navigationHelpItem.navigation_item_accessibility_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = navigationHelpItem.navigation_item_action_client_route;
        byteString.getClass();
        return new CardBlockedBusinessesUIConfig.NavigationHelpItem(str, cdfEvent2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardBlockedBusinessesUIConfig.NavigationHelpItem navigationHelpItem = (CardBlockedBusinessesUIConfig.NavigationHelpItem) obj;
        navigationHelpItem.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, navigationHelpItem.navigation_item_action_client_route);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 2, navigationHelpItem.navigation_item_action_event);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, navigationHelpItem.navigation_item_accessibility_text);
        protoWriter.writeBytes(navigationHelpItem.unknownFields());
    }
}
