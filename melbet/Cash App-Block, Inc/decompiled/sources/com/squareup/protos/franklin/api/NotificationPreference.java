package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.notifications.NotificationPreferenceUpdatedEvent$ClientExperienceVersion;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NotificationPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationPreference> CREATOR;
    public final UiAlias alias;
    public final NotificationPreferenceUpdatedEvent$ClientExperienceVersion client_experience_version;
    public final Boolean enabled;

    static {
        NotificationPreference$Companion$ADAPTER$1 notificationPreference$Companion$ADAPTER$1 = new NotificationPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationPreference.class), "type.googleapis.com/squareup.franklin.api.NotificationPreference", Syntax.PROTO_2, null, "squareup/franklin/NotificationPreferenceProto.proto");
        ADAPTER = notificationPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPreference(UiAlias uiAlias, Boolean bool, NotificationPreferenceUpdatedEvent$ClientExperienceVersion notificationPreferenceUpdatedEvent$ClientExperienceVersion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.alias = uiAlias;
        this.enabled = bool;
        this.client_experience_version = notificationPreferenceUpdatedEvent$ClientExperienceVersion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationPreference)) {
            return false;
        }
        NotificationPreference notificationPreference = (NotificationPreference) obj;
        return Intrinsics.areEqual(unknownFields(), notificationPreference.unknownFields()) && Intrinsics.areEqual(this.alias, notificationPreference.alias) && Intrinsics.areEqual(this.enabled, notificationPreference.enabled) && this.client_experience_version == notificationPreference.client_experience_version;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiAlias uiAlias = this.alias;
        int hashCode2 = (hashCode + (uiAlias != null ? uiAlias.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        NotificationPreferenceUpdatedEvent$ClientExperienceVersion notificationPreferenceUpdatedEvent$ClientExperienceVersion = this.client_experience_version;
        int hashCode4 = hashCode3 + (notificationPreferenceUpdatedEvent$ClientExperienceVersion != null ? notificationPreferenceUpdatedEvent$ClientExperienceVersion.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(11);
        builder.f1364type = this.alias;
        builder.canonical_text = this.enabled;
        builder.formatted = this.client_experience_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiAlias uiAlias = this.alias;
        if (uiAlias != null) {
            arrayList.add("alias=" + uiAlias);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        NotificationPreferenceUpdatedEvent$ClientExperienceVersion notificationPreferenceUpdatedEvent$ClientExperienceVersion = this.client_experience_version;
        if (notificationPreferenceUpdatedEvent$ClientExperienceVersion != null) {
            arrayList.add("client_experience_version=" + notificationPreferenceUpdatedEvent$ClientExperienceVersion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationPreference{", "}", 0, null, null, 56);
    }

    public /* synthetic */ NotificationPreference(UiAlias uiAlias, Boolean bool) {
        this(uiAlias, bool, NotificationPreferenceUpdatedEvent$ClientExperienceVersion.CLIENT_EXPERIENCE_VERSION_2024_CATEGORY_SETTINGS, ByteString.EMPTY);
    }
}
