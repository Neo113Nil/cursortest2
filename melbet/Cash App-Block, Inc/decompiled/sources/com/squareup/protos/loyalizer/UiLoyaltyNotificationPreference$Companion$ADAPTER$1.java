package com.squareup.protos.loyalizer;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiLoyaltyNotificationPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiLoyaltyNotificationPreference((String) obj, (Boolean) obj2, (LocalizableString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference = (UiLoyaltyNotificationPreference) obj;
        reverseProtoWriter.getClass();
        uiLoyaltyNotificationPreference.getClass();
        reverseProtoWriter.writeBytes(uiLoyaltyNotificationPreference.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, uiLoyaltyNotificationPreference.localizable_title);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, uiLoyaltyNotificationPreference.enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, uiLoyaltyNotificationPreference.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference = (UiLoyaltyNotificationPreference) obj;
        uiLoyaltyNotificationPreference.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(3, uiLoyaltyNotificationPreference.localizable_title) + ProtoAdapter.BOOL.encodedSizeWithTag(2, uiLoyaltyNotificationPreference.enabled) + ProtoAdapter.STRING.encodedSizeWithTag(1, uiLoyaltyNotificationPreference.title) + uiLoyaltyNotificationPreference.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference = (UiLoyaltyNotificationPreference) obj;
        uiLoyaltyNotificationPreference.getClass();
        LocalizableString localizableString = uiLoyaltyNotificationPreference.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = uiLoyaltyNotificationPreference.title;
        Boolean bool = uiLoyaltyNotificationPreference.enabled;
        byteString.getClass();
        return new UiLoyaltyNotificationPreference(str, bool, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference = (UiLoyaltyNotificationPreference) obj;
        uiLoyaltyNotificationPreference.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uiLoyaltyNotificationPreference.title);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uiLoyaltyNotificationPreference.enabled);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, uiLoyaltyNotificationPreference.localizable_title);
        protoWriter.writeBytes(uiLoyaltyNotificationPreference.unknownFields());
    }
}
