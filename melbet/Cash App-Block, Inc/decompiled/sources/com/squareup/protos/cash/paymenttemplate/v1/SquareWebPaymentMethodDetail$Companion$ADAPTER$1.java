package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SquareWebPaymentMethodDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SquareWebPaymentMethodDetail(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SquareWebPaymentMethodDetail squareWebPaymentMethodDetail = (SquareWebPaymentMethodDetail) obj;
        reverseProtoWriter.getClass();
        squareWebPaymentMethodDetail.getClass();
        reverseProtoWriter.writeBytes(squareWebPaymentMethodDetail.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SquareWebPaymentMethodDetail squareWebPaymentMethodDetail = (SquareWebPaymentMethodDetail) obj;
        squareWebPaymentMethodDetail.getClass();
        return squareWebPaymentMethodDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SquareWebPaymentMethodDetail) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SquareWebPaymentMethodDetail(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SquareWebPaymentMethodDetail squareWebPaymentMethodDetail = (SquareWebPaymentMethodDetail) obj;
        squareWebPaymentMethodDetail.getClass();
        protoWriter.writeBytes(squareWebPaymentMethodDetail.unknownFields());
    }
}
