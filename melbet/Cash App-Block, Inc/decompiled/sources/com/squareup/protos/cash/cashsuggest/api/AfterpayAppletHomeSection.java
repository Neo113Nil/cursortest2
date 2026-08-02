package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
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
public final class AfterpayAppletHomeSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletHomeSection> CREATOR;
    public final AnalyticsEvent analytic_view_event;
    public final SectionHeader header;
    public final LocalMenuHoursViewKt section;
    public final LocalMenuSelectorKt section_header;
    public final String section_id;
    public final Boolean show_divider;

    static {
        AfterpayAppletHomeSection$Companion$ADAPTER$1 afterpayAppletHomeSection$Companion$ADAPTER$1 = new AfterpayAppletHomeSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletHomeSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletHomeSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = afterpayAppletHomeSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletHomeSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletHomeSection(SectionHeader sectionHeader, LocalMenuSelectorKt localMenuSelectorKt, Boolean bool, LocalMenuHoursViewKt localMenuHoursViewKt, AnalyticsEvent analyticsEvent, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header = sectionHeader;
        this.section_header = localMenuSelectorKt;
        this.show_divider = bool;
        this.section = localMenuHoursViewKt;
        this.analytic_view_event = analyticsEvent;
        this.section_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletHomeSection)) {
            return false;
        }
        AfterpayAppletHomeSection afterpayAppletHomeSection = (AfterpayAppletHomeSection) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletHomeSection.unknownFields()) && Intrinsics.areEqual(this.header, afterpayAppletHomeSection.header) && Intrinsics.areEqual(this.section_header, afterpayAppletHomeSection.section_header) && Intrinsics.areEqual(this.show_divider, afterpayAppletHomeSection.show_divider) && Intrinsics.areEqual(this.section, afterpayAppletHomeSection.section) && Intrinsics.areEqual(this.analytic_view_event, afterpayAppletHomeSection.analytic_view_event) && Intrinsics.areEqual(this.section_id, afterpayAppletHomeSection.section_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SectionHeader sectionHeader = this.header;
        int hashCode2 = (hashCode + (sectionHeader != null ? sectionHeader.hashCode() : 0)) * 37;
        LocalMenuSelectorKt localMenuSelectorKt = this.section_header;
        int hashCode3 = (hashCode2 + (localMenuSelectorKt != null ? localMenuSelectorKt.hashCode() : 0)) * 37;
        Boolean bool = this.show_divider;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalMenuHoursViewKt localMenuHoursViewKt = this.section;
        int hashCode5 = (hashCode4 + (localMenuHoursViewKt != null ? localMenuHoursViewKt.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode6 = (hashCode5 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        String str = this.section_id;
        int hashCode7 = hashCode6 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(23, false);
        builder.category = this.header;
        builder.code = this.section_header;
        builder.retryable = this.show_divider;
        builder.field = this.section;
        builder.metadata = this.analytic_view_event;
        builder.description = this.section_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SectionHeader sectionHeader = this.header;
        if (sectionHeader != null) {
            arrayList.add("header=" + sectionHeader);
        }
        LocalMenuSelectorKt localMenuSelectorKt = this.section_header;
        if (localMenuSelectorKt != null) {
            arrayList.add("section_header=" + localMenuSelectorKt);
        }
        Boolean bool = this.show_divider;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_divider=", bool, arrayList);
        }
        LocalMenuHoursViewKt localMenuHoursViewKt = this.section;
        if (localMenuHoursViewKt != null) {
            arrayList.add("section=" + localMenuHoursViewKt);
        }
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        String str = this.section_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "section_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletHomeSection{", "}", 0, null, null, 56);
    }
}
