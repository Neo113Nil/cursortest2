package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Payer$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Payer((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Payer payer = (Payer) obj;
        reverseProtoWriter.getClass();
        payer.getClass();
        reverseProtoWriter.writeBytes(payer.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, payer.profile_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, payer.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, payer.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, payer.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Payer payer = (Payer) obj;
        payer.getClass();
        int size$okio = payer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, payer.profile_photo_url) + protoAdapter.encodedSizeWithTag(3, payer.display_name) + protoAdapter.encodedSizeWithTag(2, payer.cashtag) + protoAdapter.encodedSizeWithTag(1, payer.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Payer payer = (Payer) obj;
        payer.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = payer.customer_token;
        byteString.getClass();
        return new Payer(str, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Payer payer = (Payer) obj;
        payer.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, payer.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, payer.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 3, payer.display_name);
        protoAdapter.encodeWithTag(protoWriter, 4, payer.profile_photo_url);
        protoWriter.writeBytes(payer.unknownFields());
    }
}
