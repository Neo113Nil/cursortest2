package com.squareup.protos.multipass.service;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreateOtkResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOtkResponse((Error) obj, (OneTimeKey) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Error.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(OneTimeKey.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOtkResponse createOtkResponse = (CreateOtkResponse) obj;
        reverseProtoWriter.getClass();
        createOtkResponse.getClass();
        reverseProtoWriter.writeBytes(createOtkResponse.unknownFields());
        OneTimeKey.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createOtkResponse.one_time_key);
        Error.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createOtkResponse.error);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOtkResponse createOtkResponse = (CreateOtkResponse) obj;
        createOtkResponse.getClass();
        return OneTimeKey.ADAPTER.encodedSizeWithTag(2, createOtkResponse.one_time_key) + Error.ADAPTER.encodedSizeWithTag(1, createOtkResponse.error) + createOtkResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOtkResponse createOtkResponse = (CreateOtkResponse) obj;
        createOtkResponse.getClass();
        OneTimeKey oneTimeKey = createOtkResponse.one_time_key;
        OneTimeKey oneTimeKey2 = oneTimeKey != null ? (OneTimeKey) OneTimeKey.ADAPTER.redact(oneTimeKey) : null;
        ByteString byteString = ByteString.EMPTY;
        Error error = createOtkResponse.error;
        byteString.getClass();
        return new CreateOtkResponse(error, oneTimeKey2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOtkResponse createOtkResponse = (CreateOtkResponse) obj;
        createOtkResponse.getClass();
        Error.ADAPTER.encodeWithTag(protoWriter, 1, createOtkResponse.error);
        OneTimeKey.ADAPTER.encodeWithTag(protoWriter, 2, createOtkResponse.one_time_key);
        protoWriter.writeBytes(createOtkResponse.unknownFields());
    }
}
