package com.squareup.protos.cash.compass.api;

import com.squareup.protos.cash.compass.api.GpsDataContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GpsDataContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GpsDataContext((Long) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (GpsDataContext.Environment) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    try {
                        obj8 = GpsDataContext.Environment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GpsDataContext gpsDataContext = (GpsDataContext) obj;
        reverseProtoWriter.getClass();
        gpsDataContext.getClass();
        reverseProtoWriter.writeBytes(gpsDataContext.unknownFields());
        GpsDataContext.Environment.ADAPTER.encodeWithTag(reverseProtoWriter, 8, gpsDataContext.env);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, gpsDataContext.event_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, gpsDataContext.trigger);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, gpsDataContext.timezone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, gpsDataContext.app_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, gpsDataContext.device_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, gpsDataContext.idempotency_key);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, gpsDataContext.occurred_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GpsDataContext gpsDataContext = (GpsDataContext) obj;
        gpsDataContext.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, gpsDataContext.occurred_at) + gpsDataContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return GpsDataContext.Environment.ADAPTER.encodedSizeWithTag(8, gpsDataContext.env) + protoAdapter.encodedSizeWithTag(7, gpsDataContext.event_token) + protoAdapter.encodedSizeWithTag(6, gpsDataContext.trigger) + protoAdapter.encodedSizeWithTag(5, gpsDataContext.timezone) + protoAdapter.encodedSizeWithTag(4, gpsDataContext.app_token) + protoAdapter.encodedSizeWithTag(3, gpsDataContext.device_id) + protoAdapter.encodedSizeWithTag(2, gpsDataContext.idempotency_key) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GpsDataContext gpsDataContext = (GpsDataContext) obj;
        gpsDataContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = gpsDataContext.occurred_at;
        String str = gpsDataContext.idempotency_key;
        String str2 = gpsDataContext.device_id;
        String str3 = gpsDataContext.app_token;
        String str4 = gpsDataContext.timezone;
        String str5 = gpsDataContext.trigger;
        String str6 = gpsDataContext.event_token;
        GpsDataContext.Environment environment = gpsDataContext.env;
        byteString.getClass();
        return new GpsDataContext(l, str, str2, str3, str4, str5, str6, environment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GpsDataContext gpsDataContext = (GpsDataContext) obj;
        gpsDataContext.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, gpsDataContext.occurred_at);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, gpsDataContext.idempotency_key);
        protoAdapter.encodeWithTag(protoWriter, 3, gpsDataContext.device_id);
        protoAdapter.encodeWithTag(protoWriter, 4, gpsDataContext.app_token);
        protoAdapter.encodeWithTag(protoWriter, 5, gpsDataContext.timezone);
        protoAdapter.encodeWithTag(protoWriter, 6, gpsDataContext.trigger);
        protoAdapter.encodeWithTag(protoWriter, 7, gpsDataContext.event_token);
        GpsDataContext.Environment.ADAPTER.encodeWithTag(protoWriter, 8, gpsDataContext.env);
        protoWriter.writeBytes(gpsDataContext.unknownFields());
    }
}
