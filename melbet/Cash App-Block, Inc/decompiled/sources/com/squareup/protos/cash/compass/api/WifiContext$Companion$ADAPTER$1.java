package com.squareup.protos.cash.compass.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class WifiContext$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new WifiContext((String) obj, (String) obj2, (Integer) obj3, (Integer) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(WifiScanResult.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WifiContext wifiContext = (WifiContext) obj;
        reverseProtoWriter.getClass();
        wifiContext.getClass();
        reverseProtoWriter.writeBytes(wifiContext.unknownFields());
        WifiScanResult.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, wifiContext.available_networks);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, wifiContext.connected_frequency_mhz);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, wifiContext.connected_rssi);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, wifiContext.connected_bssid);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, wifiContext.connected_ssid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WifiContext wifiContext = (WifiContext) obj;
        wifiContext.getClass();
        int size$okio = wifiContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, wifiContext.connected_bssid) + protoAdapter.encodedSizeWithTag(1, wifiContext.connected_ssid) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        return WifiScanResult.ADAPTER.asRepeated().encodedSizeWithTag(5, wifiContext.available_networks) + protoAdapter2.encodedSizeWithTag(4, wifiContext.connected_frequency_mhz) + protoAdapter2.encodedSizeWithTag(3, wifiContext.connected_rssi) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WifiContext wifiContext = (WifiContext) obj;
        wifiContext.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(wifiContext.available_networks, WifiScanResult.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Integer num = wifiContext.connected_rssi;
        Integer num2 = wifiContext.connected_frequency_mhz;
        byteString.getClass();
        return new WifiContext(null, null, num, num2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WifiContext wifiContext = (WifiContext) obj;
        wifiContext.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, wifiContext.connected_ssid);
        protoAdapter.encodeWithTag(protoWriter, 2, wifiContext.connected_bssid);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, wifiContext.connected_rssi);
        protoAdapter2.encodeWithTag(protoWriter, 4, wifiContext.connected_frequency_mhz);
        WifiScanResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, wifiContext.available_networks);
        protoWriter.writeBytes(wifiContext.unknownFields());
    }
}
