package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentEntityCategory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestmentEntityCategory((Boolean) obj3, (String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(InvestmentEntityCategoryEntry.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentEntityCategory investmentEntityCategory = (InvestmentEntityCategory) obj;
        reverseProtoWriter.getClass();
        investmentEntityCategory.getClass();
        reverseProtoWriter.writeBytes(investmentEntityCategory.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, investmentEntityCategory.in_search_suggestion);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, investmentEntityCategory.description);
        InvestmentEntityCategoryEntry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, investmentEntityCategory.investment_entities);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, investmentEntityCategory.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentEntityCategory investmentEntityCategory = (InvestmentEntityCategory) obj;
        investmentEntityCategory.getClass();
        int size$okio = investmentEntityCategory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, investmentEntityCategory.in_search_suggestion) + protoAdapter.encodedSizeWithTag(3, investmentEntityCategory.description) + InvestmentEntityCategoryEntry.ADAPTER.asRepeated().encodedSizeWithTag(2, investmentEntityCategory.investment_entities) + protoAdapter.encodedSizeWithTag(1, investmentEntityCategory.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentEntityCategory investmentEntityCategory = (InvestmentEntityCategory) obj;
        investmentEntityCategory.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(investmentEntityCategory.investment_entities, InvestmentEntityCategoryEntry.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = investmentEntityCategory.name;
        String str2 = investmentEntityCategory.description;
        Boolean bool = investmentEntityCategory.in_search_suggestion;
        byteString.getClass();
        return new InvestmentEntityCategory(bool, str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentEntityCategory investmentEntityCategory = (InvestmentEntityCategory) obj;
        investmentEntityCategory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, investmentEntityCategory.name);
        InvestmentEntityCategoryEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, investmentEntityCategory.investment_entities);
        protoAdapter.encodeWithTag(protoWriter, 3, investmentEntityCategory.description);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, investmentEntityCategory.in_search_suggestion);
        protoWriter.writeBytes(investmentEntityCategory.unknownFields());
    }
}
