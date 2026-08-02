package com.squareup.protos.cash.contacts.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InstantMessageAddress$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InstantMessageAddress((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        InstantMessageAddress instantMessageAddress = (InstantMessageAddress) obj;
        reverseProtoWriter.getClass();
        instantMessageAddress.getClass();
        reverseProtoWriter.writeBytes(instantMessageAddress.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, instantMessageAddress.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, instantMessageAddress.username);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, instantMessageAddress.service);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstantMessageAddress instantMessageAddress = (InstantMessageAddress) obj;
        instantMessageAddress.getClass();
        int size$okio = instantMessageAddress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, instantMessageAddress.label) + protoAdapter.encodedSizeWithTag(2, instantMessageAddress.username) + protoAdapter.encodedSizeWithTag(1, instantMessageAddress.service) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstantMessageAddress instantMessageAddress = (InstantMessageAddress) obj;
        instantMessageAddress.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = instantMessageAddress.service;
        String str2 = instantMessageAddress.username;
        String str3 = instantMessageAddress.label;
        byteString.getClass();
        return new InstantMessageAddress(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstantMessageAddress instantMessageAddress = (InstantMessageAddress) obj;
        instantMessageAddress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, instantMessageAddress.service);
        protoAdapter.encodeWithTag(protoWriter, 2, instantMessageAddress.username);
        protoAdapter.encodeWithTag(protoWriter, 3, instantMessageAddress.label);
        protoWriter.writeBytes(instantMessageAddress.unknownFields());
    }
}
