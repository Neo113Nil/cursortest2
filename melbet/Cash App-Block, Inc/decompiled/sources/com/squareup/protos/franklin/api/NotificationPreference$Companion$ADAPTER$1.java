package com.squareup.protos.franklin.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.notifications.NotificationPreferenceUpdatedEvent$ClientExperienceVersion;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NotificationPreference$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new NotificationPreference((UiAlias) obj, (Boolean) obj2, (NotificationPreferenceUpdatedEvent$ClientExperienceVersion) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAlias.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = NotificationPreferenceUpdatedEvent$ClientExperienceVersion.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationPreference notificationPreference = (NotificationPreference) obj;
        reverseProtoWriter.getClass();
        notificationPreference.getClass();
        reverseProtoWriter.writeBytes(notificationPreference.unknownFields());
        NotificationPreferenceUpdatedEvent$ClientExperienceVersion.ADAPTER.encodeWithTag(reverseProtoWriter, 3, notificationPreference.client_experience_version);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, notificationPreference.enabled);
        UiAlias.ADAPTER.encodeWithTag(reverseProtoWriter, 1, notificationPreference.alias);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationPreference notificationPreference = (NotificationPreference) obj;
        notificationPreference.getClass();
        return NotificationPreferenceUpdatedEvent$ClientExperienceVersion.ADAPTER.encodedSizeWithTag(3, notificationPreference.client_experience_version) + ProtoAdapter.BOOL.encodedSizeWithTag(2, notificationPreference.enabled) + UiAlias.ADAPTER.encodedSizeWithTag(1, notificationPreference.alias) + notificationPreference.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationPreference notificationPreference = (NotificationPreference) obj;
        notificationPreference.getClass();
        UiAlias uiAlias = notificationPreference.alias;
        UiAlias uiAlias2 = uiAlias != null ? (UiAlias) UiAlias.ADAPTER.redact(uiAlias) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = notificationPreference.enabled;
        NotificationPreferenceUpdatedEvent$ClientExperienceVersion notificationPreferenceUpdatedEvent$ClientExperienceVersion = notificationPreference.client_experience_version;
        byteString.getClass();
        return new NotificationPreference(uiAlias2, bool, notificationPreferenceUpdatedEvent$ClientExperienceVersion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationPreference notificationPreference = (NotificationPreference) obj;
        notificationPreference.getClass();
        UiAlias.ADAPTER.encodeWithTag(protoWriter, 1, notificationPreference.alias);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, notificationPreference.enabled);
        NotificationPreferenceUpdatedEvent$ClientExperienceVersion.ADAPTER.encodeWithTag(protoWriter, 3, notificationPreference.client_experience_version);
        protoWriter.writeBytes(notificationPreference.unknownFields());
    }
}
