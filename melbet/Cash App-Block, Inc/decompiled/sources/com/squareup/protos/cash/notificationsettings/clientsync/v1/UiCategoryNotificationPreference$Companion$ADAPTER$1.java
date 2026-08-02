package com.squareup.protos.cash.notificationsettings.clientsync.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.notificationsettings.common.v1.CategoryRestriction;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState$Companion$ADAPTER$1;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UiCategoryNotificationPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new UiCategoryNotificationPreference((NotificationCategory) obj, (String) obj2, (ClientChannelState) obj3, (ClientChannelState) obj4, (ClientChannelState) obj5, m, (Long) obj6, (NotificationCategoryExtraConfig) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = NotificationCategory.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj3 = ClientChannelState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    try {
                        obj4 = ClientChannelState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 5:
                    try {
                        obj5 = ClientChannelState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 6:
                    try {
                        CategoryRestriction.ADAPTER.tryDecode(protoReader, m);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 7:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(NotificationCategoryExtraConfig.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj;
        reverseProtoWriter.getClass();
        uiCategoryNotificationPreference.getClass();
        reverseProtoWriter.writeBytes(uiCategoryNotificationPreference.unknownFields());
        NotificationCategoryExtraConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 8, uiCategoryNotificationPreference.extra_config);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, uiCategoryNotificationPreference.version);
        CategoryRestriction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, uiCategoryNotificationPreference.restrictions);
        ClientChannelState$Companion$ADAPTER$1 clientChannelState$Companion$ADAPTER$1 = ClientChannelState.ADAPTER;
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 5, uiCategoryNotificationPreference.sms_channel_state);
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 4, uiCategoryNotificationPreference.push_channel_state);
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 3, uiCategoryNotificationPreference.email_channel_state);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, uiCategoryNotificationPreference.account_token);
        NotificationCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiCategoryNotificationPreference.category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj;
        uiCategoryNotificationPreference.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, uiCategoryNotificationPreference.account_token) + NotificationCategory.ADAPTER.encodedSizeWithTag(1, uiCategoryNotificationPreference.category) + uiCategoryNotificationPreference.unknownFields().getSize$okio();
        ClientChannelState$Companion$ADAPTER$1 clientChannelState$Companion$ADAPTER$1 = ClientChannelState.ADAPTER;
        return NotificationCategoryExtraConfig.ADAPTER.encodedSizeWithTag(8, uiCategoryNotificationPreference.extra_config) + ProtoAdapter.INT64.encodedSizeWithTag(7, uiCategoryNotificationPreference.version) + CategoryRestriction.ADAPTER.asRepeated().encodedSizeWithTag(6, uiCategoryNotificationPreference.restrictions) + clientChannelState$Companion$ADAPTER$1.encodedSizeWithTag(5, uiCategoryNotificationPreference.sms_channel_state) + clientChannelState$Companion$ADAPTER$1.encodedSizeWithTag(4, uiCategoryNotificationPreference.push_channel_state) + clientChannelState$Companion$ADAPTER$1.encodedSizeWithTag(3, uiCategoryNotificationPreference.email_channel_state) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj;
        uiCategoryNotificationPreference.getClass();
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = uiCategoryNotificationPreference.extra_config;
        return UiCategoryNotificationPreference.copy$default(uiCategoryNotificationPreference, notificationCategoryExtraConfig != null ? (NotificationCategoryExtraConfig) NotificationCategoryExtraConfig.ADAPTER.redact(notificationCategoryExtraConfig) : null, ByteString.EMPTY, 127);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj;
        uiCategoryNotificationPreference.getClass();
        NotificationCategory.ADAPTER.encodeWithTag(protoWriter, 1, uiCategoryNotificationPreference.category);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, uiCategoryNotificationPreference.account_token);
        ClientChannelState$Companion$ADAPTER$1 clientChannelState$Companion$ADAPTER$1 = ClientChannelState.ADAPTER;
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(protoWriter, 3, uiCategoryNotificationPreference.email_channel_state);
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(protoWriter, 4, uiCategoryNotificationPreference.push_channel_state);
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(protoWriter, 5, uiCategoryNotificationPreference.sms_channel_state);
        CategoryRestriction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, uiCategoryNotificationPreference.restrictions);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, uiCategoryNotificationPreference.version);
        NotificationCategoryExtraConfig.ADAPTER.encodeWithTag(protoWriter, 8, uiCategoryNotificationPreference.extra_config);
        protoWriter.writeBytes(uiCategoryNotificationPreference.unknownFields());
    }
}
