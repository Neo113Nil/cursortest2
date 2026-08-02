package com.squareup.protos.cash.favorites;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Favorite$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Favorite((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Favorite favorite = (Favorite) obj;
        reverseProtoWriter.getClass();
        favorite.getClass();
        reverseProtoWriter.writeBytes(favorite.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, favorite.favorite_customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Favorite favorite = (Favorite) obj;
        favorite.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, favorite.favorite_customer_token) + favorite.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Favorite favorite = (Favorite) obj;
        favorite.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = favorite.favorite_customer_token;
        byteString.getClass();
        return new Favorite(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Favorite favorite = (Favorite) obj;
        favorite.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, favorite.favorite_customer_token);
        protoWriter.writeBytes(favorite.unknownFields());
    }
}
