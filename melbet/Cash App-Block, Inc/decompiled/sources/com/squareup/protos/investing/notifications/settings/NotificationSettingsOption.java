package com.squareup.protos.investing.notifications.settings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.giftly.GiftCard;
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
public final class NotificationSettingsOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationSettingsOption> CREATOR;
    public final NotificationsSettingsOptionsConfiguration configuration;
    public final String id;
    public final Boolean is_enabled;

    static {
        NotificationSettingsOption$Companion$ADAPTER$1 notificationSettingsOption$Companion$ADAPTER$1 = new NotificationSettingsOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationSettingsOption.class), "type.googleapis.com/squareup.investnotifications.settings.NotificationSettingsOption", Syntax.PROTO_2, null, "squareup/investing/notifications/settings.proto");
        ADAPTER = notificationSettingsOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationSettingsOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsOption(String str, Boolean bool, NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.is_enabled = bool;
        this.configuration = notificationsSettingsOptionsConfiguration;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationSettingsOption)) {
            return false;
        }
        NotificationSettingsOption notificationSettingsOption = (NotificationSettingsOption) obj;
        return Intrinsics.areEqual(unknownFields(), notificationSettingsOption.unknownFields()) && Intrinsics.areEqual(this.id, notificationSettingsOption.id) && Intrinsics.areEqual(this.is_enabled, notificationSettingsOption.is_enabled) && Intrinsics.areEqual(this.configuration, notificationSettingsOption.configuration);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.is_enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration = this.configuration;
        int hashCode4 = hashCode3 + (notificationsSettingsOptionsConfiguration != null ? notificationsSettingsOptionsConfiguration.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(11);
        builder.label = this.id;
        builder.localizable_label = this.is_enabled;
        builder.client_scenario = this.configuration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        Boolean bool = this.is_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_enabled=", bool, arrayList);
        }
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration = this.configuration;
        if (notificationsSettingsOptionsConfiguration != null) {
            arrayList.add("configuration=" + notificationsSettingsOptionsConfiguration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationSettingsOption{", "}", 0, null, null, 56);
    }
}
