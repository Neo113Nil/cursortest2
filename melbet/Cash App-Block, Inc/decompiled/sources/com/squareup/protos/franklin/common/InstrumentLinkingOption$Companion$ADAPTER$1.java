package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstrumentLinkingOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstrumentLinkingOption(m, (String) obj, (LocalizableString) obj2, (String) obj3, (LocalizableString) obj4, (Long) obj5, (Boolean) obj6, (LinkingAction) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    CashInstrumentType.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                switch (nextTag) {
                    case 8:
                        obj5 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 9:
                        obj6 = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 10:
                        obj7 = TransactorKt.decodeMessageOrMerge(LinkingAction.ADAPTER, protoReader, obj7);
                        break;
                    case 11:
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
                        break;
                    case 12:
                        obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstrumentLinkingOption instrumentLinkingOption = (InstrumentLinkingOption) obj;
        reverseProtoWriter.getClass();
        instrumentLinkingOption.getClass();
        reverseProtoWriter.writeBytes(instrumentLinkingOption.unknownFields());
        LinkingAction.ADAPTER.encodeWithTag(reverseProtoWriter, 10, instrumentLinkingOption.action);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, instrumentLinkingOption.show_in_instrument_selector);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 8, instrumentLinkingOption.fee_bps);
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, instrumentLinkingOption.localizable_description);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, instrumentLinkingOption.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, instrumentLinkingOption.localizable_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, instrumentLinkingOption.title);
        CashInstrumentType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, instrumentLinkingOption.instrument_types);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstrumentLinkingOption instrumentLinkingOption = (InstrumentLinkingOption) obj;
        instrumentLinkingOption.getClass();
        int encodedSizeWithTag = CashInstrumentType.ADAPTER.asRepeated().encodedSizeWithTag(1, instrumentLinkingOption.instrument_types) + instrumentLinkingOption.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, instrumentLinkingOption.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return LinkingAction.ADAPTER.encodedSizeWithTag(10, instrumentLinkingOption.action) + ProtoAdapter.BOOL.encodedSizeWithTag(9, instrumentLinkingOption.show_in_instrument_selector) + ProtoAdapter.INT64.encodedSizeWithTag(8, instrumentLinkingOption.fee_bps) + protoAdapter2.encodedSizeWithTag(12, instrumentLinkingOption.localizable_description) + protoAdapter.encodedSizeWithTag(3, instrumentLinkingOption.description) + protoAdapter2.encodedSizeWithTag(11, instrumentLinkingOption.localizable_title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstrumentLinkingOption instrumentLinkingOption = (InstrumentLinkingOption) obj;
        instrumentLinkingOption.getClass();
        LocalizableString localizableString = instrumentLinkingOption.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = instrumentLinkingOption.localizable_description;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LinkingAction linkingAction = instrumentLinkingOption.action;
        LinkingAction linkingAction2 = linkingAction != null ? (LinkingAction) LinkingAction.ADAPTER.redact(linkingAction) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = instrumentLinkingOption.instrument_types;
        String str = instrumentLinkingOption.title;
        String str2 = instrumentLinkingOption.description;
        Long l = instrumentLinkingOption.fee_bps;
        Boolean bool = instrumentLinkingOption.show_in_instrument_selector;
        list.getClass();
        byteString.getClass();
        return new InstrumentLinkingOption(list, str, localizableString2, str2, localizableString4, l, bool, linkingAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstrumentLinkingOption instrumentLinkingOption = (InstrumentLinkingOption) obj;
        instrumentLinkingOption.getClass();
        CashInstrumentType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, instrumentLinkingOption.instrument_types);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, instrumentLinkingOption.title);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 11, instrumentLinkingOption.localizable_title);
        protoAdapter.encodeWithTag(protoWriter, 3, instrumentLinkingOption.description);
        protoAdapter2.encodeWithTag(protoWriter, 12, instrumentLinkingOption.localizable_description);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, instrumentLinkingOption.fee_bps);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, instrumentLinkingOption.show_in_instrument_selector);
        LinkingAction.ADAPTER.encodeWithTag(protoWriter, 10, instrumentLinkingOption.action);
        protoWriter.writeBytes(instrumentLinkingOption.unknownFields());
    }
}
