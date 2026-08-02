package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhm;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CancelAppointmentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzhm zzhmVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CancelAppointmentResponse(zzhmVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzhmVar = new CancelAppointmentResponse$Response$Appointment((LocalAppointment) LocalAppointment.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzhmVar = new CancelAppointmentResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CancelAppointmentResponse cancelAppointmentResponse = (CancelAppointmentResponse) obj;
        reverseProtoWriter.getClass();
        cancelAppointmentResponse.getClass();
        reverseProtoWriter.writeBytes(cancelAppointmentResponse.unknownFields());
        zzhm zzhmVar = cancelAppointmentResponse.response;
        if (zzhmVar instanceof CancelAppointmentResponse$Response$Appointment) {
            LocalAppointment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CancelAppointmentResponse$Response$Appointment) zzhmVar).value);
        } else if (zzhmVar instanceof CancelAppointmentResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CancelAppointmentResponse$Response$ErrorResponse) zzhmVar).value);
        } else {
            if (zzhmVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CancelAppointmentResponse cancelAppointmentResponse = (CancelAppointmentResponse) obj;
        cancelAppointmentResponse.getClass();
        int size$okio = cancelAppointmentResponse.unknownFields().getSize$okio();
        zzhm zzhmVar = cancelAppointmentResponse.response;
        if (zzhmVar instanceof CancelAppointmentResponse$Response$Appointment) {
            encodedSizeWithTag = LocalAppointment.ADAPTER.encodedSizeWithTag(1, ((CancelAppointmentResponse$Response$Appointment) zzhmVar).value);
        } else {
            if (!(zzhmVar instanceof CancelAppointmentResponse$Response$ErrorResponse)) {
                if (zzhmVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((CancelAppointmentResponse$Response$ErrorResponse) zzhmVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelAppointmentResponse cancelAppointmentResponse = (CancelAppointmentResponse) obj;
        cancelAppointmentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzhm zzhmVar = cancelAppointmentResponse.response;
        byteString.getClass();
        return new CancelAppointmentResponse(zzhmVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelAppointmentResponse cancelAppointmentResponse = (CancelAppointmentResponse) obj;
        cancelAppointmentResponse.getClass();
        zzhm zzhmVar = cancelAppointmentResponse.response;
        if (zzhmVar instanceof CancelAppointmentResponse$Response$Appointment) {
            LocalAppointment.ADAPTER.encodeWithTag(protoWriter, 1, ((CancelAppointmentResponse$Response$Appointment) zzhmVar).value);
        } else if (zzhmVar instanceof CancelAppointmentResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((CancelAppointmentResponse$Response$ErrorResponse) zzhmVar).value);
        } else if (zzhmVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cancelAppointmentResponse.unknownFields());
    }
}
