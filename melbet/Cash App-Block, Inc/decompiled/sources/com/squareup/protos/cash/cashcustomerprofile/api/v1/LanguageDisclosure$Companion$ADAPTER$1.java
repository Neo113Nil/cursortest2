package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LanguageDisclosure$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LanguageDisclosure((String) obj, (String) obj2, (AcceptanceState) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = AcceptanceState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(LocalizedDisclosureCopy.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LanguageDisclosure languageDisclosure = (LanguageDisclosure) obj;
        reverseProtoWriter.getClass();
        languageDisclosure.getClass();
        reverseProtoWriter.writeBytes(languageDisclosure.unknownFields());
        LocalizedDisclosureCopy.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, languageDisclosure.localized_copy);
        AcceptanceState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, languageDisclosure.acceptance_state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, languageDisclosure.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, languageDisclosure.locale);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LanguageDisclosure languageDisclosure = (LanguageDisclosure) obj;
        languageDisclosure.getClass();
        int size$okio = languageDisclosure.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizedDisclosureCopy.ADAPTER.asRepeated().encodedSizeWithTag(4, languageDisclosure.localized_copy) + AcceptanceState.ADAPTER.encodedSizeWithTag(3, languageDisclosure.acceptance_state) + protoAdapter.encodedSizeWithTag(2, languageDisclosure.version) + protoAdapter.encodedSizeWithTag(1, languageDisclosure.locale) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LanguageDisclosure languageDisclosure = (LanguageDisclosure) obj;
        languageDisclosure.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(languageDisclosure.localized_copy, LocalizedDisclosureCopy.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = languageDisclosure.locale;
        String str2 = languageDisclosure.version;
        AcceptanceState acceptanceState = languageDisclosure.acceptance_state;
        byteString.getClass();
        return new LanguageDisclosure(str, str2, acceptanceState, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LanguageDisclosure languageDisclosure = (LanguageDisclosure) obj;
        languageDisclosure.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, languageDisclosure.locale);
        protoAdapter.encodeWithTag(protoWriter, 2, languageDisclosure.version);
        AcceptanceState.ADAPTER.encodeWithTag(protoWriter, 3, languageDisclosure.acceptance_state);
        LocalizedDisclosureCopy.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, languageDisclosure.localized_copy);
        protoWriter.writeBytes(languageDisclosure.unknownFields());
    }
}
