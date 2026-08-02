package com.squareup.protos.cash.contacts.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LabeledString$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LabeledString((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LabeledString labeledString = (LabeledString) obj;
        reverseProtoWriter.getClass();
        labeledString.getClass();
        reverseProtoWriter.writeBytes(labeledString.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, labeledString.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, labeledString.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LabeledString labeledString = (LabeledString) obj;
        labeledString.getClass();
        int size$okio = labeledString.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, labeledString.value) + protoAdapter.encodedSizeWithTag(1, labeledString.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LabeledString labeledString = (LabeledString) obj;
        labeledString.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = labeledString.label;
        String str2 = labeledString.value;
        byteString.getClass();
        return new LabeledString(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LabeledString labeledString = (LabeledString) obj;
        labeledString.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, labeledString.label);
        protoAdapter.encodeWithTag(protoWriter, 2, labeledString.value);
        protoWriter.writeBytes(labeledString.unknownFields());
    }
}
