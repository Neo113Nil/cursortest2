package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
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
public final class MarketingMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketingMessage> CREATOR;
    public final LocalColor background_color;
    public final MarketingMessageBadge badge;
    public final String cashtag;
    public final MarketingMessageContent content;
    public final Long ends_at_ms;
    public final LocalColor foreground_color;
    public final LocalImage logo;
    public final Long starts_at_ms;
    public final String story_token;
    public final String subject_token;
    public final MarketingMessageSubjectType subject_type;

    /* renamed from: type, reason: collision with root package name */
    public final MarketingMessageType f1303type;
    public final Long viewed_at_ms;

    static {
        MarketingMessage$Companion$ADAPTER$1 marketingMessage$Companion$ADAPTER$1 = new MarketingMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketingMessage.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketingMessage", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = marketingMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketingMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingMessage(String str, MarketingMessageType marketingMessageType, MarketingMessageSubjectType marketingMessageSubjectType, String str2, MarketingMessageContent marketingMessageContent, Long l, Long l2, String str3, LocalColor localColor, LocalColor localColor2, LocalImage localImage, Long l3, MarketingMessageBadge marketingMessageBadge, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.story_token = str;
        this.f1303type = marketingMessageType;
        this.subject_type = marketingMessageSubjectType;
        this.subject_token = str2;
        this.content = marketingMessageContent;
        this.starts_at_ms = l;
        this.ends_at_ms = l2;
        this.cashtag = str3;
        this.foreground_color = localColor;
        this.background_color = localColor2;
        this.logo = localImage;
        this.viewed_at_ms = l3;
        this.badge = marketingMessageBadge;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketingMessage)) {
            return false;
        }
        MarketingMessage marketingMessage = (MarketingMessage) obj;
        return Intrinsics.areEqual(unknownFields(), marketingMessage.unknownFields()) && Intrinsics.areEqual(this.story_token, marketingMessage.story_token) && this.f1303type == marketingMessage.f1303type && this.subject_type == marketingMessage.subject_type && Intrinsics.areEqual(this.subject_token, marketingMessage.subject_token) && Intrinsics.areEqual(this.content, marketingMessage.content) && Intrinsics.areEqual(this.starts_at_ms, marketingMessage.starts_at_ms) && Intrinsics.areEqual(this.ends_at_ms, marketingMessage.ends_at_ms) && Intrinsics.areEqual(this.cashtag, marketingMessage.cashtag) && Intrinsics.areEqual(this.foreground_color, marketingMessage.foreground_color) && Intrinsics.areEqual(this.background_color, marketingMessage.background_color) && Intrinsics.areEqual(this.logo, marketingMessage.logo) && Intrinsics.areEqual(this.viewed_at_ms, marketingMessage.viewed_at_ms) && Intrinsics.areEqual(this.badge, marketingMessage.badge);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.story_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        MarketingMessageType marketingMessageType = this.f1303type;
        int hashCode3 = (hashCode2 + (marketingMessageType != null ? marketingMessageType.hashCode() : 0)) * 37;
        MarketingMessageSubjectType marketingMessageSubjectType = this.subject_type;
        int hashCode4 = (hashCode3 + (marketingMessageSubjectType != null ? marketingMessageSubjectType.hashCode() : 0)) * 37;
        String str2 = this.subject_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        MarketingMessageContent marketingMessageContent = this.content;
        int hashCode6 = (hashCode5 + (marketingMessageContent != null ? marketingMessageContent.hashCode() : 0)) * 37;
        Long l = this.starts_at_ms;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.ends_at_ms;
        int hashCode8 = (hashCode7 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str3 = this.cashtag;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalColor localColor = this.foreground_color;
        int hashCode10 = (hashCode9 + (localColor != null ? localColor.hashCode() : 0)) * 37;
        LocalColor localColor2 = this.background_color;
        int hashCode11 = (hashCode10 + (localColor2 != null ? localColor2.hashCode() : 0)) * 37;
        LocalImage localImage = this.logo;
        int hashCode12 = (hashCode11 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        Long l3 = this.viewed_at_ms;
        int hashCode13 = (hashCode12 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        MarketingMessageBadge marketingMessageBadge = this.badge;
        int hashCode14 = hashCode13 + (marketingMessageBadge != null ? marketingMessageBadge.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder(3);
        builder.code_entry_client_route = this.story_token;
        builder.code_entry_enabled = this.f1303type;
        builder.reward_screen_enabled = this.subject_type;
        builder.reward_button_text = this.subject_token;
        builder.minimum_code_length = this.content;
        builder.reward_button_priority = this.starts_at_ms;
        builder.completed_reward_payments = this.ends_at_ms;
        builder.reward_header_text = this.cashtag;
        builder.available_reward_payments = this.foreground_color;
        builder.reward_main_text = this.background_color;
        builder.reward_payment_amount = this.logo;
        builder.expiration = this.viewed_at_ms;
        builder.referral_status_screen = this.badge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.story_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "story_token=", arrayList);
        }
        MarketingMessageType marketingMessageType = this.f1303type;
        if (marketingMessageType != null) {
            arrayList.add("type=" + marketingMessageType);
        }
        MarketingMessageSubjectType marketingMessageSubjectType = this.subject_type;
        if (marketingMessageSubjectType != null) {
            arrayList.add("subject_type=" + marketingMessageSubjectType);
        }
        String str2 = this.subject_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subject_token=", arrayList);
        }
        MarketingMessageContent marketingMessageContent = this.content;
        if (marketingMessageContent != null) {
            arrayList.add("content=" + marketingMessageContent);
        }
        Long l = this.starts_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("starts_at_ms=", l, arrayList);
        }
        Long l2 = this.ends_at_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ends_at_ms=", l2, arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        LocalColor localColor = this.foreground_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("foreground_color=", localColor, arrayList);
        }
        LocalColor localColor2 = this.background_color;
        if (localColor2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor2, arrayList);
        }
        LocalImage localImage = this.logo;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("logo=", localImage, arrayList);
        }
        Long l3 = this.viewed_at_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("viewed_at_ms=", l3, arrayList);
        }
        MarketingMessageBadge marketingMessageBadge = this.badge;
        if (marketingMessageBadge != null) {
            arrayList.add("badge=" + marketingMessageBadge);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketingMessage{", "}", 0, null, null, 56);
    }
}
