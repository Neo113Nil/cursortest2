package com.squareup.protos.cash.notificationsettings.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState$Companion$ADAPTER$1;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CategoryPreferenceUpdate$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CategoryPreferenceUpdate((String) obj, (NotificationCategory) obj2, (ClientChannelState) obj3, (ClientChannelState) obj4, (ClientChannelState) obj5, (Long) obj6, (NotificationCategoryExtraConfig) obj7, (Boolean) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = NotificationCategory.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
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
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(NotificationCategoryExtraConfig.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CategoryPreferenceUpdate categoryPreferenceUpdate = (CategoryPreferenceUpdate) obj;
        reverseProtoWriter.getClass();
        categoryPreferenceUpdate.getClass();
        reverseProtoWriter.writeBytes(categoryPreferenceUpdate.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, categoryPreferenceUpdate.propagate_to_all_accounts);
        NotificationCategoryExtraConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 7, categoryPreferenceUpdate.extra_config);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, categoryPreferenceUpdate.current_version);
        ClientChannelState$Companion$ADAPTER$1 clientChannelState$Companion$ADAPTER$1 = ClientChannelState.ADAPTER;
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 5, categoryPreferenceUpdate.sms_channel_state);
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 4, categoryPreferenceUpdate.push_channel_state);
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 3, categoryPreferenceUpdate.email_channel_state);
        NotificationCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 2, categoryPreferenceUpdate.category);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, categoryPreferenceUpdate.account_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CategoryPreferenceUpdate categoryPreferenceUpdate = (CategoryPreferenceUpdate) obj;
        categoryPreferenceUpdate.getClass();
        int encodedSizeWithTag = NotificationCategory.ADAPTER.encodedSizeWithTag(2, categoryPreferenceUpdate.category) + ProtoAdapter.STRING.encodedSizeWithTag(1, categoryPreferenceUpdate.account_token) + categoryPreferenceUpdate.unknownFields().getSize$okio();
        ClientChannelState$Companion$ADAPTER$1 clientChannelState$Companion$ADAPTER$1 = ClientChannelState.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(8, categoryPreferenceUpdate.propagate_to_all_accounts) + NotificationCategoryExtraConfig.ADAPTER.encodedSizeWithTag(7, categoryPreferenceUpdate.extra_config) + ProtoAdapter.INT64.encodedSizeWithTag(6, categoryPreferenceUpdate.current_version) + clientChannelState$Companion$ADAPTER$1.encodedSizeWithTag(5, categoryPreferenceUpdate.sms_channel_state) + clientChannelState$Companion$ADAPTER$1.encodedSizeWithTag(4, categoryPreferenceUpdate.push_channel_state) + clientChannelState$Companion$ADAPTER$1.encodedSizeWithTag(3, categoryPreferenceUpdate.email_channel_state) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CategoryPreferenceUpdate categoryPreferenceUpdate = (CategoryPreferenceUpdate) obj;
        categoryPreferenceUpdate.getClass();
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = categoryPreferenceUpdate.extra_config;
        NotificationCategoryExtraConfig notificationCategoryExtraConfig2 = notificationCategoryExtraConfig != null ? (NotificationCategoryExtraConfig) NotificationCategoryExtraConfig.ADAPTER.redact(notificationCategoryExtraConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = categoryPreferenceUpdate.account_token;
        NotificationCategory notificationCategory = categoryPreferenceUpdate.category;
        ClientChannelState clientChannelState = categoryPreferenceUpdate.email_channel_state;
        ClientChannelState clientChannelState2 = categoryPreferenceUpdate.push_channel_state;
        ClientChannelState clientChannelState3 = categoryPreferenceUpdate.sms_channel_state;
        Long l = categoryPreferenceUpdate.current_version;
        Boolean bool = categoryPreferenceUpdate.propagate_to_all_accounts;
        byteString.getClass();
        return new CategoryPreferenceUpdate(str, notificationCategory, clientChannelState, clientChannelState2, clientChannelState3, l, notificationCategoryExtraConfig2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CategoryPreferenceUpdate categoryPreferenceUpdate = (CategoryPreferenceUpdate) obj;
        categoryPreferenceUpdate.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, categoryPreferenceUpdate.account_token);
        NotificationCategory.ADAPTER.encodeWithTag(protoWriter, 2, categoryPreferenceUpdate.category);
        ClientChannelState$Companion$ADAPTER$1 clientChannelState$Companion$ADAPTER$1 = ClientChannelState.ADAPTER;
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(protoWriter, 3, categoryPreferenceUpdate.email_channel_state);
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(protoWriter, 4, categoryPreferenceUpdate.push_channel_state);
        clientChannelState$Companion$ADAPTER$1.encodeWithTag(protoWriter, 5, categoryPreferenceUpdate.sms_channel_state);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, categoryPreferenceUpdate.current_version);
        NotificationCategoryExtraConfig.ADAPTER.encodeWithTag(protoWriter, 7, categoryPreferenceUpdate.extra_config);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, categoryPreferenceUpdate.propagate_to_all_accounts);
        protoWriter.writeBytes(categoryPreferenceUpdate.unknownFields());
    }
}
