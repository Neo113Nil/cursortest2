package com.squareup.protos.common.signing;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AttestedKeyClientError$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AttestedKeyClientError((String) obj, (String) obj2, (String) obj3, (AndroidKeyStoreException) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 10) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(AndroidKeyStoreException.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AttestedKeyClientError attestedKeyClientError = (AttestedKeyClientError) obj;
        reverseProtoWriter.getClass();
        attestedKeyClientError.getClass();
        reverseProtoWriter.writeBytes(attestedKeyClientError.unknownFields());
        AndroidKeyStoreException.ADAPTER.encodeWithTag(reverseProtoWriter, 10, attestedKeyClientError.key_store_exception);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, attestedKeyClientError.stack_trace);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, attestedKeyClientError.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, attestedKeyClientError.exception_class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AttestedKeyClientError attestedKeyClientError = (AttestedKeyClientError) obj;
        attestedKeyClientError.getClass();
        int size$okio = attestedKeyClientError.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return AndroidKeyStoreException.ADAPTER.encodedSizeWithTag(10, attestedKeyClientError.key_store_exception) + protoAdapter.encodedSizeWithTag(3, attestedKeyClientError.stack_trace) + protoAdapter.encodedSizeWithTag(2, attestedKeyClientError.message) + protoAdapter.encodedSizeWithTag(1, attestedKeyClientError.exception_class) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AttestedKeyClientError attestedKeyClientError = (AttestedKeyClientError) obj;
        attestedKeyClientError.getClass();
        AndroidKeyStoreException androidKeyStoreException = attestedKeyClientError.key_store_exception;
        AndroidKeyStoreException androidKeyStoreException2 = androidKeyStoreException != null ? (AndroidKeyStoreException) AndroidKeyStoreException.ADAPTER.redact(androidKeyStoreException) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = attestedKeyClientError.exception_class;
        String str2 = attestedKeyClientError.message;
        String str3 = attestedKeyClientError.stack_trace;
        byteString.getClass();
        return new AttestedKeyClientError(str, str2, str3, androidKeyStoreException2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AttestedKeyClientError attestedKeyClientError = (AttestedKeyClientError) obj;
        attestedKeyClientError.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, attestedKeyClientError.exception_class);
        protoAdapter.encodeWithTag(protoWriter, 2, attestedKeyClientError.message);
        protoAdapter.encodeWithTag(protoWriter, 3, attestedKeyClientError.stack_trace);
        AndroidKeyStoreException.ADAPTER.encodeWithTag(protoWriter, 10, attestedKeyClientError.key_store_exception);
        protoWriter.writeBytes(attestedKeyClientError.unknownFields());
    }
}
