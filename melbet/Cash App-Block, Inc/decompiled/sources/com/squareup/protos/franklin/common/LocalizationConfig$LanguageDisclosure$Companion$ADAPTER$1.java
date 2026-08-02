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

/* loaded from: classes7.dex */
public final class LocalizationConfig$LanguageDisclosure$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalizationConfig.LanguageDisclosure((Boolean) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(LocalizationConfig.LocalizedDisclosureCopy.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalizationConfig.LanguageDisclosure languageDisclosure = (LocalizationConfig.LanguageDisclosure) obj;
        reverseProtoWriter.getClass();
        languageDisclosure.getClass();
        reverseProtoWriter.writeBytes(languageDisclosure.unknownFields());
        LocalizationConfig.LocalizedDisclosureCopy.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, languageDisclosure.localized_disclosure_copy);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, languageDisclosure.accepted);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, languageDisclosure.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalizationConfig.LanguageDisclosure languageDisclosure = (LocalizationConfig.LanguageDisclosure) obj;
        languageDisclosure.getClass();
        return LocalizationConfig.LocalizedDisclosureCopy.ADAPTER.asRepeated().encodedSizeWithTag(3, languageDisclosure.localized_disclosure_copy) + ProtoAdapter.BOOL.encodedSizeWithTag(2, languageDisclosure.accepted) + ProtoAdapter.STRING.encodedSizeWithTag(1, languageDisclosure.version) + languageDisclosure.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalizationConfig.LanguageDisclosure languageDisclosure = (LocalizationConfig.LanguageDisclosure) obj;
        languageDisclosure.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(languageDisclosure.localized_disclosure_copy, LocalizationConfig.LocalizedDisclosureCopy.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = languageDisclosure.version;
        Boolean bool = languageDisclosure.accepted;
        byteString.getClass();
        return new LocalizationConfig.LanguageDisclosure(bool, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalizationConfig.LanguageDisclosure languageDisclosure = (LocalizationConfig.LanguageDisclosure) obj;
        languageDisclosure.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, languageDisclosure.version);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, languageDisclosure.accepted);
        LocalizationConfig.LocalizedDisclosureCopy.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, languageDisclosure.localized_disclosure_copy);
        protoWriter.writeBytes(languageDisclosure.unknownFields());
    }
}
