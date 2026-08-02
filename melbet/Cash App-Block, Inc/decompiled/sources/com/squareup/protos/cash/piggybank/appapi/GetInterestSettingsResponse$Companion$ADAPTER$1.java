package com.squareup.protos.cash.piggybank.appapi;

import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetInterestSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInterestSettingsResponse((InterestYieldStatus) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = InterestYieldStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        reverseProtoWriter.getClass();
        getInterestSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(getInterestSettingsResponse.unknownFields());
        InterestYieldStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getInterestSettingsResponse.interest_yield_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        getInterestSettingsResponse.getClass();
        return InterestYieldStatus.ADAPTER.encodedSizeWithTag(1, getInterestSettingsResponse.interest_yield_status) + getInterestSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        getInterestSettingsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        InterestYieldStatus interestYieldStatus = getInterestSettingsResponse.interest_yield_status;
        byteString.getClass();
        return new GetInterestSettingsResponse(interestYieldStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        getInterestSettingsResponse.getClass();
        InterestYieldStatus.ADAPTER.encodeWithTag(protoWriter, 1, getInterestSettingsResponse.interest_yield_status);
        protoWriter.writeBytes(getInterestSettingsResponse.unknownFields());
    }
}
