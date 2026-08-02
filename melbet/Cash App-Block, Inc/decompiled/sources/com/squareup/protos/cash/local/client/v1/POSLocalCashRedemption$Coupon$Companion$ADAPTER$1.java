package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class POSLocalCashRedemption$Coupon$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new POSLocalCashRedemption.Coupon((LocalImage) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
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
        POSLocalCashRedemption.Coupon coupon = (POSLocalCashRedemption.Coupon) obj;
        reverseProtoWriter.getClass();
        coupon.getClass();
        reverseProtoWriter.writeBytes(coupon.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, coupon.code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, coupon.title);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, coupon.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        POSLocalCashRedemption.Coupon coupon = (POSLocalCashRedemption.Coupon) obj;
        coupon.getClass();
        int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(1, coupon.icon) + coupon.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, coupon.code) + protoAdapter.encodedSizeWithTag(2, coupon.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        POSLocalCashRedemption.Coupon coupon = (POSLocalCashRedemption.Coupon) obj;
        coupon.getClass();
        LocalImage localImage = coupon.icon;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = coupon.title;
        String str2 = coupon.code;
        byteString.getClass();
        return new POSLocalCashRedemption.Coupon(localImage2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        POSLocalCashRedemption.Coupon coupon = (POSLocalCashRedemption.Coupon) obj;
        coupon.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, coupon.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, coupon.title);
        protoAdapter.encodeWithTag(protoWriter, 3, coupon.code);
        protoWriter.writeBytes(coupon.unknownFields());
    }
}
