package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RowSection$FilterRow$FilterTapAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowSection.FilterRow.FilterTapAction((String) obj, m, (AnalyticsEvent) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(AnalyticsEvent.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.FilterRow.FilterTapAction filterTapAction = (RowSection.FilterRow.FilterTapAction) obj;
        reverseProtoWriter.getClass();
        filterTapAction.getClass();
        reverseProtoWriter.writeBytes(filterTapAction.unknownFields());
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, filterTapAction.analytics_tap_event);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, filterTapAction.analytics_tap_events);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, filterTapAction.filter_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection.FilterRow.FilterTapAction filterTapAction = (RowSection.FilterRow.FilterTapAction) obj;
        filterTapAction.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, filterTapAction.filter_token) + filterTapAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        return protoAdapter.encodedSizeWithTag(1, filterTapAction.analytics_tap_event) + protoAdapter.asRepeated().encodedSizeWithTag(3, filterTapAction.analytics_tap_events) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.FilterRow.FilterTapAction filterTapAction = (RowSection.FilterRow.FilterTapAction) obj;
        filterTapAction.getClass();
        List list = filterTapAction.analytics_tap_events;
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        AnalyticsEvent analyticsEvent = filterTapAction.analytics_tap_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) protoAdapter.redact(analyticsEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = filterTapAction.filter_token;
        byteString.getClass();
        return new RowSection.FilterRow.FilterTapAction(str, m1169redactElements, analyticsEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.FilterRow.FilterTapAction filterTapAction = (RowSection.FilterRow.FilterTapAction) obj;
        filterTapAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, filterTapAction.filter_token);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, filterTapAction.analytics_tap_events);
        protoAdapter.encodeWithTag(protoWriter, 1, filterTapAction.analytics_tap_event);
        protoWriter.writeBytes(filterTapAction.unknownFields());
    }
}
