package com.squareup.protos.cash.notificationsettings.api.v1;

import android.os.Parcelable;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CategoryPreferenceUpdate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CategoryPreferenceUpdate> CREATOR;
    public final String account_token;
    public final NotificationCategory category;
    public final Long current_version;
    public final ClientChannelState email_channel_state;
    public final NotificationCategoryExtraConfig extra_config;
    public final Boolean propagate_to_all_accounts;
    public final ClientChannelState push_channel_state;
    public final ClientChannelState sms_channel_state;

    static {
        CategoryPreferenceUpdate$Companion$ADAPTER$1 categoryPreferenceUpdate$Companion$ADAPTER$1 = new CategoryPreferenceUpdate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CategoryPreferenceUpdate.class), "type.googleapis.com/squareup.cash.notificationsettings.api.v1.CategoryPreferenceUpdate", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/api/v1/update_category_notification_settings.proto");
        ADAPTER = categoryPreferenceUpdate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(categoryPreferenceUpdate$Companion$ADAPTER$1);
    }

    public /* synthetic */ CategoryPreferenceUpdate(String str, NotificationCategory notificationCategory, ClientChannelState clientChannelState, ClientChannelState clientChannelState2, ClientChannelState clientChannelState3, Long l, NotificationCategoryExtraConfig notificationCategoryExtraConfig, Boolean bool, int i) {
        this(str, notificationCategory, (i & 4) != 0 ? null : clientChannelState, (i & 8) != 0 ? null : clientChannelState2, (i & 16) != 0 ? null : clientChannelState3, l, (i & 64) != 0 ? null : notificationCategoryExtraConfig, (i & 128) != 0 ? null : bool, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryPreferenceUpdate)) {
            return false;
        }
        CategoryPreferenceUpdate categoryPreferenceUpdate = (CategoryPreferenceUpdate) obj;
        return Intrinsics.areEqual(unknownFields(), categoryPreferenceUpdate.unknownFields()) && Intrinsics.areEqual(this.account_token, categoryPreferenceUpdate.account_token) && this.category == categoryPreferenceUpdate.category && this.email_channel_state == categoryPreferenceUpdate.email_channel_state && this.push_channel_state == categoryPreferenceUpdate.push_channel_state && this.sms_channel_state == categoryPreferenceUpdate.sms_channel_state && Intrinsics.areEqual(this.current_version, categoryPreferenceUpdate.current_version) && Intrinsics.areEqual(this.extra_config, categoryPreferenceUpdate.extra_config) && Intrinsics.areEqual(this.propagate_to_all_accounts, categoryPreferenceUpdate.propagate_to_all_accounts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.account_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        NotificationCategory notificationCategory = this.category;
        int hashCode3 = (hashCode2 + (notificationCategory != null ? notificationCategory.hashCode() : 0)) * 37;
        ClientChannelState clientChannelState = this.email_channel_state;
        int hashCode4 = (hashCode3 + (clientChannelState != null ? clientChannelState.hashCode() : 0)) * 37;
        ClientChannelState clientChannelState2 = this.push_channel_state;
        int hashCode5 = (hashCode4 + (clientChannelState2 != null ? clientChannelState2.hashCode() : 0)) * 37;
        ClientChannelState clientChannelState3 = this.sms_channel_state;
        int hashCode6 = (hashCode5 + (clientChannelState3 != null ? clientChannelState3.hashCode() : 0)) * 37;
        Long l = this.current_version;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = this.extra_config;
        int hashCode8 = (hashCode7 + (notificationCategoryExtraConfig != null ? notificationCategoryExtraConfig.hashCode() : 0)) * 37;
        Boolean bool = this.propagate_to_all_accounts;
        int hashCode9 = hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(8, false);
        builder.category = this.account_token;
        builder.token = this.category;
        builder.title = this.email_channel_state;
        builder.client_route = this.push_channel_state;
        builder.url = this.sms_channel_state;
        builder.owner_token = this.current_version;
        builder.version_data = this.extra_config;
        builder.localizable_title = this.propagate_to_all_accounts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.account_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_token=", arrayList);
        }
        NotificationCategory notificationCategory = this.category;
        if (notificationCategory != null) {
            arrayList.add("category=" + notificationCategory);
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
        Long l = this.current_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("current_version=", l, arrayList);
        }
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = this.extra_config;
        if (notificationCategoryExtraConfig != null) {
            arrayList.add("extra_config=" + notificationCategoryExtraConfig);
        }
        Boolean bool = this.propagate_to_all_accounts;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("propagate_to_all_accounts=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CategoryPreferenceUpdate{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryPreferenceUpdate(String str, NotificationCategory notificationCategory, ClientChannelState clientChannelState, ClientChannelState clientChannelState2, ClientChannelState clientChannelState3, Long l, NotificationCategoryExtraConfig notificationCategoryExtraConfig, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.account_token = str;
        this.category = notificationCategory;
        this.email_channel_state = clientChannelState;
        this.push_channel_state = clientChannelState2;
        this.sms_channel_state = clientChannelState3;
        this.current_version = l;
        this.extra_config = notificationCategoryExtraConfig;
        this.propagate_to_all_accounts = bool;
    }
}
