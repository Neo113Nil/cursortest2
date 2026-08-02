package com.squareup.protos.cash.moneymap.app;

import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRetailerLocationsResponse$LocationDetail$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetRetailerLocationsResponse.LocationDetail((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        GetRetailerLocationsResponse.LocationDetail locationDetail = (GetRetailerLocationsResponse.LocationDetail) obj;
        reverseProtoWriter.getClass();
        locationDetail.getClass();
        reverseProtoWriter.writeBytes(locationDetail.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, locationDetail.highlighted_info_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, locationDetail.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, locationDetail.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRetailerLocationsResponse.LocationDetail locationDetail = (GetRetailerLocationsResponse.LocationDetail) obj;
        locationDetail.getClass();
        int size$okio = locationDetail.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, locationDetail.highlighted_info_text) + protoAdapter.encodedSizeWithTag(2, locationDetail.description) + protoAdapter.encodedSizeWithTag(1, locationDetail.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRetailerLocationsResponse.LocationDetail locationDetail = (GetRetailerLocationsResponse.LocationDetail) obj;
        locationDetail.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = locationDetail.title;
        String str2 = locationDetail.description;
        String str3 = locationDetail.highlighted_info_text;
        byteString.getClass();
        return new GetRetailerLocationsResponse.LocationDetail(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRetailerLocationsResponse.LocationDetail locationDetail = (GetRetailerLocationsResponse.LocationDetail) obj;
        locationDetail.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, locationDetail.title);
        protoAdapter.encodeWithTag(protoWriter, 2, locationDetail.description);
        protoAdapter.encodeWithTag(protoWriter, 3, locationDetail.highlighted_info_text);
        protoWriter.writeBytes(locationDetail.unknownFields());
    }
}
