package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomerInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerInfo((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerInfo customerInfo = (CustomerInfo) obj;
        reverseProtoWriter.getClass();
        customerInfo.getClass();
        reverseProtoWriter.writeBytes(customerInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, customerInfo.profile_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, customerInfo.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customerInfo.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, customerInfo.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerInfo customerInfo = (CustomerInfo) obj;
        customerInfo.getClass();
        int size$okio = customerInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, customerInfo.profile_photo_url) + protoAdapter.encodedSizeWithTag(3, customerInfo.display_name) + protoAdapter.encodedSizeWithTag(2, customerInfo.cashtag) + protoAdapter.encodedSizeWithTag(1, customerInfo.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerInfo customerInfo = (CustomerInfo) obj;
        customerInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = customerInfo.customer_token;
        byteString.getClass();
        return new CustomerInfo(str, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerInfo customerInfo = (CustomerInfo) obj;
        customerInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, customerInfo.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, customerInfo.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 3, customerInfo.display_name);
        protoAdapter.encodeWithTag(protoWriter, 4, customerInfo.profile_photo_url);
        protoWriter.writeBytes(customerInfo.unknownFields());
    }
}
