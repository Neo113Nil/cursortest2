package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PlaidLinkTokenCreateResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PlaidLinkTokenCreateResponse((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        PlaidLinkTokenCreateResponse plaidLinkTokenCreateResponse = (PlaidLinkTokenCreateResponse) obj;
        reverseProtoWriter.getClass();
        plaidLinkTokenCreateResponse.getClass();
        reverseProtoWriter.writeBytes(plaidLinkTokenCreateResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, plaidLinkTokenCreateResponse.request_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, plaidLinkTokenCreateResponse.expiration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, plaidLinkTokenCreateResponse.link_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PlaidLinkTokenCreateResponse plaidLinkTokenCreateResponse = (PlaidLinkTokenCreateResponse) obj;
        plaidLinkTokenCreateResponse.getClass();
        int size$okio = plaidLinkTokenCreateResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, plaidLinkTokenCreateResponse.request_id) + protoAdapter.encodedSizeWithTag(2, plaidLinkTokenCreateResponse.expiration) + protoAdapter.encodedSizeWithTag(1, plaidLinkTokenCreateResponse.link_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PlaidLinkTokenCreateResponse plaidLinkTokenCreateResponse = (PlaidLinkTokenCreateResponse) obj;
        plaidLinkTokenCreateResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = plaidLinkTokenCreateResponse.link_token;
        String str2 = plaidLinkTokenCreateResponse.expiration;
        String str3 = plaidLinkTokenCreateResponse.request_id;
        byteString.getClass();
        return new PlaidLinkTokenCreateResponse(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PlaidLinkTokenCreateResponse plaidLinkTokenCreateResponse = (PlaidLinkTokenCreateResponse) obj;
        plaidLinkTokenCreateResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, plaidLinkTokenCreateResponse.link_token);
        protoAdapter.encodeWithTag(protoWriter, 2, plaidLinkTokenCreateResponse.expiration);
        protoAdapter.encodeWithTag(protoWriter, 3, plaidLinkTokenCreateResponse.request_id);
        protoWriter.writeBytes(plaidLinkTokenCreateResponse.unknownFields());
    }
}
