package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class LocalizationConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalizationConfig(m, (LocalizationConfig.LanguageDisclosure) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AcceptedLanguageDisclosure.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LocalizationConfig.LanguageDisclosure.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalizationConfig localizationConfig = (LocalizationConfig) obj;
        reverseProtoWriter.getClass();
        localizationConfig.getClass();
        reverseProtoWriter.writeBytes(localizationConfig.unknownFields());
        LocalizationConfig.LanguageDisclosure.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localizationConfig.language_disclosure);
        AcceptedLanguageDisclosure.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, localizationConfig.accepted_language_disclosures);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalizationConfig localizationConfig = (LocalizationConfig) obj;
        localizationConfig.getClass();
        return LocalizationConfig.LanguageDisclosure.ADAPTER.encodedSizeWithTag(2, localizationConfig.language_disclosure) + AcceptedLanguageDisclosure.ADAPTER.asRepeated().encodedSizeWithTag(1, localizationConfig.accepted_language_disclosures) + localizationConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalizationConfig localizationConfig = (LocalizationConfig) obj;
        localizationConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localizationConfig.accepted_language_disclosures, AcceptedLanguageDisclosure.ADAPTER);
        LocalizationConfig.LanguageDisclosure languageDisclosure = localizationConfig.language_disclosure;
        LocalizationConfig.LanguageDisclosure languageDisclosure2 = languageDisclosure != null ? (LocalizationConfig.LanguageDisclosure) LocalizationConfig.LanguageDisclosure.ADAPTER.redact(languageDisclosure) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalizationConfig(m1169redactElements, languageDisclosure2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalizationConfig localizationConfig = (LocalizationConfig) obj;
        localizationConfig.getClass();
        AcceptedLanguageDisclosure.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localizationConfig.accepted_language_disclosures);
        LocalizationConfig.LanguageDisclosure.ADAPTER.encodeWithTag(protoWriter, 2, localizationConfig.language_disclosure);
        protoWriter.writeBytes(localizationConfig.unknownFields());
    }
}
