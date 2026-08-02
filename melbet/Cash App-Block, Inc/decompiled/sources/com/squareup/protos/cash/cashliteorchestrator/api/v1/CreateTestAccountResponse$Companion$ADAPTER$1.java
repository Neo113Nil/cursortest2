package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateTestAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateTestAccountResponse((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateTestAccountResponse createTestAccountResponse = (CreateTestAccountResponse) obj;
        reverseProtoWriter.getClass();
        createTestAccountResponse.getClass();
        reverseProtoWriter.writeBytes(createTestAccountResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 6, createTestAccountResponse.messages);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, createTestAccountResponse.tenant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, createTestAccountResponse.evm_wallet_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, createTestAccountResponse.sub_org_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, createTestAccountResponse.account_holder_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createTestAccountResponse.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateTestAccountResponse createTestAccountResponse = (CreateTestAccountResponse) obj;
        createTestAccountResponse.getClass();
        int size$okio = createTestAccountResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(6, createTestAccountResponse.messages) + protoAdapter.encodedSizeWithTag(5, createTestAccountResponse.tenant_token) + protoAdapter.encodedSizeWithTag(4, createTestAccountResponse.evm_wallet_address) + protoAdapter.encodedSizeWithTag(3, createTestAccountResponse.sub_org_id) + protoAdapter.encodedSizeWithTag(2, createTestAccountResponse.account_holder_token) + protoAdapter.encodedSizeWithTag(1, createTestAccountResponse.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateTestAccountResponse createTestAccountResponse = (CreateTestAccountResponse) obj;
        createTestAccountResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = createTestAccountResponse.customer_token;
        String str2 = createTestAccountResponse.account_holder_token;
        String str3 = createTestAccountResponse.sub_org_id;
        String str4 = createTestAccountResponse.evm_wallet_address;
        String str5 = createTestAccountResponse.tenant_token;
        List list = createTestAccountResponse.messages;
        list.getClass();
        byteString.getClass();
        return new CreateTestAccountResponse(str, str2, str3, str4, str5, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateTestAccountResponse createTestAccountResponse = (CreateTestAccountResponse) obj;
        createTestAccountResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createTestAccountResponse.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, createTestAccountResponse.account_holder_token);
        protoAdapter.encodeWithTag(protoWriter, 3, createTestAccountResponse.sub_org_id);
        protoAdapter.encodeWithTag(protoWriter, 4, createTestAccountResponse.evm_wallet_address);
        protoAdapter.encodeWithTag(protoWriter, 5, createTestAccountResponse.tenant_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, createTestAccountResponse.messages);
        protoWriter.writeBytes(createTestAccountResponse.unknownFields());
    }
}
