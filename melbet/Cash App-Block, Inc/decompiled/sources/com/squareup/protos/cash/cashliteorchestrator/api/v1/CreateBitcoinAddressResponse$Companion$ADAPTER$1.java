package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateBitcoinAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateBitcoinAddressResponse((String) obj, (BitcoinReceiveArtifact) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BitcoinReceiveArtifact.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateBitcoinAddressResponse createBitcoinAddressResponse = (CreateBitcoinAddressResponse) obj;
        reverseProtoWriter.getClass();
        createBitcoinAddressResponse.getClass();
        reverseProtoWriter.writeBytes(createBitcoinAddressResponse.unknownFields());
        BitcoinReceiveArtifact.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createBitcoinAddressResponse.bitcoin);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, createBitcoinAddressResponse.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateBitcoinAddressResponse createBitcoinAddressResponse = (CreateBitcoinAddressResponse) obj;
        createBitcoinAddressResponse.getClass();
        return BitcoinReceiveArtifact.ADAPTER.encodedSizeWithTag(2, createBitcoinAddressResponse.bitcoin) + ProtoAdapter.STRING.encodedSizeWithTag(1, createBitcoinAddressResponse.customer_token) + createBitcoinAddressResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateBitcoinAddressResponse createBitcoinAddressResponse = (CreateBitcoinAddressResponse) obj;
        createBitcoinAddressResponse.getClass();
        BitcoinReceiveArtifact bitcoinReceiveArtifact = createBitcoinAddressResponse.bitcoin;
        BitcoinReceiveArtifact bitcoinReceiveArtifact2 = bitcoinReceiveArtifact != null ? (BitcoinReceiveArtifact) BitcoinReceiveArtifact.ADAPTER.redact(bitcoinReceiveArtifact) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = createBitcoinAddressResponse.customer_token;
        byteString.getClass();
        return new CreateBitcoinAddressResponse(str, bitcoinReceiveArtifact2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateBitcoinAddressResponse createBitcoinAddressResponse = (CreateBitcoinAddressResponse) obj;
        createBitcoinAddressResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createBitcoinAddressResponse.customer_token);
        BitcoinReceiveArtifact.ADAPTER.encodeWithTag(protoWriter, 2, createBitcoinAddressResponse.bitcoin);
        protoWriter.writeBytes(createBitcoinAddressResponse.unknownFields());
    }
}
