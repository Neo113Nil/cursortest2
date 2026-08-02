package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MapboxConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MapboxConfiguration((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(MapboxConfiguration.UsageOptions.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MapboxConfiguration mapboxConfiguration = (MapboxConfiguration) obj;
        reverseProtoWriter.getClass();
        mapboxConfiguration.getClass();
        reverseProtoWriter.writeBytes(mapboxConfiguration.unknownFields());
        MapboxConfiguration.UsageOptions.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, mapboxConfiguration.usage_options);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, mapboxConfiguration.access_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MapboxConfiguration mapboxConfiguration = (MapboxConfiguration) obj;
        mapboxConfiguration.getClass();
        return MapboxConfiguration.UsageOptions.ADAPTER.asRepeated().encodedSizeWithTag(2, mapboxConfiguration.usage_options) + ProtoAdapter.STRING.encodedSizeWithTag(1, mapboxConfiguration.access_token) + mapboxConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MapboxConfiguration mapboxConfiguration = (MapboxConfiguration) obj;
        mapboxConfiguration.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(mapboxConfiguration.usage_options, MapboxConfiguration.UsageOptions.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MapboxConfiguration(null, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MapboxConfiguration mapboxConfiguration = (MapboxConfiguration) obj;
        mapboxConfiguration.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mapboxConfiguration.access_token);
        MapboxConfiguration.UsageOptions.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mapboxConfiguration.usage_options);
        protoWriter.writeBytes(mapboxConfiguration.unknownFields());
    }
}
