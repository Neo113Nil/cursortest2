package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class WalletAddress$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WalletAddress((String) obj, (String) obj2, (String) obj3, (WalletAddressChain) obj4, (WalletAddressAsset) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(WalletAddressChain.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(WalletAddressAsset.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WalletAddress walletAddress = (WalletAddress) obj;
        reverseProtoWriter.getClass();
        walletAddress.getClass();
        reverseProtoWriter.writeBytes(walletAddress.unknownFields());
        WalletAddressAsset.ADAPTER.encodeWithTag(reverseProtoWriter, 5, walletAddress.asset);
        WalletAddressChain.ADAPTER.encodeWithTag(reverseProtoWriter, 4, walletAddress.chain);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, walletAddress.qr_code_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, walletAddress.truncated_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, walletAddress.address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WalletAddress walletAddress = (WalletAddress) obj;
        walletAddress.getClass();
        int size$okio = walletAddress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return WalletAddressAsset.ADAPTER.encodedSizeWithTag(5, walletAddress.asset) + WalletAddressChain.ADAPTER.encodedSizeWithTag(4, walletAddress.chain) + protoAdapter.encodedSizeWithTag(3, walletAddress.qr_code_url) + protoAdapter.encodedSizeWithTag(2, walletAddress.truncated_address) + protoAdapter.encodedSizeWithTag(1, walletAddress.address) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WalletAddress walletAddress = (WalletAddress) obj;
        walletAddress.getClass();
        WalletAddressChain walletAddressChain = walletAddress.chain;
        WalletAddressChain walletAddressChain2 = walletAddressChain != null ? (WalletAddressChain) WalletAddressChain.ADAPTER.redact(walletAddressChain) : null;
        WalletAddressAsset walletAddressAsset = walletAddress.asset;
        WalletAddressAsset walletAddressAsset2 = walletAddressAsset != null ? (WalletAddressAsset) WalletAddressAsset.ADAPTER.redact(walletAddressAsset) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = walletAddress.address;
        String str2 = walletAddress.truncated_address;
        String str3 = walletAddress.qr_code_url;
        byteString.getClass();
        return new WalletAddress(str, str2, str3, walletAddressChain2, walletAddressAsset2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WalletAddress walletAddress = (WalletAddress) obj;
        walletAddress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, walletAddress.address);
        protoAdapter.encodeWithTag(protoWriter, 2, walletAddress.truncated_address);
        protoAdapter.encodeWithTag(protoWriter, 3, walletAddress.qr_code_url);
        WalletAddressChain.ADAPTER.encodeWithTag(protoWriter, 4, walletAddress.chain);
        WalletAddressAsset.ADAPTER.encodeWithTag(protoWriter, 5, walletAddress.asset);
        protoWriter.writeBytes(walletAddress.unknownFields());
    }
}
