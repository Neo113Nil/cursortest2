package com.squareup.protos.cash.notificationsettings.clientsync.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UiCategoryNotificationPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiCategoryNotificationPreference> CREATOR;
    public final String account_token;
    public final NotificationCategory category;
    public final ClientChannelState email_channel_state;
    public final NotificationCategoryExtraConfig extra_config;
    public final ClientChannelState push_channel_state;
    public final List restrictions;
    public final ClientChannelState sms_channel_state;
    public final Long version;

    static {
        UiCategoryNotificationPreference$Companion$ADAPTER$1 uiCategoryNotificationPreference$Companion$ADAPTER$1 = new UiCategoryNotificationPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiCategoryNotificationPreference.class), "type.googleapis.com/squareup.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/clientsync/v1/ui_notification_settings.proto");
        ADAPTER = uiCategoryNotificationPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiCategoryNotificationPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiCategoryNotificationPreference(NotificationCategory notificationCategory, String str, ClientChannelState clientChannelState, ClientChannelState clientChannelState2, ClientChannelState clientChannelState3, List list, Long l, NotificationCategoryExtraConfig notificationCategoryExtraConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.category = notificationCategory;
        this.account_token = str;
        this.email_channel_state = clientChannelState;
        this.push_channel_state = clientChannelState2;
        this.sms_channel_state = clientChannelState3;
        this.version = l;
        this.extra_config = notificationCategoryExtraConfig;
        this.restrictions = TransactorKt.immutableCopyOf("restrictions", list);
    }

    public static UiCategoryNotificationPreference copy$default(UiCategoryNotificationPreference uiCategoryNotificationPreference, NotificationCategoryExtraConfig notificationCategoryExtraConfig, ByteString byteString, int i) {
        ClientChannelState clientChannelState = ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_OFF_ENABLED;
        NotificationCategory notificationCategory = uiCategoryNotificationPreference.category;
        String str = uiCategoryNotificationPreference.account_token;
        ClientChannelState clientChannelState2 = uiCategoryNotificationPreference.email_channel_state;
        if ((i & 8) != 0) {
            clientChannelState = uiCategoryNotificationPreference.push_channel_state;
        }
        ClientChannelState clientChannelState3 = clientChannelState;
        ClientChannelState clientChannelState4 = uiCategoryNotificationPreference.sms_channel_state;
        List list = uiCategoryNotificationPreference.restrictions;
        Long l = uiCategoryNotificationPreference.version;
        if ((i & 128) != 0) {
            notificationCategoryExtraConfig = uiCategoryNotificationPreference.extra_config;
        }
        NotificationCategoryExtraConfig notificationCategoryExtraConfig2 = notificationCategoryExtraConfig;
        if ((i & 256) != 0) {
            byteString = uiCategoryNotificationPreference.unknownFields();
        }
        ByteString byteString2 = byteString;
        uiCategoryNotificationPreference.getClass();
        list.getClass();
        byteString2.getClass();
        return new UiCategoryNotificationPreference(notificationCategory, str, clientChannelState2, clientChannelState3, clientChannelState4, list, l, notificationCategoryExtraConfig2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiCategoryNotificationPreference)) {
            return false;
        }
        UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj;
        return Intrinsics.areEqual(unknownFields(), uiCategoryNotificationPreference.unknownFields()) && this.category == uiCategoryNotificationPreference.category && Intrinsics.areEqual(this.account_token, uiCategoryNotificationPreference.account_token) && this.email_channel_state == uiCategoryNotificationPreference.email_channel_state && this.push_channel_state == uiCategoryNotificationPreference.push_channel_state && this.sms_channel_state == uiCategoryNotificationPreference.sms_channel_state && Intrinsics.areEqual(this.restrictions, uiCategoryNotificationPreference.restrictions) && Intrinsics.areEqual(this.version, uiCategoryNotificationPreference.version) && Intrinsics.areEqual(this.extra_config, uiCategoryNotificationPreference.extra_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NotificationCategory notificationCategory = this.category;
        int hashCode2 = (hashCode + (notificationCategory != null ? notificationCategory.hashCode() : 0)) * 37;
        String str = this.account_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ClientChannelState clientChannelState = this.email_channel_state;
        int hashCode4 = (hashCode3 + (clientChannelState != null ? clientChannelState.hashCode() : 0)) * 37;
        ClientChannelState clientChannelState2 = this.push_channel_state;
        int hashCode5 = (hashCode4 + (clientChannelState2 != null ? clientChannelState2.hashCode() : 0)) * 37;
        ClientChannelState clientChannelState3 = this.sms_channel_state;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (clientChannelState3 != null ? clientChannelState3.hashCode() : 0)) * 37, 37, this.restrictions);
        Long l = this.version;
        int hashCode6 = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = this.extra_config;
        int hashCode7 = hashCode6 + (notificationCategoryExtraConfig != null ? notificationCategoryExtraConfig.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(9, false);
        builder.token = this.category;
        builder.category = this.account_token;
        builder.title = this.email_channel_state;
        builder.client_route = this.push_channel_state;
        builder.url = this.sms_channel_state;
        builder.owner_token = this.restrictions;
        builder.version_data = this.version;
        builder.localizable_title = this.extra_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NotificationCategory notificationCategory = this.category;
        if (notificationCategory != null) {
            arrayList.add("category=" + notificationCategory);
        }
        String str = this.account_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_token=", arrayList);
        }
        ClientChannelState clientChannelState = this.email_channel_state;
        if (clientChannelState != null) {
            arrayList.add("email_channel_state=" + clientChannelState);
        }
        ClientChannelState clientChannelState2 = this.push_channel_state;
        if (clientChannelState2 != null) {
            arrayList.add("push_channel_state=" + clientChannelState2);
        }
        ClientChannelState clientChannelState3 = this.sms_channel_state;
        if (clientChannelState3 != null) {
            arrayList.add("sms_channel_state=" + clientChannelState3);
        }
        List list = this.restrictions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("restrictions=", arrayList, list);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = this.extra_config;
        if (notificationCategoryExtraConfig != null) {
            arrayList.add("extra_config=" + notificationCategoryExtraConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiCategoryNotificationPreference{", "}", 0, null, null, 56);
    }
}
