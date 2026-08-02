package com.squareup.protos.investing.notifications.settings;

import com.squareup.protos.investing.notifications.settings.NotificationsSettingsOptionsConfiguration;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NotificationsSettingsOptionsConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        NotificationsSettingsOptionsConfiguration$Value$Performance notificationsSettingsOptionsConfiguration$Value$Performance = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationsSettingsOptionsConfiguration((NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType) obj, notificationsSettingsOptionsConfiguration$Value$Performance, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                notificationsSettingsOptionsConfiguration$Value$Performance = new NotificationsSettingsOptionsConfiguration$Value$Performance((NotificationsSettingsPerformanceConfiguration) NotificationsSettingsPerformanceConfiguration.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration = (NotificationsSettingsOptionsConfiguration) obj;
        reverseProtoWriter.getClass();
        notificationsSettingsOptionsConfiguration.getClass();
        reverseProtoWriter.writeBytes(notificationsSettingsOptionsConfiguration.unknownFields());
        NotificationsSettingsOptionsConfiguration$Value$Performance notificationsSettingsOptionsConfiguration$Value$Performance = notificationsSettingsOptionsConfiguration.value;
        if (notificationsSettingsOptionsConfiguration$Value$Performance != null) {
            NotificationsSettingsPerformanceConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 2, notificationsSettingsOptionsConfiguration$Value$Performance.value);
        } else if (notificationsSettingsOptionsConfiguration$Value$Performance != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, notificationsSettingsOptionsConfiguration.f1402type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration = (NotificationsSettingsOptionsConfiguration) obj;
        notificationsSettingsOptionsConfiguration.getClass();
        int encodedSizeWithTag = NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType.ADAPTER.encodedSizeWithTag(1, notificationsSettingsOptionsConfiguration.f1402type) + notificationsSettingsOptionsConfiguration.unknownFields().getSize$okio();
        NotificationsSettingsOptionsConfiguration$Value$Performance notificationsSettingsOptionsConfiguration$Value$Performance = notificationsSettingsOptionsConfiguration.value;
        if (notificationsSettingsOptionsConfiguration$Value$Performance != null) {
            return NotificationsSettingsPerformanceConfiguration.ADAPTER.encodedSizeWithTag(2, notificationsSettingsOptionsConfiguration$Value$Performance.value) + encodedSizeWithTag;
        }
        if (notificationsSettingsOptionsConfiguration$Value$Performance == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration = (NotificationsSettingsOptionsConfiguration) obj;
        notificationsSettingsOptionsConfiguration.getClass();
        ByteString byteString = ByteString.EMPTY;
        NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType notificationsSettingsOptionsConfigurationType = notificationsSettingsOptionsConfiguration.f1402type;
        NotificationsSettingsOptionsConfiguration$Value$Performance notificationsSettingsOptionsConfiguration$Value$Performance = notificationsSettingsOptionsConfiguration.value;
        byteString.getClass();
        return new NotificationsSettingsOptionsConfiguration(notificationsSettingsOptionsConfigurationType, notificationsSettingsOptionsConfiguration$Value$Performance, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration = (NotificationsSettingsOptionsConfiguration) obj;
        notificationsSettingsOptionsConfiguration.getClass();
        NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType.ADAPTER.encodeWithTag(protoWriter, 1, notificationsSettingsOptionsConfiguration.f1402type);
        NotificationsSettingsOptionsConfiguration$Value$Performance notificationsSettingsOptionsConfiguration$Value$Performance = notificationsSettingsOptionsConfiguration.value;
        if (notificationsSettingsOptionsConfiguration$Value$Performance != null) {
            NotificationsSettingsPerformanceConfiguration.ADAPTER.encodeWithTag(protoWriter, 2, notificationsSettingsOptionsConfiguration$Value$Performance.value);
        } else if (notificationsSettingsOptionsConfiguration$Value$Performance != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(notificationsSettingsOptionsConfiguration.unknownFields());
    }
}
