package com.squareup.protos.common.signing;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AndroidKeyStoreException$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AndroidKeyStoreException((Integer) obj, (Integer) obj2, (Boolean) obj3, (Boolean) obj4, (Integer) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AndroidKeyStoreException androidKeyStoreException = (AndroidKeyStoreException) obj;
        reverseProtoWriter.getClass();
        androidKeyStoreException.getClass();
        reverseProtoWriter.writeBytes(androidKeyStoreException.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, androidKeyStoreException.requires_user_authentication);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, androidKeyStoreException.retry_policy);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, androidKeyStoreException.is_transient_failure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, androidKeyStoreException.is_system_error);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, androidKeyStoreException.internal_error_code);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, androidKeyStoreException.public_error_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AndroidKeyStoreException androidKeyStoreException = (AndroidKeyStoreException) obj;
        androidKeyStoreException.getClass();
        int size$okio = androidKeyStoreException.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, androidKeyStoreException.internal_error_code) + protoAdapter.encodedSizeWithTag(1, androidKeyStoreException.public_error_code) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(6, androidKeyStoreException.requires_user_authentication) + protoAdapter.encodedSizeWithTag(5, androidKeyStoreException.retry_policy) + protoAdapter2.encodedSizeWithTag(4, androidKeyStoreException.is_transient_failure) + protoAdapter2.encodedSizeWithTag(3, androidKeyStoreException.is_system_error) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AndroidKeyStoreException androidKeyStoreException = (AndroidKeyStoreException) obj;
        androidKeyStoreException.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = androidKeyStoreException.public_error_code;
        Integer num2 = androidKeyStoreException.internal_error_code;
        Boolean bool = androidKeyStoreException.is_system_error;
        Boolean bool2 = androidKeyStoreException.is_transient_failure;
        Integer num3 = androidKeyStoreException.retry_policy;
        Boolean bool3 = androidKeyStoreException.requires_user_authentication;
        byteString.getClass();
        return new AndroidKeyStoreException(num, num2, bool, bool2, num3, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AndroidKeyStoreException androidKeyStoreException = (AndroidKeyStoreException) obj;
        androidKeyStoreException.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, androidKeyStoreException.public_error_code);
        protoAdapter.encodeWithTag(protoWriter, 2, androidKeyStoreException.internal_error_code);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, androidKeyStoreException.is_system_error);
        protoAdapter2.encodeWithTag(protoWriter, 4, androidKeyStoreException.is_transient_failure);
        protoAdapter.encodeWithTag(protoWriter, 5, androidKeyStoreException.retry_policy);
        protoAdapter2.encodeWithTag(protoWriter, 6, androidKeyStoreException.requires_user_authentication);
        protoWriter.writeBytes(androidKeyStoreException.unknownFields());
    }
}
