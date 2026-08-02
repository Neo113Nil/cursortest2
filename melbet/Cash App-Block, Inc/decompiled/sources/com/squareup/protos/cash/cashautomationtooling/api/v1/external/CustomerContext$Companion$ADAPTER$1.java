package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomerContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerContext((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CustomerContext customerContext = (CustomerContext) obj;
        reverseProtoWriter.getClass();
        customerContext.getClass();
        reverseProtoWriter.writeBytes(customerContext.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customerContext.region);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, customerContext.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerContext customerContext = (CustomerContext) obj;
        customerContext.getClass();
        int size$okio = customerContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, customerContext.region) + protoAdapter.encodedSizeWithTag(1, customerContext.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerContext customerContext = (CustomerContext) obj;
        customerContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = customerContext.customer_token;
        String str2 = customerContext.region;
        byteString.getClass();
        return new CustomerContext(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerContext customerContext = (CustomerContext) obj;
        customerContext.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, customerContext.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, customerContext.region);
        protoWriter.writeBytes(customerContext.unknownFields());
    }
}
