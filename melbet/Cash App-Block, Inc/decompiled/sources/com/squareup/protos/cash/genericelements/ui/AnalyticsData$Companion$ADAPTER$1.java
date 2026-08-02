package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AnalyticsData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AnalyticsData((AnalyticsEvent) obj, (AnalyticsEvent) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AnalyticsData analyticsData = (AnalyticsData) obj;
        reverseProtoWriter.getClass();
        analyticsData.getClass();
        reverseProtoWriter.writeBytes(analyticsData.unknownFields());
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, analyticsData.view);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, analyticsData.tap);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AnalyticsData analyticsData = (AnalyticsData) obj;
        analyticsData.getClass();
        int size$okio = analyticsData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, analyticsData.view) + protoAdapter.encodedSizeWithTag(1, analyticsData.tap) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AnalyticsData analyticsData = (AnalyticsData) obj;
        analyticsData.getClass();
        AnalyticsEvent analyticsEvent = analyticsData.tap;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = analyticsData.view;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AnalyticsData(analyticsEvent2, analyticsEvent4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AnalyticsData analyticsData = (AnalyticsData) obj;
        analyticsData.getClass();
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, analyticsData.tap);
        protoAdapter.encodeWithTag(protoWriter, 2, analyticsData.view);
        protoWriter.writeBytes(analyticsData.unknownFields());
    }
}
