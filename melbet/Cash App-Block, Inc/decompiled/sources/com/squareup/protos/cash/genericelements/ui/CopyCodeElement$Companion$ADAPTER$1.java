package com.squareup.protos.cash.genericelements.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CopyCodeElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CopyCodeElement((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        CopyCodeElement copyCodeElement = (CopyCodeElement) obj;
        reverseProtoWriter.getClass();
        copyCodeElement.getClass();
        reverseProtoWriter.writeBytes(copyCodeElement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, copyCodeElement.content_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, copyCodeElement.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, copyCodeElement.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CopyCodeElement copyCodeElement = (CopyCodeElement) obj;
        copyCodeElement.getClass();
        int size$okio = copyCodeElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, copyCodeElement.content_description) + protoAdapter.encodedSizeWithTag(2, copyCodeElement.body) + protoAdapter.encodedSizeWithTag(1, copyCodeElement.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CopyCodeElement copyCodeElement = (CopyCodeElement) obj;
        copyCodeElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = copyCodeElement.label;
        String str2 = copyCodeElement.body;
        String str3 = copyCodeElement.content_description;
        byteString.getClass();
        return new CopyCodeElement(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CopyCodeElement copyCodeElement = (CopyCodeElement) obj;
        copyCodeElement.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, copyCodeElement.label);
        protoAdapter.encodeWithTag(protoWriter, 2, copyCodeElement.body);
        protoAdapter.encodeWithTag(protoWriter, 3, copyCodeElement.content_description);
        protoWriter.writeBytes(copyCodeElement.unknownFields());
    }
}
