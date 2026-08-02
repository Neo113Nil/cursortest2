package com.squareup.protos.investing.notifications.settings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class NotificationSettingsMessageConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationSettingsMessageConfig> CREATOR;
    public final String notification_channel_id;
    public final String settings_option_id;

    static {
        NotificationSettingsMessageConfig$Companion$ADAPTER$1 notificationSettingsMessageConfig$Companion$ADAPTER$1 = new NotificationSettingsMessageConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationSettingsMessageConfig.class), "type.googleapis.com/squareup.investnotifications.settings.NotificationSettingsMessageConfig", Syntax.PROTO_2, null, "squareup/investing/notifications/settings.proto");
        ADAPTER = notificationSettingsMessageConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationSettingsMessageConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsMessageConfig(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.settings_option_id = str;
        this.notification_channel_id = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationSettingsMessageConfig)) {
            return false;
        }
        NotificationSettingsMessageConfig notificationSettingsMessageConfig = (NotificationSettingsMessageConfig) obj;
        return Intrinsics.areEqual(unknownFields(), notificationSettingsMessageConfig.unknownFields()) && Intrinsics.areEqual(this.settings_option_id, notificationSettingsMessageConfig.settings_option_id) && Intrinsics.areEqual(this.notification_channel_id, notificationSettingsMessageConfig.notification_channel_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.settings_option_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.notification_channel_id;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(14);
        builder.server = this.settings_option_id;
        builder.local = this.notification_channel_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.settings_option_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "settings_option_id=", arrayList);
        }
        String str2 = this.notification_channel_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "notification_channel_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationSettingsMessageConfig{", "}", 0, null, null, 56);
    }
}
