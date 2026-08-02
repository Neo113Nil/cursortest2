package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetLocaleConsentAcceptanceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetLocaleConsentAcceptanceResponse(m, (LanguageDisclosure) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LanguageDisclosure.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LanguageDisclosure.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetLocaleConsentAcceptanceResponse getLocaleConsentAcceptanceResponse = (GetLocaleConsentAcceptanceResponse) obj;
        reverseProtoWriter.getClass();
        getLocaleConsentAcceptanceResponse.getClass();
        reverseProtoWriter.writeBytes(getLocaleConsentAcceptanceResponse.unknownFields());
        ProtoAdapter protoAdapter = LanguageDisclosure.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getLocaleConsentAcceptanceResponse.language_disclosure);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, getLocaleConsentAcceptanceResponse.language_disclosures);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetLocaleConsentAcceptanceResponse getLocaleConsentAcceptanceResponse = (GetLocaleConsentAcceptanceResponse) obj;
        getLocaleConsentAcceptanceResponse.getClass();
        int size$okio = getLocaleConsentAcceptanceResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LanguageDisclosure.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, getLocaleConsentAcceptanceResponse.language_disclosure) + protoAdapter.asRepeated().encodedSizeWithTag(1, getLocaleConsentAcceptanceResponse.language_disclosures) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetLocaleConsentAcceptanceResponse getLocaleConsentAcceptanceResponse = (GetLocaleConsentAcceptanceResponse) obj;
        getLocaleConsentAcceptanceResponse.getClass();
        List list = getLocaleConsentAcceptanceResponse.language_disclosures;
        ProtoAdapter protoAdapter = LanguageDisclosure.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        LanguageDisclosure languageDisclosure = getLocaleConsentAcceptanceResponse.language_disclosure;
        LanguageDisclosure languageDisclosure2 = languageDisclosure != null ? (LanguageDisclosure) protoAdapter.redact(languageDisclosure) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetLocaleConsentAcceptanceResponse(m1169redactElements, languageDisclosure2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetLocaleConsentAcceptanceResponse getLocaleConsentAcceptanceResponse = (GetLocaleConsentAcceptanceResponse) obj;
        getLocaleConsentAcceptanceResponse.getClass();
        ProtoAdapter protoAdapter = LanguageDisclosure.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, getLocaleConsentAcceptanceResponse.language_disclosures);
        protoAdapter.encodeWithTag(protoWriter, 2, getLocaleConsentAcceptanceResponse.language_disclosure);
        protoWriter.writeBytes(getLocaleConsentAcceptanceResponse.unknownFields());
    }
}
