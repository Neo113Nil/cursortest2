package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddressInputSpec$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddressInputSpec(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddressInputSpec addressInputSpec = (AddressInputSpec) obj;
        reverseProtoWriter.getClass();
        addressInputSpec.getClass();
        reverseProtoWriter.writeBytes(addressInputSpec.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddressInputSpec addressInputSpec = (AddressInputSpec) obj;
        addressInputSpec.getClass();
        return addressInputSpec.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((AddressInputSpec) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AddressInputSpec(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddressInputSpec addressInputSpec = (AddressInputSpec) obj;
        addressInputSpec.getClass();
        protoWriter.writeBytes(addressInputSpec.unknownFields());
    }
}
