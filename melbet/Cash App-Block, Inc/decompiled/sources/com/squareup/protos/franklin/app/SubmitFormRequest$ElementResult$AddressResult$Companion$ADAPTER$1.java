package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$AddressResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.AddressResult((GlobalAddress) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult.AddressResult addressResult = (SubmitFormRequest.ElementResult.AddressResult) obj;
        reverseProtoWriter.getClass();
        addressResult.getClass();
        reverseProtoWriter.writeBytes(addressResult.unknownFields());
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addressResult.address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.AddressResult addressResult = (SubmitFormRequest.ElementResult.AddressResult) obj;
        addressResult.getClass();
        return GlobalAddress.ADAPTER.encodedSizeWithTag(1, addressResult.address) + addressResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFormRequest.ElementResult.AddressResult addressResult = (SubmitFormRequest.ElementResult.AddressResult) obj;
        addressResult.getClass();
        GlobalAddress globalAddress = addressResult.address;
        GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.AddressResult(globalAddress2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.AddressResult addressResult = (SubmitFormRequest.ElementResult.AddressResult) obj;
        addressResult.getClass();
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 1, addressResult.address);
        protoWriter.writeBytes(addressResult.unknownFields());
    }
}
