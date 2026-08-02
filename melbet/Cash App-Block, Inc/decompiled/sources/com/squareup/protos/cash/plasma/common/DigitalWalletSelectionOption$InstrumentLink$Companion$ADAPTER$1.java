package com.squareup.protos.cash.plasma.common;

import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DigitalWalletSelectionOption$InstrumentLink$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DigitalWalletSelectionOption.InstrumentLink((String) obj, (CashInstrumentType) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = CashInstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DigitalWalletSelectionOption.InstrumentLink instrumentLink = (DigitalWalletSelectionOption.InstrumentLink) obj;
        reverseProtoWriter.getClass();
        instrumentLink.getClass();
        reverseProtoWriter.writeBytes(instrumentLink.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, instrumentLink.owner_token);
        CashInstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, instrumentLink.instrument_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, instrumentLink.finplat_instrument_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DigitalWalletSelectionOption.InstrumentLink instrumentLink = (DigitalWalletSelectionOption.InstrumentLink) obj;
        instrumentLink.getClass();
        int size$okio = instrumentLink.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, instrumentLink.owner_token) + CashInstrumentType.ADAPTER.encodedSizeWithTag(2, instrumentLink.instrument_type) + protoAdapter.encodedSizeWithTag(1, instrumentLink.finplat_instrument_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DigitalWalletSelectionOption.InstrumentLink instrumentLink = (DigitalWalletSelectionOption.InstrumentLink) obj;
        instrumentLink.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = instrumentLink.finplat_instrument_token;
        CashInstrumentType cashInstrumentType = instrumentLink.instrument_type;
        String str2 = instrumentLink.owner_token;
        byteString.getClass();
        return new DigitalWalletSelectionOption.InstrumentLink(str, cashInstrumentType, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletSelectionOption.InstrumentLink instrumentLink = (DigitalWalletSelectionOption.InstrumentLink) obj;
        instrumentLink.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, instrumentLink.finplat_instrument_token);
        CashInstrumentType.ADAPTER.encodeWithTag(protoWriter, 2, instrumentLink.instrument_type);
        protoAdapter.encodeWithTag(protoWriter, 3, instrumentLink.owner_token);
        protoWriter.writeBytes(instrumentLink.unknownFields());
    }
}
