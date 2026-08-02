package com.squareup.protos.cash.familynotifications.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NotificationSetting$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationSetting(notificationSetting$Setting$RealtimeNotificationSetting, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                notificationSetting$Setting$RealtimeNotificationSetting = new NotificationSetting$Setting$RealtimeNotificationSetting((RealtimeNotificationSetting) RealtimeNotificationSetting.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationSetting notificationSetting = (NotificationSetting) obj;
        reverseProtoWriter.getClass();
        notificationSetting.getClass();
        reverseProtoWriter.writeBytes(notificationSetting.unknownFields());
        NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting = notificationSetting.setting;
        if (notificationSetting$Setting$RealtimeNotificationSetting != null) {
            RealtimeNotificationSetting.ADAPTER.encodeWithTag(reverseProtoWriter, 1, notificationSetting$Setting$RealtimeNotificationSetting.value);
        } else {
            if (notificationSetting$Setting$RealtimeNotificationSetting == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationSetting notificationSetting = (NotificationSetting) obj;
        notificationSetting.getClass();
        int size$okio = notificationSetting.unknownFields().getSize$okio();
        NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting = notificationSetting.setting;
        if (notificationSetting$Setting$RealtimeNotificationSetting != null) {
            return RealtimeNotificationSetting.ADAPTER.encodedSizeWithTag(1, notificationSetting$Setting$RealtimeNotificationSetting.value) + size$okio;
        }
        if (notificationSetting$Setting$RealtimeNotificationSetting == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationSetting notificationSetting = (NotificationSetting) obj;
        notificationSetting.getClass();
        ByteString byteString = ByteString.EMPTY;
        NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting = notificationSetting.setting;
        byteString.getClass();
        return new NotificationSetting(notificationSetting$Setting$RealtimeNotificationSetting, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationSetting notificationSetting = (NotificationSetting) obj;
        notificationSetting.getClass();
        NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting = notificationSetting.setting;
        if (notificationSetting$Setting$RealtimeNotificationSetting != null) {
            RealtimeNotificationSetting.ADAPTER.encodeWithTag(protoWriter, 1, notificationSetting$Setting$RealtimeNotificationSetting.value);
        } else if (notificationSetting$Setting$RealtimeNotificationSetting != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(notificationSetting.unknownFields());
    }
}
