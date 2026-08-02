package com.squareup.protos.cash.plasma.common;

import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NewLinkSelectionOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NewLinkSelectionOption((CashInstrumentType) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CashInstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NewLinkSelectionOption newLinkSelectionOption = (NewLinkSelectionOption) obj;
        reverseProtoWriter.getClass();
        newLinkSelectionOption.getClass();
        reverseProtoWriter.writeBytes(newLinkSelectionOption.unknownFields());
        CashInstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, newLinkSelectionOption.instrument_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NewLinkSelectionOption newLinkSelectionOption = (NewLinkSelectionOption) obj;
        newLinkSelectionOption.getClass();
        return CashInstrumentType.ADAPTER.encodedSizeWithTag(1, newLinkSelectionOption.instrument_type) + newLinkSelectionOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NewLinkSelectionOption newLinkSelectionOption = (NewLinkSelectionOption) obj;
        newLinkSelectionOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        CashInstrumentType cashInstrumentType = newLinkSelectionOption.instrument_type;
        byteString.getClass();
        return new NewLinkSelectionOption(cashInstrumentType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NewLinkSelectionOption newLinkSelectionOption = (NewLinkSelectionOption) obj;
        newLinkSelectionOption.getClass();
        CashInstrumentType.ADAPTER.encodeWithTag(protoWriter, 1, newLinkSelectionOption.instrument_type);
        protoWriter.writeBytes(newLinkSelectionOption.unknownFields());
    }
}
