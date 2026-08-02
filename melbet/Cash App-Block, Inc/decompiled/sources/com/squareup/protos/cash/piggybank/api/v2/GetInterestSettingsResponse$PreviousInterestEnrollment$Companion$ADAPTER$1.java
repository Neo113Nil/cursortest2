package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.piggybank.api.v2.GetInterestSettingsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetInterestSettingsResponse$PreviousInterestEnrollment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInterestSettingsResponse.PreviousInterestEnrollment((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInterestSettingsResponse.PreviousInterestEnrollment previousInterestEnrollment = (GetInterestSettingsResponse.PreviousInterestEnrollment) obj;
        reverseProtoWriter.getClass();
        previousInterestEnrollment.getClass();
        reverseProtoWriter.writeBytes(previousInterestEnrollment.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, previousInterestEnrollment.disabled_at);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, previousInterestEnrollment.interest_enrollment_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInterestSettingsResponse.PreviousInterestEnrollment previousInterestEnrollment = (GetInterestSettingsResponse.PreviousInterestEnrollment) obj;
        previousInterestEnrollment.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, previousInterestEnrollment.disabled_at) + ProtoAdapter.STRING.encodedSizeWithTag(1, previousInterestEnrollment.interest_enrollment_token) + previousInterestEnrollment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInterestSettingsResponse.PreviousInterestEnrollment previousInterestEnrollment = (GetInterestSettingsResponse.PreviousInterestEnrollment) obj;
        previousInterestEnrollment.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = previousInterestEnrollment.interest_enrollment_token;
        Long l = previousInterestEnrollment.disabled_at;
        byteString.getClass();
        return new GetInterestSettingsResponse.PreviousInterestEnrollment(str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInterestSettingsResponse.PreviousInterestEnrollment previousInterestEnrollment = (GetInterestSettingsResponse.PreviousInterestEnrollment) obj;
        previousInterestEnrollment.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, previousInterestEnrollment.interest_enrollment_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, previousInterestEnrollment.disabled_at);
        protoWriter.writeBytes(previousInterestEnrollment.unknownFields());
    }
}
