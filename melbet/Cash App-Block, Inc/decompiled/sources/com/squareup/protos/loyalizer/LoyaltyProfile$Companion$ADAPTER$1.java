package com.squareup.protos.loyalizer;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoyaltyProfile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyProfile((UiLoyaltyNotificationPreference) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiLoyaltyNotificationPreference.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyProfile loyaltyProfile = (LoyaltyProfile) obj;
        reverseProtoWriter.getClass();
        loyaltyProfile.getClass();
        reverseProtoWriter.writeBytes(loyaltyProfile.unknownFields());
        UiLoyaltyNotificationPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loyaltyProfile.notification_preference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyProfile loyaltyProfile = (LoyaltyProfile) obj;
        loyaltyProfile.getClass();
        return UiLoyaltyNotificationPreference.ADAPTER.encodedSizeWithTag(1, loyaltyProfile.notification_preference) + loyaltyProfile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyProfile loyaltyProfile = (LoyaltyProfile) obj;
        loyaltyProfile.getClass();
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference = loyaltyProfile.notification_preference;
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference2 = uiLoyaltyNotificationPreference != null ? (UiLoyaltyNotificationPreference) UiLoyaltyNotificationPreference.ADAPTER.redact(uiLoyaltyNotificationPreference) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LoyaltyProfile(uiLoyaltyNotificationPreference2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyProfile loyaltyProfile = (LoyaltyProfile) obj;
        loyaltyProfile.getClass();
        UiLoyaltyNotificationPreference.ADAPTER.encodeWithTag(protoWriter, 1, loyaltyProfile.notification_preference);
        protoWriter.writeBytes(loyaltyProfile.unknownFields());
    }
}
