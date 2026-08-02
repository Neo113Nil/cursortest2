package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBusinessProfileResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBusinessProfileResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                m.add(BusinessProfile.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBusinessProfileResponse getBusinessProfileResponse = (GetBusinessProfileResponse) obj;
        reverseProtoWriter.getClass();
        getBusinessProfileResponse.getClass();
        reverseProtoWriter.writeBytes(getBusinessProfileResponse.unknownFields());
        BusinessProfile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getBusinessProfileResponse.business_profiles);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBusinessProfileResponse getBusinessProfileResponse = (GetBusinessProfileResponse) obj;
        getBusinessProfileResponse.getClass();
        return BusinessProfile.ADAPTER.asRepeated().encodedSizeWithTag(2, getBusinessProfileResponse.business_profiles) + getBusinessProfileResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBusinessProfileResponse getBusinessProfileResponse = (GetBusinessProfileResponse) obj;
        getBusinessProfileResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getBusinessProfileResponse.business_profiles, BusinessProfile.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBusinessProfileResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBusinessProfileResponse getBusinessProfileResponse = (GetBusinessProfileResponse) obj;
        getBusinessProfileResponse.getClass();
        BusinessProfile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getBusinessProfileResponse.business_profiles);
        protoWriter.writeBytes(getBusinessProfileResponse.unknownFields());
    }
}
