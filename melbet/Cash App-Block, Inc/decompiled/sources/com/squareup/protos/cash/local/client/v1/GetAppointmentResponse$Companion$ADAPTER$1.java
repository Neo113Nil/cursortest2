package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.Rum;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAppointmentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Rum rum = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAppointmentResponse(rum, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                rum = new GetAppointmentResponse$Response$Appointment((LocalAppointment) LocalAppointment.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                rum = new GetAppointmentResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAppointmentResponse getAppointmentResponse = (GetAppointmentResponse) obj;
        reverseProtoWriter.getClass();
        getAppointmentResponse.getClass();
        reverseProtoWriter.writeBytes(getAppointmentResponse.unknownFields());
        Rum rum = getAppointmentResponse.response;
        if (rum instanceof GetAppointmentResponse$Response$Appointment) {
            LocalAppointment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetAppointmentResponse$Response$Appointment) rum).value);
        } else if (rum instanceof GetAppointmentResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetAppointmentResponse$Response$ErrorResponse) rum).value);
        } else {
            if (rum == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetAppointmentResponse getAppointmentResponse = (GetAppointmentResponse) obj;
        getAppointmentResponse.getClass();
        int size$okio = getAppointmentResponse.unknownFields().getSize$okio();
        Rum rum = getAppointmentResponse.response;
        if (rum instanceof GetAppointmentResponse$Response$Appointment) {
            encodedSizeWithTag = LocalAppointment.ADAPTER.encodedSizeWithTag(1, ((GetAppointmentResponse$Response$Appointment) rum).value);
        } else {
            if (!(rum instanceof GetAppointmentResponse$Response$ErrorResponse)) {
                if (rum == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetAppointmentResponse$Response$ErrorResponse) rum).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAppointmentResponse getAppointmentResponse = (GetAppointmentResponse) obj;
        getAppointmentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Rum rum = getAppointmentResponse.response;
        byteString.getClass();
        return new GetAppointmentResponse(rum, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAppointmentResponse getAppointmentResponse = (GetAppointmentResponse) obj;
        getAppointmentResponse.getClass();
        Rum rum = getAppointmentResponse.response;
        if (rum instanceof GetAppointmentResponse$Response$Appointment) {
            LocalAppointment.ADAPTER.encodeWithTag(protoWriter, 1, ((GetAppointmentResponse$Response$Appointment) rum).value);
        } else if (rum instanceof GetAppointmentResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetAppointmentResponse$Response$ErrorResponse) rum).value);
        } else if (rum != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getAppointmentResponse.unknownFields());
    }
}
