package com.squareup.protos.cash.plasma.common;

import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReplaceLinkSelectionOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReplaceLinkSelectionOption((String) obj2, (CashInstrumentType) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CashInstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReplaceLinkSelectionOption replaceLinkSelectionOption = (ReplaceLinkSelectionOption) obj;
        reverseProtoWriter.getClass();
        replaceLinkSelectionOption.getClass();
        reverseProtoWriter.writeBytes(replaceLinkSelectionOption.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, replaceLinkSelectionOption.instrument_token);
        CashInstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, replaceLinkSelectionOption.instrument_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReplaceLinkSelectionOption replaceLinkSelectionOption = (ReplaceLinkSelectionOption) obj;
        replaceLinkSelectionOption.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, replaceLinkSelectionOption.instrument_token) + CashInstrumentType.ADAPTER.encodedSizeWithTag(1, replaceLinkSelectionOption.instrument_type) + replaceLinkSelectionOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReplaceLinkSelectionOption replaceLinkSelectionOption = (ReplaceLinkSelectionOption) obj;
        replaceLinkSelectionOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        CashInstrumentType cashInstrumentType = replaceLinkSelectionOption.instrument_type;
        String str = replaceLinkSelectionOption.instrument_token;
        byteString.getClass();
        return new ReplaceLinkSelectionOption(str, cashInstrumentType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReplaceLinkSelectionOption replaceLinkSelectionOption = (ReplaceLinkSelectionOption) obj;
        replaceLinkSelectionOption.getClass();
        CashInstrumentType.ADAPTER.encodeWithTag(protoWriter, 1, replaceLinkSelectionOption.instrument_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, replaceLinkSelectionOption.instrument_token);
        protoWriter.writeBytes(replaceLinkSelectionOption.unknownFields());
    }
}
