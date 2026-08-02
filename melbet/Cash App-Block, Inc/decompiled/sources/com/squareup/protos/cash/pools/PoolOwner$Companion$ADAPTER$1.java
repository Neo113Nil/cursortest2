package com.squareup.protos.cash.pools;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PoolOwner$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PoolOwner((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PoolOwner poolOwner = (PoolOwner) obj;
        reverseProtoWriter.getClass();
        poolOwner.getClass();
        reverseProtoWriter.writeBytes(poolOwner.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, poolOwner.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, poolOwner.profile_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, poolOwner.full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, poolOwner.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PoolOwner poolOwner = (PoolOwner) obj;
        poolOwner.getClass();
        int size$okio = poolOwner.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, poolOwner.cashtag) + protoAdapter.encodedSizeWithTag(3, poolOwner.profile_photo_url) + protoAdapter.encodedSizeWithTag(2, poolOwner.full_name) + protoAdapter.encodedSizeWithTag(1, poolOwner.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PoolOwner poolOwner = (PoolOwner) obj;
        poolOwner.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = poolOwner.customer_token;
        byteString.getClass();
        return new PoolOwner(str, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PoolOwner poolOwner = (PoolOwner) obj;
        poolOwner.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, poolOwner.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, poolOwner.full_name);
        protoAdapter.encodeWithTag(protoWriter, 3, poolOwner.profile_photo_url);
        protoAdapter.encodeWithTag(protoWriter, 7, poolOwner.cashtag);
        protoWriter.writeBytes(poolOwner.unknownFields());
    }
}
