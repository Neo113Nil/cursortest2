package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public final class CardBlockedBusinessesUIConfig$MerchantRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardBlockedBusinessesUIConfig.MerchantRow((String) obj, (String) obj2, (String) obj3, (CdfEvent) obj4, (String) obj5, (CdfEvent) obj6, (LocalizedString) obj7, (Color) obj8, (Avatar) obj9, (UiAvatar) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj8);
                    break;
                case 10:
                    obj9 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj9);
                    break;
                case 11:
                    obj10 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj10);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardBlockedBusinessesUIConfig.MerchantRow merchantRow = (CardBlockedBusinessesUIConfig.MerchantRow) obj;
        reverseProtoWriter.getClass();
        merchantRow.getClass();
        reverseProtoWriter.writeBytes(merchantRow.unknownFields());
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 11, merchantRow.ui_avatar);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 10, merchantRow.merchant_ui_avatar);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 9, merchantRow.button_action_title_color);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, merchantRow.button_action_title);
        ProtoAdapter protoAdapter = CdfEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, merchantRow.button_action_event);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, merchantRow.button_action_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, merchantRow.row_tap_action_event);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, merchantRow.row_tap_action_client_route);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, merchantRow.merchant_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, merchantRow.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardBlockedBusinessesUIConfig.MerchantRow merchantRow = (CardBlockedBusinessesUIConfig.MerchantRow) obj;
        merchantRow.getClass();
        int size$okio = merchantRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, merchantRow.row_tap_action_client_route) + protoAdapter.encodedSizeWithTag(2, merchantRow.merchant_name) + protoAdapter.encodedSizeWithTag(1, merchantRow.merchant_token) + size$okio;
        ProtoAdapter protoAdapter2 = CdfEvent.ADAPTER;
        return UiAvatar.ADAPTER.encodedSizeWithTag(11, merchantRow.ui_avatar) + Avatar.ADAPTER.encodedSizeWithTag(10, merchantRow.merchant_ui_avatar) + Color.ADAPTER.encodedSizeWithTag(9, merchantRow.button_action_title_color) + LocalizedString.ADAPTER.encodedSizeWithTag(8, merchantRow.button_action_title) + protoAdapter2.encodedSizeWithTag(7, merchantRow.button_action_event) + protoAdapter.encodedSizeWithTag(6, merchantRow.button_action_client_route) + protoAdapter2.encodedSizeWithTag(5, merchantRow.row_tap_action_event) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardBlockedBusinessesUIConfig.MerchantRow merchantRow = (CardBlockedBusinessesUIConfig.MerchantRow) obj;
        merchantRow.getClass();
        CdfEvent cdfEvent = merchantRow.row_tap_action_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        CdfEvent cdfEvent3 = merchantRow.button_action_event;
        CdfEvent cdfEvent4 = cdfEvent3 != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent3) : null;
        LocalizedString localizedString = merchantRow.button_action_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Color color = merchantRow.button_action_title_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Avatar avatar = merchantRow.merchant_ui_avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        UiAvatar uiAvatar = merchantRow.ui_avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = merchantRow.merchant_token;
        String str2 = merchantRow.merchant_name;
        String str3 = merchantRow.row_tap_action_client_route;
        String str4 = merchantRow.button_action_client_route;
        byteString.getClass();
        return new CardBlockedBusinessesUIConfig.MerchantRow(str, str2, str3, cdfEvent2, str4, cdfEvent4, localizedString2, color2, avatar2, uiAvatar2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardBlockedBusinessesUIConfig.MerchantRow merchantRow = (CardBlockedBusinessesUIConfig.MerchantRow) obj;
        merchantRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, merchantRow.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 2, merchantRow.merchant_name);
        protoAdapter.encodeWithTag(protoWriter, 4, merchantRow.row_tap_action_client_route);
        ProtoAdapter protoAdapter2 = CdfEvent.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, merchantRow.row_tap_action_event);
        protoAdapter.encodeWithTag(protoWriter, 6, merchantRow.button_action_client_route);
        protoAdapter2.encodeWithTag(protoWriter, 7, merchantRow.button_action_event);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 8, merchantRow.button_action_title);
        Color.ADAPTER.encodeWithTag(protoWriter, 9, merchantRow.button_action_title_color);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 10, merchantRow.merchant_ui_avatar);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 11, merchantRow.ui_avatar);
        protoWriter.writeBytes(merchantRow.unknownFields());
    }
}
