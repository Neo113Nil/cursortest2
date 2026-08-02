package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AcceptedLanguageDisclosure$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AcceptedLanguageDisclosure((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AcceptedLanguageDisclosure acceptedLanguageDisclosure = (AcceptedLanguageDisclosure) obj;
        reverseProtoWriter.getClass();
        acceptedLanguageDisclosure.getClass();
        reverseProtoWriter.writeBytes(acceptedLanguageDisclosure.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, acceptedLanguageDisclosure.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, acceptedLanguageDisclosure.locale);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AcceptedLanguageDisclosure acceptedLanguageDisclosure = (AcceptedLanguageDisclosure) obj;
        acceptedLanguageDisclosure.getClass();
        int size$okio = acceptedLanguageDisclosure.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, acceptedLanguageDisclosure.version) + protoAdapter.encodedSizeWithTag(1, acceptedLanguageDisclosure.locale) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AcceptedLanguageDisclosure acceptedLanguageDisclosure = (AcceptedLanguageDisclosure) obj;
        acceptedLanguageDisclosure.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = acceptedLanguageDisclosure.locale;
        String str2 = acceptedLanguageDisclosure.version;
        byteString.getClass();
        return new AcceptedLanguageDisclosure(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AcceptedLanguageDisclosure acceptedLanguageDisclosure = (AcceptedLanguageDisclosure) obj;
        acceptedLanguageDisclosure.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, acceptedLanguageDisclosure.locale);
        protoAdapter.encodeWithTag(protoWriter, 2, acceptedLanguageDisclosure.version);
        protoWriter.writeBytes(acceptedLanguageDisclosure.unknownFields());
    }
}
