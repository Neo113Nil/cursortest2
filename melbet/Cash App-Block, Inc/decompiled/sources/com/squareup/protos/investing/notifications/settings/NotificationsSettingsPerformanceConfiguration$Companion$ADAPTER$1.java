package com.squareup.protos.investing.notifications.settings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NotificationsSettingsPerformanceConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationsSettingsPerformanceConfiguration((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationsSettingsPerformanceConfiguration notificationsSettingsPerformanceConfiguration = (NotificationsSettingsPerformanceConfiguration) obj;
        reverseProtoWriter.getClass();
        notificationsSettingsPerformanceConfiguration.getClass();
        reverseProtoWriter.writeBytes(notificationsSettingsPerformanceConfiguration.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, notificationsSettingsPerformanceConfiguration.value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationsSettingsPerformanceConfiguration notificationsSettingsPerformanceConfiguration = (NotificationsSettingsPerformanceConfiguration) obj;
        notificationsSettingsPerformanceConfiguration.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, notificationsSettingsPerformanceConfiguration.value) + notificationsSettingsPerformanceConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationsSettingsPerformanceConfiguration notificationsSettingsPerformanceConfiguration = (NotificationsSettingsPerformanceConfiguration) obj;
        notificationsSettingsPerformanceConfiguration.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = notificationsSettingsPerformanceConfiguration.value;
        byteString.getClass();
        return new NotificationsSettingsPerformanceConfiguration(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationsSettingsPerformanceConfiguration notificationsSettingsPerformanceConfiguration = (NotificationsSettingsPerformanceConfiguration) obj;
        notificationsSettingsPerformanceConfiguration.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, notificationsSettingsPerformanceConfiguration.value);
        protoWriter.writeBytes(notificationsSettingsPerformanceConfiguration.unknownFields());
    }
}
