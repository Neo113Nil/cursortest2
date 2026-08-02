package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSecureTokenResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSecureTokenResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSecureTokenResponse getSecureTokenResponse = (GetSecureTokenResponse) obj;
        reverseProtoWriter.getClass();
        getSecureTokenResponse.getClass();
        reverseProtoWriter.writeBytes(getSecureTokenResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getSecureTokenResponse.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSecureTokenResponse getSecureTokenResponse = (GetSecureTokenResponse) obj;
        getSecureTokenResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, getSecureTokenResponse.token) + getSecureTokenResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSecureTokenResponse getSecureTokenResponse = (GetSecureTokenResponse) obj;
        getSecureTokenResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getSecureTokenResponse.token;
        byteString.getClass();
        return new GetSecureTokenResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSecureTokenResponse getSecureTokenResponse = (GetSecureTokenResponse) obj;
        getSecureTokenResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSecureTokenResponse.token);
        protoWriter.writeBytes(getSecureTokenResponse.unknownFields());
    }
}
