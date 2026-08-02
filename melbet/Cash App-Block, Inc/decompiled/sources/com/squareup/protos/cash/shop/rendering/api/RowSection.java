package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
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

/* loaded from: classes8.dex */
public final class RowSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RowSection> CREATOR;
    public final List rows;

    public final class FilterRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FilterRow> CREATOR;
        public final AnalyticsEvent analytics_view_event;
        public final Avatar avatar;
        public final LocalizedString l_subtitle;
        public final LocalizedString l_title;
        public final StyledText subtitle;
        public final FilterTapAction tap_action;
        public final StyledText title;
        public final UiAvatar ui_avatar;

        public final class FilterTapAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<FilterTapAction> CREATOR;
            public final AnalyticsEvent analytics_tap_event;
            public final List analytics_tap_events;
            public final String filter_token;

            static {
                RowSection$FilterRow$FilterTapAction$Companion$ADAPTER$1 rowSection$FilterRow$FilterTapAction$Companion$ADAPTER$1 = new RowSection$FilterRow$FilterTapAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FilterTapAction.class), "type.googleapis.com/squareup.cash.shop.rendering.api.RowSection.FilterRow.FilterTapAction", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/RowSection.proto");
                ADAPTER = rowSection$FilterRow$FilterTapAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$FilterRow$FilterTapAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FilterTapAction(String str, List list, AnalyticsEvent analyticsEvent, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.filter_token = str;
                this.analytics_tap_event = analyticsEvent;
                this.analytics_tap_events = TransactorKt.immutableCopyOf("analytics_tap_events", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FilterTapAction)) {
                    return false;
                }
                FilterTapAction filterTapAction = (FilterTapAction) obj;
                return Intrinsics.areEqual(unknownFields(), filterTapAction.unknownFields()) && Intrinsics.areEqual(this.filter_token, filterTapAction.filter_token) && Intrinsics.areEqual(this.analytics_tap_events, filterTapAction.analytics_tap_events) && Intrinsics.areEqual(this.analytics_tap_event, filterTapAction.analytics_tap_event);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.filter_token;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.analytics_tap_events);
                AnalyticsEvent analyticsEvent = this.analytics_tap_event;
                int hashCode2 = m + (analyticsEvent != null ? analyticsEvent.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CardScheme.Builder builder = new CardScheme.Builder(22);
                builder.overflow_modules = this.filter_token;
                builder.modules = this.analytics_tap_events;
                builder.card_home_actions = this.analytics_tap_event;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.filter_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "filter_token=", arrayList);
                }
                List list = this.analytics_tap_events;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("analytics_tap_events=", arrayList, list);
                }
                AnalyticsEvent analyticsEvent = this.analytics_tap_event;
                if (analyticsEvent != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("analytics_tap_event=", analyticsEvent, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "FilterTapAction{", "}", 0, null, null, 56);
            }
        }

        static {
            RowSection$FilterRow$Companion$ADAPTER$1 rowSection$FilterRow$Companion$ADAPTER$1 = new RowSection$FilterRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FilterRow.class), "type.googleapis.com/squareup.cash.shop.rendering.api.RowSection.FilterRow", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/RowSection.proto");
            ADAPTER = rowSection$FilterRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$FilterRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FilterRow(AnalyticsEvent analyticsEvent, FilterTapAction filterTapAction, UiAvatar uiAvatar, LocalizedString localizedString, LocalizedString localizedString2, StyledText styledText, StyledText styledText2, Avatar avatar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.analytics_view_event = analyticsEvent;
            this.tap_action = filterTapAction;
            this.ui_avatar = uiAvatar;
            this.l_title = localizedString;
            this.l_subtitle = localizedString2;
            this.title = styledText;
            this.subtitle = styledText2;
            this.avatar = avatar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FilterRow)) {
                return false;
            }
            FilterRow filterRow = (FilterRow) obj;
            return Intrinsics.areEqual(unknownFields(), filterRow.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, filterRow.analytics_view_event) && Intrinsics.areEqual(this.tap_action, filterRow.tap_action) && Intrinsics.areEqual(this.ui_avatar, filterRow.ui_avatar) && Intrinsics.areEqual(this.l_title, filterRow.l_title) && Intrinsics.areEqual(this.l_subtitle, filterRow.l_subtitle) && Intrinsics.areEqual(this.title, filterRow.title) && Intrinsics.areEqual(this.subtitle, filterRow.subtitle) && Intrinsics.areEqual(this.avatar, filterRow.avatar);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            FilterTapAction filterTapAction = this.tap_action;
            int hashCode3 = (hashCode2 + (filterTapAction != null ? filterTapAction.hashCode() : 0)) * 37;
            UiAvatar uiAvatar = this.ui_avatar;
            int hashCode4 = (hashCode3 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.l_title;
            int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.l_subtitle;
            int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            StyledText styledText = this.title;
            int hashCode7 = (hashCode6 + (styledText != null ? styledText.hashCode() : 0)) * 37;
            StyledText styledText2 = this.subtitle;
            int hashCode8 = (hashCode7 + (styledText2 != null ? styledText2.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int hashCode9 = hashCode8 + (avatar != null ? avatar.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DocumentEntity.Builder builder = new DocumentEntity.Builder(16, false);
            builder.category = this.analytics_view_event;
            builder.token = this.tap_action;
            builder.title = this.ui_avatar;
            builder.client_route = this.l_title;
            builder.url = this.l_subtitle;
            builder.owner_token = this.title;
            builder.version_data = this.subtitle;
            builder.localizable_title = this.avatar;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            if (analyticsEvent != null) {
                SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
            }
            FilterTapAction filterTapAction = this.tap_action;
            if (filterTapAction != null) {
                arrayList.add("tap_action=" + filterTapAction);
            }
            UiAvatar uiAvatar = this.ui_avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("ui_avatar=", uiAvatar, arrayList);
            }
            LocalizedString localizedString = this.l_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.l_subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_subtitle=", localizedString2, arrayList);
            }
            StyledText styledText = this.title;
            if (styledText != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
            }
            StyledText styledText2 = this.subtitle;
            if (styledText2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtitle=", styledText2, arrayList);
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FilterRow{", "}", 0, null, null, 56);
        }
    }

    public final class OfferRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OfferRow> CREATOR;
        public final AnalyticsEvent analytics_view_event;
        public final Avatar avatar;
        public final String boost_token;
        public final String business_token;
        public final Button button;
        public final EngagedItemToken engaged_token;
        public final LocalizedString l_subtitle;
        public final LocalizedString l_title;
        public final OfferBadge merchant_sale_badge;
        public final AnalyticsMetadata metadata;
        public final String offer_token;
        public final Button selected_button;
        public final StyledText subtitle;
        public final TapAction tap_action;
        public final StyledText title;

        static {
            RowSection$OfferRow$Companion$ADAPTER$1 rowSection$OfferRow$Companion$ADAPTER$1 = new RowSection$OfferRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferRow.class), "type.googleapis.com/squareup.cash.shop.rendering.api.RowSection.OfferRow", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/RowSection.proto");
            ADAPTER = rowSection$OfferRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$OfferRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferRow(AnalyticsEvent analyticsEvent, TapAction tapAction, Avatar avatar, LocalizedString localizedString, LocalizedString localizedString2, AnalyticsMetadata analyticsMetadata, EngagedItemToken engagedItemToken, String str, String str2, StyledText styledText, StyledText styledText2, Button button, String str3, Button button2, OfferBadge offerBadge, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.analytics_view_event = analyticsEvent;
            this.tap_action = tapAction;
            this.avatar = avatar;
            this.l_title = localizedString;
            this.l_subtitle = localizedString2;
            this.metadata = analyticsMetadata;
            this.engaged_token = engagedItemToken;
            this.offer_token = str;
            this.boost_token = str2;
            this.title = styledText;
            this.subtitle = styledText2;
            this.button = button;
            this.business_token = str3;
            this.selected_button = button2;
            this.merchant_sale_badge = offerBadge;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OfferRow)) {
                return false;
            }
            OfferRow offerRow = (OfferRow) obj;
            return Intrinsics.areEqual(unknownFields(), offerRow.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, offerRow.analytics_view_event) && Intrinsics.areEqual(this.tap_action, offerRow.tap_action) && Intrinsics.areEqual(this.avatar, offerRow.avatar) && Intrinsics.areEqual(this.l_title, offerRow.l_title) && Intrinsics.areEqual(this.l_subtitle, offerRow.l_subtitle) && Intrinsics.areEqual(this.metadata, offerRow.metadata) && Intrinsics.areEqual(this.engaged_token, offerRow.engaged_token) && Intrinsics.areEqual(this.offer_token, offerRow.offer_token) && Intrinsics.areEqual(this.boost_token, offerRow.boost_token) && Intrinsics.areEqual(this.title, offerRow.title) && Intrinsics.areEqual(this.subtitle, offerRow.subtitle) && Intrinsics.areEqual(this.button, offerRow.button) && Intrinsics.areEqual(this.business_token, offerRow.business_token) && Intrinsics.areEqual(this.selected_button, offerRow.selected_button) && Intrinsics.areEqual(this.merchant_sale_badge, offerRow.merchant_sale_badge);
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
            LocalizedString localizedString = this.l_title;
            int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.l_subtitle;
            int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            AnalyticsMetadata analyticsMetadata = this.metadata;
            int hashCode7 = (hashCode6 + (analyticsMetadata != null ? analyticsMetadata.hashCode() : 0)) * 37;
            EngagedItemToken engagedItemToken = this.engaged_token;
            int hashCode8 = (hashCode7 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0)) * 37;
            String str = this.offer_token;
            int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.boost_token;
            int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
            StyledText styledText = this.title;
            int hashCode11 = (hashCode10 + (styledText != null ? styledText.hashCode() : 0)) * 37;
            StyledText styledText2 = this.subtitle;
            int hashCode12 = (hashCode11 + (styledText2 != null ? styledText2.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode13 = (hashCode12 + (button != null ? button.hashCode() : 0)) * 37;
            String str3 = this.business_token;
            int hashCode14 = (hashCode13 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Button button2 = this.selected_button;
            int hashCode15 = (hashCode14 + (button2 != null ? button2.hashCode() : 0)) * 37;
            OfferBadge offerBadge = this.merchant_sale_badge;
            int hashCode16 = hashCode15 + (offerBadge != null ? offerBadge.hashCode() : 0);
            this.hashCode = hashCode16;
            return hashCode16;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClientInfo.Builder builder = new ClientInfo.Builder(6);
            builder.time_format = this.analytics_view_event;
            builder.ip_address = this.tap_action;
            builder.device_name = this.avatar;
            builder.accept_language = this.l_title;
            builder.device_installation_id = this.l_subtitle;
            builder.drm_id = this.metadata;
            builder.device_vendor_id = this.engaged_token;
            builder.user_agent = this.offer_token;
            builder.device_uuid = this.boost_token;
            builder.device_id = this.title;
            builder.threatmetrix_smart_id = this.subtitle;
            builder.timestamp = this.button;
            builder.date_format = this.business_token;
            builder.navigation_paradigm = this.selected_button;
            builder.client_scenario = this.merchant_sale_badge;
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
            EngagedItemToken engagedItemToken = this.engaged_token;
            if (engagedItemToken != null) {
                arrayList.add("engaged_token=" + engagedItemToken);
            }
            String str = this.offer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "offer_token=", arrayList);
            }
            String str2 = this.boost_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "boost_token=", arrayList);
            }
            StyledText styledText = this.title;
            if (styledText != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
            }
            StyledText styledText2 = this.subtitle;
            if (styledText2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtitle=", styledText2, arrayList);
            }
            Button button = this.button;
            if (button != null) {
                SizeMode$EnumUnboxingLocalUtility.m("button=", button, arrayList);
            }
            String str3 = this.business_token;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "business_token=", arrayList);
            }
            Button button2 = this.selected_button;
            if (button2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("selected_button=", button2, arrayList);
            }
            OfferBadge offerBadge = this.merchant_sale_badge;
            if (offerBadge != null) {
                arrayList.add("merchant_sale_badge=" + offerBadge);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OfferRow{", "}", 0, null, null, 56);
        }
    }

    public final class Row extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Row> CREATOR;

        /* renamed from: type, reason: collision with root package name */
        public final zzlc f1337type;

        static {
            RowSection$Row$Companion$ADAPTER$1 rowSection$Row$Companion$ADAPTER$1 = new RowSection$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.cash.shop.rendering.api.RowSection.Row", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/RowSection.proto");
            ADAPTER = rowSection$Row$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$Row$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Row(zzlc zzlcVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1337type = zzlcVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.f1337type, row.f1337type);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzlc zzlcVar = this.f1337type;
            int hashCode2 = hashCode + (zzlcVar != null ? zzlcVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(21);
            builder.pool_lifecycle_filter = this.f1337type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzlc zzlcVar = this.f1337type;
            if (zzlcVar != null) {
                arrayList.add("type=" + zzlcVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
        }
    }

    static {
        RowSection$Companion$ADAPTER$1 rowSection$Companion$ADAPTER$1 = new RowSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RowSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.RowSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/RowSection.proto");
        ADAPTER = rowSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowSection)) {
            return false;
        }
        RowSection rowSection = (RowSection) obj;
        return Intrinsics.areEqual(unknownFields(), rowSection.unknownFields()) && Intrinsics.areEqual(this.rows, rowSection.rows);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.rows.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(29, false);
        builder.pools = this.rows;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RowSection{", "}", 0, null, null, 56);
    }

    public RowSection(List list) {
        this(list, ByteString.EMPTY);
    }

    public final class AvatarRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarRow> CREATOR;
        public final AnalyticsEvent analytics_view_event;
        public final zzlb avatar;
        public final LocalizedString body_text;
        public final RowSection$AvatarRow$Cta$Btn cta;
        public final EngagedItemToken engaged_token;
        public final RowSection$AvatarRow$FeatureMetadata$OfferMetadata feature_metadata;
        public final LocalizedString label_text;
        public final TapAction tap_action;
        public final UiAvatar ui_avatar;

        static {
            RowSection$AvatarRow$Companion$ADAPTER$1 rowSection$AvatarRow$Companion$ADAPTER$1 = new RowSection$AvatarRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarRow.class), "type.googleapis.com/squareup.cash.shop.rendering.api.RowSection.AvatarRow", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/RowSection.proto");
            ADAPTER = rowSection$AvatarRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$AvatarRow$Companion$ADAPTER$1);
        }

        public /* synthetic */ AvatarRow(AnalyticsEvent analyticsEvent, LocalizedString localizedString, LocalizedString localizedString2, TapAction tapAction, EngagedItemToken engagedItemToken, int i) {
            this((i & 1) != 0 ? null : analyticsEvent, null, localizedString, localizedString2, (i & 16) != 0 ? null : tapAction, (i & 32) != 0 ? null : engagedItemToken, null, null, null, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarRow)) {
                return false;
            }
            AvatarRow avatarRow = (AvatarRow) obj;
            return Intrinsics.areEqual(unknownFields(), avatarRow.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, avatarRow.analytics_view_event) && Intrinsics.areEqual(this.ui_avatar, avatarRow.ui_avatar) && Intrinsics.areEqual(this.label_text, avatarRow.label_text) && Intrinsics.areEqual(this.body_text, avatarRow.body_text) && Intrinsics.areEqual(this.tap_action, avatarRow.tap_action) && Intrinsics.areEqual(this.engaged_token, avatarRow.engaged_token) && Intrinsics.areEqual(this.cta, avatarRow.cta) && Intrinsics.areEqual(this.feature_metadata, avatarRow.feature_metadata) && Intrinsics.areEqual(this.avatar, avatarRow.avatar);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            UiAvatar uiAvatar = this.ui_avatar;
            int hashCode3 = (hashCode2 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.label_text;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.body_text;
            int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            TapAction tapAction = this.tap_action;
            int hashCode6 = (hashCode5 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            EngagedItemToken engagedItemToken = this.engaged_token;
            int hashCode7 = (hashCode6 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0)) * 37;
            RowSection$AvatarRow$Cta$Btn rowSection$AvatarRow$Cta$Btn = this.cta;
            int hashCode8 = (hashCode7 + (rowSection$AvatarRow$Cta$Btn != null ? rowSection$AvatarRow$Cta$Btn.hashCode() : 0)) * 37;
            RowSection$AvatarRow$FeatureMetadata$OfferMetadata rowSection$AvatarRow$FeatureMetadata$OfferMetadata = this.feature_metadata;
            int hashCode9 = (hashCode8 + (rowSection$AvatarRow$FeatureMetadata$OfferMetadata != null ? rowSection$AvatarRow$FeatureMetadata$OfferMetadata.value.hashCode() : 0)) * 37;
            zzlb zzlbVar = this.avatar;
            int hashCode10 = hashCode9 + (zzlbVar != null ? zzlbVar.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Transfer.Builder builder = new Transfer.Builder(2, false);
            builder.token = this.analytics_view_event;
            builder.source = this.ui_avatar;
            builder.target = this.label_text;
            builder.state = this.body_text;
            builder.amount = this.tap_action;
            builder.push_amount = this.engaged_token;
            builder.created_at = this.cta;
            builder.completed_at = this.feature_metadata;
            builder.failed_at = this.avatar;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            if (analyticsEvent != null) {
                SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
            }
            UiAvatar uiAvatar = this.ui_avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("ui_avatar=", uiAvatar, arrayList);
            }
            LocalizedString localizedString = this.label_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("label_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.body_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body_text=", localizedString2, arrayList);
            }
            TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            EngagedItemToken engagedItemToken = this.engaged_token;
            if (engagedItemToken != null) {
                arrayList.add("engaged_token=" + engagedItemToken);
            }
            RowSection$AvatarRow$Cta$Btn rowSection$AvatarRow$Cta$Btn = this.cta;
            if (rowSection$AvatarRow$Cta$Btn != null) {
                arrayList.add("cta=" + rowSection$AvatarRow$Cta$Btn);
            }
            RowSection$AvatarRow$FeatureMetadata$OfferMetadata rowSection$AvatarRow$FeatureMetadata$OfferMetadata = this.feature_metadata;
            if (rowSection$AvatarRow$FeatureMetadata$OfferMetadata != null) {
                arrayList.add("feature_metadata=" + rowSection$AvatarRow$FeatureMetadata$OfferMetadata);
            }
            zzlb zzlbVar = this.avatar;
            if (zzlbVar != null) {
                arrayList.add("avatar=" + zzlbVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarRow{", "}", 0, null, null, 56);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarRow(AnalyticsEvent analyticsEvent, UiAvatar uiAvatar, LocalizedString localizedString, LocalizedString localizedString2, TapAction tapAction, EngagedItemToken engagedItemToken, RowSection$AvatarRow$Cta$Btn rowSection$AvatarRow$Cta$Btn, RowSection$AvatarRow$FeatureMetadata$OfferMetadata rowSection$AvatarRow$FeatureMetadata$OfferMetadata, zzlb zzlbVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.analytics_view_event = analyticsEvent;
            this.ui_avatar = uiAvatar;
            this.label_text = localizedString;
            this.body_text = localizedString2;
            this.tap_action = tapAction;
            this.engaged_token = engagedItemToken;
            this.cta = rowSection$AvatarRow$Cta$Btn;
            this.feature_metadata = rowSection$AvatarRow$FeatureMetadata$OfferMetadata;
            this.avatar = zzlbVar;
        }
    }
}
