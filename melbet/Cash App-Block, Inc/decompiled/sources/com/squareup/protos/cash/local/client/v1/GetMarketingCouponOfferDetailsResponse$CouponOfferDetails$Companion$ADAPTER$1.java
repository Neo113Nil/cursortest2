package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMarketingCouponOfferDetailsResponse$CouponOfferDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new GetMarketingCouponOfferDetailsResponse.CouponOfferDetails((String) obj, (String) obj2, (String) obj3, (Boolean) obj4, m, (String) obj5, (String) obj6, (String) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    m.add(GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails couponOfferDetails = (GetMarketingCouponOfferDetailsResponse.CouponOfferDetails) obj;
        reverseProtoWriter.getClass();
        couponOfferDetails.getClass();
        reverseProtoWriter.writeBytes(couponOfferDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, couponOfferDetails.terms_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, couponOfferDetails.terms_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, couponOfferDetails.redemption_instructions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, couponOfferDetails.validity_text);
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, couponOfferDetails.offer_lines);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, couponOfferDetails.all_products);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, couponOfferDetails.display_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, couponOfferDetails.display_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, couponOfferDetails.coupon_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails couponOfferDetails = (GetMarketingCouponOfferDetailsResponse.CouponOfferDetails) obj;
        couponOfferDetails.getClass();
        int size$okio = couponOfferDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(9, couponOfferDetails.terms_url) + protoAdapter.encodedSizeWithTag(8, couponOfferDetails.terms_text) + protoAdapter.encodedSizeWithTag(7, couponOfferDetails.redemption_instructions) + protoAdapter.encodedSizeWithTag(6, couponOfferDetails.validity_text) + GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine.ADAPTER.asRepeated().encodedSizeWithTag(5, couponOfferDetails.offer_lines) + ProtoAdapter.BOOL.encodedSizeWithTag(4, couponOfferDetails.all_products) + protoAdapter.encodedSizeWithTag(3, couponOfferDetails.display_subtitle) + protoAdapter.encodedSizeWithTag(2, couponOfferDetails.display_title) + protoAdapter.encodedSizeWithTag(1, couponOfferDetails.coupon_code) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails couponOfferDetails = (GetMarketingCouponOfferDetailsResponse.CouponOfferDetails) obj;
        couponOfferDetails.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(couponOfferDetails.offer_lines, GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = couponOfferDetails.coupon_code;
        String str2 = couponOfferDetails.display_title;
        String str3 = couponOfferDetails.display_subtitle;
        Boolean bool = couponOfferDetails.all_products;
        String str4 = couponOfferDetails.validity_text;
        String str5 = couponOfferDetails.redemption_instructions;
        String str6 = couponOfferDetails.terms_text;
        String str7 = couponOfferDetails.terms_url;
        byteString.getClass();
        return new GetMarketingCouponOfferDetailsResponse.CouponOfferDetails(str, str2, str3, bool, m1169redactElements, str4, str5, str6, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails couponOfferDetails = (GetMarketingCouponOfferDetailsResponse.CouponOfferDetails) obj;
        couponOfferDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, couponOfferDetails.coupon_code);
        protoAdapter.encodeWithTag(protoWriter, 2, couponOfferDetails.display_title);
        protoAdapter.encodeWithTag(protoWriter, 3, couponOfferDetails.display_subtitle);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, couponOfferDetails.all_products);
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, couponOfferDetails.offer_lines);
        protoAdapter.encodeWithTag(protoWriter, 6, couponOfferDetails.validity_text);
        protoAdapter.encodeWithTag(protoWriter, 7, couponOfferDetails.redemption_instructions);
        protoAdapter.encodeWithTag(protoWriter, 8, couponOfferDetails.terms_text);
        protoAdapter.encodeWithTag(protoWriter, 9, couponOfferDetails.terms_url);
        protoWriter.writeBytes(couponOfferDetails.unknownFields());
    }
}
