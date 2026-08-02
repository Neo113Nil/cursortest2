package com.squareup.protos.hieroglyph;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class WrappedKey$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new WrappedKey((KeyScope) obj, (ByteString) obj2, (Long) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = KeyScope.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.UINT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WrappedKey wrappedKey = (WrappedKey) obj;
        reverseProtoWriter.getClass();
        wrappedKey.getClass();
        reverseProtoWriter.writeBytes(wrappedKey.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, wrappedKey.key_ttl_millis);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, wrappedKey.expiration_ts);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, wrappedKey.key_ciphertext);
        KeyScope.ADAPTER.encodeWithTag(reverseProtoWriter, 1, wrappedKey.key_scope);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WrappedKey wrappedKey = (WrappedKey) obj;
        wrappedKey.getClass();
        int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(2, wrappedKey.key_ciphertext) + KeyScope.ADAPTER.encodedSizeWithTag(1, wrappedKey.key_scope) + wrappedKey.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        return protoAdapter.encodedSizeWithTag(4, wrappedKey.key_ttl_millis) + protoAdapter.encodedSizeWithTag(3, wrappedKey.expiration_ts) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WrappedKey wrappedKey = (WrappedKey) obj;
        wrappedKey.getClass();
        ByteString byteString = ByteString.EMPTY;
        KeyScope keyScope = wrappedKey.key_scope;
        ByteString byteString2 = wrappedKey.key_ciphertext;
        Long l = wrappedKey.expiration_ts;
        Long l2 = wrappedKey.key_ttl_millis;
        byteString.getClass();
        return new WrappedKey(keyScope, byteString2, l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WrappedKey wrappedKey = (WrappedKey) obj;
        wrappedKey.getClass();
        KeyScope.ADAPTER.encodeWithTag(protoWriter, 1, wrappedKey.key_scope);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, wrappedKey.key_ciphertext);
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(protoWriter, 3, wrappedKey.expiration_ts);
        protoAdapter.encodeWithTag(protoWriter, 4, wrappedKey.key_ttl_millis);
        protoWriter.writeBytes(wrappedKey.unknownFields());
    }
}
