package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.common.time.DateTime;
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
public final class SearchSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchSection> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final zzld content;
    public final SectionHeader section_header;
    public final String section_id;
    public final Boolean show_footer_divider;

    static {
        SearchSection$Companion$ADAPTER$1 searchSection$Companion$ADAPTER$1 = new SearchSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.SearchSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Section.proto");
        ADAPTER = searchSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSection(AnalyticsEvent analyticsEvent, SectionHeader sectionHeader, String str, zzld zzldVar, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.analytics_view_event = analyticsEvent;
        this.section_header = sectionHeader;
        this.section_id = str;
        this.content = zzldVar;
        this.show_footer_divider = bool;
    }

    public static SearchSection copy$default(SearchSection searchSection, AnalyticsEvent analyticsEvent, SectionHeader sectionHeader, zzld zzldVar, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            analyticsEvent = searchSection.analytics_view_event;
        }
        AnalyticsEvent analyticsEvent2 = analyticsEvent;
        if ((i & 2) != 0) {
            sectionHeader = searchSection.section_header;
        }
        SectionHeader sectionHeader2 = sectionHeader;
        String str = searchSection.section_id;
        if ((i & 8) != 0) {
            zzldVar = searchSection.content;
        }
        zzld zzldVar2 = zzldVar;
        Boolean bool = searchSection.show_footer_divider;
        if ((i & 32) != 0) {
            byteString = searchSection.unknownFields();
        }
        ByteString byteString2 = byteString;
        searchSection.getClass();
        byteString2.getClass();
        return new SearchSection(analyticsEvent2, sectionHeader2, str, zzldVar2, bool, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchSection)) {
            return false;
        }
        SearchSection searchSection = (SearchSection) obj;
        return Intrinsics.areEqual(unknownFields(), searchSection.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, searchSection.analytics_view_event) && Intrinsics.areEqual(this.section_header, searchSection.section_header) && Intrinsics.areEqual(this.section_id, searchSection.section_id) && Intrinsics.areEqual(this.content, searchSection.content) && Intrinsics.areEqual(this.show_footer_divider, searchSection.show_footer_divider);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        SectionHeader sectionHeader = this.section_header;
        int hashCode3 = (hashCode2 + (sectionHeader != null ? sectionHeader.hashCode() : 0)) * 37;
        String str = this.section_id;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        zzld zzldVar = this.content;
        int hashCode5 = (hashCode4 + (zzldVar != null ? zzldVar.hashCode() : 0)) * 37;
        Boolean bool = this.show_footer_divider;
        int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(18, false);
        builder.instant_usec = this.analytics_view_event;
        builder.ordinal = this.section_header;
        builder.posix_tz = this.section_id;
        builder.timezone_offset_min = this.content;
        builder.tz_name = this.show_footer_divider;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        SectionHeader sectionHeader = this.section_header;
        if (sectionHeader != null) {
            arrayList.add("section_header=" + sectionHeader);
        }
        String str = this.section_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "section_id=", arrayList);
        }
        zzld zzldVar = this.content;
        if (zzldVar != null) {
            arrayList.add("content=" + zzldVar);
        }
        Boolean bool = this.show_footer_divider;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_footer_divider=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchSection{", "}", 0, null, null, 56);
    }
}
