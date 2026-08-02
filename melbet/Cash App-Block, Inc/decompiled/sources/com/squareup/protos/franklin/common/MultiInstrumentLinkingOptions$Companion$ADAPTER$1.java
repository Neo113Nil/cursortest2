package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MultiInstrumentLinkingOptions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MultiInstrumentLinkingOptions((String) obj, (LocalizableString) obj2, (String) obj3, (LocalizableString) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(InstrumentLinkingOption.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MultiInstrumentLinkingOptions multiInstrumentLinkingOptions = (MultiInstrumentLinkingOptions) obj;
        reverseProtoWriter.getClass();
        multiInstrumentLinkingOptions.getClass();
        reverseProtoWriter.writeBytes(multiInstrumentLinkingOptions.unknownFields());
        InstrumentLinkingOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, multiInstrumentLinkingOptions.instrument_linking_option);
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, multiInstrumentLinkingOptions.localizable_sheet_title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, multiInstrumentLinkingOptions.sheet_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, multiInstrumentLinkingOptions.localizable_button_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, multiInstrumentLinkingOptions.button_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MultiInstrumentLinkingOptions multiInstrumentLinkingOptions = (MultiInstrumentLinkingOptions) obj;
        multiInstrumentLinkingOptions.getClass();
        int size$okio = multiInstrumentLinkingOptions.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, multiInstrumentLinkingOptions.button_text) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return InstrumentLinkingOption.ADAPTER.asRepeated().encodedSizeWithTag(3, multiInstrumentLinkingOptions.instrument_linking_option) + protoAdapter2.encodedSizeWithTag(5, multiInstrumentLinkingOptions.localizable_sheet_title) + protoAdapter.encodedSizeWithTag(2, multiInstrumentLinkingOptions.sheet_title) + protoAdapter2.encodedSizeWithTag(4, multiInstrumentLinkingOptions.localizable_button_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MultiInstrumentLinkingOptions multiInstrumentLinkingOptions = (MultiInstrumentLinkingOptions) obj;
        multiInstrumentLinkingOptions.getClass();
        LocalizableString localizableString = multiInstrumentLinkingOptions.localizable_button_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = multiInstrumentLinkingOptions.localizable_sheet_title;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(multiInstrumentLinkingOptions.instrument_linking_option, InstrumentLinkingOption.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = multiInstrumentLinkingOptions.button_text;
        String str2 = multiInstrumentLinkingOptions.sheet_title;
        byteString.getClass();
        return new MultiInstrumentLinkingOptions(str, localizableString2, str2, localizableString4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MultiInstrumentLinkingOptions multiInstrumentLinkingOptions = (MultiInstrumentLinkingOptions) obj;
        multiInstrumentLinkingOptions.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, multiInstrumentLinkingOptions.button_text);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, multiInstrumentLinkingOptions.localizable_button_text);
        protoAdapter.encodeWithTag(protoWriter, 2, multiInstrumentLinkingOptions.sheet_title);
        protoAdapter2.encodeWithTag(protoWriter, 5, multiInstrumentLinkingOptions.localizable_sheet_title);
        InstrumentLinkingOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, multiInstrumentLinkingOptions.instrument_linking_option);
        protoWriter.writeBytes(multiInstrumentLinkingOptions.unknownFields());
    }
}
