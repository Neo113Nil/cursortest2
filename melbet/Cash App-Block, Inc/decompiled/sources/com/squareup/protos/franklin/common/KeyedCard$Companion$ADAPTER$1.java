package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.experiments.bouncer.CardScanResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class KeyedCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new KeyedCard((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (InstrumentType) obj6, (String) obj7, (CardScanResult) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    try {
                        obj6 = InstrumentType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(CardScanResult.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KeyedCard keyedCard = (KeyedCard) obj;
        reverseProtoWriter.getClass();
        keyedCard.getClass();
        reverseProtoWriter.writeBytes(keyedCard.unknownFields());
        CardScanResult.ADAPTER.encodeWithTag(reverseProtoWriter, 8, keyedCard.bouncer_scan_result);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, keyedCard.cardholder_name);
        InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 6, keyedCard.instrument_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, keyedCard.last_four);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, keyedCard.postal_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, keyedCard.security_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, keyedCard.expiration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, keyedCard.unencrypted_pan);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KeyedCard keyedCard = (KeyedCard) obj;
        keyedCard.getClass();
        int size$okio = keyedCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CardScanResult.ADAPTER.encodedSizeWithTag(8, keyedCard.bouncer_scan_result) + protoAdapter.encodedSizeWithTag(7, keyedCard.cardholder_name) + InstrumentType.ADAPTER.encodedSizeWithTag(6, keyedCard.instrument_type) + protoAdapter.encodedSizeWithTag(5, keyedCard.last_four) + protoAdapter.encodedSizeWithTag(4, keyedCard.postal_code) + protoAdapter.encodedSizeWithTag(3, keyedCard.security_code) + protoAdapter.encodedSizeWithTag(2, keyedCard.expiration) + protoAdapter.encodedSizeWithTag(1, keyedCard.unencrypted_pan) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KeyedCard keyedCard = (KeyedCard) obj;
        keyedCard.getClass();
        CardScanResult cardScanResult = keyedCard.bouncer_scan_result;
        CardScanResult cardScanResult2 = cardScanResult != null ? (CardScanResult) CardScanResult.ADAPTER.redact(cardScanResult) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = keyedCard.last_four;
        InstrumentType instrumentType = keyedCard.instrument_type;
        byteString.getClass();
        return new KeyedCard(null, null, null, null, str, instrumentType, null, cardScanResult2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KeyedCard keyedCard = (KeyedCard) obj;
        keyedCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, keyedCard.unencrypted_pan);
        protoAdapter.encodeWithTag(protoWriter, 2, keyedCard.expiration);
        protoAdapter.encodeWithTag(protoWriter, 3, keyedCard.security_code);
        protoAdapter.encodeWithTag(protoWriter, 4, keyedCard.postal_code);
        protoAdapter.encodeWithTag(protoWriter, 5, keyedCard.last_four);
        InstrumentType.ADAPTER.encodeWithTag(protoWriter, 6, keyedCard.instrument_type);
        protoAdapter.encodeWithTag(protoWriter, 7, keyedCard.cardholder_name);
        CardScanResult.ADAPTER.encodeWithTag(protoWriter, 8, keyedCard.bouncer_scan_result);
        protoWriter.writeBytes(keyedCard.unknownFields());
    }
}
