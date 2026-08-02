package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjn;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import com.squareup.protos.franklin.common.RewardStatus;
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
public final class AppMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppMessage> CREATOR;
    public final AppMessageFormat app_message_format;
    public final String campaign_token;
    public final Long created_at;
    public final String dismissal_event_name;
    public final Long expires_at;
    public final Boolean is_badged;
    public final String locale;
    public final zzjn message;
    public final String message_token;
    public final MessageType message_type;
    public final String metadata_id;
    public final String template_token;
    public final Long template_version;

    static {
        AppMessage$Companion$ADAPTER$1 appMessage$Companion$ADAPTER$1 = new AppMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.AppMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = appMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessage(String str, String str2, zzjn zzjnVar, AppMessageFormat appMessageFormat, Boolean bool, String str3, Long l, MessageType messageType, String str4, Long l2, String str5, String str6, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message_token = str;
        this.campaign_token = str2;
        this.message = zzjnVar;
        this.app_message_format = appMessageFormat;
        this.is_badged = bool;
        this.metadata_id = str3;
        this.created_at = l;
        this.message_type = messageType;
        this.dismissal_event_name = str4;
        this.expires_at = l2;
        this.locale = str5;
        this.template_token = str6;
        this.template_version = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppMessage)) {
            return false;
        }
        AppMessage appMessage = (AppMessage) obj;
        return Intrinsics.areEqual(unknownFields(), appMessage.unknownFields()) && Intrinsics.areEqual(this.message_token, appMessage.message_token) && Intrinsics.areEqual(this.campaign_token, appMessage.campaign_token) && Intrinsics.areEqual(this.message, appMessage.message) && Intrinsics.areEqual(this.app_message_format, appMessage.app_message_format) && Intrinsics.areEqual(this.is_badged, appMessage.is_badged) && Intrinsics.areEqual(this.metadata_id, appMessage.metadata_id) && Intrinsics.areEqual(this.created_at, appMessage.created_at) && this.message_type == appMessage.message_type && Intrinsics.areEqual(this.dismissal_event_name, appMessage.dismissal_event_name) && Intrinsics.areEqual(this.expires_at, appMessage.expires_at) && Intrinsics.areEqual(this.locale, appMessage.locale) && Intrinsics.areEqual(this.template_token, appMessage.template_token) && Intrinsics.areEqual(this.template_version, appMessage.template_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.campaign_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        zzjn zzjnVar = this.message;
        int hashCode4 = (hashCode3 + (zzjnVar != null ? zzjnVar.hashCode() : 0)) * 37;
        AppMessageFormat appMessageFormat = this.app_message_format;
        int hashCode5 = (hashCode4 + (appMessageFormat != null ? appMessageFormat.hashCode() : 0)) * 37;
        Boolean bool = this.is_badged;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.metadata_id;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        MessageType messageType = this.message_type;
        int hashCode9 = (hashCode8 + (messageType != null ? messageType.hashCode() : 0)) * 37;
        String str4 = this.dismissal_event_name;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l2 = this.expires_at;
        int hashCode11 = (hashCode10 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str5 = this.locale;
        int hashCode12 = (hashCode11 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.template_token;
        int hashCode13 = (hashCode12 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Long l3 = this.template_version;
        int hashCode14 = hashCode13 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder(5);
        builder.code_entry_client_route = this.message_token;
        builder.reward_button_text = this.campaign_token;
        builder.reward_screen_enabled = this.message;
        builder.minimum_code_length = this.app_message_format;
        builder.code_entry_enabled = this.is_badged;
        builder.reward_header_text = this.metadata_id;
        builder.reward_button_priority = this.created_at;
        builder.completed_reward_payments = this.message_type;
        builder.reward_main_text = this.dismissal_event_name;
        builder.available_reward_payments = this.expires_at;
        builder.reward_payment_amount = this.locale;
        builder.expiration = this.template_token;
        builder.referral_status_screen = this.template_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.message_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_token=", arrayList);
        }
        String str2 = this.campaign_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "campaign_token=", arrayList);
        }
        zzjn zzjnVar = this.message;
        if (zzjnVar != null) {
            arrayList.add("message=" + zzjnVar);
        }
        AppMessageFormat appMessageFormat = this.app_message_format;
        if (appMessageFormat != null) {
            arrayList.add("app_message_format=" + appMessageFormat);
        }
        Boolean bool = this.is_badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
        }
        String str3 = this.metadata_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "metadata_id=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        MessageType messageType = this.message_type;
        if (messageType != null) {
            arrayList.add("message_type=" + messageType);
        }
        String str4 = this.dismissal_event_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "dismissal_event_name=", arrayList);
        }
        Long l2 = this.expires_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l2, arrayList);
        }
        String str5 = this.locale;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "locale=", arrayList);
        }
        String str6 = this.template_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "template_token=", arrayList);
        }
        Long l3 = this.template_version;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("template_version=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppMessage{", "}", 0, null, null, 56);
    }
}
