package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetWalletAddressesError$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetWalletAddressesError((GetWalletAddressesErrorCode) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetWalletAddressesErrorCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetWalletAddressesError getWalletAddressesError = (GetWalletAddressesError) obj;
        reverseProtoWriter.getClass();
        getWalletAddressesError.getClass();
        reverseProtoWriter.writeBytes(getWalletAddressesError.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getWalletAddressesError.message);
        GetWalletAddressesErrorCode.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getWalletAddressesError.code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetWalletAddressesError getWalletAddressesError = (GetWalletAddressesError) obj;
        getWalletAddressesError.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, getWalletAddressesError.message) + GetWalletAddressesErrorCode.ADAPTER.encodedSizeWithTag(1, getWalletAddressesError.code) + getWalletAddressesError.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetWalletAddressesError getWalletAddressesError = (GetWalletAddressesError) obj;
        getWalletAddressesError.getClass();
        ByteString byteString = ByteString.EMPTY;
        GetWalletAddressesErrorCode getWalletAddressesErrorCode = getWalletAddressesError.code;
        String str = getWalletAddressesError.message;
        byteString.getClass();
        return new GetWalletAddressesError(getWalletAddressesErrorCode, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetWalletAddressesError getWalletAddressesError = (GetWalletAddressesError) obj;
        getWalletAddressesError.getClass();
        GetWalletAddressesErrorCode.ADAPTER.encodeWithTag(protoWriter, 1, getWalletAddressesError.code);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getWalletAddressesError.message);
        protoWriter.writeBytes(getWalletAddressesError.unknownFields());
    }
}
