package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.CheckVersionResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CheckVersionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CheckVersionResponse((CheckVersionResponse.Status) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CheckVersionResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CheckVersionResponse checkVersionResponse = (CheckVersionResponse) obj;
        reverseProtoWriter.getClass();
        checkVersionResponse.getClass();
        reverseProtoWriter.writeBytes(checkVersionResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, checkVersionResponse.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, checkVersionResponse.message);
        CheckVersionResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, checkVersionResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CheckVersionResponse checkVersionResponse = (CheckVersionResponse) obj;
        checkVersionResponse.getClass();
        int encodedSizeWithTag = CheckVersionResponse.Status.ADAPTER.encodedSizeWithTag(1, checkVersionResponse.status) + checkVersionResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, checkVersionResponse.title) + protoAdapter.encodedSizeWithTag(2, checkVersionResponse.message) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CheckVersionResponse checkVersionResponse = (CheckVersionResponse) obj;
        checkVersionResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        CheckVersionResponse.Status status = checkVersionResponse.status;
        String str = checkVersionResponse.message;
        String str2 = checkVersionResponse.title;
        byteString.getClass();
        return new CheckVersionResponse(status, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CheckVersionResponse checkVersionResponse = (CheckVersionResponse) obj;
        checkVersionResponse.getClass();
        CheckVersionResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, checkVersionResponse.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, checkVersionResponse.message);
        protoAdapter.encodeWithTag(protoWriter, 3, checkVersionResponse.title);
        protoWriter.writeBytes(checkVersionResponse.unknownFields());
    }
}
