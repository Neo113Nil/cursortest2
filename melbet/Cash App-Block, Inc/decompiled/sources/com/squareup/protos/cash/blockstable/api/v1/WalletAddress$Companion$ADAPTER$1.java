package com.squareup.protos.cash.blockstable.api.v1;

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
                return new WalletAddress((String) obj, (String) obj2, (String) obj3, (Chain) obj4, (Asset) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 9) {
                obj4 = TransactorKt.decodeMessageOrMerge(Chain.ADAPTER, protoReader, obj4);
            } else if (nextTag != 10) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Asset.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WalletAddress walletAddress = (WalletAddress) obj;
        reverseProtoWriter.getClass();
        walletAddress.getClass();
        reverseProtoWriter.writeBytes(walletAddress.unknownFields());
        Asset.ADAPTER.encodeWithTag(reverseProtoWriter, 10, walletAddress.asset);
        Chain.ADAPTER.encodeWithTag(reverseProtoWriter, 9, walletAddress.chain);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, walletAddress.qr_code_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, walletAddress.truncated_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, walletAddress.address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WalletAddress walletAddress = (WalletAddress) obj;
        walletAddress.getClass();
        int size$okio = walletAddress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Asset.ADAPTER.encodedSizeWithTag(10, walletAddress.asset) + Chain.ADAPTER.encodedSizeWithTag(9, walletAddress.chain) + protoAdapter.encodedSizeWithTag(4, walletAddress.qr_code_url) + protoAdapter.encodedSizeWithTag(2, walletAddress.truncated_address) + protoAdapter.encodedSizeWithTag(1, walletAddress.address) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WalletAddress walletAddress = (WalletAddress) obj;
        walletAddress.getClass();
        Chain chain = walletAddress.chain;
        Chain chain2 = chain != null ? (Chain) Chain.ADAPTER.redact(chain) : null;
        Asset asset = walletAddress.asset;
        Asset asset2 = asset != null ? (Asset) Asset.ADAPTER.redact(asset) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = walletAddress.address;
        String str2 = walletAddress.truncated_address;
        String str3 = walletAddress.qr_code_url;
        byteString.getClass();
        return new WalletAddress(str, str2, str3, chain2, asset2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WalletAddress walletAddress = (WalletAddress) obj;
        walletAddress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, walletAddress.address);
        protoAdapter.encodeWithTag(protoWriter, 2, walletAddress.truncated_address);
        protoAdapter.encodeWithTag(protoWriter, 4, walletAddress.qr_code_url);
        Chain.ADAPTER.encodeWithTag(protoWriter, 9, walletAddress.chain);
        Asset.ADAPTER.encodeWithTag(protoWriter, 10, walletAddress.asset);
        protoWriter.writeBytes(walletAddress.unknownFields());
    }
}
