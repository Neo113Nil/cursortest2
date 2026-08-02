package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayMerchantRenderData$LogoUrls$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayMerchantRenderData.LogoUrls((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CashAppPayMerchantRenderData.LogoUrls logoUrls = (CashAppPayMerchantRenderData.LogoUrls) obj;
        reverseProtoWriter.getClass();
        logoUrls.getClass();
        reverseProtoWriter.writeBytes(logoUrls.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, logoUrls.dark_theme_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, logoUrls.light_theme_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, logoUrls.default_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayMerchantRenderData.LogoUrls logoUrls = (CashAppPayMerchantRenderData.LogoUrls) obj;
        logoUrls.getClass();
        int size$okio = logoUrls.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, logoUrls.dark_theme_url) + protoAdapter.encodedSizeWithTag(2, logoUrls.light_theme_url) + protoAdapter.encodedSizeWithTag(1, logoUrls.default_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayMerchantRenderData.LogoUrls logoUrls = (CashAppPayMerchantRenderData.LogoUrls) obj;
        logoUrls.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = logoUrls.default_url;
        String str2 = logoUrls.light_theme_url;
        String str3 = logoUrls.dark_theme_url;
        byteString.getClass();
        return new CashAppPayMerchantRenderData.LogoUrls(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayMerchantRenderData.LogoUrls logoUrls = (CashAppPayMerchantRenderData.LogoUrls) obj;
        logoUrls.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, logoUrls.default_url);
        protoAdapter.encodeWithTag(protoWriter, 2, logoUrls.light_theme_url);
        protoAdapter.encodeWithTag(protoWriter, 3, logoUrls.dark_theme_url);
        protoWriter.writeBytes(logoUrls.unknownFields());
    }
}
