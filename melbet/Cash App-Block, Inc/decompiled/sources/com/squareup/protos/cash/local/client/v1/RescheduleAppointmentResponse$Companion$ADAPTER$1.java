package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjb;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RescheduleAppointmentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjb zzjbVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RescheduleAppointmentResponse(zzjbVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjbVar = new RescheduleAppointmentResponse$Response$Appointment((LocalAppointment) LocalAppointment.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjbVar = new RescheduleAppointmentResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RescheduleAppointmentResponse rescheduleAppointmentResponse = (RescheduleAppointmentResponse) obj;
        reverseProtoWriter.getClass();
        rescheduleAppointmentResponse.getClass();
        reverseProtoWriter.writeBytes(rescheduleAppointmentResponse.unknownFields());
        zzjb zzjbVar = rescheduleAppointmentResponse.response;
        if (zzjbVar instanceof RescheduleAppointmentResponse$Response$Appointment) {
            LocalAppointment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((RescheduleAppointmentResponse$Response$Appointment) zzjbVar).value);
        } else if (zzjbVar instanceof RescheduleAppointmentResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((RescheduleAppointmentResponse$Response$ErrorResponse) zzjbVar).value);
        } else {
            if (zzjbVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        RescheduleAppointmentResponse rescheduleAppointmentResponse = (RescheduleAppointmentResponse) obj;
        rescheduleAppointmentResponse.getClass();
        int size$okio = rescheduleAppointmentResponse.unknownFields().getSize$okio();
        zzjb zzjbVar = rescheduleAppointmentResponse.response;
        if (zzjbVar instanceof RescheduleAppointmentResponse$Response$Appointment) {
            encodedSizeWithTag = LocalAppointment.ADAPTER.encodedSizeWithTag(1, ((RescheduleAppointmentResponse$Response$Appointment) zzjbVar).value);
        } else {
            if (!(zzjbVar instanceof RescheduleAppointmentResponse$Response$ErrorResponse)) {
                if (zzjbVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((RescheduleAppointmentResponse$Response$ErrorResponse) zzjbVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RescheduleAppointmentResponse rescheduleAppointmentResponse = (RescheduleAppointmentResponse) obj;
        rescheduleAppointmentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjb zzjbVar = rescheduleAppointmentResponse.response;
        byteString.getClass();
        return new RescheduleAppointmentResponse(zzjbVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RescheduleAppointmentResponse rescheduleAppointmentResponse = (RescheduleAppointmentResponse) obj;
        rescheduleAppointmentResponse.getClass();
        zzjb zzjbVar = rescheduleAppointmentResponse.response;
        if (zzjbVar instanceof RescheduleAppointmentResponse$Response$Appointment) {
            LocalAppointment.ADAPTER.encodeWithTag(protoWriter, 1, ((RescheduleAppointmentResponse$Response$Appointment) zzjbVar).value);
        } else if (zzjbVar instanceof RescheduleAppointmentResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((RescheduleAppointmentResponse$Response$ErrorResponse) zzjbVar).value);
        } else if (zzjbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(rescheduleAppointmentResponse.unknownFields());
    }
}
