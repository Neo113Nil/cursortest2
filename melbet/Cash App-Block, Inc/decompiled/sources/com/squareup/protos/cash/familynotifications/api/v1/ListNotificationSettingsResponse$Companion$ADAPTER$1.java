package com.squareup.protos.cash.familynotifications.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListNotificationSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListNotificationSettingsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(NotificationSetting.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListNotificationSettingsResponse listNotificationSettingsResponse = (ListNotificationSettingsResponse) obj;
        reverseProtoWriter.getClass();
        listNotificationSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(listNotificationSettingsResponse.unknownFields());
        NotificationSetting.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listNotificationSettingsResponse.settings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListNotificationSettingsResponse listNotificationSettingsResponse = (ListNotificationSettingsResponse) obj;
        listNotificationSettingsResponse.getClass();
        return NotificationSetting.ADAPTER.asRepeated().encodedSizeWithTag(1, listNotificationSettingsResponse.settings) + listNotificationSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListNotificationSettingsResponse listNotificationSettingsResponse = (ListNotificationSettingsResponse) obj;
        listNotificationSettingsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listNotificationSettingsResponse.settings, NotificationSetting.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ListNotificationSettingsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListNotificationSettingsResponse listNotificationSettingsResponse = (ListNotificationSettingsResponse) obj;
        listNotificationSettingsResponse.getClass();
        NotificationSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listNotificationSettingsResponse.settings);
        protoWriter.writeBytes(listNotificationSettingsResponse.unknownFields());
    }
}
