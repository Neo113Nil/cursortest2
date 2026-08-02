package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$ServiceAvailability$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SupportPhoneStatusResponse.ServiceAvailability((Boolean) obj, (Long) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportPhoneStatusResponse.ServiceAvailability serviceAvailability = (SupportPhoneStatusResponse.ServiceAvailability) obj;
        reverseProtoWriter.getClass();
        serviceAvailability.getClass();
        reverseProtoWriter.writeBytes(serviceAvailability.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, serviceAvailability.availability_subtitle);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, serviceAvailability.service_available_timestamp);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, serviceAvailability.available);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportPhoneStatusResponse.ServiceAvailability serviceAvailability = (SupportPhoneStatusResponse.ServiceAvailability) obj;
        serviceAvailability.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(4, serviceAvailability.availability_subtitle) + ProtoAdapter.INT64.encodedSizeWithTag(3, serviceAvailability.service_available_timestamp) + ProtoAdapter.BOOL.encodedSizeWithTag(1, serviceAvailability.available) + serviceAvailability.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportPhoneStatusResponse.ServiceAvailability serviceAvailability = (SupportPhoneStatusResponse.ServiceAvailability) obj;
        serviceAvailability.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = serviceAvailability.available;
        Long l = serviceAvailability.service_available_timestamp;
        String str = serviceAvailability.availability_subtitle;
        byteString.getClass();
        return new SupportPhoneStatusResponse.ServiceAvailability(bool, l, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportPhoneStatusResponse.ServiceAvailability serviceAvailability = (SupportPhoneStatusResponse.ServiceAvailability) obj;
        serviceAvailability.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, serviceAvailability.available);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, serviceAvailability.service_available_timestamp);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, serviceAvailability.availability_subtitle);
        protoWriter.writeBytes(serviceAvailability.unknownFields());
    }
}
