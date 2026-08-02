package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.investing.notifications.settings.NotificationSettingsMessageConfig;
import com.squareup.protos.investing.notifications.settings.NotificationSettingsOption;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestDefaultNotificationSettings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestDefaultNotificationSettings(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(NotificationSettingsOption.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(NotificationSettingsMessageConfig.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestDefaultNotificationSettings investDefaultNotificationSettings = (InvestDefaultNotificationSettings) obj;
        reverseProtoWriter.getClass();
        investDefaultNotificationSettings.getClass();
        reverseProtoWriter.writeBytes(investDefaultNotificationSettings.unknownFields());
        NotificationSettingsMessageConfig.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, investDefaultNotificationSettings.message_settings);
        NotificationSettingsOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, investDefaultNotificationSettings.settings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestDefaultNotificationSettings investDefaultNotificationSettings = (InvestDefaultNotificationSettings) obj;
        investDefaultNotificationSettings.getClass();
        return NotificationSettingsMessageConfig.ADAPTER.asRepeated().encodedSizeWithTag(2, investDefaultNotificationSettings.message_settings) + NotificationSettingsOption.ADAPTER.asRepeated().encodedSizeWithTag(1, investDefaultNotificationSettings.settings) + investDefaultNotificationSettings.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestDefaultNotificationSettings investDefaultNotificationSettings = (InvestDefaultNotificationSettings) obj;
        investDefaultNotificationSettings.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(investDefaultNotificationSettings.settings, NotificationSettingsOption.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(investDefaultNotificationSettings.message_settings, NotificationSettingsMessageConfig.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InvestDefaultNotificationSettings(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestDefaultNotificationSettings investDefaultNotificationSettings = (InvestDefaultNotificationSettings) obj;
        investDefaultNotificationSettings.getClass();
        NotificationSettingsOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, investDefaultNotificationSettings.settings);
        NotificationSettingsMessageConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, investDefaultNotificationSettings.message_settings);
        protoWriter.writeBytes(investDefaultNotificationSettings.unknownFields());
    }
}
