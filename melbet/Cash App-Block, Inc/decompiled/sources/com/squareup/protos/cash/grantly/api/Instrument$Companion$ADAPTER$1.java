package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.Instrument;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Instrument$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Instrument((Instrument.InstrumentType) obj, (String) obj2, (String) obj3, (String) obj4, (Card) obj5, (Money) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = Instrument.InstrumentType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj5 = TransactorKt.decodeMessageOrMerge(Card.ADAPTER, protoReader, obj5);
                    break;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 6:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Instrument instrument = (Instrument) obj;
        reverseProtoWriter.getClass();
        instrument.getClass();
        reverseProtoWriter.writeBytes(instrument.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 5, instrument.available_balance);
        Card.ADAPTER.encodeWithTag(reverseProtoWriter, 4, instrument.card);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, instrument.instrument_link_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, instrument.instrument_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, instrument.fidelius_token);
        Instrument.InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, instrument.instrument_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Instrument instrument = (Instrument) obj;
        instrument.getClass();
        int encodedSizeWithTag = Instrument.InstrumentType.ADAPTER.encodedSizeWithTag(1, instrument.instrument_type) + instrument.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(5, instrument.available_balance) + Card.ADAPTER.encodedSizeWithTag(4, instrument.card) + protoAdapter.encodedSizeWithTag(6, instrument.instrument_link_token) + protoAdapter.encodedSizeWithTag(3, instrument.instrument_token) + protoAdapter.encodedSizeWithTag(2, instrument.fidelius_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Instrument instrument = (Instrument) obj;
        instrument.getClass();
        Card card = instrument.card;
        Card card2 = card != null ? (Card) Card.ADAPTER.redact(card) : null;
        Money money = instrument.available_balance;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Instrument.InstrumentType instrumentType = instrument.instrument_type;
        String str = instrument.fidelius_token;
        String str2 = instrument.instrument_token;
        String str3 = instrument.instrument_link_token;
        byteString.getClass();
        return new Instrument(instrumentType, str, str2, str3, card2, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Instrument instrument = (Instrument) obj;
        instrument.getClass();
        Instrument.InstrumentType.ADAPTER.encodeWithTag(protoWriter, 1, instrument.instrument_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, instrument.fidelius_token);
        protoAdapter.encodeWithTag(protoWriter, 3, instrument.instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 6, instrument.instrument_link_token);
        Card.ADAPTER.encodeWithTag(protoWriter, 4, instrument.card);
        Money.ADAPTER.encodeWithTag(protoWriter, 5, instrument.available_balance);
        protoWriter.writeBytes(instrument.unknownFields());
    }
}
