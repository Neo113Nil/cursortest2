package com.squareup.protos.franklin.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InputtedLegalName$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InputtedLegalName((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        InputtedLegalName inputtedLegalName = (InputtedLegalName) obj;
        reverseProtoWriter.getClass();
        inputtedLegalName.getClass();
        reverseProtoWriter.writeBytes(inputtedLegalName.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, inputtedLegalName.support_article_url_to_change);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, inputtedLegalName.inputted_legal_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InputtedLegalName inputtedLegalName = (InputtedLegalName) obj;
        inputtedLegalName.getClass();
        int size$okio = inputtedLegalName.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, inputtedLegalName.support_article_url_to_change) + protoAdapter.encodedSizeWithTag(1, inputtedLegalName.inputted_legal_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InputtedLegalName inputtedLegalName = (InputtedLegalName) obj;
        inputtedLegalName.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = inputtedLegalName.inputted_legal_name;
        String str2 = inputtedLegalName.support_article_url_to_change;
        byteString.getClass();
        return new InputtedLegalName(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InputtedLegalName inputtedLegalName = (InputtedLegalName) obj;
        inputtedLegalName.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, inputtedLegalName.inputted_legal_name);
        protoAdapter.encodeWithTag(protoWriter, 2, inputtedLegalName.support_article_url_to_change);
        protoWriter.writeBytes(inputtedLegalName.unknownFields());
    }
}
