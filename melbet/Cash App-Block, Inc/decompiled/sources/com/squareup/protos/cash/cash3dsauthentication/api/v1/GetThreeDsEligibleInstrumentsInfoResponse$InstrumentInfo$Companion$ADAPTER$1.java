package com.squareup.protos.cash.cash3dsauthentication.api.v1;

import com.squareup.protos.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetThreeDsEligibleInstrumentsInfoResponse$InstrumentInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo instrumentInfo = (GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo) obj;
        reverseProtoWriter.getClass();
        instrumentInfo.getClass();
        reverseProtoWriter.writeBytes(instrumentInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, instrumentInfo.directory_server_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, instrumentInfo.instrument_link_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo instrumentInfo = (GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo) obj;
        instrumentInfo.getClass();
        int size$okio = instrumentInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, instrumentInfo.directory_server_id) + protoAdapter.encodedSizeWithTag(1, instrumentInfo.instrument_link_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo instrumentInfo = (GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo) obj;
        instrumentInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = instrumentInfo.instrument_link_token;
        String str2 = instrumentInfo.directory_server_id;
        byteString.getClass();
        return new GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo instrumentInfo = (GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo) obj;
        instrumentInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, instrumentInfo.instrument_link_token);
        protoAdapter.encodeWithTag(protoWriter, 2, instrumentInfo.directory_server_id);
        protoWriter.writeBytes(instrumentInfo.unknownFields());
    }
}
