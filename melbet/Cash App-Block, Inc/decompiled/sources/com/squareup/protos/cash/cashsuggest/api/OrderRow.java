package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
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
public final class OrderRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OrderRow> CREATOR;
    public final ActivityRow activity_row;
    public final AnalyticsEvent analytic_tap_event;
    public final AnalyticsEvent analytic_view_event;

    static {
        OrderRow$Companion$ADAPTER$1 orderRow$Companion$ADAPTER$1 = new OrderRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderRow.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OrderRow", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/OrderRow.proto");
        ADAPTER = orderRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(orderRow$Companion$ADAPTER$1);
    }

    public /* synthetic */ OrderRow(ActivityRow activityRow, AnalyticsEvent analyticsEvent, int i) {
        this((i & 1) != 0 ? null : activityRow, null, (i & 4) != 0 ? null : analyticsEvent, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderRow)) {
            return false;
        }
        OrderRow orderRow = (OrderRow) obj;
        return Intrinsics.areEqual(unknownFields(), orderRow.unknownFields()) && Intrinsics.areEqual(this.activity_row, orderRow.activity_row) && Intrinsics.areEqual(this.analytic_view_event, orderRow.analytic_view_event) && Intrinsics.areEqual(this.analytic_tap_event, orderRow.analytic_tap_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityRow activityRow = this.activity_row;
        int hashCode2 = (hashCode + (activityRow != null ? activityRow.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode3 = (hashCode2 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.analytic_tap_event;
        int hashCode4 = hashCode3 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(28);
        builder.title = this.activity_row;
        builder.subtitle = this.analytic_view_event;
        builder.action = this.analytic_tap_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityRow activityRow = this.activity_row;
        if (activityRow != null) {
            arrayList.add("activity_row=" + activityRow);
        }
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        AnalyticsEvent analyticsEvent2 = this.analytic_tap_event;
        if (analyticsEvent2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_tap_event=", analyticsEvent2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderRow{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderRow(ActivityRow activityRow, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_row = activityRow;
        this.analytic_view_event = analyticsEvent;
        this.analytic_tap_event = analyticsEvent2;
    }
}
