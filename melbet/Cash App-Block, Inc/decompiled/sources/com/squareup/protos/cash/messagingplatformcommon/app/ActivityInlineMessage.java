package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.pools.PoolParticipant;
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
public final class ActivityInlineMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityInlineMessage> CREATOR;
    public final String asset_url;
    public final Boolean has_viewed;
    public final String headline;
    public final Boolean increment_activity_badge;
    public final String message_text;
    public final AppMessageAction primary_navigation_action;
    public final AppMessageAction secondary_navigation_action;

    static {
        ActivityInlineMessage$Companion$ADAPTER$1 activityInlineMessage$Companion$ADAPTER$1 = new ActivityInlineMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityInlineMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.ActivityInlineMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = activityInlineMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityInlineMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityInlineMessage(String str, String str2, String str3, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.headline = str;
        this.message_text = str2;
        this.asset_url = str3;
        this.primary_navigation_action = appMessageAction;
        this.secondary_navigation_action = appMessageAction2;
        this.increment_activity_badge = bool;
        this.has_viewed = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityInlineMessage)) {
            return false;
        }
        ActivityInlineMessage activityInlineMessage = (ActivityInlineMessage) obj;
        return Intrinsics.areEqual(unknownFields(), activityInlineMessage.unknownFields()) && Intrinsics.areEqual(this.headline, activityInlineMessage.headline) && Intrinsics.areEqual(this.message_text, activityInlineMessage.message_text) && Intrinsics.areEqual(this.asset_url, activityInlineMessage.asset_url) && Intrinsics.areEqual(this.primary_navigation_action, activityInlineMessage.primary_navigation_action) && Intrinsics.areEqual(this.secondary_navigation_action, activityInlineMessage.secondary_navigation_action) && Intrinsics.areEqual(this.increment_activity_badge, activityInlineMessage.increment_activity_badge) && Intrinsics.areEqual(this.has_viewed, activityInlineMessage.has_viewed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.headline;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.asset_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_navigation_action;
        int hashCode5 = (hashCode4 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        int hashCode6 = (hashCode5 + (appMessageAction2 != null ? appMessageAction2.hashCode() : 0)) * 37;
        Boolean bool = this.increment_activity_badge;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.has_viewed;
        int hashCode8 = hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(5);
        builder.customer_identifier = this.headline;
        builder.full_name = this.message_text;
        builder.profile_photo_url = this.asset_url;
        builder.cashtag = this.primary_navigation_action;
        builder.added_at = this.secondary_navigation_action;
        builder.participant_type = this.increment_activity_badge;
        builder.aggregated_contribution_amount = this.has_viewed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.headline;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "headline=", arrayList);
        }
        String str2 = this.message_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message_text=", arrayList);
        }
        String str3 = this.asset_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "asset_url=", arrayList);
        }
        AppMessageAction appMessageAction = this.primary_navigation_action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_navigation_action=", appMessageAction, arrayList);
        }
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        if (appMessageAction2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_navigation_action=", appMessageAction2, arrayList);
        }
        Boolean bool = this.increment_activity_badge;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("increment_activity_badge=", bool, arrayList);
        }
        Boolean bool2 = this.has_viewed;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_viewed=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityInlineMessage{", "}", 0, null, null, 56);
    }
}
