package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/OffersTabHomeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/lending/PrepurchaseCashCardAppletData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OffersTabHomeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersTabHomeResponse> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final List collections_preload;
    public final Long expire_at_ms;
    public final StyledText footer_markdown_text;
    public final String screen_subtitle;
    public final String screen_title;
    public final String search_bar_placeholder_text;
    public final List sections;
    public final List sheets_preload;

    static {
        OffersTabHomeResponse$Companion$ADAPTER$1 offersTabHomeResponse$Companion$ADAPTER$1 = new OffersTabHomeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OffersTabHomeResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OffersTabHomeResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersTabHome.proto");
        ADAPTER = offersTabHomeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offersTabHomeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersTabHomeResponse(String str, String str2, String str3, List list, StyledText styledText, Long l, List list2, List list3, AnalyticsEvent analyticsEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.screen_title = str;
        this.screen_subtitle = str2;
        this.search_bar_placeholder_text = str3;
        this.footer_markdown_text = styledText;
        this.expire_at_ms = l;
        this.analytics_view_event = analyticsEvent;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
        this.collections_preload = TransactorKt.immutableCopyOf("collections_preload", list2);
        this.sheets_preload = TransactorKt.immutableCopyOf("sheets_preload", list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    public static OffersTabHomeResponse copy$default(OffersTabHomeResponse offersTabHomeResponse, ArrayList arrayList, StyledText styledText, List list, List list2, AnalyticsEvent analyticsEvent, ByteString byteString, int i) {
        String str = offersTabHomeResponse.screen_title;
        String str2 = offersTabHomeResponse.screen_subtitle;
        String str3 = offersTabHomeResponse.search_bar_placeholder_text;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = offersTabHomeResponse.sections;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 16) != 0) {
            styledText = offersTabHomeResponse.footer_markdown_text;
        }
        StyledText styledText2 = styledText;
        Long l = offersTabHomeResponse.expire_at_ms;
        AnalyticsEvent analyticsEvent2 = (i & 256) != 0 ? offersTabHomeResponse.analytics_view_event : analyticsEvent;
        ByteString unknownFields = (i & 512) != 0 ? offersTabHomeResponse.unknownFields() : byteString;
        offersTabHomeResponse.getClass();
        arrayList3.getClass();
        list.getClass();
        list2.getClass();
        unknownFields.getClass();
        return new OffersTabHomeResponse(str, str2, str3, arrayList3, styledText2, l, list, list2, analyticsEvent2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersTabHomeResponse)) {
            return false;
        }
        OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), offersTabHomeResponse.unknownFields()) && Intrinsics.areEqual(this.screen_title, offersTabHomeResponse.screen_title) && Intrinsics.areEqual(this.screen_subtitle, offersTabHomeResponse.screen_subtitle) && Intrinsics.areEqual(this.search_bar_placeholder_text, offersTabHomeResponse.search_bar_placeholder_text) && Intrinsics.areEqual(this.sections, offersTabHomeResponse.sections) && Intrinsics.areEqual(this.footer_markdown_text, offersTabHomeResponse.footer_markdown_text) && Intrinsics.areEqual(this.expire_at_ms, offersTabHomeResponse.expire_at_ms) && Intrinsics.areEqual(this.collections_preload, offersTabHomeResponse.collections_preload) && Intrinsics.areEqual(this.sheets_preload, offersTabHomeResponse.sheets_preload) && Intrinsics.areEqual(this.analytics_view_event, offersTabHomeResponse.analytics_view_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.screen_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.screen_subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.search_bar_placeholder_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.sections);
        StyledText styledText = this.footer_markdown_text;
        int hashCode4 = (m + (styledText != null ? styledText.hashCode() : 0)) * 37;
        Long l = this.expire_at_ms;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.collections_preload), 37, this.sheets_preload);
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode5 = m2 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(10);
        builder.locale = this.screen_title;
        builder.title = this.screen_subtitle;
        builder.info_rows_header = this.search_bar_placeholder_text;
        builder.info_rows = this.sections;
        builder.footer_text = this.footer_markdown_text;
        builder.loadable_subtitle = this.expire_at_ms;
        builder.primary_footer_button_state = this.collections_preload;
        builder.secondary_footer_button_state = this.sheets_preload;
        builder.payment_plans_data = this.analytics_view_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.screen_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "screen_title=", arrayList);
        }
        String str2 = this.screen_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "screen_subtitle=", arrayList);
        }
        String str3 = this.search_bar_placeholder_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "search_bar_placeholder_text=", arrayList);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        StyledText styledText = this.footer_markdown_text;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("footer_markdown_text=", styledText, arrayList);
        }
        Long l = this.expire_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at_ms=", l, arrayList);
        }
        List list2 = this.collections_preload;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("collections_preload=", arrayList, list2);
        }
        List list3 = this.sheets_preload;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sheets_preload=", arrayList, list3);
        }
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersTabHomeResponse{", "}", 0, null, null, 56);
    }
}
