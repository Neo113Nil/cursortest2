package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetGenericElementTreeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetGenericElementTreeResponse(m, (AnalyticsData) obj, (AnalyticsEvent) obj2, (AnalyticsEvent) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ContainerElement.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(AnalyticsData.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetGenericElementTreeResponse getGenericElementTreeResponse = (GetGenericElementTreeResponse) obj;
        reverseProtoWriter.getClass();
        getGenericElementTreeResponse.getClass();
        reverseProtoWriter.writeBytes(getGenericElementTreeResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, getGenericElementTreeResponse.toolbar_title);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getGenericElementTreeResponse.dismiss_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getGenericElementTreeResponse.view_event);
        AnalyticsData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getGenericElementTreeResponse.analytics_data);
        ContainerElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getGenericElementTreeResponse.elements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetGenericElementTreeResponse getGenericElementTreeResponse = (GetGenericElementTreeResponse) obj;
        getGenericElementTreeResponse.getClass();
        int encodedSizeWithTag = AnalyticsData.ADAPTER.encodedSizeWithTag(2, getGenericElementTreeResponse.analytics_data) + ContainerElement.ADAPTER.asRepeated().encodedSizeWithTag(1, getGenericElementTreeResponse.elements) + getGenericElementTreeResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(5, getGenericElementTreeResponse.toolbar_title) + protoAdapter.encodedSizeWithTag(4, getGenericElementTreeResponse.dismiss_event) + protoAdapter.encodedSizeWithTag(3, getGenericElementTreeResponse.view_event) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetGenericElementTreeResponse getGenericElementTreeResponse = (GetGenericElementTreeResponse) obj;
        getGenericElementTreeResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getGenericElementTreeResponse.elements, ContainerElement.ADAPTER);
        AnalyticsData analyticsData = getGenericElementTreeResponse.analytics_data;
        AnalyticsData analyticsData2 = analyticsData != null ? (AnalyticsData) AnalyticsData.ADAPTER.redact(analyticsData) : null;
        AnalyticsEvent analyticsEvent = getGenericElementTreeResponse.view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = getGenericElementTreeResponse.dismiss_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getGenericElementTreeResponse.toolbar_title;
        byteString.getClass();
        return new GetGenericElementTreeResponse(m1169redactElements, analyticsData2, analyticsEvent2, analyticsEvent4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetGenericElementTreeResponse getGenericElementTreeResponse = (GetGenericElementTreeResponse) obj;
        getGenericElementTreeResponse.getClass();
        ContainerElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getGenericElementTreeResponse.elements);
        AnalyticsData.ADAPTER.encodeWithTag(protoWriter, 2, getGenericElementTreeResponse.analytics_data);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, getGenericElementTreeResponse.view_event);
        protoAdapter.encodeWithTag(protoWriter, 4, getGenericElementTreeResponse.dismiss_event);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getGenericElementTreeResponse.toolbar_title);
        protoWriter.writeBytes(getGenericElementTreeResponse.unknownFields());
    }
}
