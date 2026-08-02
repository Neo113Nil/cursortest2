package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MapboxConfiguration$UsageOptions$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MapboxConfiguration.UsageOptions((MapboxConfiguration.UsageOptions.Context) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = MapboxConfiguration.UsageOptions.Context.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MapboxConfiguration.UsageOptions usageOptions = (MapboxConfiguration.UsageOptions) obj;
        reverseProtoWriter.getClass();
        usageOptions.getClass();
        reverseProtoWriter.writeBytes(usageOptions.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, usageOptions.style_uri_dark);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, usageOptions.style_uri_light);
        MapboxConfiguration.UsageOptions.Context.ADAPTER.encodeWithTag(reverseProtoWriter, 1, usageOptions.context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MapboxConfiguration.UsageOptions usageOptions = (MapboxConfiguration.UsageOptions) obj;
        usageOptions.getClass();
        int encodedSizeWithTag = MapboxConfiguration.UsageOptions.Context.ADAPTER.encodedSizeWithTag(1, usageOptions.context) + usageOptions.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, usageOptions.style_uri_dark) + protoAdapter.encodedSizeWithTag(2, usageOptions.style_uri_light) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MapboxConfiguration.UsageOptions usageOptions = (MapboxConfiguration.UsageOptions) obj;
        usageOptions.getClass();
        ByteString byteString = ByteString.EMPTY;
        MapboxConfiguration.UsageOptions.Context context = usageOptions.context;
        String str = usageOptions.style_uri_light;
        String str2 = usageOptions.style_uri_dark;
        byteString.getClass();
        return new MapboxConfiguration.UsageOptions(context, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MapboxConfiguration.UsageOptions usageOptions = (MapboxConfiguration.UsageOptions) obj;
        usageOptions.getClass();
        MapboxConfiguration.UsageOptions.Context.ADAPTER.encodeWithTag(protoWriter, 1, usageOptions.context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, usageOptions.style_uri_light);
        protoAdapter.encodeWithTag(protoWriter, 3, usageOptions.style_uri_dark);
        protoWriter.writeBytes(usageOptions.unknownFields());
    }
}
