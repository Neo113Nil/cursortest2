package com.squareup.protos.consentsys.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CopyParameters$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CopyParameters((String) obj, (Integer) obj3, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CopyParameters copyParameters = (CopyParameters) obj;
        reverseProtoWriter.getClass();
        copyParameters.getClass();
        reverseProtoWriter.writeBytes(copyParameters.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, copyParameters.version);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, copyParameters.locale);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, copyParameters.copy_group_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CopyParameters copyParameters = (CopyParameters) obj;
        copyParameters.getClass();
        int size$okio = copyParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(3, copyParameters.version) + protoAdapter.encodedSizeWithTag(2, copyParameters.locale) + protoAdapter.encodedSizeWithTag(1, copyParameters.copy_group_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CopyParameters copyParameters = (CopyParameters) obj;
        copyParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = copyParameters.copy_group_token;
        String str2 = copyParameters.locale;
        Integer num = copyParameters.version;
        byteString.getClass();
        return new CopyParameters(str, num, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CopyParameters copyParameters = (CopyParameters) obj;
        copyParameters.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, copyParameters.copy_group_token);
        protoAdapter.encodeWithTag(protoWriter, 2, copyParameters.locale);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, copyParameters.version);
        protoWriter.writeBytes(copyParameters.unknownFields());
    }
}
