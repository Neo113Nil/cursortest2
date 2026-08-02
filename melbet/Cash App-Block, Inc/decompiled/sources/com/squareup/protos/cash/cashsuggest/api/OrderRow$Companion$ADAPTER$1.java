package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OrderRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OrderRow((ActivityRow) obj, (AnalyticsEvent) obj2, (AnalyticsEvent) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ActivityRow.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OrderRow orderRow = (OrderRow) obj;
        reverseProtoWriter.getClass();
        orderRow.getClass();
        reverseProtoWriter.writeBytes(orderRow.unknownFields());
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, orderRow.analytic_tap_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, orderRow.analytic_view_event);
        ActivityRow.ADAPTER.encodeWithTag(reverseProtoWriter, 1, orderRow.activity_row);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OrderRow orderRow = (OrderRow) obj;
        orderRow.getClass();
        int encodedSizeWithTag = ActivityRow.ADAPTER.encodedSizeWithTag(1, orderRow.activity_row) + orderRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, orderRow.analytic_tap_event) + protoAdapter.encodedSizeWithTag(2, orderRow.analytic_view_event) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OrderRow orderRow = (OrderRow) obj;
        orderRow.getClass();
        ActivityRow activityRow = orderRow.activity_row;
        ActivityRow activityRow2 = activityRow != null ? (ActivityRow) ActivityRow.ADAPTER.redact(activityRow) : null;
        AnalyticsEvent analyticsEvent = orderRow.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = orderRow.analytic_tap_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OrderRow(activityRow2, analyticsEvent2, analyticsEvent4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OrderRow orderRow = (OrderRow) obj;
        orderRow.getClass();
        ActivityRow.ADAPTER.encodeWithTag(protoWriter, 1, orderRow.activity_row);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, orderRow.analytic_view_event);
        protoAdapter.encodeWithTag(protoWriter, 3, orderRow.analytic_tap_event);
        protoWriter.writeBytes(orderRow.unknownFields());
    }
}
