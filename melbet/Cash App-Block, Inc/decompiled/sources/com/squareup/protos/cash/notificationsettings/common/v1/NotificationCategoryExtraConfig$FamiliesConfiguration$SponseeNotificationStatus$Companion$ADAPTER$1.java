package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig$FamiliesConfiguration$SponseeNotificationStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus((String) obj, (NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus sponseeNotificationStatus = (NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus) obj;
        reverseProtoWriter.getClass();
        sponseeNotificationStatus.getClass();
        reverseProtoWriter.writeBytes(sponseeNotificationStatus.unknownFields());
        NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, sponseeNotificationStatus.notification_status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, sponseeNotificationStatus.account_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus sponseeNotificationStatus = (NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus) obj;
        sponseeNotificationStatus.getClass();
        return NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.ADAPTER.encodedSizeWithTag(2, sponseeNotificationStatus.notification_status) + ProtoAdapter.STRING.encodedSizeWithTag(1, sponseeNotificationStatus.account_token) + sponseeNotificationStatus.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus sponseeNotificationStatus = (NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus) obj;
        sponseeNotificationStatus.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = sponseeNotificationStatus.account_token;
        NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus notificationStatus = sponseeNotificationStatus.notification_status;
        byteString.getClass();
        return new NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus(str, notificationStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus sponseeNotificationStatus = (NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus) obj;
        sponseeNotificationStatus.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sponseeNotificationStatus.account_token);
        NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.ADAPTER.encodeWithTag(protoWriter, 2, sponseeNotificationStatus.notification_status);
        protoWriter.writeBytes(sponseeNotificationStatus.unknownFields());
    }
}
