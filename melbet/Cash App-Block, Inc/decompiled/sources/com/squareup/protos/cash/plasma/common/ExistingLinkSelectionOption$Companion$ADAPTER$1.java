package com.squareup.protos.cash.plasma.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.core.model.ProcessingMode;
import com.squareup.protos.cash.plasma.common.ExistingLinkSelectionOption;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExistingLinkSelectionOption$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ExistingLinkSelectionOption((CashInstrumentType) obj, (String) obj2, m, (ProcessingMode) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CashInstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = ProcessingMode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 4) {
                m.add(ExistingLinkSelectionOption.InstrumentOption.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExistingLinkSelectionOption existingLinkSelectionOption = (ExistingLinkSelectionOption) obj;
        reverseProtoWriter.getClass();
        existingLinkSelectionOption.getClass();
        reverseProtoWriter.writeBytes(existingLinkSelectionOption.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, existingLinkSelectionOption.is_consolidated);
        ProcessingMode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, existingLinkSelectionOption.processing_mode);
        ExistingLinkSelectionOption.InstrumentOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, existingLinkSelectionOption.options);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, existingLinkSelectionOption.instrument_token);
        CashInstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, existingLinkSelectionOption.instrument_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExistingLinkSelectionOption existingLinkSelectionOption = (ExistingLinkSelectionOption) obj;
        existingLinkSelectionOption.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(5, existingLinkSelectionOption.is_consolidated) + ProcessingMode.ADAPTER.encodedSizeWithTag(3, existingLinkSelectionOption.processing_mode) + ExistingLinkSelectionOption.InstrumentOption.ADAPTER.asRepeated().encodedSizeWithTag(4, existingLinkSelectionOption.options) + ProtoAdapter.STRING.encodedSizeWithTag(2, existingLinkSelectionOption.instrument_token) + CashInstrumentType.ADAPTER.encodedSizeWithTag(1, existingLinkSelectionOption.instrument_type) + existingLinkSelectionOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExistingLinkSelectionOption existingLinkSelectionOption = (ExistingLinkSelectionOption) obj;
        existingLinkSelectionOption.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(existingLinkSelectionOption.options, ExistingLinkSelectionOption.InstrumentOption.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        CashInstrumentType cashInstrumentType = existingLinkSelectionOption.instrument_type;
        String str = existingLinkSelectionOption.instrument_token;
        ProcessingMode processingMode = existingLinkSelectionOption.processing_mode;
        Boolean bool = existingLinkSelectionOption.is_consolidated;
        byteString.getClass();
        return new ExistingLinkSelectionOption(cashInstrumentType, str, m1169redactElements, processingMode, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExistingLinkSelectionOption existingLinkSelectionOption = (ExistingLinkSelectionOption) obj;
        existingLinkSelectionOption.getClass();
        CashInstrumentType.ADAPTER.encodeWithTag(protoWriter, 1, existingLinkSelectionOption.instrument_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, existingLinkSelectionOption.instrument_token);
        ExistingLinkSelectionOption.InstrumentOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, existingLinkSelectionOption.options);
        ProcessingMode.ADAPTER.encodeWithTag(protoWriter, 3, existingLinkSelectionOption.processing_mode);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, existingLinkSelectionOption.is_consolidated);
        protoWriter.writeBytes(existingLinkSelectionOption.unknownFields());
    }
}
