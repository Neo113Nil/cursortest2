package com.squareup.protos.cash.fiatly.api.v2;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaymentUpdatesBySessionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPaymentUpdatesBySessionRequest((String) obj, m, (SigningData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 1337) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(SigningData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest = (GetPaymentUpdatesBySessionRequest) obj;
        reverseProtoWriter.getClass();
        getPaymentUpdatesBySessionRequest.getClass();
        reverseProtoWriter.writeBytes(getPaymentUpdatesBySessionRequest.unknownFields());
        SigningData.ADAPTER.encodeWithTag(reverseProtoWriter, 1337, getPaymentUpdatesBySessionRequest.signing_data_);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, getPaymentUpdatesBySessionRequest.nearby_session_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getPaymentUpdatesBySessionRequest.nearby_session_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest = (GetPaymentUpdatesBySessionRequest) obj;
        getPaymentUpdatesBySessionRequest.getClass();
        int size$okio = getPaymentUpdatesBySessionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SigningData.ADAPTER.encodedSizeWithTag(1337, getPaymentUpdatesBySessionRequest.signing_data_) + protoAdapter.asRepeated().encodedSizeWithTag(2, getPaymentUpdatesBySessionRequest.nearby_session_tokens) + protoAdapter.encodedSizeWithTag(1, getPaymentUpdatesBySessionRequest.nearby_session_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest = (GetPaymentUpdatesBySessionRequest) obj;
        getPaymentUpdatesBySessionRequest.getClass();
        SigningData signingData = getPaymentUpdatesBySessionRequest.signing_data_;
        SigningData signingData2 = signingData != null ? (SigningData) SigningData.ADAPTER.redact(signingData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getPaymentUpdatesBySessionRequest.nearby_session_token;
        List list = getPaymentUpdatesBySessionRequest.nearby_session_tokens;
        list.getClass();
        byteString.getClass();
        return new GetPaymentUpdatesBySessionRequest(str, list, signingData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest = (GetPaymentUpdatesBySessionRequest) obj;
        getPaymentUpdatesBySessionRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getPaymentUpdatesBySessionRequest.nearby_session_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, getPaymentUpdatesBySessionRequest.nearby_session_tokens);
        SigningData.ADAPTER.encodeWithTag(protoWriter, 1337, getPaymentUpdatesBySessionRequest.signing_data_);
        protoWriter.writeBytes(getPaymentUpdatesBySessionRequest.unknownFields());
    }
}
