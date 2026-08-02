package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CouponActivityRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CouponActivityRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CouponActivityRenderData((CouponActivityRenderData.Type) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CouponActivityRenderData.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CouponActivityRenderData couponActivityRenderData = (CouponActivityRenderData) obj;
        reverseProtoWriter.getClass();
        couponActivityRenderData.getClass();
        reverseProtoWriter.writeBytes(couponActivityRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, couponActivityRenderData.coupon_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, couponActivityRenderData.url_to_open);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, couponActivityRenderData.coupon_title);
        CouponActivityRenderData.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, couponActivityRenderData.f1375type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CouponActivityRenderData couponActivityRenderData = (CouponActivityRenderData) obj;
        couponActivityRenderData.getClass();
        int encodedSizeWithTag = CouponActivityRenderData.Type.ADAPTER.encodedSizeWithTag(1, couponActivityRenderData.f1375type) + couponActivityRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, couponActivityRenderData.coupon_icon_url) + protoAdapter.encodedSizeWithTag(3, couponActivityRenderData.url_to_open) + protoAdapter.encodedSizeWithTag(2, couponActivityRenderData.coupon_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CouponActivityRenderData couponActivityRenderData = (CouponActivityRenderData) obj;
        couponActivityRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        CouponActivityRenderData.Type type2 = couponActivityRenderData.f1375type;
        String str = couponActivityRenderData.coupon_title;
        String str2 = couponActivityRenderData.url_to_open;
        String str3 = couponActivityRenderData.coupon_icon_url;
        byteString.getClass();
        return new CouponActivityRenderData(type2, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CouponActivityRenderData couponActivityRenderData = (CouponActivityRenderData) obj;
        couponActivityRenderData.getClass();
        CouponActivityRenderData.Type.ADAPTER.encodeWithTag(protoWriter, 1, couponActivityRenderData.f1375type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, couponActivityRenderData.coupon_title);
        protoAdapter.encodeWithTag(protoWriter, 3, couponActivityRenderData.url_to_open);
        protoAdapter.encodeWithTag(protoWriter, 4, couponActivityRenderData.coupon_icon_url);
        protoWriter.writeBytes(couponActivityRenderData.unknownFields());
    }
}
