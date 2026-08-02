package com.squareup.protos.cash.marketdata.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentEntityCategoryEntry$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestmentEntityCategoryEntry((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentEntityCategoryEntry investmentEntityCategoryEntry = (InvestmentEntityCategoryEntry) obj;
        reverseProtoWriter.getClass();
        investmentEntityCategoryEntry.getClass();
        reverseProtoWriter.writeBytes(investmentEntityCategoryEntry.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, investmentEntityCategoryEntry.investment_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentEntityCategoryEntry investmentEntityCategoryEntry = (InvestmentEntityCategoryEntry) obj;
        investmentEntityCategoryEntry.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, investmentEntityCategoryEntry.investment_entity_token) + investmentEntityCategoryEntry.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentEntityCategoryEntry investmentEntityCategoryEntry = (InvestmentEntityCategoryEntry) obj;
        investmentEntityCategoryEntry.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = investmentEntityCategoryEntry.investment_entity_token;
        byteString.getClass();
        return new InvestmentEntityCategoryEntry(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentEntityCategoryEntry investmentEntityCategoryEntry = (InvestmentEntityCategoryEntry) obj;
        investmentEntityCategoryEntry.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, investmentEntityCategoryEntry.investment_entity_token);
        protoWriter.writeBytes(investmentEntityCategoryEntry.unknownFields());
    }
}
