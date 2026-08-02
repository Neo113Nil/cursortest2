package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$PaycheckConversionMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Order.FeatureMetadata.PaycheckConversionMetadata((String) obj, (Integer) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order.FeatureMetadata.PaycheckConversionMetadata paycheckConversionMetadata = (Order.FeatureMetadata.PaycheckConversionMetadata) obj;
        reverseProtoWriter.getClass();
        paycheckConversionMetadata.getClass();
        reverseProtoWriter.writeBytes(paycheckConversionMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, paycheckConversionMetadata.paycheck_transaction_token);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, paycheckConversionMetadata.basis_points);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paycheckConversionMetadata.allocation_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order.FeatureMetadata.PaycheckConversionMetadata paycheckConversionMetadata = (Order.FeatureMetadata.PaycheckConversionMetadata) obj;
        paycheckConversionMetadata.getClass();
        int size$okio = paycheckConversionMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, paycheckConversionMetadata.paycheck_transaction_token) + ProtoAdapter.INT32.encodedSizeWithTag(2, paycheckConversionMetadata.basis_points) + protoAdapter.encodedSizeWithTag(1, paycheckConversionMetadata.allocation_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.FeatureMetadata.PaycheckConversionMetadata paycheckConversionMetadata = (Order.FeatureMetadata.PaycheckConversionMetadata) obj;
        paycheckConversionMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = paycheckConversionMetadata.allocation_token;
        Integer num = paycheckConversionMetadata.basis_points;
        String str2 = paycheckConversionMetadata.paycheck_transaction_token;
        byteString.getClass();
        return new Order.FeatureMetadata.PaycheckConversionMetadata(str, num, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.FeatureMetadata.PaycheckConversionMetadata paycheckConversionMetadata = (Order.FeatureMetadata.PaycheckConversionMetadata) obj;
        paycheckConversionMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, paycheckConversionMetadata.allocation_token);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, paycheckConversionMetadata.basis_points);
        protoAdapter.encodeWithTag(protoWriter, 3, paycheckConversionMetadata.paycheck_transaction_token);
        protoWriter.writeBytes(paycheckConversionMetadata.unknownFields());
    }
}
