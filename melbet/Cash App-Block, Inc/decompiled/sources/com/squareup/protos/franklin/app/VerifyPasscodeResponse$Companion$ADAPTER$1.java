package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyPasscodeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyPasscodeResponse((ResponseContext) obj, (VerifyPasscodeResponse.Status) obj2, (String) obj3, (String) obj4, (Instrument) obj5, (VerifyPasscodeResponse.ProtectedData) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = VerifyPasscodeResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 6) {
                obj5 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj5);
            } else if (nextTag == 10) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 11) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj6 = TransactorKt.decodeMessageOrMerge(VerifyPasscodeResponse.ProtectedData.ADAPTER, protoReader, obj6);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyPasscodeResponse verifyPasscodeResponse = (VerifyPasscodeResponse) obj;
        reverseProtoWriter.getClass();
        verifyPasscodeResponse.getClass();
        reverseProtoWriter.writeBytes(verifyPasscodeResponse.unknownFields());
        VerifyPasscodeResponse.ProtectedData.ADAPTER.encodeWithTag(reverseProtoWriter, 11, verifyPasscodeResponse.protected_data);
        Instrument.ADAPTER.encodeWithTag(reverseProtoWriter, 6, verifyPasscodeResponse.instrument);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, verifyPasscodeResponse.passcode_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, verifyPasscodeResponse.full_name);
        VerifyPasscodeResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyPasscodeResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 10, verifyPasscodeResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyPasscodeResponse verifyPasscodeResponse = (VerifyPasscodeResponse) obj;
        verifyPasscodeResponse.getClass();
        int encodedSizeWithTag = VerifyPasscodeResponse.Status.ADAPTER.encodedSizeWithTag(1, verifyPasscodeResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(10, verifyPasscodeResponse.response_context) + verifyPasscodeResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return VerifyPasscodeResponse.ProtectedData.ADAPTER.encodedSizeWithTag(11, verifyPasscodeResponse.protected_data) + Instrument.ADAPTER.encodedSizeWithTag(6, verifyPasscodeResponse.instrument) + protoAdapter.encodedSizeWithTag(3, verifyPasscodeResponse.passcode_token) + protoAdapter.encodedSizeWithTag(2, verifyPasscodeResponse.full_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyPasscodeResponse verifyPasscodeResponse = (VerifyPasscodeResponse) obj;
        verifyPasscodeResponse.getClass();
        ResponseContext responseContext = verifyPasscodeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        Instrument instrument = verifyPasscodeResponse.instrument;
        Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
        VerifyPasscodeResponse.ProtectedData protectedData = verifyPasscodeResponse.protected_data;
        VerifyPasscodeResponse.ProtectedData protectedData2 = protectedData != null ? (VerifyPasscodeResponse.ProtectedData) VerifyPasscodeResponse.ProtectedData.ADAPTER.redact(protectedData) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifyPasscodeResponse.Status status = verifyPasscodeResponse.status;
        byteString.getClass();
        return new VerifyPasscodeResponse(responseContext2, status, null, null, instrument2, protectedData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyPasscodeResponse verifyPasscodeResponse = (VerifyPasscodeResponse) obj;
        verifyPasscodeResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 10, verifyPasscodeResponse.response_context);
        VerifyPasscodeResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, verifyPasscodeResponse.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, verifyPasscodeResponse.full_name);
        protoAdapter.encodeWithTag(protoWriter, 3, verifyPasscodeResponse.passcode_token);
        Instrument.ADAPTER.encodeWithTag(protoWriter, 6, verifyPasscodeResponse.instrument);
        VerifyPasscodeResponse.ProtectedData.ADAPTER.encodeWithTag(protoWriter, 11, verifyPasscodeResponse.protected_data);
        protoWriter.writeBytes(verifyPasscodeResponse.unknownFields());
    }
}
