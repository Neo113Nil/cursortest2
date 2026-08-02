package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InvestmentEntityRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestmentEntityRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InvestmentEntityRenderData((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (InvestmentEntityRenderData.InvestmentType) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                        obj6 = InvestmentEntityRenderData.InvestmentType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentEntityRenderData investmentEntityRenderData = (InvestmentEntityRenderData) obj;
        reverseProtoWriter.getClass();
        investmentEntityRenderData.getClass();
        reverseProtoWriter.writeBytes(investmentEntityRenderData.unknownFields());
        InvestmentEntityRenderData.InvestmentType.ADAPTER.encodeWithTag(reverseProtoWriter, 6, investmentEntityRenderData.f1379type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, investmentEntityRenderData.dark_theme_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, investmentEntityRenderData.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, investmentEntityRenderData.investment_entity_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, investmentEntityRenderData.investment_entity_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, investmentEntityRenderData.investment_entity_symbol);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentEntityRenderData investmentEntityRenderData = (InvestmentEntityRenderData) obj;
        investmentEntityRenderData.getClass();
        int size$okio = investmentEntityRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return InvestmentEntityRenderData.InvestmentType.ADAPTER.encodedSizeWithTag(6, investmentEntityRenderData.f1379type) + protoAdapter.encodedSizeWithTag(5, investmentEntityRenderData.dark_theme_icon_url) + protoAdapter.encodedSizeWithTag(4, investmentEntityRenderData.icon_url) + protoAdapter.encodedSizeWithTag(3, investmentEntityRenderData.investment_entity_token) + protoAdapter.encodedSizeWithTag(2, investmentEntityRenderData.investment_entity_name) + protoAdapter.encodedSizeWithTag(1, investmentEntityRenderData.investment_entity_symbol) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentEntityRenderData investmentEntityRenderData = (InvestmentEntityRenderData) obj;
        investmentEntityRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = investmentEntityRenderData.investment_entity_symbol;
        String str2 = investmentEntityRenderData.investment_entity_name;
        String str3 = investmentEntityRenderData.investment_entity_token;
        String str4 = investmentEntityRenderData.icon_url;
        String str5 = investmentEntityRenderData.dark_theme_icon_url;
        InvestmentEntityRenderData.InvestmentType investmentType = investmentEntityRenderData.f1379type;
        byteString.getClass();
        return new InvestmentEntityRenderData(str, str2, str3, str4, str5, investmentType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentEntityRenderData investmentEntityRenderData = (InvestmentEntityRenderData) obj;
        investmentEntityRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, investmentEntityRenderData.investment_entity_symbol);
        protoAdapter.encodeWithTag(protoWriter, 2, investmentEntityRenderData.investment_entity_name);
        protoAdapter.encodeWithTag(protoWriter, 3, investmentEntityRenderData.investment_entity_token);
        protoAdapter.encodeWithTag(protoWriter, 4, investmentEntityRenderData.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 5, investmentEntityRenderData.dark_theme_icon_url);
        InvestmentEntityRenderData.InvestmentType.ADAPTER.encodeWithTag(protoWriter, 6, investmentEntityRenderData.f1379type);
        protoWriter.writeBytes(investmentEntityRenderData.unknownFields());
    }
}
