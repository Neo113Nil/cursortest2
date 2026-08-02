package com.squareup.protos.cash.customersearch.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ClientCandidate$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ClientCandidate((String) obj, (Boolean) obj2, (Long) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientCandidate clientCandidate = (ClientCandidate) obj;
        reverseProtoWriter.getClass();
        clientCandidate.getClass();
        reverseProtoWriter.writeBytes(clientCandidate.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, clientCandidate.is_contact);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, clientCandidate.previously_paid_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientCandidate.is_favorite);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, clientCandidate.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientCandidate clientCandidate = (ClientCandidate) obj;
        clientCandidate.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, clientCandidate.customer_token) + clientCandidate.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(4, clientCandidate.is_contact) + ProtoAdapter.INT64.encodedSizeWithTag(3, clientCandidate.previously_paid_at) + protoAdapter.encodedSizeWithTag(2, clientCandidate.is_favorite) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientCandidate clientCandidate = (ClientCandidate) obj;
        clientCandidate.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientCandidate.customer_token;
        Boolean bool = clientCandidate.is_favorite;
        Long l = clientCandidate.previously_paid_at;
        Boolean bool2 = clientCandidate.is_contact;
        byteString.getClass();
        return new ClientCandidate(str, bool, l, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientCandidate clientCandidate = (ClientCandidate) obj;
        clientCandidate.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clientCandidate.customer_token);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, clientCandidate.is_favorite);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, clientCandidate.previously_paid_at);
        protoAdapter.encodeWithTag(protoWriter, 4, clientCandidate.is_contact);
        protoWriter.writeBytes(clientCandidate.unknownFields());
    }
}
