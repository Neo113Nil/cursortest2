package com.squareup.protos.cash.supportal.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Idle$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportPhoneStatusResponse.Idle((SupportPhoneStatusResponse.ServiceAvailability) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SupportPhoneStatusResponse.ServiceAvailability.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportPhoneStatusResponse.Idle idle = (SupportPhoneStatusResponse.Idle) obj;
        reverseProtoWriter.getClass();
        idle.getClass();
        reverseProtoWriter.writeBytes(idle.unknownFields());
        SupportPhoneStatusResponse.ServiceAvailability.ADAPTER.encodeWithTag(reverseProtoWriter, 1, idle.service_availability);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportPhoneStatusResponse.Idle idle = (SupportPhoneStatusResponse.Idle) obj;
        idle.getClass();
        return SupportPhoneStatusResponse.ServiceAvailability.ADAPTER.encodedSizeWithTag(1, idle.service_availability) + idle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportPhoneStatusResponse.Idle idle = (SupportPhoneStatusResponse.Idle) obj;
        idle.getClass();
        SupportPhoneStatusResponse.ServiceAvailability serviceAvailability = idle.service_availability;
        SupportPhoneStatusResponse.ServiceAvailability serviceAvailability2 = serviceAvailability != null ? (SupportPhoneStatusResponse.ServiceAvailability) SupportPhoneStatusResponse.ServiceAvailability.ADAPTER.redact(serviceAvailability) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SupportPhoneStatusResponse.Idle(serviceAvailability2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportPhoneStatusResponse.Idle idle = (SupportPhoneStatusResponse.Idle) obj;
        idle.getClass();
        SupportPhoneStatusResponse.ServiceAvailability.ADAPTER.encodeWithTag(protoWriter, 1, idle.service_availability);
        protoWriter.writeBytes(idle.unknownFields());
    }
}
