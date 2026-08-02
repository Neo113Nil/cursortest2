package com.squareup.protos.cash.notificationsettings.clientsync.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UiNotificationSettings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiNotificationSettings(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(UiCategoryNotificationPreference.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) obj;
        reverseProtoWriter.getClass();
        uiNotificationSettings.getClass();
        reverseProtoWriter.writeBytes(uiNotificationSettings.unknownFields());
        UiCategoryNotificationPreference.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, uiNotificationSettings.category_preferences);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) obj;
        uiNotificationSettings.getClass();
        return UiCategoryNotificationPreference.ADAPTER.asRepeated().encodedSizeWithTag(1, uiNotificationSettings.category_preferences) + uiNotificationSettings.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) obj;
        uiNotificationSettings.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(uiNotificationSettings.category_preferences, UiCategoryNotificationPreference.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiNotificationSettings(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) obj;
        uiNotificationSettings.getClass();
        UiCategoryNotificationPreference.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, uiNotificationSettings.category_preferences);
        protoWriter.writeBytes(uiNotificationSettings.unknownFields());
    }
}
