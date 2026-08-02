package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzim;
import com.squareup.protos.cash.local.client.v1.ListAppointmentsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListAppointmentsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzim zzimVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListAppointmentsResponse(zzimVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzimVar = new ListAppointmentsResponse$Response$Success((ListAppointmentsResponse.Success) ListAppointmentsResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzimVar = new ListAppointmentsResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListAppointmentsResponse listAppointmentsResponse = (ListAppointmentsResponse) obj;
        reverseProtoWriter.getClass();
        listAppointmentsResponse.getClass();
        reverseProtoWriter.writeBytes(listAppointmentsResponse.unknownFields());
        zzim zzimVar = listAppointmentsResponse.response;
        if (zzimVar instanceof ListAppointmentsResponse$Response$Success) {
            ListAppointmentsResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ListAppointmentsResponse$Response$Success) zzimVar).value);
        } else if (zzimVar instanceof ListAppointmentsResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ListAppointmentsResponse$Response$ErrorResponse) zzimVar).value);
        } else {
            if (zzimVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ListAppointmentsResponse listAppointmentsResponse = (ListAppointmentsResponse) obj;
        listAppointmentsResponse.getClass();
        int size$okio = listAppointmentsResponse.unknownFields().getSize$okio();
        zzim zzimVar = listAppointmentsResponse.response;
        if (zzimVar instanceof ListAppointmentsResponse$Response$Success) {
            encodedSizeWithTag = ListAppointmentsResponse.Success.ADAPTER.encodedSizeWithTag(1, ((ListAppointmentsResponse$Response$Success) zzimVar).value);
        } else {
            if (!(zzimVar instanceof ListAppointmentsResponse$Response$ErrorResponse)) {
                if (zzimVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((ListAppointmentsResponse$Response$ErrorResponse) zzimVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListAppointmentsResponse listAppointmentsResponse = (ListAppointmentsResponse) obj;
        listAppointmentsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzim zzimVar = listAppointmentsResponse.response;
        byteString.getClass();
        return new ListAppointmentsResponse(zzimVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListAppointmentsResponse listAppointmentsResponse = (ListAppointmentsResponse) obj;
        listAppointmentsResponse.getClass();
        zzim zzimVar = listAppointmentsResponse.response;
        if (zzimVar instanceof ListAppointmentsResponse$Response$Success) {
            ListAppointmentsResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((ListAppointmentsResponse$Response$Success) zzimVar).value);
        } else if (zzimVar instanceof ListAppointmentsResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((ListAppointmentsResponse$Response$ErrorResponse) zzimVar).value);
        } else if (zzimVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(listAppointmentsResponse.unknownFields());
    }
}
