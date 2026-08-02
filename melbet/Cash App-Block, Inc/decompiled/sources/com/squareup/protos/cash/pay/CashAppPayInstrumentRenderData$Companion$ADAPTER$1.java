package com.squareup.protos.cash.pay;

import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayInstrumentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayInstrumentRenderData((String) obj, (String) obj2, (CashInstrumentType) obj3, (InstrumentType) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = CashInstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                try {
                    obj4 = InstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = (CashAppPayInstrumentRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayInstrumentRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayInstrumentRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cashAppPayInstrumentRenderData.card_last_4);
        InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cashAppPayInstrumentRenderData.brand);
        CashInstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashAppPayInstrumentRenderData.f1321type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppPayInstrumentRenderData.token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayInstrumentRenderData.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = (CashAppPayInstrumentRenderData) obj;
        cashAppPayInstrumentRenderData.getClass();
        int size$okio = cashAppPayInstrumentRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, cashAppPayInstrumentRenderData.card_last_4) + InstrumentType.ADAPTER.encodedSizeWithTag(4, cashAppPayInstrumentRenderData.brand) + CashInstrumentType.ADAPTER.encodedSizeWithTag(3, cashAppPayInstrumentRenderData.f1321type) + protoAdapter.encodedSizeWithTag(2, cashAppPayInstrumentRenderData.token) + protoAdapter.encodedSizeWithTag(1, cashAppPayInstrumentRenderData.display_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = (CashAppPayInstrumentRenderData) obj;
        cashAppPayInstrumentRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayInstrumentRenderData.display_name;
        String str2 = cashAppPayInstrumentRenderData.token;
        CashInstrumentType cashInstrumentType = cashAppPayInstrumentRenderData.f1321type;
        InstrumentType instrumentType = cashAppPayInstrumentRenderData.brand;
        String str3 = cashAppPayInstrumentRenderData.card_last_4;
        byteString.getClass();
        return new CashAppPayInstrumentRenderData(str, str2, cashInstrumentType, instrumentType, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = (CashAppPayInstrumentRenderData) obj;
        cashAppPayInstrumentRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayInstrumentRenderData.display_name);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayInstrumentRenderData.token);
        CashInstrumentType.ADAPTER.encodeWithTag(protoWriter, 3, cashAppPayInstrumentRenderData.f1321type);
        InstrumentType.ADAPTER.encodeWithTag(protoWriter, 4, cashAppPayInstrumentRenderData.brand);
        protoAdapter.encodeWithTag(protoWriter, 5, cashAppPayInstrumentRenderData.card_last_4);
        protoWriter.writeBytes(cashAppPayInstrumentRenderData.unknownFields());
    }
}
