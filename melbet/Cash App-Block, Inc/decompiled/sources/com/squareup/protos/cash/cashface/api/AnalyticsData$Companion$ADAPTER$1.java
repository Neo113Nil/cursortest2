package com.squareup.protos.cash.cashface.api;

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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AnalyticsData((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AnalyticsData analyticsData = (AnalyticsData) obj;
        reverseProtoWriter.getClass();
        analyticsData.getClass();
        reverseProtoWriter.writeBytes(analyticsData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, analyticsData.profile_elements_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AnalyticsData analyticsData = (AnalyticsData) obj;
        analyticsData.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, analyticsData.profile_elements_data) + analyticsData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((AnalyticsData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AnalyticsData(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AnalyticsData analyticsData = (AnalyticsData) obj;
        analyticsData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, analyticsData.profile_elements_data);
        protoWriter.writeBytes(analyticsData.unknownFields());
    }
}
