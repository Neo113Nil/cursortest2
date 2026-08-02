package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$UsdOnLnPaymentMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Order.FeatureMetadata.UsdOnLnPaymentMetadata((Boolean) obj2, (String) obj, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order.FeatureMetadata.UsdOnLnPaymentMetadata usdOnLnPaymentMetadata = (Order.FeatureMetadata.UsdOnLnPaymentMetadata) obj;
        reverseProtoWriter.getClass();
        usdOnLnPaymentMetadata.getClass();
        reverseProtoWriter.writeBytes(usdOnLnPaymentMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, usdOnLnPaymentMetadata.merchant_token);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, usdOnLnPaymentMetadata.skip_order_confirmation);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, usdOnLnPaymentMetadata.lightning_withdraw_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order.FeatureMetadata.UsdOnLnPaymentMetadata usdOnLnPaymentMetadata = (Order.FeatureMetadata.UsdOnLnPaymentMetadata) obj;
        usdOnLnPaymentMetadata.getClass();
        int size$okio = usdOnLnPaymentMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, usdOnLnPaymentMetadata.merchant_token) + ProtoAdapter.BOOL.encodedSizeWithTag(2, usdOnLnPaymentMetadata.skip_order_confirmation) + protoAdapter.encodedSizeWithTag(1, usdOnLnPaymentMetadata.lightning_withdraw_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.FeatureMetadata.UsdOnLnPaymentMetadata usdOnLnPaymentMetadata = (Order.FeatureMetadata.UsdOnLnPaymentMetadata) obj;
        usdOnLnPaymentMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = usdOnLnPaymentMetadata.lightning_withdraw_token;
        Boolean bool = usdOnLnPaymentMetadata.skip_order_confirmation;
        String str2 = usdOnLnPaymentMetadata.merchant_token;
        byteString.getClass();
        return new Order.FeatureMetadata.UsdOnLnPaymentMetadata(bool, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.FeatureMetadata.UsdOnLnPaymentMetadata usdOnLnPaymentMetadata = (Order.FeatureMetadata.UsdOnLnPaymentMetadata) obj;
        usdOnLnPaymentMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, usdOnLnPaymentMetadata.lightning_withdraw_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, usdOnLnPaymentMetadata.skip_order_confirmation);
        protoAdapter.encodeWithTag(protoWriter, 3, usdOnLnPaymentMetadata.merchant_token);
        protoWriter.writeBytes(usdOnLnPaymentMetadata.unknownFields());
    }
}
