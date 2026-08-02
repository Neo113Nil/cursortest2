package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Address$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Address((String) obj, (AddressType) obj2, (String) obj3, (Chain) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = AddressType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = Chain.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Address address = (Address) obj;
        reverseProtoWriter.getClass();
        address.getClass();
        reverseProtoWriter.writeBytes(address.unknownFields());
        Chain.ADAPTER.encodeWithTag(reverseProtoWriter, 4, address.chain);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, address.address);
        AddressType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, address.address_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, address.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Address address = (Address) obj;
        address.getClass();
        int size$okio = address.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Chain.ADAPTER.encodedSizeWithTag(4, address.chain) + protoAdapter.encodedSizeWithTag(3, address.address) + AddressType.ADAPTER.encodedSizeWithTag(2, address.address_type) + protoAdapter.encodedSizeWithTag(1, address.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Address address = (Address) obj;
        address.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = address.customer_token;
        AddressType addressType = address.address_type;
        String str2 = address.address;
        Chain chain = address.chain;
        byteString.getClass();
        return new Address(str, addressType, str2, chain, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Address address = (Address) obj;
        address.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, address.customer_token);
        AddressType.ADAPTER.encodeWithTag(protoWriter, 2, address.address_type);
        protoAdapter.encodeWithTag(protoWriter, 3, address.address);
        Chain.ADAPTER.encodeWithTag(protoWriter, 4, address.chain);
        protoWriter.writeBytes(address.unknownFields());
    }
}
