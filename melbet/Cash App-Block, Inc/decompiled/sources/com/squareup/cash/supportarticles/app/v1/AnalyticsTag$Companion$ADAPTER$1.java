package com.squareup.cash.supportarticles.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AnalyticsTag$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AnalyticsTag((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AnalyticsTag analyticsTag = (AnalyticsTag) obj;
        reverseProtoWriter.getClass();
        analyticsTag.getClass();
        reverseProtoWriter.writeBytes(analyticsTag.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, analyticsTag.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, analyticsTag.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AnalyticsTag analyticsTag = (AnalyticsTag) obj;
        analyticsTag.getClass();
        int size$okio = analyticsTag.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, analyticsTag.value) + protoAdapter.encodedSizeWithTag(1, analyticsTag.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AnalyticsTag analyticsTag = (AnalyticsTag) obj;
        analyticsTag.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = analyticsTag.name;
        String str2 = analyticsTag.value;
        byteString.getClass();
        return new AnalyticsTag(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AnalyticsTag analyticsTag = (AnalyticsTag) obj;
        analyticsTag.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, analyticsTag.name);
        protoAdapter.encodeWithTag(protoWriter, 2, analyticsTag.value);
        protoWriter.writeBytes(analyticsTag.unknownFields());
    }
}
