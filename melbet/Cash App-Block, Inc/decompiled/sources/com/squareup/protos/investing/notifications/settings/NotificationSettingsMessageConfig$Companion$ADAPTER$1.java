package com.squareup.protos.investing.notifications.settings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NotificationSettingsMessageConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationSettingsMessageConfig((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationSettingsMessageConfig notificationSettingsMessageConfig = (NotificationSettingsMessageConfig) obj;
        reverseProtoWriter.getClass();
        notificationSettingsMessageConfig.getClass();
        reverseProtoWriter.writeBytes(notificationSettingsMessageConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, notificationSettingsMessageConfig.notification_channel_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, notificationSettingsMessageConfig.settings_option_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationSettingsMessageConfig notificationSettingsMessageConfig = (NotificationSettingsMessageConfig) obj;
        notificationSettingsMessageConfig.getClass();
        int size$okio = notificationSettingsMessageConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, notificationSettingsMessageConfig.notification_channel_id) + protoAdapter.encodedSizeWithTag(1, notificationSettingsMessageConfig.settings_option_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationSettingsMessageConfig notificationSettingsMessageConfig = (NotificationSettingsMessageConfig) obj;
        notificationSettingsMessageConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = notificationSettingsMessageConfig.settings_option_id;
        String str2 = notificationSettingsMessageConfig.notification_channel_id;
        byteString.getClass();
        return new NotificationSettingsMessageConfig(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationSettingsMessageConfig notificationSettingsMessageConfig = (NotificationSettingsMessageConfig) obj;
        notificationSettingsMessageConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, notificationSettingsMessageConfig.settings_option_id);
        protoAdapter.encodeWithTag(protoWriter, 2, notificationSettingsMessageConfig.notification_channel_id);
        protoWriter.writeBytes(notificationSettingsMessageConfig.unknownFields());
    }
}
