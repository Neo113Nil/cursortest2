package com.squareup.protos.investing.notifications.settings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NotificationsSettings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationsSettings(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(NotificationSettingsOption.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationsSettings notificationsSettings = (NotificationsSettings) obj;
        reverseProtoWriter.getClass();
        notificationsSettings.getClass();
        reverseProtoWriter.writeBytes(notificationsSettings.unknownFields());
        NotificationSettingsOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, notificationsSettings.options);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationsSettings notificationsSettings = (NotificationsSettings) obj;
        notificationsSettings.getClass();
        return NotificationSettingsOption.ADAPTER.asRepeated().encodedSizeWithTag(1, notificationsSettings.options) + notificationsSettings.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationsSettings notificationsSettings = (NotificationsSettings) obj;
        notificationsSettings.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(notificationsSettings.options, NotificationSettingsOption.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new NotificationsSettings(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationsSettings notificationsSettings = (NotificationsSettings) obj;
        notificationsSettings.getClass();
        NotificationSettingsOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, notificationsSettings.options);
        protoWriter.writeBytes(notificationsSettings.unknownFields());
    }
}
