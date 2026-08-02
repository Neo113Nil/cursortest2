package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TextInputSpec$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TextInputSpec((Integer) obj4, (String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextInputSpec textInputSpec = (TextInputSpec) obj;
        reverseProtoWriter.getClass();
        textInputSpec.getClass();
        reverseProtoWriter.writeBytes(textInputSpec.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, textInputSpec.max_length);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, textInputSpec.prefilled_value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, textInputSpec.placeholder);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, textInputSpec.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextInputSpec textInputSpec = (TextInputSpec) obj;
        textInputSpec.getClass();
        int size$okio = textInputSpec.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(4, textInputSpec.max_length) + protoAdapter.encodedSizeWithTag(3, textInputSpec.prefilled_value) + protoAdapter.encodedSizeWithTag(2, textInputSpec.placeholder) + protoAdapter.encodedSizeWithTag(1, textInputSpec.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextInputSpec textInputSpec = (TextInputSpec) obj;
        textInputSpec.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = textInputSpec.label;
        String str2 = textInputSpec.placeholder;
        String str3 = textInputSpec.prefilled_value;
        Integer num = textInputSpec.max_length;
        byteString.getClass();
        return new TextInputSpec(num, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextInputSpec textInputSpec = (TextInputSpec) obj;
        textInputSpec.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, textInputSpec.label);
        protoAdapter.encodeWithTag(protoWriter, 2, textInputSpec.placeholder);
        protoAdapter.encodeWithTag(protoWriter, 3, textInputSpec.prefilled_value);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, textInputSpec.max_length);
        protoWriter.writeBytes(textInputSpec.unknownFields());
    }
}
