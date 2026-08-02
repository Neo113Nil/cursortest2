package com.squareup.protos.hieroglyph;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PublicKeyConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PublicKeyConfig((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PublicKeyConfig publicKeyConfig = (PublicKeyConfig) obj;
        reverseProtoWriter.getClass();
        publicKeyConfig.getClass();
        reverseProtoWriter.writeBytes(publicKeyConfig.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, publicKeyConfig.size_bits);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PublicKeyConfig publicKeyConfig = (PublicKeyConfig) obj;
        publicKeyConfig.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, publicKeyConfig.size_bits) + publicKeyConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PublicKeyConfig publicKeyConfig = (PublicKeyConfig) obj;
        publicKeyConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = publicKeyConfig.size_bits;
        byteString.getClass();
        return new PublicKeyConfig(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PublicKeyConfig publicKeyConfig = (PublicKeyConfig) obj;
        publicKeyConfig.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, publicKeyConfig.size_bits);
        protoWriter.writeBytes(publicKeyConfig.unknownFields());
    }
}
