package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AnalyticsEvent$ClientGeneratedParam$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AnalyticsEvent.ClientGeneratedParam((String) obj, (AnalyticsEvent.ParamType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = AnalyticsEvent.ParamType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AnalyticsEvent.ClientGeneratedParam clientGeneratedParam = (AnalyticsEvent.ClientGeneratedParam) obj;
        reverseProtoWriter.getClass();
        clientGeneratedParam.getClass();
        reverseProtoWriter.writeBytes(clientGeneratedParam.unknownFields());
        AnalyticsEvent.ParamType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, clientGeneratedParam.f1336type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, clientGeneratedParam.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AnalyticsEvent.ClientGeneratedParam clientGeneratedParam = (AnalyticsEvent.ClientGeneratedParam) obj;
        clientGeneratedParam.getClass();
        return AnalyticsEvent.ParamType.ADAPTER.encodedSizeWithTag(2, clientGeneratedParam.f1336type) + ProtoAdapter.STRING.encodedSizeWithTag(1, clientGeneratedParam.name) + clientGeneratedParam.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AnalyticsEvent.ClientGeneratedParam clientGeneratedParam = (AnalyticsEvent.ClientGeneratedParam) obj;
        clientGeneratedParam.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientGeneratedParam.name;
        AnalyticsEvent.ParamType paramType = clientGeneratedParam.f1336type;
        byteString.getClass();
        return new AnalyticsEvent.ClientGeneratedParam(str, paramType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AnalyticsEvent.ClientGeneratedParam clientGeneratedParam = (AnalyticsEvent.ClientGeneratedParam) obj;
        clientGeneratedParam.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clientGeneratedParam.name);
        AnalyticsEvent.ParamType.ADAPTER.encodeWithTag(protoWriter, 2, clientGeneratedParam.f1336type);
        protoWriter.writeBytes(clientGeneratedParam.unknownFields());
    }
}
