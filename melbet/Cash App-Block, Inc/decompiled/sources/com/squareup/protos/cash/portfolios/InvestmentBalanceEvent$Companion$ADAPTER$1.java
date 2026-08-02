package com.squareup.protos.cash.portfolios;

import com.squareup.protos.cash.portfolios.InvestmentBalanceEvent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentBalanceEvent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InvestmentBalanceEvent((String) obj, (Long) obj2, (InvestmentBalanceEvent.Type) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = InvestmentBalanceEvent.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentBalanceEvent investmentBalanceEvent = (InvestmentBalanceEvent) obj;
        reverseProtoWriter.getClass();
        investmentBalanceEvent.getClass();
        reverseProtoWriter.writeBytes(investmentBalanceEvent.unknownFields());
        InvestmentBalanceEvent.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 3, investmentBalanceEvent.f1327type);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, investmentBalanceEvent.amount_cents);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, investmentBalanceEvent.investment_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentBalanceEvent investmentBalanceEvent = (InvestmentBalanceEvent) obj;
        investmentBalanceEvent.getClass();
        return InvestmentBalanceEvent.Type.ADAPTER.encodedSizeWithTag(3, investmentBalanceEvent.f1327type) + ProtoAdapter.INT64.encodedSizeWithTag(2, investmentBalanceEvent.amount_cents) + ProtoAdapter.STRING.encodedSizeWithTag(1, investmentBalanceEvent.investment_entity_token) + investmentBalanceEvent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentBalanceEvent investmentBalanceEvent = (InvestmentBalanceEvent) obj;
        investmentBalanceEvent.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = investmentBalanceEvent.investment_entity_token;
        InvestmentBalanceEvent.Type type2 = investmentBalanceEvent.f1327type;
        byteString.getClass();
        return new InvestmentBalanceEvent(str, null, type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentBalanceEvent investmentBalanceEvent = (InvestmentBalanceEvent) obj;
        investmentBalanceEvent.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, investmentBalanceEvent.investment_entity_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, investmentBalanceEvent.amount_cents);
        InvestmentBalanceEvent.Type.ADAPTER.encodeWithTag(protoWriter, 3, investmentBalanceEvent.f1327type);
        protoWriter.writeBytes(investmentBalanceEvent.unknownFields());
    }
}
