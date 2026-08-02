package com.squareup.protos.franklin.common;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class DeviceLocationHeuristics$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeviceLocationHeuristics((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
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
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeviceLocationHeuristics deviceLocationHeuristics = (DeviceLocationHeuristics) obj;
        reverseProtoWriter.getClass();
        deviceLocationHeuristics.getClass();
        reverseProtoWriter.writeBytes(deviceLocationHeuristics.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 6, deviceLocationHeuristics.installed_keyboards);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, deviceLocationHeuristics.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, deviceLocationHeuristics.carrier_country_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, deviceLocationHeuristics.carrier_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, deviceLocationHeuristics.country_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, deviceLocationHeuristics.language);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeviceLocationHeuristics deviceLocationHeuristics = (DeviceLocationHeuristics) obj;
        deviceLocationHeuristics.getClass();
        int size$okio = deviceLocationHeuristics.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(6, deviceLocationHeuristics.installed_keyboards) + protoAdapter.encodedSizeWithTag(5, deviceLocationHeuristics.time_zone) + protoAdapter.encodedSizeWithTag(4, deviceLocationHeuristics.carrier_country_code) + protoAdapter.encodedSizeWithTag(3, deviceLocationHeuristics.carrier_name) + protoAdapter.encodedSizeWithTag(2, deviceLocationHeuristics.country_code) + protoAdapter.encodedSizeWithTag(1, deviceLocationHeuristics.language) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeviceLocationHeuristics deviceLocationHeuristics = (DeviceLocationHeuristics) obj;
        deviceLocationHeuristics.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = deviceLocationHeuristics.language;
        String str2 = deviceLocationHeuristics.country_code;
        String str3 = deviceLocationHeuristics.carrier_name;
        String str4 = deviceLocationHeuristics.carrier_country_code;
        String str5 = deviceLocationHeuristics.time_zone;
        List list = deviceLocationHeuristics.installed_keyboards;
        list.getClass();
        byteString.getClass();
        return new DeviceLocationHeuristics(str, str2, str3, str4, str5, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeviceLocationHeuristics deviceLocationHeuristics = (DeviceLocationHeuristics) obj;
        deviceLocationHeuristics.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, deviceLocationHeuristics.language);
        protoAdapter.encodeWithTag(protoWriter, 2, deviceLocationHeuristics.country_code);
        protoAdapter.encodeWithTag(protoWriter, 3, deviceLocationHeuristics.carrier_name);
        protoAdapter.encodeWithTag(protoWriter, 4, deviceLocationHeuristics.carrier_country_code);
        protoAdapter.encodeWithTag(protoWriter, 5, deviceLocationHeuristics.time_zone);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, deviceLocationHeuristics.installed_keyboards);
        protoWriter.writeBytes(deviceLocationHeuristics.unknownFields());
    }
}
