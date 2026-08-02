package com.squareup.protos.cash.deviceintegritly.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSignedCertificateResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSignedCertificateResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.BYTES.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSignedCertificateResponse getSignedCertificateResponse = (GetSignedCertificateResponse) obj;
        reverseProtoWriter.getClass();
        getSignedCertificateResponse.getClass();
        reverseProtoWriter.writeBytes(getSignedCertificateResponse.unknownFields());
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 1, getSignedCertificateResponse.trifle_certificate_chain);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSignedCertificateResponse getSignedCertificateResponse = (GetSignedCertificateResponse) obj;
        getSignedCertificateResponse.getClass();
        return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(1, getSignedCertificateResponse.trifle_certificate_chain) + getSignedCertificateResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSignedCertificateResponse getSignedCertificateResponse = (GetSignedCertificateResponse) obj;
        getSignedCertificateResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = getSignedCertificateResponse.trifle_certificate_chain;
        list.getClass();
        byteString.getClass();
        return new GetSignedCertificateResponse(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSignedCertificateResponse getSignedCertificateResponse = (GetSignedCertificateResponse) obj;
        getSignedCertificateResponse.getClass();
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 1, getSignedCertificateResponse.trifle_certificate_chain);
        protoWriter.writeBytes(getSignedCertificateResponse.unknownFields());
    }
}
