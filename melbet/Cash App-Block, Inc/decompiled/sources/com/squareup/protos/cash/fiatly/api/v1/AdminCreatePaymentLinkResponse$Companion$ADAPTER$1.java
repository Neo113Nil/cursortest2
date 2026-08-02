package com.squareup.protos.cash.fiatly.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AdminCreatePaymentLinkResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AdminCreatePaymentLinkResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AdminCreatePaymentLinkResponse adminCreatePaymentLinkResponse = (AdminCreatePaymentLinkResponse) obj;
        reverseProtoWriter.getClass();
        adminCreatePaymentLinkResponse.getClass();
        reverseProtoWriter.writeBytes(adminCreatePaymentLinkResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, adminCreatePaymentLinkResponse.link_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AdminCreatePaymentLinkResponse adminCreatePaymentLinkResponse = (AdminCreatePaymentLinkResponse) obj;
        adminCreatePaymentLinkResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, adminCreatePaymentLinkResponse.link_url) + adminCreatePaymentLinkResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AdminCreatePaymentLinkResponse adminCreatePaymentLinkResponse = (AdminCreatePaymentLinkResponse) obj;
        adminCreatePaymentLinkResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = adminCreatePaymentLinkResponse.link_url;
        byteString.getClass();
        return new AdminCreatePaymentLinkResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AdminCreatePaymentLinkResponse adminCreatePaymentLinkResponse = (AdminCreatePaymentLinkResponse) obj;
        adminCreatePaymentLinkResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, adminCreatePaymentLinkResponse.link_url);
        protoWriter.writeBytes(adminCreatePaymentLinkResponse.unknownFields());
    }
}
