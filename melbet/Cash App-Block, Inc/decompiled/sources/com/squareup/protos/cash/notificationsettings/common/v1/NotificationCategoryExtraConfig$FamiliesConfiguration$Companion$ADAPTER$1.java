package com.squareup.protos.cash.notificationsettings.common.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig$FamiliesConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationCategoryExtraConfig.FamiliesConfiguration(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationCategoryExtraConfig.FamiliesConfiguration familiesConfiguration = (NotificationCategoryExtraConfig.FamiliesConfiguration) obj;
        reverseProtoWriter.getClass();
        familiesConfiguration.getClass();
        reverseProtoWriter.writeBytes(familiesConfiguration.unknownFields());
        NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, familiesConfiguration.sponsored);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationCategoryExtraConfig.FamiliesConfiguration familiesConfiguration = (NotificationCategoryExtraConfig.FamiliesConfiguration) obj;
        familiesConfiguration.getClass();
        return NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus.ADAPTER.asRepeated().encodedSizeWithTag(1, familiesConfiguration.sponsored) + familiesConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationCategoryExtraConfig.FamiliesConfiguration familiesConfiguration = (NotificationCategoryExtraConfig.FamiliesConfiguration) obj;
        familiesConfiguration.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(familiesConfiguration.sponsored, NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new NotificationCategoryExtraConfig.FamiliesConfiguration(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationCategoryExtraConfig.FamiliesConfiguration familiesConfiguration = (NotificationCategoryExtraConfig.FamiliesConfiguration) obj;
        familiesConfiguration.getClass();
        NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, familiesConfiguration.sponsored);
        protoWriter.writeBytes(familiesConfiguration.unknownFields());
    }
}
