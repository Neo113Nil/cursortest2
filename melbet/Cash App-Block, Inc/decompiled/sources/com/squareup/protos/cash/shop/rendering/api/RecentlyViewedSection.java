package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.franklin.ui.Avatar;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes8.dex */
public final class RecentlyViewedSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecentlyViewedSection> CREATOR;
    public final List logos;

    public final class Logo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Logo> CREATOR;
        public final LocalizedString accessibility_text;
        public final AnalyticsEvent analytics_view_event;
        public final Avatar avatar;
        public final String boost_token;
        public final String business_token;
        public final EngagedItemToken engaged_token;
        public final LocalizedString l_subtitle;
        public final LocalizedString l_title;
        public final AnalyticsMetadata metadata;
        public final StyledText subtitle;
        public final TapAction tap_action;
        public final StyledText title;

        static {
            RecentlyViewedSection$Logo$Companion$ADAPTER$1 recentlyViewedSection$Logo$Companion$ADAPTER$1 = new RecentlyViewedSection$Logo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Logo.class), "type.googleapis.com/squareup.cash.shop.rendering.api.RecentlyViewedSection.Logo", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/RecentlyViewedSection.proto");
            ADAPTER = recentlyViewedSection$Logo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recentlyViewedSection$Logo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Logo(EngagedItemToken engagedItemToken, AnalyticsEvent analyticsEvent, TapAction tapAction, Avatar avatar, LocalizedString localizedString, LocalizedString localizedString2, String str, LocalizedString localizedString3, String str2, StyledText styledText, StyledText styledText2, AnalyticsMetadata analyticsMetadata, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.engaged_token = engagedItemToken;
            this.analytics_view_event = analyticsEvent;
            this.tap_action = tapAction;
            this.avatar = avatar;
            this.l_title = localizedString;
            this.l_subtitle = localizedString2;
            this.boost_token = str;
            this.accessibility_text = localizedString3;
            this.business_token = str2;
            this.title = styledText;
            this.subtitle = styledText2;
            this.metadata = analyticsMetadata;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) obj;
            return Intrinsics.areEqual(unknownFields(), logo.unknownFields()) && Intrinsics.areEqual(this.engaged_token, logo.engaged_token) && Intrinsics.areEqual(this.analytics_view_event, logo.analytics_view_event) && Intrinsics.areEqual(this.tap_action, logo.tap_action) && Intrinsics.areEqual(this.avatar, logo.avatar) && Intrinsics.areEqual(this.l_title, logo.l_title) && Intrinsics.areEqual(this.l_subtitle, logo.l_subtitle) && Intrinsics.areEqual(this.boost_token, logo.boost_token) && Intrinsics.areEqual(this.accessibility_text, logo.accessibility_text) && Intrinsics.areEqual(this.business_token, logo.business_token) && Intrinsics.areEqual(this.title, logo.title) && Intrinsics.areEqual(this.subtitle, logo.subtitle) && Intrinsics.areEqual(this.metadata, logo.metadata);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            EngagedItemToken engagedItemToken = this.engaged_token;
            int hashCode2 = (hashCode + (engagedItemToken != null ? engagedItemToken.hashCode() : 0)) * 37;
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            int hashCode3 = (hashCode2 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            TapAction tapAction = this.tap_action;
            int hashCode4 = (hashCode3 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int hashCode5 = (hashCode4 + (avatar != null ? avatar.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.l_title;
            int hashCode6 = (hashCode5 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.l_subtitle;
            int hashCode7 = (hashCode6 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            String str = this.boost_token;
            int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.accessibility_text;
            int hashCode9 = (hashCode8 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            String str2 = this.business_token;
            int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
            StyledText styledText = this.title;
            int hashCode11 = (hashCode10 + (styledText != null ? styledText.hashCode() : 0)) * 37;
            StyledText styledText2 = this.subtitle;
            int hashCode12 = (hashCode11 + (styledText2 != null ? styledText2.hashCode() : 0)) * 37;
            AnalyticsMetadata analyticsMetadata = this.metadata;
            int hashCode13 = hashCode12 + (analyticsMetadata != null ? analyticsMetadata.hashCode() : 0);
            this.hashCode = hashCode13;
            return hashCode13;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Expression.Builder builder = new Expression.Builder(18, false);
            builder.key_path_ref = this.engaged_token;
            builder.int_literal = this.analytics_view_event;
            builder.float_literal = this.tap_action;
            builder.bool_literal = this.avatar;
            builder.blob_literal = this.l_title;
            builder.unary_op = this.l_subtitle;
            builder.string_literal = this.boost_token;
            builder.binary_op = this.accessibility_text;
            builder.conditional_op = this.business_token;
            builder.filter_op = this.title;
            builder.collection_literal = this.subtitle;
            builder.format_string_op = this.metadata;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            EngagedItemToken engagedItemToken = this.engaged_token;
            if (engagedItemToken != null) {
                arrayList.add("engaged_token=" + engagedItemToken);
            }
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
            LocalizedString localizedString = this.l_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.l_subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_subtitle=", localizedString2, arrayList);
            }
            String str = this.boost_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "boost_token=", arrayList);
            }
            LocalizedString localizedString3 = this.accessibility_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString3, arrayList);
            }
            String str2 = this.business_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "business_token=", arrayList);
            }
            StyledText styledText = this.title;
            if (styledText != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
            }
            StyledText styledText2 = this.subtitle;
            if (styledText2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtitle=", styledText2, arrayList);
            }
            AnalyticsMetadata analyticsMetadata = this.metadata;
            if (analyticsMetadata != null) {
                arrayList.add("metadata=" + analyticsMetadata);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Logo{", "}", 0, null, null, 56);
        }
    }

    static {
        RecentlyViewedSection$Companion$ADAPTER$1 recentlyViewedSection$Companion$ADAPTER$1 = new RecentlyViewedSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecentlyViewedSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.RecentlyViewedSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/RecentlyViewedSection.proto");
        ADAPTER = recentlyViewedSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recentlyViewedSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentlyViewedSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.logos = TransactorKt.immutableCopyOf("logos", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecentlyViewedSection)) {
            return false;
        }
        RecentlyViewedSection recentlyViewedSection = (RecentlyViewedSection) obj;
        return Intrinsics.areEqual(unknownFields(), recentlyViewedSection.unknownFields()) && Intrinsics.areEqual(this.logos, recentlyViewedSection.logos);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.logos.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(28, false);
        builder.pools = this.logos;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.logos;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("logos=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecentlyViewedSection{", "}", 0, null, null, 56);
    }
}
