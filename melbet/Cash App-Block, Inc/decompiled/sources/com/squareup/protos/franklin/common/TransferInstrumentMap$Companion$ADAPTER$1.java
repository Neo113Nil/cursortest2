package com.squareup.protos.franklin.common;

import bo.app.re$$ExternalSyntheticOutline0;
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
public final class TransferInstrumentMap$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransferInstrumentMap((String) obj, m, (CashInstrumentType) obj2, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                try {
                    obj2 = CashInstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    CashInstrumentType.ADAPTER.tryDecode(protoReader, arrayList);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransferInstrumentMap transferInstrumentMap = (TransferInstrumentMap) obj;
        reverseProtoWriter.getClass();
        transferInstrumentMap.getClass();
        reverseProtoWriter.writeBytes(transferInstrumentMap.unknownFields());
        ProtoAdapter protoAdapter = CashInstrumentType.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, transferInstrumentMap.target_types);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, transferInstrumentMap.source_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, transferInstrumentMap.target_instrument_tokens);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, transferInstrumentMap.source_instrument_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransferInstrumentMap transferInstrumentMap = (TransferInstrumentMap) obj;
        transferInstrumentMap.getClass();
        int size$okio = transferInstrumentMap.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(2, transferInstrumentMap.target_instrument_tokens) + protoAdapter.encodedSizeWithTag(1, transferInstrumentMap.source_instrument_token) + size$okio;
        ProtoAdapter protoAdapter2 = CashInstrumentType.ADAPTER;
        return protoAdapter2.asRepeated().encodedSizeWithTag(4, transferInstrumentMap.target_types) + protoAdapter2.encodedSizeWithTag(3, transferInstrumentMap.source_type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransferInstrumentMap transferInstrumentMap = (TransferInstrumentMap) obj;
        transferInstrumentMap.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = transferInstrumentMap.source_instrument_token;
        List list = transferInstrumentMap.target_instrument_tokens;
        CashInstrumentType cashInstrumentType = transferInstrumentMap.source_type;
        List list2 = transferInstrumentMap.target_types;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new TransferInstrumentMap(str, list, cashInstrumentType, list2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransferInstrumentMap transferInstrumentMap = (TransferInstrumentMap) obj;
        transferInstrumentMap.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, transferInstrumentMap.source_instrument_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, transferInstrumentMap.target_instrument_tokens);
        ProtoAdapter protoAdapter2 = CashInstrumentType.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, transferInstrumentMap.source_type);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, transferInstrumentMap.target_types);
        protoWriter.writeBytes(transferInstrumentMap.unknownFields());
    }
}
