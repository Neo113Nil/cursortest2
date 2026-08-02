package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.ui.Avatar;
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
public final class ClusterItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClusterItem> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final Avatar avatar;
    public final String boost_token;
    public final String business_token;
    public final EngagedItemToken engaged_token;
    public final LocalizedString l_subtitle;
    public final LocalizedString l_title;
    public final OfferBadge merchant_sale_badge;
    public final AnalyticsMetadata metadata;
    public final String offer_token;
    public final StyledText subtitle;
    public final TapAction tap_action;
    public final StyledText title;

    static {
        ClusterItem$Companion$ADAPTER$1 clusterItem$Companion$ADAPTER$1 = new ClusterItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClusterItem.class), "type.googleapis.com/squareup.cash.shop.rendering.api.ClusterItem", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/ClusterSection.proto");
        ADAPTER = clusterItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clusterItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusterItem(AnalyticsEvent analyticsEvent, TapAction tapAction, Avatar avatar, String str, String str2, EngagedItemToken engagedItemToken, LocalizedString localizedString, LocalizedString localizedString2, AnalyticsMetadata analyticsMetadata, String str3, StyledText styledText, StyledText styledText2, OfferBadge offerBadge, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.analytics_view_event = analyticsEvent;
        this.tap_action = tapAction;
        this.avatar = avatar;
        this.offer_token = str;
        this.boost_token = str2;
        this.engaged_token = engagedItemToken;
        this.l_title = localizedString;
        this.l_subtitle = localizedString2;
        this.metadata = analyticsMetadata;
        this.business_token = str3;
        this.title = styledText;
        this.subtitle = styledText2;
        this.merchant_sale_badge = offerBadge;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClusterItem)) {
            return false;
        }
        ClusterItem clusterItem = (ClusterItem) obj;
        return Intrinsics.areEqual(unknownFields(), clusterItem.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, clusterItem.analytics_view_event) && Intrinsics.areEqual(this.tap_action, clusterItem.tap_action) && Intrinsics.areEqual(this.avatar, clusterItem.avatar) && Intrinsics.areEqual(this.offer_token, clusterItem.offer_token) && Intrinsics.areEqual(this.boost_token, clusterItem.boost_token) && Intrinsics.areEqual(this.engaged_token, clusterItem.engaged_token) && Intrinsics.areEqual(this.l_title, clusterItem.l_title) && Intrinsics.areEqual(this.l_subtitle, clusterItem.l_subtitle) && Intrinsics.areEqual(this.metadata, clusterItem.metadata) && Intrinsics.areEqual(this.business_token, clusterItem.business_token) && Intrinsics.areEqual(this.title, clusterItem.title) && Intrinsics.areEqual(this.subtitle, clusterItem.subtitle) && Intrinsics.areEqual(this.merchant_sale_badge, clusterItem.merchant_sale_badge);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode3 = (hashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Avatar avatar = this.avatar;
        int hashCode4 = (hashCode3 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        String str = this.offer_token;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.boost_token;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        EngagedItemToken engagedItemToken = this.engaged_token;
        int hashCode7 = (hashCode6 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.l_title;
        int hashCode8 = (hashCode7 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.l_subtitle;
        int hashCode9 = (hashCode8 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        AnalyticsMetadata analyticsMetadata = this.metadata;
        int hashCode10 = (hashCode9 + (analyticsMetadata != null ? analyticsMetadata.hashCode() : 0)) * 37;
        String str3 = this.business_token;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37;
        StyledText styledText = this.title;
        int hashCode12 = (hashCode11 + (styledText != null ? styledText.hashCode() : 0)) * 37;
        StyledText styledText2 = this.subtitle;
        int hashCode13 = (hashCode12 + (styledText2 != null ? styledText2.hashCode() : 0)) * 37;
        OfferBadge offerBadge = this.merchant_sale_badge;
        int hashCode14 = hashCode13 + (offerBadge != null ? offerBadge.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder(6);
        builder.code_entry_enabled = this.analytics_view_event;
        builder.reward_screen_enabled = this.tap_action;
        builder.minimum_code_length = this.avatar;
        builder.code_entry_client_route = this.offer_token;
        builder.reward_button_text = this.boost_token;
        builder.reward_button_priority = this.engaged_token;
        builder.completed_reward_payments = this.l_title;
        builder.available_reward_payments = this.l_subtitle;
        builder.reward_main_text = this.metadata;
        builder.reward_header_text = this.business_token;
        builder.reward_payment_amount = this.title;
        builder.expiration = this.subtitle;
        builder.referral_status_screen = this.merchant_sale_badge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        String str = this.offer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "offer_token=", arrayList);
        }
        String str2 = this.boost_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "boost_token=", arrayList);
        }
        EngagedItemToken engagedItemToken = this.engaged_token;
        if (engagedItemToken != null) {
            arrayList.add("engaged_token=" + engagedItemToken);
        }
        LocalizedString localizedString = this.l_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.l_subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_subtitle=", localizedString2, arrayList);
        }
        AnalyticsMetadata analyticsMetadata = this.metadata;
        if (analyticsMetadata != null) {
            arrayList.add("metadata=" + analyticsMetadata);
        }
        String str3 = this.business_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "business_token=", arrayList);
        }
        StyledText styledText = this.title;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
        }
        StyledText styledText2 = this.subtitle;
        if (styledText2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", styledText2, arrayList);
        }
        OfferBadge offerBadge = this.merchant_sale_badge;
        if (offerBadge != null) {
            arrayList.add("merchant_sale_badge=" + offerBadge);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClusterItem{", "}", 0, null, null, 56);
    }
}
