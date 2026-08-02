package com.squareup.protos.cash.cash3dsauthentication.api.v1;

import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ThreeDsAuthenticationRequest$SdkInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ThreeDsAuthenticationRequest.SdkInfo((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ThreeDsAuthenticationRequest.SdkInfo sdkInfo = (ThreeDsAuthenticationRequest.SdkInfo) obj;
        reverseProtoWriter.getClass();
        sdkInfo.getClass();
        reverseProtoWriter.writeBytes(sdkInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, sdkInfo.sdk_ephemeral_public_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, sdkInfo.sdk_reference_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, sdkInfo.sdk_app_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, sdkInfo.sdk_transaction_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, sdkInfo.sdk_enc_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ThreeDsAuthenticationRequest.SdkInfo sdkInfo = (ThreeDsAuthenticationRequest.SdkInfo) obj;
        sdkInfo.getClass();
        int size$okio = sdkInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, sdkInfo.sdk_ephemeral_public_key) + protoAdapter.encodedSizeWithTag(4, sdkInfo.sdk_reference_number) + protoAdapter.encodedSizeWithTag(3, sdkInfo.sdk_app_id) + protoAdapter.encodedSizeWithTag(2, sdkInfo.sdk_transaction_id) + protoAdapter.encodedSizeWithTag(1, sdkInfo.sdk_enc_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ThreeDsAuthenticationRequest.SdkInfo sdkInfo = (ThreeDsAuthenticationRequest.SdkInfo) obj;
        sdkInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = sdkInfo.sdk_enc_data;
        String str2 = sdkInfo.sdk_transaction_id;
        String str3 = sdkInfo.sdk_app_id;
        String str4 = sdkInfo.sdk_reference_number;
        String str5 = sdkInfo.sdk_ephemeral_public_key;
        byteString.getClass();
        return new ThreeDsAuthenticationRequest.SdkInfo(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ThreeDsAuthenticationRequest.SdkInfo sdkInfo = (ThreeDsAuthenticationRequest.SdkInfo) obj;
        sdkInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, sdkInfo.sdk_enc_data);
        protoAdapter.encodeWithTag(protoWriter, 2, sdkInfo.sdk_transaction_id);
        protoAdapter.encodeWithTag(protoWriter, 3, sdkInfo.sdk_app_id);
        protoAdapter.encodeWithTag(protoWriter, 4, sdkInfo.sdk_reference_number);
        protoAdapter.encodeWithTag(protoWriter, 5, sdkInfo.sdk_ephemeral_public_key);
        protoWriter.writeBytes(sdkInfo.unknownFields());
    }
}
