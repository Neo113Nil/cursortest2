package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetNeighborhoodsTabContentResponse$EnrollmentIncentive$LegalConsentContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent legalConsentContent = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent) obj;
        reverseProtoWriter.getClass();
        legalConsentContent.getClass();
        reverseProtoWriter.writeBytes(legalConsentContent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, legalConsentContent.primary_cta_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, legalConsentContent.primary_cta_button_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, legalConsentContent.fine_print);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, legalConsentContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent legalConsentContent = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent) obj;
        legalConsentContent.getClass();
        int size$okio = legalConsentContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, legalConsentContent.primary_cta_client_route) + protoAdapter.encodedSizeWithTag(3, legalConsentContent.primary_cta_button_label) + protoAdapter.encodedSizeWithTag(2, legalConsentContent.fine_print) + protoAdapter.encodedSizeWithTag(1, legalConsentContent.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent legalConsentContent = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent) obj;
        legalConsentContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = legalConsentContent.title;
        String str2 = legalConsentContent.fine_print;
        String str3 = legalConsentContent.primary_cta_button_label;
        String str4 = legalConsentContent.primary_cta_client_route;
        byteString.getClass();
        return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent legalConsentContent = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent) obj;
        legalConsentContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, legalConsentContent.title);
        protoAdapter.encodeWithTag(protoWriter, 2, legalConsentContent.fine_print);
        protoAdapter.encodeWithTag(protoWriter, 3, legalConsentContent.primary_cta_button_label);
        protoAdapter.encodeWithTag(protoWriter, 4, legalConsentContent.primary_cta_client_route);
        protoWriter.writeBytes(legalConsentContent.unknownFields());
    }
}
