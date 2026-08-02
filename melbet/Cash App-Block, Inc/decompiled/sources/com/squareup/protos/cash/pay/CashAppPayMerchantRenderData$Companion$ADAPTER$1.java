package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayMerchantRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayMerchantRenderData((String) obj, (String) obj2, (String) obj3, (String) obj4, (CashAppPayMerchantRenderData.LogoUrls) obj5, (CashAppPayMerchantRenderData.BrandColors) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(CashAppPayMerchantRenderData.LogoUrls.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(CashAppPayMerchantRenderData.BrandColors.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = (CashAppPayMerchantRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayMerchantRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayMerchantRenderData.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, cashAppPayMerchantRenderData.is_template_avatar);
        CashAppPayMerchantRenderData.BrandColors.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cashAppPayMerchantRenderData.brand_colors);
        CashAppPayMerchantRenderData.LogoUrls.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashAppPayMerchantRenderData.logo_urls);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashAppPayMerchantRenderData.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppPayMerchantRenderData.brand_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashAppPayMerchantRenderData.merchant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayMerchantRenderData.merchant_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = (CashAppPayMerchantRenderData) obj;
        cashAppPayMerchantRenderData.getClass();
        int size$okio = cashAppPayMerchantRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, cashAppPayMerchantRenderData.is_template_avatar) + CashAppPayMerchantRenderData.BrandColors.ADAPTER.encodedSizeWithTag(6, cashAppPayMerchantRenderData.brand_colors) + CashAppPayMerchantRenderData.LogoUrls.ADAPTER.encodedSizeWithTag(5, cashAppPayMerchantRenderData.logo_urls) + protoAdapter.encodedSizeWithTag(3, cashAppPayMerchantRenderData.display_name) + protoAdapter.encodedSizeWithTag(2, cashAppPayMerchantRenderData.brand_id) + protoAdapter.encodedSizeWithTag(4, cashAppPayMerchantRenderData.merchant_token) + protoAdapter.encodedSizeWithTag(1, cashAppPayMerchantRenderData.merchant_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = (CashAppPayMerchantRenderData) obj;
        cashAppPayMerchantRenderData.getClass();
        CashAppPayMerchantRenderData.LogoUrls logoUrls = cashAppPayMerchantRenderData.logo_urls;
        CashAppPayMerchantRenderData.LogoUrls logoUrls2 = logoUrls != null ? (CashAppPayMerchantRenderData.LogoUrls) CashAppPayMerchantRenderData.LogoUrls.ADAPTER.redact(logoUrls) : null;
        CashAppPayMerchantRenderData.BrandColors brandColors = cashAppPayMerchantRenderData.brand_colors;
        CashAppPayMerchantRenderData.BrandColors brandColors2 = brandColors != null ? (CashAppPayMerchantRenderData.BrandColors) CashAppPayMerchantRenderData.BrandColors.ADAPTER.redact(brandColors) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayMerchantRenderData.merchant_id;
        String str2 = cashAppPayMerchantRenderData.merchant_token;
        String str3 = cashAppPayMerchantRenderData.brand_id;
        String str4 = cashAppPayMerchantRenderData.display_name;
        Boolean bool = cashAppPayMerchantRenderData.is_template_avatar;
        byteString.getClass();
        return new CashAppPayMerchantRenderData(str, str2, str3, str4, logoUrls2, brandColors2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = (CashAppPayMerchantRenderData) obj;
        cashAppPayMerchantRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayMerchantRenderData.merchant_id);
        protoAdapter.encodeWithTag(protoWriter, 4, cashAppPayMerchantRenderData.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayMerchantRenderData.brand_id);
        protoAdapter.encodeWithTag(protoWriter, 3, cashAppPayMerchantRenderData.display_name);
        CashAppPayMerchantRenderData.LogoUrls.ADAPTER.encodeWithTag(protoWriter, 5, cashAppPayMerchantRenderData.logo_urls);
        CashAppPayMerchantRenderData.BrandColors.ADAPTER.encodeWithTag(protoWriter, 6, cashAppPayMerchantRenderData.brand_colors);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, cashAppPayMerchantRenderData.is_template_avatar);
        protoWriter.writeBytes(cashAppPayMerchantRenderData.unknownFields());
    }
}
