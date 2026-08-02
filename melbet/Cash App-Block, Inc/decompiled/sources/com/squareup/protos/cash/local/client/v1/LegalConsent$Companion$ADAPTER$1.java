package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LegalConsent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LegalConsent((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LegalConsent legalConsent = (LegalConsent) obj;
        reverseProtoWriter.getClass();
        legalConsent.getClass();
        reverseProtoWriter.writeBytes(legalConsent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, legalConsent.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, legalConsent.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, legalConsent.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LegalConsent legalConsent = (LegalConsent) obj;
        legalConsent.getClass();
        int size$okio = legalConsent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, legalConsent.title) + protoAdapter.encodedSizeWithTag(2, legalConsent.text) + protoAdapter.encodedSizeWithTag(1, legalConsent.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LegalConsent legalConsent = (LegalConsent) obj;
        legalConsent.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = legalConsent.token;
        String str2 = legalConsent.text;
        String str3 = legalConsent.title;
        byteString.getClass();
        return new LegalConsent(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LegalConsent legalConsent = (LegalConsent) obj;
        legalConsent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, legalConsent.token);
        protoAdapter.encodeWithTag(protoWriter, 2, legalConsent.text);
        protoAdapter.encodeWithTag(protoWriter, 3, legalConsent.title);
        protoWriter.writeBytes(legalConsent.unknownFields());
    }
}
