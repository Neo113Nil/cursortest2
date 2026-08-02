package com.squareup.protos.cash.cash3dsauthentication.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ThreeDsAuthenticationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ThreeDsAuthenticationResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ThreeDsAuthenticationResponse threeDsAuthenticationResponse = (ThreeDsAuthenticationResponse) obj;
        reverseProtoWriter.getClass();
        threeDsAuthenticationResponse.getClass();
        reverseProtoWriter.writeBytes(threeDsAuthenticationResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, threeDsAuthenticationResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ThreeDsAuthenticationResponse threeDsAuthenticationResponse = (ThreeDsAuthenticationResponse) obj;
        threeDsAuthenticationResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, threeDsAuthenticationResponse.response_context) + threeDsAuthenticationResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ThreeDsAuthenticationResponse threeDsAuthenticationResponse = (ThreeDsAuthenticationResponse) obj;
        threeDsAuthenticationResponse.getClass();
        ResponseContext responseContext = threeDsAuthenticationResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ThreeDsAuthenticationResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ThreeDsAuthenticationResponse threeDsAuthenticationResponse = (ThreeDsAuthenticationResponse) obj;
        threeDsAuthenticationResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, threeDsAuthenticationResponse.response_context);
        protoWriter.writeBytes(threeDsAuthenticationResponse.unknownFields());
    }
}
