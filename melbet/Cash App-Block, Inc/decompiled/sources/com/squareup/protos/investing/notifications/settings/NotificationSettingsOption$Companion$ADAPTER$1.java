package com.squareup.protos.investing.notifications.settings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NotificationSettingsOption$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new NotificationSettingsOption((String) obj, (Boolean) obj2, (NotificationsSettingsOptionsConfiguration) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(NotificationsSettingsOptionsConfiguration.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationSettingsOption notificationSettingsOption = (NotificationSettingsOption) obj;
        reverseProtoWriter.getClass();
        notificationSettingsOption.getClass();
        reverseProtoWriter.writeBytes(notificationSettingsOption.unknownFields());
        NotificationsSettingsOptionsConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 3, notificationSettingsOption.configuration);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, notificationSettingsOption.is_enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, notificationSettingsOption.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationSettingsOption notificationSettingsOption = (NotificationSettingsOption) obj;
        notificationSettingsOption.getClass();
        return NotificationsSettingsOptionsConfiguration.ADAPTER.encodedSizeWithTag(3, notificationSettingsOption.configuration) + ProtoAdapter.BOOL.encodedSizeWithTag(2, notificationSettingsOption.is_enabled) + ProtoAdapter.STRING.encodedSizeWithTag(1, notificationSettingsOption.id) + notificationSettingsOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationSettingsOption notificationSettingsOption = (NotificationSettingsOption) obj;
        notificationSettingsOption.getClass();
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration = notificationSettingsOption.configuration;
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration2 = notificationsSettingsOptionsConfiguration != null ? (NotificationsSettingsOptionsConfiguration) NotificationsSettingsOptionsConfiguration.ADAPTER.redact(notificationsSettingsOptionsConfiguration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = notificationSettingsOption.id;
        Boolean bool = notificationSettingsOption.is_enabled;
        byteString.getClass();
        return new NotificationSettingsOption(str, bool, notificationsSettingsOptionsConfiguration2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationSettingsOption notificationSettingsOption = (NotificationSettingsOption) obj;
        notificationSettingsOption.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, notificationSettingsOption.id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, notificationSettingsOption.is_enabled);
        NotificationsSettingsOptionsConfiguration.ADAPTER.encodeWithTag(protoWriter, 3, notificationSettingsOption.configuration);
        protoWriter.writeBytes(notificationSettingsOption.unknownFields());
    }
}
