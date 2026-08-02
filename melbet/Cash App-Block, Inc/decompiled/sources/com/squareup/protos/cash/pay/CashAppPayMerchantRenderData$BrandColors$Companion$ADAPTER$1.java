package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayMerchantRenderData$BrandColors$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayMerchantRenderData.BrandColors((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayMerchantRenderData.BrandColors brandColors = (CashAppPayMerchantRenderData.BrandColors) obj;
        reverseProtoWriter.getClass();
        brandColors.getClass();
        reverseProtoWriter.writeBytes(brandColors.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, brandColors.dark_theme_primary_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, brandColors.light_theme_primary_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, brandColors.default_primary_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayMerchantRenderData.BrandColors brandColors = (CashAppPayMerchantRenderData.BrandColors) obj;
        brandColors.getClass();
        int size$okio = brandColors.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, brandColors.dark_theme_primary_color) + protoAdapter.encodedSizeWithTag(2, brandColors.light_theme_primary_color) + protoAdapter.encodedSizeWithTag(1, brandColors.default_primary_color) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayMerchantRenderData.BrandColors brandColors = (CashAppPayMerchantRenderData.BrandColors) obj;
        brandColors.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = brandColors.default_primary_color;
        String str2 = brandColors.light_theme_primary_color;
        String str3 = brandColors.dark_theme_primary_color;
        byteString.getClass();
        return new CashAppPayMerchantRenderData.BrandColors(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayMerchantRenderData.BrandColors brandColors = (CashAppPayMerchantRenderData.BrandColors) obj;
        brandColors.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, brandColors.default_primary_color);
        protoAdapter.encodeWithTag(protoWriter, 2, brandColors.light_theme_primary_color);
        protoAdapter.encodeWithTag(protoWriter, 3, brandColors.dark_theme_primary_color);
        protoWriter.writeBytes(brandColors.unknownFields());
    }
}
