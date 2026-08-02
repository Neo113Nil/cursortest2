package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/OffersTabSearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/lending/PrepurchaseCashCardAppletData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OffersTabSearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersTabSearchResponse> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final AnalyticsEvent analytics_view_query_event;
    public final Long expire_at_ms;
    public final FilterGroupSection filter_group_sections;
    public final List invalid_recently_viewed_engaged_tokens;
    public final List invalid_recently_viewed_tokens;
    public final String pagination_token;
    public final List sections;
    public final List sheets_preload;

    static {
        OffersTabSearchResponse$Companion$ADAPTER$1 offersTabSearchResponse$Companion$ADAPTER$1 = new OffersTabSearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OffersTabSearchResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OffersTabSearchResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersTabSearch.proto");
        ADAPTER = offersTabSearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offersTabSearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersTabSearchResponse(List list, String str, FilterGroupSection filterGroupSection, List list2, Long l, AnalyticsEvent analyticsEvent, List list3, List list4, AnalyticsEvent analyticsEvent2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.pagination_token = str;
        this.filter_group_sections = filterGroupSection;
        this.expire_at_ms = l;
        this.analytics_view_event = analyticsEvent;
        this.analytics_view_query_event = analyticsEvent2;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
        this.sheets_preload = TransactorKt.immutableCopyOf("sheets_preload", list2);
        this.invalid_recently_viewed_engaged_tokens = TransactorKt.immutableCopyOf("invalid_recently_viewed_engaged_tokens", list3);
        this.invalid_recently_viewed_tokens = TransactorKt.immutableCopyOf("invalid_recently_viewed_tokens", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersTabSearchResponse)) {
            return false;
        }
        OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), offersTabSearchResponse.unknownFields()) && Intrinsics.areEqual(this.sections, offersTabSearchResponse.sections) && Intrinsics.areEqual(this.pagination_token, offersTabSearchResponse.pagination_token) && Intrinsics.areEqual(this.filter_group_sections, offersTabSearchResponse.filter_group_sections) && Intrinsics.areEqual(this.sheets_preload, offersTabSearchResponse.sheets_preload) && Intrinsics.areEqual(this.expire_at_ms, offersTabSearchResponse.expire_at_ms) && Intrinsics.areEqual(this.analytics_view_event, offersTabSearchResponse.analytics_view_event) && Intrinsics.areEqual(this.invalid_recently_viewed_engaged_tokens, offersTabSearchResponse.invalid_recently_viewed_engaged_tokens) && Intrinsics.areEqual(this.invalid_recently_viewed_tokens, offersTabSearchResponse.invalid_recently_viewed_tokens) && Intrinsics.areEqual(this.analytics_view_query_event, offersTabSearchResponse.analytics_view_query_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.sections);
        String str = this.pagination_token;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        FilterGroupSection filterGroupSection = this.filter_group_sections;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode + (filterGroupSection != null ? filterGroupSection.hashCode() : 0)) * 37, 37, this.sheets_preload);
        Long l = this.expire_at_ms;
        int hashCode2 = (m2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37, 37, this.invalid_recently_viewed_engaged_tokens), 37, this.invalid_recently_viewed_tokens);
        AnalyticsEvent analyticsEvent2 = this.analytics_view_query_event;
        int hashCode3 = m3 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(11);
        builder.info_rows = this.sections;
        builder.locale = this.pagination_token;
        builder.title = this.filter_group_sections;
        builder.info_rows_header = this.sheets_preload;
        builder.footer_text = this.expire_at_ms;
        builder.loadable_subtitle = this.analytics_view_event;
        builder.primary_footer_button_state = this.invalid_recently_viewed_engaged_tokens;
        builder.secondary_footer_button_state = this.invalid_recently_viewed_tokens;
        builder.payment_plans_data = this.analytics_view_query_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        String str = this.pagination_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pagination_token=", arrayList);
        }
        FilterGroupSection filterGroupSection = this.filter_group_sections;
        if (filterGroupSection != null) {
            arrayList.add("filter_group_sections=" + filterGroupSection);
        }
        List list2 = this.sheets_preload;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sheets_preload=", arrayList, list2);
        }
        Long l = this.expire_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at_ms=", l, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        List list3 = this.invalid_recently_viewed_engaged_tokens;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("invalid_recently_viewed_engaged_tokens=", arrayList, list3);
        }
        List list4 = this.invalid_recently_viewed_tokens;
        if (!list4.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("invalid_recently_viewed_tokens=", arrayList, list4);
        }
        AnalyticsEvent analyticsEvent2 = this.analytics_view_query_event;
        if (analyticsEvent2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_query_event=", analyticsEvent2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersTabSearchResponse{", "}", 0, null, null, 56);
    }
}
