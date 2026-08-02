package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OnboardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new OnboardResponse((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OnboardResponse onboardResponse = (OnboardResponse) obj;
        reverseProtoWriter.getClass();
        onboardResponse.getClass();
        reverseProtoWriter.writeBytes(onboardResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, onboardResponse.bitcoin_deposit_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, onboardResponse.svm_wallet_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, onboardResponse.spark_identity_public_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, onboardResponse.spark_wallet_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, onboardResponse.evm_wallet_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, onboardResponse.sub_org_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OnboardResponse onboardResponse = (OnboardResponse) obj;
        onboardResponse.getClass();
        int size$okio = onboardResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, onboardResponse.bitcoin_deposit_address) + protoAdapter.encodedSizeWithTag(5, onboardResponse.svm_wallet_address) + protoAdapter.encodedSizeWithTag(4, onboardResponse.spark_identity_public_key) + protoAdapter.encodedSizeWithTag(3, onboardResponse.spark_wallet_address) + protoAdapter.encodedSizeWithTag(2, onboardResponse.evm_wallet_address) + protoAdapter.encodedSizeWithTag(1, onboardResponse.sub_org_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OnboardResponse onboardResponse = (OnboardResponse) obj;
        onboardResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = onboardResponse.sub_org_id;
        String str2 = onboardResponse.evm_wallet_address;
        String str3 = onboardResponse.spark_wallet_address;
        String str4 = onboardResponse.spark_identity_public_key;
        String str5 = onboardResponse.svm_wallet_address;
        String str6 = onboardResponse.bitcoin_deposit_address;
        byteString.getClass();
        return new OnboardResponse(str, str2, str3, str4, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OnboardResponse onboardResponse = (OnboardResponse) obj;
        onboardResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, onboardResponse.sub_org_id);
        protoAdapter.encodeWithTag(protoWriter, 2, onboardResponse.evm_wallet_address);
        protoAdapter.encodeWithTag(protoWriter, 3, onboardResponse.spark_wallet_address);
        protoAdapter.encodeWithTag(protoWriter, 4, onboardResponse.spark_identity_public_key);
        protoAdapter.encodeWithTag(protoWriter, 5, onboardResponse.svm_wallet_address);
        protoAdapter.encodeWithTag(protoWriter, 6, onboardResponse.bitcoin_deposit_address);
        protoWriter.writeBytes(onboardResponse.unknownFields());
    }
}
