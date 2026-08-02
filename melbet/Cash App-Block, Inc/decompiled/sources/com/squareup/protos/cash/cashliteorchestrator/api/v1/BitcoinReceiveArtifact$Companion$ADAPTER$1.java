package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BitcoinReceiveArtifact$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BitcoinReceiveArtifact((String) obj, (String) obj2, (BitcoinAddressState) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = BitcoinAddressState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinReceiveArtifact bitcoinReceiveArtifact = (BitcoinReceiveArtifact) obj;
        reverseProtoWriter.getClass();
        bitcoinReceiveArtifact.getClass();
        reverseProtoWriter.writeBytes(bitcoinReceiveArtifact.unknownFields());
        BitcoinAddressState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bitcoinReceiveArtifact.state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bitcoinReceiveArtifact.address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bitcoinReceiveArtifact.deposit_address_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinReceiveArtifact bitcoinReceiveArtifact = (BitcoinReceiveArtifact) obj;
        bitcoinReceiveArtifact.getClass();
        int size$okio = bitcoinReceiveArtifact.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return BitcoinAddressState.ADAPTER.encodedSizeWithTag(3, bitcoinReceiveArtifact.state) + protoAdapter.encodedSizeWithTag(2, bitcoinReceiveArtifact.address) + protoAdapter.encodedSizeWithTag(1, bitcoinReceiveArtifact.deposit_address_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinReceiveArtifact bitcoinReceiveArtifact = (BitcoinReceiveArtifact) obj;
        bitcoinReceiveArtifact.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = bitcoinReceiveArtifact.deposit_address_id;
        String str2 = bitcoinReceiveArtifact.address;
        BitcoinAddressState bitcoinAddressState = bitcoinReceiveArtifact.state;
        byteString.getClass();
        return new BitcoinReceiveArtifact(str, str2, bitcoinAddressState, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinReceiveArtifact bitcoinReceiveArtifact = (BitcoinReceiveArtifact) obj;
        bitcoinReceiveArtifact.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bitcoinReceiveArtifact.deposit_address_id);
        protoAdapter.encodeWithTag(protoWriter, 2, bitcoinReceiveArtifact.address);
        BitcoinAddressState.ADAPTER.encodeWithTag(protoWriter, 3, bitcoinReceiveArtifact.state);
        protoWriter.writeBytes(bitcoinReceiveArtifact.unknownFields());
    }
}
