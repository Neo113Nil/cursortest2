package com.squareup.protos.cash.marketdata.model;

import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HoldingsDetails$Holding$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new HoldingsDetails.Holding((String) obj, (String) obj2, (String) obj3, (InvestmentEntityVisibility) obj4, (InvestmentEntityTradability) obj5, (String) obj6, (String) obj7, (Long) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    try {
                        obj4 = InvestmentEntityVisibility.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    try {
                        obj5 = InvestmentEntityTradability.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HoldingsDetails.Holding holding = (HoldingsDetails.Holding) obj;
        reverseProtoWriter.getClass();
        holding.getClass();
        reverseProtoWriter.writeBytes(holding.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 8, holding.weight);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, holding.dark_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, holding.icon_url);
        InvestmentEntityTradability.ADAPTER.encodeWithTag(reverseProtoWriter, 5, holding.tradability);
        InvestmentEntityVisibility.ADAPTER.encodeWithTag(reverseProtoWriter, 4, holding.visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, holding.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, holding.token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, holding.symbol);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HoldingsDetails.Holding holding = (HoldingsDetails.Holding) obj;
        holding.getClass();
        int size$okio = holding.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(8, holding.weight) + protoAdapter.encodedSizeWithTag(7, holding.dark_icon_url) + protoAdapter.encodedSizeWithTag(6, holding.icon_url) + InvestmentEntityTradability.ADAPTER.encodedSizeWithTag(5, holding.tradability) + InvestmentEntityVisibility.ADAPTER.encodedSizeWithTag(4, holding.visibility) + protoAdapter.encodedSizeWithTag(3, holding.name) + protoAdapter.encodedSizeWithTag(2, holding.token) + protoAdapter.encodedSizeWithTag(1, holding.symbol) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HoldingsDetails.Holding holding = (HoldingsDetails.Holding) obj;
        holding.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = holding.symbol;
        String str2 = holding.token;
        String str3 = holding.name;
        InvestmentEntityVisibility investmentEntityVisibility = holding.visibility;
        InvestmentEntityTradability investmentEntityTradability = holding.tradability;
        String str4 = holding.icon_url;
        String str5 = holding.dark_icon_url;
        Long l = holding.weight;
        byteString.getClass();
        return new HoldingsDetails.Holding(str, str2, str3, investmentEntityVisibility, investmentEntityTradability, str4, str5, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HoldingsDetails.Holding holding = (HoldingsDetails.Holding) obj;
        holding.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, holding.symbol);
        protoAdapter.encodeWithTag(protoWriter, 2, holding.token);
        protoAdapter.encodeWithTag(protoWriter, 3, holding.name);
        InvestmentEntityVisibility.ADAPTER.encodeWithTag(protoWriter, 4, holding.visibility);
        InvestmentEntityTradability.ADAPTER.encodeWithTag(protoWriter, 5, holding.tradability);
        protoAdapter.encodeWithTag(protoWriter, 6, holding.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 7, holding.dark_icon_url);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, holding.weight);
        protoWriter.writeBytes(holding.unknownFields());
    }
}
