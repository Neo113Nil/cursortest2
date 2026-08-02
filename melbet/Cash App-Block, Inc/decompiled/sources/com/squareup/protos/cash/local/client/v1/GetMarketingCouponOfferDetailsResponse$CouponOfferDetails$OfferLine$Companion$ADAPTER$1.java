package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMarketingCouponOfferDetailsResponse$CouponOfferDetails$OfferLine$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine offerLine = (GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine) obj;
        reverseProtoWriter.getClass();
        offerLine.getClass();
        reverseProtoWriter.writeBytes(offerLine.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, offerLine.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, offerLine.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine offerLine = (GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine) obj;
        offerLine.getClass();
        int size$okio = offerLine.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, offerLine.name) + protoAdapter.encodedSizeWithTag(1, offerLine.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine offerLine = (GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine) obj;
        offerLine.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = offerLine.token;
        String str2 = offerLine.name;
        byteString.getClass();
        return new GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine offerLine = (GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine) obj;
        offerLine.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, offerLine.token);
        protoAdapter.encodeWithTag(protoWriter, 2, offerLine.name);
        protoWriter.writeBytes(offerLine.unknownFields());
    }
}
