package com.squareup.protos.cash.security.mri.api.v1;

import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSdkWarning;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ThreeDsSdkWarning$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ThreeDsSdkWarning((String) obj, (String) obj2, (ThreeDsSdkWarning.Severity) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = ThreeDsSdkWarning.Severity.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ThreeDsSdkWarning threeDsSdkWarning = (ThreeDsSdkWarning) obj;
        reverseProtoWriter.getClass();
        threeDsSdkWarning.getClass();
        reverseProtoWriter.writeBytes(threeDsSdkWarning.unknownFields());
        ThreeDsSdkWarning.Severity.ADAPTER.encodeWithTag(reverseProtoWriter, 3, threeDsSdkWarning.severity);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, threeDsSdkWarning.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, threeDsSdkWarning.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ThreeDsSdkWarning threeDsSdkWarning = (ThreeDsSdkWarning) obj;
        threeDsSdkWarning.getClass();
        int size$okio = threeDsSdkWarning.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ThreeDsSdkWarning.Severity.ADAPTER.encodedSizeWithTag(3, threeDsSdkWarning.severity) + protoAdapter.encodedSizeWithTag(2, threeDsSdkWarning.message) + protoAdapter.encodedSizeWithTag(1, threeDsSdkWarning.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ThreeDsSdkWarning threeDsSdkWarning = (ThreeDsSdkWarning) obj;
        threeDsSdkWarning.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = threeDsSdkWarning.id;
        String str2 = threeDsSdkWarning.message;
        ThreeDsSdkWarning.Severity severity = threeDsSdkWarning.severity;
        byteString.getClass();
        return new ThreeDsSdkWarning(str, str2, severity, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ThreeDsSdkWarning threeDsSdkWarning = (ThreeDsSdkWarning) obj;
        threeDsSdkWarning.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, threeDsSdkWarning.id);
        protoAdapter.encodeWithTag(protoWriter, 2, threeDsSdkWarning.message);
        ThreeDsSdkWarning.Severity.ADAPTER.encodeWithTag(protoWriter, 3, threeDsSdkWarning.severity);
        protoWriter.writeBytes(threeDsSdkWarning.unknownFields());
    }
}
