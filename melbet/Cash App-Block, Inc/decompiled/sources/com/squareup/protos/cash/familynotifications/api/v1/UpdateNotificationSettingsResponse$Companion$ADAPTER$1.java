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
public final class UpdateNotificationSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateNotificationSettingsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        reverseProtoWriter.getClass();
        updateNotificationSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(updateNotificationSettingsResponse.unknownFields());
        NotificationSetting.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, updateNotificationSettingsResponse.settings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        updateNotificationSettingsResponse.getClass();
        return NotificationSetting.ADAPTER.asRepeated().encodedSizeWithTag(1, updateNotificationSettingsResponse.settings) + updateNotificationSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        updateNotificationSettingsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(updateNotificationSettingsResponse.settings, NotificationSetting.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateNotificationSettingsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        updateNotificationSettingsResponse.getClass();
        NotificationSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateNotificationSettingsResponse.settings);
        protoWriter.writeBytes(updateNotificationSettingsResponse.unknownFields());
    }
}
