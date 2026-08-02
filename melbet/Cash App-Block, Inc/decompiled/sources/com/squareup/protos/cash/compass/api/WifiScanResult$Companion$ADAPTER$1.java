package com.squareup.protos.cash.compass.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class WifiScanResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WifiScanResult((String) obj, (String) obj2, (Integer) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WifiScanResult wifiScanResult = (WifiScanResult) obj;
        reverseProtoWriter.getClass();
        wifiScanResult.getClass();
        reverseProtoWriter.writeBytes(wifiScanResult.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, wifiScanResult.frequency_mhz);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, wifiScanResult.rssi);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, wifiScanResult.bssid);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, wifiScanResult.ssid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WifiScanResult wifiScanResult = (WifiScanResult) obj;
        wifiScanResult.getClass();
        int size$okio = wifiScanResult.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, wifiScanResult.bssid) + protoAdapter.encodedSizeWithTag(1, wifiScanResult.ssid) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        return protoAdapter2.encodedSizeWithTag(4, wifiScanResult.frequency_mhz) + protoAdapter2.encodedSizeWithTag(3, wifiScanResult.rssi) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WifiScanResult wifiScanResult = (WifiScanResult) obj;
        wifiScanResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = wifiScanResult.rssi;
        Integer num2 = wifiScanResult.frequency_mhz;
        byteString.getClass();
        return new WifiScanResult(null, null, num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WifiScanResult wifiScanResult = (WifiScanResult) obj;
        wifiScanResult.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, wifiScanResult.ssid);
        protoAdapter.encodeWithTag(protoWriter, 2, wifiScanResult.bssid);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, wifiScanResult.rssi);
        protoAdapter2.encodeWithTag(protoWriter, 4, wifiScanResult.frequency_mhz);
        protoWriter.writeBytes(wifiScanResult.unknownFields());
    }
}
