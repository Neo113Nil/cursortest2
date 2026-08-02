package com.squareup.protos.cash.cryptocurrency;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Wallet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Wallet((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Wallet wallet = (Wallet) obj;
        reverseProtoWriter.getClass();
        wallet.getClass();
        reverseProtoWriter.writeBytes(wallet.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, wallet.address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Wallet wallet = (Wallet) obj;
        wallet.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, wallet.address) + wallet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Wallet wallet = (Wallet) obj;
        wallet.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = wallet.address;
        byteString.getClass();
        return new Wallet(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Wallet wallet = (Wallet) obj;
        wallet.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, wallet.address);
        protoWriter.writeBytes(wallet.unknownFields());
    }
}
