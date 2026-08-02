package com.squareup.protos.cash.requirements;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.requirements.SetLinkCardRequirementData;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetLinkCardRequirementData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SetLinkCardRequirementData(m, (Boolean) obj, (Boolean) obj2, (SetLinkCardRequirementData.EntryPoint) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    CashInstrumentType.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 5) {
                try {
                    obj3 = SetLinkCardRequirementData.EntryPoint.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetLinkCardRequirementData setLinkCardRequirementData = (SetLinkCardRequirementData) obj;
        reverseProtoWriter.getClass();
        setLinkCardRequirementData.getClass();
        reverseProtoWriter.writeBytes(setLinkCardRequirementData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, setLinkCardRequirementData.instrument_token_to_replace);
        SetLinkCardRequirementData.EntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 5, setLinkCardRequirementData.entry_point);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, setLinkCardRequirementData.resolve_if_instrument_type_active);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, setLinkCardRequirementData.skippable);
        CashInstrumentType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, setLinkCardRequirementData.supported_cash_instrument_types);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetLinkCardRequirementData setLinkCardRequirementData = (SetLinkCardRequirementData) obj;
        setLinkCardRequirementData.getClass();
        int encodedSizeWithTag = CashInstrumentType.ADAPTER.asRepeated().encodedSizeWithTag(1, setLinkCardRequirementData.supported_cash_instrument_types) + setLinkCardRequirementData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return ProtoAdapter.STRING.encodedSizeWithTag(6, setLinkCardRequirementData.instrument_token_to_replace) + SetLinkCardRequirementData.EntryPoint.ADAPTER.encodedSizeWithTag(5, setLinkCardRequirementData.entry_point) + protoAdapter.encodedSizeWithTag(3, setLinkCardRequirementData.resolve_if_instrument_type_active) + protoAdapter.encodedSizeWithTag(2, setLinkCardRequirementData.skippable) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetLinkCardRequirementData setLinkCardRequirementData = (SetLinkCardRequirementData) obj;
        setLinkCardRequirementData.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = setLinkCardRequirementData.supported_cash_instrument_types;
        Boolean bool = setLinkCardRequirementData.skippable;
        Boolean bool2 = setLinkCardRequirementData.resolve_if_instrument_type_active;
        SetLinkCardRequirementData.EntryPoint entryPoint = setLinkCardRequirementData.entry_point;
        String str = setLinkCardRequirementData.instrument_token_to_replace;
        list.getClass();
        byteString.getClass();
        return new SetLinkCardRequirementData(list, bool, bool2, entryPoint, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetLinkCardRequirementData setLinkCardRequirementData = (SetLinkCardRequirementData) obj;
        setLinkCardRequirementData.getClass();
        CashInstrumentType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, setLinkCardRequirementData.supported_cash_instrument_types);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, setLinkCardRequirementData.skippable);
        protoAdapter.encodeWithTag(protoWriter, 3, setLinkCardRequirementData.resolve_if_instrument_type_active);
        SetLinkCardRequirementData.EntryPoint.ADAPTER.encodeWithTag(protoWriter, 5, setLinkCardRequirementData.entry_point);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, setLinkCardRequirementData.instrument_token_to_replace);
        protoWriter.writeBytes(setLinkCardRequirementData.unknownFields());
    }
}
