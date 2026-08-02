package com.squareup.protos.cash.cash3dsauthentication.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetThreeDsEligibleInstrumentsInfoResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetThreeDsEligibleInstrumentsInfoResponse((String) obj, (String) obj2, m, (ResponseContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetThreeDsEligibleInstrumentsInfoResponse getThreeDsEligibleInstrumentsInfoResponse = (GetThreeDsEligibleInstrumentsInfoResponse) obj;
        reverseProtoWriter.getClass();
        getThreeDsEligibleInstrumentsInfoResponse.getClass();
        reverseProtoWriter.writeBytes(getThreeDsEligibleInstrumentsInfoResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getThreeDsEligibleInstrumentsInfoResponse.response_context);
        GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getThreeDsEligibleInstrumentsInfoResponse.instrument_info_list);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getThreeDsEligibleInstrumentsInfoResponse.message_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getThreeDsEligibleInstrumentsInfoResponse.ip_address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetThreeDsEligibleInstrumentsInfoResponse getThreeDsEligibleInstrumentsInfoResponse = (GetThreeDsEligibleInstrumentsInfoResponse) obj;
        getThreeDsEligibleInstrumentsInfoResponse.getClass();
        int size$okio = getThreeDsEligibleInstrumentsInfoResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ResponseContext.ADAPTER.encodedSizeWithTag(4, getThreeDsEligibleInstrumentsInfoResponse.response_context) + GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, getThreeDsEligibleInstrumentsInfoResponse.instrument_info_list) + protoAdapter.encodedSizeWithTag(2, getThreeDsEligibleInstrumentsInfoResponse.message_version) + protoAdapter.encodedSizeWithTag(1, getThreeDsEligibleInstrumentsInfoResponse.ip_address) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetThreeDsEligibleInstrumentsInfoResponse getThreeDsEligibleInstrumentsInfoResponse = (GetThreeDsEligibleInstrumentsInfoResponse) obj;
        getThreeDsEligibleInstrumentsInfoResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getThreeDsEligibleInstrumentsInfoResponse.instrument_info_list, GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo.ADAPTER);
        ResponseContext responseContext = getThreeDsEligibleInstrumentsInfoResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getThreeDsEligibleInstrumentsInfoResponse.ip_address;
        String str2 = getThreeDsEligibleInstrumentsInfoResponse.message_version;
        byteString.getClass();
        return new GetThreeDsEligibleInstrumentsInfoResponse(str, str2, m1169redactElements, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetThreeDsEligibleInstrumentsInfoResponse getThreeDsEligibleInstrumentsInfoResponse = (GetThreeDsEligibleInstrumentsInfoResponse) obj;
        getThreeDsEligibleInstrumentsInfoResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getThreeDsEligibleInstrumentsInfoResponse.ip_address);
        protoAdapter.encodeWithTag(protoWriter, 2, getThreeDsEligibleInstrumentsInfoResponse.message_version);
        GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getThreeDsEligibleInstrumentsInfoResponse.instrument_info_list);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, getThreeDsEligibleInstrumentsInfoResponse.response_context);
        protoWriter.writeBytes(getThreeDsEligibleInstrumentsInfoResponse.unknownFields());
    }
}
